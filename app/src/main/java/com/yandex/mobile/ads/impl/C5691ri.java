package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ri */
/* loaded from: classes3.dex */
public final class C5691ri {

    /* renamed from: a */
    @NotNull
    private final C4910c9 f54320a;

    public C5691ri(@NotNull C4910c9 animatedProgressBarController) {
        Intrinsics.m32179h(animatedProgressBarController, "animatedProgressBarController");
        this.f54320a = animatedProgressBarController;
    }

    /* renamed from: a */
    public static void m27926a(@NotNull ProgressBar progressBar, int i2) {
        Intrinsics.m32179h(progressBar, "progressBar");
        progressBar.setMax(i2);
        progressBar.setVisibility(0);
    }

    public /* synthetic */ C5691ri() {
        this(new C4910c9());
    }

    /* renamed from: a */
    public final void m27927a(@NotNull ProgressBar progressBar, long j2, long j3) {
        Intrinsics.m32179h(progressBar, "progressBar");
        Objects.requireNonNull(this.f54320a);
        C4910c9.m23077a(progressBar, j2, j3);
    }
}
