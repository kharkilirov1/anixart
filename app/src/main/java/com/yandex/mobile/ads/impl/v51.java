package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v51 {

    /* renamed from: a */
    private static final long f55752a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    public static void m29184a(@NonNull TextView textView, long j2, long j3) {
        textView.setText(String.valueOf((int) Math.ceil((j2 - j3) / f55752a)));
    }
}
