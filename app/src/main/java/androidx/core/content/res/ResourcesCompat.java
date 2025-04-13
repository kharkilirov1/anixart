package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ResourcesCompat {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f3339a = new ThreadLocal<>();

    /* renamed from: b */
    @GuardedBy
    public static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> f3340b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f3341c = new Object();

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m1737a(Resources resources, int i2, int i3) {
            return resources.getDrawableForDensity(i2, i3);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m1738a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m1739b(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1740a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getColor(i2, theme);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static ColorStateList m1741b(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i2, theme);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static float m1742a(@NonNull Resources resources, @DimenRes int i2) {
            return resources.getFloat(i2);
        }
    }

    public static class ColorStateListCacheEntry {

        /* renamed from: a */
        public final ColorStateList f3342a;

        /* renamed from: b */
        public final Configuration f3343b;

        /* renamed from: c */
        public final int f3344c;

        public ColorStateListCacheEntry(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f3342a = colorStateList;
            this.f3343b = configuration;
            this.f3344c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class ColorStateListCacheKey {

        /* renamed from: a */
        public final Resources f3345a;

        /* renamed from: b */
        public final Resources.Theme f3346b;

        public ColorStateListCacheKey(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f3345a = resources;
            this.f3346b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ColorStateListCacheKey.class != obj.getClass()) {
                return false;
            }
            ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
            return this.f3345a.equals(colorStateListCacheKey.f3345a) && ObjectsCompat.m2022a(this.f3346b, colorStateListCacheKey.f3346b);
        }

        public int hashCode() {
            return ObjectsCompat.m2023b(this.f3345a, this.f3346b);
        }
    }

    public static abstract class FontCallback {
        @NonNull
        @RestrictTo
        /* renamed from: c */
        public static Handler m1743c(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo
        /* renamed from: a */
        public final void m1744a(final int i2, @Nullable Handler handler) {
            m1743c(handler).post(new Runnable() { // from class: androidx.core.content.res.a
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback.this.mo795d(i2);
                }
            });
        }

        @RestrictTo
        /* renamed from: b */
        public final void m1745b(@NonNull Typeface typeface, @Nullable Handler handler) {
            m1743c(handler).post(new RunnableC0207a(this, typeface, 1));
        }

        /* renamed from: d */
        public abstract void mo795d(int i2);

        /* renamed from: e */
        public abstract void mo796e(@NonNull Typeface typeface);
    }

    public static final class ThemeCompat {

        @RequiresApi
        public static class Api23Impl {

            /* renamed from: a */
            public static final Object f3347a = new Object();

            /* renamed from: b */
            public static Method f3348b;

            /* renamed from: c */
            public static boolean f3349c;
        }

        @RequiresApi
        public static class Api29Impl {
            @DoNotInline
            /* renamed from: a */
            public static void m1747a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m1746a(@NonNull Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                Api29Impl.m1747a(theme);
                return;
            }
            if (i2 >= 23) {
                synchronized (Api23Impl.f3347a) {
                    if (!Api23Impl.f3349c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            Api23Impl.f3348b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        Api23Impl.f3349c = true;
                    }
                    Method method = Api23Impl.f3348b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            Api23Impl.f3348b = null;
                        }
                    }
                }
            }
        }
    }

    @ColorInt
    /* renamed from: a */
    public static int m1731a(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.m1740a(resources, i2, theme) : resources.getColor(i2);
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m1732b(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateListCacheEntry colorStateListCacheEntry;
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        synchronized (f3341c) {
            SparseArray<ColorStateListCacheEntry> sparseArray = f3340b.get(colorStateListCacheKey);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = sparseArray.get(i2)) != null) {
                if (!colorStateListCacheEntry.f3343b.equals(resources.getConfiguration()) || (!(theme == null && colorStateListCacheEntry.f3344c == 0) && (theme == null || colorStateListCacheEntry.f3344c != theme.hashCode()))) {
                    sparseArray.remove(i2);
                } else {
                    colorStateList2 = colorStateListCacheEntry.f3342a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = f3339a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (!(i3 >= 28 && i3 <= 31)) {
            try {
                colorStateList = ColorStateListInflaterCompat.m1720a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? Api23Impl.m1741b(resources, i2, theme) : resources.getColorStateList(i2);
        }
        synchronized (f3341c) {
            WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> weakHashMap = f3340b;
            SparseArray<ColorStateListCacheEntry> sparseArray2 = weakHashMap.get(colorStateListCacheKey);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(colorStateListCacheKey, sparseArray2);
            }
            sparseArray2.append(i2, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.f3345a.getConfiguration(), theme));
        }
        return colorStateList;
    }

    @Nullable
    /* renamed from: c */
    public static Drawable m1733c(@NonNull Resources resources, @DrawableRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.m1738a(resources, i2, theme);
    }

    @Nullable
    /* renamed from: d */
    public static Drawable m1734d(@NonNull Resources resources, @DrawableRes int i2, int i3, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.m1739b(resources, i2, i3, theme);
    }

    @Nullable
    /* renamed from: e */
    public static Typeface m1735e(@NonNull Context context, @FontRes int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1736f(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00df A[ADDED_TO_REGION] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m1736f(@androidx.annotation.NonNull android.content.Context r18, int r19, @androidx.annotation.NonNull android.util.TypedValue r20, int r21, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r22, @androidx.annotation.Nullable android.os.Handler r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.m1736f(android.content.Context, int, android.util.TypedValue, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
