package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.plugins.YandexMetricaPlugins;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.q3 */
/* loaded from: classes2.dex */
public final class C4225q3 {

    /* renamed from: a */
    @NotNull
    private static final YandexMetricaPlugins f46227a;

    static {
        C3755Y m19410g = C3755Y.m19410g();
        Intrinsics.m32178g(m19410g, "ClientServiceLocator.getInstance()");
        InterfaceExecutorC4297sn m19413c = m19410g.m19413c();
        Intrinsics.m32178g(m19413c, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f46227a = new C4199p3(new C4342ug(m19413c));
    }

    @NotNull
    /* renamed from: a */
    public static final YandexMetricaPlugins m20569a() {
        return f46227a;
    }
}
