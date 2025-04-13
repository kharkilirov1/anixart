package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: b */
    @Nullable
    public static RootTelemetryConfigManager f15736b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f15737c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    @Nullable
    public RootTelemetryConfiguration f15738a;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static synchronized RootTelemetryConfigManager m8135a() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            if (f15736b == null) {
                f15736b = new RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = f15736b;
        }
        return rootTelemetryConfigManager;
    }
}
