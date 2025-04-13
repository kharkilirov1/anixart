package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ik1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a */
    @NotNull
    private final Handler f50537a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void m24830a(@NotNull Runnable runnable) {
        Intrinsics.m32179h(runnable, "runnable");
        this.f50537a.post(runnable);
    }

    /* renamed from: a */
    public final void m24829a(@NotNull ik1.RunnableC5237a runnable) {
        Intrinsics.m32179h(runnable, "runnable");
        this.f50537a.postDelayed(runnable, 50L);
    }

    /* renamed from: a */
    public final void m24828a() {
        this.f50537a.removeCallbacksAndMessages(null);
    }
}
