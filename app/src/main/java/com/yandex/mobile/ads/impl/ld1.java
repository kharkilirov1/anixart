package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ld1<T> {

    /* renamed from: a */
    @NotNull
    private final rt0 f52366a;

    /* renamed from: b */
    @NotNull
    private final ps0 f52367b;

    /* renamed from: c */
    @NotNull
    private final la1<T> f52368c;

    /* renamed from: d */
    @NotNull
    private final yg1<T> f52369d;

    public ld1(@NotNull Context context, @NotNull hc1<T> videoAdInfo, @NotNull ag1 videoViewProvider, @NotNull sd1 adStatusController, @NotNull tf1 videoTracker, @NotNull sc1<T> playbackEventsListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        Intrinsics.m32179h(adStatusController, "adStatusController");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(playbackEventsListener, "playbackEventsListener");
        this.f52366a = new rt0(videoTracker);
        this.f52367b = new ps0(context, videoAdInfo);
        this.f52368c = new la1<>(videoAdInfo, videoViewProvider, videoTracker, playbackEventsListener);
        this.f52369d = new yg1<>(videoAdInfo, videoViewProvider, adStatusController, videoTracker, playbackEventsListener);
    }

    /* renamed from: a */
    public final void m26433a(@NotNull jd1 progressEventsObservable) {
        Intrinsics.m32179h(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.m25872a(this.f52366a, this.f52367b, this.f52368c, this.f52369d);
        progressEventsObservable.m25873a(this.f52369d);
    }
}
