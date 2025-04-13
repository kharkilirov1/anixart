package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzak implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ zzal f22365b;

    public zzak(zzal zzalVar) {
        this.f22365b = zzalVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(Exception exc) {
        long j2;
        if (exc instanceof FirebaseNetworkException) {
            Logger logger = zzam.f22368f;
            logger.m8207d("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            zzam zzamVar = this.f22365b.f22367c;
            int i2 = (int) zzamVar.f22370b;
            if (i2 == 30 || i2 == 60 || i2 == 120 || i2 == 240 || i2 == 480) {
                long j3 = zzamVar.f22370b;
                j2 = j3 + j3;
            } else {
                j2 = i2 != 960 ? 30L : 960L;
            }
            zzamVar.f22370b = j2;
            zzamVar.f22369a = (zzamVar.f22370b * 1000) + System.currentTimeMillis();
            logger.m8207d(C0000a.m11h("Scheduling refresh for ", zzamVar.f22369a), new Object[0]);
            zzamVar.f22372d.postDelayed(zzamVar.f22373e, zzamVar.f22370b * 1000);
        }
    }
}
