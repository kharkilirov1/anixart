package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PathUtils {

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static float[] m1793a(Path path, float f2) {
            return path.approximate(f2);
        }
    }
}
