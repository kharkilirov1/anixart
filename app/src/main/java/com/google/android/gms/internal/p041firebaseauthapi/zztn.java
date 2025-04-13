package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zztn extends zzut {

    /* renamed from: r */
    public final zzqa f16817r;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzqa zzqaVar = this.f16817r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzqaVar, "null reference");
        ActionCodeSettings actionCodeSettings = zzqaVar.f16694d;
        String str = zzqaVar.f16692b;
        String str2 = zzqaVar.f16693c;
        Preconditions.m8129d(str);
        Preconditions.m8129d(str2);
        Objects.requireNonNull(actionCodeSettings, "null reference");
        zzwn zzwnVar = new zzwn(actionCodeSettings, str2, str);
        zzrx zzrxVar = zzttVar.f16822a;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        zzrxVar.f16798a.mo9420f(zzwnVar, new zzrp(zztsVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        m9440g(null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "verifyBeforeUpdateEmail";
    }
}
