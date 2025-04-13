package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class StatusPendingResult extends BasePendingResult<Status> {
    @KeepForSdk
    public StatusPendingResult(@NonNull GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Status mo7880d(@NonNull Status status) {
        return status;
    }
}
