package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzh;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzsn extends zzut {

    /* renamed from: r */
    public final zzpe f16805r;

    public zzsn(AuthCredential authCredential, @Nullable String str) {
        super(2);
        Preconditions.m8132g(authCredential, "credential cannot be null");
        zzxq m12318a = zzh.m12318a(authCredential, str);
        m12318a.f17054k = false;
        this.f16805r = new zzpe(m12318a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzttVar.m9393d(this.f16805r, this.f16862b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        zzx m9356e = zztq.m9356e(this.f16863c, this.f16870j);
        if (!this.f16864d.mo12255q().equalsIgnoreCase(m9356e.f22438c.f22429b)) {
            Status status = new Status(17024, null);
            this.f16875o = true;
            this.f16877q.m9435a(null, status);
        } else {
            ((zzg) this.f16865e).mo12317a(this.f16869i, m9356e);
            zzr zzrVar = new zzr(m9356e);
            this.f16875o = true;
            this.f16877q.m9435a(zzrVar, null);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "reauthenticateWithCredentialWithData";
    }
}
