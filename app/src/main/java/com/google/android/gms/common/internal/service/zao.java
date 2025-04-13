package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zao extends GoogleApi<TelemetryLoggingOptions> implements TelemetryLoggingClient {

    /* renamed from: k */
    public static final Api<TelemetryLoggingOptions> f15754k = new Api<>("ClientTelemetry.API", new zan(), new Api.ClientKey());

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, f15754k, telemetryLoggingOptions, GoogleApi.Settings.f15363c);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    /* renamed from: b */
    public final Task<Void> mo8137b(final TelemetryData telemetryData) {
        TaskApiCall.Builder m8008a = TaskApiCall.m8008a();
        m8008a.f15438c = new Feature[]{com.google.android.gms.internal.base.zad.f16209a};
        m8008a.f15437b = false;
        m8008a.f15436a = new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* renamed from: a */
            public final void mo8007a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                Api<TelemetryLoggingOptions> api = zao.f15754k;
                zai zaiVar = (zai) ((zap) obj).m8111y();
                Parcel m8534i = zaiVar.m8534i();
                com.google.android.gms.internal.base.zac.m8537b(m8534i, telemetryData2);
                try {
                    zaiVar.f16207a.transact(1, m8534i, null, 1);
                    m8534i.recycle();
                    taskCompletionSource.m9716b(null);
                } catch (Throwable th) {
                    m8534i.recycle();
                    throw th;
                }
            }
        };
        return m7949d(2, m8008a.m8009a());
    }
}
