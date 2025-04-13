package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p31 {

    /* renamed from: a */
    @NotNull
    private final Context f53382a;

    /* renamed from: b */
    @NotNull
    private final hc1<VideoAd> f53383b;

    /* renamed from: c */
    @NotNull
    private final C5905v7 f53384c;

    public p31(@NotNull Context context, @NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f53382a = context;
        this.f53383b = videoAdInfo;
        pb1 m25120e = videoAdInfo.m25120e();
        Intrinsics.m32178g(m25120e, "videoAdInfo.vastVideoAd");
        this.f53384c = new C5905v7(m25120e);
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC5037en m27161a() {
        int m28463a = C5782t5.m28463a(new r31(this.f53384c).m27826a(this.f53383b));
        if (m28463a == 0) {
            return new C5139go(this.f53382a);
        }
        if (m28463a == 1) {
            return new C5086fo(this.f53382a);
        }
        if (m28463a == 2) {
            return new C5544on();
        }
        throw new NoWhenBranchMatchedException();
    }
}
