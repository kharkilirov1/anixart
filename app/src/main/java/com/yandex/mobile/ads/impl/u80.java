package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class u80 {

    /* renamed from: a */
    @NonNull
    private final s80 f55423a = new s80();

    @Nullable
    /* renamed from: a */
    public final String m28912a(@NonNull Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        Objects.requireNonNull(this.f55423a);
        return s80.m28079a(locale);
    }
}
