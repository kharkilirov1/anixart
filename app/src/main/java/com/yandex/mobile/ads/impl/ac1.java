package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ac1 {

    /* renamed from: a */
    @NonNull
    private final String f48484a;

    public ac1(int i2, @NonNull String str) {
        this(str);
    }

    /* renamed from: a */
    public static ac1 m22458a() {
        return new ac1("Internal error. Failed to parse response");
    }

    /* renamed from: b */
    public static ac1 m22461b() {
        return new ac1("Server temporarily unavailable. Please, try again later.");
    }

    @NonNull
    /* renamed from: c */
    public final String m22463c() {
        return this.f48484a;
    }

    private ac1(@NonNull String str) {
        this.f48484a = str;
    }

    /* renamed from: a */
    public static ac1 m22459a(@NonNull C5143gr c5143gr) {
        return new ac1(c5143gr.getMessage() != null ? c5143gr.getMessage() : "Ad request completed successfully, but there are no ads available.");
    }

    /* renamed from: b */
    public static ac1 m22462b(@NonNull String str) {
        return new ac1(str);
    }

    /* renamed from: a */
    public static ac1 m22460a(@Nullable String str) {
        if (str == null) {
            str = "Ad request failed with network error. Please try again later.";
        }
        return new ac1(str);
    }
}
