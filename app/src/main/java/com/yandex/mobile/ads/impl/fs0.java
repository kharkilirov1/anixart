package com.yandex.mobile.ads.impl;

import android.app.Application;
import android.os.Build;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fs0 {

    /* renamed from: a */
    @NotNull
    private final C5052f0 f50437a = new C5052f0();

    @Nullable
    /* renamed from: a */
    public final String m24738a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        Objects.requireNonNull(this.f50437a);
        return C5052f0.m24286b();
    }
}
