package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.el */
/* loaded from: classes3.dex */
public final class C5032el {

    /* renamed from: a */
    @NonNull
    private final ms0 f49992a = new ms0();

    /* renamed from: a */
    public final void m24190a(@NonNull TextView textView, long j2, long j3) {
        Objects.requireNonNull(this.f49992a);
        long ceil = (long) Math.ceil((j2 - j3) / 1000.0f);
        textView.setText(String.format(Locale.US, "%02d:%02d", Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)));
    }
}
