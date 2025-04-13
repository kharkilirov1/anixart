package androidx.room;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.sqlite.p004db.SimpleSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p000a.C0000a;

/* loaded from: classes.dex */
public class InvalidationTracker {

    /* renamed from: n */
    public static final String[] f5778n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    public final String[] f5780b;

    /* renamed from: c */
    @NonNull
    public Map<String, Set<String>> f5781c;

    /* renamed from: e */
    public final RoomDatabase f5783e;

    /* renamed from: h */
    public volatile SupportSQLiteStatement f5786h;

    /* renamed from: i */
    public final ObservedTableTracker f5787i;

    /* renamed from: k */
    public MultiInstanceInvalidationClient f5789k;

    /* renamed from: d */
    @Nullable
    public AutoCloser f5782d = null;

    /* renamed from: f */
    public AtomicBoolean f5784f = new AtomicBoolean(false);

    /* renamed from: g */
    public volatile boolean f5785g = false;

    /* renamed from: j */
    @SuppressLint
    @VisibleForTesting
    public final SafeIterableMap<Observer, ObserverWrapper> f5788j = new SafeIterableMap<>();

    /* renamed from: l */
    public final Object f5790l = new Object();

    /* renamed from: m */
    @VisibleForTesting
    public Runnable f5791m = new Runnable() { // from class: androidx.room.InvalidationTracker.1
        /* renamed from: a */
        public final Set<Integer> m4067a() {
            HashSet hashSet = new HashSet();
            Cursor query = InvalidationTracker.this.f5783e.query(new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                InvalidationTracker.this.f5786h.mo4045K();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            if (r0 != null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        
            r0.m4026a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        
            if (r5 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        
            if (r5.isEmpty() != false) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
        
            r0 = r11.f5792b.f5788j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        
            r4 = r11.f5792b.f5788j.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
        
            if (r4.hasNext() == false) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        
            r6 = r4.next().getValue();
            r7 = r6.f5798a.length;
            r9 = null;
            r8 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
        
            if (r8 >= r7) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
        
            if (r5.contains(java.lang.Integer.valueOf(r6.f5798a[r8])) == false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        
            if (r7 != 1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
        
            r9 = r6.f5801d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
        
            r8 = r8 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        
            if (r9 != null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
        
            r9 = new java.util.HashSet<>(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
        
            r9.add(r6.f5799b[r8]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        
            if (r9 == null) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
        
            r6.f5800c.mo4069a(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f5, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00fa, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0098, code lost:
        
            if (r0 != null) goto L27;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.RunnableC05461.run():void");
        }
    };

    /* renamed from: a */
    @NonNull
    public final HashMap<String, Integer> f5779a = new HashMap<>();

    public static class ObservedTableTracker {

        /* renamed from: a */
        public final long[] f5793a;

        /* renamed from: b */
        public final boolean[] f5794b;

        /* renamed from: c */
        public final int[] f5795c;

        /* renamed from: d */
        public boolean f5796d;

        public ObservedTableTracker(int i2) {
            long[] jArr = new long[i2];
            this.f5793a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f5794b = zArr;
            this.f5795c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @Nullable
        /* renamed from: a */
        public int[] m4068a() {
            synchronized (this) {
                if (!this.f5796d) {
                    return null;
                }
                int length = this.f5793a.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = 1;
                    boolean z = this.f5793a[i2] > 0;
                    boolean[] zArr = this.f5794b;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f5795c;
                        if (!z) {
                            i3 = 2;
                        }
                        iArr[i2] = i3;
                    } else {
                        this.f5795c[i2] = 0;
                    }
                    zArr[i2] = z;
                }
                this.f5796d = false;
                return (int[]) this.f5795c.clone();
            }
        }
    }

    public static abstract class Observer {

        /* renamed from: a */
        public final String[] f5797a;

        public Observer(@NonNull String[] strArr) {
            this.f5797a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo4069a(@NonNull Set<String> set);
    }

    public static class ObserverWrapper {

        /* renamed from: a */
        public final int[] f5798a;

        /* renamed from: b */
        public final String[] f5799b;

        /* renamed from: c */
        public final Observer f5800c;

        /* renamed from: d */
        public final Set<String> f5801d;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            this.f5800c = observer;
            this.f5798a = iArr;
            this.f5799b = strArr;
            if (iArr.length != 1) {
                this.f5801d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f5801d = Collections.unmodifiableSet(hashSet);
        }

        /* renamed from: a */
        public void m4070a(String[] strArr) {
            Set<String> set = null;
            if (this.f5799b.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (strArr[i2].equalsIgnoreCase(this.f5799b[0])) {
                        set = this.f5801d;
                        break;
                    }
                    i2++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f5799b;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f5800c.mo4069a(set);
            }
        }
    }

    public static class WeakObserver extends Observer {

        /* renamed from: b */
        public final InvalidationTracker f5802b;

        /* renamed from: c */
        public final WeakReference<Observer> f5803c;

        @Override // androidx.room.InvalidationTracker.Observer
        /* renamed from: a */
        public void mo4069a(@NonNull Set<String> set) {
            Observer observer = this.f5803c.get();
            if (observer == null) {
                this.f5802b.m4061c(this);
            } else {
                observer.mo4069a(set);
            }
        }
    }

    @RestrictTo
    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5783e = roomDatabase;
        this.f5787i = new ObservedTableTracker(strArr.length);
        this.f5781c = map2;
        new InvalidationLiveDataContainer(roomDatabase);
        int length = strArr.length;
        this.f5780b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5779a.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f5780b[i2] = str2.toLowerCase(locale);
            } else {
                this.f5780b[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f5779a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f5779a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @SuppressLint
    @WorkerThread
    /* renamed from: a */
    public void m4059a(@NonNull Observer observer) {
        ObserverWrapper mo1015e;
        boolean z;
        String[] strArr = observer.f5797a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f5781c.containsKey(lowerCase)) {
                hashSet.addAll(this.f5781c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        int length2 = strArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Integer num = this.f5779a.get(strArr2[i2].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder m24u = C0000a.m24u("There is no table with name ");
                m24u.append(strArr2[i2]);
                throw new IllegalArgumentException(m24u.toString());
            }
            iArr[i2] = num.intValue();
        }
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr2);
        synchronized (this.f5788j) {
            mo1015e = this.f5788j.mo1015e(observer, observerWrapper);
        }
        if (mo1015e == null) {
            ObservedTableTracker observedTableTracker = this.f5787i;
            synchronized (observedTableTracker) {
                z = false;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    long[] jArr = observedTableTracker.f5793a;
                    long j2 = jArr[i4];
                    jArr[i4] = 1 + j2;
                    if (j2 == 0) {
                        observedTableTracker.f5796d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                m4065g();
            }
        }
    }

    /* renamed from: b */
    public boolean m4060b() {
        if (!this.f5783e.isOpen()) {
            return false;
        }
        if (!this.f5785g) {
            this.f5783e.getOpenHelper().getWritableDatabase();
        }
        if (this.f5785g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint
    @WorkerThread
    /* renamed from: c */
    public void m4061c(@NonNull Observer observer) {
        ObserverWrapper mo1016f;
        boolean z;
        synchronized (this.f5788j) {
            mo1016f = this.f5788j.mo1016f(observer);
        }
        if (mo1016f != null) {
            ObservedTableTracker observedTableTracker = this.f5787i;
            int[] iArr = mo1016f.f5798a;
            synchronized (observedTableTracker) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = observedTableTracker.f5793a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        observedTableTracker.f5796d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                m4065g();
            }
        }
    }

    /* renamed from: d */
    public final void m4062d(SupportSQLiteDatabase supportSQLiteDatabase, int i2) {
        supportSQLiteDatabase.mo4032I("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f5780b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5778n) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            C0000a.m2C(sb, str, "_", str2, "`");
            C0000a.m2C(sb, " AFTER ", str2, " ON `", str);
            C0000a.m2C(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            C0000a.m2C(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            supportSQLiteDatabase.mo4032I(sb.toString());
        }
    }

    /* renamed from: e */
    public void m4063e() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f5789k;
        if (multiInstanceInvalidationClient != null) {
            if (multiInstanceInvalidationClient.f5812i.compareAndSet(false, true)) {
                multiInstanceInvalidationClient.f5807d.m4061c(multiInstanceInvalidationClient.f5808e);
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f5809f;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.mo4058z2(multiInstanceInvalidationClient.f5811h, multiInstanceInvalidationClient.f5806c);
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
                }
                multiInstanceInvalidationClient.f5804a.unbindService(multiInstanceInvalidationClient.f5813j);
            }
            this.f5789k = null;
        }
    }

    /* renamed from: f */
    public final void m4064f(SupportSQLiteDatabase supportSQLiteDatabase, int i2) {
        String str = this.f5780b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f5778n) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            supportSQLiteDatabase.mo4032I(C0000a.m22s(sb, str, "_", str2, "`"));
        }
    }

    /* renamed from: g */
    public void m4065g() {
        if (this.f5783e.isOpen()) {
            m4066h(this.f5783e.getOpenHelper().getWritableDatabase());
        }
    }

    /* renamed from: h */
    public void m4066h(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.mo4035Q0()) {
            return;
        }
        try {
            Lock closeLock = this.f5783e.getCloseLock();
            closeLock.lock();
            try {
                synchronized (this.f5790l) {
                    int[] m4068a = this.f5787i.m4068a();
                    if (m4068a == null) {
                        return;
                    }
                    int length = m4068a.length;
                    if (supportSQLiteDatabase.mo4036W0()) {
                        supportSQLiteDatabase.mo4039k0();
                    } else {
                        supportSQLiteDatabase.mo4043y();
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = m4068a[i2];
                            if (i3 == 1) {
                                m4062d(supportSQLiteDatabase, i2);
                            } else if (i3 == 2) {
                                m4064f(supportSQLiteDatabase, i2);
                            }
                        } finally {
                            supportSQLiteDatabase.mo4042w0();
                        }
                    }
                    supportSQLiteDatabase.mo4038j0();
                }
            } finally {
                closeLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
