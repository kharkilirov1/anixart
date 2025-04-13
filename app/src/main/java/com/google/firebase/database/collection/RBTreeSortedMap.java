package com.google.firebase.database.collection;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.LLRBNode;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class RBTreeSortedMap<K, V> extends ImmutableSortedMap<K, V> {

    /* renamed from: b */
    public LLRBNode<K, V> f22555b;

    /* renamed from: c */
    public Comparator<K> f22556c;

    public static class Builder<A, B, C> {

        /* renamed from: a */
        public final List<A> f22557a;

        /* renamed from: b */
        public final Map<B, C> f22558b;

        /* renamed from: c */
        public final ImmutableSortedMap.Builder.KeyTranslator<A, B> f22559c;

        /* renamed from: d */
        public LLRBValueNode<A, C> f22560d;

        /* renamed from: e */
        public LLRBValueNode<A, C> f22561e;

        public static class Base1_2 implements Iterable<BooleanChunk> {

            /* renamed from: b */
            public long f22562b;

            /* renamed from: c */
            public final int f22563c;

            /* renamed from: com.google.firebase.database.collection.RBTreeSortedMap$Builder$Base1_2$1 */
            public class C20691 implements Iterator<BooleanChunk> {

                /* renamed from: b */
                public int f22564b;

                public C20691() {
                    this.f22564b = Base1_2.this.f22563c - 1;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f22564b >= 0;
                }

                @Override // java.util.Iterator
                public BooleanChunk next() {
                    long j2 = Base1_2.this.f22562b;
                    int i2 = this.f22564b;
                    long j3 = j2 & (1 << i2);
                    BooleanChunk booleanChunk = new BooleanChunk();
                    booleanChunk.f22566a = j3 == 0;
                    booleanChunk.f22567b = (int) Math.pow(2.0d, i2);
                    this.f22564b--;
                    return booleanChunk;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public Base1_2(int i2) {
                int i3 = i2 + 1;
                int floor = (int) Math.floor(Math.log(i3) / Math.log(2.0d));
                this.f22563c = floor;
                this.f22562b = (((long) Math.pow(2.0d, floor)) - 1) & i3;
            }

            @Override // java.lang.Iterable
            public Iterator<BooleanChunk> iterator() {
                return new C20691();
            }
        }

        public static class BooleanChunk {

            /* renamed from: a */
            public boolean f22566a;

            /* renamed from: b */
            public int f22567b;
        }

        public Builder(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator) {
            this.f22557a = list;
            this.f22558b = map;
            this.f22559c = keyTranslator;
        }

        /* renamed from: b */
        public static <A, B, C> RBTreeSortedMap<A, C> m12356b(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
            LLRBNode.Color color = LLRBNode.Color.BLACK;
            Builder builder = new Builder(list, map, keyTranslator);
            Collections.sort(list, comparator);
            Base1_2.C20691 c20691 = new Base1_2(list.size()).new C20691();
            int size = list.size();
            while (c20691.hasNext()) {
                BooleanChunk booleanChunk = (BooleanChunk) c20691.next();
                int i2 = booleanChunk.f22567b;
                size -= i2;
                if (booleanChunk.f22566a) {
                    builder.m12358c(color, i2, size);
                } else {
                    builder.m12358c(color, i2, size);
                    int i3 = booleanChunk.f22567b;
                    size -= i3;
                    builder.m12358c(LLRBNode.Color.RED, i3, size);
                }
            }
            LLRBNode lLRBNode = builder.f22560d;
            if (lLRBNode == null) {
                lLRBNode = LLRBEmptyNode.f22547a;
            }
            return new RBTreeSortedMap<>(lLRBNode, comparator, null);
        }

        /* renamed from: a */
        public final LLRBNode<A, C> m12357a(int i2, int i3) {
            if (i3 == 0) {
                return LLRBEmptyNode.f22547a;
            }
            if (i3 == 1) {
                A a2 = this.f22557a.get(i2);
                return new LLRBBlackValueNode(a2, m12359d(a2), null, null);
            }
            int i4 = i3 / 2;
            int i5 = i2 + i4;
            LLRBNode<A, C> m12357a = m12357a(i2, i4);
            LLRBNode<A, C> m12357a2 = m12357a(i5 + 1, i4);
            A a3 = this.f22557a.get(i5);
            return new LLRBBlackValueNode(a3, m12359d(a3), m12357a, m12357a2);
        }

        /* renamed from: c */
        public final void m12358c(LLRBNode.Color color, int i2, int i3) {
            LLRBNode<A, C> m12357a = m12357a(i3 + 1, i2 - 1);
            A a2 = this.f22557a.get(i3);
            LLRBValueNode<A, C> lLRBRedValueNode = color == LLRBNode.Color.RED ? new LLRBRedValueNode<>(a2, m12359d(a2), null, m12357a) : new LLRBBlackValueNode<>(a2, m12359d(a2), null, m12357a);
            if (this.f22560d == null) {
                this.f22560d = lLRBRedValueNode;
                this.f22561e = lLRBRedValueNode;
            } else {
                this.f22561e.mo12353c(lLRBRedValueNode);
                this.f22561e = lLRBRedValueNode;
            }
        }

        /* renamed from: d */
        public final C m12359d(A a2) {
            return this.f22558b.get(this.f22559c.mo7341f(a2));
        }
    }

    public RBTreeSortedMap(LLRBNode lLRBNode, Comparator comparator, C20681 c20681) {
        this.f22555b = lLRBNode;
        this.f22556c = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    /* renamed from: b */
    public Comparator<K> mo12352b() {
        return this.f22556c;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new ImmutableSortedMapIterator(this.f22555b, null, this.f22556c, false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.f22555b.size();
    }
}
