package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.w40;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j50 implements sc1<VideoAd>, w40.InterfaceC5957a {

    /* renamed from: a */
    @NotNull
    private final sc1<VideoAd> f51517a;

    /* renamed from: b */
    @NotNull
    private final AtomicInteger f51518b;

    public j50(@NotNull sc1<VideoAd> listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f51517a = listener;
        this.f51518b = new AtomicInteger(2);
    }

    /* renamed from: l */
    private final void m25801l(hc1<VideoAd> hc1Var) {
        if (this.f51518b.decrementAndGet() == 0) {
            this.f51517a.mo24932e(hc1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24927a(@NotNull hc1<VideoAd> videoAdInfo, float f2) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24927a(videoAdInfo, f2);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: b */
    public final void mo24929b(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24929b(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: c */
    public final void mo24930c(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24930c(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: d */
    public final void mo24931d(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24931d(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: e */
    public final void mo24932e(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        m25801l(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: f */
    public final void mo24933f(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24933f(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: g */
    public final void mo24934g(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24934g(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: h */
    public final void mo24935h(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24935h(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: i */
    public final void mo24936i(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24936i(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: j */
    public final void mo24937j(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24937j(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: k */
    public final void mo24938k(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24938k(videoAdInfo);
    }

    /* renamed from: m */
    public final void m25803m(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        m25801l(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24926a(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f51517a.mo24926a(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24928a(@NotNull hc1<VideoAd> videoAdInfo, @NotNull ed1 videoAdPlayerError) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(videoAdPlayerError, "videoAdPlayerError");
        this.f51517a.mo24928a(videoAdInfo, videoAdPlayerError);
    }

    /* renamed from: a */
    public final void m25802a() {
        this.f51518b.set(2);
    }
}
