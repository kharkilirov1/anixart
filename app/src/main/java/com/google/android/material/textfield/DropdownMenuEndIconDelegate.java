package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.animation.AnimationUtils;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

/* loaded from: classes.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {

    /* renamed from: e */
    @Nullable
    public AutoCompleteTextView f18973e;

    /* renamed from: f */
    public final View.OnClickListener f18974f;

    /* renamed from: g */
    public final View.OnFocusChangeListener f18975g;

    /* renamed from: h */
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener f18976h;

    /* renamed from: i */
    public boolean f18977i;

    /* renamed from: j */
    public boolean f18978j;

    /* renamed from: k */
    public boolean f18979k;

    /* renamed from: l */
    public long f18980l;

    /* renamed from: m */
    @Nullable
    public AccessibilityManager f18981m;

    /* renamed from: n */
    public ValueAnimator f18982n;

    /* renamed from: o */
    public ValueAnimator f18983o;

    public DropdownMenuEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f18974f = new ViewOnClickListenerC1414b(this, 1);
        this.f18975g = new ViewOnFocusChangeListenerC1415c(this, 1);
        this.f18976h = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.g
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.f18973e;
                if (autoCompleteTextView == null || EditTextUtils.m10453a(autoCompleteTextView)) {
                    return;
                }
                ViewCompat.m2216o0(dropdownMenuEndIconDelegate.f19019d, z ? 2 : 1);
            }
        };
        this.f18980l = Long.MAX_VALUE;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: a */
    public void mo10428a(Editable editable) {
        if (this.f18981m.isTouchExplorationEnabled() && EditTextUtils.m10453a(this.f18973e) && !this.f19019d.hasFocus()) {
            this.f18973e.dismissDropDown();
        }
        this.f18973e.post(new RunnableC1416d(this, 1));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: c */
    public int mo10429c() {
        return C2507R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: d */
    public int mo10430d() {
        return C2507R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: e */
    public View.OnFocusChangeListener mo10431e() {
        return this.f18975g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: f */
    public View.OnClickListener mo10432f() {
        return this.f18974f;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: h */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener mo10442h() {
        return this.f18976h;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: i */
    public boolean mo10443i(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: j */
    public boolean mo10444j() {
        return this.f18977i;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: l */
    public boolean mo10445l() {
        return this.f18979k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: m */
    public void mo10434m(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f18973e = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                Objects.requireNonNull(dropdownMenuEndIconDelegate);
                if (motionEvent.getAction() == 1) {
                    if (dropdownMenuEndIconDelegate.m10449u()) {
                        dropdownMenuEndIconDelegate.f18978j = false;
                    }
                    dropdownMenuEndIconDelegate.m10451w();
                    dropdownMenuEndIconDelegate.m10452x();
                }
                return false;
            }
        });
        this.f18973e.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.f
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.m10452x();
                dropdownMenuEndIconDelegate.m10450v(false);
            }
        });
        this.f18973e.setThreshold(0);
        this.f19016a.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.f18981m.isTouchExplorationEnabled()) {
            ViewCompat.m2216o0(this.f19019d, 2);
        }
        this.f19016a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: n */
    public void mo10446n(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!EditTextUtils.m10453a(this.f18973e)) {
            accessibilityNodeInfoCompat.f3743a.setClassName(Spinner.class.getName());
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = accessibilityNodeInfoCompat.f3743a.isShowingHintText();
        } else {
            Bundle m2502h = accessibilityNodeInfoCompat.m2502h();
            if (m2502h != null && (m2502h.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                z = true;
            }
        }
        if (z) {
            accessibilityNodeInfoCompat.m2513s(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: o */
    public void mo10447o(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f18981m.isEnabled() && !EditTextUtils.m10453a(this.f18973e)) {
            m10451w();
            m10452x();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: r */
    public void mo10436r() {
        this.f18983o = m10448t(67, 0.0f, 1.0f);
        ValueAnimator m10448t = m10448t(50, 1.0f, 0.0f);
        this.f18982n = m10448t;
        m10448t.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate.this.m10478q();
                DropdownMenuEndIconDelegate.this.f18983o.start();
            }
        });
        this.f18981m = (AccessibilityManager) this.f19018c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @SuppressLint
    /* renamed from: s */
    public void mo10437s() {
        AutoCompleteTextView autoCompleteTextView = this.f18973e;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f18973e.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final ValueAnimator m10448t(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f17342a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new C1413a(this, 2));
        return ofFloat;
    }

    /* renamed from: u */
    public final boolean m10449u() {
        long currentTimeMillis = System.currentTimeMillis() - this.f18980l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: v */
    public final void m10450v(boolean z) {
        if (this.f18979k != z) {
            this.f18979k = z;
            this.f18983o.cancel();
            this.f18982n.start();
        }
    }

    /* renamed from: w */
    public final void m10451w() {
        if (this.f18973e == null) {
            return;
        }
        if (m10449u()) {
            this.f18978j = false;
        }
        if (this.f18978j) {
            this.f18978j = false;
            return;
        }
        m10450v(!this.f18979k);
        if (!this.f18979k) {
            this.f18973e.dismissDropDown();
        } else {
            this.f18973e.requestFocus();
            this.f18973e.showDropDown();
        }
    }

    /* renamed from: x */
    public final void m10452x() {
        this.f18978j = true;
        this.f18980l = System.currentTimeMillis();
    }
}
