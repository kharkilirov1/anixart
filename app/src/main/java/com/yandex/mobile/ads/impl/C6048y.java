package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y */
/* loaded from: classes3.dex */
public final class C6048y {
    @Nullable
    /* renamed from: a */
    public static Context m29837a(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        while (view != null) {
            Context context = view.getContext();
            if (context instanceof Activity) {
                return context;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }
}
