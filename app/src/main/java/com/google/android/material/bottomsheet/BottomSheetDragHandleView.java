package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.C0273a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;

/* loaded from: classes.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: i */
    public static final /* synthetic */ int f17679i = 0;

    /* renamed from: e */
    @Nullable
    public BottomSheetBehavior<?> f17680e;

    /* renamed from: f */
    public boolean f17681f;

    /* renamed from: g */
    public boolean f17682g;

    /* renamed from: h */
    public boolean f17683h;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$1 */
    public class C12391 extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: b */
        public void mo9859b(@NonNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: c */
        public void mo9860c(@NonNull View view, int i2) {
            int i3 = BottomSheetDragHandleView.f17679i;
            throw null;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$2 */
    class C12402 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: e */
        public void mo2045e(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            this.f3570a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() != 1) {
                return;
            }
            int i2 = BottomSheetDragHandleView.f17679i;
            throw null;
        }
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f17680e;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f17606V.remove((Object) null);
        }
        this.f17680e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            m9869i(bottomSheetBehavior.f17595K);
            this.f17680e.m9851s(null);
        }
        m9870j();
    }

    /* renamed from: g */
    public final boolean m9868g() {
        boolean z = false;
        if (!this.f17682g) {
            return false;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.f17680e;
        if (!bottomSheetBehavior.f17613b) {
            Objects.requireNonNull(bottomSheetBehavior);
            z = true;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f17680e;
        int i2 = bottomSheetBehavior2.f17595K;
        int i3 = 6;
        if (i2 == 4) {
            if (!z) {
                i3 = 3;
            }
        } else if (i2 != 3) {
            i3 = this.f17683h ? 3 : 4;
        } else if (!z) {
            i3 = 4;
        }
        bottomSheetBehavior2.m9843E(i3);
        return true;
    }

    /* renamed from: i */
    public final void m9869i(int i2) {
        if (i2 == 4) {
            this.f17683h = true;
        } else if (i2 == 3) {
            this.f17683h = false;
        }
        ViewCompat.m2190b0(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3748g, null, new C0273a(this, 9));
    }

    /* renamed from: j */
    public final void m9870j() {
        this.f17682g = this.f17681f && this.f17680e != null;
        ViewCompat.m2216o0(this, this.f17680e == null ? 2 : 1);
        setClickable(this.f17682g);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.f17681f = z;
        m9870j();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f3070a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }
}
