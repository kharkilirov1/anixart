package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewsKt {
    /* renamed from: a */
    public static final View m16767a(View view) {
        View view2 = null;
        while (view != null) {
            if (!m16768b(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    /* renamed from: b */
    public static final boolean m16768b(@NotNull View view) {
        Intrinsics.m32179h(view, "<this>");
        return view.getWidth() > 0 || view.getHeight() > 0;
    }
}
