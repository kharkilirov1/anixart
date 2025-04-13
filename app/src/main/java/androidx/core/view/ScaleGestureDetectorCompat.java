package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ScaleGestureDetectorCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2155a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2156b(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }
}
