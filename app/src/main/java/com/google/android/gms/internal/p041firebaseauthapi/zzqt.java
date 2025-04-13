package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqt implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16734a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16735b;

    public zzqt(zzrx zzrxVar, zzts zztsVar) {
        this.f16735b = zzrxVar;
        this.f16734a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16734a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxz zzxzVar = (zzxz) obj;
        this.f16735b.m9352b(new zzwq(zzxzVar.f17098c, zzxzVar.f17097b, Long.valueOf(zzxzVar.f17099d), "Bearer"), null, null, Boolean.valueOf(zzxzVar.f17100e), null, this.f16734a, this);
    }
}
