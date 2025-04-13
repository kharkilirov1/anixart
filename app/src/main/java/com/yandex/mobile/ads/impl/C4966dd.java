package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dd */
/* loaded from: classes3.dex */
public final class C4966dd<T extends ViewGroup> {

    /* renamed from: a */
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener f49632a;

    /* renamed from: b */
    @Nullable
    private InterfaceC5651qo<T> f49633b;

    public C4966dd(@NotNull ViewTreeObserver.OnPreDrawListener preDrawListener) {
        Intrinsics.m32179h(preDrawListener, "preDrawListener");
        this.f49632a = preDrawListener;
    }

    /* renamed from: a */
    public final void m23870a(@NotNull ViewGroup container) {
        Intrinsics.m32179h(container, "container");
        container.removeAllViews();
        InterfaceC5651qo<T> interfaceC5651qo = this.f49633b;
        if (interfaceC5651qo != null) {
            interfaceC5651qo.mo22713c();
        }
    }

    /* renamed from: a */
    public final void m23871a(@NotNull ViewGroup container, @NotNull T designView, @NotNull o70<T> layoutDesign) {
        Intrinsics.m32179h(container, "container");
        Intrinsics.m32179h(designView, "designView");
        Intrinsics.m32179h(layoutDesign, "layoutDesign");
        container.removeAllViews();
        Context context = container.getContext();
        Intrinsics.m32178g(context, "container.context");
        hg1.m25194a(container, designView, context, null, this.f49632a);
        InterfaceC5651qo<T> m27011a = layoutDesign.m27011a();
        this.f49633b = m27011a;
        if (m27011a != null) {
            m27011a.mo22712a(designView);
        }
    }
}
