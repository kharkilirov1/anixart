package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.room.util.C0576a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzh extends zzyf implements RandomAccess, zzabj {

    /* renamed from: c */
    public double[] f17146c;

    /* renamed from: d */
    public int f17147d;

    static {
        new zzzh(new double[0], 0).f17107b = false;
    }

    public zzzh() {
        this.f17146c = new double[10];
        this.f17147d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f17147d)) {
            throw new IndexOutOfBoundsException(m9625e(i2));
        }
        double[] dArr = this.f17146c;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f17146c, i2, dArr2, i2 + 1, this.f17147d - i2);
            this.f17146c = dArr2;
        }
        this.f17146c[i2] = doubleValue;
        this.f17147d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9489b();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzzh)) {
            return super.addAll(collection);
        }
        zzzh zzzhVar = (zzzh) collection;
        int i2 = zzzhVar.f17147d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f17147d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f17146c;
        if (i4 > dArr.length) {
            this.f17146c = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzzhVar.f17146c, 0, this.f17146c, this.f17147d, zzzhVar.f17147d);
        this.f17147d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f17147d) {
            return new zzzh(Arrays.copyOf(this.f17146c, i2), this.f17147d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m9624d(double d) {
        m9489b();
        int i2 = this.f17147d;
        double[] dArr = this.f17146c;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f17146c = dArr2;
        }
        double[] dArr3 = this.f17146c;
        int i3 = this.f17147d;
        this.f17147d = i3 + 1;
        dArr3[i3] = d;
    }

    /* renamed from: e */
    public final String m9625e(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f17147d);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzh)) {
            return super.equals(obj);
        }
        zzzh zzzhVar = (zzzh) obj;
        if (this.f17147d != zzzhVar.f17147d) {
            return false;
        }
        double[] dArr = zzzhVar.f17146c;
        for (int i2 = 0; i2 < this.f17147d; i2++) {
            if (Double.doubleToLongBits(this.f17146c[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m9626f(int i2) {
        if (i2 < 0 || i2 >= this.f17147d) {
            throw new IndexOutOfBoundsException(m9625e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9626f(i2);
        return Double.valueOf(this.f17146c[i2]);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f17147d; i3++) {
            i2 = (i2 * 31) + zzaad.m8576b(Double.doubleToLongBits(this.f17146c[i3]));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f17147d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f17146c[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        m9626f(i2);
        double[] dArr = this.f17146c;
        double d = dArr[i2];
        if (i2 < this.f17147d - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f17147d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9489b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f17146c;
        System.arraycopy(dArr, i3, dArr, i2, this.f17147d - i3);
        this.f17147d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m9489b();
        m9626f(i2);
        double[] dArr = this.f17146c;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17147d;
    }

    public zzzh(double[] dArr, int i2) {
        this.f17146c = dArr;
        this.f17147d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9624d(((Double) obj).doubleValue());
        return true;
    }
}
