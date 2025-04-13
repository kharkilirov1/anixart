package com.google.android.material.color;

/* loaded from: classes.dex */
final class ColorUtils {

    /* renamed from: a */
    public static final float[] f17883a = {95.047f, 100.0f, 108.883f};

    /* renamed from: a */
    public static float m9967a(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((f2 + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }
}
