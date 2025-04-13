package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.oi0;

@MainThread
/* loaded from: classes3.dex */
public class NativeBulkAdLoader {

    /* renamed from: a */
    @NonNull
    private final C6228p f57651a;

    /* renamed from: b */
    @NonNull
    private final Context f57652b;

    public NativeBulkAdLoader(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f57652b = applicationContext;
        this.f57651a = new C6228p(applicationContext);
    }

    public void cancelLoading() {
        this.f57651a.m30608a();
    }

    public void loadAds(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, int i2) {
        this.f57651a.m30611a(nativeAdRequestConfiguration, new oi0(this.f57652b), i2);
    }

    public void setNativeBulkAdLoadListener(@Nullable NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f57651a.m30612a(nativeBulkAdLoadListener);
    }
}
