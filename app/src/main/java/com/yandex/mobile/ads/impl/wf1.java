package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wf1 {
    @NotNull
    /* renamed from: a */
    public static vf1 m29480a(@NotNull Context context, @NotNull hc1 videoAdInfo, @NotNull EnumC5778t1 adBreakPosition) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adBreakPosition, "adBreakPosition");
        rf1 rf1Var = new rf1(context);
        le1 le1Var = new le1(context);
        C6079yj c6079yj = new C6079yj();
        C5083fl m25116a = videoAdInfo.m25116a();
        Intrinsics.m32178g(m25116a, "videoAdInfo.creative");
        c6079yj.m29947a(new C5542ol(m25116a, rf1Var, le1Var));
        pb1 m25120e = videoAdInfo.m25120e();
        Intrinsics.m32178g(m25120e, "videoAdInfo.vastVideoAd");
        c6079yj.m29947a(new ud1(m25120e, rf1Var));
        ib1 m25861a = new jb1().m25861a(context, videoAdInfo, adBreakPosition, rf1Var);
        if (m25861a != null) {
            c6079yj.m29947a(m25861a);
        }
        return new vf1(c6079yj);
    }
}
