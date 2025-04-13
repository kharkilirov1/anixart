package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public class AccessibilityRecordCompat {

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2526a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2527b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2528c(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollX(i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m2529d(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollY(i2);
        }
    }

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2530a(AccessibilityRecord accessibilityRecord, View view, int i2) {
            accessibilityRecord.setSource(view, i2);
        }
    }

    /* renamed from: a */
    public static void m2523a(@NonNull AccessibilityRecord accessibilityRecord, int i2) {
        Api15Impl.m2528c(accessibilityRecord, i2);
    }

    /* renamed from: b */
    public static void m2524b(@NonNull AccessibilityRecord accessibilityRecord, int i2) {
        Api15Impl.m2529d(accessibilityRecord, i2);
    }

    /* renamed from: c */
    public static void m2525c(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i2) {
        Api16Impl.m2530a(accessibilityRecord, view, i2);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        Objects.requireNonNull((AccessibilityRecordCompat) obj);
        return true;
    }

    @Deprecated
    public int hashCode() {
        return 0;
    }
}
