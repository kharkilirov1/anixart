package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.p039authapi.zbo;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zba extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: a */
    public final /* synthetic */ Api.Client mo7838a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zbo(context, looper, clientSettings, (Auth.AuthCredentialsOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
