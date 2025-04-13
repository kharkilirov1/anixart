package com.google.android.gms.auth.api;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.auth.zzbt;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public final class AuthProxy {

    /* renamed from: a */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Api<AuthProxyOptions> f15045a = new Api<>("Auth.PROXY_API", new zza(), new Api.ClientKey());

    /* renamed from: b */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi f15046b = new zzbt();
}
