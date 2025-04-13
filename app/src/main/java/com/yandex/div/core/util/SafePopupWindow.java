package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafePopupWindow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/SafePopupWindow;", "Landroid/widget/PopupWindow;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(@NotNull View view, int i2, int i3, boolean z) {
        super(view, i2, i3, z);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
