package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
class EndCompoundLayout extends LinearLayout {

    /* renamed from: y */
    public static final /* synthetic */ int f18985y = 0;

    /* renamed from: b */
    public final TextInputLayout f18986b;

    /* renamed from: c */
    @NonNull
    public final FrameLayout f18987c;

    /* renamed from: d */
    @NonNull
    public final CheckableImageButton f18988d;

    /* renamed from: e */
    public ColorStateList f18989e;

    /* renamed from: f */
    public PorterDuff.Mode f18990f;

    /* renamed from: g */
    public View.OnLongClickListener f18991g;

    /* renamed from: h */
    @NonNull
    public final CheckableImageButton f18992h;

    /* renamed from: i */
    public final EndIconDelegates f18993i;

    /* renamed from: j */
    public int f18994j;

    /* renamed from: k */
    public final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> f18995k;

    /* renamed from: l */
    public ColorStateList f18996l;

    /* renamed from: m */
    public PorterDuff.Mode f18997m;

    /* renamed from: n */
    public int f18998n;

    /* renamed from: o */
    @NonNull
    public ImageView.ScaleType f18999o;

    /* renamed from: p */
    public View.OnLongClickListener f19000p;

    /* renamed from: q */
    @Nullable
    public CharSequence f19001q;

    /* renamed from: r */
    @NonNull
    public final TextView f19002r;

    /* renamed from: s */
    public boolean f19003s;

    /* renamed from: t */
    public EditText f19004t;

    /* renamed from: u */
    @Nullable
    public final AccessibilityManager f19005u;

    /* renamed from: v */
    @Nullable
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener f19006v;

    /* renamed from: w */
    public final TextWatcher f19007w;

    /* renamed from: x */
    public final TextInputLayout.OnEditTextAttachedListener f19008x;

    public static class EndIconDelegates {

        /* renamed from: a */
        public final SparseArray<EndIconDelegate> f19012a = new SparseArray<>();

        /* renamed from: b */
        public final EndCompoundLayout f19013b;

        /* renamed from: c */
        public final int f19014c;

        /* renamed from: d */
        public final int f19015d;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.f19013b = endCompoundLayout;
            this.f19014c = tintTypedArray.m964m(26, 0);
            this.f19015d = tintTypedArray.m964m(49, 0);
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f18994j = 0;
        this.f18995k = new LinkedHashSet<>();
        this.f19007w = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.m10456c().mo10428a(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                EndCompoundLayout.this.m10456c().mo10476b(charSequence, i2, i3, i4);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            /* renamed from: a */
            public void mo10475a(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.f19004t == textInputLayout2.getEditText()) {
                    return;
                }
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                EditText editText = endCompoundLayout.f19004t;
                if (editText != null) {
                    editText.removeTextChangedListener(endCompoundLayout.f19007w);
                    if (EndCompoundLayout.this.f19004t.getOnFocusChangeListener() == EndCompoundLayout.this.m10456c().mo10431e()) {
                        EndCompoundLayout.this.f19004t.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.f19004t = textInputLayout2.getEditText();
                EndCompoundLayout endCompoundLayout2 = EndCompoundLayout.this;
                EditText editText2 = endCompoundLayout2.f19004t;
                if (editText2 != null) {
                    editText2.addTextChangedListener(endCompoundLayout2.f19007w);
                }
                EndCompoundLayout.this.m10456c().mo10434m(EndCompoundLayout.this.f19004t);
                EndCompoundLayout endCompoundLayout3 = EndCompoundLayout.this;
                endCompoundLayout3.m10469p(endCompoundLayout3.m10456c());
            }
        };
        this.f19008x = onEditTextAttachedListener;
        this.f19005u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f18986b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18987c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m10455b = m10455b(this, from, C2507R.id.text_input_error_icon);
        this.f18988d = m10455b;
        CheckableImageButton m10455b2 = m10455b(frameLayout, from, C2507R.id.text_input_end_icon);
        this.f18992h = m10455b2;
        this.f18993i = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f19002r = appCompatTextView;
        if (tintTypedArray.m967p(35)) {
            this.f18989e = MaterialResources.m10241b(getContext(), tintTypedArray, 35);
        }
        if (tintTypedArray.m967p(36)) {
            this.f18990f = ViewUtils.m10172i(tintTypedArray.m961j(36, -1), null);
        }
        if (tintTypedArray.m967p(34)) {
            m10468o(tintTypedArray.m958g(34));
        }
        m10455b.setContentDescription(getResources().getText(C2507R.string.error_icon_content_description));
        ViewCompat.m2216o0(m10455b, 2);
        m10455b.setClickable(false);
        m10455b.setPressable(false);
        m10455b.setFocusable(false);
        if (!tintTypedArray.m967p(50)) {
            if (tintTypedArray.m967p(30)) {
                this.f18996l = MaterialResources.m10241b(getContext(), tintTypedArray, 30);
            }
            if (tintTypedArray.m967p(31)) {
                this.f18997m = ViewUtils.m10172i(tintTypedArray.m961j(31, -1), null);
            }
        }
        if (tintTypedArray.m967p(28)) {
            m10466m(tintTypedArray.m961j(28, 0));
            if (tintTypedArray.m967p(25)) {
                m10463j(tintTypedArray.m966o(25));
            }
            m10455b2.setCheckable(tintTypedArray.m952a(24, true));
        } else if (tintTypedArray.m967p(50)) {
            if (tintTypedArray.m967p(51)) {
                this.f18996l = MaterialResources.m10241b(getContext(), tintTypedArray, 51);
            }
            if (tintTypedArray.m967p(52)) {
                this.f18997m = ViewUtils.m10172i(tintTypedArray.m961j(52, -1), null);
            }
            m10466m(tintTypedArray.m952a(50, false) ? 1 : 0);
            m10463j(tintTypedArray.m966o(48));
        }
        m10465l(tintTypedArray.m957f(27, getResources().getDimensionPixelSize(C2507R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.m967p(29)) {
            ImageView.ScaleType m10480b = IconHelper.m10480b(tintTypedArray.m961j(29, -1));
            this.f18999o = m10480b;
            m10455b2.setScaleType(m10480b);
            m10455b.setScaleType(m10480b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(C2507R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.m2200g0(appCompatTextView, 1);
        TextViewCompat.m2649k(appCompatTextView, tintTypedArray.m964m(69, 0));
        if (tintTypedArray.m967p(70)) {
            appCompatTextView.setTextColor(tintTypedArray.m954c(70));
        }
        m10470q(tintTypedArray.m966o(68));
        frameLayout.addView(m10455b2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m10455b);
        textInputLayout.f19103d0.add(onEditTextAttachedListener);
        if (textInputLayout.f19104e != null) {
            onEditTextAttachedListener.mo10475a(textInputLayout);
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                int i2 = EndCompoundLayout.f18985y;
                endCompoundLayout.m10454a();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AccessibilityManager accessibilityManager;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = endCompoundLayout.f19006v;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = endCompoundLayout.f19005u) == null) {
                    return;
                }
                AccessibilityManagerCompat.m2492b(accessibilityManager, touchExplorationStateChangeListener);
            }
        });
    }

    /* renamed from: a */
    public final void m10454a() {
        if (this.f19006v == null || this.f19005u == null || !ViewCompat.m2173M(this)) {
            return;
        }
        AccessibilityManagerCompat.m2491a(this.f19005u, this.f19006v);
    }

    /* renamed from: b */
    public final CheckableImageButton m10455b(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C2507R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        IconHelper.m10483e(checkableImageButton);
        if (MaterialResources.m10245f(getContext())) {
            MarginLayoutParamsCompat.m2093d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: c */
    public EndIconDelegate m10456c() {
        EndIconDelegates endIconDelegates = this.f18993i;
        int i2 = this.f18994j;
        EndIconDelegate endIconDelegate = endIconDelegates.f19012a.get(i2);
        if (endIconDelegate == null) {
            if (i2 == -1) {
                endIconDelegate = new CustomEndIconDelegate(endIconDelegates.f19013b);
            } else if (i2 == 0) {
                endIconDelegate = new NoEndIconDelegate(endIconDelegates.f19013b);
            } else if (i2 == 1) {
                endIconDelegate = new PasswordToggleEndIconDelegate(endIconDelegates.f19013b, endIconDelegates.f19015d);
            } else if (i2 == 2) {
                endIconDelegate = new ClearTextEndIconDelegate(endIconDelegates.f19013b);
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(C0000a.m7d("Invalid end icon mode: ", i2));
                }
                endIconDelegate = new DropdownMenuEndIconDelegate(endIconDelegates.f19013b);
            }
            endIconDelegates.f19012a.append(i2, endIconDelegate);
        }
        return endIconDelegate;
    }

    @Nullable
    /* renamed from: d */
    public Drawable m10457d() {
        return this.f18992h.getDrawable();
    }

    /* renamed from: e */
    public boolean m10458e() {
        return this.f18994j != 0;
    }

    /* renamed from: f */
    public boolean m10459f() {
        return this.f18987c.getVisibility() == 0 && this.f18992h.getVisibility() == 0;
    }

    /* renamed from: g */
    public boolean m10460g() {
        return this.f18988d.getVisibility() == 0;
    }

    /* renamed from: h */
    public void m10461h() {
        IconHelper.m10482d(this.f18986b, this.f18992h, this.f18996l);
    }

    /* renamed from: i */
    public void m10462i(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        EndIconDelegate m10456c = m10456c();
        boolean z3 = true;
        if (!m10456c.mo10477k() || (isChecked = this.f18992h.isChecked()) == m10456c.mo10445l()) {
            z2 = false;
        } else {
            this.f18992h.setChecked(!isChecked);
            z2 = true;
        }
        if (!(m10456c instanceof DropdownMenuEndIconDelegate) || (isActivated = this.f18992h.isActivated()) == m10456c.mo10444j()) {
            z3 = z2;
        } else {
            this.f18992h.setActivated(!isActivated);
        }
        if (z || z3) {
            m10461h();
        }
    }

    /* renamed from: j */
    public void m10463j(@Nullable CharSequence charSequence) {
        if (this.f18992h.getContentDescription() != charSequence) {
            this.f18992h.setContentDescription(charSequence);
        }
    }

    /* renamed from: k */
    public void m10464k(@DrawableRes int i2) {
        Drawable m497b = i2 != 0 ? AppCompatResources.m497b(getContext(), i2) : null;
        this.f18992h.setImageDrawable(m497b);
        if (m497b != null) {
            IconHelper.m10479a(this.f18986b, this.f18992h, this.f18996l, this.f18997m);
            m10461h();
        }
    }

    /* renamed from: l */
    public void m10465l(@Px int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != this.f18998n) {
            this.f18998n = i2;
            CheckableImageButton checkableImageButton = this.f18992h;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = this.f18988d;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    /* renamed from: m */
    public void m10466m(int i2) {
        AccessibilityManager accessibilityManager;
        if (this.f18994j == i2) {
            return;
        }
        EndIconDelegate m10456c = m10456c();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f19006v;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.f19005u) != null) {
            AccessibilityManagerCompat.m2492b(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.f19006v = null;
        m10456c.mo10437s();
        int i3 = this.f18994j;
        this.f18994j = i2;
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.f18995k.iterator();
        while (it.hasNext()) {
            it.next().m10531a(this.f18986b, i3);
        }
        m10467n(i2 != 0);
        EndIconDelegate m10456c2 = m10456c();
        int i4 = this.f18993i.f19014c;
        if (i4 == 0) {
            i4 = m10456c2.mo10430d();
        }
        m10464k(i4);
        int mo10429c = m10456c2.mo10429c();
        m10463j(mo10429c != 0 ? getResources().getText(mo10429c) : null);
        this.f18992h.setCheckable(m10456c2.mo10477k());
        if (!m10456c2.mo10443i(this.f18986b.getBoxBackgroundMode())) {
            StringBuilder m24u = C0000a.m24u("The current box background mode ");
            m24u.append(this.f18986b.getBoxBackgroundMode());
            m24u.append(" is not supported by the end icon mode ");
            m24u.append(i2);
            throw new IllegalStateException(m24u.toString());
        }
        m10456c2.mo10436r();
        this.f19006v = m10456c2.mo10442h();
        m10454a();
        View.OnClickListener mo10432f = m10456c2.mo10432f();
        CheckableImageButton checkableImageButton = this.f18992h;
        View.OnLongClickListener onLongClickListener = this.f19000p;
        checkableImageButton.setOnClickListener(mo10432f);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
        EditText editText = this.f19004t;
        if (editText != null) {
            m10456c2.mo10434m(editText);
            m10469p(m10456c2);
        }
        IconHelper.m10479a(this.f18986b, this.f18992h, this.f18996l, this.f18997m);
        m10462i(true);
    }

    /* renamed from: n */
    public void m10467n(boolean z) {
        if (m10459f() != z) {
            this.f18992h.setVisibility(z ? 0 : 8);
            m10471r();
            m10473t();
            this.f18986b.m10523p();
        }
    }

    /* renamed from: o */
    public void m10468o(@Nullable Drawable drawable) {
        this.f18988d.setImageDrawable(drawable);
        m10472s();
        IconHelper.m10479a(this.f18986b, this.f18988d, this.f18989e, this.f18990f);
    }

    /* renamed from: p */
    public final void m10469p(EndIconDelegate endIconDelegate) {
        if (this.f19004t == null) {
            return;
        }
        if (endIconDelegate.mo10431e() != null) {
            this.f19004t.setOnFocusChangeListener(endIconDelegate.mo10431e());
        }
        if (endIconDelegate.mo10433g() != null) {
            this.f18992h.setOnFocusChangeListener(endIconDelegate.mo10433g());
        }
    }

    /* renamed from: q */
    public void m10470q(@Nullable CharSequence charSequence) {
        this.f19001q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f19002r.setText(charSequence);
        m10474u();
    }

    /* renamed from: r */
    public final void m10471r() {
        this.f18987c.setVisibility((this.f18992h.getVisibility() != 0 || m10460g()) ? 8 : 0);
        setVisibility(m10459f() || m10460g() || ((this.f19001q == null || this.f19003s) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10472s() {
        /*
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.f18988d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 0
            if (r0 == 0) goto L19
            com.google.android.material.textfield.TextInputLayout r0 = r3.f18986b
            com.google.android.material.textfield.IndicatorViewController r2 = r0.f19116k
            boolean r2 = r2.f19030k
            if (r2 == 0) goto L19
            boolean r0 = r0.m10520m()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            com.google.android.material.internal.CheckableImageButton r2 = r3.f18988d
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            r1 = 8
        L21:
            r2.setVisibility(r1)
            r3.m10471r()
            r3.m10473t()
            boolean r0 = r3.m10458e()
            if (r0 != 0) goto L35
            com.google.android.material.textfield.TextInputLayout r0 = r3.f18986b
            r0.m10523p()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.EndCompoundLayout.m10472s():void");
    }

    /* renamed from: t */
    public void m10473t() {
        if (this.f18986b.f19104e == null) {
            return;
        }
        ViewCompat.m2226t0(this.f19002r, getContext().getResources().getDimensionPixelSize(C2507R.dimen.material_input_text_to_prefix_suffix_padding), this.f18986b.f19104e.getPaddingTop(), (m10459f() || m10460g()) ? 0 : ViewCompat.m2157A(this.f18986b.f19104e), this.f18986b.f19104e.getPaddingBottom());
    }

    /* renamed from: u */
    public final void m10474u() {
        int visibility = this.f19002r.getVisibility();
        int i2 = (this.f19001q == null || this.f19003s) ? 8 : 0;
        if (visibility != i2) {
            m10456c().mo10435p(i2 == 0);
        }
        m10471r();
        this.f19002r.setVisibility(i2);
        this.f18986b.m10523p();
    }
}
