package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.internal.zzai;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzrp implements zzuy {

    /* renamed from: a */
    public final /* synthetic */ zzts f16782a;

    public zzrp(zzts zztsVar) {
        this.f16782a = zztsVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzux
    /* renamed from: a */
    public final void mo9345a(String str) {
        this.f16782a.mo9385d(zzai.m12298a(str));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuy
    /* renamed from: b */
    public final void mo9346b(Object obj) {
        zzts zztsVar = this.f16782a;
        Objects.requireNonNull(zztsVar);
        try {
            zztsVar.f16819a.mo9370c();
        } catch (RemoteException e2) {
            Logger logger = zztsVar.f16820b;
            Log.e(logger.f15834a, logger.m8206c("RemoteException when sending email verification response.", new Object[0]), e2);
        }
    }
}
