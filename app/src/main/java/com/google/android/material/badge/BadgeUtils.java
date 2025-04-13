package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

@ExperimentalBadgeUtils
/* loaded from: classes.dex */
public class BadgeUtils {

    /* renamed from: com.google.android.material.badge.BadgeUtils$1 */
    class RunnableC12071 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$2 */
    class C12082 extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final /* synthetic */ BadgeDrawable f17506d;

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            accessibilityNodeInfoCompat.f3743a.setContentDescription(this.f17506d.m9802c());
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$3 */
    class C12093 extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final /* synthetic */ BadgeDrawable f17507d;

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            accessibilityNodeInfoCompat.f3743a.setContentDescription(this.f17507d.m9802c());
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$4 */
    class C12104 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            accessibilityNodeInfoCompat.f3743a.setContentDescription(null);
        }
    }

    /* renamed from: a */
    public static void m9808a(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        m9810c(badgeDrawable, view, null);
        if (badgeDrawable.m9803d() != null) {
            badgeDrawable.m9803d().setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    /* renamed from: b */
    public static void m9809b(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (badgeDrawable.m9803d() != null) {
            badgeDrawable.m9803d().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    /* renamed from: c */
    public static void m9810c(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m9806g(view, frameLayout);
    }
}
