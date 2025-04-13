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
final class zzer extends zzdn<Integer> implements RandomAccess, zzfx {

    /* renamed from: c */
    public int[] f16105c;

    /* renamed from: d */
    public int f16106d;

    static {
        new zzer(new int[0], 0).f16071b = false;
    }

    public zzer() {
        this.f16105c = new int[10];
        this.f16106d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16106d)) {
            throw new IndexOutOfBoundsException(m8408e(i2));
        }
        int[] iArr = this.f16105c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f16105c, i2, iArr2, i2 + 1, this.f16106d - i2);
            this.f16105c = iArr2;
        }
        this.f16105c[i2] = intValue;
        this.f16106d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m8346b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i2 = zzerVar.f16106d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16106d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f16105c;
        if (i4 > iArr.length) {
            this.f16105c = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzerVar.f16105c, 0, this.f16105c, this.f16106d, zzerVar.f16106d);
        this.f16106d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16106d) {
            return new zzer(Arrays.copyOf(this.f16105c, i2), this.f16106d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m8407d(int i2) {
        m8346b();
        int i3 = this.f16106d;
        int[] iArr = this.f16105c;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f16105c = iArr2;
        }
        int[] iArr3 = this.f16105c;
        int i4 = this.f16106d;
        this.f16106d = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: e */
    public final String m8408e(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16106d);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.f16106d != zzerVar.f16106d) {
            return false;
        }
        int[] iArr = zzerVar.f16105c;
        for (int i2 = 0; i2 < this.f16106d; i2++) {
            if (this.f16105c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8409f(int i2) {
        if (i2 < 0 || i2 >= this.f16106d) {
            throw new IndexOutOfBoundsException(m8408e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        m8409f(i2);
        return Integer.valueOf(this.f16105c[i2]);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16106d; i3++) {
            i2 = (i2 * 31) + this.f16105c[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f16106d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16105c[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        m8409f(i2);
        int[] iArr = this.f16105c;
        int i3 = iArr[i2];
        if (i2 < this.f16106d - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f16106d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8346b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16105c;
        System.arraycopy(iArr, i3, iArr, i2, this.f16106d - i3);
        this.f16106d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m8346b();
        m8409f(i2);
        int[] iArr = this.f16105c;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16106d;
    }

    public zzer(int[] iArr, int i2) {
        this.f16105c = iArr;
        this.f16106d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8407d(((Integer) obj).intValue());
        return true;
    }
}
