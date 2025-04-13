package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbb extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: a */
    public final /* synthetic */ Api.Client mo7838a(Context context, Looper looper, ClientSettings clientSettings, @Nullable Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zbe(context, looper, clientSettings, (GoogleSignInOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
