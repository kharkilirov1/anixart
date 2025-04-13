package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class DrawableCompat {

    /* renamed from: a */
    public static Method f3396a;

    /* renamed from: b */
    public static boolean f3397b;

    /* renamed from: c */
    public static Method f3398c;

    /* renamed from: d */
    public static boolean f3399d;

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1846a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m1847b(DrawableContainer.DrawableContainerState drawableContainerState, int i2) {
            return drawableContainerState.getChild(i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static Drawable m1848c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m1849d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m1850e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1851a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1852b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        /* renamed from: c */
        public static ColorFilter m1853c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m1854d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m1855e(Drawable drawable, float f2, float f3) {
            drawable.setHotspot(f2, f3);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m1856f(Drawable drawable, int i2, int i3, int i4, int i5) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m1857g(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m1858h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m1859i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1860a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1861b(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }
    }

    /* renamed from: a */
    public static void m1829a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        Api21Impl.m1851a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m1830b(@NonNull Drawable drawable) {
        return Api21Impl.m1852b(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m1831c(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m1831c(Api19Impl.m1848c((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof WrappedDrawable) {
            m1831c(((WrappedDrawable) drawable).mo1891b());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Drawable m1847b = Api19Impl.m1847b(drawableContainerState, i2);
            if (m1847b != null) {
                m1831c(m1847b);
            }
        }
    }

    /* renamed from: d */
    public static int m1832d(@NonNull Drawable drawable) {
        return Api19Impl.m1846a(drawable);
    }

    @Nullable
    /* renamed from: e */
    public static ColorFilter m1833e(@NonNull Drawable drawable) {
        return Api21Impl.m1853c(drawable);
    }

    /* renamed from: f */
    public static int m1834f(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1860a(drawable);
        }
        if (!f3399d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f3398c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f3399d = true;
        }
        Method method = f3398c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f3398c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m1835g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.m1854d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m1836h(@NonNull Drawable drawable) {
        return Api19Impl.m1849d(drawable);
    }

    /* renamed from: i */
    public static void m1837i(@NonNull Drawable drawable, boolean z) {
        Api19Impl.m1850e(drawable, z);
    }

    /* renamed from: j */
    public static void m1838j(@NonNull Drawable drawable, float f2, float f3) {
        Api21Impl.m1855e(drawable, f2, f3);
    }

    /* renamed from: k */
    public static void m1839k(@NonNull Drawable drawable, int i2, int i3, int i4, int i5) {
        Api21Impl.m1856f(drawable, i2, i3, i4, i5);
    }

    /* renamed from: l */
    public static boolean m1840l(@NonNull Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1861b(drawable, i2);
        }
        if (!f3397b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f3396a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f3397b = true;
        }
        Method method = f3396a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f3396a = null;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static void m1841m(@NonNull Drawable drawable, @ColorInt int i2) {
        Api21Impl.m1857g(drawable, i2);
    }

    /* renamed from: n */
    public static void m1842n(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        Api21Impl.m1858h(drawable, colorStateList);
    }

    /* renamed from: o */
    public static void m1843o(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
        Api21Impl.m1859i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static <T extends Drawable> T m1844p(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).mo1891b() : drawable;
    }

    @NonNull
    /* renamed from: q */
    public static Drawable m1845q(@NonNull Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof TintAwareDrawable)) ? new WrappedDrawableApi21(drawable) : drawable;
    }
}
