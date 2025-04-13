package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransientView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final boolean m17420a(@NotNull View view) {
        Intrinsics.m32179h(view, "<this>");
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).getIsTransient()) {
            return true;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        return m17420a(viewGroup);
    }
}
