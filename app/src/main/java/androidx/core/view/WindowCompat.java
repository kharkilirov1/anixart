package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class WindowCompat {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2405a(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m2406a(Window window, int i2) {
            return (T) window.requireViewById(i2);
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2407a(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static void m2404a(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.m2407a(window, z);
        } else {
            Api16Impl.m2405a(window, z);
        }
    }
}
