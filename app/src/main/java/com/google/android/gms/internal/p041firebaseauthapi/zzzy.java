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
final class zzzy extends zzyf implements RandomAccess, zzabj {

    /* renamed from: c */
    public int[] f17170c;

    /* renamed from: d */
    public int f17171d;

    static {
        new zzzy(new int[0], 0).f17107b = false;
    }

    public zzzy() {
        this.f17170c = new int[10];
        this.f17171d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f17171d)) {
            throw new IndexOutOfBoundsException(m9660f(i2));
        }
        int[] iArr = this.f17170c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f17170c, i2, iArr2, i2 + 1, this.f17171d - i2);
            this.f17170c = iArr2;
        }
        this.f17170c[i2] = intValue;
        this.f17171d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9489b();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzzy)) {
            return super.addAll(collection);
        }
        zzzy zzzyVar = (zzzy) collection;
        int i2 = zzzyVar.f17171d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f17171d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f17170c;
        if (i4 > iArr.length) {
            this.f17170c = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzzyVar.f17170c, 0, this.f17170c, this.f17171d, zzzyVar.f17171d);
        this.f17171d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f17171d) {
            return new zzzy(Arrays.copyOf(this.f17170c, i2), this.f17171d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m9658d(int i2) {
        m9661g(i2);
        return this.f17170c[i2];
    }

    /* renamed from: e */
    public final void m9659e(int i2) {
        m9489b();
        int i3 = this.f17171d;
        int[] iArr = this.f17170c;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f17170c = iArr2;
        }
        int[] iArr3 = this.f17170c;
        int i4 = this.f17171d;
        this.f17171d = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzy)) {
            return super.equals(obj);
        }
        zzzy zzzyVar = (zzzy) obj;
        if (this.f17171d != zzzyVar.f17171d) {
            return false;
        }
        int[] iArr = zzzyVar.f17170c;
        for (int i2 = 0; i2 < this.f17171d; i2++) {
            if (this.f17170c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m9660f(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f17171d);
    }

    /* renamed from: g */
    public final void m9661g(int i2) {
        if (i2 < 0 || i2 >= this.f17171d) {
            throw new IndexOutOfBoundsException(m9660f(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9661g(i2);
        return Integer.valueOf(this.f17170c[i2]);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f17171d; i3++) {
            i2 = (i2 * 31) + this.f17170c[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f17171d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f17170c[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        m9661g(i2);
        int[] iArr = this.f17170c;
        int i3 = iArr[i2];
        if (i2 < this.f17171d - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f17171d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9489b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f17170c;
        System.arraycopy(iArr, i3, iArr, i2, this.f17171d - i3);
        this.f17171d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m9489b();
        m9661g(i2);
        int[] iArr = this.f17170c;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17171d;
    }

    public zzzy(int[] iArr, int i2) {
        this.f17170c = iArr;
        this.f17171d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9659e(((Integer) obj).intValue());
        return true;
    }
}
