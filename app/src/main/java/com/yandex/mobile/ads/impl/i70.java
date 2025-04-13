package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class i70 {
    /* renamed from: a */
    public static void m25455a(@NonNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
