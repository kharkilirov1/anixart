package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrg implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzrh f16765a;

    public zzrg(zzrh zzrhVar) {
        this.f16765a = zzrhVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16765a.f16767b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwb zzwbVar = (zzwb) obj;
        zzwq zzwqVar = new zzwq(zzwbVar.f16936c, zzwbVar.f16935b, Long.valueOf(zzws.m9470a(zzwbVar.f16935b)), "Bearer");
        zzrh zzrhVar = this.f16765a;
        zzrhVar.f16768c.m9352b(zzwqVar, null, null, Boolean.FALSE, null, zzrhVar.f16767b, this);
    }
}
