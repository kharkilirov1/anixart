package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class TaskUtil {
    @KeepForSdk
    /* renamed from: a */
    public static <TResult> void m8010a(@NonNull Status status, @Nullable TResult tresult, @NonNull TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.m7964n()) {
            taskCompletionSource.m9716b(tresult);
        } else {
            taskCompletionSource.m9715a(new ApiException(status));
        }
    }
}
