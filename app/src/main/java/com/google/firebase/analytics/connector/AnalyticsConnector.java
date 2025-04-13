package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
/* loaded from: classes2.dex */
public interface AnalyticsConnector {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    public interface AnalyticsConnectorHandle {
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    public interface AnalyticsConnectorListener {
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    public static class ConditionalUserProperty {
    }

    @KeepForSdk
    /* renamed from: a */
    void m12225a(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @KeepForSdk
    /* renamed from: b */
    void m12226b(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
