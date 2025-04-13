package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class is0 {

    /* renamed from: a */
    @NonNull
    private final C4910c9 f51435a = new C4910c9();

    /* renamed from: a */
    public final void m25727a(@NonNull ProgressBar progressBar, long j2, long j3) {
        Objects.requireNonNull(this.f51435a);
        C4910c9.m23077a(progressBar, j3, j2);
    }

    /* renamed from: a */
    public static void m25726a(@NonNull ProgressBar progressBar, @NonNull q40 q40Var) {
        progressBar.setProgress((int) (q40Var.m27613b() * progressBar.getMax()));
    }
}
