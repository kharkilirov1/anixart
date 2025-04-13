package com.google.android.gms.internal.p039authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbw extends GmsClient {

    /* renamed from: G */
    public final Bundle f16023G;

    public zbw(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 223, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f16023G = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
    /* renamed from: l */
    public final int mo7877l() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof zbz ? (zbz) queryLocalInterface : new zbz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: u */
    public final Feature[] mo8107u() {
        return zbba.f16015a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: w */
    public final Bundle mo8109w() {
        return this.f16023G;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }
}
