package com.yandex.metrica.impl.p023ob;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Mb */
/* loaded from: classes2.dex */
public final class C3468Mb {

    /* renamed from: a */
    private AbstractRunnableC3429Km f43417a;

    /* renamed from: b */
    private volatile boolean f43418b;

    /* renamed from: c */
    private final InterfaceExecutorC4297sn f43419c;

    /* renamed from: com.yandex.metrica.impl.ob.Mb$a */
    public static final class a extends AbstractRunnableC3429Km {

        /* renamed from: b */
        public final /* synthetic */ b f43421b;

        /* renamed from: c */
        public final /* synthetic */ C3592Rb f43422c;

        /* renamed from: d */
        public final /* synthetic */ long f43423d;

        public a(b bVar, C3592Rb c3592Rb, long j2) {
            this.f43421b = bVar;
            this.f43422c = c3592Rb;
            this.f43423d = j2;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() {
            if (C3468Mb.this.f43418b) {
                return;
            }
            this.f43421b.m18586a(true);
            this.f43422c.m18963a();
            ((C4271rn) C3468Mb.this.f43419c).m20674a(C3468Mb.m18583b(C3468Mb.this), this.f43423d, TimeUnit.SECONDS);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Mb$b */
    public static final class b {

        /* renamed from: a */
        private volatile boolean f43424a;

        public b(boolean z) {
            this.f43424a = z;
        }

        /* renamed from: a */
        public final boolean m18587a() {
            return this.f43424a;
        }

        public /* synthetic */ b(boolean z, int i2) {
            this((i2 & 1) != 0 ? false : z);
        }

        /* renamed from: a */
        public final void m18586a(boolean z) {
            this.f43424a = z;
        }
    }

    public C3468Mb(@NotNull C4344ui c4344ui, @NotNull b bVar, @NotNull Random random, @NotNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NotNull C3592Rb c3592Rb) {
        this.f43419c = interfaceExecutorC4297sn;
        this.f43417a = new a(bVar, c3592Rb, c4344ui.m20893b());
        if (bVar.m18587a()) {
            AbstractRunnableC3429Km abstractRunnableC3429Km = this.f43417a;
            if (abstractRunnableC3429Km != null) {
                abstractRunnableC3429Km.run();
                return;
            } else {
                Intrinsics.m32189r("periodicRunnable");
                throw null;
            }
        }
        long mo32227c = random.mo32227c(c4344ui.m20892a() + 1);
        AbstractRunnableC3429Km abstractRunnableC3429Km2 = this.f43417a;
        if (abstractRunnableC3429Km2 == null) {
            Intrinsics.m32189r("periodicRunnable");
            throw null;
        }
        ((C4271rn) interfaceExecutorC4297sn).m20674a(abstractRunnableC3429Km2, mo32227c, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractRunnableC3429Km m18583b(C3468Mb c3468Mb) {
        AbstractRunnableC3429Km abstractRunnableC3429Km = c3468Mb.f43417a;
        if (abstractRunnableC3429Km != null) {
            return abstractRunnableC3429Km;
        }
        Intrinsics.m32189r("periodicRunnable");
        throw null;
    }

    /* renamed from: a */
    public final void m18585a() {
        this.f43418b = true;
        InterfaceExecutorC4297sn interfaceExecutorC4297sn = this.f43419c;
        AbstractRunnableC3429Km abstractRunnableC3429Km = this.f43417a;
        if (abstractRunnableC3429Km != null) {
            ((C4271rn) interfaceExecutorC4297sn).m20672a(abstractRunnableC3429Km);
        } else {
            Intrinsics.m32189r("periodicRunnable");
            throw null;
        }
    }
}
