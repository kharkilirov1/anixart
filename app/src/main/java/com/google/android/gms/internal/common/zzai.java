package com.google.android.gms.internal.common;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzai<E> extends zzag<E> {

    /* renamed from: f */
    public static final zzag<Object> f16245f = new zzai(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f16246d;

    /* renamed from: e */
    public final transient int f16247e;

    public zzai(Object[] objArr, int i2) {
        this.f16246d = objArr;
        this.f16247e = i2;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    /* renamed from: a */
    public final int mo8544a(Object[] objArr, int i2) {
        System.arraycopy(this.f16246d, 0, objArr, 0, this.f16247e);
        return this.f16247e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: b */
    public final int mo8545b() {
        return this.f16247e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: d */
    public final int mo8546d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: g */
    public final boolean mo8549g() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i2) {
        zzs.m8562a(i2, this.f16247e, "index");
        E e2 = (E) this.f16246d[i2];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: r */
    public final Object[] mo8550r() {
        return this.f16246d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16247e;
    }
}
