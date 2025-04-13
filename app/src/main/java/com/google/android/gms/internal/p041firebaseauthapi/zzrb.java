package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrb implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ String f16755a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16756b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16757c;

    public zzrb(zzrx zzrxVar, String str, zzts zztsVar) {
        this.f16757c = zzrxVar;
        this.f16755a = str;
        this.f16756b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16756b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzwq zzwqVar = (zzwq) obj;
        this.f16757c.f16798a.mo9419e(new zzwg(zzwqVar.f16970c), new zzra(this, this, zzwqVar));
    }
}
