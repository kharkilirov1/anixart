package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AccessibilityEventCompat {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2485a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2486b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2487c(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setAction(i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2488d(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setMovementGranularity(i2);
        }
    }

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2489a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m2490b(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ContentChangeType {
    }

    /* renamed from: a */
    public static int m2483a(@NonNull AccessibilityEvent accessibilityEvent) {
        return Api19Impl.m2489a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m2484b(@NonNull AccessibilityEvent accessibilityEvent, int i2) {
        Api19Impl.m2490b(accessibilityEvent, i2);
    }
}
