package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {

    /* renamed from: a */
    public final Object f3765a;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2532a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static AccessibilityWindowInfo m2533b(AccessibilityWindowInfo accessibilityWindowInfo, int i2) {
            return accessibilityWindowInfo.getChild(i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2534c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m2535d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2536e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        /* renamed from: f */
        public static AccessibilityWindowInfo m2537f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        /* renamed from: g */
        public static AccessibilityNodeInfo m2538g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        /* renamed from: h */
        public static int m2539h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m2540i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m2541j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        /* renamed from: k */
        public static boolean m2542k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        /* renamed from: l */
        public static AccessibilityWindowInfo m2543l() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        /* renamed from: m */
        public static AccessibilityWindowInfo m2544m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m2545n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeInfo m2546a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m2547b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    public AccessibilityWindowInfoCompat(Object obj) {
        this.f3765a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f3765a;
        return obj2 == null ? accessibilityWindowInfoCompat.f3765a == null : obj2.equals(accessibilityWindowInfoCompat.f3765a);
    }

    public int hashCode() {
        Object obj = this.f3765a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        Api21Impl.m2532a((AccessibilityWindowInfo) this.f3765a, rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(Api21Impl.m2535d((AccessibilityWindowInfo) this.f3765a));
        sb.append(", type=");
        int m2539h = Api21Impl.m2539h((AccessibilityWindowInfo) this.f3765a);
        sb.append(m2539h != 1 ? m2539h != 2 ? m2539h != 3 ? m2539h != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb.append(", layer=");
        sb.append(Api21Impl.m2536e((AccessibilityWindowInfo) this.f3765a));
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(Api21Impl.m2542k((AccessibilityWindowInfo) this.f3765a));
        sb.append(", active=");
        sb.append(Api21Impl.m2541j((AccessibilityWindowInfo) this.f3765a));
        sb.append(", hasParent=");
        AccessibilityWindowInfo m2537f = Api21Impl.m2537f((AccessibilityWindowInfo) this.f3765a);
        sb.append((m2537f != null ? new AccessibilityWindowInfoCompat(m2537f) : null) != null);
        sb.append(", hasChildren=");
        sb.append(Api21Impl.m2534c((AccessibilityWindowInfo) this.f3765a) > 0);
        sb.append(']');
        return sb.toString();
    }
}
