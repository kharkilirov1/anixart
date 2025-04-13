package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3468Mb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Nb */
/* loaded from: classes2.dex */
public final class C3493Nb {

    /* renamed from: a */
    private final C3468Mb.b f43464a = new C3468Mb.b(false, 1);

    @NotNull
    /* renamed from: a */
    public final C3468Mb m18612a(@NotNull C4344ui c4344ui) {
        C3468Mb.b bVar = this.f43464a;
        Random.Default r3 = Random.f63365b;
        C3532P0 m18696i = C3532P0.m18696i();
        Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
        C4479zn m18716s = m18696i.m18716s();
        Intrinsics.m32178g(m18716s, "GlobalServiceLocator.get…).serviceExecutorProvider");
        InterfaceExecutorC4297sn m21323h = m18716s.m21323h();
        Intrinsics.m32178g(m21323h, "GlobalServiceLocator.get…ortDataCollectingExecutor");
        C3518Ob c3518Ob = new C3518Ob(c4344ui);
        InterfaceC3706W0 m18679a = C3524Oh.m18679a();
        Intrinsics.m32178g(m18679a, "YandexMetricaSelfReportFacade.getReporter()");
        return new C3468Mb(c4344ui, bVar, r3, m21323h, new C3592Rb(c3518Ob, new C3568Qb(c4344ui, m18679a)));
    }
}
