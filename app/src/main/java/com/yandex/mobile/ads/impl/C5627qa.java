package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.AbstractC6202c;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qa */
/* loaded from: classes3.dex */
public final class C5627qa {

    /* renamed from: a */
    @NotNull
    private final List<C5276ja<?>> f53988a;

    /* renamed from: b */
    @NotNull
    private final C4953d2 f53989b;

    /* renamed from: c */
    @NotNull
    private final bv0 f53990c;

    /* renamed from: d */
    @NotNull
    private final l20 f53991d;

    /* renamed from: e */
    @Nullable
    private final a80 f53992e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5627qa(@NotNull List<? extends C5276ja<?>> assets, @NotNull C4953d2 adClickHandler, @NotNull bv0 renderedTimer, @NotNull l20 impressionEventsObservable, @Nullable a80 a80Var) {
        Intrinsics.m32179h(assets, "assets");
        Intrinsics.m32179h(adClickHandler, "adClickHandler");
        Intrinsics.m32179h(renderedTimer, "renderedTimer");
        Intrinsics.m32179h(impressionEventsObservable, "impressionEventsObservable");
        this.f53988a = assets;
        this.f53989b = adClickHandler;
        this.f53990c = renderedTimer;
        this.f53991d = impressionEventsObservable;
        this.f53992e = a80Var;
    }

    @NotNull
    /* renamed from: a */
    public final C5572pa m27664a(@NotNull AbstractC6202c clickListenerFactory, @NotNull C6264w<View> viewAdapter) {
        Intrinsics.m32179h(clickListenerFactory, "clickListenerFactory");
        Intrinsics.m32179h(viewAdapter, "viewAdapter");
        return new C5572pa(clickListenerFactory, this.f53988a, this.f53989b, viewAdapter, this.f53990c, this.f53991d, this.f53992e);
    }
}
