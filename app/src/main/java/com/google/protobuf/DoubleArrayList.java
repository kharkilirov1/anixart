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
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: e */
    public static final DoubleArrayList f24105e;

    /* renamed from: c */
    public double[] f24106c;

    /* renamed from: d */
    public int f24107d;

    static {
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[0], 0);
        f24105e = doubleArrayList;
        doubleArrayList.f23951b = false;
    }

    public DoubleArrayList() {
        this.f24106c = new double[10];
        this.f24107d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList<Double> mo13144N(int i2) {
        if (i2 >= this.f24107d) {
            return new DoubleArrayList(Arrays.copyOf(this.f24106c, i2), this.f24107d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        m12987b();
        if (i2 < 0 || i2 > (i3 = this.f24107d)) {
            throw new IndexOutOfBoundsException(m13362g(i2));
        }
        double[] dArr = this.f24106c;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f24106c, i2, dArr2, i2 + 1, this.f24107d - i2);
            this.f24106c = dArr2;
        }
        this.f24106c[i2] = doubleValue;
        this.f24107d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m12987b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.f24107d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24107d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f24106c;
        if (i4 > dArr.length) {
            this.f24106c = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(doubleArrayList.f24106c, 0, this.f24106c, this.f24107d, doubleArrayList.f24107d);
        this.f24107d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void m13359d(double d) {
        m12987b();
        int i2 = this.f24107d;
        double[] dArr = this.f24106c;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f24106c = dArr2;
        }
        double[] dArr3 = this.f24106c;
        int i3 = this.f24107d;
        this.f24107d = i3 + 1;
        dArr3[i3] = d;
    }

    /* renamed from: e */
    public final void m13360e(int i2) {
        if (i2 < 0 || i2 >= this.f24107d) {
            throw new IndexOutOfBoundsException(m13362g(i2));
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f24107d != doubleArrayList.f24107d) {
            return false;
        }
        double[] dArr = doubleArrayList.f24106c;
        for (int i2 = 0; i2 < this.f24107d; i2++) {
            if (Double.doubleToLongBits(this.f24106c[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public double m13361f(int i2) {
        m13360e(i2);
        return this.f24106c[i2];
    }

    /* renamed from: g */
    public final String m13362g(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f24107d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        m13360e(i2);
        return Double.valueOf(this.f24106c[i2]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24107d; i3++) {
            i2 = (i2 * 31) + Internal.m13454b(Double.doubleToLongBits(this.f24106c[i3]));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f24107d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24106c[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        m12987b();
        m13360e(i2);
        double[] dArr = this.f24106c;
        double d = dArr[i2];
        if (i2 < this.f24107d - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f24107d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        m12987b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f24106c;
        System.arraycopy(dArr, i3, dArr, i2, this.f24107d - i3);
        this.f24107d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m12987b();
        m13360e(i2);
        double[] dArr = this.f24106c;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24107d;
    }

    public DoubleArrayList(double[] dArr, int i2) {
        this.f24106c = dArr;
        this.f24107d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m13359d(((Double) obj).doubleValue());
        return true;
    }
}
