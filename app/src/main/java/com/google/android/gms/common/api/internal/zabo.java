package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabo implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zabp f15522b;

    public zabo(zabp zabpVar) {
        this.f15522b = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f15522b.f15523a.f15525b;
        client.mo7937d(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
