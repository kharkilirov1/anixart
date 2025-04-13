package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabt implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ConnectionResult f15539b;

    /* renamed from: c */
    public final /* synthetic */ zabu f15540c;

    public zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.f15540c = zabuVar;
        this.f15539b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        zabu zabuVar = this.f15540c;
        zabq<?> zabqVar = zabuVar.f15546f.f15423k.get(zabuVar.f15542b);
        if (zabqVar == null) {
            return;
        }
        if (!this.f15539b.m7914n()) {
            zabqVar.m8063s(this.f15539b, null);
            return;
        }
        zabu zabuVar2 = this.f15540c;
        zabuVar2.f15545e = true;
        if (zabuVar2.f15541a.mo7946q()) {
            zabu zabuVar3 = this.f15540c;
            if (!zabuVar3.f15545e || (iAccountAccessor = zabuVar3.f15543c) == null) {
                return;
            }
            zabuVar3.f15541a.mo7936c(iAccountAccessor, zabuVar3.f15544d);
            return;
        }
        try {
            Api.Client client = this.f15540c.f15541a;
            client.mo7936c(null, client.mo7934a());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            this.f15540c.f15541a.mo7937d("Failed to get service from broker.");
            zabqVar.m8063s(new ConnectionResult(10), null);
        }
    }
}
