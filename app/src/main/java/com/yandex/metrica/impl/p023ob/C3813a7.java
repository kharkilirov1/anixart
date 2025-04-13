package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.a7 */
/* loaded from: classes2.dex */
public final class C3813a7 {

    /* renamed from: a */
    private final C3407K0 f44730a;

    public C3813a7(@NotNull C3407K0 c3407k0) {
        this.f44730a = c3407k0;
    }

    @NotNull
    /* renamed from: a */
    public final C4203p7 m19571a(@NotNull PluginErrorDetails pluginErrorDetails) {
        return C4229q7.m20570a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f44730a.m18424a(), this.f44730a.m18425b());
    }
}
