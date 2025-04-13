package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacy implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Result f15578b;

    /* renamed from: c */
    public final /* synthetic */ zada f15579c;

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        try {
            BasePendingResult.f15396n.set(Boolean.TRUE);
            Objects.requireNonNull(this.f15579c);
            Objects.requireNonNull((Object) null, "null reference");
            throw null;
        } catch (RuntimeException unused) {
            Objects.requireNonNull(this.f15579c);
            throw null;
        }
    }
}
