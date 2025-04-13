package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.j2objc.annotations.Weak;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4676e.a.C7012a;
import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import com.yandex.mobile.ads.impl.gn0;
import com.yandex.mobile.ads.impl.tr0;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.x */
/* loaded from: classes2.dex */
public final class C4708x {

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.x$a */
    public static abstract class a<K, V> extends C4693m0.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractC4676e.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(@CheckForNull Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return AbstractC4676e.a.this.isEmpty();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.C4693m0.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return C4693m0.m22044a((Set<?>) this, collection.iterator());
            }
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.C4693m0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int i2;
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    C4682h.m22032a(size, "expectedSize");
                    i2 = size + 1;
                } else {
                    i2 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i2);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return AbstractC4676e.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractC4676e.a.this.f47824c.size();
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.x$b */
    public static class b<K, V> extends C4693m0.c<K> {

        /* renamed from: a */
        @Weak
        public final Map<K, V> f47921a;

        public b(Map<K, V> map) {
            this.f47921a = (Map) tr0.m28727a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.f47921a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f47921a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f47921a.size();
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.x$c */
    public static class c<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        @Weak
        public final Map<K, V> f47922a;

        public c(Map<K, V> map) {
            this.f47922a = (Map) tr0.m28727a(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f47922a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f47922a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f47922a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C4707w(this.f47922a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : this.f47922a.entrySet()) {
                    if (gn0.m24948a(obj, entry.getValue())) {
                        this.f47922a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f47922a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f47922a.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<K, V> entry : this.f47922a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f47922a.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f47922a.size();
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.x$d */
    public static abstract class d<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        @CheckForNull
        private transient Set<Map.Entry<K, V>> f47923a;

        /* renamed from: b */
        @CheckForNull
        private transient Collection<V> f47924b;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f47923a;
            if (set != null) {
                return set;
            }
            AbstractC4676e.a.C7012a c7012a = ((AbstractC4676e.a) this).new C7012a();
            this.f47923a = c7012a;
            return c7012a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            Collection<V> collection = this.f47924b;
            if (collection != null) {
                return collection;
            }
            c cVar = new c(this);
            this.f47924b = cVar;
            return cVar;
        }
    }

    /* renamed from: a */
    public static boolean m22080a(Map<?, ?> map, @CheckForNull Object obj) {
        Iterator it = (Iterator) tr0.m28727a(map.entrySet().iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }
}
