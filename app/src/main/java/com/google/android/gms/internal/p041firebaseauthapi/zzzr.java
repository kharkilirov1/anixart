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
final class zzzr extends zzyf implements RandomAccess, zzabj {

    /* renamed from: c */
    public float[] f17164c;

    /* renamed from: d */
    public int f17165d;

    static {
        new zzzr(new float[0], 0).f17107b = false;
    }

    public zzzr() {
        this.f17164c = new float[10];
        this.f17165d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f17165d)) {
            throw new IndexOutOfBoundsException(m9642e(i2));
        }
        float[] fArr = this.f17164c;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f17164c, i2, fArr2, i2 + 1, this.f17165d - i2);
            this.f17164c = fArr2;
        }
        this.f17164c[i2] = floatValue;
        this.f17165d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9489b();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzzr)) {
            return super.addAll(collection);
        }
        zzzr zzzrVar = (zzzr) collection;
        int i2 = zzzrVar.f17165d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f17165d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f17164c;
        if (i4 > fArr.length) {
            this.f17164c = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzzrVar.f17164c, 0, this.f17164c, this.f17165d, zzzrVar.f17165d);
        this.f17165d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f17165d) {
            return new zzzr(Arrays.copyOf(this.f17164c, i2), this.f17165d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m9641d(float f2) {
        m9489b();
        int i2 = this.f17165d;
        float[] fArr = this.f17164c;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f17164c = fArr2;
        }
        float[] fArr3 = this.f17164c;
        int i3 = this.f17165d;
        this.f17165d = i3 + 1;
        fArr3[i3] = f2;
    }

    /* renamed from: e */
    public final String m9642e(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f17165d);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzr)) {
            return super.equals(obj);
        }
        zzzr zzzrVar = (zzzr) obj;
        if (this.f17165d != zzzrVar.f17165d) {
            return false;
        }
        float[] fArr = zzzrVar.f17164c;
        for (int i2 = 0; i2 < this.f17165d; i2++) {
            if (Float.floatToIntBits(this.f17164c[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m9643f(int i2) {
        if (i2 < 0 || i2 >= this.f17165d) {
            throw new IndexOutOfBoundsException(m9642e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9643f(i2);
        return Float.valueOf(this.f17164c[i2]);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f17165d; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f17164c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f17165d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f17164c[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        m9643f(i2);
        float[] fArr = this.f17164c;
        float f2 = fArr[i2];
        if (i2 < this.f17165d - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f17165d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9489b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f17164c;
        System.arraycopy(fArr, i3, fArr, i2, this.f17165d - i3);
        this.f17165d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m9489b();
        m9643f(i2);
        float[] fArr = this.f17164c;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17165d;
    }

    public zzzr(float[] fArr, int i2) {
        this.f17164c = fArr;
        this.f17165d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9641d(((Float) obj).floatValue());
        return true;
    }
}
