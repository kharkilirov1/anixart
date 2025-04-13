package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C5724s3;

@MainThread
/* loaded from: classes2.dex */
public final class BannerAdView extends AbstractC4639g {
    public BannerAdView(@NonNull Context context) {
        super(context);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    @NonNull
    /* renamed from: a */
    public final C4637e mo21747a(@NonNull Context context, @NonNull C4636d c4636d, @NonNull C5724s3 c5724s3) {
        return new C4637e(context, this, c4636d, c5724s3);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void destroy() {
        super.destroy();
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    @Nullable
    public AdSize getAdSize() {
        return super.getAdSize();
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    @NonNull
    public VideoController getVideoController() {
        return super.getVideoController();
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void loadAd(@NonNull AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void setAdSize(@NonNull AdSize adSize) {
        super.setAdSize(adSize);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void setAdUnitId(@NonNull String str) {
        super.setAdUnitId(str);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void setBannerAdEventListener(@Nullable BannerAdEventListener bannerAdEventListener) {
        super.setBannerAdEventListener(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.banner.AbstractC4639g
    public void setShouldOpenLinksInApp(boolean z) {
        super.setShouldOpenLinksInApp(z);
    }

    public BannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
