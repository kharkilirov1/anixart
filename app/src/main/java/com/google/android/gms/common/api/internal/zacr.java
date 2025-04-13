package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.signin.SignInOptions;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacr implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ com.google.android.gms.signin.internal.zak f15567b;

    /* renamed from: c */
    public final /* synthetic */ zact f15568c;

    public zacr(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.f15568c = zactVar;
        this.f15567b = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact zactVar = this.f15568c;
        com.google.android.gms.signin.internal.zak zakVar = this.f15567b;
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = zact.f15569h;
        ConnectionResult connectionResult = zakVar.f17216c;
        if (connectionResult.m7914n()) {
            com.google.android.gms.common.internal.zav zavVar = zakVar.f17217d;
            Objects.requireNonNull(zavVar, "null reference");
            ConnectionResult connectionResult2 = zavVar.f15777d;
            if (!connectionResult2.m7914n()) {
                String valueOf = String.valueOf(connectionResult2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zactVar.f15576g.mo8066b(connectionResult2);
                zactVar.f15575f.mo7935b();
                return;
            }
            zactVar.f15576g.mo8067c(zavVar.m8189m(), zactVar.f15573d);
        } else {
            zactVar.f15576g.mo8066b(connectionResult);
        }
        zactVar.f15575f.mo7935b();
    }
}
