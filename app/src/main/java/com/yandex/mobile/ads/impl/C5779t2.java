package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t2 */
/* loaded from: classes3.dex */
public final class C5779t2 {

    /* renamed from: a */
    @NotNull
    private final Context f54924a;

    /* renamed from: b */
    @NotNull
    private final m50 f54925b;

    /* renamed from: c */
    @NotNull
    private final t30 f54926c;

    /* renamed from: d */
    @NotNull
    private final w10 f54927d;

    /* renamed from: e */
    @NotNull
    private final i40 f54928e;

    /* renamed from: f */
    @NotNull
    private final sc1<VideoAd> f54929f;

    public C5779t2(@NotNull Context context, @NotNull m50 adBreak, @NotNull t30 adPlayerController, @NotNull sp0 imageProvider, @NotNull i40 adViewsHolderManager, @NotNull C6052y2 playbackEventsListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(adPlayerController, "adPlayerController");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.m32179h(playbackEventsListener, "playbackEventsListener");
        this.f54924a = context;
        this.f54925b = adBreak;
        this.f54926c = adPlayerController;
        this.f54927d = imageProvider;
        this.f54928e = adViewsHolderManager;
        this.f54929f = playbackEventsListener;
    }

    @NotNull
    /* renamed from: a */
    public final C5723s2 m28437a() {
        C4901c3 c4901c3 = new C4901c3(this.f54924a, this.f54925b, this.f54926c, this.f54927d, this.f54928e, this.f54929f);
        List<hc1<VideoAd>> m26572c = this.f54925b.m26572c();
        Intrinsics.m32178g(m26572c, "adBreak.videoAdInfoList");
        return new C5723s2(c4901c3.m23014a(m26572c));
    }
}
