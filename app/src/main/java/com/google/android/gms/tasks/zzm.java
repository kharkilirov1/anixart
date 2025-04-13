package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzm implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17277b;

    /* renamed from: c */
    public final /* synthetic */ zzn f17278c;

    public zzm(zzn zznVar, Task task) {
        this.f17278c = zznVar;
        this.f17277b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17278c.f17280c) {
            OnSuccessListener<? super TResult> onSuccessListener = this.f17278c.f17281d;
            if (onSuccessListener != 0) {
                onSuccessListener.onSuccess(this.f17277b.mo9708m());
            }
        }
    }
}
