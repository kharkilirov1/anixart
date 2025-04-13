package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzdp implements com.google.android.play.core.internal.zzcs<zzdo> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<String> f19947a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzbb> f19948b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzco> f19949c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzcs<Context> f19950d;

    /* renamed from: e */
    public final com.google.android.play.core.internal.zzcs<zzed> f19951e;

    /* renamed from: f */
    public final com.google.android.play.core.internal.zzcs<Executor> f19952f;

    /* renamed from: g */
    public final com.google.android.play.core.internal.zzcs<zzeb> f19953g;

    public zzdp(com.google.android.play.core.internal.zzcs<String> zzcsVar, com.google.android.play.core.internal.zzcs<zzbb> zzcsVar2, com.google.android.play.core.internal.zzcs<zzco> zzcsVar3, com.google.android.play.core.internal.zzcs<Context> zzcsVar4, com.google.android.play.core.internal.zzcs<zzed> zzcsVar5, com.google.android.play.core.internal.zzcs<Executor> zzcsVar6, com.google.android.play.core.internal.zzcs<zzeb> zzcsVar7) {
        this.f19947a = zzcsVar;
        this.f19948b = zzcsVar2;
        this.f19949c = zzcsVar3;
        this.f19950d = zzcsVar4;
        this.f19951e = zzcsVar5;
        this.f19952f = zzcsVar6;
        this.f19953g = zzcsVar7;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzdo mo10658u() {
        String mo10658u = this.f19947a.mo10658u();
        zzbb mo10658u2 = this.f19948b.mo10658u();
        zzco mo10658u3 = this.f19949c.mo10658u();
        Context m10820a = ((zzu) this.f19950d).m10820a();
        zzed mo10658u4 = this.f19951e.mo10658u();
        return new zzdo(mo10658u != null ? new File(m10820a.getExternalFilesDir(null), mo10658u) : m10820a.getExternalFilesDir(null), mo10658u2, mo10658u3, m10820a, mo10658u4, com.google.android.play.core.internal.zzcq.m10898a(this.f19952f), this.f19953g.mo10658u());
    }
}
