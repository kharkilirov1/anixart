package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzo;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzto extends zzut {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzttVar.m9391b(null, this.f16862b);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        if (new zzo(this.f16872l).f22421a == 0) {
            m9440g(this.f16872l.f16992b);
            return;
        }
        Status status = new Status(17499, null);
        this.f16875o = true;
        this.f16877q.m9435a(null, status);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "verifyPasswordResetCode";
    }
}
