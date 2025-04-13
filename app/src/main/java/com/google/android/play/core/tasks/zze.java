package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zze implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f20316b;

    /* renamed from: c */
    public final /* synthetic */ zzf f20317c;

    public zze(zzf zzfVar, Task task) {
        this.f20317c = zzfVar;
        this.f20316b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20317c.f20319b) {
            OnSuccessListener<? super ResultT> onSuccessListener = this.f20317c.f20320c;
            if (onSuccessListener != 0) {
                onSuccessListener.onSuccess(this.f20316b.mo11002f());
            }
        }
    }
}
