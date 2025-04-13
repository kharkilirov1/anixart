package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {

    /* renamed from: f */
    @NullableDecl
    public transient Node<K, V> f21167f;

    /* renamed from: g */
    @NullableDecl
    public transient Node<K, V> f21168g;

    /* renamed from: h */
    public transient Map<K, KeyList<K, V>> f21169h = new CompactHashMap(12);

    /* renamed from: i */
    public transient int f21170i;

    /* renamed from: j */
    public transient int f21171j;

    /* renamed from: com.google.common.collect.LinkedListMultimap$1 */
    public class C16941 extends AbstractSequentialList<V> {

        /* renamed from: b */
        public final /* synthetic */ Object f21172b;

        public C16941(Object obj) {
            this.f21172b = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i2) {
            return new ValueForKeyIterator(this.f21172b, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            KeyList<K, V> keyList = LinkedListMultimap.this.f21169h.get(this.f21172b);
            if (keyList == null) {
                return 0;
            }
            return keyList.f21185c;
        }
    }

    public class DistinctKeyIterator implements Iterator<K> {

        /* renamed from: b */
        public final Set<K> f21178b;

        /* renamed from: c */
        public Node<K, V> f21179c;

        /* renamed from: d */
        @NullableDecl
        public Node<K, V> f21180d;

        /* renamed from: e */
        public int f21181e;

        public DistinctKeyIterator(C16941 c16941) {
            this.f21178b = Sets.m11889g(LinkedListMultimap.this.keySet().size());
            this.f21179c = LinkedListMultimap.this.f21167f;
            this.f21181e = LinkedListMultimap.this.f21171j;
        }

        /* renamed from: a */
        public final void m11730a() {
            if (LinkedListMultimap.this.f21171j != this.f21181e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m11730a();
            return this.f21179c != null;
        }

        @Override // java.util.Iterator
        public K next() {
            Node<K, V> node;
            m11730a();
            LinkedListMultimap.m11727j(this.f21179c);
            Node<K, V> node2 = this.f21179c;
            this.f21180d = node2;
            this.f21178b.add(node2.f21186b);
            do {
                node = this.f21179c.f21188d;
                this.f21179c = node;
                if (node == null) {
                    break;
                }
            } while (!this.f21178b.add(node.f21186b));
            return this.f21180d.f21186b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m11730a();
            Preconditions.m11192p(this.f21180d != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            K k2 = this.f21180d.f21186b;
            Objects.requireNonNull(linkedListMultimap);
            Iterators.m11707b(new ValueForKeyIterator(k2));
            this.f21180d = null;
            this.f21181e = LinkedListMultimap.this.f21171j;
        }
    }

    public static class KeyList<K, V> {

        /* renamed from: a */
        public Node<K, V> f21183a;

        /* renamed from: b */
        public Node<K, V> f21184b;

        /* renamed from: c */
        public int f21185c;

        public KeyList(Node<K, V> node) {
            this.f21183a = node;
            this.f21184b = node;
            node.f21191g = null;
            node.f21190f = null;
            this.f21185c = 1;
        }
    }

    public static final class Node<K, V> extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        @NullableDecl
        public final K f21186b;

        /* renamed from: c */
        @NullableDecl
        public V f21187c;

        /* renamed from: d */
        @NullableDecl
        public Node<K, V> f21188d;

        /* renamed from: e */
        @NullableDecl
        public Node<K, V> f21189e;

        /* renamed from: f */
        @NullableDecl
        public Node<K, V> f21190f;

        /* renamed from: g */
        @NullableDecl
        public Node<K, V> f21191g;

        public Node(@NullableDecl K k2, @NullableDecl V v) {
            this.f21186b = k2;
            this.f21187c = v;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.f21186b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.f21187c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(@NullableDecl V v) {
            V v2 = this.f21187c;
            this.f21187c = v;
            return v2;
        }
    }

    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public int f21192b;

        /* renamed from: c */
        @NullableDecl
        public Node<K, V> f21193c;

        /* renamed from: d */
        @NullableDecl
        public Node<K, V> f21194d;

        /* renamed from: e */
        @NullableDecl
        public Node<K, V> f21195e;

        /* renamed from: f */
        public int f21196f;

        public NodeIterator(int i2) {
            this.f21196f = LinkedListMultimap.this.f21171j;
            int i3 = LinkedListMultimap.this.f21170i;
            Preconditions.m11189m(i2, i3);
            if (i2 < i3 / 2) {
                this.f21193c = LinkedListMultimap.this.f21167f;
                while (true) {
                    int i4 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i4;
                }
            } else {
                this.f21195e = LinkedListMultimap.this.f21168g;
                this.f21192b = i3;
                while (true) {
                    int i5 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    previous();
                    i2 = i5;
                }
            }
            this.f21194d = null;
        }

        /* renamed from: a */
        public final void m11731a() {
            if (LinkedListMultimap.this.f21171j != this.f21196f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Node<K, V> next() {
            m11731a();
            LinkedListMultimap.m11727j(this.f21193c);
            Node<K, V> node = this.f21193c;
            this.f21194d = node;
            this.f21195e = node;
            this.f21193c = node.f21188d;
            this.f21192b++;
            return node;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Node<K, V> previous() {
            m11731a();
            LinkedListMultimap.m11727j(this.f21195e);
            Node<K, V> node = this.f21195e;
            this.f21194d = node;
            this.f21193c = node;
            this.f21195e = node.f21189e;
            this.f21192b--;
            return node;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            m11731a();
            return this.f21193c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            m11731a();
            return this.f21195e != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21192b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21192b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            m11731a();
            Preconditions.m11192p(this.f21194d != null, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.f21194d;
            if (node != this.f21193c) {
                this.f21195e = node.f21189e;
                this.f21192b--;
            } else {
                this.f21193c = node.f21188d;
            }
            LinkedListMultimap.m11728k(LinkedListMultimap.this, node);
            this.f21194d = null;
            this.f21196f = LinkedListMultimap.this.f21171j;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    public static void m11727j(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: k */
    public static void m11728k(LinkedListMultimap linkedListMultimap, Node node) {
        Objects.requireNonNull(linkedListMultimap);
        Node<K, V> node2 = node.f21189e;
        if (node2 != null) {
            node2.f21188d = node.f21188d;
        } else {
            linkedListMultimap.f21167f = node.f21188d;
        }
        Node<K, V> node3 = node.f21188d;
        if (node3 != null) {
            node3.f21189e = node2;
        } else {
            linkedListMultimap.f21168g = node2;
        }
        if (node.f21191g == null && node.f21190f == null) {
            linkedListMultimap.f21169h.remove(node.f21186b).f21185c = 0;
            linkedListMultimap.f21171j++;
        } else {
            KeyList<K, V> keyList = linkedListMultimap.f21169h.get(node.f21186b);
            keyList.f21185c--;
            Node<K, V> node4 = node.f21191g;
            if (node4 == null) {
                keyList.f21183a = node.f21190f;
            } else {
                node4.f21190f = node.f21190f;
            }
            Node<K, V> node5 = node.f21190f;
            if (node5 == null) {
                keyList.f21184b = node4;
            } else {
                node5.f21191g = node4;
            }
        }
        linkedListMultimap.f21170i--;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Collection mo11345b() {
        return (List) super.mo11345b();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        this.f21167f = null;
        this.f21168g = null;
        this.f21169h.clear();
        this.f21170i = 0;
        this.f21171j++;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f21169h.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection mo11347d() {
        return new AbstractSequentialList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<Map.Entry<Object, Object>> listIterator(int i2) {
                return new NodeIterator(i2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.f21170i;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        return new Sets.ImprovedAbstractSet<K>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return LinkedListMultimap.this.f21169h.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<K> iterator() {
                return new DistinctKeyIterator(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return !LinkedListMultimap.this.mo11335a(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LinkedListMultimap.this.f21169h.size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    public Collection mo11349g() {
        return new AbstractSequentialList<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public ListIterator<Object> listIterator(int i2) {
                final NodeIterator nodeIterator = new NodeIterator(i2);
                return new TransformedListIterator<Map.Entry<Object, Object>, Object>(nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    @Override // com.google.common.collect.TransformedIterator
                    /* renamed from: a */
                    public Object mo11415a(Object obj) {
                        return ((Map.Entry) obj).getValue();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public void set(Object obj) {
                        NodeIterator nodeIterator2 = nodeIterator;
                        Preconditions.m11191o(nodeIterator2.f21194d != null);
                        nodeIterator2.f21194d.f21187c = obj;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return LinkedListMultimap.this.f21170i;
            }
        };
    }

    @Override // com.google.common.collect.Multimap
    public Collection get(@NullableDecl Object obj) {
        return new C16941(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator<Map.Entry<K, V>> mo11350h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
        return this.f21167f == null;
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public final Node<K, V> m11729l(@NullableDecl K k2, @NullableDecl V v, @NullableDecl Node<K, V> node) {
        Node<K, V> node2 = new Node<>(k2, v);
        if (this.f21167f == null) {
            this.f21168g = node2;
            this.f21167f = node2;
            this.f21169h.put(k2, new KeyList<>(node2));
            this.f21171j++;
        } else if (node == null) {
            Node<K, V> node3 = this.f21168g;
            node3.f21188d = node2;
            node2.f21189e = node3;
            this.f21168g = node2;
            KeyList<K, V> keyList = this.f21169h.get(k2);
            if (keyList == null) {
                this.f21169h.put(k2, new KeyList<>(node2));
                this.f21171j++;
            } else {
                keyList.f21185c++;
                Node<K, V> node4 = keyList.f21184b;
                node4.f21190f = node2;
                node2.f21191g = node4;
                keyList.f21184b = node2;
            }
        } else {
            this.f21169h.get(k2).f21185c++;
            node2.f21189e = node.f21189e;
            node2.f21191g = node.f21191g;
            node2.f21188d = node;
            node2.f21190f = node;
            Node<K, V> node5 = node.f21191g;
            if (node5 == null) {
                this.f21169h.get(k2).f21183a = node2;
            } else {
                node5.f21190f = node2;
            }
            Node<K, V> node6 = node.f21189e;
            if (node6 == null) {
                this.f21167f = node2;
            } else {
                node6.f21188d = node2;
            }
            node.f21189e = node2;
            node.f21191g = node2;
        }
        this.f21170i++;
        return node2;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        m11729l(k2, v, null);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f21170i;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    /* renamed from: a */
    public List<V> mo11335a(@NullableDecl Object obj) {
        List<V> unmodifiableList = Collections.unmodifiableList(Lists.m11736c(new ValueForKeyIterator(obj)));
        Iterators.m11707b(new ValueForKeyIterator(obj));
        return unmodifiableList;
    }

    @Override // com.google.common.collect.Multimap
    public List<V> get(@NullableDecl K k2) {
        return new C16941(k2);
    }

    public class ValueForKeyIterator implements ListIterator<V> {

        /* renamed from: b */
        @NullableDecl
        public final Object f21198b;

        /* renamed from: c */
        public int f21199c;

        /* renamed from: d */
        @NullableDecl
        public Node<K, V> f21200d;

        /* renamed from: e */
        @NullableDecl
        public Node<K, V> f21201e;

        /* renamed from: f */
        @NullableDecl
        public Node<K, V> f21202f;

        public ValueForKeyIterator(@NullableDecl Object obj) {
            this.f21198b = obj;
            KeyList<K, V> keyList = LinkedListMultimap.this.f21169h.get(obj);
            this.f21200d = keyList == null ? null : keyList.f21183a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public void add(V v) {
            this.f21202f = LinkedListMultimap.this.m11729l(this.f21198b, v, this.f21200d);
            this.f21199c++;
            this.f21201e = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21200d != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21202f != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public V next() {
            LinkedListMultimap.m11727j(this.f21200d);
            Node<K, V> node = this.f21200d;
            this.f21201e = node;
            this.f21202f = node;
            this.f21200d = node.f21190f;
            this.f21199c++;
            return node.f21187c;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21199c;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public V previous() {
            LinkedListMultimap.m11727j(this.f21202f);
            Node<K, V> node = this.f21202f;
            this.f21201e = node;
            this.f21200d = node;
            this.f21202f = node.f21191g;
            this.f21199c--;
            return node.f21187c;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21199c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21201e != null, "no calls to next() since the last call to remove()");
            Node<K, V> node = this.f21201e;
            if (node != this.f21200d) {
                this.f21202f = node.f21191g;
                this.f21199c--;
            } else {
                this.f21200d = node.f21190f;
            }
            LinkedListMultimap.m11728k(LinkedListMultimap.this, node);
            this.f21201e = null;
        }

        @Override // java.util.ListIterator
        public void set(V v) {
            Preconditions.m11191o(this.f21201e != null);
            this.f21201e.f21187c = v;
        }

        public ValueForKeyIterator(@NullableDecl Object obj, int i2) {
            KeyList<K, V> keyList = LinkedListMultimap.this.f21169h.get(obj);
            int i3 = keyList == null ? 0 : keyList.f21185c;
            Preconditions.m11189m(i2, i3);
            if (i2 >= i3 / 2) {
                this.f21202f = keyList == null ? null : keyList.f21184b;
                this.f21199c = i3;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    previous();
                    i2 = i4;
                }
            } else {
                this.f21200d = keyList == null ? null : keyList.f21183a;
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i5;
                }
            }
            this.f21198b = obj;
            this.f21201e = null;
        }
    }
}
