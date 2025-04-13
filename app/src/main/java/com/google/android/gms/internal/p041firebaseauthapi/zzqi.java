package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzai;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzqi implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ EmailAuthCredential f16706a;

    /* renamed from: b */
    public final /* synthetic */ zzts f16707b;

    /* renamed from: c */
    public final /* synthetic */ zzrx f16708c;

    public zzqi(zzrx zzrxVar, EmailAuthCredential emailAuthCredential, zzts zztsVar) {
        this.f16708c = zzrxVar;
        this.f16706a = emailAuthCredential;
        this.f16707b = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(@Nullable String str) {
        this.f16707b.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzvy zzvyVar = new zzvy(this.f16706a, ((zzwq) obj).f16970c);
        zzrx zzrxVar = this.f16708c;
        zzts zztsVar = this.f16707b;
        Objects.requireNonNull(zzrxVar);
        Objects.requireNonNull(zztsVar, "null reference");
        zzrxVar.f16798a.mo9416b(zzvyVar, new zzqj(zzrxVar, zztsVar));
    }
}
