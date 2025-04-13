package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* renamed from: c */
    @NonNull
    public static final TelemetryLoggingOptions f15748c = new TelemetryLoggingOptions(null);

    /* renamed from: b */
    @Nullable
    public final String f15749b = null;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class Builder {
    }

    public /* synthetic */ TelemetryLoggingOptions(String str) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.m8123a(this.f15749b, ((TelemetryLoggingOptions) obj).f15749b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15749b});
    }
}
