package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zag<R extends Result> extends BasePendingResult<R> {

    /* renamed from: o */
    public final R f15619o;

    public zag(GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.f15619o = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final R mo7880d(Status status) {
        return this.f15619o;
    }
}
