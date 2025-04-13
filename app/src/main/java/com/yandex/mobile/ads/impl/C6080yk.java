package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yk */
/* loaded from: classes3.dex */
public final class C6080yk {

    /* renamed from: a */
    @NotNull
    private final tf1 f56868a;

    /* renamed from: b */
    @NotNull
    private final zg0 f56869b;

    /* renamed from: c */
    @NotNull
    private final u11 f56870c;

    /* renamed from: d */
    @NotNull
    private final is0 f56871d;

    /* renamed from: e */
    @NotNull
    private final o40 f56872e;

    public C6080yk(@NotNull Context context, @NotNull m50 adBreak, @NotNull h50 instreamVastAdPlayer, @NotNull tb1 playbackListener, @NotNull hc1 videoAdInfo, @NotNull tf1 videoTracker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(playbackListener, "playbackListener");
        this.f56868a = videoTracker;
        this.f56869b = new zg0(instreamVastAdPlayer);
        this.f56870c = new u11(instreamVastAdPlayer, (VideoAd) videoAdInfo.m25118c());
        this.f56871d = new is0();
        this.f56872e = new o40(adBreak, videoAdInfo);
    }

    /* renamed from: a */
    public final void m29949a(@NotNull ub1 uiElements, @NotNull q40 controlsState) {
        Intrinsics.m32179h(uiElements, "uiElements");
        Intrinsics.m32179h(controlsState, "controlsState");
        this.f56872e.m26998a(uiElements);
        this.f56869b.m30186a(uiElements, controlsState);
        View m28940l = uiElements.m28940l();
        if (m28940l != null) {
            this.f56870c.m28835a(m28940l, controlsState);
        }
        ProgressBar m28938j = uiElements.m28938j();
        if (m28938j != null) {
            Objects.requireNonNull(this.f56871d);
            is0.m25726a(m28938j, controlsState);
        }
    }
}
