package com.google.android.gms.tasks;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzk implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17272b;

    /* renamed from: c */
    public final /* synthetic */ zzl f17273c;

    public zzk(zzl zzlVar, Task task) {
        this.f17273c = zzlVar;
        this.f17272b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17273c.f17275c) {
            OnFailureListener onFailureListener = this.f17273c.f17276d;
            if (onFailureListener != null) {
                Exception mo9707l = this.f17272b.mo9707l();
                Objects.requireNonNull(mo9707l, "null reference");
                onFailureListener.mo7337a(mo9707l);
            }
        }
    }
}
