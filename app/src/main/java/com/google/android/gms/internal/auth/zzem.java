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
final class zzem extends zzdn<Float> implements RandomAccess, zzfx {

    /* renamed from: c */
    public float[] f16099c;

    /* renamed from: d */
    public int f16100d;

    static {
        new zzem(new float[0], 0).f16071b = false;
    }

    public zzem() {
        this.f16099c = new float[10];
        this.f16100d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16100d)) {
            throw new IndexOutOfBoundsException(m8394e(i2));
        }
        float[] fArr = this.f16099c;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f16099c, i2, fArr2, i2 + 1, this.f16100d - i2);
            this.f16099c = fArr2;
        }
        this.f16099c[i2] = floatValue;
        this.f16100d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m8346b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzem)) {
            return super.addAll(collection);
        }
        zzem zzemVar = (zzem) collection;
        int i2 = zzemVar.f16100d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16100d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f16099c;
        if (i4 > fArr.length) {
            this.f16099c = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzemVar.f16099c, 0, this.f16099c, this.f16100d, zzemVar.f16100d);
        this.f16100d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16100d) {
            return new zzem(Arrays.copyOf(this.f16099c, i2), this.f16100d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m8393d(float f2) {
        m8346b();
        int i2 = this.f16100d;
        float[] fArr = this.f16099c;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f16099c = fArr2;
        }
        float[] fArr3 = this.f16099c;
        int i3 = this.f16100d;
        this.f16100d = i3 + 1;
        fArr3[i3] = f2;
    }

    /* renamed from: e */
    public final String m8394e(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16100d);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzem)) {
            return super.equals(obj);
        }
        zzem zzemVar = (zzem) obj;
        if (this.f16100d != zzemVar.f16100d) {
            return false;
        }
        float[] fArr = zzemVar.f16099c;
        for (int i2 = 0; i2 < this.f16100d; i2++) {
            if (Float.floatToIntBits(this.f16099c[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8395f(int i2) {
        if (i2 < 0 || i2 >= this.f16100d) {
            throw new IndexOutOfBoundsException(m8394e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        m8395f(i2);
        return Float.valueOf(this.f16099c[i2]);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16100d; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f16099c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f16100d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16099c[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        m8395f(i2);
        float[] fArr = this.f16099c;
        float f2 = fArr[i2];
        if (i2 < this.f16100d - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f16100d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8346b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f16099c;
        System.arraycopy(fArr, i3, fArr, i2, this.f16100d - i3);
        this.f16100d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m8346b();
        m8395f(i2);
        float[] fArr = this.f16099c;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16100d;
    }

    public zzem(float[] fArr, int i2) {
        this.f16099c = fArr;
        this.f16100d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8393d(((Float) obj).floatValue());
        return true;
    }
}
