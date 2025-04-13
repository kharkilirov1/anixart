package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqw implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzxy f16742a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16743b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16744c;

    public zzqw(zzrx zzrxVar, zzxy zzxyVar, zzts zztsVar) {
        this.f16744c = zzrxVar;
        this.f16742a = zzxyVar;
        this.f16743b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16743b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzxy zzxyVar = this.f16742a;
        zzxyVar.f17095f = ((zzwq) obj).f16970c;
        this.f16744c.f16798a.mo9427m(zzxyVar, new zzqv(this, this));
    }
}
