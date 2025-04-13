package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @NonNull
    /* renamed from: a */
    public final Exception mo7966a(@NonNull Status status) {
        return status.f15380c == 8 ? new FirebaseException(status.m7965u()) : new FirebaseApiNotAvailableException(status.m7965u());
    }
}
