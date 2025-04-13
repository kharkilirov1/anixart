package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.impl.as */
/* loaded from: classes3.dex */
public final class C4822as implements bx0 {

    /* renamed from: a */
    private final Executor f48644a;

    /* renamed from: com.yandex.mobile.ads.impl.as$a */
    public class a implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Handler f48645a;

        public a(Handler handler) {
            this.f48645a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f48645a.post(runnable);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.as$b */
    public static class b implements Runnable {

        /* renamed from: b */
        private final zv0 f48646b;

        /* renamed from: c */
        private final tw0 f48647c;

        /* renamed from: d */
        private final Runnable f48648d;

        public b(zv0 zv0Var, tw0 tw0Var, Runnable runnable) {
            this.f48646b = zv0Var;
            this.f48647c = tw0Var;
            this.f48648d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48646b.m30328o()) {
                this.f48646b.m30319c("canceled-at-delivery");
                return;
            }
            tw0 tw0Var = this.f48647c;
            qh1 qh1Var = tw0Var.f55249c;
            if (qh1Var == null) {
                this.f48646b.mo23873a((zv0) tw0Var.f55247a);
            } else {
                this.f48646b.m30312a(qh1Var);
            }
            if (this.f48647c.f55250d) {
                this.f48646b.m30316a("intermediate-response");
            } else {
                this.f48646b.m30319c("done");
            }
            Runnable runnable = this.f48648d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C4822as(Handler handler) {
        this.f48644a = new a(handler);
    }

    /* renamed from: a */
    public final void m22619a(zv0<?> zv0Var, tw0<?> tw0Var, Runnable runnable) {
        zv0Var.m30329p();
        zv0Var.m30316a("post-response");
        Executor executor = this.f48644a;
        ((a) executor).f48645a.post(new b(zv0Var, tw0Var, runnable));
    }

    /* renamed from: a */
    public final void m22618a(zv0<?> zv0Var, qh1 qh1Var) {
        zv0Var.m30316a("post-error");
        tw0 m28763a = tw0.m28763a(qh1Var);
        Executor executor = this.f48644a;
        ((a) executor).f48645a.post(new b(zv0Var, m28763a, null));
    }
}
