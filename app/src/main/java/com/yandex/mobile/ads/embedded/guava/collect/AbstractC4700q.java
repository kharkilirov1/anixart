package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

@DoNotMock
/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.q */
/* loaded from: classes2.dex */
public abstract class AbstractC4700q<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a */
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient AbstractC4702r<Map.Entry<K, V>> f47906a;

    /* renamed from: b */
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient AbstractC4702r<K> f47907b;

    /* renamed from: c */
    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient AbstractC4694n<V> f47908c;

    @DoNotMock
    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.q$a */
    public static class a<K, V> {

        /* renamed from: a */
        public Object[] f47909a;

        /* renamed from: b */
        public int f47910b;

        public a() {
            this(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final a<K, V> m22067a(K k2, V v) {
            int i2 = (this.f47910b + 1) * 2;
            Object[] objArr = this.f47909a;
            if (i2 > objArr.length) {
                int length = objArr.length;
                if (i2 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                this.f47909a = Arrays.copyOf(objArr, i3);
            }
            if (k2 == null) {
                throw new NullPointerException("null key in entry: null=" + v);
            }
            if (v == null) {
                throw new NullPointerException("null value in entry: " + k2 + "=null");
            }
            Object[] objArr2 = this.f47909a;
            int i4 = this.f47910b;
            int i5 = i4 * 2;
            objArr2[i5] = k2;
            objArr2[i5 + 1] = v;
            this.f47910b = i4 + 1;
            return this;
        }

        public a(int i2) {
            this.f47909a = new Object[i2 * 2];
            this.f47910b = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: a */
        public final void m22069a(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.f47910b) * 2;
                Object[] objArr = this.f47909a;
                if (size > objArr.length) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int i2 = length + (length >> 1) + 1;
                        if (i2 < size) {
                            i2 = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (i2 < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                        this.f47909a = Arrays.copyOf(objArr, i2);
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                m22067a(entry.getKey(), entry.getValue());
            }
        }

        /* renamed from: a */
        public final AbstractC4700q<K, V> m22068a() {
            return C4681g0.m22020a(this.f47910b, this.f47909a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.q$b */
    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f47911a;

        /* renamed from: b */
        private final Object[] f47912b;

        public b(AbstractC4700q<K, V> abstractC4700q) {
            Object[] objArr = new Object[abstractC4700q.size()];
            Object[] objArr2 = new Object[abstractC4700q.size()];
            AbstractC4699p0<Map.Entry<K, V>> it = abstractC4700q.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i2] = next.getKey();
                objArr2[i2] = next.getValue();
                i2++;
            }
            this.f47911a = objArr;
            this.f47912b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f47911a;
            if (!(objArr instanceof AbstractC4702r)) {
                Object[] objArr2 = this.f47912b;
                a aVar = new a(objArr.length);
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    aVar.m22067a(objArr[i2], objArr2[i2]);
                }
                return aVar.m22068a();
            }
            AbstractC4702r abstractC4702r = (AbstractC4702r) objArr;
            AbstractC4694n abstractC4694n = (AbstractC4694n) this.f47912b;
            a aVar2 = new a(abstractC4702r.size());
            Iterator it = abstractC4702r.iterator();
            AbstractC4699p0 it2 = abstractC4694n.iterator();
            while (it.hasNext()) {
                aVar2.m22067a(it.next(), it2.next());
            }
            return aVar2.m22068a();
        }
    }

    /* renamed from: a */
    public static <K, V> a<K, V> m22061a() {
        return new a<>(4);
    }

    /* renamed from: h */
    public static <K, V> AbstractC4700q<K, V> m22063h() {
        return (AbstractC4700q<K, V>) C4681g0.f47861g;
    }

    /* renamed from: b */
    public abstract AbstractC4702r<Map.Entry<K, V>> mo22022b();

    /* renamed from: c */
    public abstract AbstractC4702r<K> mo22023c();

    @Override // java.util.Map
    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract AbstractC4694n<V> mo22024d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC4702r<Map.Entry<K, V>> entrySet() {
        AbstractC4702r<Map.Entry<K, V>> abstractC4702r = this.f47906a;
        if (abstractC4702r != null) {
            return abstractC4702r;
        }
        AbstractC4702r<Map.Entry<K, V>> mo22022b = mo22022b();
        this.f47906a = mo22022b;
        return mo22022b;
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((AbstractC4702r) entrySet()).equals(((Map) obj).entrySet());
    }

    /* renamed from: f */
    public abstract void mo22025f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC4702r<K> keySet() {
        AbstractC4702r<K> abstractC4702r = this.f47907b;
        if (abstractC4702r != null) {
            return abstractC4702r;
        }
        AbstractC4702r<K> mo22023c = mo22023c();
        this.f47907b = mo22023c;
        return mo22023c;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C4693m0.m22039a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC4694n<V> values() {
        AbstractC4694n<V> abstractC4694n = this.f47908c;
        if (abstractC4694n != null) {
            return abstractC4694n;
        }
        AbstractC4694n<V> mo22024d = mo22024d();
        this.f47908c = mo22024d;
        return mo22024d;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        C4682h.m22032a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static AbstractC4700q m22062a(HashMap hashMap) {
        if ((hashMap instanceof AbstractC4700q) && !(hashMap instanceof SortedMap)) {
            AbstractC4700q abstractC4700q = (AbstractC4700q) hashMap;
            abstractC4700q.mo22025f();
            return abstractC4700q;
        }
        Set entrySet = hashMap.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        aVar.m22069a(entrySet);
        return aVar.m22068a();
    }
}
