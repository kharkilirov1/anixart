package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zztf extends zzut {

    /* renamed from: r */
    public final zzpq f16816r;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: a */
    public final void mo9353a(TaskCompletionSource taskCompletionSource, zztt zzttVar) {
        this.f16877q = new zzus(this, taskCompletionSource);
        zzpq zzpqVar = this.f16816r;
        zzuq zzuqVar = this.f16862b;
        Objects.requireNonNull(zzttVar);
        Objects.requireNonNull(zzpqVar, "null reference");
        Objects.requireNonNull(zzuqVar, "null reference");
        String str = zzpqVar.f16676b.f22338e;
        zzts zztsVar = new zzts(zzuqVar, zztt.f16821c);
        if (zzttVar.f16823b.m9458f(str)) {
            if (!zzpqVar.f16680f) {
                zzttVar.f16823b.m9455c(zztsVar, str);
                return;
            }
            zzttVar.f16823b.m9456d(str);
        }
        long j2 = zzpqVar.f16679e;
        boolean z = zzpqVar.f16684j;
        String str2 = zzpqVar.f16677c;
        PhoneMultiFactorInfo phoneMultiFactorInfo = zzpqVar.f16676b;
        String str3 = phoneMultiFactorInfo.f22335b;
        String str4 = phoneMultiFactorInfo.f22338e;
        String str5 = zzpqVar.f16678d;
        String str6 = zzpqVar.f16683i;
        String str7 = zzpqVar.f16682h;
        Preconditions.m8129d(str4);
        zzxm zzxmVar = new zzxm(str2, str3, str4, str5, str6, str7);
        if (zztt.m9390a(j2, z)) {
            zzxmVar.f17041i = new zzvs(zzttVar.f16823b.m9454a());
        }
        zzttVar.f16823b.m9457e(str, zztsVar, j2, z);
        zzrx zzrxVar = zzttVar.f16822a;
        zzvk zzvkVar = new zzvk(zzttVar.f16823b, zztsVar, str);
        Objects.requireNonNull(zzrxVar);
        zzrxVar.f16798a.mo9424j(zzxmVar, new zzrj(zzvkVar));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzut
    /* renamed from: b */
    public final void mo9354b() {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuv
    /* renamed from: u */
    public final String mo9355u() {
        return "startMfaSignInWithPhoneNumber";
    }
}
