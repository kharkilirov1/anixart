package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: o */
    public static final /* synthetic */ int f15351o = 0;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    /* renamed from: d */
    public final BatchResult mo7880d(@NonNull Status status) {
        return new BatchResult(status, null);
    }
}
