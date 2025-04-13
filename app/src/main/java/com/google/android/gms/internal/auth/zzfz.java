package com.google.android.gms.internal.auth;

import androidx.room.util.C0576a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfz<E> extends zzdn<E> implements RandomAccess {

    /* renamed from: e */
    public static final zzfz<Object> f16143e;

    /* renamed from: c */
    public E[] f16144c;

    /* renamed from: d */
    public int f16145d;

    static {
        zzfz<Object> zzfzVar = new zzfz<>(new Object[0], 0);
        f16143e = zzfzVar;
        zzfzVar.f16071b = false;
    }

    public zzfz() {
        this.f16144c = (E[]) new Object[10];
        this.f16145d = 0;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        m8346b();
        if (i2 < 0 || i2 > (i3 = this.f16145d)) {
            throw new IndexOutOfBoundsException(m8470d(i2));
        }
        E[] eArr = this.f16144c;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f16144c, i2, eArr2, i2 + 1, this.f16145d - i2);
            this.f16144c = eArr2;
        }
        this.f16144c[i2] = e2;
        this.f16145d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 >= this.f16145d) {
            return new zzfz(Arrays.copyOf(this.f16144c, i2), this.f16145d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public final String m8470d(int i2) {
        return C0576a.m4112k(35, "Index:", i2, ", Size:", this.f16145d);
    }

    /* renamed from: e */
    public final void m8471e(int i2) {
        if (i2 < 0 || i2 >= this.f16145d) {
            throw new IndexOutOfBoundsException(m8470d(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        m8471e(i2);
        return this.f16144c[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        m8346b();
        m8471e(i2);
        E[] eArr = this.f16144c;
        E e2 = eArr[i2];
        if (i2 < this.f16145d - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f16145d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        m8346b();
        m8471e(i2);
        E[] eArr = this.f16144c;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16145d;
    }

    public zzfz(E[] eArr, int i2) {
        this.f16144c = eArr;
        this.f16145d = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        m8346b();
        int i2 = this.f16145d;
        E[] eArr = this.f16144c;
        if (i2 == eArr.length) {
            this.f16144c = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f16144c;
        int i3 = this.f16145d;
        this.f16145d = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }
}
