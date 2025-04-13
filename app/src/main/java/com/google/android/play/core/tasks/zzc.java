package com.google.android.play.core.tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f20311b;

    /* renamed from: c */
    public final /* synthetic */ zzd f20312c;

    public zzc(zzd zzdVar, Task task) {
        this.f20312c = zzdVar;
        this.f20311b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20312c.f20314b) {
            OnFailureListener onFailureListener = this.f20312c.f20315c;
            if (onFailureListener != null) {
                onFailureListener.mo10817a(this.f20311b.mo11001e());
            }
        }
    }
}
