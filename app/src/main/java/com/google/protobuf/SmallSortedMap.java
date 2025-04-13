package com.google.protobuf;

import com.google.protobuf.FieldSet;
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

/* loaded from: classes2.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f24341i = 0;

    /* renamed from: b */
    public final int f24342b;

    /* renamed from: e */
    public boolean f24345e;

    /* renamed from: f */
    public volatile SmallSortedMap<K, V>.EntrySet f24346f;

    /* renamed from: h */
    public volatile SmallSortedMap<K, V>.DescendingEntrySet f24348h;

    /* renamed from: c */
    public List<SmallSortedMap<K, V>.Entry> f24343c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f24344d = Collections.emptyMap();

    /* renamed from: g */
    public Map<K, V> f24347g = Collections.emptyMap();

    /* renamed from: com.google.protobuf.SmallSortedMap$1 */
    final class C23931 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        public C23931(int i2) {
            super(i2, null);
        }

        @Override // com.google.protobuf.SmallSortedMap
        /* renamed from: h */
        public void mo13629h() {
            if (!this.f24345e) {
                for (int i2 = 0; i2 < m13626d(); i2++) {
                    Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> m13625c = m13625c(i2);
                    if (m13625c.getKey().mo13404y()) {
                        m13625c.setValue(Collections.unmodifiableList((List) m13625c.getValue()));
                    }
                }
                for (Map.Entry<FieldSet.FieldDescriptorLite<Object>, Object> entry : m13627f()) {
                    if (entry.getKey().mo13404y()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo13629h();
        }

        @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f24349b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f24350c;

        public DescendingEntryIterator(C23931 c23931) {
            this.f24349b = SmallSortedMap.this.f24343c.size();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m13632a() {
            if (this.f24350c == null) {
                this.f24350c = SmallSortedMap.this.f24347g.entrySet().iterator();
            }
            return this.f24350c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f24349b;
            return (i2 > 0 && i2 <= SmallSortedMap.this.f24343c.size()) || m13632a().hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (m13632a().hasNext()) {
                return m13632a().next();
            }
            List<SmallSortedMap<K, V>.Entry> list = SmallSortedMap.this.f24343c;
            int i2 = this.f24349b - 1;
            this.f24349b = i2;
            return list.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet(C23931 c23931) {
            super(null);
        }

        @Override // com.google.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new DescendingEntryIterator(null);
        }
    }

    public static class EmptySet {

        /* renamed from: a */
        public static final Iterator<Object> f24353a = new Iterator<Object>() { // from class: com.google.protobuf.SmallSortedMap.EmptySet.1
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
        public static final Iterable<Object> f24354b = new Iterable<Object>() { // from class: com.google.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return EmptySet.f24353a;
            }
        };
    }

    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f24358b = -1;

        /* renamed from: c */
        public boolean f24359c;

        /* renamed from: d */
        public Iterator<Map.Entry<K, V>> f24360d;

        public EntryIterator(C23931 c23931) {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m13633a() {
            if (this.f24360d == null) {
                this.f24360d = SmallSortedMap.this.f24344d.entrySet().iterator();
            }
            return this.f24360d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24358b + 1 >= SmallSortedMap.this.f24343c.size()) {
                return !SmallSortedMap.this.f24344d.isEmpty() && m13633a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.f24359c = true;
            int i2 = this.f24358b + 1;
            this.f24358b = i2;
            return i2 < SmallSortedMap.this.f24343c.size() ? SmallSortedMap.this.f24343c.get(this.f24358b) : m13633a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f24359c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f24359c = false;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i2 = SmallSortedMap.f24341i;
            smallSortedMap.m13624b();
            if (this.f24358b >= SmallSortedMap.this.f24343c.size()) {
                m13633a().remove();
                return;
            }
            SmallSortedMap smallSortedMap2 = SmallSortedMap.this;
            int i3 = this.f24358b;
            this.f24358b = i3 - 1;
            smallSortedMap2.m13631j(i3);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet(C23931 c23931) {
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

    public SmallSortedMap(int i2, C23931 c23931) {
        this.f24342b = i2;
    }

    /* renamed from: a */
    public final int m13623a(K k2) {
        int size = this.f24343c.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f24343c.get(size).f24355b);
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
            int compareTo2 = k2.compareTo(this.f24343c.get(i3).f24355b);
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
    public final void m13624b() {
        if (this.f24345e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public Map.Entry<K, V> m13625c(int i2) {
        return this.f24343c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m13624b();
        if (!this.f24343c.isEmpty()) {
            this.f24343c.clear();
        }
        if (this.f24344d.isEmpty()) {
            return;
        }
        this.f24344d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13623a(comparable) >= 0 || this.f24344d.containsKey(comparable);
    }

    /* renamed from: d */
    public int m13626d() {
        return this.f24343c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f24346f == null) {
            this.f24346f = new EntrySet(null);
        }
        return this.f24346f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int m13626d = m13626d();
        if (m13626d != smallSortedMap.m13626d()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i2 = 0; i2 < m13626d; i2++) {
            if (!m13625c(i2).equals(smallSortedMap.m13625c(i2))) {
                return false;
            }
        }
        if (m13626d != size) {
            return this.f24344d.equals(smallSortedMap.f24344d);
        }
        return true;
    }

    /* renamed from: f */
    public Iterable<Map.Entry<K, V>> m13627f() {
        return this.f24344d.isEmpty() ? (Iterable<Map.Entry<K, V>>) EmptySet.f24354b : this.f24344d.entrySet();
    }

    /* renamed from: g */
    public final SortedMap<K, V> m13628g() {
        m13624b();
        if (this.f24344d.isEmpty() && !(this.f24344d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24344d = treeMap;
            this.f24347g = treeMap.descendingMap();
        }
        return (SortedMap) this.f24344d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m13623a = m13623a(comparable);
        return m13623a >= 0 ? this.f24343c.get(m13623a).getValue() : this.f24344d.get(comparable);
    }

    /* renamed from: h */
    public void mo13629h() {
        if (this.f24345e) {
            return;
        }
        this.f24344d = this.f24344d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24344d);
        this.f24347g = this.f24347g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24347g);
        this.f24345e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m13626d = m13626d();
        int i2 = 0;
        for (int i3 = 0; i3 < m13626d; i3++) {
            i2 += this.f24343c.get(i3).hashCode();
        }
        return this.f24344d.size() > 0 ? i2 + this.f24344d.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public V put(K k2, V v) {
        m13624b();
        int m13623a = m13623a(k2);
        if (m13623a >= 0) {
            return this.f24343c.get(m13623a).setValue(v);
        }
        m13624b();
        if (this.f24343c.isEmpty() && !(this.f24343c instanceof ArrayList)) {
            this.f24343c = new ArrayList(this.f24342b);
        }
        int i2 = -(m13623a + 1);
        if (i2 >= this.f24342b) {
            return m13628g().put(k2, v);
        }
        int size = this.f24343c.size();
        int i3 = this.f24342b;
        if (size == i3) {
            SmallSortedMap<K, V>.Entry remove = this.f24343c.remove(i3 - 1);
            m13628g().put(remove.f24355b, remove.getValue());
        }
        this.f24343c.add(i2, new Entry(k2, v));
        return null;
    }

    /* renamed from: j */
    public final V m13631j(int i2) {
        m13624b();
        V value = this.f24343c.remove(i2).getValue();
        if (!this.f24344d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m13628g().entrySet().iterator();
            this.f24343c.add(new Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m13624b();
        Comparable comparable = (Comparable) obj;
        int m13623a = m13623a(comparable);
        if (m13623a >= 0) {
            return (V) m13631j(m13623a);
        }
        if (this.f24344d.isEmpty()) {
            return null;
        }
        return this.f24344d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f24344d.size() + this.f24343c.size();
    }

    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* renamed from: b */
        public final K f24355b;

        /* renamed from: c */
        public V f24356c;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            K key = entry.getKey();
            V value = entry.getValue();
            SmallSortedMap.this = smallSortedMap;
            this.f24355b = key;
            this.f24356c = value;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f24355b.compareTo(((Entry) obj).f24355b);
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
            K k2 = this.f24355b;
            Object key = entry.getKey();
            if (k2 == null ? key == null : k2.equals(key)) {
                V v = this.f24356c;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f24355b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24356c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f24355b;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f24356c;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i2 = SmallSortedMap.f24341i;
            smallSortedMap.m13624b();
            V v2 = this.f24356c;
            this.f24356c = v;
            return v2;
        }

        public String toString() {
            return this.f24355b + "=" + this.f24356c;
        }

        public Entry(K k2, V v) {
            this.f24355b = k2;
            this.f24356c = v;
        }
    }
}
