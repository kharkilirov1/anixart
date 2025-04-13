package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oi0;

@MainThread
/* loaded from: classes3.dex */
public class SliderAdLoader {

    /* renamed from: a */
    @NonNull
    private final C6228p f57653a;

    /* renamed from: b */
    @NonNull
    private final Context f57654b;

    public SliderAdLoader(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f57654b = applicationContext;
        this.f57653a = new C6228p(applicationContext);
    }

    public void cancelLoading() {
        this.f57653a.m30608a();
    }

    public void loadSlider(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f57653a.m30615b(nativeAdRequestConfiguration, new oi0(this.f57654b));
    }

    public void setSliderAdLoadListener(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f57653a.m30613a(sliderAdLoadListener);
    }
}
