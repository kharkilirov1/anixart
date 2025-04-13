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
final class zzef extends zzdn<Double> implements RandomAccess, zzfx {

    /* renamed from: c */
    public double[] f16088c;

    /* renamed from: d */
    public int f16089d;

    static {
        new zzef(new double[0], 0).f16071b = false;
    }

    public zzef() {
        this.f16088c = new double[10];
        this.f16089d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16089d)) {
            throw new IndexOutOfBoundsException(m8382e(i2));
        }
        double[] dArr = this.f16088c;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f16088c, i2, dArr2, i2 + 1, this.f16089d - i2);
            this.f16088c = dArr2;
        }
        this.f16088c[i2] = doubleValue;
        this.f16089d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m8346b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzef)) {
            return super.addAll(collection);
        }
        zzef zzefVar = (zzef) collection;
        int i2 = zzefVar.f16089d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16089d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f16088c;
        if (i4 > dArr.length) {
            this.f16088c = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzefVar.f16088c, 0, this.f16088c, this.f16089d, zzefVar.f16089d);
        this.f16089d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16089d) {
            return new zzef(Arrays.copyOf(this.f16088c, i2), this.f16089d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m8381d(double d) {
        m8346b();
        int i2 = this.f16089d;
        double[] dArr = this.f16088c;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f16088c = dArr2;
        }
        double[] dArr3 = this.f16088c;
        int i3 = this.f16089d;
        this.f16089d = i3 + 1;
        dArr3[i3] = d;
    }

    /* renamed from: e */
    public final String m8382e(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16089d);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzef)) {
            return super.equals(obj);
        }
        zzef zzefVar = (zzef) obj;
        if (this.f16089d != zzefVar.f16089d) {
            return false;
        }
        double[] dArr = zzefVar.f16088c;
        for (int i2 = 0; i2 < this.f16089d; i2++) {
            if (Double.doubleToLongBits(this.f16088c[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8383f(int i2) {
        if (i2 < 0 || i2 >= this.f16089d) {
            throw new IndexOutOfBoundsException(m8382e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        m8383f(i2);
        return Double.valueOf(this.f16088c[i2]);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16089d; i3++) {
            i2 = (i2 * 31) + zzev.m8412b(Double.doubleToLongBits(this.f16088c[i3]));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f16089d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16088c[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        m8383f(i2);
        double[] dArr = this.f16088c;
        double d = dArr[i2];
        if (i2 < this.f16089d - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f16089d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8346b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f16088c;
        System.arraycopy(dArr, i3, dArr, i2, this.f16089d - i3);
        this.f16089d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m8346b();
        m8383f(i2);
        double[] dArr = this.f16088c;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16089d;
    }

    public zzef(double[] dArr, int i2) {
        this.f16088c = dArr;
        this.f16089d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8381d(((Double) obj).doubleValue());
        return true;
    }
}
