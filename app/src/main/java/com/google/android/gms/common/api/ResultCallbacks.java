package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    /* renamed from: a */
    public final void mo7961a(@NonNull R r) {
        Status mo7862k = r.mo7862k();
        if (mo7862k.m7964n()) {
            m7962c(r);
            return;
        }
        mo7959b(mo7862k);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException e2) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e2);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo7959b(@NonNull Status status);

    /* renamed from: c */
    public abstract void m7962c(@NonNull R r);
}
