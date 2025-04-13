package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.nativeads.MediaView;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmName
/* loaded from: classes3.dex */
public final class pg1 {
    @NotNull
    /* renamed from: a */
    public static final lg1 m27327a(@NotNull AbstractC4639g abstractC4639g) {
        Intrinsics.m32179h(abstractC4639g, "<this>");
        ViewGroup.LayoutParams layoutParams = abstractC4639g.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(x81.m29699a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = abstractC4639g.getLayoutParams();
        return new lg1(new kg1(x81.m29699a(abstractC4639g.getWidth()), x81.m29699a(abstractC4639g.getHeight())), new u70(valueOf, layoutParams2 != null ? Integer.valueOf(x81.m29699a(layoutParams2.height)) : null), new ha0(new ia0(x81.m29699a(View.MeasureSpec.getSize(abstractC4639g.getWidthMeasureSpec())), m27326a(abstractC4639g.getWidthMeasureSpec())), new ia0(x81.m29699a(View.MeasureSpec.getSize(abstractC4639g.getHeightMeasureSpec())), m27326a(abstractC4639g.getHeightMeasureSpec()))));
    }

    @NotNull
    /* renamed from: a */
    public static final lg1 m27328a(@NotNull MediaView mediaView, @NotNull String mediaType) {
        Intrinsics.m32179h(mediaView, "<this>");
        Intrinsics.m32179h(mediaType, "mediaType");
        ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(x81.m29699a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
        Integer valueOf2 = layoutParams2 != null ? Integer.valueOf(x81.m29699a(layoutParams2.height)) : null;
        int m29699a = x81.m29699a(View.MeasureSpec.getSize(mediaView.getWidthMeasureSpec()));
        int m29699a2 = x81.m29699a(View.MeasureSpec.getSize(mediaView.getHeightMeasureSpec()));
        return new lg1(new kg1(x81.m29699a(mediaView.getWidth()), x81.m29699a(mediaView.getHeight())), new u70(valueOf, valueOf2), new ha0(new ia0(m29699a, m27326a(mediaView.getWidthMeasureSpec())), new ia0(m29699a2, m27326a(mediaView.getHeightMeasureSpec()))), MapsKt.m32064i(new Pair("asset", "media"), new Pair("media_type", mediaType)));
    }

    /* renamed from: a */
    private static final ja0 m27326a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return ja0.f51541b;
        }
        if (mode == 0) {
            return ja0.f51542c;
        }
        if (mode != 1073741824) {
            return ja0.f51542c;
        }
        return ja0.f51540a;
    }
}
