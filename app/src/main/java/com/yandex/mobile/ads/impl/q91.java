package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.o91;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q91 {

    /* renamed from: a */
    @NotNull
    private final o91 f53987a;

    public q91(@NotNull o91 userAgentCreatorProvider) {
        Intrinsics.m32179h(userAgentCreatorProvider, "userAgentCreatorProvider");
        this.f53987a = userAgentCreatorProvider;
    }

    @NotNull
    /* renamed from: a */
    public final String m27663a(@Nullable Context context) {
        Objects.requireNonNull(this.f53987a);
        return ((context == null || !o91.C5530a.m27057a(context)) ? new k51() : new yz0(new p91())).mo26035a();
    }
}
