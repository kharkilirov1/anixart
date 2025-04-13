package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zztj extends zzut {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzns zznsVar = new zzns(this.f16864d.mo12247f1(), null);
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Preconditions.m8129d(zznsVar.f16620b);
        Preconditions.m8129d(zznsVar.f16621c);
        Objects.requireNonNull(zzuqVar, "null reference");
        zzrx zzrxVar = zzttVar.f16822a;
        String str = zznsVar.f16620b;
        String str2 = zznsVar.f16621c;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        Preconditions.m8129d(str2);
        zzrxVar.m9351a(str, new zzrt(zzrxVar, str2, zztsVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        ((zzg) this.f16865e).mo12317a(this.f16869i, zztq.m9356e(this.f16863c, this.f16870j));
        m9440g(null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "updateEmail";
    }
}
