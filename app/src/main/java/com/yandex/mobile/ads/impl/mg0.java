package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mg0 extends RecyclerView.ViewHolder {

    /* renamed from: a */
    @NotNull
    private final eg1<ImageView, z10> f52685a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(@NotNull ImageView imageView, @NotNull h20 imageViewAdapter) {
        super(imageView);
        Intrinsics.m32179h(imageView, "imageView");
        Intrinsics.m32179h(imageViewAdapter, "imageViewAdapter");
        this.f52685a = new eg1<>(imageViewAdapter);
    }

    /* renamed from: a */
    public final void m26671a(@NotNull z10 value) {
        Intrinsics.m32179h(value, "value");
        this.f52685a.m24153b(value);
    }
}
