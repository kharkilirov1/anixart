package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityStateChangeListenerWrapper)) {
                return false;
            }
            Objects.requireNonNull((AccessibilityStateChangeListenerWrapper) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            throw null;
        }
    }

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2493a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2494b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
        }
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z);
    }

    @RequiresApi
    public static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final TouchExplorationStateChangeListener f3741a;

        public TouchExplorationStateChangeListenerWrapper(@NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f3741a = touchExplorationStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TouchExplorationStateChangeListenerWrapper) {
                return this.f3741a.equals(((TouchExplorationStateChangeListenerWrapper) obj).f3741a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3741a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f3741a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m2491a(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return Api19Impl.m2493a(accessibilityManager, touchExplorationStateChangeListener);
    }

    /* renamed from: b */
    public static boolean m2492b(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return Api19Impl.m2494b(accessibilityManager, touchExplorationStateChangeListener);
    }
}
