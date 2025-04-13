package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.b3 */
/* loaded from: classes3.dex */
public final class C4839b3 {

    /* renamed from: a */
    @NotNull
    private final Context f48741a;

    /* renamed from: b */
    @NotNull
    private final m50 f48742b;

    /* renamed from: c */
    @NotNull
    private final EnumC5778t1 f48743c;

    /* renamed from: d */
    @NotNull
    private final w10 f48744d;

    /* renamed from: e */
    @NotNull
    private final t30 f48745e;

    /* renamed from: f */
    @NotNull
    private final i40 f48746f;

    /* renamed from: g */
    @NotNull
    private final sc1<VideoAd> f48747g;

    /* renamed from: h */
    @NotNull
    private final wf1 f48748h;

    public C4839b3(@NotNull Context context, @NotNull m50 adBreak, @NotNull EnumC5778t1 adBreakPosition, @NotNull w10 imageProvider, @NotNull t30 adPlayerController, @NotNull i40 adViewsHolderManager, @NotNull sc1<VideoAd> playbackEventsListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(adBreakPosition, "adBreakPosition");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(adPlayerController, "adPlayerController");
        Intrinsics.m32179h(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.m32179h(playbackEventsListener, "playbackEventsListener");
        this.f48741a = context;
        this.f48742b = adBreak;
        this.f48743c = adBreakPosition;
        this.f48744d = imageProvider;
        this.f48745e = adPlayerController;
        this.f48746f = adViewsHolderManager;
        this.f48747g = playbackEventsListener;
        this.f48748h = new wf1();
    }

    @NotNull
    /* renamed from: a */
    public final C4790a3 m22714a(@NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        wf1 wf1Var = this.f48748h;
        Context context = this.f48741a;
        EnumC5778t1 enumC5778t1 = this.f48743c;
        Objects.requireNonNull(wf1Var);
        vf1 m29480a = wf1.m29480a(context, videoAdInfo, enumC5778t1);
        sd1 sd1Var = new sd1();
        return new C4790a3(videoAdInfo, new i50(this.f48741a, this.f48745e, this.f48746f, this.f48742b, videoAdInfo, sd1Var, m29480a, this.f48744d, this.f48747g), this.f48744d, sd1Var, m29480a);
    }
}
