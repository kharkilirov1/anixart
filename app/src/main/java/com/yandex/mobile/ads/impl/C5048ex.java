package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.InterfaceC5149gx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ex */
/* loaded from: classes3.dex */
public final class C5048ex<T extends InterfaceC5149gx> {

    /* renamed from: a */
    @NotNull
    private final InterfaceC6094yw<T> f50072a;

    public C5048ex(@NotNull InterfaceC6094yw<T> fullscreenAdItemControllerFactory) {
        Intrinsics.m32179h(fullscreenAdItemControllerFactory, "fullscreenAdItemControllerFactory");
        this.f50072a = fullscreenAdItemControllerFactory;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC6044xw<T> m24275a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a != null ? m29824a.m23566E() : false) {
            return new C4943cx(context, this.f50072a, new C6145zw(m29824a != null ? Long.valueOf(m29824a.m23602k()) : null));
        }
        return this.f50072a.mo23560a(context);
    }
}
