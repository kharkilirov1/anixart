package com.google.android.gms.internal.p041firebaseauthapi;

import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzak extends zzal {

    /* renamed from: d */
    public final transient int f16385d;

    /* renamed from: e */
    public final transient int f16386e;

    /* renamed from: f */
    public final /* synthetic */ zzal f16387f;

    public zzak(zzal zzalVar, int i2, int i3) {
        this.f16387f = zzalVar;
        this.f16385d = i2;
        this.f16386e = i3;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: b */
    public final int mo8820b() {
        return this.f16387f.mo8821d() + this.f16385d + this.f16386e;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: d */
    public final int mo8821d() {
        return this.f16387f.mo8821d() + this.f16385d;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    @CheckForNull
    /* renamed from: f */
    public final Object[] mo8823f() {
        return this.f16387f.mo8823f();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzal, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final zzal subList(int i2, int i3) {
        zzy.m9481c(i2, i3, this.f16386e);
        zzal zzalVar = this.f16387f;
        int i4 = this.f16385d;
        return zzalVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzy.m9479a(i2, this.f16386e, "index");
        return this.f16387f.get(i2 + this.f16385d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16386e;
    }
}
