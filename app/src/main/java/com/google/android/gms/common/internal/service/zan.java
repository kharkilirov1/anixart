package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zan extends Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: b */
    public final /* synthetic */ zap mo7851b(Context context, Looper looper, ClientSettings clientSettings, TelemetryLoggingOptions telemetryLoggingOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zap(context, looper, clientSettings, telemetryLoggingOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
