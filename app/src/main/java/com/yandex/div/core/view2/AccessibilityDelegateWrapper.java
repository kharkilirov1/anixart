package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessibilityDelegateWrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/AccessibilityDelegateWrapper;", "Landroidx/core/view/AccessibilityDelegateCompat;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AccessibilityDelegateWrapper extends AccessibilityDelegateCompat {

    /* renamed from: d */
    @Nullable
    public final AccessibilityDelegateCompat f31515d;

    /* renamed from: e */
    @NotNull
    public final Function2<View, AccessibilityNodeInfoCompat, Unit> f31516e;

    /* compiled from: AccessibilityDelegateWrapper.kt */
    @Metadata(m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m31884d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    /* renamed from: com.yandex.div.core.view2.AccessibilityDelegateWrapper$1 */
    final class C28491 extends Lambda implements Function2<View, AccessibilityNodeInfoCompat, Unit> {
        static {
            new C28491();
        }

        public C28491() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessibilityDelegateWrapper(@Nullable AccessibilityDelegateCompat accessibilityDelegateCompat, @NotNull Function2<? super View, ? super AccessibilityNodeInfoCompat, Unit> function2) {
        super(AccessibilityDelegateCompat.f3569c);
        this.f31515d = accessibilityDelegateCompat;
        this.f31516e = function2;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: a */
    public boolean mo2041a(@Nullable View view, @Nullable AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        Boolean valueOf = accessibilityDelegateCompat == null ? null : Boolean.valueOf(accessibilityDelegateCompat.mo2041a(view, accessibilityEvent));
        return valueOf == null ? this.f3570a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : valueOf.booleanValue();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @Nullable
    /* renamed from: b */
    public AccessibilityNodeProviderCompat mo2042b(@Nullable View view) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        AccessibilityNodeProviderCompat mo2042b = accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.mo2042b(view);
        return mo2042b == null ? super.mo2042b(view) : mo2042b;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: c */
    public void mo2043c(@Nullable View view, @Nullable AccessibilityEvent accessibilityEvent) {
        Unit unit;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        if (accessibilityDelegateCompat == null) {
            unit = null;
        } else {
            accessibilityDelegateCompat.mo2043c(view, accessibilityEvent);
            unit = Unit.f63088a;
        }
        if (unit == null) {
            this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: d */
    public void mo2044d(@Nullable View view, @Nullable AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Unit unit;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        if (accessibilityDelegateCompat == null) {
            unit = null;
        } else {
            accessibilityDelegateCompat.mo2044d(view, accessibilityNodeInfoCompat);
            unit = Unit.f63088a;
        }
        if (unit == null) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
        }
        this.f31516e.invoke(view, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: e */
    public void mo2045e(@Nullable View view, @Nullable AccessibilityEvent accessibilityEvent) {
        Unit unit;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        if (accessibilityDelegateCompat == null) {
            unit = null;
        } else {
            accessibilityDelegateCompat.mo2045e(view, accessibilityEvent);
            unit = Unit.f63088a;
        }
        if (unit == null) {
            this.f3570a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: f */
    public boolean mo2046f(@Nullable ViewGroup viewGroup, @Nullable View view, @Nullable AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        Boolean valueOf = accessibilityDelegateCompat == null ? null : Boolean.valueOf(accessibilityDelegateCompat.mo2046f(viewGroup, view, accessibilityEvent));
        return valueOf == null ? this.f3570a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : valueOf.booleanValue();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: g */
    public boolean mo2047g(@Nullable View view, int i2, @Nullable Bundle bundle) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        Boolean valueOf = accessibilityDelegateCompat == null ? null : Boolean.valueOf(accessibilityDelegateCompat.mo2047g(view, i2, bundle));
        return valueOf == null ? super.mo2047g(view, i2, bundle) : valueOf.booleanValue();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: h */
    public void mo2048h(@Nullable View view, int i2) {
        Unit unit;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        if (accessibilityDelegateCompat == null) {
            unit = null;
        } else {
            accessibilityDelegateCompat.mo2048h(view, i2);
            unit = Unit.f63088a;
        }
        if (unit == null) {
            this.f3570a.sendAccessibilityEvent(view, i2);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    /* renamed from: i */
    public void mo2049i(@Nullable View view, @Nullable AccessibilityEvent accessibilityEvent) {
        Unit unit;
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.f31515d;
        if (accessibilityDelegateCompat == null) {
            unit = null;
        } else {
            accessibilityDelegateCompat.mo2049i(view, accessibilityEvent);
            unit = Unit.f63088a;
        }
        if (unit == null) {
            this.f3570a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
