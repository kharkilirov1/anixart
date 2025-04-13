package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzo implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Task f17282b;

    /* renamed from: c */
    public final /* synthetic */ zzp f17283c;

    public zzo(zzp zzpVar, Task task) {
        this.f17283c = zzpVar;
        this.f17282b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task mo7910a = this.f17283c.f17285c.mo7910a(this.f17282b.mo9708m());
            if (mo7910a == null) {
                zzp zzpVar = this.f17283c;
                zzpVar.f17286d.m9731t(new NullPointerException("Continuation returned null"));
            } else {
                Executor executor = TaskExecutors.f17242b;
                mo7910a.mo9702g(executor, this.f17283c);
                mo7910a.mo9701f(executor, this.f17283c);
                mo7910a.mo9696a(executor, this.f17283c);
            }
        } catch (RuntimeExecutionException e2) {
            if (!(e2.getCause() instanceof Exception)) {
                this.f17283c.f17286d.m9731t(e2);
                return;
            }
            zzp zzpVar2 = this.f17283c;
            zzpVar2.f17286d.m9731t((Exception) e2.getCause());
        } catch (CancellationException unused) {
            this.f17283c.f17286d.m9733v();
        } catch (Exception e3) {
            this.f17283c.f17286d.m9731t(e3);
        }
    }
}
