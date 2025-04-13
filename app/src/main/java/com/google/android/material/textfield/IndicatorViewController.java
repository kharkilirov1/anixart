package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.resources.MaterialResources;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class IndicatorViewController {

    /* renamed from: a */
    public final Context f19020a;

    /* renamed from: b */
    @NonNull
    public final TextInputLayout f19021b;

    /* renamed from: c */
    public LinearLayout f19022c;

    /* renamed from: d */
    public int f19023d;

    /* renamed from: e */
    public FrameLayout f19024e;

    /* renamed from: f */
    @Nullable
    public Animator f19025f;

    /* renamed from: g */
    public final float f19026g;

    /* renamed from: h */
    public int f19027h;

    /* renamed from: i */
    public int f19028i;

    /* renamed from: j */
    @Nullable
    public CharSequence f19029j;

    /* renamed from: k */
    public boolean f19030k;

    /* renamed from: l */
    @Nullable
    public TextView f19031l;

    /* renamed from: m */
    @Nullable
    public CharSequence f19032m;

    /* renamed from: n */
    public int f19033n;

    /* renamed from: o */
    @Nullable
    public ColorStateList f19034o;

    /* renamed from: p */
    public CharSequence f19035p;

    /* renamed from: q */
    public boolean f19036q;

    /* renamed from: r */
    @Nullable
    public TextView f19037r;

    /* renamed from: s */
    public int f19038s;

    /* renamed from: t */
    @Nullable
    public ColorStateList f19039t;

    /* renamed from: u */
    public Typeface f19040u;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        this.f19020a = textInputLayout.getContext();
        this.f19021b = textInputLayout;
        this.f19026g = r0.getResources().getDimensionPixelSize(C2507R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public void m10485a(TextView textView, int i2) {
        if (this.f19022c == null && this.f19024e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f19020a);
            this.f19022c = linearLayout;
            linearLayout.setOrientation(0);
            this.f19021b.addView(this.f19022c, -1, -2);
            this.f19024e = new FrameLayout(this.f19020a);
            this.f19022c.addView(this.f19024e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f19021b.getEditText() != null) {
                m10486b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f19024e.setVisibility(0);
            this.f19024e.addView(textView);
        } else {
            this.f19022c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f19022c.setVisibility(0);
        this.f19023d++;
    }

    /* renamed from: b */
    public void m10486b() {
        if ((this.f19022c == null || this.f19021b.getEditText() == null) ? false : true) {
            EditText editText = this.f19021b.getEditText();
            boolean m10245f = MaterialResources.m10245f(this.f19020a);
            ViewCompat.m2226t0(this.f19022c, m10490f(m10245f, C2507R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.m2159B(editText)), m10490f(m10245f, C2507R.dimen.material_helper_text_font_1_3_padding_top, this.f19020a.getResources().getDimensionPixelSize(C2507R.dimen.material_helper_text_default_padding_top)), m10490f(m10245f, C2507R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.m2157A(editText)), 0);
        }
    }

    /* renamed from: c */
    public void m10487c() {
        Animator animator = this.f19025f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void m10488d(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(AnimationUtils.f17342a);
            list.add(ofFloat);
            if (i4 == i2) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f19026g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(AnimationUtils.f17345d);
                list.add(ofFloat2);
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public final TextView m10489e(int i2) {
        if (i2 == 1) {
            return this.f19031l;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f19037r;
    }

    /* renamed from: f */
    public final int m10490f(boolean z, @DimenRes int i2, int i3) {
        return z ? this.f19020a.getResources().getDimensionPixelSize(i2) : i3;
    }

    /* renamed from: g */
    public void m10491g() {
        this.f19029j = null;
        m10487c();
        if (this.f19027h == 1) {
            if (!this.f19036q || TextUtils.isEmpty(this.f19035p)) {
                this.f19028i = 0;
            } else {
                this.f19028i = 2;
            }
        }
        m10494j(this.f19027h, this.f19028i, m10493i(this.f19031l, ""));
    }

    /* renamed from: h */
    public void m10492h(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f19022c;
        if (linearLayout == null) {
            return;
        }
        if (!(i2 == 0 || i2 == 1) || (frameLayout = this.f19024e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.f19023d - 1;
        this.f19023d = i3;
        LinearLayout linearLayout2 = this.f19022c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final boolean m10493i(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        return ViewCompat.m2174N(this.f19021b) && this.f19021b.isEnabled() && !(this.f19028i == this.f19027h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: j */
    public final void m10494j(final int i2, final int i3, boolean z) {
        TextView m10489e;
        TextView m10489e2;
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f19025f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m10488d(arrayList, this.f19036q, this.f19037r, 2, i2, i3);
            m10488d(arrayList, this.f19030k, this.f19031l, 1, i2, i3);
            AnimatorSetCompat.m9740a(animatorSet, arrayList);
            final TextView m10489e3 = m10489e(i2);
            final TextView m10489e4 = m10489e(i3);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TextView textView;
                    IndicatorViewController indicatorViewController = IndicatorViewController.this;
                    indicatorViewController.f19027h = i3;
                    indicatorViewController.f19025f = null;
                    TextView textView2 = m10489e3;
                    if (textView2 != null) {
                        textView2.setVisibility(4);
                        if (i2 == 1 && (textView = IndicatorViewController.this.f19031l) != null) {
                            textView.setText((CharSequence) null);
                        }
                    }
                    TextView textView3 = m10489e4;
                    if (textView3 != null) {
                        textView3.setTranslationY(0.0f);
                        m10489e4.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = m10489e4;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
            });
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (m10489e2 = m10489e(i3)) != null) {
                m10489e2.setVisibility(0);
                m10489e2.setAlpha(1.0f);
            }
            if (i2 != 0 && (m10489e = m10489e(i2)) != null) {
                m10489e.setVisibility(4);
                if (i2 == 1) {
                    m10489e.setText((CharSequence) null);
                }
            }
            this.f19027h = i3;
        }
        this.f19021b.m10524q();
        this.f19021b.m10527t(z, false);
        this.f19021b.m10530w();
    }
}
