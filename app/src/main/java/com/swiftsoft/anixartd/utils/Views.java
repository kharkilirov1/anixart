package com.swiftsoft.anixartd.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Views;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Views {

    /* renamed from: a */
    @NotNull
    public static final Views f30250a = new Views();

    /* renamed from: a */
    public final int m16367a(@NotNull Context context, float f2) {
        Intrinsics.m32179h(context, "context");
        return Math.round((context.getResources().getDisplayMetrics().densityDpi / 160) * f2);
    }
}
