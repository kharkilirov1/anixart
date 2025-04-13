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
final class zzdr extends zzdn<Boolean> implements RandomAccess, zzfx {

    /* renamed from: c */
    public boolean[] f16076c;

    /* renamed from: d */
    public int f16077d;

    static {
        new zzdr(new boolean[0], 0).f16071b = false;
    }

    public zzdr() {
        this.f16076c = new boolean[10];
        this.f16077d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16077d)) {
            throw new IndexOutOfBoundsException(m8366e(i2));
        }
        boolean[] zArr = this.f16076c;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f16076c, i2, zArr2, i2 + 1, this.f16077d - i2);
            this.f16076c = zArr2;
        }
        this.f16076c[i2] = booleanValue;
        this.f16077d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m8346b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzdr)) {
            return super.addAll(collection);
        }
        zzdr zzdrVar = (zzdr) collection;
        int i2 = zzdrVar.f16077d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16077d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f16076c;
        if (i4 > zArr.length) {
            this.f16076c = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzdrVar.f16076c, 0, this.f16076c, this.f16077d, zzdrVar.f16077d);
        this.f16077d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16077d) {
            return new zzdr(Arrays.copyOf(this.f16076c, i2), this.f16077d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m8365d(boolean z) {
        m8346b();
        int i2 = this.f16077d;
        boolean[] zArr = this.f16076c;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f16076c = zArr2;
        }
        boolean[] zArr3 = this.f16076c;
        int i3 = this.f16077d;
        this.f16077d = i3 + 1;
        zArr3[i3] = z;
    }

    /* renamed from: e */
    public final String m8366e(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16077d);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdr)) {
            return super.equals(obj);
        }
        zzdr zzdrVar = (zzdr) obj;
        if (this.f16077d != zzdrVar.f16077d) {
            return false;
        }
        boolean[] zArr = zzdrVar.f16076c;
        for (int i2 = 0; i2 < this.f16077d; i2++) {
            if (this.f16076c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8367f(int i2) {
        if (i2 < 0 || i2 >= this.f16077d) {
            throw new IndexOutOfBoundsException(m8366e(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        m8367f(i2);
        return Boolean.valueOf(this.f16076c[i2]);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16077d; i3++) {
            i2 = (i2 * 31) + zzev.m8411a(this.f16076c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f16077d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16076c[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        m8367f(i2);
        boolean[] zArr = this.f16076c;
        boolean z = zArr[i2];
        if (i2 < this.f16077d - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f16077d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8346b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f16076c;
        System.arraycopy(zArr, i3, zArr, i2, this.f16077d - i3);
        this.f16077d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m8346b();
        m8367f(i2);
        boolean[] zArr = this.f16076c;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16077d;
    }

    public zzdr(boolean[] zArr, int i2) {
        this.f16076c = zArr;
        this.f16077d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8365d(((Boolean) obj).booleanValue());
        return true;
    }
}
