package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class PendingResults {
    @KeepForSdk
    public PendingResults() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result> PendingResult<R> m7958a(@NonNull R r, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.m8127b(!((Status) r).m7964n(), "Status code must not be SUCCESS");
        zag zagVar = new zag(null, r);
        zagVar.mo7882a(r);
        return zagVar;
    }
}
