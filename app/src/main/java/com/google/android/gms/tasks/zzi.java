package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzi implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17267b;

    /* renamed from: c */
    public final /* synthetic */ zzj f17268c;

    public zzi(zzj zzjVar, Task task) {
        this.f17268c = zzjVar;
        this.f17267b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17268c.f17270c) {
            OnCompleteListener<TResult> onCompleteListener = this.f17268c.f17271d;
            if (onCompleteListener != 0) {
                onCompleteListener.onComplete(this.f17267b);
            }
        }
    }
}
