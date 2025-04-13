package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.p004db.SimpleSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    private static final String DB_IMPL_SUFFIX = "_Impl";

    @RestrictTo
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;

    @Nullable
    private AutoCloser mAutoCloser;

    @Nullable
    @RestrictTo
    @Deprecated
    public List<Callback> mCallbacks;

    @Deprecated
    public volatile SupportSQLiteDatabase mDatabase;
    private SupportSQLiteOpenHelper mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    public boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = Collections.synchronizedMap(new HashMap());
    private final InvalidationTracker mInvalidationTracker = createInvalidationTracker();
    private final Map<Class<?>, Object> mTypeConverters = new HashMap();

    @NonNull
    @RestrictTo
    public Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> mAutoMigrationSpecs = new HashMap();

    public static class Builder<T extends RoomDatabase> {

        /* renamed from: a */
        public final Class<T> f5844a;

        /* renamed from: b */
        public final String f5845b;

        /* renamed from: c */
        public final Context f5846c;

        /* renamed from: d */
        public Executor f5847d;

        /* renamed from: e */
        public Executor f5848e;

        /* renamed from: f */
        public boolean f5849f;

        /* renamed from: g */
        public final MigrationContainer f5850g = new MigrationContainer();

        /* renamed from: h */
        public Set<Integer> f5851h;

        public Builder(@NonNull Context context, @NonNull Class<T> cls, @Nullable String str) {
            this.f5846c = context;
            this.f5844a = cls;
            this.f5845b = str;
        }
    }

    public static abstract class Callback {
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    public static class MigrationContainer {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, Migration>> f5856a = new HashMap<>();

        /* renamed from: a */
        public void m4075a(@NonNull Migration... migrationArr) {
            for (Migration migration : migrationArr) {
                int i2 = migration.startVersion;
                int i3 = migration.endVersion;
                TreeMap<Integer, Migration> treeMap = this.f5856a.get(Integer.valueOf(i2));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.f5856a.put(Integer.valueOf(i2), treeMap);
                }
                Migration migration2 = treeMap.get(Integer.valueOf(i3));
                if (migration2 != null) {
                    Log.w("ROOM", "Overriding migration " + migration2 + " with " + migration);
                }
                treeMap.put(Integer.valueOf(i3), migration);
            }
        }
    }

    public static abstract class PrepackagedDatabaseCallback {
    }

    public interface QueryCallback {
        /* renamed from: a */
        void m4076a(@NonNull String str, @NonNull List<Object> list);
    }

    private void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.m4066h(writableDatabase);
        if (writableDatabase.mo4036W0()) {
            writableDatabase.mo4039k0();
        } else {
            writableDatabase.mo4043y();
        }
    }

    private void internalEndTransaction() {
        this.mOpenHelper.getWritableDatabase().mo4042w0();
        if (inTransaction()) {
            return;
        }
        InvalidationTracker invalidationTracker = this.mInvalidationTracker;
        if (invalidationTracker.f5784f.compareAndSet(false, true)) {
            AutoCloser autoCloser = invalidationTracker.f5782d;
            if (autoCloser != null) {
                autoCloser.m4029d();
            }
            invalidationTracker.f5783e.getQueryExecutor().execute(invalidationTracker.f5791m);
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$beginTransaction$0(SupportSQLiteDatabase supportSQLiteDatabase) {
        internalBeginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$endTransaction$1(SupportSQLiteDatabase supportSQLiteDatabase) {
        internalEndTransaction();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo
    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
            return;
        }
        try {
            lambda$beginTransaction$0(autoCloser.m4029d());
        } finally {
            autoCloser.m4026a();
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            writeLock.lock();
            try {
                this.mInvalidationTracker.m4063e();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public SupportSQLiteStatement compileStatement(@NonNull String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.getWritableDatabase().mo4034L(str);
    }

    @NonNull
    public abstract InvalidationTracker createInvalidationTracker();

    @NonNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    @Deprecated
    public void endTransaction() {
        AutoCloser autoCloser = this.mAutoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
            return;
        }
        try {
            lambda$endTransaction$1(autoCloser.m4029d());
        } finally {
            autoCloser.m4026a();
        }
    }

    @NonNull
    @RestrictTo
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Collections.emptyList();
    }

    @RestrictTo
    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    @NonNull
    public InvalidationTracker getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    @NonNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        return this.mOpenHelper;
    }

    @NonNull
    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    @NonNull
    @RestrictTo
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return Collections.emptySet();
    }

    @NonNull
    @RestrictTo
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return Collections.emptyMap();
    }

    @RestrictTo
    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    @NonNull
    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    @Nullable
    public <T> T getTypeConverter(@NonNull Class<T> cls) {
        return (T) this.mTypeConverters.get(cls);
    }

    public boolean inTransaction() {
        return this.mOpenHelper.getWritableDatabase().mo4035Q0();
    }

    @CallSuper
    public void init(@NonNull DatabaseConfiguration databaseConfiguration) {
        this.mOpenHelper = createOpenHelper(databaseConfiguration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i2 = -1;
            if (!it.hasNext()) {
                for (int size = databaseConfiguration.f5757h.size() - 1; size >= 0; size--) {
                    if (!bitSet.get(size)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<Migration> it2 = getAutoMigrations(this.mAutoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration next = it2.next();
                    if (!Collections.unmodifiableMap(databaseConfiguration.f5753d.f5856a).containsKey(Integer.valueOf(next.startVersion))) {
                        databaseConfiguration.f5753d.m4075a(next);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, this.mOpenHelper);
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.f5884h = databaseConfiguration;
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, this.mOpenHelper);
                if (autoClosingRoomOpenHelper != null) {
                    AutoCloser autoCloser = autoClosingRoomOpenHelper.f5739d;
                    this.mAutoCloser = autoCloser;
                    InvalidationTracker invalidationTracker = this.mInvalidationTracker;
                    invalidationTracker.f5782d = autoCloser;
                    autoCloser.f5725c = new RunnableC0572g(invalidationTracker, 2);
                }
                boolean z = databaseConfiguration.f5759j == JournalMode.WRITE_AHEAD_LOGGING;
                this.mOpenHelper.setWriteAheadLoggingEnabled(z);
                this.mCallbacks = databaseConfiguration.f5754e;
                this.mQueryExecutor = databaseConfiguration.f5760k;
                this.mTransactionExecutor = new TransactionExecutor(databaseConfiguration.f5761l);
                this.mAllowMainThreadQueries = databaseConfiguration.f5758i;
                this.mWriteAheadLoggingEnabled = z;
                Intent intent = databaseConfiguration.f5763n;
                if (intent != null) {
                    InvalidationTracker invalidationTracker2 = this.mInvalidationTracker;
                    invalidationTracker2.f5789k = new MultiInstanceInvalidationClient(databaseConfiguration.f5751b, databaseConfiguration.f5752c, intent, invalidationTracker2, invalidationTracker2.f5783e.getQueryExecutor());
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size2 = databaseConfiguration.f5756g.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                size2 = -1;
                                break;
                            } else {
                                if (cls.isAssignableFrom(databaseConfiguration.f5756g.get(size2).getClass())) {
                                    bitSet2.set(size2);
                                    break;
                                }
                                size2--;
                            }
                        }
                        if (size2 < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                        this.mTypeConverters.put(cls, databaseConfiguration.f5756g.get(size2));
                    }
                }
                for (int size3 = databaseConfiguration.f5756g.size() - 1; size3 >= 0; size3--) {
                    if (!bitSet2.get(size3)) {
                        throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration.f5756g.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
            Class<? extends AutoMigrationSpec> next2 = it.next();
            int size4 = databaseConfiguration.f5757h.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (next2.isAssignableFrom(databaseConfiguration.f5757h.get(size4).getClass())) {
                    bitSet.set(size4);
                    i2 = size4;
                    break;
                }
                size4--;
            }
            if (i2 < 0) {
                StringBuilder m24u = C0000a.m24u("A required auto migration spec (");
                m24u.append(next2.getCanonicalName());
                m24u.append(") is missing in the database configuration.");
                throw new IllegalArgumentException(m24u.toString());
            }
            this.mAutoMigrationSpecs.put(next2, databaseConfiguration.f5757h.get(i2));
        }
    }

    public void internalInitInvalidationTracker(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        InvalidationTracker invalidationTracker = this.mInvalidationTracker;
        synchronized (invalidationTracker) {
            if (invalidationTracker.f5785g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.mo4032I("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.mo4032I("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.mo4032I("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.m4066h(supportSQLiteDatabase);
            invalidationTracker.f5786h = supportSQLiteDatabase.mo4034L("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            invalidationTracker.f5785g = true;
        }
    }

    public boolean isOpen() {
        if (this.mAutoCloser != null) {
            return !r0.f5732j;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @NonNull
    public Cursor query(@NonNull String str, @Nullable Object[] objArr) {
        return this.mOpenHelper.getWritableDatabase().mo4033I0(new SimpleSQLiteQuery(str, objArr));
    }

    public void runInTransaction(@NonNull Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.getWritableDatabase().mo4038j0();
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (CancellationSignal) null);
    }

    @NonNull
    public Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery, @Nullable CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return this.mOpenHelper.getWritableDatabase().mo4037Y(supportSQLiteQuery, cancellationSignal);
        }
        return this.mOpenHelper.getWritableDatabase().mo4033I0(supportSQLiteQuery);
    }

    public <V> V runInTransaction(@NonNull Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V call = callable.call();
                setTransactionSuccessful();
                return call;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                throw e3;
            }
        } finally {
            endTransaction();
        }
    }
}
