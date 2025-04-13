package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes3.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f65706g = 0;

    /* renamed from: b */
    public final int f65707b;

    /* renamed from: c */
    public List<SmallSortedMap<K, V>.Entry> f65708c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f65709d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f65710e;

    /* renamed from: f */
    public volatile SmallSortedMap<K, V>.EntrySet f65711f;

    public static class EmptySet {

        /* renamed from: a */
        public static final Iterator<Object> f65712a = new Iterator<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b */
        public static final Iterable<Object> f65713b = new Iterable<Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return EmptySet.f65712a;
            }
        };
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f65717b = -1;

        /* renamed from: c */
        public boolean f65718c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f65719d;

        public EntryIterator(C67001 c67001) {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m33353a() {
            if (this.f65719d == null) {
                this.f65719d = SmallSortedMap.this.f65709d.entrySet().iterator();
            }
            return this.f65719d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65717b + 1 < SmallSortedMap.this.f65708c.size() || m33353a().hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            this.f65718c = true;
            int i2 = this.f65717b + 1;
            this.f65717b = i2;
            return i2 < SmallSortedMap.this.f65708c.size() ? SmallSortedMap.this.f65708c.get(this.f65717b) : m33353a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f65718c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f65718c = false;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i2 = SmallSortedMap.f65706g;
            smallSortedMap.m33345b();
            if (this.f65717b >= SmallSortedMap.this.f65708c.size()) {
                m33353a().remove();
                return;
            }
            SmallSortedMap smallSortedMap2 = SmallSortedMap.this;
            int i3 = this.f65717b;
            this.f65717b = i3 - 1;
            smallSortedMap2.m33352j(i3);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet(C67001 c67001) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }
    }

    public SmallSortedMap(int i2, C67001 c67001) {
        this.f65707b = i2;
    }

    /* renamed from: a */
    public final int m33344a(K k2) {
        int size = this.f65708c.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f65708c.get(size).f65714b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f65708c.get(i3).f65714b);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public final void m33345b() {
        if (this.f65710e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public Map.Entry<K, V> m33346c(int i2) {
        return this.f65708c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m33345b();
        if (!this.f65708c.isEmpty()) {
            this.f65708c.clear();
        }
        if (this.f65709d.isEmpty()) {
            return;
        }
        this.f65709d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m33344a(comparable) >= 0 || this.f65709d.containsKey(comparable);
    }

    /* renamed from: d */
    public int m33347d() {
        return this.f65708c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f65711f == null) {
            this.f65711f = new EntrySet(null);
        }
        return this.f65711f;
    }

    /* renamed from: f */
    public Iterable<Map.Entry<K, V>> m33348f() {
        return this.f65709d.isEmpty() ? (Iterable<Map.Entry<K, V>>) EmptySet.f65713b : this.f65709d.entrySet();
    }

    /* renamed from: g */
    public final SortedMap<K, V> m33349g() {
        m33345b();
        if (this.f65709d.isEmpty() && !(this.f65709d instanceof TreeMap)) {
            this.f65709d = new TreeMap();
        }
        return (SortedMap) this.f65709d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m33344a = m33344a(comparable);
        return m33344a >= 0 ? this.f65708c.get(m33344a).getValue() : this.f65709d.get(comparable);
    }

    /* renamed from: h */
    public void mo33350h() {
        if (this.f65710e) {
            return;
        }
        this.f65709d = this.f65709d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f65709d);
        this.f65710e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public V put(K k2, V v) {
        m33345b();
        int m33344a = m33344a(k2);
        if (m33344a >= 0) {
            return this.f65708c.get(m33344a).setValue(v);
        }
        m33345b();
        if (this.f65708c.isEmpty() && !(this.f65708c instanceof ArrayList)) {
            this.f65708c = new ArrayList(this.f65707b);
        }
        int i2 = -(m33344a + 1);
        if (i2 >= this.f65707b) {
            return m33349g().put(k2, v);
        }
        int size = this.f65708c.size();
        int i3 = this.f65707b;
        if (size == i3) {
            SmallSortedMap<K, V>.Entry remove = this.f65708c.remove(i3 - 1);
            m33349g().put(remove.f65714b, remove.getValue());
        }
        this.f65708c.add(i2, new Entry(k2, v));
        return null;
    }

    /* renamed from: j */
    public final V m33352j(int i2) {
        m33345b();
        V value = this.f65708c.remove(i2).getValue();
        if (!this.f65709d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m33349g().entrySet().iterator();
            this.f65708c.add(new Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m33345b();
        Comparable comparable = (Comparable) obj;
        int m33344a = m33344a(comparable);
        if (m33344a >= 0) {
            return (V) m33352j(m33344a);
        }
        if (this.f65709d.isEmpty()) {
            return null;
        }
        return this.f65709d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f65709d.size() + this.f65708c.size();
    }

    public class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {

        /* renamed from: b */
        public final K f65714b;

        /* renamed from: c */
        public V f65715c;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            K key = entry.getKey();
            V value = entry.getValue();
            SmallSortedMap.this = smallSortedMap;
            this.f65714b = key;
            this.f65715c = value;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f65714b.compareTo(((Entry) obj).f65714b);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f65714b;
            Object key = entry.getKey();
            if (k2 == null ? key == null : k2.equals(key)) {
                V v = this.f65715c;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f65714b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f65715c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f65714b;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f65715c;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i2 = SmallSortedMap.f65706g;
            smallSortedMap.m33345b();
            V v2 = this.f65715c;
            this.f65715c = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f65714b);
            String valueOf2 = String.valueOf(this.f65715c);
            return C0000a.m21r(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }

        public Entry(K k2, V v) {
            this.f65714b = k2;
            this.f65715c = v;
        }
    }
}
