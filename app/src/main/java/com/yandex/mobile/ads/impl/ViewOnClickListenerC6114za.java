package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.za */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6114za implements View.OnClickListener {

    /* renamed from: a */
    @NotNull
    private final mo0 f57089a;

    /* renamed from: b */
    @NotNull
    private final String f57090b;

    /* renamed from: c */
    @NotNull
    private final String f57091c;

    /* renamed from: d */
    @NotNull
    private final tf1 f57092d;

    public ViewOnClickListenerC6114za(@NotNull mo0 adClickHandler, @NotNull String url, @NotNull String assetName, @NotNull tf1 videoTracker) {
        Intrinsics.m32179h(adClickHandler, "adClickHandler");
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(assetName, "assetName");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        this.f57089a = adClickHandler;
        this.f57090b = url;
        this.f57091c = assetName;
        this.f57092d = videoTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v) {
        Intrinsics.m32179h(v, "v");
        this.f57092d.mo25508a(this.f57091c);
        this.f57089a.mo23301a(this.f57090b);
    }
}
