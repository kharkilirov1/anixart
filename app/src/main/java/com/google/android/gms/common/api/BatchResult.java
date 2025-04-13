package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class BatchResult implements Result {

    /* renamed from: b */
    public final Status f15352b;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f15352b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    /* renamed from: k */
    public Status mo7862k() {
        return this.f15352b;
    }
}
