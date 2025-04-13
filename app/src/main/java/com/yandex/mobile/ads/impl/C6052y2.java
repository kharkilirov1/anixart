package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C6003x2;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y2 */
/* loaded from: classes3.dex */
public final class C6052y2 implements sc1<VideoAd> {

    /* renamed from: a */
    @NotNull
    private final C5159h2 f56635a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC5925vl f56636b;

    /* renamed from: c */
    @Nullable
    private C5723s2 f56637c;

    public C6052y2(@NotNull C5159h2 adCreativePlaybackEventController, @NotNull InterfaceC5925vl currentAdCreativePlaybackEventListener) {
        Intrinsics.m32179h(adCreativePlaybackEventController, "adCreativePlaybackEventController");
        Intrinsics.m32179h(currentAdCreativePlaybackEventListener, "currentAdCreativePlaybackEventListener");
        this.f56635a = adCreativePlaybackEventController;
        this.f56636b = currentAdCreativePlaybackEventListener;
    }

    /* renamed from: l */
    private final boolean m29847l(hc1<VideoAd> hc1Var) {
        C5723s2 c5723s2 = this.f56637c;
        return Intrinsics.m32174c(c5723s2 != null ? c5723s2.m28043b() : null, hc1Var);
    }

    /* renamed from: a */
    public final void m29848a(@Nullable C5723s2 c5723s2) {
        this.f56637c = c5723s2;
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: b */
    public final void mo24929b(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25026c(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29651b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: c */
    public final void mo24930c(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25032i(videoAdInfo.m25118c());
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: d */
    public final void mo24931d(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25030g(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29655f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: e */
    public final void mo24932e(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25027d(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29652c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: f */
    public final void mo24933f(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25031h(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29656g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: g */
    public final void mo24934g(@NotNull hc1<VideoAd> videoAdInfo) {
        C4790a3 m28041a;
        i50 m22366a;
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        C5723s2 c5723s2 = this.f56637c;
        if (c5723s2 != null && (m28041a = c5723s2.m28041a(videoAdInfo)) != null && (m22366a = m28041a.m22366a()) != null) {
            m22366a.m25447e();
        }
        this.f56635a.m25022a();
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: h */
    public final void mo24935h(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25028e(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29653d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: i */
    public final void mo24936i(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25023a(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29649a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: j */
    public final void mo24937j(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: k */
    public final void mo24938k(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24927a(@NotNull hc1<VideoAd> videoAdInfo, float f2) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25024a(videoAdInfo.m25118c(), f2);
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24926a(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f56635a.m25029f(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29654e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc1
    /* renamed from: a */
    public final void mo24928a(@NotNull hc1<VideoAd> videoAdInfo, @NotNull ed1 videoAdPlayerError) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(videoAdPlayerError, "videoAdPlayerError");
        this.f56635a.m25025b(videoAdInfo.m25118c());
        if (m29847l(videoAdInfo)) {
            ((C6003x2.a) this.f56636b).m29650a(videoAdInfo);
        }
    }
}
