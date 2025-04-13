package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzz implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzw f17298b;

    /* renamed from: c */
    public final /* synthetic */ Callable f17299c;

    public zzz(zzw zzwVar, Callable callable) {
        this.f17298b = zzwVar;
        this.f17299c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17298b.m9732u(this.f17299c.call());
        } catch (Exception e2) {
            this.f17298b.m9731t(e2);
        } catch (Throwable th) {
            this.f17298b.m9731t(new RuntimeException(th));
        }
    }
}
