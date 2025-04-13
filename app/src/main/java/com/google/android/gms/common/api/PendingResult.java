package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class PendingResult<R extends Result> {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        /* renamed from: a */
        void mo7957a(@NonNull Status status);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo7955b(@NonNull StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: c */
    public abstract R mo7956c(long j2, @NonNull TimeUnit timeUnit);
}
