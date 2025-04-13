package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ViewParentCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2380a(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2381a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
            return viewParent.onNestedFling(view, f2, f3, z);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2382b(ViewParent viewParent, View view, float f2, float f3) {
            return viewParent.onNestedPreFling(view, f2, f3);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2383c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
            viewParent.onNestedPreScroll(view, i2, i3, iArr);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2384d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
            viewParent.onNestedScroll(view, i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2385e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.onNestedScrollAccepted(view, view2, i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m2386f(ViewParent viewParent, View view, View view2, int i2) {
            return viewParent.onStartNestedScroll(view, view2, i2);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2387g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }
}
