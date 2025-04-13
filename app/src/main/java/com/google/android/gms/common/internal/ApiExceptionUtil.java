package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class ApiExceptionUtil {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static ApiException m8086a(@NonNull Status status) {
        return status.m7963m() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
