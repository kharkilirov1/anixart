package androidx.window.layout;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowMetricsCalculatorCompat.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {

    /* renamed from: a */
    @NotNull
    public static final WindowMetricsCalculatorCompat f6809a = new WindowMetricsCalculatorCompat();

    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    @androidx.annotation.RequiresApi
    @android.annotation.SuppressLint
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Rect m4466a(@org.jetbrains.annotations.NotNull android.app.Activity r11) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowMetricsCalculatorCompat.m4466a(android.app.Activity):android.graphics.Rect");
    }

    /* renamed from: b */
    public final int m4467b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
