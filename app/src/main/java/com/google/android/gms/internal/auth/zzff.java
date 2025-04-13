package com.google.android.gms.internal.auth;

import androidx.room.util.C0576a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzff extends zzdn<Long> implements RandomAccess, zzfx {

    /* renamed from: c */
    public long[] f16113c;

    /* renamed from: d */
    public int f16114d;

    static {
        new zzff(new long[0], 0).f16071b = false;
    }

    public zzff() {
        this.f16113c = new long[10];
        this.f16114d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16114d)) {
            throw new IndexOutOfBoundsException(m8425e(i2));
        }
        long[] jArr = this.f16113c;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f16113c, i2, jArr2, i2 + 1, this.f16114d - i2);
            this.f16113c = jArr2;
        }
        this.f16113c[i2] = longValue;
        this.f16114d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m8346b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzff)) {
            return super.addAll(collection);
        }
        zzff zzffVar = (zzff) collection;
        int i2 = zzffVar.f16114d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16114d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f16113c;
        if (i4 > jArr.length) {
            this.f16113c = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzffVar.f16113c, 0, this.f16113c, this.f16114d, zzffVar.f16114d);
        this.f16114d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16114d) {
            return new zzff(Arrays.copyOf(this.f16113c, i2), this.f16114d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m8424d(long j2) {
        m8346b();
        int i2 = this.f16114d;
        long[] jArr = this.f16113c;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f16113c = jArr2;
        }
        long[] jArr3 = this.f16113c;
        int i3 = this.f16114d;
        this.f16114d = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: e */
    public final String m8425e(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16114d);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzff)) {
            return super.equals(obj);
        }
        zzff zzffVar = (zzff) obj;
        if (this.f16114d != zzffVar.f16114d) {
            return false;
        }
        long[] jArr = zzffVar.f16113c;
        for (int i2 = 0; i2 < this.f16114d; i2++) {
            if (this.f16113c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8426f(int i2) {
        if (i2 < 0 || i2 >= this.f16114d) {
            throw new IndexOutOfBoundsException(m8425e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        m8426f(i2);
        return Long.valueOf(this.f16113c[i2]);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16114d; i3++) {
            i2 = (i2 * 31) + zzev.m8412b(this.f16113c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f16114d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16113c[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        m8426f(i2);
        long[] jArr = this.f16113c;
        long j2 = jArr[i2];
        if (i2 < this.f16114d - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f16114d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8346b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f16113c;
        System.arraycopy(jArr, i3, jArr, i2, this.f16114d - i3);
        this.f16114d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        m8346b();
        m8426f(i2);
        long[] jArr = this.f16113c;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16114d;
    }

    public zzff(long[] jArr, int i2) {
        this.f16113c = jArr;
        this.f16114d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8424d(((Long) obj).longValue());
        return true;
    }
}
