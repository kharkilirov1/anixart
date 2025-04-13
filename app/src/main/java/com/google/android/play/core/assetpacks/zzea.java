package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzea implements com.google.android.play.core.internal.zzcs<zzdz> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<zzbh> f19984a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzy> f19985b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzde> f19986c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzcs<Executor> f19987d;

    /* renamed from: e */
    public final com.google.android.play.core.internal.zzcs<zzco> f19988e;

    /* renamed from: f */
    public final com.google.android.play.core.internal.zzcs<com.google.android.play.core.common.zza> f19989f;

    /* renamed from: g */
    public final com.google.android.play.core.internal.zzcs<zzeb> f19990g;

    public zzea(com.google.android.play.core.internal.zzcs<zzbh> zzcsVar, com.google.android.play.core.internal.zzcs<zzy> zzcsVar2, com.google.android.play.core.internal.zzcs<zzde> zzcsVar3, com.google.android.play.core.internal.zzcs<Executor> zzcsVar4, com.google.android.play.core.internal.zzcs<zzco> zzcsVar5, com.google.android.play.core.internal.zzcs<com.google.android.play.core.common.zza> zzcsVar6, com.google.android.play.core.internal.zzcs<zzeb> zzcsVar7) {
        this.f19984a = zzcsVar;
        this.f19985b = zzcsVar2;
        this.f19986c = zzcsVar3;
        this.f19987d = zzcsVar4;
        this.f19988e = zzcsVar5;
        this.f19989f = zzcsVar6;
        this.f19990g = zzcsVar7;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzdz mo10658u() {
        zzbh mo10658u = this.f19984a.mo10658u();
        com.google.android.play.core.internal.zzco m10898a = com.google.android.play.core.internal.zzcq.m10898a(this.f19985b);
        zzde mo10658u2 = this.f19986c.mo10658u();
        return new zzdz(mo10658u, m10898a, mo10658u2, com.google.android.play.core.internal.zzcq.m10898a(this.f19987d), this.f19988e.mo10658u(), this.f19989f.mo10658u(), this.f19990g.mo10658u());
    }
}
