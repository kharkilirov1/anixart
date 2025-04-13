package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzri implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16769a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16770b;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16769a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwd zzwdVar = (zzwd) obj;
        this.f16770b.m9352b(new zzwq(zzwdVar.f16942c, zzwdVar.f16941b, Long.valueOf(zzws.m9470a(zzwdVar.f16941b)), "Bearer"), null, null, Boolean.FALSE, null, this.f16769a, this);
    }
}
