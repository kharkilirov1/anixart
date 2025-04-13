package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.w */
/* loaded from: classes2.dex */
public class C4377w {

    /* renamed from: c */
    public static final long f46831c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private long f46832a;

    /* renamed from: b */
    @NonNull
    private final C3504Nm f46833b;

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ c f46834a;

        public a(C4377w c4377w, c cVar) {
            this.f46834a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46834a.mo17830a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public static class b {

        /* renamed from: a */
        private boolean f46835a = false;

        /* renamed from: b */
        @NonNull
        private final c f46836b;

        /* renamed from: c */
        @NonNull
        private final C4377w f46837c;

        /* renamed from: com.yandex.metrica.impl.ob.w$b$a */
        public class a implements c {

            /* renamed from: a */
            public final /* synthetic */ Runnable f46838a;

            public a(Runnable runnable) {
                this.f46838a = runnable;
            }

            @Override // com.yandex.metrica.impl.p023ob.C4377w.c
            /* renamed from: a */
            public void mo17830a() {
                b.this.f46835a = true;
                this.f46838a.run();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.w$b$b, reason: collision with other inner class name */
        public class RunnableC7008b implements Runnable {
            public RunnableC7008b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f46836b.mo17830a();
            }
        }

        @VisibleForTesting
        public b(@NonNull Runnable runnable, @NonNull C4377w c4377w) {
            this.f46836b = new a(runnable);
            this.f46837c = c4377w;
        }

        /* renamed from: a */
        public void m21072a(long j2, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
            if (!this.f46835a) {
                this.f46837c.m21069a(j2, interfaceExecutorC4297sn, this.f46836b);
            } else {
                ((C4271rn) interfaceExecutorC4297sn).execute(new RunnableC7008b());
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$c */
    public interface c {
        /* renamed from: a */
        void mo17830a();
    }

    public C4377w() {
        this(new C3504Nm());
    }

    /* renamed from: a */
    public void m21068a() {
        Objects.requireNonNull(this.f46833b);
        this.f46832a = System.currentTimeMillis();
    }

    @VisibleForTesting
    public C4377w(@NonNull C3504Nm c3504Nm) {
        this.f46833b = c3504Nm;
    }

    /* renamed from: a */
    public void m21069a(long j2, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull c cVar) {
        Objects.requireNonNull(this.f46833b);
        C4271rn c4271rn = (C4271rn) interfaceExecutorC4297sn;
        c4271rn.m20673a(new a(this, cVar), Math.max(j2 - (System.currentTimeMillis() - this.f46832a), 0L));
    }
}
