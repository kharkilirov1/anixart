package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a3 */
/* loaded from: classes3.dex */
public final class C4790a3 {

    /* renamed from: a */
    @NotNull
    private final hc1<VideoAd> f48295a;

    /* renamed from: b */
    @NotNull
    private final i50 f48296b;

    /* renamed from: c */
    @NotNull
    private final sd1 f48297c;

    /* renamed from: d */
    @NotNull
    private final tf1 f48298d;

    public C4790a3(@NotNull hc1 videoAdInfo, @NotNull i50 playbackController, @NotNull w10 imageProvider, @NotNull sd1 statusController, @NotNull vf1 videoTracker) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(playbackController, "playbackController");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(statusController, "statusController");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        this.f48295a = videoAdInfo;
        this.f48296b = playbackController;
        this.f48297c = statusController;
        this.f48298d = videoTracker;
    }

    @NotNull
    /* renamed from: a */
    public final i50 m22366a() {
        return this.f48296b;
    }

    @NotNull
    /* renamed from: b */
    public final sd1 m22367b() {
        return this.f48297c;
    }

    @NotNull
    /* renamed from: c */
    public final hc1<VideoAd> m22368c() {
        return this.f48295a;
    }

    @NotNull
    /* renamed from: d */
    public final tf1 m22369d() {
        return this.f48298d;
    }
}
