package com.airbnb.lottie.parser.moshi;

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

/* loaded from: classes.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j */
    public static final Comparator<Comparable> f7802j = new Comparator<Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: h */
    public LinkedHashTreeMap<K, V>.EntrySet f7809h;

    /* renamed from: i */
    public LinkedHashTreeMap<K, V>.KeySet f7810i;

    /* renamed from: e */
    public int f7806e = 0;

    /* renamed from: f */
    public int f7807f = 0;

    /* renamed from: b */
    public Comparator<? super K> f7803b = f7802j;

    /* renamed from: d */
    public final Node<K, V> f7805d = new Node<>();

    /* renamed from: c */
    public Node<K, V>[] f7804c = new Node[16];

    /* renamed from: g */
    public int f7808g = 12;

    public static final class AvlBuilder<K, V> {

        /* renamed from: a */
        public Node<K, V> f7811a;

        /* renamed from: b */
        public int f7812b;

        /* renamed from: c */
        public int f7813c;

        /* renamed from: d */
        public int f7814d;

        /* renamed from: a */
        public void m4823a(Node<K, V> node) {
            node.f7824d = null;
            node.f7822b = null;
            node.f7823c = null;
            node.f7830j = 1;
            int i2 = this.f7812b;
            if (i2 > 0) {
                int i3 = this.f7814d;
                if ((i3 & 1) == 0) {
                    this.f7814d = i3 + 1;
                    this.f7812b = i2 - 1;
                    this.f7813c++;
                }
            }
            node.f7822b = this.f7811a;
            this.f7811a = node;
            int i4 = this.f7814d + 1;
            this.f7814d = i4;
            int i5 = this.f7812b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f7814d = i4 + 1;
                this.f7812b = i5 - 1;
                this.f7813c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f7814d & i7) != i7) {
                    return;
                }
                int i8 = this.f7813c;
                if (i8 == 0) {
                    Node<K, V> node2 = this.f7811a;
                    Node<K, V> node3 = node2.f7822b;
                    Node<K, V> node4 = node3.f7822b;
                    node3.f7822b = node4.f7822b;
                    this.f7811a = node3;
                    node3.f7823c = node4;
                    node3.f7824d = node2;
                    node3.f7830j = node2.f7830j + 1;
                    node4.f7822b = node3;
                    node2.f7822b = node3;
                } else if (i8 == 1) {
                    Node<K, V> node5 = this.f7811a;
                    Node<K, V> node6 = node5.f7822b;
                    this.f7811a = node6;
                    node6.f7824d = node5;
                    node6.f7830j = node5.f7830j + 1;
                    node5.f7822b = node6;
                    this.f7813c = 0;
                } else if (i8 == 2) {
                    this.f7813c = 0;
                }
                i6 *= 2;
            }
        }

        /* renamed from: b */
        public void m4824b(int i2) {
            this.f7812b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f7814d = 0;
            this.f7813c = 0;
            this.f7811a = null;
        }
    }

    public static class AvlIterator<K, V> {

        /* renamed from: a */
        public Node<K, V> f7815a;

        /* renamed from: a */
        public Node<K, V> m4825a() {
            Node<K, V> node = this.f7815a;
            if (node == null) {
                return null;
            }
            Node<K, V> node2 = node.f7822b;
            node.f7822b = null;
            Node<K, V> node3 = node.f7824d;
            while (true) {
                Node<K, V> node4 = node2;
                node2 = node3;
                if (node2 == null) {
                    this.f7815a = node4;
                    return node;
                }
                node2.f7822b = node4;
                node3 = node2.f7823c;
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
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.m4816b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>(this) { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.EntrySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public Object next() {
                    return m4826a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> m4816b;
            if (!(obj instanceof Map.Entry) || (m4816b = LinkedHashTreeMap.this.m4816b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.m4819f(m4816b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f7806e;
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
            return LinkedHashTreeMap.this.m4817c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>(this) { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.KeySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m4826a().f7827g;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            Node<K, V> m4817c = linkedHashTreeMap.m4817c(obj);
            if (m4817c != null) {
                linkedHashTreeMap.m4819f(m4817c, true);
            }
            return m4817c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f7806e;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public Node<K, V> f7818b;

        /* renamed from: c */
        public Node<K, V> f7819c = null;

        /* renamed from: d */
        public int f7820d;

        public LinkedTreeMapIterator() {
            this.f7818b = LinkedHashTreeMap.this.f7805d.f7825e;
            this.f7820d = LinkedHashTreeMap.this.f7807f;
        }

        /* renamed from: a */
        public final Node<K, V> m4826a() {
            Node<K, V> node = this.f7818b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node == linkedHashTreeMap.f7805d) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f7807f != this.f7820d) {
                throw new ConcurrentModificationException();
            }
            this.f7818b = node.f7825e;
            this.f7819c = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7818b != LinkedHashTreeMap.this.f7805d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f7819c;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.m4819f(node, true);
            this.f7819c = null;
            this.f7820d = LinkedHashTreeMap.this.f7807f;
        }
    }

    /* renamed from: a */
    public Node<K, V> m4815a(K k2, boolean z) {
        Node<K, V> node;
        int i2;
        Node<K, V> node2;
        Node<K, V> node3;
        Node<K, V> node4;
        Comparator<? super K> comparator = this.f7803b;
        Node<K, V>[] nodeArr = this.f7804c;
        int hashCode = k2.hashCode();
        int i3 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i4 = ((i3 >>> 7) ^ i3) ^ (i3 >>> 4);
        int length = i4 & (nodeArr.length - 1);
        Node<K, V> node5 = nodeArr[length];
        if (node5 != null) {
            Comparable comparable = comparator == f7802j ? (Comparable) k2 : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(node5.f7827g) : comparator.compare(k2, node5.f7827g);
                if (compareTo == 0) {
                    return node5;
                }
                Node<K, V> node6 = compareTo < 0 ? node5.f7823c : node5.f7824d;
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
        Node<K, V> node7 = this.f7805d;
        if (node != null) {
            Node<K, V> node8 = new Node<>(node, k2, i4, node7, node7.f7826f);
            if (i2 < 0) {
                node.f7823c = node8;
            } else {
                node.f7824d = node8;
            }
            m4818d(node, true);
            node2 = node8;
        } else {
            if (comparator == f7802j && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            node2 = new Node<>(node, k2, i4, node7, node7.f7826f);
            nodeArr[length] = node2;
        }
        int i5 = this.f7806e;
        this.f7806e = i5 + 1;
        if (i5 > this.f7808g) {
            Node<K, V>[] nodeArr2 = this.f7804c;
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
                    for (Node<K, V> node11 = node9; node11 != null; node11 = node11.f7823c) {
                        node11.f7822b = node10;
                        node10 = node11;
                    }
                    avlIterator.f7815a = node10;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        Node<K, V> m4825a = avlIterator.m4825a();
                        if (m4825a == null) {
                            break;
                        }
                        if ((m4825a.f7828h & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                    }
                    avlBuilder.m4824b(i8);
                    avlBuilder2.m4824b(i9);
                    Node<K, V> node12 = null;
                    while (node9 != null) {
                        node9.f7822b = node12;
                        Node<K, V> node13 = node9;
                        node9 = node9.f7823c;
                        node12 = node13;
                    }
                    avlIterator.f7815a = node12;
                    while (true) {
                        Node<K, V> m4825a2 = avlIterator.m4825a();
                        if (m4825a2 == null) {
                            break;
                        }
                        if ((m4825a2.f7828h & length2) == 0) {
                            avlBuilder.m4823a(m4825a2);
                        } else {
                            avlBuilder2.m4823a(m4825a2);
                        }
                    }
                    if (i8 > 0) {
                        node3 = avlBuilder.f7811a;
                        if (node3.f7822b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        node3 = null;
                    }
                    nodeArr3[i7] = node3;
                    int i10 = i7 + length2;
                    if (i9 > 0) {
                        node4 = avlBuilder2.f7811a;
                        if (node4.f7822b != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        node4 = null;
                    }
                    nodeArr3[i10] = node4;
                }
            }
            this.f7804c = nodeArr3;
            this.f7808g = (i6 / 4) + (i6 / 2);
        }
        this.f7807f++;
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
    public com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> m4816b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$Node r0 = r4.m4817c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f7829i
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.m4816b(java.util.Map$Entry):com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$Node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public Node<K, V> m4817c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m4815a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f7804c, (Object) null);
        this.f7806e = 0;
        this.f7807f++;
        Node<K, V> node = this.f7805d;
        Node<K, V> node2 = node.f7825e;
        while (node2 != node) {
            Node<K, V> node3 = node2.f7825e;
            node2.f7826f = null;
            node2.f7825e = null;
            node2 = node3;
        }
        node.f7826f = node;
        node.f7825e = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m4817c(obj) != null;
    }

    /* renamed from: d */
    public final void m4818d(Node<K, V> node, boolean z) {
        while (node != null) {
            Node<K, V> node2 = node.f7823c;
            Node<K, V> node3 = node.f7824d;
            int i2 = node2 != null ? node2.f7830j : 0;
            int i3 = node3 != null ? node3.f7830j : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node<K, V> node4 = node3.f7823c;
                Node<K, V> node5 = node3.f7824d;
                int i5 = (node4 != null ? node4.f7830j : 0) - (node5 != null ? node5.f7830j : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    m4821h(node);
                } else {
                    m4822i(node3);
                    m4821h(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node<K, V> node6 = node2.f7823c;
                Node<K, V> node7 = node2.f7824d;
                int i6 = (node6 != null ? node6.f7830j : 0) - (node7 != null ? node7.f7830j : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    m4822i(node);
                } else {
                    m4821h(node2);
                    m4822i(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.f7830j = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.f7830j = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f7822b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet = this.f7809h;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.f7809h = entrySet2;
        return entrySet2;
    }

    /* renamed from: f */
    public void m4819f(Node<K, V> node, boolean z) {
        Node<K, V> node2;
        Node<K, V> node3;
        int i2;
        if (z) {
            Node<K, V> node4 = node.f7826f;
            node4.f7825e = node.f7825e;
            node.f7825e.f7826f = node4;
            node.f7826f = null;
            node.f7825e = null;
        }
        Node<K, V> node5 = node.f7823c;
        Node<K, V> node6 = node.f7824d;
        Node<K, V> node7 = node.f7822b;
        int i3 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                m4820g(node, node5);
                node.f7823c = null;
            } else if (node6 != null) {
                m4820g(node, node6);
                node.f7824d = null;
            } else {
                m4820g(node, null);
            }
            m4818d(node7, false);
            this.f7806e--;
            this.f7807f++;
            return;
        }
        if (node5.f7830j > node6.f7830j) {
            Node<K, V> node8 = node5.f7824d;
            while (true) {
                Node<K, V> node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.f7824d;
                }
            }
        } else {
            Node<K, V> node10 = node6.f7823c;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.f7823c;
                }
            }
            node3 = node2;
        }
        m4819f(node3, false);
        Node<K, V> node11 = node.f7823c;
        if (node11 != null) {
            i2 = node11.f7830j;
            node3.f7823c = node11;
            node11.f7822b = node3;
            node.f7823c = null;
        } else {
            i2 = 0;
        }
        Node<K, V> node12 = node.f7824d;
        if (node12 != null) {
            i3 = node12.f7830j;
            node3.f7824d = node12;
            node12.f7822b = node3;
            node.f7824d = null;
        }
        node3.f7830j = Math.max(i2, i3) + 1;
        m4820g(node, node3);
    }

    /* renamed from: g */
    public final void m4820g(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f7822b;
        node.f7822b = null;
        if (node2 != null) {
            node2.f7822b = node3;
        }
        if (node3 == null) {
            int i2 = node.f7828h;
            this.f7804c[i2 & (r0.length - 1)] = node2;
        } else if (node3.f7823c == node) {
            node3.f7823c = node2;
        } else {
            node3.f7824d = node2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> m4817c = m4817c(obj);
        if (m4817c != null) {
            return m4817c.f7829i;
        }
        return null;
    }

    /* renamed from: h */
    public final void m4821h(Node<K, V> node) {
        Node<K, V> node2 = node.f7823c;
        Node<K, V> node3 = node.f7824d;
        Node<K, V> node4 = node3.f7823c;
        Node<K, V> node5 = node3.f7824d;
        node.f7824d = node4;
        if (node4 != null) {
            node4.f7822b = node;
        }
        m4820g(node, node3);
        node3.f7823c = node;
        node.f7822b = node3;
        int max = Math.max(node2 != null ? node2.f7830j : 0, node4 != null ? node4.f7830j : 0) + 1;
        node.f7830j = max;
        node3.f7830j = Math.max(max, node5 != null ? node5.f7830j : 0) + 1;
    }

    /* renamed from: i */
    public final void m4822i(Node<K, V> node) {
        Node<K, V> node2 = node.f7823c;
        Node<K, V> node3 = node.f7824d;
        Node<K, V> node4 = node2.f7823c;
        Node<K, V> node5 = node2.f7824d;
        node.f7823c = node5;
        if (node5 != null) {
            node5.f7822b = node;
        }
        m4820g(node, node2);
        node2.f7824d = node;
        node.f7822b = node2;
        int max = Math.max(node3 != null ? node3.f7830j : 0, node5 != null ? node5.f7830j : 0) + 1;
        node.f7830j = max;
        node2.f7830j = Math.max(max, node4 != null ? node4.f7830j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet = this.f7810i;
        if (keySet != null) {
            return keySet;
        }
        LinkedHashTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.f7810i = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        Node<K, V> m4815a = m4815a(k2, true);
        V v2 = m4815a.f7829i;
        m4815a.f7829i = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> m4817c = m4817c(obj);
        if (m4817c != null) {
            m4819f(m4817c, true);
        }
        if (m4817c != null) {
            return m4817c.f7829i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7806e;
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public Node<K, V> f7822b;

        /* renamed from: c */
        public Node<K, V> f7823c;

        /* renamed from: d */
        public Node<K, V> f7824d;

        /* renamed from: e */
        public Node<K, V> f7825e;

        /* renamed from: f */
        public Node<K, V> f7826f;

        /* renamed from: g */
        public final K f7827g;

        /* renamed from: h */
        public final int f7828h;

        /* renamed from: i */
        public V f7829i;

        /* renamed from: j */
        public int f7830j;

        public Node() {
            this.f7827g = null;
            this.f7828h = -1;
            this.f7826f = this;
            this.f7825e = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f7827g;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f7829i;
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
            return this.f7827g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7829i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f7827g;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f7829i;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f7829i;
            this.f7829i = v;
            return v2;
        }

        public String toString() {
            return this.f7827g + "=" + this.f7829i;
        }

        public Node(Node<K, V> node, K k2, int i2, Node<K, V> node2, Node<K, V> node3) {
            this.f7822b = node;
            this.f7827g = k2;
            this.f7828h = i2;
            this.f7830j = 1;
            this.f7825e = node2;
            this.f7826f = node3;
            node3.f7825e = this;
            node2.f7826f = this;
        }
    }
}
