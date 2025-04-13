package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.util.SafePopupWindow;
import kotlin.Metadata;

/* compiled from: DivTooltipWindow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipWindow;", "Lcom/yandex/div/core/util/SafePopupWindow;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public DivTooltipWindow(View view, int i2, int i3, boolean z, int i4) {
        super(view, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? false : z);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
