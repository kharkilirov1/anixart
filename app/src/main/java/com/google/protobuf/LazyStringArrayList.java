package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* renamed from: d */
    public static final /* synthetic */ int f24249d = 0;

    /* renamed from: c */
    public final List<Object> f24250c;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, Object obj) {
            LazyStringArrayList.m13469d(null, i2, (byte[]) obj);
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.f24249d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, Object obj) {
            LazyStringArrayList.m13470e(null, i2, (ByteString) obj);
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            int i3 = LazyStringArrayList.f24249d;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList(10).f23951b = false;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* renamed from: d */
    public static void m13469d(LazyStringArrayList lazyStringArrayList, int i2, byte[] bArr) {
        throw null;
    }

    /* renamed from: e */
    public static void m13470e(LazyStringArrayList lazyStringArrayList, int i2, ByteString byteString) {
        throw null;
    }

    /* renamed from: f */
    public static String m13471f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            return new String((byte[]) obj, Internal.f24211b);
        }
        ByteString byteString = (ByteString) obj;
        Objects.requireNonNull(byteString);
        return byteString.size() == 0 ? "" : byteString.mo13155E(Internal.f24211b);
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList mo13144N(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f24250c);
        return new LazyStringArrayList((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: Q */
    public void mo13472Q(ByteString byteString) {
        m12987b();
        this.f24250c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: Z0 */
    public Object mo13473Z0(int i2) {
        return this.f24250c.get(i2);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        m12987b();
        this.f24250c.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m12987b();
        this.f24250c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        m12987b();
        Object remove = this.f24250c.remove(i2);
        ((AbstractList) this).modCount++;
        return m13471f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        String str;
        Object obj = this.f24250c.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            Objects.requireNonNull(byteString);
            str = byteString.size() == 0 ? "" : byteString.mo13155E(Internal.f24211b);
            if (byteString.mo13164x()) {
                this.f24250c.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, Internal.f24211b);
            if (Utf8.f24397a.mo13747f(0, bArr, 0, bArr.length) == 0) {
                this.f24250c.set(i2, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: m */
    public List<?> mo13475m() {
        return Collections.unmodifiableList(this.f24250c);
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: n */
    public LazyStringList mo13476n() {
        return this.f23951b ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        m12987b();
        return m13471f(this.f24250c.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24250c.size();
    }

    public LazyStringArrayList(int i2) {
        this.f24250c = new ArrayList(i2);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        m12987b();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).mo13475m();
        }
        boolean addAll = this.f24250c.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public LazyStringArrayList(ArrayList<Object> arrayList) {
        this.f24250c = arrayList;
    }
}
