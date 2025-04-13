package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: View.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewsKt$doOnActualLayout$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.m32179h(view, "view");
        view.removeOnLayoutChangeListener(this);
        throw null;
    }
}
