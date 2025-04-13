package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzsv extends zzut {

    /* renamed from: r */
    @NonNull
    public final zzou f16809r;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzou zzouVar = this.f16809r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzouVar, "null reference");
        Preconditions.m8129d(zzouVar.f16650b);
        Objects.requireNonNull(zzuqVar, "null reference");
        zzrx zzrxVar = zzttVar.f16822a;
        String str = zzouVar.f16650b;
        ActionCodeSettings actionCodeSettings = zzouVar.f16651c;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        zzwn zzwnVar = new zzwn(4);
        Preconditions.m8129d(str);
        zzwnVar.f16965e = str;
        if (actionCodeSettings != null) {
            zzwnVar.f16966f = actionCodeSettings;
        }
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
        return "sendEmailVerification";
    }
}
