package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {

    /* renamed from: a */
    public final DisplayCutout f3589a;

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m2071a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m2072b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2073c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m2074d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2075e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        /* renamed from: f */
        public static int m2076f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m2077a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static DisplayCutout m2078a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Insets m2079b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f3589a = displayCutout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.m2022a(this.f3589a, ((DisplayCutoutCompat) obj).f3589a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3589a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DisplayCutoutCompat{");
        m24u.append(this.f3589a);
        m24u.append("}");
        return m24u.toString();
    }
}
