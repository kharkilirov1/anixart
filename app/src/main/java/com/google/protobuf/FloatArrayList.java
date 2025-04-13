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
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: c */
    public float[] f24179c;

    /* renamed from: d */
    public int f24180d;

    static {
        new FloatArrayList(new float[0], 0).f23951b = false;
    }

    public FloatArrayList() {
        this.f24179c = new float[10];
        this.f24180d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList<Float> mo13144N(int i2) {
        if (i2 >= this.f24180d) {
            return new FloatArrayList(Arrays.copyOf(this.f24179c, i2), this.f24180d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        m12987b();
        if (i2 < 0 || i2 > (i3 = this.f24180d)) {
            throw new IndexOutOfBoundsException(m13409g(i2));
        }
        float[] fArr = this.f24179c;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f24179c, i2, fArr2, i2 + 1, this.f24180d - i2);
            this.f24179c = fArr2;
        }
        this.f24179c[i2] = floatValue;
        this.f24180d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m12987b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i2 = floatArrayList.f24180d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24180d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f24179c;
        if (i4 > fArr.length) {
            this.f24179c = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(floatArrayList.f24179c, 0, this.f24179c, this.f24180d, floatArrayList.f24180d);
        this.f24180d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void m13406d(float f2) {
        m12987b();
        int i2 = this.f24180d;
        float[] fArr = this.f24179c;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f24179c = fArr2;
        }
        float[] fArr3 = this.f24179c;
        int i3 = this.f24180d;
        this.f24180d = i3 + 1;
        fArr3[i3] = f2;
    }

    /* renamed from: e */
    public final void m13407e(int i2) {
        if (i2 < 0 || i2 >= this.f24180d) {
            throw new IndexOutOfBoundsException(m13409g(i2));
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f24180d != floatArrayList.f24180d) {
            return false;
        }
        float[] fArr = floatArrayList.f24179c;
        for (int i2 = 0; i2 < this.f24180d; i2++) {
            if (Float.floatToIntBits(this.f24179c[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public float m13408f(int i2) {
        m13407e(i2);
        return this.f24179c[i2];
    }

    /* renamed from: g */
    public final String m13409g(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f24180d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        m13407e(i2);
        return Float.valueOf(this.f24179c[i2]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24180d; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f24179c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f24180d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24179c[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        m12987b();
        m13407e(i2);
        float[] fArr = this.f24179c;
        float f2 = fArr[i2];
        if (i2 < this.f24180d - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f24180d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        m12987b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f24179c;
        System.arraycopy(fArr, i3, fArr, i2, this.f24180d - i3);
        this.f24180d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m12987b();
        m13407e(i2);
        float[] fArr = this.f24179c;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24180d;
    }

    public FloatArrayList(float[] fArr, int i2) {
        this.f24179c = fArr;
        this.f24180d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m13406d(((Float) obj).floatValue());
        return true;
    }
}
