package androidx.core.hardware.display;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class DisplayManagerCompat {

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static Display m1895a(DisplayManager displayManager, int i2) {
            return displayManager.getDisplay(i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Display[] m1896b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    static {
        new WeakHashMap();
    }
}
