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
final class zzaar extends zzyf implements RandomAccess, zzabj {

    /* renamed from: c */
    public long[] f16281c;

    /* renamed from: d */
    public int f16282d;

    static {
        new zzaar(new long[0], 0).f17107b = false;
    }

    public zzaar() {
        this.f16281c = new long[10];
        this.f16282d = 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        m9489b();
        if (i2 < 0 || i2 > (i3 = this.f16282d)) {
            throw new IndexOutOfBoundsException(m8600f(i2));
        }
        long[] jArr = this.f16281c;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[C0576a.m4105d(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f16281c, i2, jArr2, i2 + 1, this.f16282d - i2);
            this.f16281c = jArr2;
        }
        this.f16281c[i2] = longValue;
        this.f16282d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9489b();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzaar)) {
            return super.addAll(collection);
        }
        zzaar zzaarVar = (zzaar) collection;
        int i2 = zzaarVar.f16282d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f16282d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f16281c;
        if (i4 > jArr.length) {
            this.f16281c = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzaarVar.f16281c, 0, this.f16281c, this.f16282d, zzaarVar.f16282d);
        this.f16282d = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 >= this.f16282d) {
            return new zzaar(Arrays.copyOf(this.f16281c, i2), this.f16282d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long m8598d(int i2) {
        m8601g(i2);
        return this.f16281c[i2];
    }

    /* renamed from: e */
    public final void m8599e(long j2) {
        m9489b();
        int i2 = this.f16282d;
        long[] jArr = this.f16281c;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[C0576a.m4105d(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f16281c = jArr2;
        }
        long[] jArr3 = this.f16281c;
        int i3 = this.f16282d;
        this.f16282d = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaar)) {
            return super.equals(obj);
        }
        zzaar zzaarVar = (zzaar) obj;
        if (this.f16282d != zzaarVar.f16282d) {
            return false;
        }
        long[] jArr = zzaarVar.f16281c;
        for (int i2 = 0; i2 < this.f16282d; i2++) {
            if (this.f16281c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m8600f(int i2) {
        return C0000a.m9f("Index:", i2, ", Size:", this.f16282d);
    }

    /* renamed from: g */
    public final void m8601g(int i2) {
        if (i2 < 0 || i2 >= this.f16282d) {
            throw new IndexOutOfBoundsException(m8600f(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8601g(i2);
        return Long.valueOf(this.f16281c[i2]);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f16282d; i3++) {
            i2 = (i2 * 31) + zzaad.m8576b(this.f16281c[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f16282d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16281c[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        m8601g(i2);
        long[] jArr = this.f16281c;
        long j2 = jArr[i2];
        if (i2 < this.f16282d - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f16282d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9489b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f16281c;
        System.arraycopy(jArr, i3, jArr, i2, this.f16282d - i3);
        this.f16282d -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        m9489b();
        m8601g(i2);
        long[] jArr = this.f16281c;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16282d;
    }

    public zzaar(long[] jArr, int i2) {
        this.f16281c = jArr;
        this.f16282d = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8599e(((Long) obj).longValue());
        return true;
    }
}
