package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzbe extends GmsClient<zzbh> {

    /* renamed from: G */
    public final Bundle f16050G;

    public zzbe(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f16050G = authProxyOptions == null ? new Bundle() : new Bundle(authProxyOptions.f15047b);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: D */
    public final boolean mo8093D() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: q */
    public final boolean mo7946q() {
        ClientSettings clientSettings = this.f15713D;
        Account account = clientSettings.f15681a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (clientSettings.f15684d.get(AuthProxy.f15045a) == null) {
            return !clientSettings.f15682b.isEmpty();
        }
        throw null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: w */
    public final Bundle mo8109w() {
        return this.f16050G;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }
}
