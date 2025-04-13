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
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: e */
    public static final IntArrayList f24207e;

    /* renamed from: c */
    public int[] f24208c;

    /* renamed from: d */
    public int f24209d;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        f24207e = intArrayList;
        intArrayList.f23951b = false;
    }

    public IntArrayList() {
        this.f24208c = new int[10];
        this.f24209d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList<Integer> mo13144N(int i2) {
        if (i2 >= this.f24209d) {
            return new IntArrayList(Arrays.copyOf(this.f24208c, i2), this.f24209d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        m12987b();
        if (i2 < 0 || i2 > (i3 = this.f24209d)) {
            throw new IndexOutOfBoundsException(m13452g(i2));
        }
        int[] iArr = this.f24208c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f24208c, i2, iArr2, i2 + 1, this.f24209d - i2);
            this.f24208c = iArr2;
        }
        this.f24208c[i2] = intValue;
        this.f24209d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m12987b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.f24209d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24209d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f24208c;
        if (i4 > iArr.length) {
            this.f24208c = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(intArrayList.f24208c, 0, this.f24208c, this.f24209d, intArrayList.f24209d);
        this.f24209d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void m13449d(int i2) {
        m12987b();
        int i3 = this.f24209d;
        int[] iArr = this.f24208c;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f24208c = iArr2;
        }
        int[] iArr3 = this.f24208c;
        int i4 = this.f24209d;
        this.f24209d = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: e */
    public final void m13450e(int i2) {
        if (i2 < 0 || i2 >= this.f24209d) {
            throw new IndexOutOfBoundsException(m13452g(i2));
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f24209d != intArrayList.f24209d) {
            return false;
        }
        int[] iArr = intArrayList.f24208c;
        for (int i2 = 0; i2 < this.f24209d; i2++) {
            if (this.f24208c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public int m13451f(int i2) {
        m13450e(i2);
        return this.f24208c[i2];
    }

    /* renamed from: g */
    public final String m13452g(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f24209d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        m13450e(i2);
        return Integer.valueOf(this.f24208c[i2]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24209d; i3++) {
            i2 = (i2 * 31) + this.f24208c[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f24209d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24208c[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        m12987b();
        m13450e(i2);
        int[] iArr = this.f24208c;
        int i3 = iArr[i2];
        if (i2 < this.f24209d - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f24209d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        m12987b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24208c;
        System.arraycopy(iArr, i3, iArr, i2, this.f24209d - i3);
        this.f24209d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m12987b();
        m13450e(i2);
        int[] iArr = this.f24208c;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24209d;
    }

    public IntArrayList(int[] iArr, int i2) {
        this.f24208c = iArr;
        this.f24209d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m13449d(((Integer) obj).intValue());
        return true;
    }
}
