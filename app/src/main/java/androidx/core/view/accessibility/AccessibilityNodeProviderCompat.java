package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* renamed from: a */
    @Nullable
    public final Object f3763a;

    @RequiresApi
    public static class AccessibilityNodeProviderApi16 extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final AccessibilityNodeProviderCompat f3764a;

        public AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f3764a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            AccessibilityNodeInfoCompat mo2520a = this.f3764a.mo2520a(i2);
            if (mo2520a == null) {
                return null;
            }
            return mo2520a.f3743a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            Objects.requireNonNull(this.f3764a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f3764a.mo2522c(i2, i3, bundle);
        }
    }

    @RequiresApi
    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProviderApi16 {
        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            AccessibilityNodeInfoCompat mo2521b = this.f3764a.mo2521b(i2);
            if (mo2521b == null) {
                return null;
            }
            return mo2521b.f3743a;
        }
    }

    @RequiresApi
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f3764a);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3763a = new AccessibilityNodeProviderApi26(this);
        } else {
            this.f3763a = new AccessibilityNodeProviderApi19(this);
        }
    }

    @Nullable
    /* renamed from: a */
    public AccessibilityNodeInfoCompat mo2520a(int i2) {
        return null;
    }

    @Nullable
    /* renamed from: b */
    public AccessibilityNodeInfoCompat mo2521b(int i2) {
        return null;
    }

    /* renamed from: c */
    public boolean mo2522c(int i2, int i3, @Nullable Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(@Nullable Object obj) {
        this.f3763a = obj;
    }
}
