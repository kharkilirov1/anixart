package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class PopupWindowCompat {

    /* renamed from: a */
    public static Method f3848a;

    /* renamed from: b */
    public static boolean f3849b;

    /* renamed from: c */
    public static Field f3850c;

    /* renamed from: d */
    public static boolean f3851d;

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2633a(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2634a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2635b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2636c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2637d(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    /* renamed from: a */
    public static void m2630a(@NonNull PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.m2636c(popupWindow, z);
            return;
        }
        if (!f3851d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f3850c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f3851d = true;
        }
        Field field = f3850c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    /* renamed from: b */
    public static void m2631b(@NonNull PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.m2637d(popupWindow, i2);
            return;
        }
        if (!f3849b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3848a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3849b = true;
        }
        Method method = f3848a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m2632c(@NonNull PopupWindow popupWindow, @NonNull View view, int i2, int i3, int i4) {
        Api19Impl.m2633a(popupWindow, view, i2, i3, i4);
    }
}
