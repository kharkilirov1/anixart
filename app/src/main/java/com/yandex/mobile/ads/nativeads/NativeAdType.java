package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public enum NativeAdType {
    CONTENT("content"),
    APP_INSTALL("app"),
    MEDIA("media");


    /* renamed from: a */
    @NonNull
    private final String f57645a;

    NativeAdType(String str) {
        this.f57645a = str;
    }

    @NonNull
    public String getValue() {
        return this.f57645a;
    }
}
