package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.TransformedResult;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zada<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* renamed from: b */
    public static final void m8077b(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e2) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(result)), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: a */
    public final void mo7961a(R r) {
        throw null;
    }
}
