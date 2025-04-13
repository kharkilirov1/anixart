package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzel implements com.google.android.play.core.internal.zzcs<zzek> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<zzbh> f20025a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzy> f20026b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzde> f20027c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzcs<Executor> f20028d;

    /* renamed from: e */
    public final com.google.android.play.core.internal.zzcs<zzco> f20029e;

    public zzel(com.google.android.play.core.internal.zzcs<zzbh> zzcsVar, com.google.android.play.core.internal.zzcs<zzy> zzcsVar2, com.google.android.play.core.internal.zzcs<zzde> zzcsVar3, com.google.android.play.core.internal.zzcs<Executor> zzcsVar4, com.google.android.play.core.internal.zzcs<zzco> zzcsVar5) {
        this.f20025a = zzcsVar;
        this.f20026b = zzcsVar2;
        this.f20027c = zzcsVar3;
        this.f20028d = zzcsVar4;
        this.f20029e = zzcsVar5;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzek mo10658u() {
        zzbh mo10658u = this.f20025a.mo10658u();
        return new zzek(mo10658u, com.google.android.play.core.internal.zzcq.m10898a(this.f20026b), this.f20027c.mo10658u(), com.google.android.play.core.internal.zzcq.m10898a(this.f20028d), this.f20029e.mo10658u());
    }
}
