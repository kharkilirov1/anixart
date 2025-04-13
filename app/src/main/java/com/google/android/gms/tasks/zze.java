package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zze implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17258b;

    /* renamed from: c */
    public final /* synthetic */ zzf f17259c;

    public zze(zzf zzfVar, Task task) {
        this.f17259c = zzfVar;
        this.f17258b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f17259c.f17261c.mo7340e(this.f17258b);
            if (task == null) {
                zzf zzfVar = this.f17259c;
                zzfVar.f17262d.m9731t(new NullPointerException("Continuation returned null"));
            } else {
                Executor executor = TaskExecutors.f17242b;
                task.mo9702g(executor, this.f17259c);
                task.mo9701f(executor, this.f17259c);
                task.mo9696a(executor, this.f17259c);
            }
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f17259c.f17262d.m9731t((Exception) e2.getCause());
            } else {
                this.f17259c.f17262d.m9731t(e2);
            }
        } catch (Exception e3) {
            this.f17259c.f17262d.m9731t(e3);
        }
    }
}
