package androidx.core.view;

import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class DisplayCompat {

    @RequiresApi
    public static class Api17Impl {
    }

    @RequiresApi
    public static class Api23Impl {
    }

    public static final class ModeCompat {

        @RequiresApi
        public static class Api23Impl {
            @DoNotInline
            /* renamed from: a */
            public static int m2069a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @DoNotInline
            /* renamed from: b */
            public static int m2070b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }
    }
}
