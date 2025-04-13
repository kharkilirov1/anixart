package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class LruCache<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f1821a;

    /* renamed from: b */
    public int f1822b;

    /* renamed from: c */
    public int f1823c;

    /* renamed from: d */
    public int f1824d;

    /* renamed from: e */
    public int f1825e;

    /* renamed from: f */
    public int f1826f;

    /* renamed from: g */
    public int f1827g;

    /* renamed from: h */
    public int f1828h;

    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1823c = i2;
        this.f1821a = new LinkedHashMap<>(0, 0.75f, true);
    }

    @Nullable
    /* renamed from: a */
    public V mo1103a(@NonNull K k2) {
        return null;
    }

    /* renamed from: b */
    public void mo1104b(boolean z, @NonNull K k2, @NonNull V v, @Nullable V v2) {
    }

    @Nullable
    /* renamed from: c */
    public final V m1105c(@NonNull K k2) {
        V v;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v2 = this.f1821a.get(k2);
            if (v2 != null) {
                this.f1827g++;
                return v2;
            }
            this.f1828h++;
            V mo1103a = mo1103a(k2);
            if (mo1103a == null) {
                return null;
            }
            synchronized (this) {
                this.f1825e++;
                v = (V) this.f1821a.put(k2, mo1103a);
                if (v != null) {
                    this.f1821a.put(k2, v);
                } else {
                    this.f1822b += m1107e(k2, mo1103a);
                }
            }
            if (v != null) {
                mo1104b(false, k2, mo1103a, v);
                return v;
            }
            m1109g(this.f1823c);
            return mo1103a;
        }
    }

    @Nullable
    /* renamed from: d */
    public final V m1106d(@NonNull K k2, @NonNull V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1824d++;
            this.f1822b += m1107e(k2, v);
            put = this.f1821a.put(k2, v);
            if (put != null) {
                this.f1822b -= m1107e(k2, put);
            }
        }
        if (put != null) {
            mo1104b(false, k2, put, v);
        }
        m1109g(this.f1823c);
        return put;
    }

    /* renamed from: e */
    public final int m1107e(K k2, V v) {
        int mo1108f = mo1108f(k2, v);
        if (mo1108f >= 0) {
            return mo1108f;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    /* renamed from: f */
    public int mo1108f(@NonNull K k2, @NonNull V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1109g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1822b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1821a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1822b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1822b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1821a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1821a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1821a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1822b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m1107e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1822b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1826f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1826f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.mo1104b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.m1109g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1827g;
        i3 = this.f1828h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1823c), Integer.valueOf(this.f1827g), Integer.valueOf(this.f1828h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
