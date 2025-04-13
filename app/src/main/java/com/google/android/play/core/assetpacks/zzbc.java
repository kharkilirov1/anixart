package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzbc implements com.google.android.play.core.internal.zzcs<zzbb> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<Context> f19729a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzde> f19730b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzcl> f19731c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzcs<zzy> f19732d;

    /* renamed from: e */
    public final com.google.android.play.core.internal.zzcs<zzco> f19733e;

    /* renamed from: f */
    public final com.google.android.play.core.internal.zzcs<zzbx> f19734f;

    /* renamed from: g */
    public final com.google.android.play.core.internal.zzcs<Executor> f19735g;

    /* renamed from: h */
    public final com.google.android.play.core.internal.zzcs<Executor> f19736h;

    /* renamed from: i */
    public final com.google.android.play.core.internal.zzcs<zzeb> f19737i;

    public zzbc(com.google.android.play.core.internal.zzcs<Context> zzcsVar, com.google.android.play.core.internal.zzcs<zzde> zzcsVar2, com.google.android.play.core.internal.zzcs<zzcl> zzcsVar3, com.google.android.play.core.internal.zzcs<zzy> zzcsVar4, com.google.android.play.core.internal.zzcs<zzco> zzcsVar5, com.google.android.play.core.internal.zzcs<zzbx> zzcsVar6, com.google.android.play.core.internal.zzcs<Executor> zzcsVar7, com.google.android.play.core.internal.zzcs<Executor> zzcsVar8, com.google.android.play.core.internal.zzcs<zzeb> zzcsVar9) {
        this.f19729a = zzcsVar;
        this.f19730b = zzcsVar2;
        this.f19731c = zzcsVar3;
        this.f19732d = zzcsVar4;
        this.f19733e = zzcsVar5;
        this.f19734f = zzcsVar6;
        this.f19735g = zzcsVar7;
        this.f19736h = zzcsVar8;
        this.f19737i = zzcsVar9;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzbb mo10658u() {
        Context m10820a = ((zzu) this.f19729a).m10820a();
        zzde mo10658u = this.f19730b.mo10658u();
        zzcl mo10658u2 = this.f19731c.mo10658u();
        com.google.android.play.core.internal.zzco m10898a = com.google.android.play.core.internal.zzcq.m10898a(this.f19732d);
        zzco mo10658u3 = this.f19733e.mo10658u();
        return new zzbb(m10820a, mo10658u, mo10658u2, m10898a, mo10658u3, this.f19734f.mo10658u(), com.google.android.play.core.internal.zzcq.m10898a(this.f19735g), com.google.android.play.core.internal.zzcq.m10898a(this.f19736h), this.f19737i.mo10658u());
    }
}
