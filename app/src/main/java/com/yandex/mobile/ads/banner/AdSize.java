package com.yandex.mobile.ads.banner;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class AdSize extends AbstractC4638f {
    private static final long serialVersionUID = 2680092174282737642L;

    @Deprecated
    public static final AdSize BANNER_240x400 = new AdSize(240, 400);

    @Deprecated
    public static final AdSize BANNER_300x250 = new AdSize(300, 250);

    @Deprecated
    public static final AdSize BANNER_300x300 = new AdSize(300, 300);

    @Deprecated
    public static final AdSize BANNER_320x50 = new AdSize(320, 50);

    @Deprecated
    public static final AdSize BANNER_320x100 = new AdSize(320, 100);

    @Deprecated
    public static final AdSize BANNER_400x240 = new AdSize(400, 240);

    @Deprecated
    public static final AdSize BANNER_728x90 = new AdSize(728, 90);
    public static final AdSize FULL_SCREEN = new AdSize(-1, -2);

    @Deprecated
    public AdSize(int i2, int i3) {
        this(i2, i3, 1);
    }

    @NonNull
    @Deprecated
    public static AdSize flexibleSize(int i2, int i3) {
        return new AdSize(i2, i3, 2);
    }

    @NonNull
    public static AdSize inlineSize(int i2, int i3) {
        return new AdSize(i2, i3, 2);
    }

    @NonNull
    public static AdSize stickySize(int i2) {
        return new AdSize(i2, 0, 4);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getHeight() {
        return super.getHeight();
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getHeightInPixels(@NonNull Context context) {
        return super.getHeightInPixels(context);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getWidth() {
        return super.getWidth();
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getWidthInPixels(@NonNull Context context) {
        return super.getWidthInPixels(context);
    }

    public AdSize(int i2, int i3, @NonNull int i4) {
        super(i2, i3, i4);
    }

    @NonNull
    public static AdSize stickySize(@NonNull Context context, int i2) {
        return C4643k.m21799a(context, i2);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getHeight(@NonNull Context context) {
        return super.getHeight(context);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4638f
    public int getWidth(@NonNull Context context) {
        return super.getWidth(context);
    }
}
