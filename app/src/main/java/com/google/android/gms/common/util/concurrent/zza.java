package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zza implements Runnable {

    /* renamed from: b */
    public final Runnable f15911b;

    public zza(Runnable runnable) {
        this.f15911b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f15911b.run();
    }
}
