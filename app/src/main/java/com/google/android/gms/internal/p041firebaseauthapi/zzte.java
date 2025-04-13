package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzte extends zzut {

    /* renamed from: r */
    public final zzpo f16815r;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzpo zzpoVar = this.f16815r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzpoVar, "null reference");
        Objects.requireNonNull(zzuqVar, "null reference");
        String str = zzpoVar.f16668c;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        if (zzttVar.f16823b.m9458f(str)) {
            if (!zzpoVar.f16671f) {
                zzttVar.f16823b.m9455c(zztsVar, str);
                return;
            }
            zzttVar.f16823b.m9456d(str);
        }
        long j2 = zzpoVar.f16670e;
        boolean z = zzpoVar.f16675j;
        String str2 = zzpoVar.f16667b;
        String str3 = zzpoVar.f16668c;
        String str4 = zzpoVar.f16669d;
        String str5 = zzpoVar.f16674i;
        String str6 = zzpoVar.f16673h;
        Preconditions.m8129d(str3);
        zzxk zzxkVar = new zzxk(str2, str3, str4, str5, str6);
        if (zztt.m9390a(j2, z)) {
            zzxkVar.f17032h = new zzvs(zzttVar.f16823b.m9454a());
        }
        zzttVar.f16823b.m9457e(str, zztsVar, j2, z);
        zzrx zzrxVar = zzttVar.f16822a;
        zzvk zzvkVar = new zzvk(zzttVar.f16823b, zztsVar, str);
        Objects.requireNonNull(zzrxVar);
        zzrxVar.f16798a.mo9423i(zzxkVar, new zzre(zzvkVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "startMfaEnrollmentWithPhoneNumber";
    }
}
