package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class x91 {

    /* renamed from: a */
    @NonNull
    private final Context f56412a;

    /* renamed from: b */
    @NonNull
    private final y91 f56413b = new y91();

    /* renamed from: c */
    @NonNull
    private final nb1 f56414c = new nb1();

    /* renamed from: d */
    @NonNull
    private final w91 f56415d = new w91();

    public x91(@NonNull Context context) {
        this.f56412a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m29709a() {
        nb1 nb1Var = this.f56414c;
        Context context = this.f56412a;
        Objects.requireNonNull(nb1Var);
        if (C5474n6.m26806a(context) && this.f56415d.m29415a(this.f56412a)) {
            Objects.requireNonNull(this.f56413b);
            Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n***************************************************************************************\n* The integrated version of the Yandex Mobile Ads SDK is outdated.                    *\n* Please update com.yandex.android:mobileads to the latest version.                   *\n* Learn more about the latest version of the SDK here:                                *\n* https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html *\n* Changelog: https://yandex.ru/dev/mobile-ads/doc/intro/changelog-android.html        *\n***************************************************************************************\n");
        }
    }
}
