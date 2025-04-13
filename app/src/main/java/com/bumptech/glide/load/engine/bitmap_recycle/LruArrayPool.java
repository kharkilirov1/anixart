package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class LruArrayPool implements ArrayPool {

    /* renamed from: a */
    public final GroupedLinkedMap<Key, Object> f8336a;

    /* renamed from: b */
    public final KeyPool f8337b;

    /* renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f8338c;

    /* renamed from: d */
    public final Map<Class<?>, ArrayAdapterInterface<?>> f8339d;

    /* renamed from: e */
    public final int f8340e;

    /* renamed from: f */
    public int f8341f;

    public static final class Key implements Poolable {

        /* renamed from: a */
        public final KeyPool f8342a;

        /* renamed from: b */
        public int f8343b;

        /* renamed from: c */
        public Class<?> f8344c;

        public Key(KeyPool keyPool) {
            this.f8342a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        /* renamed from: a */
        public void mo5072a() {
            this.f8342a.m5075c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return this.f8343b == key.f8343b && this.f8344c == key.f8344c;
        }

        public int hashCode() {
            int i2 = this.f8343b * 31;
            Class<?> cls = this.f8344c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Key{size=");
            m24u.append(this.f8343b);
            m24u.append("array=");
            m24u.append(this.f8344c);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public static final class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        /* renamed from: a */
        public Key mo5073a() {
            return new Key(this);
        }

        /* renamed from: d */
        public Key m5090d(int i2, Class<?> cls) {
            Key m5074b = m5074b();
            m5074b.f8343b = i2;
            m5074b.f8344c = cls;
            return m5074b;
        }
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.f8336a = new GroupedLinkedMap<>();
        this.f8337b = new KeyPool();
        this.f8338c = new HashMap();
        this.f8339d = new HashMap();
        this.f8340e = 4194304;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    /* renamed from: a */
    public synchronized void mo5062a(int i2) {
        if (i2 >= 40) {
            synchronized (this) {
                m5086f(0);
            }
        } else if (i2 >= 20 || i2 == 15) {
            m5086f(this.f8340e / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    /* renamed from: b */
    public synchronized void mo5063b() {
        m5086f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    /* renamed from: c */
    public synchronized <T> T mo5064c(int i2, Class<T> cls) {
        Key m5074b;
        m5074b = this.f8337b.m5074b();
        m5074b.f8343b = i2;
        m5074b.f8344c = cls;
        return (T) m5088h(m5074b, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0047, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0047, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: all -> 0x004d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0047, B:22:0x003a), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized <T> T mo5065d(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.m5089i(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f8341f     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L20
            int r4 = r5.f8340e     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L3a
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r6 = r5.f8337b     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r6 = r6.m5090d(r0, r7)     // Catch: java.lang.Throwable -> L4d
            goto L47
        L3a:
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$KeyPool r0 = r5.f8337b     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r0 = r0.m5074b()     // Catch: java.lang.Throwable -> L4d
            com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$Key r0 = (com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.Key) r0     // Catch: java.lang.Throwable -> L4d
            r0.f8343b = r6     // Catch: java.lang.Throwable -> L4d
            r0.f8344c = r7     // Catch: java.lang.Throwable -> L4d
            r6 = r0
        L47:
            java.lang.Object r6 = r5.m5088h(r6, r7)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            return r6
        L4d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.mo5065d(int, java.lang.Class):java.lang.Object");
    }

    /* renamed from: e */
    public final void m5085e(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> m5089i = m5089i(cls);
        Integer num = (Integer) m5089i.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                m5089i.remove(Integer.valueOf(i2));
                return;
            } else {
                m5089i.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    /* renamed from: f */
    public final void m5086f(int i2) {
        while (this.f8341f > i2) {
            Object m5083c = this.f8336a.m5083c();
            Objects.requireNonNull(m5083c, "Argument must not be null");
            ArrayAdapterInterface m5087g = m5087g(m5083c.getClass());
            this.f8341f -= m5087g.mo5060b(m5083c) * m5087g.mo5059a();
            m5085e(m5087g.mo5060b(m5083c), m5083c.getClass());
            if (Log.isLoggable(m5087g.mo5061e(), 2)) {
                String mo5061e = m5087g.mo5061e();
                StringBuilder m24u = C0000a.m24u("evicted: ");
                m24u.append(m5087g.mo5060b(m5083c));
                Log.v(mo5061e, m24u.toString());
            }
        }
    }

    /* renamed from: g */
    public final <T> ArrayAdapterInterface<T> m5087g(Class<T> cls) {
        ArrayAdapterInterface<T> arrayAdapterInterface = (ArrayAdapterInterface) this.f8339d.get(cls);
        if (arrayAdapterInterface == null) {
            if (cls.equals(int[].class)) {
                arrayAdapterInterface = new IntegerArrayAdapter();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder m24u = C0000a.m24u("No array pool found for: ");
                    m24u.append(cls.getSimpleName());
                    throw new IllegalArgumentException(m24u.toString());
                }
                arrayAdapterInterface = new ByteArrayAdapter();
            }
            this.f8339d.put(cls, arrayAdapterInterface);
        }
        return arrayAdapterInterface;
    }

    /* renamed from: h */
    public final <T> T m5088h(Key key, Class<T> cls) {
        ArrayAdapterInterface<T> m5087g = m5087g(cls);
        T t = (T) this.f8336a.m5081a(key);
        if (t != null) {
            this.f8341f -= m5087g.mo5060b(t) * m5087g.mo5059a();
            m5085e(m5087g.mo5060b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(m5087g.mo5061e(), 2)) {
            String mo5061e = m5087g.mo5061e();
            StringBuilder m24u = C0000a.m24u("Allocated ");
            m24u.append(key.f8343b);
            m24u.append(" bytes");
            Log.v(mo5061e, m24u.toString());
        }
        return m5087g.newArray(key.f8343b);
    }

    /* renamed from: i */
    public final NavigableMap<Integer, Integer> m5089i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f8338c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f8338c.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        ArrayAdapterInterface<T> m5087g = m5087g(cls);
        int mo5060b = m5087g.mo5060b(t);
        int mo5059a = m5087g.mo5059a() * mo5060b;
        int i2 = 1;
        if (mo5059a <= this.f8340e / 2) {
            Key m5090d = this.f8337b.m5090d(mo5060b, cls);
            this.f8336a.m5082b(m5090d, t);
            NavigableMap<Integer, Integer> m5089i = m5089i(cls);
            Integer num = (Integer) m5089i.get(Integer.valueOf(m5090d.f8343b));
            Integer valueOf = Integer.valueOf(m5090d.f8343b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            m5089i.put(valueOf, Integer.valueOf(i2));
            this.f8341f += mo5059a;
            m5086f(this.f8340e);
        }
    }

    public LruArrayPool(int i2) {
        this.f8336a = new GroupedLinkedMap<>();
        this.f8337b = new KeyPool();
        this.f8338c = new HashMap();
        this.f8339d = new HashMap();
        this.f8340e = i2;
    }
}
