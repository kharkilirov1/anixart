package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzbv implements ProxyApi.SpatulaHeaderResult {

    /* renamed from: b */
    public final Status f16056b;

    public zzbv(@Nonnull Status status) {
        Objects.requireNonNull(status, "null reference");
        this.f16056b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f16056b;
    }

    public zzbv(@Nonnull String str) {
        this.f16056b = Status.f15374g;
    }
}
