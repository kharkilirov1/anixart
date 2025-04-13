package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabp implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a */
    public final /* synthetic */ zabq f15523a;

    public zabp(zabq zabqVar) {
        this.f15523a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    /* renamed from: a */
    public final void mo8046a() {
        this.f15523a.f15536m.f15427o.post(new zabo(this));
    }
}
