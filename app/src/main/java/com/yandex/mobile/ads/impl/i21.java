package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i21 {

    /* renamed from: a */
    @NotNull
    private final l21 f51188a = new l21();

    /* renamed from: b */
    @NotNull
    private final C5586pc f51189b = new C5586pc();

    /* renamed from: c */
    @NotNull
    private final C5437me f51190c = new C5437me();

    /* renamed from: d */
    @Nullable
    private k21 f51191d;

    /* renamed from: a */
    public final void m25429a(@NotNull ImageView view, @NotNull z10 imageValue, @NotNull Bitmap originalBitmap) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(imageValue, "imageValue");
        Intrinsics.m32179h(originalBitmap, "originalBitmap");
        k21 k21Var = new k21(this.f51189b, this.f51190c, this.f51188a, imageValue, originalBitmap);
        this.f51191d = k21Var;
        view.addOnLayoutChangeListener(k21Var);
        if (view.getLayoutParams().width == -1 || view.getLayoutParams().height == -1 || view.getLayoutParams().width == -2 || view.getLayoutParams().height == -2) {
            view.setImageBitmap(originalBitmap);
        }
    }

    /* renamed from: a */
    public final void m25428a(@NotNull ImageView view) {
        Intrinsics.m32179h(view, "view");
        view.removeOnLayoutChangeListener(this.f51191d);
    }
}
