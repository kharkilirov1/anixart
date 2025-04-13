package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class PendingResultUtil {

    /* renamed from: a */
    public static final zas f15735a = new zao();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @Nullable
        @KeepForSdk
        /* renamed from: a */
        T mo7839a(@NonNull R r);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result> Task<Void> m8125a(@NonNull PendingResult<R> pendingResult) {
        zar zarVar = new zar();
        zas zasVar = f15735a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.mo7955b(new zap(pendingResult, taskCompletionSource, zarVar, zasVar));
        return taskCompletionSource.f17240a;
    }
}
