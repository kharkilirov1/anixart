package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Internal {

    /* renamed from: a */
    public static final Charset f24210a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f24211b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final byte[] f24212c;

    /* renamed from: d */
    public static final ByteBuffer f24213d;

    public interface BooleanList extends ProtobufList<Boolean> {
    }

    public interface DoubleList extends ProtobufList<Double> {
    }

    public interface EnumLite {
        /* renamed from: x */
        int mo11028x();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        /* renamed from: a */
        T mo11029a(int i2);
    }

    public interface EnumVerifier {
        /* renamed from: a */
        boolean mo11030a(int i2);
    }

    public interface FloatList extends ProtobufList<Float> {
    }

    public interface IntList extends ProtobufList<Integer> {
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {

        public interface Converter<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public interface LongList extends ProtobufList<Long> {
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: b */
        public static final /* synthetic */ int f24214b = 0;

        /* renamed from: com.google.protobuf.Internal$MapAdapter$1 */
        final class C23791 implements Converter<Integer, EnumLite> {
        }

        public interface Converter<A, B> {
        }

        public class EntryAdapter implements Map.Entry<K, V> {

            /* renamed from: b */
            public final Map.Entry<K, RealValue> f24215b;

            public EntryAdapter(Map.Entry<K, RealValue> entry) {
                this.f24215b = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f24215b.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                MapAdapter mapAdapter = MapAdapter.this;
                int i2 = MapAdapter.f24214b;
                Objects.requireNonNull(mapAdapter);
                this.f24215b.getValue();
                throw null;
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f24215b.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v) {
                MapAdapter mapAdapter = MapAdapter.this;
                int i2 = MapAdapter.f24214b;
                Objects.requireNonNull(mapAdapter);
                throw null;
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {

            /* renamed from: b */
            public final Iterator<Map.Entry<K, RealValue>> f24217b;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> it) {
                this.f24217b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f24217b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return new EntryAdapter(this.f24217b.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f24217b.remove();
            }
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: b */
            public final Set<Map.Entry<K, RealValue>> f24219b;

            /* renamed from: c */
            public final /* synthetic */ MapAdapter f24220c;

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.f24219b.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f24219b.size();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
            throw null;
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        /* renamed from: N */
        ProtobufList<E> mo13144N(int i2);

        /* renamed from: j1 */
        boolean mo12988j1();

        /* renamed from: q */
        void mo12989q();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f24212c = bArr;
        f24213d = ByteBuffer.wrap(bArr);
        CodedInputStream.m13174g(bArr, 0, 0);
    }

    /* renamed from: a */
    public static int m13453a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m13454b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: c */
    public static Object m13455c(Object obj, Object obj2) {
        return ((MessageLite) obj).mo13429b().mo12982F0((MessageLite) obj2).mo13438K0();
    }
}
