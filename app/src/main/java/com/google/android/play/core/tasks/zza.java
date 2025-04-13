package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f20306b;

    /* renamed from: c */
    public final /* synthetic */ zzb f20307c;

    public zza(zzb zzbVar, Task task) {
        this.f20307c = zzbVar;
        this.f20306b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20307c.f20309b) {
            OnCompleteListener<ResultT> onCompleteListener = this.f20307c.f20310c;
            if (onCompleteListener != 0) {
                onCompleteListener.mo10839a(this.f20306b);
            }
        }
    }
}
