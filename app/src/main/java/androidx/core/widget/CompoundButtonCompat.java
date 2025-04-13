package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class CompoundButtonCompat {

    /* renamed from: a */
    public static Field f3816a;

    /* renamed from: b */
    public static boolean f3817b;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static ColorStateList m2580a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        /* renamed from: b */
        public static PorterDuff.Mode m2581b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2582c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2583d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m2584a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Drawable m2575a(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m2584a(compoundButton);
        }
        if (!f3817b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3816a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f3817b = true;
        }
        Field field = f3816a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f3816a = null;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m2576b(@NonNull CompoundButton compoundButton) {
        return Api21Impl.m2580a(compoundButton);
    }

    @Nullable
    /* renamed from: c */
    public static PorterDuff.Mode m2577c(@NonNull CompoundButton compoundButton) {
        return Api21Impl.m2581b(compoundButton);
    }

    /* renamed from: d */
    public static void m2578d(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        Api21Impl.m2582c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m2579e(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        Api21Impl.m2583d(compoundButton, mode);
    }
}
