package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p004db.SupportSQLiteProgram;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@RestrictTo
/* loaded from: classes.dex */
public class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* renamed from: j */
    @VisibleForTesting
    public static final TreeMap<Integer, RoomSQLiteQuery> f5863j = new TreeMap<>();

    /* renamed from: b */
    public volatile String f5864b;

    /* renamed from: c */
    @VisibleForTesting
    public final long[] f5865c;

    /* renamed from: d */
    @VisibleForTesting
    public final double[] f5866d;

    /* renamed from: e */
    @VisibleForTesting
    public final String[] f5867e;

    /* renamed from: f */
    @VisibleForTesting
    public final byte[][] f5868f;

    /* renamed from: g */
    public final int[] f5869g;

    /* renamed from: h */
    @VisibleForTesting
    public final int f5870h;

    /* renamed from: i */
    @VisibleForTesting
    public int f5871i;

    /* renamed from: androidx.room.RoomSQLiteQuery$1 */
    class C05551 implements SupportSQLiteProgram {
        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: J0 */
        public void mo4044J0(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: S */
        public void mo4046S(int i2, double d) {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: f */
        public void mo4048f(int i2, String str) {
            throw null;
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: i0 */
        public void mo4050i0(int i2, long j2) {
            throw null;
        }

        @Override // androidx.sqlite.p004db.SupportSQLiteProgram
        /* renamed from: l0 */
        public void mo4051l0(int i2, byte[] bArr) {
            throw null;
        }
    }

    public RoomSQLiteQuery(int i2) {
        this.f5870h = i2;
        int i3 = i2 + 1;
        this.f5869g = new int[i3];
        this.f5865c = new long[i3];
        this.f5866d = new double[i3];
        this.f5867e = new String[i3];
        this.f5868f = new byte[i3][];
    }

    /* renamed from: c */
    public static RoomSQLiteQuery m4083c(String str, int i2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = f5863j;
        synchronized (treeMap) {
            Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2);
                roomSQLiteQuery.f5864b = str;
                roomSQLiteQuery.f5871i = i2;
                return roomSQLiteQuery;
            }
            treeMap.remove(ceilingEntry.getKey());
            RoomSQLiteQuery value = ceilingEntry.getValue();
            value.f5864b = str;
            value.f5871i = i2;
            return value;
        }
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: J0 */
    public void mo4044J0(int i2) {
        this.f5869g[i2] = 1;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: S */
    public void mo4046S(int i2, double d) {
        this.f5869g[i2] = 3;
        this.f5866d[i2] = d;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteQuery
    /* renamed from: a */
    public String mo4084a() {
        return this.f5864b;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteQuery
    /* renamed from: b */
    public void mo4085b(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i2 = 1; i2 <= this.f5871i; i2++) {
            int i3 = this.f5869g[i2];
            if (i3 == 1) {
                supportSQLiteProgram.mo4044J0(i2);
            } else if (i3 == 2) {
                supportSQLiteProgram.mo4050i0(i2, this.f5865c[i2]);
            } else if (i3 == 3) {
                supportSQLiteProgram.mo4046S(i2, this.f5866d[i2]);
            } else if (i3 == 4) {
                supportSQLiteProgram.mo4048f(i2, this.f5867e[i2]);
            } else if (i3 == 5) {
                supportSQLiteProgram.mo4051l0(i2, this.f5868f[i2]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: e */
    public void m4086e() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = f5863j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5870h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: f */
    public void mo4048f(int i2, String str) {
        this.f5869g[i2] = 4;
        this.f5867e[i2] = str;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: i0 */
    public void mo4050i0(int i2, long j2) {
        this.f5869g[i2] = 2;
        this.f5865c[i2] = j2;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteProgram
    /* renamed from: l0 */
    public void mo4051l0(int i2, byte[] bArr) {
        this.f5869g[i2] = 5;
        this.f5868f[i2] = bArr;
    }
}
