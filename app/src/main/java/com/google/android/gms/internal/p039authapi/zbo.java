package com.google.android.gms.internal.p039authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbo extends GmsClient {

    /* renamed from: G */
    public final Auth.AuthCredentialsOptions f16020G;

    public zbo(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Auth.AuthCredentialsOptions.Builder builder = new Auth.AuthCredentialsOptions.Builder(authCredentialsOptions == null ? Auth.AuthCredentialsOptions.f15040d : authCredentialsOptions);
        byte[] bArr = new byte[16];
        zbbb.f16016a.nextBytes(bArr);
        builder.f15044b = Base64.encodeToString(bArr, 11);
        this.f16020G = new Auth.AuthCredentialsOptions(builder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbt ? (zbt) queryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: w */
    public final Bundle mo8109w() {
        Auth.AuthCredentialsOptions authCredentialsOptions = this.f16020G;
        Objects.requireNonNull(authCredentialsOptions);
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", authCredentialsOptions.f15041b);
        bundle.putString("log_session_id", authCredentialsOptions.f15042c);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
}
