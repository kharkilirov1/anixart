package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzss extends zzut {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzttVar.m9396g(null, this.f16862b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        zzx m9356e = zztq.m9356e(this.f16863c, this.f16870j);
        if (this.f16864d.mo12255q().equalsIgnoreCase(m9356e.f22438c.f22429b)) {
            ((zzg) this.f16865e).mo12317a(this.f16869i, m9356e);
            m9440g(null);
        } else {
            Status status = new Status(17024, null);
            this.f16875o = true;
            this.f16877q.m9435a(null, status);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "reauthenticateWithPhoneCredential";
    }
}
