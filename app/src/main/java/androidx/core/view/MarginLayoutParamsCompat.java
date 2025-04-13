package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MarginLayoutParamsCompat {

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2094a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2095b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2096c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m2097d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2098e(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.resolveLayoutDirection(i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2099f(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setLayoutDirection(i2);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2100g(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginEnd(i2);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2101h(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
            marginLayoutParams.setMarginStart(i2);
        }
    }

    /* renamed from: a */
    public static int m2090a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Api17Impl.m2095b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m2091b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Api17Impl.m2096c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m2092c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        Api17Impl.m2100g(marginLayoutParams, i2);
    }

    /* renamed from: d */
    public static void m2093d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        Api17Impl.m2101h(marginLayoutParams, i2);
    }
}
