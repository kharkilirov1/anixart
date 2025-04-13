package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzt implements com.google.android.play.core.internal.zzcs<zzy> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<Context> f20072a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<zzaw> f20073b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzcs<zzdo> f20074c;

    public zzt(com.google.android.play.core.internal.zzcs<Context> zzcsVar, com.google.android.play.core.internal.zzcs<zzaw> zzcsVar2, com.google.android.play.core.internal.zzcs<zzdo> zzcsVar3) {
        this.f20072a = zzcsVar;
        this.f20073b = zzcsVar2;
        this.f20074c = zzcsVar3;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final zzy mo10658u() {
        zzy zzyVar = zzp.m10819a(((zzu) this.f20072a).m10820a()) == null ? (zzy) com.google.android.play.core.internal.zzcq.m10898a(this.f20073b).mo10897u() : (zzy) com.google.android.play.core.internal.zzcq.m10898a(this.f20074c).mo10897u();
        Objects.requireNonNull(zzyVar, "Cannot return null from a non-@Nullable @Provides method");
        return zzyVar;
    }
}
