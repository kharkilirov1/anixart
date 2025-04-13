package com.google.android.gms.common.internal.service;

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
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zap extends GmsClient<zai> {

    /* renamed from: G */
    public final TelemetryLoggingOptions f15755G;

    public zap(Context context, Looper looper, ClientSettings clientSettings, TelemetryLoggingOptions telemetryLoggingOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 270, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f15755G = telemetryLoggingOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: A */
    public final String mo7876A() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: B */
    public final boolean mo8091B() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    /* renamed from: l */
    public final int mo7877l() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    /* renamed from: s */
    public final /* synthetic */ IInterface mo7878s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof zai ? (zai) queryLocalInterface : new zai(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: u */
    public final Feature[] mo8107u() {
        return com.google.android.gms.internal.base.zad.f16210b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: w */
    public final Bundle mo8109w() {
        TelemetryLoggingOptions telemetryLoggingOptions = this.f15755G;
        Objects.requireNonNull(telemetryLoggingOptions);
        Bundle bundle = new Bundle();
        String str = telemetryLoggingOptions.f15749b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    /* renamed from: z */
    public final String mo7879z() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
}
