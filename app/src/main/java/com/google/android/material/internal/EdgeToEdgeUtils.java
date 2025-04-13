package com.google.android.material.internal;

import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsControllerCompat;

@RestrictTo
/* loaded from: classes.dex */
public class EdgeToEdgeUtils {
    /* renamed from: a */
    public static void m10146a(@NonNull Window window, boolean z) {
        new WindowInsetsControllerCompat(window, window.getDecorView()).m2472d(z);
    }
}
