package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrr implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16785a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16786b;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16785a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxj zzxjVar = (zzxj) obj;
        this.f16786b.m9352b(new zzwq(zzxjVar.f17024c, zzxjVar.f17023b, Long.valueOf(zzxjVar.f17025d), "Bearer"), null, null, Boolean.TRUE, null, this.f16785a, this);
    }
}
