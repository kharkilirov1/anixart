package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacd<T> implements OnCompleteListener<T> {

    /* renamed from: a */
    public final GoogleApiManager f15550a;

    /* renamed from: b */
    public final int f15551b;

    /* renamed from: c */
    public final ApiKey<?> f15552c;

    /* renamed from: d */
    public final long f15553d;

    /* renamed from: e */
    public final long f15554e;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i2, ApiKey apiKey, long j2, long j3) {
        this.f15550a = googleApiManager;
        this.f15551b = i2;
        this.f15552c = apiKey;
        this.f15553d = j2;
        this.f15554e = j3;
    }

    @Nullable
    /* renamed from: a */
    public static ConnectionTelemetryConfiguration m8071a(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i2) {
        int[] iArr;
        int[] iArr2;
        zzj zzjVar = baseGmsClient.f15650A;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.f15808e;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.f15694c || ((iArr = connectionTelemetryConfiguration.f15696e) != null ? !ArrayUtils.m8234a(iArr, i2) : !((iArr2 = connectionTelemetryConfiguration.f15698g) == null || !ArrayUtils.m8234a(iArr2, i2))) || zabqVar.f15535l >= connectionTelemetryConfiguration.f15697f) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        long j3;
        int i6;
        if (this.f15550a.m7985b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.m8135a().f15738a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f15740c) {
                zabq<?> zabqVar = this.f15550a.f15423k.get(this.f15552c);
                if (zabqVar != null) {
                    Object obj = zabqVar.f15525b;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        int i7 = 0;
                        boolean z = this.f15553d > 0;
                        int i8 = baseGmsClient.f15672v;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.f15741d;
                            int i9 = rootTelemetryConfiguration.f15742e;
                            int i10 = rootTelemetryConfiguration.f15743f;
                            i2 = rootTelemetryConfiguration.f15739b;
                            if ((baseGmsClient.f15650A != null) && !baseGmsClient.m8098e()) {
                                ConnectionTelemetryConfiguration m8071a = m8071a(zabqVar, baseGmsClient, this.f15551b);
                                if (m8071a == null) {
                                    return;
                                }
                                boolean z2 = m8071a.f15695d && this.f15553d > 0;
                                i10 = m8071a.f15697f;
                                z = z2;
                            }
                            i3 = i9;
                            i4 = i10;
                        } else {
                            i2 = 0;
                            i3 = 5000;
                            i4 = 100;
                        }
                        GoogleApiManager googleApiManager = this.f15550a;
                        if (task.mo9712q()) {
                            i5 = 0;
                        } else {
                            if (task.mo9710o()) {
                                i7 = 100;
                            } else {
                                Exception mo9707l = task.mo9707l();
                                if (mo9707l instanceof ApiException) {
                                    Status status = ((ApiException) mo9707l).f15349b;
                                    int i11 = status.f15380c;
                                    ConnectionResult connectionResult = status.f15383f;
                                    i5 = connectionResult == null ? -1 : connectionResult.f15315c;
                                    i7 = i11;
                                } else {
                                    i7 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (z) {
                            long j4 = this.f15553d;
                            long currentTimeMillis = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - this.f15554e);
                            j2 = j4;
                            j3 = currentTimeMillis;
                        } else {
                            j2 = 0;
                            j3 = 0;
                            i6 = -1;
                        }
                        MethodInvocation methodInvocation = new MethodInvocation(this.f15551b, i7, i5, j2, j3, null, null, i8, i6);
                        long j5 = i3;
                        Handler handler = googleApiManager.f15427o;
                        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i2, j5, i4)));
                    }
                }
            }
        }
    }
}
