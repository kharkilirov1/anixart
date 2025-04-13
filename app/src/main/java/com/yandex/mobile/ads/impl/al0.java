package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class al0 implements el0 {

    /* renamed from: a */
    @NotNull
    private final tk0 f48600a;

    /* renamed from: b */
    @NotNull
    private final sl0 f48601b;

    public al0(@NotNull C5987ws player, @NotNull sl0 videoView) {
        Intrinsics.m32179h(player, "player");
        Intrinsics.m32179h(videoView, "videoView");
        this.f48600a = player;
        this.f48601b = videoView;
    }

    /* renamed from: a */
    public final void m22541a() {
        ((C5987ws) this.f48600a).m29545a(this.f48601b.m28321c());
    }

    /* renamed from: b */
    public final void m22542b() {
        this.f48601b.m28320b().m28645a().clearAnimation();
        ((C5987ws) this.f48600a).m29545a((TextureView) null);
    }
}
