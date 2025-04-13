package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PathInterpolatorCompat {

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static PathInterpolator m2550a(float f2, float f3) {
            return new PathInterpolator(f2, f3);
        }

        @DoNotInline
        /* renamed from: b */
        public static PathInterpolator m2551b(float f2, float f3, float f4, float f5) {
            return new PathInterpolator(f2, f3, f4, f5);
        }

        @DoNotInline
        /* renamed from: c */
        public static PathInterpolator m2552c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    /* renamed from: a */
    public static Interpolator m2548a(float f2, float f3, float f4, float f5) {
        return Api21Impl.m2551b(f2, f3, f4, f5);
    }

    @NonNull
    /* renamed from: b */
    public static Interpolator m2549b(@NonNull Path path) {
        return Api21Impl.m2552c(path);
    }
}
