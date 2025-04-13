package androidx.room;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class AutoCloser {

    /* renamed from: a */
    @Nullable
    public SupportSQLiteOpenHelper f5723a;

    /* renamed from: b */
    @NonNull
    public final Handler f5724b;

    /* renamed from: c */
    @Nullable
    public Runnable f5725c;

    /* renamed from: d */
    @NonNull
    public final Object f5726d;

    /* renamed from: e */
    public final long f5727e;

    /* renamed from: f */
    @NonNull
    public final Executor f5728f;

    /* renamed from: g */
    @GuardedBy
    public int f5729g;

    /* renamed from: h */
    @GuardedBy
    public long f5730h;

    /* renamed from: i */
    @Nullable
    @GuardedBy
    public SupportSQLiteDatabase f5731i;

    /* renamed from: j */
    public boolean f5732j;

    /* renamed from: k */
    public final Runnable f5733k;

    /* renamed from: l */
    @NonNull
    public final Runnable f5734l;

    /* renamed from: androidx.room.AutoCloser$1 */
    public class RunnableC05441 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AutoCloser f5735b;

        @Override // java.lang.Runnable
        public void run() {
            AutoCloser autoCloser = this.f5735b;
            autoCloser.f5728f.execute(autoCloser.f5734l);
        }
    }

    /* renamed from: androidx.room.AutoCloser$2 */
    public class RunnableC05452 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AutoCloser f5736b;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f5736b.f5726d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                AutoCloser autoCloser = this.f5736b;
                if (uptimeMillis - autoCloser.f5730h < autoCloser.f5727e) {
                    return;
                }
                if (autoCloser.f5729g != 0) {
                    return;
                }
                Runnable runnable = autoCloser.f5725c;
                if (runnable == null) {
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                runnable.run();
                SupportSQLiteDatabase supportSQLiteDatabase = this.f5736b.f5731i;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    try {
                        this.f5736b.f5731i.close();
                        this.f5736b.f5731i = null;
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4026a() {
        synchronized (this.f5726d) {
            int i2 = this.f5729g;
            if (i2 <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i3 = i2 - 1;
            this.f5729g = i3;
            if (i3 == 0) {
                if (this.f5731i == null) {
                } else {
                    this.f5724b.postDelayed(this.f5733k, this.f5727e);
                }
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public <V> V m4027b(@NonNull Function<SupportSQLiteDatabase, V> function) {
        try {
            return function.apply(m4029d());
        } finally {
            m4026a();
        }
    }

    @Nullable
    /* renamed from: c */
    public SupportSQLiteDatabase m4028c() {
        SupportSQLiteDatabase supportSQLiteDatabase;
        synchronized (this.f5726d) {
            supportSQLiteDatabase = this.f5731i;
        }
        return supportSQLiteDatabase;
    }

    @NonNull
    /* renamed from: d */
    public SupportSQLiteDatabase m4029d() {
        synchronized (this.f5726d) {
            this.f5724b.removeCallbacks(this.f5733k);
            this.f5729g++;
            if (this.f5732j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this.f5731i;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return this.f5731i;
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f5723a;
            if (supportSQLiteOpenHelper == null) {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
            this.f5731i = writableDatabase;
            return writableDatabase;
        }
    }
}
