package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.room.util.C0576a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabl extends zzyf implements RandomAccess {

    /* renamed from: e */
    public static final zzabl f16316e;

    /* renamed from: c */
    public Object[] f16317c;

    /* renamed from: d */
    public int f16318d;

    static {
        zzabl zzablVar = new zzabl(new Object[0], 0);
        f16316e = zzablVar;
        zzablVar.f17107b = false;
    }

    public zzabl() {
        this.f16317c = new Object[10];
        this.f16318d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f16318d)) {
            throw new IndexOutOfBoundsException(m8675d(i2));
        }
        Object[] objArr = this.f16317c;
        if (i3 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        } else {
            Object[] objArr2 = new Object[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.f16317c, i2, objArr2, i2 + 1, this.f16318d - i2);
            this.f16317c = objArr2;
        }
        this.f16317c[i2] = obj;
        this.f16318d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f16318d) {
            return new zzabl(Arrays.copyOf(this.f16317c, i2), this.f16318d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public final String m8675d(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f16318d);
    }

    /* renamed from: e */
    public final void m8676e(int i2) {
        if (i2 < 0 || i2 >= this.f16318d) {
            throw new IndexOutOfBoundsException(m8675d(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m8676e(i2);
        return this.f16317c[i2];
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m9489b();
        m8676e(i2);
        Object[] objArr = this.f16317c;
        Object obj = objArr[i2];
        if (i2 < this.f16318d - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f16318d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m9489b();
        m8676e(i2);
        Object[] objArr = this.f16317c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16318d;
    }

    public zzabl(Object[] objArr, int i2) {
        this.f16317c = objArr;
        this.f16318d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m9489b();
        int i2 = this.f16318d;
        Object[] objArr = this.f16317c;
        if (i2 == objArr.length) {
            this.f16317c = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16317c;
        int i3 = this.f16318d;
        this.f16318d = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
