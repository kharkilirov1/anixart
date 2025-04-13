package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrf implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16763a;

    /* renamed from: b */
    public final /* synthetic */ zzrx f16764b;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16763a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxu zzxuVar = (zzxu) obj;
        this.f16764b.m9352b(new zzwq(zzxuVar.f17080c, zzxuVar.f17079b, Long.valueOf(zzxuVar.f17081d), "Bearer"), null, null, Boolean.valueOf(zzxuVar.f17082e), null, this.f16763a, this);
    }
}
