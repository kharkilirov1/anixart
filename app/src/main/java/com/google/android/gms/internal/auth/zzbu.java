package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzbu implements ProxyApi.ProxyResult {

    /* renamed from: b */
    public final Status f16055b;

    public zzbu(ProxyResponse proxyResponse) {
        this.f16055b = Status.f15374g;
    }

    public zzbu(Status status) {
        this.f16055b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f16055b;
    }
}
