package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.c9 */
/* loaded from: classes3.dex */
public final class C4910c9 {
    /* renamed from: a */
    public static void m23077a(@NonNull ProgressBar progressBar, long j2, long j3) {
        progressBar.clearAnimation();
        if (j2 > 0) {
            progressBar.setMax((int) j2);
            gs0 gs0Var = new gs0(progressBar, progressBar.getProgress(), (int) j3);
            gs0Var.setDuration(200L);
            progressBar.startAnimation(gs0Var);
        }
    }
}
