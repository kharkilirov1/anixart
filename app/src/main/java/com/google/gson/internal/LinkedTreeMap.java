package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i */
    public static final Comparator<Comparable> f23735i = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: b */
    public Comparator<? super K> f23736b;

    /* renamed from: c */
    public Node<K, V> f23737c;

    /* renamed from: d */
    public int f23738d;

    /* renamed from: e */
    public int f23739e;

    /* renamed from: f */
    public final Node<K, V> f23740f;

    /* renamed from: g */
    public LinkedTreeMap<K, V>.EntrySet f23741g;

    /* renamed from: h */
    public LinkedTreeMap<K, V>.KeySet f23742h;

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.m12883b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>(this) { // from class: com.google.gson.internal.LinkedTreeMap.EntrySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public Object next() {
                    return m12890a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> m12883b;
            if (!(obj instanceof Map.Entry) || (m12883b = LinkedTreeMap.this.m12883b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.m12886f(m12883b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f23738d;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.m12884c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>(this) { // from class: com.google.gson.internal.LinkedTreeMap.KeySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m12890a().f23754g;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            Node<K, V> m12884c = linkedTreeMap.m12884c(obj);
            if (m12884c != null) {
                linkedTreeMap.m12886f(m12884c, true);
            }
            return m12884c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f23738d;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public Node<K, V> f23745b;

        /* renamed from: c */
        public Node<K, V> f23746c = null;

        /* renamed from: d */
        public int f23747d;

        public LinkedTreeMapIterator() {
            this.f23745b = LinkedTreeMap.this.f23740f.f23752e;
            this.f23747d = LinkedTreeMap.this.f23739e;
        }

        /* renamed from: a */
        public final Node<K, V> m12890a() {
            Node<K, V> node = this.f23745b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.f23740f) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f23739e != this.f23747d) {
                throw new ConcurrentModificationException();
            }
            this.f23745b = node.f23752e;
            this.f23746c = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23745b != LinkedTreeMap.this.f23740f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f23746c;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.m12886f(node, true);
            this.f23746c = null;
            this.f23747d = LinkedTreeMap.this.f23739e;
        }
    }

    public LinkedTreeMap() {
        this(f23735i);
    }

    /* renamed from: a */
    public Node<K, V> m12882a(K k2, boolean z) {
        int i2;
        Node<K, V> node;
        Comparator<? super K> comparator = this.f23736b;
        Node<K, V> node2 = this.f23737c;
        if (node2 != null) {
            Comparable comparable = comparator == f23735i ? (Comparable) k2 : null;
            while (true) {
                i2 = comparable != null ? comparable.compareTo(node2.f23754g) : comparator.compare(k2, node2.f23754g);
                if (i2 == 0) {
                    return node2;
                }
                Node<K, V> node3 = i2 < 0 ? node2.f23750c : node2.f23751d;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node4 = this.f23740f;
        if (node2 != null) {
            node = new Node<>(node2, k2, node4, node4.f23753f);
            if (i2 < 0) {
                node2.f23750c = node;
            } else {
                node2.f23751d = node;
            }
            m12885d(node2, true);
        } else {
            if (comparator == f23735i && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(node2, k2, node4, node4.f23753f);
            this.f23737c = node;
        }
        this.f23738d++;
        this.f23739e++;
        return node;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.internal.LinkedTreeMap.Node<K, V> m12883b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.LinkedTreeMap$Node r0 = r4.m12884c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f23755h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.m12883b(java.util.Map$Entry):com.google.gson.internal.LinkedTreeMap$Node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public Node<K, V> m12884c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m12882a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f23737c = null;
        this.f23738d = 0;
        this.f23739e++;
        Node<K, V> node = this.f23740f;
        node.f23753f = node;
        node.f23752e = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m12884c(obj) != null;
    }

    /* renamed from: d */
    public final void m12885d(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f23750c;
            Node<K, V> node3 = node.f23751d;
            int i2 = node2 != null ? node2.f23756i : 0;
            int i3 = node3 != null ? node3.f23756i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node<K, V> node4 = node3.f23750c;
                Node<K, V> node5 = node3.f23751d;
                int i5 = (node4 != null ? node4.f23756i : 0) - (node5 != null ? node5.f23756i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    m12888h(node);
                } else {
                    m12889i(node3);
                    m12888h(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node<K, V> node6 = node2.f23750c;
                Node<K, V> node7 = node2.f23751d;
                int i6 = (node6 != null ? node6.f23756i : 0) - (node7 != null ? node7.f23756i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    m12889i(node);
                } else {
                    m12888h(node2);
                    m12889i(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.f23756i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.f23756i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f23749b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet entrySet = this.f23741g;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.f23741g = entrySet2;
        return entrySet2;
    }

    /* renamed from: f */
    public void m12886f(Node<K, V> node, boolean z) {
        Node<K, V> node2;
        Node<K, V> node3;
        int i2;
        if (z) {
            Node<K, V> node4 = node.f23753f;
            node4.f23752e = node.f23752e;
            node.f23752e.f23753f = node4;
        }
        Node<K, V> node5 = node.f23750c;
        Node<K, V> node6 = node.f23751d;
        Node<K, V> node7 = node.f23749b;
        int i3 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                m12887g(node, node5);
                node.f23750c = null;
            } else if (node6 != null) {
                m12887g(node, node6);
                node.f23751d = null;
            } else {
                m12887g(node, null);
            }
            m12885d(node7, false);
            this.f23738d--;
            this.f23739e++;
            return;
        }
        if (node5.f23756i > node6.f23756i) {
            Node<K, V> node8 = node5.f23751d;
            while (true) {
                Node<K, V> node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.f23751d;
                }
            }
        } else {
            Node<K, V> node10 = node6.f23750c;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.f23750c;
                }
            }
            node3 = node2;
        }
        m12886f(node3, false);
        Node<K, V> node11 = node.f23750c;
        if (node11 != null) {
            i2 = node11.f23756i;
            node3.f23750c = node11;
            node11.f23749b = node3;
            node.f23750c = null;
        } else {
            i2 = 0;
        }
        Node<K, V> node12 = node.f23751d;
        if (node12 != null) {
            i3 = node12.f23756i;
            node3.f23751d = node12;
            node12.f23749b = node3;
            node.f23751d = null;
        }
        node3.f23756i = Math.max(i2, i3) + 1;
        m12887g(node, node3);
    }

    /* renamed from: g */
    public final void m12887g(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f23749b;
        node.f23749b = null;
        if (node2 != null) {
            node2.f23749b = node3;
        }
        if (node3 == null) {
            this.f23737c = node2;
        } else if (node3.f23750c == node) {
            node3.f23750c = node2;
        } else {
            node3.f23751d = node2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> m12884c = m12884c(obj);
        if (m12884c != null) {
            return m12884c.f23755h;
        }
        return null;
    }

    /* renamed from: h */
    public final void m12888h(Node<K, V> node) {
        Node<K, V> node2 = node.f23750c;
        Node<K, V> node3 = node.f23751d;
        Node<K, V> node4 = node3.f23750c;
        Node<K, V> node5 = node3.f23751d;
        node.f23751d = node4;
        if (node4 != null) {
            node4.f23749b = node;
        }
        m12887g(node, node3);
        node3.f23750c = node;
        node.f23749b = node3;
        int max = Math.max(node2 != null ? node2.f23756i : 0, node4 != null ? node4.f23756i : 0) + 1;
        node.f23756i = max;
        node3.f23756i = Math.max(max, node5 != null ? node5.f23756i : 0) + 1;
    }

    /* renamed from: i */
    public final void m12889i(Node<K, V> node) {
        Node<K, V> node2 = node.f23750c;
        Node<K, V> node3 = node.f23751d;
        Node<K, V> node4 = node2.f23750c;
        Node<K, V> node5 = node2.f23751d;
        node.f23750c = node5;
        if (node5 != null) {
            node5.f23749b = node;
        }
        m12887g(node, node2);
        node2.f23751d = node;
        node.f23749b = node2;
        int max = Math.max(node3 != null ? node3.f23756i : 0, node5 != null ? node5.f23756i : 0) + 1;
        node.f23756i = max;
        node2.f23756i = Math.max(max, node4 != null ? node4.f23756i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet keySet = this.f23742h;
        if (keySet != null) {
            return keySet;
        }
        LinkedTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.f23742h = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        Node<K, V> m12882a = m12882a(k2, true);
        V v2 = m12882a.f23755h;
        m12882a.f23755h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> m12884c = m12884c(obj);
        if (m12884c != null) {
            m12886f(m12884c, true);
        }
        if (m12884c != null) {
            return m12884c.f23755h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23738d;
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.f23738d = 0;
        this.f23739e = 0;
        this.f23740f = new Node<>();
        this.f23736b = comparator;
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public Node<K, V> f23749b;

        /* renamed from: c */
        public Node<K, V> f23750c;

        /* renamed from: d */
        public Node<K, V> f23751d;

        /* renamed from: e */
        public Node<K, V> f23752e;

        /* renamed from: f */
        public Node<K, V> f23753f;

        /* renamed from: g */
        public final K f23754g;

        /* renamed from: h */
        public V f23755h;

        /* renamed from: i */
        public int f23756i;

        public Node() {
            this.f23754g = null;
            this.f23753f = this;
            this.f23752e = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f23754g;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f23755h;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f23754g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23755h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f23754g;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f23755h;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f23755h;
            this.f23755h = v;
            return v2;
        }

        public String toString() {
            return this.f23754g + "=" + this.f23755h;
        }

        public Node(Node<K, V> node, K k2, Node<K, V> node2, Node<K, V> node3) {
            this.f23749b = node;
            this.f23754g = k2;
            this.f23756i = 1;
            this.f23752e = node2;
            this.f23753f = node3;
            node3.f23752e = this;
            node2.f23753f = this;
        }
    }
}
