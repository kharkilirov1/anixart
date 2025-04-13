package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {

    /* renamed from: e */
    @Nullable
    public EditText f18965e;

    /* renamed from: f */
    public final View.OnClickListener f18966f;

    /* renamed from: g */
    public final View.OnFocusChangeListener f18967g;

    /* renamed from: h */
    public AnimatorSet f18968h;

    /* renamed from: i */
    public ValueAnimator f18969i;

    public ClearTextEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f18966f = new ViewOnClickListenerC1414b(this, 0);
        this.f18967g = new ViewOnFocusChangeListenerC1415c(this, 0);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: a */
    public void mo10428a(@NonNull Editable editable) {
        if (this.f19017b.f19001q != null) {
            return;
        }
        m10438t(m10440v());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: c */
    public int mo10429c() {
        return C2507R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: d */
    public int mo10430d() {
        return C2507R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: e */
    public View.OnFocusChangeListener mo10431e() {
        return this.f18967g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: f */
    public View.OnClickListener mo10432f() {
        return this.f18966f;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: g */
    public View.OnFocusChangeListener mo10433g() {
        return this.f18967g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: m */
    public void mo10434m(@Nullable EditText editText) {
        this.f18965e = editText;
        this.f19016a.setEndIconVisible(m10440v());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: p */
    public void mo10435p(boolean z) {
        if (this.f19017b.f19001q == null) {
            return;
        }
        m10438t(z);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: r */
    public void mo10436r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AnimationUtils.f17345d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C1413a(this, 0));
        ValueAnimator m10439u = m10439u(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f18968h = animatorSet;
        animatorSet.playTogether(ofFloat, m10439u);
        this.f18968h.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.f19017b.m10467n(true);
            }
        });
        ValueAnimator m10439u2 = m10439u(1.0f, 0.0f);
        this.f18969i = m10439u2;
        m10439u2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.f19017b.m10467n(false);
            }
        });
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: s */
    public void mo10437s() {
        EditText editText = this.f18965e;
        if (editText != null) {
            editText.post(new RunnableC1416d(this, 0));
        }
    }

    /* renamed from: t */
    public final void m10438t(boolean z) {
        boolean z2 = this.f19017b.m10459f() == z;
        if (z && !this.f18968h.isRunning()) {
            this.f18969i.cancel();
            this.f18968h.start();
            if (z2) {
                this.f18968h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f18968h.cancel();
        this.f18969i.start();
        if (z2) {
            this.f18969i.end();
        }
    }

    /* renamed from: u */
    public final ValueAnimator m10439u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f17342a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C1413a(this, 1));
        return ofFloat;
    }

    /* renamed from: v */
    public final boolean m10440v() {
        EditText editText = this.f18965e;
        return editText != null && (editText.hasFocus() || this.f19019d.hasFocus()) && this.f18965e.getText().length() > 0;
    }
}
