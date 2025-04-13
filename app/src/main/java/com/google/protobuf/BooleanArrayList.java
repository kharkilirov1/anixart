package com.google.protobuf;

import androidx.room.util.C0576a;
import com.google.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: c */
    public boolean[] f23979c;

    /* renamed from: d */
    public int f23980d;

    static {
        new BooleanArrayList(new boolean[0], 0).f23951b = false;
    }

    public BooleanArrayList() {
        this.f23979c = new boolean[10];
        this.f23980d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList<Boolean> mo13144N(int i2) {
        if (i2 >= this.f23980d) {
            return new BooleanArrayList(Arrays.copyOf(this.f23979c, i2), this.f23980d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m12987b();
        if (i2 < 0 || i2 > (i3 = this.f23980d)) {
            throw new IndexOutOfBoundsException(m13148g(i2));
        }
        boolean[] zArr = this.f23979c;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f23979c, i2, zArr2, i2 + 1, this.f23980d - i2);
            this.f23979c = zArr2;
        }
        this.f23979c[i2] = booleanValue;
        this.f23980d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m12987b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.f23980d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f23980d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f23979c;
        if (i4 > zArr.length) {
            this.f23979c = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(booleanArrayList.f23979c, 0, this.f23979c, this.f23980d, booleanArrayList.f23980d);
        this.f23980d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void m13145d(boolean z) {
        m12987b();
        int i2 = this.f23980d;
        boolean[] zArr = this.f23979c;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f23979c = zArr2;
        }
        boolean[] zArr3 = this.f23979c;
        int i3 = this.f23980d;
        this.f23980d = i3 + 1;
        zArr3[i3] = z;
    }

    /* renamed from: e */
    public final void m13146e(int i2) {
        if (i2 < 0 || i2 >= this.f23980d) {
            throw new IndexOutOfBoundsException(m13148g(i2));
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f23980d != booleanArrayList.f23980d) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f23979c;
        for (int i2 = 0; i2 < this.f23980d; i2++) {
            if (this.f23979c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m13147f(int i2) {
        m13146e(i2);
        return this.f23979c[i2];
    }

    /* renamed from: g */
    public final String m13148g(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f23980d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        m13146e(i2);
        return Boolean.valueOf(this.f23979c[i2]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f23980d; i3++) {
            i2 = (i2 * 31) + Internal.m13453a(this.f23979c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f23980d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f23979c[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        m12987b();
        m13146e(i2);
        boolean[] zArr = this.f23979c;
        boolean z = zArr[i2];
        if (i2 < this.f23980d - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f23980d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        m12987b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f23979c;
        System.arraycopy(zArr, i3, zArr, i2, this.f23980d - i3);
        this.f23980d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m12987b();
        m13146e(i2);
        boolean[] zArr = this.f23979c;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23980d;
    }

    public BooleanArrayList(boolean[] zArr, int i2) {
        this.f23979c = zArr;
        this.f23980d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m13145d(((Boolean) obj).booleanValue());
        return true;
    }
}
