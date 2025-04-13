package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class EdgeEffectCompat {

    @RequiresApi
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static void m2588a(EdgeEffect edgeEffect, float f2, float f3) {
            edgeEffect.onPull(f2, f3);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        /* renamed from: a */
        public static EdgeEffect m2589a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static float m2590b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static float m2591c(EdgeEffect edgeEffect, float f2, float f3) {
            try {
                return edgeEffect.onPullDistance(f2, f3);
            } catch (Throwable unused) {
                edgeEffect.onPull(f2, f3);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static float m2585a(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m2590b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static void m2586b(@NonNull EdgeEffect edgeEffect, float f2, float f3) {
        Api21Impl.m2588a(edgeEffect, f2, f3);
    }

    /* renamed from: c */
    public static float m2587c(@NonNull EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m2591c(edgeEffect, f2, f3);
        }
        Api21Impl.m2588a(edgeEffect, f2, f3);
        return f2;
    }
}
