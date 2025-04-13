package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* renamed from: b */
    public final int f3738b;

    /* renamed from: c */
    public final AccessibilityNodeInfoCompat f3739c;

    /* renamed from: d */
    public final int f3740d;

    @RestrictTo
    public AccessibilityClickableSpanCompat(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i3) {
        this.f3738b = i2;
        this.f3739c = accessibilityNodeInfoCompat;
        this.f3740d = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3738b);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = this.f3739c;
        accessibilityNodeInfoCompat.f3743a.performAction(this.f3740d, bundle);
    }
}
