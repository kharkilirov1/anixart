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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: e */
    public static final LongArrayList f24255e;

    /* renamed from: c */
    public long[] f24256c;

    /* renamed from: d */
    public int f24257d;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        f24255e = longArrayList;
        longArrayList.f23951b = false;
    }

    public LongArrayList() {
        this.f24256c = new long[10];
        this.f24257d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList<Long> mo13144N(int i2) {
        if (i2 >= this.f24257d) {
            return new LongArrayList(Arrays.copyOf(this.f24256c, i2), this.f24257d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        m12987b();
        if (i2 < 0 || i2 > (i3 = this.f24257d)) {
            throw new IndexOutOfBoundsException(m13486g(i2));
        }
        long[] jArr = this.f24256c;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f24256c, i2, jArr2, i2 + 1, this.f24257d - i2);
            this.f24256c = jArr2;
        }
        this.f24256c[i2] = longValue;
        this.f24257d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m12987b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i2 = longArrayList.f24257d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24257d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f24256c;
        if (i4 > jArr.length) {
            this.f24256c = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(longArrayList.f24256c, 0, this.f24256c, this.f24257d, longArrayList.f24257d);
        this.f24257d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void m13483d(long j2) {
        m12987b();
        int i2 = this.f24257d;
        long[] jArr = this.f24256c;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f24256c = jArr2;
        }
        long[] jArr3 = this.f24256c;
        int i3 = this.f24257d;
        this.f24257d = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: e */
    public final void m13484e(int i2) {
        if (i2 < 0 || i2 >= this.f24257d) {
            throw new IndexOutOfBoundsException(m13486g(i2));
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f24257d != longArrayList.f24257d) {
            return false;
        }
        long[] jArr = longArrayList.f24256c;
        for (int i2 = 0; i2 < this.f24257d; i2++) {
            if (this.f24256c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public long m13485f(int i2) {
        m13484e(i2);
        return this.f24256c[i2];
    }

    /* renamed from: g */
    public final String m13486g(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f24257d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        m13484e(i2);
        return Long.valueOf(this.f24256c[i2]);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24257d; i3++) {
            i2 = (i2 * 31) + Internal.m13454b(this.f24256c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f24257d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24256c[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        m12987b();
        m13484e(i2);
        long[] jArr = this.f24256c;
        long j2 = jArr[i2];
        if (i2 < this.f24257d - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f24257d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        m12987b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24256c;
        System.arraycopy(jArr, i3, jArr, i2, this.f24257d - i3);
        this.f24257d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        m12987b();
        m13484e(i2);
        long[] jArr = this.f24256c;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24257d;
    }

    public LongArrayList(long[] jArr, int i2) {
        this.f24256c = jArr;
        this.f24257d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m13483d(((Long) obj).longValue());
        return true;
    }
}
