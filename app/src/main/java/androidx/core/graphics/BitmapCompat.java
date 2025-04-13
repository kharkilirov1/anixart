package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class BitmapCompat {

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1761a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1762b(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1763a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @RequiresApi
    public static class Api27Impl {
        @DoNotInline
        /* renamed from: a */
        public static Bitmap m1764a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = Api31Impl.m1768a(bitmap);
            }
            return bitmap.copy(config, true);
        }

        @DoNotInline
        /* renamed from: b */
        public static Bitmap m1765b(int i2, int i3, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.m1768a(bitmap);
                }
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1766c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1767a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        @DoNotInline
        /* renamed from: a */
        public static Bitmap.Config m1768a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }
}
