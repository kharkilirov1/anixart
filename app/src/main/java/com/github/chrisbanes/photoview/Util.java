package com.github.chrisbanes.photoview;

import android.widget.ImageView;

/* loaded from: classes.dex */
class Util {

    /* renamed from: com.github.chrisbanes.photoview.Util$1 */
    public static /* synthetic */ class C08911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8944a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f8944a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m5394a(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f3 >= f4) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }
}
