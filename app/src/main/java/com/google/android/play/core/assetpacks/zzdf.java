package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzdf implements com.google.android.play.core.internal.zzcs<zzde> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<zzbh> f19916a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzy> f19917b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzco> f19918c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzcs<Executor> f19919d;

    public zzdf(com.google.android.play.core.internal.zzcs<zzbh> zzcsVar, com.google.android.play.core.internal.zzcs<zzy> zzcsVar2, com.google.android.play.core.internal.zzcs<zzco> zzcsVar3, com.google.android.play.core.internal.zzcs<Executor> zzcsVar4) {
        this.f19916a = zzcsVar;
        this.f19917b = zzcsVar2;
        this.f19918c = zzcsVar3;
        this.f19919d = zzcsVar4;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzde mo10658u() {
        zzbh mo10658u = this.f19916a.mo10658u();
        return new zzde(mo10658u, com.google.android.play.core.internal.zzcq.m10898a(this.f19917b), this.f19918c.mo10658u(), com.google.android.play.core.internal.zzcq.m10898a(this.f19919d));
    }
}
