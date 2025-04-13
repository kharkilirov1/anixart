package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzh;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzsj extends zzut {

    /* renamed from: r */
    public final zzxq f16802r;

    public zzsj(AuthCredential authCredential) {
        super(2);
        this.f16802r = zzh.m12318a(authCredential, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzoo zzooVar = new zzoo(this.f16864d.mo12247f1(), this.f16802r);
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Preconditions.m8129d(zzooVar.f16645b);
        Objects.requireNonNull(zzooVar.f16646c, "null reference");
        Objects.requireNonNull(zzuqVar, "null reference");
        zzrx zzrxVar = zzttVar.f16822a;
        String str = zzooVar.f16645b;
        zzxq zzxqVar = zzooVar.f16646c;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(str);
        Objects.requireNonNull(zzxqVar, "null reference");
        zzrxVar.m9351a(str, new zzqy(zzrxVar, zzxqVar, zztsVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
        zzx m9356e = zztq.m9356e(this.f16863c, this.f16870j);
        ((zzg) this.f16865e).mo12317a(this.f16869i, m9356e);
        zzr zzrVar = new zzr(m9356e);
        this.f16875o = true;
        this.f16877q.m9435a(zzrVar, null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "linkFederatedCredential";
    }
}
