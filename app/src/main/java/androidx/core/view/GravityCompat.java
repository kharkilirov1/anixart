package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class GravityCompat {

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2085a(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
            Gravity.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2086b(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
            Gravity.apply(i2, i3, i4, rect, rect2, i5);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2087c(int i2, Rect rect, Rect rect2, int i3) {
            Gravity.applyDisplay(i2, rect, rect2, i3);
        }
    }

    /* renamed from: a */
    public static void m2084a(int i2, int i3, int i4, @NonNull Rect rect, @NonNull Rect rect2, int i5) {
        Api17Impl.m2086b(i2, i3, i4, rect, rect2, i5);
    }
}
