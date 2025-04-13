package androidx.collection;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class MapCollections<K, V> {

    /* renamed from: a */
    @Nullable
    public MapCollections<K, V>.EntrySet f1829a;

    /* renamed from: b */
    @Nullable
    public MapCollections<K, V>.KeySet f1830b;

    /* renamed from: c */
    @Nullable
    public MapCollections<K, V>.ValuesCollection f1831c;

    public final class ArrayIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f1832b;

        /* renamed from: c */
        public int f1833c;

        /* renamed from: d */
        public int f1834d;

        /* renamed from: e */
        public boolean f1835e = false;

        public ArrayIterator(int i2) {
            this.f1832b = i2;
            this.f1833c = MapCollections.this.mo1072d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1834d < this.f1833c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) MapCollections.this.mo1070b(this.f1834d, this.f1832b);
            this.f1834d++;
            this.f1835e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1835e) {
                throw new IllegalStateException();
            }
            int i2 = this.f1834d - 1;
            this.f1834d = i2;
            this.f1833c--;
            this.f1835e = false;
            MapCollections.this.mo1076h(i2);
        }
    }

    public final class EntrySet implements Set<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo1072d = MapCollections.this.mo1072d();
            for (Map.Entry<K, V> entry : collection) {
                MapCollections.this.mo1075g(entry.getKey(), entry.getValue());
            }
            return mo1072d != MapCollections.this.mo1072d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.mo1069a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo1073e = MapCollections.this.mo1073e(entry.getKey());
            if (mo1073e < 0) {
                return false;
            }
            return ContainerHelpers.m1085c(MapCollections.this.mo1070b(mo1073e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.m1111j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int mo1072d = MapCollections.this.mo1072d() - 1; mo1072d >= 0; mo1072d--) {
                Object mo1070b = MapCollections.this.mo1070b(mo1072d, 0);
                Object mo1070b2 = MapCollections.this.mo1070b(mo1072d, 1);
                i2 += (mo1070b == null ? 0 : mo1070b.hashCode()) ^ (mo1070b2 == null ? 0 : mo1070b2.hashCode());
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo1072d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.mo1072d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.mo1069a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.mo1073e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mo1071c = MapCollections.this.mo1071c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mo1071c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.m1111j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int mo1072d = MapCollections.this.mo1072d() - 1; mo1072d >= 0; mo1072d--) {
                Object mo1070b = MapCollections.this.mo1070b(mo1072d, 0);
                i2 += mo1070b == null ? 0 : mo1070b.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo1072d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ArrayIterator(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo1073e = MapCollections.this.mo1073e(obj);
            if (mo1073e < 0) {
                return false;
            }
            MapCollections.this.mo1076h(mo1073e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mo1071c = MapCollections.this.mo1071c();
            int size = mo1071c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mo1071c.remove(it.next());
            }
            return size != mo1071c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return MapCollections.m1112k(MapCollections.this.mo1071c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.mo1072d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.m1113l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.m1114m(tArr, 0);
        }
    }

    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f1839b;

        /* renamed from: d */
        public boolean f1841d = false;

        /* renamed from: c */
        public int f1840c = -1;

        public MapIterator() {
            this.f1839b = MapCollections.this.mo1072d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1841d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ContainerHelpers.m1085c(entry.getKey(), MapCollections.this.mo1070b(this.f1840c, 0)) && ContainerHelpers.m1085c(entry.getValue(), MapCollections.this.mo1070b(this.f1840c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1841d) {
                return (K) MapCollections.this.mo1070b(this.f1840c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1841d) {
                return (V) MapCollections.this.mo1070b(this.f1840c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1840c < this.f1839b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1841d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo1070b = MapCollections.this.mo1070b(this.f1840c, 0);
            Object mo1070b2 = MapCollections.this.mo1070b(this.f1840c, 1);
            return (mo1070b == null ? 0 : mo1070b.hashCode()) ^ (mo1070b2 != null ? mo1070b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1840c++;
            this.f1841d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1841d) {
                throw new IllegalStateException();
            }
            MapCollections.this.mo1076h(this.f1840c);
            this.f1840c--;
            this.f1839b--;
            this.f1841d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1841d) {
                return (V) MapCollections.this.mo1077i(this.f1840c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class ValuesCollection implements Collection<V> {
        public ValuesCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            MapCollections.this.mo1069a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.mo1074f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo1072d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ArrayIterator(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo1074f = MapCollections.this.mo1074f(obj);
            if (mo1074f < 0) {
                return false;
            }
            MapCollections.this.mo1076h(mo1074f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo1072d = MapCollections.this.mo1072d();
            int i2 = 0;
            boolean z = false;
            while (i2 < mo1072d) {
                if (collection.contains(MapCollections.this.mo1070b(i2, 1))) {
                    MapCollections.this.mo1076h(i2);
                    i2--;
                    mo1072d--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo1072d = MapCollections.this.mo1072d();
            int i2 = 0;
            boolean z = false;
            while (i2 < mo1072d) {
                if (!collection.contains(MapCollections.this.mo1070b(i2, 1))) {
                    MapCollections.this.mo1076h(i2);
                    i2--;
                    mo1072d--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return MapCollections.this.mo1072d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.m1113l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.m1114m(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <T> boolean m1111j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m1112k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo1069a();

    /* renamed from: b */
    public abstract Object mo1070b(int i2, int i3);

    /* renamed from: c */
    public abstract Map<K, V> mo1071c();

    /* renamed from: d */
    public abstract int mo1072d();

    /* renamed from: e */
    public abstract int mo1073e(Object obj);

    /* renamed from: f */
    public abstract int mo1074f(Object obj);

    /* renamed from: g */
    public abstract void mo1075g(K k2, V v);

    /* renamed from: h */
    public abstract void mo1076h(int i2);

    /* renamed from: i */
    public abstract V mo1077i(int i2, V v);

    /* renamed from: l */
    public Object[] m1113l(int i2) {
        int mo1072d = mo1072d();
        Object[] objArr = new Object[mo1072d];
        for (int i3 = 0; i3 < mo1072d; i3++) {
            objArr[i3] = mo1070b(i3, i2);
        }
        return objArr;
    }

    /* renamed from: m */
    public <T> T[] m1114m(T[] tArr, int i2) {
        int mo1072d = mo1072d();
        if (tArr.length < mo1072d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo1072d));
        }
        for (int i3 = 0; i3 < mo1072d; i3++) {
            tArr[i3] = mo1070b(i3, i2);
        }
        if (tArr.length > mo1072d) {
            tArr[mo1072d] = null;
        }
        return tArr;
    }
}
