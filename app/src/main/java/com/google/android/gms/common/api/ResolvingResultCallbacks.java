package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    /* renamed from: b */
    public final void mo7959b(@NonNull Status status) {
        if (!status.m7963m()) {
            m7960d(status);
            return;
        }
        try {
            if (status.m7963m()) {
                PendingIntent pendingIntent = status.f15382e;
                Objects.requireNonNull(pendingIntent, "null reference");
                pendingIntent.getIntentSender();
                throw null;
            }
        } catch (IntentSender.SendIntentException e2) {
            Log.e("ResolvingResultCallback", "Failed to start resolution", e2);
            m7960d(new Status(8, null));
        }
    }

    /* renamed from: d */
    public abstract void m7960d(@NonNull Status status);
}
