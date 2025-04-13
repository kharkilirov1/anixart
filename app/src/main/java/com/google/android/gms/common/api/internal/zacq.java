package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacq implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zact f15566b;

    public zacq(zact zactVar) {
        this.f15566b = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15566b.f15576g.mo8066b(new ConnectionResult(4));
    }
}
