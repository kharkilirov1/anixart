package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.na */
/* loaded from: classes3.dex */
public final class C5480na {

    /* renamed from: a */
    @NotNull
    private final hc1<VideoAd> f52885a;

    /* renamed from: b */
    @NotNull
    private final mo0 f52886b;

    /* renamed from: c */
    @NotNull
    private final tf1 f52887c;

    /* renamed from: d */
    @NotNull
    private final t50 f52888d;

    public C5480na(@NotNull hc1<VideoAd> videoAdInfo, @NotNull mo0 adClickHandler, @NotNull tf1 videoTracker) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adClickHandler, "adClickHandler");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        this.f52885a = videoAdInfo;
        this.f52886b = adClickHandler;
        this.f52887c = videoTracker;
        this.f52888d = new t50(new C5135gl());
    }

    /* renamed from: a */
    public final void m26825a(@NotNull View view, @Nullable C5276ja<?> c5276ja) {
        Intrinsics.m32179h(view, "view");
        if (c5276ja != null && c5276ja.m25827e()) {
            t50 t50Var = this.f52888d;
            C5083fl m25116a = this.f52885a.m25116a();
            Intrinsics.m32178g(m25116a, "videoAdInfo.creative");
            String m24133a = t50Var.m28466a(m25116a, c5276ja.m25824b()).m24133a();
            if (m24133a != null) {
                mo0 mo0Var = this.f52886b;
                String m25824b = c5276ja.m25824b();
                Intrinsics.m32178g(m25824b, "asset.name");
                view.setOnClickListener(new ViewOnClickListenerC6114za(mo0Var, m24133a, m25824b, this.f52887c));
            }
        }
    }
}
