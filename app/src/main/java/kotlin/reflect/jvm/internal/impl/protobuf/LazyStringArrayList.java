package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* renamed from: c */
    public static final LazyStringList f65679c = new UnmodifiableLazyStringList(new LazyStringArrayList());

    /* renamed from: b */
    public final List<Object> f65680b;

    public LazyStringArrayList() {
        this.f65680b = new ArrayList();
    }

    /* renamed from: a */
    public static String m33332a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).m33229D();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Internal.f65673a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: O0 */
    public ByteString mo33333O0(int i2) {
        ByteString literalByteString;
        Object obj = this.f65680b.get(i2);
        if (obj instanceof ByteString) {
            literalByteString = (ByteString) obj;
        } else if (obj instanceof String) {
            literalByteString = ByteString.m33225e((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            ByteString byteString = ByteString.f65623b;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            literalByteString = new LiteralByteString(bArr2);
        }
        if (literalByteString != obj) {
            this.f65680b.set(i2, literalByteString);
        }
        return literalByteString;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        this.f65680b.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f65680b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: e1 */
    public void mo33334e1(ByteString byteString) {
        this.f65680b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        String str;
        Object obj = this.f65680b.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            str = byteString.m33229D();
            if (byteString.mo33235t()) {
                this.f65680b.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = Internal.f65673a;
            try {
                str = new String(bArr, "UTF-8");
                if (Utf8.m33357d(bArr, 0, bArr.length)) {
                    this.f65680b.set(i2, str);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: m */
    public List<?> mo33335m() {
        return Collections.unmodifiableList(this.f65680b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: n */
    public LazyStringList mo33336n() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        Object remove = this.f65680b.remove(i2);
        ((AbstractList) this).modCount++;
        return m33332a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        return m33332a(this.f65680b.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f65680b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).mo33335m();
        }
        boolean addAll = this.f65680b.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f65680b = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }
}
