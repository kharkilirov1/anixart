package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class aj1 {
    @NonNull
    /* renamed from: a */
    public static Rect m22530a(@NonNull View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {r2, r3};
        view.getRootView().getLocationOnScreen(iArr);
        int i2 = -iArr[0];
        int i3 = -iArr[1];
        rect.offset(i2, i3);
        return rect;
    }
}
