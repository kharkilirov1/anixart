package io.grpc;

import p000a.C0000a;

/* loaded from: classes3.dex */
final class PersistentHashArrayMappedTrie {

    public static final class CollisionLeaf<K, V> implements Node<K, V> {

        /* renamed from: a */
        public final K[] f58258a;

        /* renamed from: b */
        public final V[] f58259b;

        public String toString() {
            StringBuilder m24u = C0000a.m24u("CollisionLeaf(");
            for (int i2 = 0; i2 < this.f58259b.length; i2++) {
                m24u.append("(key=");
                m24u.append(this.f58258a[i2]);
                m24u.append(" value=");
                m24u.append(this.f58259b[i2]);
                m24u.append(") ");
            }
            m24u.append(")");
            return m24u.toString();
        }
    }

    public static final class CompressedIndex<K, V> implements Node<K, V> {

        /* renamed from: a */
        public final int f58260a;

        /* renamed from: b */
        public final Node<K, V>[] f58261b;

        public String toString() {
            StringBuilder m24u = C0000a.m24u("CompressedIndex(");
            m24u.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f58260a)));
            for (Node<K, V> node : this.f58261b) {
                m24u.append(node);
                m24u.append(" ");
            }
            m24u.append(")");
            return m24u.toString();
        }
    }

    public static final class Leaf<K, V> implements Node<K, V> {

        /* renamed from: a */
        public final K f58262a;

        /* renamed from: b */
        public final V f58263b;

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f58262a, this.f58263b);
        }
    }

    public interface Node<K, V> {
    }
}
