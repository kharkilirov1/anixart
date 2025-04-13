package com.google.android.exoplayer2.p009ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class HtmlUtils {
    /* renamed from: a */
    public static String m7355a(String str) {
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str, C0576a.m4106e(str, 5)), ".", str, ",.", str);
        m4122u.append(" *");
        return m4122u.toString();
    }

    /* renamed from: b */
    public static String m7356b(@ColorInt int i2) {
        return Util.m7747p("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d));
    }
}
