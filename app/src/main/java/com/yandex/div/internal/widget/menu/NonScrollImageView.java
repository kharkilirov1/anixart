package com.yandex.div.internal.widget.menu;

import android.graphics.Rect;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
class NonScrollImageView extends AppCompatImageView {
    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }
}
