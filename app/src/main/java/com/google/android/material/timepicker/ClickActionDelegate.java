package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {

    /* renamed from: d */
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat f19173d;

    public ClickActionDelegate(Context context, int i2) {
        super(AccessibilityDelegateCompat.f3569c);
        this.f19173d = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i2));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: d */
    public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
        accessibilityNodeInfoCompat.m2497a(this.f19173d);
    }
}
