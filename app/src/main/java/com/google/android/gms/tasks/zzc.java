package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17253b;

    /* renamed from: c */
    public final /* synthetic */ zzd f17254c;

    public zzc(zzd zzdVar, Task task) {
        this.f17254c = zzdVar;
        this.f17253b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17253b.mo9710o()) {
            this.f17254c.f17257d.m9733v();
            return;
        }
        try {
            this.f17254c.f17257d.m9732u(this.f17254c.f17256c.mo7340e(this.f17253b));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f17254c.f17257d.m9731t((Exception) e2.getCause());
            } else {
                this.f17254c.f17257d.m9731t(e2);
            }
        } catch (Exception e3) {
            this.f17254c.f17257d.m9731t(e3);
        }
    }
}
