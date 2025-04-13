package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ViewGroupCompat {

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2371a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2372b(ViewGroup viewGroup, int i2) {
            viewGroup.setLayoutMode(i2);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2373a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2374b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2375c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m2370a(@NonNull ViewGroup viewGroup) {
        return Api21Impl.m2374b(viewGroup);
    }
}
