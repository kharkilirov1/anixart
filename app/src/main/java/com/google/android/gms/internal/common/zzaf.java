package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzaf extends zzag {

    /* renamed from: d */
    public final transient int f16241d;

    /* renamed from: e */
    public final transient int f16242e;

    /* renamed from: f */
    public final /* synthetic */ zzag f16243f;

    public zzaf(zzag zzagVar, int i2, int i3) {
        this.f16243f = zzagVar;
        this.f16241d = i2;
        this.f16242e = i3;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: b */
    public final int mo8545b() {
        return this.f16243f.mo8546d() + this.f16241d + this.f16242e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: d */
    public final int mo8546d() {
        return this.f16243f.mo8546d() + this.f16241d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: g */
    public final boolean mo8549g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzs.m8562a(i2, this.f16242e, "index");
        return this.f16243f.get(i2 + this.f16241d);
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    /* renamed from: r */
    public final Object[] mo8550r() {
        return this.f16243f.mo8550r();
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i2, int i3) {
        zzs.m8564c(i2, i3, this.f16242e);
        zzag zzagVar = this.f16243f;
        int i4 = this.f16241d;
        return zzagVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16242e;
    }
}
