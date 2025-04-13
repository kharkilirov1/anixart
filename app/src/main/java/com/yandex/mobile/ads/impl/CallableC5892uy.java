package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.uy */
/* loaded from: classes3.dex */
public final class CallableC5892uy implements Callable<C5771sy> {

    /* renamed from: a */
    @NotNull
    private final String f55702a;

    /* renamed from: b */
    @NotNull
    private final C5946vy f55703b;

    public CallableC5892uy(@NotNull String checkHost, @NotNull C5946vy hostAccessCheckerProvider) {
        Intrinsics.m32179h(checkHost, "checkHost");
        Intrinsics.m32179h(hostAccessCheckerProvider, "hostAccessCheckerProvider");
        this.f55702a = checkHost;
        this.f55703b = hostAccessCheckerProvider;
    }

    @Override // java.util.concurrent.Callable
    public final C5771sy call() {
        boolean mo27957a = this.f55703b.m29284a().mo27957a(this.f55702a);
        StringBuilder m26356a = l60.m26356a("Host ");
        m26356a.append(this.f55702a);
        m26356a.append(" reachability is ");
        m26356a.append(mo27957a);
        n60.m26809b(m26356a.toString(), new Object[0]);
        return new C5771sy(mo27957a);
    }

    public /* synthetic */ CallableC5892uy(String str) {
        this(str, new C5946vy());
    }
}
