package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j */
    public static final Comparator<Comparable> f23706j = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: b */
    public Comparator<? super K> f23707b;

    /* renamed from: c */
    public Node<K, V>[] f23708c;

    /* renamed from: d */
    public final Node<K, V> f23709d;

    /* renamed from: e */
    public int f23710e;

    /* renamed from: f */
    public int f23711f;

    /* renamed from: g */
    public int f23712g;

    /* renamed from: h */
    public LinkedHashTreeMap<K, V>.EntrySet f23713h;

    /* renamed from: i */
    public LinkedHashTreeMap<K, V>.KeySet f23714i;

    public static final class AvlBuilder<K, V> {

        /* renamed from: a */
        public Node<K, V> f23715a;

        /* renamed from: b */
        public int f23716b;

        /* renamed from: c */
        public int f23717c;

        /* renamed from: d */
        public int f23718d;

        /* renamed from: a */
        public void m12878a(Node<K, V> node) {
            node.f23728d = null;
            node.f23726b = null;
            node.f23727c = null;
            node.f23734j = 1;
            int i2 = this.f23716b;
            if (i2 > 0) {
                int i3 = this.f23718d;
                if ((i3 & 1) == 0) {
                    this.f23718d = i3 + 1;
                    this.f23716b = i2 - 1;
                    this.f23717c++;
                }
            }
            node.f23726b = this.f23715a;
            this.f23715a = node;
            int i4 = this.f23718d + 1;
            this.f23718d = i4;
            int i5 = this.f23716b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f23718d = i4 + 1;
                this.f23716b = i5 - 1;
                this.f23717c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f23718d & i7) != i7) {
                    return;
                }
                int i8 = this.f23717c;
                if (i8 == 0) {
                    Node<K, V> node2 = this.f23715a;
                    Node<K, V> node3 = node2.f23726b;
                    Node<K, V> node4 = node3.f23726b;
                    node3.f23726b = node4.f23726b;
                    this.f23715a = node3;
                    node3.f23727c = node4;
                    node3.f23728d = node2;
                    node3.f23734j = node2.f23734j + 1;
                    node4.f23726b = node3;
                    node2.f23726b = node3;
                } else if (i8 == 1) {
                    Node<K, V> node5 = this.f23715a;
                    Node<K, V> node6 = node5.f23726b;
                    this.f23715a = node6;
                    node6.f23728d = node5;
                    node6.f23734j = node5.f23734j + 1;
                    node5.f23726b = node6;
                    this.f23717c = 0;
                } else if (i8 == 2) {
                    this.f23717c = 0;
                }
                i6 *= 2;
            }
        }

        /* renamed from: b */
        public void m12879b(int i2) {
            this.f23716b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f23718d = 0;
            this.f23717c = 0;
            this.f23715a = null;
        }
    }

    public static class AvlIterator<K, V> {

        /* renamed from: a */
        public Node<K, V> f23719a;

        /* renamed from: a */
        public Node<K, V> m12880a() {
            Node<K, V> node = this.f23719a;
            if (node == null) {
                return null;
            }
            Node<K, V> node2 = node.f23726b;
            node.f23726b = null;
            Node<K, V> node3 = node.f23728d;
            while (true) {
                Node<K, V> node4 = node2;
                node2 = node3;
                if (node2 == null) {
                    this.f23719a = node4;
                    return node;
                }
                node2.f23726b = node4;
                node3 = node2.f23727c;
            }
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.m12871b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>(this) { // from class: com.google.gson.internal.LinkedHashTreeMap.EntrySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public Object next() {
                    return m12881a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> m12871b;
            if (!(obj instanceof Map.Entry) || (m12871b = LinkedHashTreeMap.this.m12871b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.m12874f(m12871b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f23710e;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.m12872c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>(this) { // from class: com.google.gson.internal.LinkedHashTreeMap.KeySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m12881a().f23731g;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            Node<K, V> m12872c = linkedHashTreeMap.m12872c(obj);
            if (m12872c != null) {
                linkedHashTreeMap.m12874f(m12872c, true);
            }
            return m12872c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f23710e;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public Node<K, V> f23722b;

        /* renamed from: c */
        public Node<K, V> f23723c = null;

        /* renamed from: d */
        public int f23724d;

        public LinkedTreeMapIterator() {
            this.f23722b = LinkedHashTreeMap.this.f23709d.f23729e;
            this.f23724d = LinkedHashTreeMap.this.f23711f;
        }

        /* renamed from: a */
        public final Node<K, V> m12881a() {
            Node<K, V> node = this.f23722b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node == linkedHashTreeMap.f23709d) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f23711f != this.f23724d) {
                throw new ConcurrentModificationException();
            }
            this.f23722b = node.f23729e;
            this.f23723c = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23722b != LinkedHashTreeMap.this.f23709d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f23723c;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.m12874f(node, true);
            this.f23723c = null;
            this.f23724d = LinkedHashTreeMap.this.f23711f;
        }
    }

    public LinkedHashTreeMap() {
        this(f23706j);
    }

    /* renamed from: a */
    public Node<K, V> m12870a(K k2, boolean z) {
        Node<K, V> node;
        int i2;
        Node<K, V> node2;
        Node<K, V> node3;
        Node<K, V> node4;
        Comparator<? super K> comparator = this.f23707b;
        Node<K, V>[] nodeArr = this.f23708c;
        int hashCode = k2.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i4 = ((i3 >>> 7) ^ i3) ^ (i3 >>> 4);
        int length = i4 & (nodeArr.length - 1);
        Node<K, V> node5 = nodeArr[length];
        if (node5 != null) {
            Comparable comparable = comparator == f23706j ? (Comparable) k2 : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(node5.f23731g) : comparator.compare(k2, node5.f23731g);
                if (compareTo == 0) {
                    return node5;
                }
                Node<K, V> node6 = compareTo < 0 ? node5.f23727c : node5.f23728d;
                if (node6 == null) {
                    node = node5;
                    i2 = compareTo;
                    break;
                }
                node5 = node6;
            }
        } else {
            node = node5;
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node7 = this.f23709d;
        if (node != null) {
            Node<K, V> node8 = new Node<>(node, k2, i4, node7, node7.f23730f);
            if (i2 < 0) {
                node.f23727c = node8;
            } else {
                node.f23728d = node8;
            }
            m12873d(node, true);
            node2 = node8;
        } else {
            if (comparator == f23706j && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            node2 = new Node<>(node, k2, i4, node7, node7.f23730f);
            nodeArr[length] = node2;
        }
        int i5 = this.f23710e;
        this.f23710e = i5 + 1;
        if (i5 > this.f23712g) {
            Node<K, V>[] nodeArr2 = this.f23708c;
            int length2 = nodeArr2.length;
            int i6 = length2 * 2;
            Node<K, V>[] nodeArr3 = new Node[i6];
            AvlIterator avlIterator = new AvlIterator();
            AvlBuilder avlBuilder = new AvlBuilder();
            AvlBuilder avlBuilder2 = new AvlBuilder();
            for (int i7 = 0; i7 < length2; i7++) {
                Node<K, V> node9 = nodeArr2[i7];
                if (node9 != null) {
                    Node<K, V> node10 = null;
                    for (Node<K, V> node11 = node9; node11 != null; node11 = node11.f23727c) {
                        node11.f23726b = node10;
                        node10 = node11;
                    }
                    avlIterator.f23719a = node10;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        Node<K, V> m12880a = avlIterator.m12880a();
                        if (m12880a == null) {
                            break;
                        }
                        if ((m12880a.f23732h & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                    }
                    avlBuilder.m12879b(i8);
                    avlBuilder2.m12879b(i9);
                    Node<K, V> node12 = null;
                    while (node9 != null) {
                        node9.f23726b = node12;
                        Node<K, V> node13 = node9;
                        node9 = node9.f23727c;
                        node12 = node13;
                    }
                    avlIterator.f23719a = node12;
                    while (true) {
                        Node<K, V> m12880a2 = avlIterator.m12880a();
                        if (m12880a2 == null) {
                            break;
                        }
                        if ((m12880a2.f23732h & length2) == 0) {
                            avlBuilder.m12878a(m12880a2);
                        } else {
                            avlBuilder2.m12878a(m12880a2);
                        }
                    }
                    if (i8 > 0) {
                        node3 = avlBuilder.f23715a;
                        if (node3.f23726b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        node3 = null;
                    }
                    nodeArr3[i7] = node3;
                    int i10 = i7 + length2;
                    if (i9 > 0) {
                        node4 = avlBuilder2.f23715a;
                        if (node4.f23726b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        node4 = null;
                    }
                    nodeArr3[i10] = node4;
                }
            }
            this.f23708c = nodeArr3;
            this.f23712g = (i6 / 4) + (i6 / 2);
        }
        this.f23711f++;
        return node2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> m12871b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r4.m12872c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f23733i
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.m12871b(java.util.Map$Entry):com.google.gson.internal.LinkedHashTreeMap$Node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public Node<K, V> m12872c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m12870a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f23708c, (Object) null);
        this.f23710e = 0;
        this.f23711f++;
        Node<K, V> node = this.f23709d;
        Node<K, V> node2 = node.f23729e;
        while (node2 != node) {
            Node<K, V> node3 = node2.f23729e;
            node2.f23730f = null;
            node2.f23729e = null;
            node2 = node3;
        }
        node.f23730f = node;
        node.f23729e = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m12872c(obj) != null;
    }

    /* renamed from: d */
    public final void m12873d(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f23727c;
            Node<K, V> node3 = node.f23728d;
            int i2 = node2 != null ? node2.f23734j : 0;
            int i3 = node3 != null ? node3.f23734j : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node<K, V> node4 = node3.f23727c;
                Node<K, V> node5 = node3.f23728d;
                int i5 = (node4 != null ? node4.f23734j : 0) - (node5 != null ? node5.f23734j : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    m12876h(node);
                } else {
                    m12877i(node3);
                    m12876h(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node<K, V> node6 = node2.f23727c;
                Node<K, V> node7 = node2.f23728d;
                int i6 = (node6 != null ? node6.f23734j : 0) - (node7 != null ? node7.f23734j : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    m12877i(node);
                } else {
                    m12876h(node2);
                    m12877i(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.f23734j = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.f23734j = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f23726b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet = this.f23713h;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.f23713h = entrySet2;
        return entrySet2;
    }

    /* renamed from: f */
    public void m12874f(Node<K, V> node, boolean z) {
        Node<K, V> node2;
        Node<K, V> node3;
        int i2;
        if (z) {
            Node<K, V> node4 = node.f23730f;
            node4.f23729e = node.f23729e;
            node.f23729e.f23730f = node4;
            node.f23730f = null;
            node.f23729e = null;
        }
        Node<K, V> node5 = node.f23727c;
        Node<K, V> node6 = node.f23728d;
        Node<K, V> node7 = node.f23726b;
        int i3 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                m12875g(node, node5);
                node.f23727c = null;
            } else if (node6 != null) {
                m12875g(node, node6);
                node.f23728d = null;
            } else {
                m12875g(node, null);
            }
            m12873d(node7, false);
            this.f23710e--;
            this.f23711f++;
            return;
        }
        if (node5.f23734j > node6.f23734j) {
            Node<K, V> node8 = node5.f23728d;
            while (true) {
                Node<K, V> node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.f23728d;
                }
            }
        } else {
            Node<K, V> node10 = node6.f23727c;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.f23727c;
                }
            }
            node3 = node2;
        }
        m12874f(node3, false);
        Node<K, V> node11 = node.f23727c;
        if (node11 != null) {
            i2 = node11.f23734j;
            node3.f23727c = node11;
            node11.f23726b = node3;
            node.f23727c = null;
        } else {
            i2 = 0;
        }
        Node<K, V> node12 = node.f23728d;
        if (node12 != null) {
            i3 = node12.f23734j;
            node3.f23728d = node12;
            node12.f23726b = node3;
            node.f23728d = null;
        }
        node3.f23734j = Math.max(i2, i3) + 1;
        m12875g(node, node3);
    }

    /* renamed from: g */
    public final void m12875g(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f23726b;
        node.f23726b = null;
        if (node2 != null) {
            node2.f23726b = node3;
        }
        if (node3 == null) {
            int i2 = node.f23732h;
            this.f23708c[i2 & (r0.length - 1)] = node2;
        } else if (node3.f23727c == node) {
            node3.f23727c = node2;
        } else {
            node3.f23728d = node2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> m12872c = m12872c(obj);
        if (m12872c != null) {
            return m12872c.f23733i;
        }
        return null;
    }

    /* renamed from: h */
    public final void m12876h(Node<K, V> node) {
        Node<K, V> node2 = node.f23727c;
        Node<K, V> node3 = node.f23728d;
        Node<K, V> node4 = node3.f23727c;
        Node<K, V> node5 = node3.f23728d;
        node.f23728d = node4;
        if (node4 != null) {
            node4.f23726b = node;
        }
        m12875g(node, node3);
        node3.f23727c = node;
        node.f23726b = node3;
        int max = Math.max(node2 != null ? node2.f23734j : 0, node4 != null ? node4.f23734j : 0) + 1;
        node.f23734j = max;
        node3.f23734j = Math.max(max, node5 != null ? node5.f23734j : 0) + 1;
    }

    /* renamed from: i */
    public final void m12877i(Node<K, V> node) {
        Node<K, V> node2 = node.f23727c;
        Node<K, V> node3 = node.f23728d;
        Node<K, V> node4 = node2.f23727c;
        Node<K, V> node5 = node2.f23728d;
        node.f23727c = node5;
        if (node5 != null) {
            node5.f23726b = node;
        }
        m12875g(node, node2);
        node2.f23728d = node;
        node.f23726b = node2;
        int max = Math.max(node3 != null ? node3.f23734j : 0, node5 != null ? node5.f23734j : 0) + 1;
        node.f23734j = max;
        node2.f23734j = Math.max(max, node4 != null ? node4.f23734j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet = this.f23714i;
        if (keySet != null) {
            return keySet;
        }
        LinkedHashTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.f23714i = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        Node<K, V> m12870a = m12870a(k2, true);
        V v2 = m12870a.f23733i;
        m12870a.f23733i = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> m12872c = m12872c(obj);
        if (m12872c != null) {
            m12874f(m12872c, true);
        }
        if (m12872c != null) {
            return m12872c.f23733i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23710e;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f23710e = 0;
        this.f23711f = 0;
        this.f23707b = comparator;
        this.f23709d = new Node<>();
        this.f23708c = new Node[16];
        this.f23712g = 12;
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public Node<K, V> f23726b;

        /* renamed from: c */
        public Node<K, V> f23727c;

        /* renamed from: d */
        public Node<K, V> f23728d;

        /* renamed from: e */
        public Node<K, V> f23729e;

        /* renamed from: f */
        public Node<K, V> f23730f;

        /* renamed from: g */
        public final K f23731g;

        /* renamed from: h */
        public final int f23732h;

        /* renamed from: i */
        public V f23733i;

        /* renamed from: j */
        public int f23734j;

        public Node() {
            this.f23731g = null;
            this.f23732h = -1;
            this.f23730f = this;
            this.f23729e = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f23731g;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f23733i;
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
            return this.f23731g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23733i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f23731g;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f23733i;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f23733i;
            this.f23733i = v;
            return v2;
        }

        public String toString() {
            return this.f23731g + "=" + this.f23733i;
        }

        public Node(Node<K, V> node, K k2, int i2, Node<K, V> node2, Node<K, V> node3) {
            this.f23726b = node;
            this.f23731g = k2;
            this.f23732h = i2;
            this.f23734j = 1;
            this.f23729e = node2;
            this.f23730f = node3;
            node3.f23729e = this;
            node2.f23730f = this;
        }
    }
}
