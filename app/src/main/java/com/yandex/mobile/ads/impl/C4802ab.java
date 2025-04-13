package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ab */
/* loaded from: classes3.dex */
public final class C4802ab {

    /* renamed from: a */
    @NotNull
    private final Context f48468a;

    /* renamed from: b */
    @NotNull
    private final hc1<VideoAd> f48469b;

    /* renamed from: c */
    @NotNull
    private final m50 f48470c;

    /* renamed from: d */
    @NotNull
    private final tf1 f48471d;

    /* renamed from: e */
    @NotNull
    private final sb1 f48472e;

    /* renamed from: f */
    @NotNull
    private final w10 f48473f;

    /* renamed from: g */
    @NotNull
    private final m40 f48474g;

    public C4802ab(@NotNull Context context, @NotNull hc1 videoAdInfo, @NotNull m50 adBreak, @NotNull tf1 videoTracker, @NotNull tb1 playbackListener, @NotNull sp0 imageProvider, @NotNull m40 assetsWrapper) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(playbackListener, "playbackListener");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(assetsWrapper, "assetsWrapper");
        this.f48468a = context;
        this.f48469b = videoAdInfo;
        this.f48470c = adBreak;
        this.f48471d = videoTracker;
        this.f48472e = playbackListener;
        this.f48473f = imageProvider;
        this.f48474g = assetsWrapper;
    }

    @NotNull
    /* renamed from: a */
    public final List<k40> m22449a() {
        C5480na m27058a = C5531oa.m27058a(this.f48468a, this.f48469b, this.f48470c, this.f48471d);
        C5276ja<?> m26567a = this.f48474g.m26567a("call_to_action");
        C5860ug c5860ug = new C5860ug(m26567a, C5803th.m28662a(this.f48469b, this.f48468a, this.f48470c, this.f48471d, this.f48472e, m26567a));
        C5917vg c5917vg = new C5917vg();
        InterfaceC5784t7 m28907a = new C5847u7(this.f48469b).m28907a();
        Intrinsics.m32178g(m28907a, "advertiserConfiguratorCreator.createConfigurator()");
        C6041xt c6041xt = new C6041xt(this.f48473f, this.f48474g.m26567a("favicon"), m27058a);
        C5196hq c5196hq = new C5196hq(this.f48474g.m26567a("domain"), m27058a);
        q31 q31Var = new q31(this.f48474g.m26567a("sponsored"), m27058a);
        C5212i4 c5212i4 = new C5212i4(this.f48469b.m25118c().getAdPodInfo().getAdPosition(), this.f48469b.m25118c().getAdPodInfo().getAdsCount());
        u71 u71Var = new u71(this.f48473f, this.f48474g.m26567a("trademark"), m27058a);
        n30 n30Var = new n30();
        mo0 m23025a = new c50(this.f48468a, this.f48470c, this.f48469b).m23025a();
        Intrinsics.m32178g(m23025a, "instreamOpenUrlHandlerProvider.openUrlHandler");
        return CollectionsKt.m31994G(c5860ug, m28907a, c6041xt, c5196hq, q31Var, c5212i4, u71Var, c5917vg, new C5146gu(this.f48474g.m26567a("feedback"), m27058a, this.f48471d, m23025a, n30Var), new fi1(this.f48474g.m26567a("warning"), m27058a));
    }
}
