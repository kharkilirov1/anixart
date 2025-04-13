package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zztp extends zzut {

    /* renamed from: r */
    public final zzoy f16818r;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzoy zzoyVar = this.f16818r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzuqVar, "null reference");
        Objects.requireNonNull(zzoyVar, "null reference");
        zzxd zzxdVar = zzoyVar.f16655b;
        Objects.requireNonNull(zzxdVar, "null reference");
        String str = zzxdVar.f16996b;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        if (zzttVar.f16823b.m9458f(str)) {
            if (!zzxdVar.f16998d) {
                zzttVar.f16823b.m9455c(zztsVar, str);
                return;
            }
            zzttVar.f16823b.m9456d(str);
        }
        long j2 = zzxdVar.f16997c;
        boolean z = zzxdVar.f17002h;
        if (zztt.m9390a(j2, z)) {
            zzxdVar.f17004j = new zzvs(zzttVar.f16823b.m9454a());
        }
        zzttVar.f16823b.m9457e(str, zztsVar, j2, z);
        zzrx zzrxVar = zzttVar.f16822a;
        zzvk zzvkVar = new zzvk(zzttVar.f16823b, zztsVar, str);
        Objects.requireNonNull(zzrxVar);
        Preconditions.m8129d(zzxdVar.f16996b);
        zzrxVar.f16798a.mo9421g(zzxdVar, new zzqs(zzvkVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "verifyPhoneNumber";
    }
}
