package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzh f17263b;

    public zzg(zzh zzhVar) {
        this.f17263b = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17263b.f17265c) {
            OnCanceledListener onCanceledListener = this.f17263b.f17266d;
            if (onCanceledListener != null) {
                onCanceledListener.mo9695c();
            }
        }
    }
}
