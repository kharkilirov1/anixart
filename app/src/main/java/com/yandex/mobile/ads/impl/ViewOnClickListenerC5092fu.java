package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fu */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5092fu implements View.OnClickListener {

    /* renamed from: a */
    @NotNull
    private final C4958d7 f50441a;

    /* renamed from: b */
    @NotNull
    private final C5380l7 f50442b;

    /* renamed from: c */
    @NotNull
    private final tf1 f50443c;

    /* renamed from: d */
    @NotNull
    private final le1 f50444d;

    public ViewOnClickListenerC5092fu(@NotNull C4958d7 action, @NotNull C5380l7 adtuneRenderer, @NotNull tf1 videoTracker, @NotNull le1 videoEventUrlsTracker) {
        Intrinsics.m32179h(action, "action");
        Intrinsics.m32179h(adtuneRenderer, "adtuneRenderer");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f50441a = action;
        this.f50442b = adtuneRenderer;
        this.f50443c = videoTracker;
        this.f50444d = videoEventUrlsTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View adtune) {
        Intrinsics.m32179h(adtune, "adtune");
        this.f50443c.mo25508a("feedback");
        le1 le1Var = this.f50444d;
        List<String> m23821c = this.f50441a.m23821c();
        Intrinsics.m32178g(m23821c, "action.trackingUrls");
        le1Var.m26442a((List<String>) m23821c, (Map<String, String>) null);
        this.f50442b.m26358a(adtune, this.f50441a);
    }
}
