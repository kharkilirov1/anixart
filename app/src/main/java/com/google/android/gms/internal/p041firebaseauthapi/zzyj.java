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
final class zzyj extends zzyf implements RandomAccess, zzabj {

    /* renamed from: c */
    public boolean[] f17113c;

    /* renamed from: d */
    public int f17114d;

    static {
        new zzyj(new boolean[0], 0).f17107b = false;
    }

    public zzyj() {
        this.f17113c = new boolean[10];
        this.f17114d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f17114d)) {
            throw new IndexOutOfBoundsException(m9506e(i2));
        }
        boolean[] zArr = this.f17113c;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f17113c, i2, zArr2, i2 + 1, this.f17114d - i2);
            this.f17113c = zArr2;
        }
        this.f17113c[i2] = booleanValue;
        this.f17114d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9489b();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzyj)) {
            return super.addAll(collection);
        }
        zzyj zzyjVar = (zzyj) collection;
        int i2 = zzyjVar.f17114d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f17114d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f17113c;
        if (i4 > zArr.length) {
            this.f17113c = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzyjVar.f17113c, 0, this.f17113c, this.f17114d, zzyjVar.f17114d);
        this.f17114d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f17114d) {
            return new zzyj(Arrays.copyOf(this.f17113c, i2), this.f17114d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m9505d(boolean z) {
        m9489b();
        int i2 = this.f17114d;
        boolean[] zArr = this.f17113c;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f17113c = zArr2;
        }
        boolean[] zArr3 = this.f17113c;
        int i3 = this.f17114d;
        this.f17114d = i3 + 1;
        zArr3[i3] = z;
    }

    /* renamed from: e */
    public final String m9506e(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f17114d);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzyj)) {
            return super.equals(obj);
        }
        zzyj zzyjVar = (zzyj) obj;
        if (this.f17114d != zzyjVar.f17114d) {
            return false;
        }
        boolean[] zArr = zzyjVar.f17113c;
        for (int i2 = 0; i2 < this.f17114d; i2++) {
            if (this.f17113c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m9507f(int i2) {
        if (i2 < 0 || i2 >= this.f17114d) {
            throw new IndexOutOfBoundsException(m9506e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9507f(i2);
        return Boolean.valueOf(this.f17113c[i2]);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f17114d; i3++) {
            i2 = (i2 * 31) + zzaad.m8575a(this.f17113c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f17114d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f17113c[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        m9507f(i2);
        boolean[] zArr = this.f17113c;
        boolean z = zArr[i2];
        if (i2 < this.f17114d - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f17114d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9489b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f17113c;
        System.arraycopy(zArr, i3, zArr, i2, this.f17114d - i3);
        this.f17114d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m9489b();
        m9507f(i2);
        boolean[] zArr = this.f17113c;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17114d;
    }

    public zzyj(boolean[] zArr, int i2) {
        this.f17113c = zArr;
        this.f17114d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9505d(((Boolean) obj).booleanValue());
        return true;
    }
}
