package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzi extends GmsClient<zzp> {
    public zzi(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 224, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: B */
    public final boolean mo8091B() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: D */
    public final boolean mo8093D() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: d */
    public final void mo7937d(String str) {
        String valueOf = String.valueOf(str);
        Log.w("GoogleAuthSvcClientImpl", valueOf.length() != 0 ? "GoogleAuthServiceClientImpl disconnected with reason: ".concat(valueOf) : new String("GoogleAuthServiceClientImpl disconnected with reason: "));
        this.f15657g = str;
        m8096b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: u */
    public final Feature[] mo8107u() {
        return new Feature[]{com.google.android.gms.auth.zze.f15251b, com.google.android.gms.auth.zze.f15252c, com.google.android.gms.auth.zze.f15250a};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }
}
