package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.swiftsoft.anixartd.C2507R;

@SuppressLint
/* loaded from: classes.dex */
class StartCompoundLayout extends LinearLayout {

    /* renamed from: b */
    public final TextInputLayout f19061b;

    /* renamed from: c */
    public final TextView f19062c;

    /* renamed from: d */
    @Nullable
    public CharSequence f19063d;

    /* renamed from: e */
    public final CheckableImageButton f19064e;

    /* renamed from: f */
    public ColorStateList f19065f;

    /* renamed from: g */
    public PorterDuff.Mode f19066g;

    /* renamed from: h */
    public int f19067h;

    /* renamed from: i */
    @NonNull
    public ImageView.ScaleType f19068i;

    /* renamed from: j */
    public View.OnLongClickListener f19069j;

    /* renamed from: k */
    public boolean f19070k;

    public StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f19061b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C2507R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f19064e = checkableImageButton;
        IconHelper.m10483e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f19062c = appCompatTextView;
        if (MaterialResources.m10245f(getContext())) {
            MarginLayoutParamsCompat.m2092c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        m10502e(null);
        m10503f(null);
        if (tintTypedArray.m967p(66)) {
            this.f19065f = MaterialResources.m10241b(getContext(), tintTypedArray, 66);
        }
        if (tintTypedArray.m967p(67)) {
            this.f19066g = ViewUtils.m10172i(tintTypedArray.m961j(67, -1), null);
        }
        if (tintTypedArray.m967p(63)) {
            m10500c(tintTypedArray.m958g(63));
            if (tintTypedArray.m967p(62)) {
                m10499b(tintTypedArray.m966o(62));
            }
            checkableImageButton.setCheckable(tintTypedArray.m952a(61, true));
        }
        m10501d(tintTypedArray.m957f(64, getResources().getDimensionPixelSize(C2507R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.m967p(65)) {
            ImageView.ScaleType m10480b = IconHelper.m10480b(tintTypedArray.m961j(65, -1));
            this.f19068i = m10480b;
            checkableImageButton.setScaleType(m10480b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(C2507R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.m2200g0(appCompatTextView, 1);
        TextViewCompat.m2649k(appCompatTextView, tintTypedArray.m964m(57, 0));
        if (tintTypedArray.m967p(58)) {
            appCompatTextView.setTextColor(tintTypedArray.m954c(58));
        }
        m10498a(tintTypedArray.m966o(56));
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: a */
    public void m10498a(@Nullable CharSequence charSequence) {
        this.f19063d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f19062c.setText(charSequence);
        m10506i();
    }

    /* renamed from: b */
    public void m10499b(@Nullable CharSequence charSequence) {
        if (this.f19064e.getContentDescription() != charSequence) {
            this.f19064e.setContentDescription(charSequence);
        }
    }

    /* renamed from: c */
    public void m10500c(@Nullable Drawable drawable) {
        this.f19064e.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.m10479a(this.f19061b, this.f19064e, this.f19065f, this.f19066g);
            m10504g(true);
            IconHelper.m10482d(this.f19061b, this.f19064e, this.f19065f);
        } else {
            m10504g(false);
            m10502e(null);
            m10503f(null);
            m10499b(null);
        }
    }

    /* renamed from: d */
    public void m10501d(@Px int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != this.f19067h) {
            this.f19067h = i2;
            CheckableImageButton checkableImageButton = this.f19064e;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    /* renamed from: e */
    public void m10502e(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f19064e;
        View.OnLongClickListener onLongClickListener = this.f19069j;
        checkableImageButton.setOnClickListener(null);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f */
    public void m10503f(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f19069j = null;
        CheckableImageButton checkableImageButton = this.f19064e;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.m10484f(checkableImageButton, null);
    }

    /* renamed from: g */
    public void m10504g(boolean z) {
        if ((this.f19064e.getVisibility() == 0) != z) {
            this.f19064e.setVisibility(z ? 0 : 8);
            m10505h();
            m10506i();
        }
    }

    /* renamed from: h */
    public void m10505h() {
        EditText editText = this.f19061b.f19104e;
        if (editText == null) {
            return;
        }
        ViewCompat.m2226t0(this.f19062c, this.f19064e.getVisibility() == 0 ? 0 : ViewCompat.m2159B(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C2507R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: i */
    public final void m10506i() {
        int i2 = (this.f19063d == null || this.f19070k) ? 8 : 0;
        setVisibility(this.f19064e.getVisibility() == 0 || i2 == 0 ? 0 : 8);
        this.f19062c.setVisibility(i2);
        this.f19061b.m10523p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        m10505h();
    }
}
