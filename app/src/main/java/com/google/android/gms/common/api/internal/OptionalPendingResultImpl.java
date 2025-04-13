package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: b */
    public final void mo7955b(@NonNull PendingResult.StatusListener statusListener) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    /* renamed from: c */
    public final R mo7956c(long j2, @NonNull TimeUnit timeUnit) {
        throw null;
    }
}
