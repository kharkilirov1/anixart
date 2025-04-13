package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jg0 {

    /* renamed from: a */
    @NotNull
    private final pg0 f51603a = new pg0();

    @NotNull
    /* renamed from: a */
    public final ExtendedViewContainer m25887a(@NotNull Context context, @NotNull List<? extends z10> imageValues) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(imageValues, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context);
        Objects.requireNonNull(this.f51603a);
        extendedViewContainer.setMeasureSpecProvider(new at0((float) pg0.m27325a(imageValues)));
        return extendedViewContainer;
    }
}
