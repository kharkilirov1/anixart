package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.android.material.C1195R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: z0 */
    public static final int[][] f19073z0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    @Nullable
    public ColorStateList f19074A;

    /* renamed from: B */
    public boolean f19075B;

    /* renamed from: C */
    public CharSequence f19076C;

    /* renamed from: D */
    public boolean f19077D;

    /* renamed from: E */
    @Nullable
    public MaterialShapeDrawable f19078E;

    /* renamed from: F */
    public MaterialShapeDrawable f19079F;

    /* renamed from: G */
    public StateListDrawable f19080G;

    /* renamed from: H */
    public boolean f19081H;

    /* renamed from: I */
    @Nullable
    public MaterialShapeDrawable f19082I;

    /* renamed from: J */
    @Nullable
    public MaterialShapeDrawable f19083J;

    /* renamed from: K */
    @NonNull
    public ShapeAppearanceModel f19084K;

    /* renamed from: L */
    public boolean f19085L;

    /* renamed from: M */
    public final int f19086M;

    /* renamed from: N */
    public int f19087N;

    /* renamed from: O */
    public int f19088O;

    /* renamed from: P */
    public int f19089P;

    /* renamed from: Q */
    public int f19090Q;

    /* renamed from: R */
    public int f19091R;

    /* renamed from: S */
    @ColorInt
    public int f19092S;

    /* renamed from: T */
    @ColorInt
    public int f19093T;

    /* renamed from: U */
    public final Rect f19094U;

    /* renamed from: V */
    public final Rect f19095V;

    /* renamed from: W */
    public final RectF f19096W;

    /* renamed from: a0 */
    public Typeface f19097a0;

    /* renamed from: b */
    @NonNull
    public final FrameLayout f19098b;

    /* renamed from: b0 */
    @Nullable
    public Drawable f19099b0;

    /* renamed from: c */
    @NonNull
    public final StartCompoundLayout f19100c;

    /* renamed from: c0 */
    public int f19101c0;

    /* renamed from: d */
    @NonNull
    public final EndCompoundLayout f19102d;

    /* renamed from: d0 */
    public final LinkedHashSet<OnEditTextAttachedListener> f19103d0;

    /* renamed from: e */
    public EditText f19104e;

    /* renamed from: e0 */
    @Nullable
    public Drawable f19105e0;

    /* renamed from: f */
    public CharSequence f19106f;

    /* renamed from: f0 */
    public int f19107f0;

    /* renamed from: g */
    public int f19108g;

    /* renamed from: g0 */
    public Drawable f19109g0;

    /* renamed from: h */
    public int f19110h;

    /* renamed from: h0 */
    public ColorStateList f19111h0;

    /* renamed from: i */
    public int f19112i;

    /* renamed from: i0 */
    public ColorStateList f19113i0;

    /* renamed from: j */
    public int f19114j;

    /* renamed from: j0 */
    @ColorInt
    public int f19115j0;

    /* renamed from: k */
    public final IndicatorViewController f19116k;

    /* renamed from: k0 */
    @ColorInt
    public int f19117k0;

    /* renamed from: l */
    public boolean f19118l;

    /* renamed from: l0 */
    @ColorInt
    public int f19119l0;

    /* renamed from: m */
    public int f19120m;

    /* renamed from: m0 */
    public ColorStateList f19121m0;

    /* renamed from: n */
    public boolean f19122n;

    /* renamed from: n0 */
    @ColorInt
    public int f19123n0;

    /* renamed from: o */
    @NonNull
    public LengthCounter f19124o;

    /* renamed from: o0 */
    @ColorInt
    public int f19125o0;

    /* renamed from: p */
    @Nullable
    public TextView f19126p;

    /* renamed from: p0 */
    @ColorInt
    public int f19127p0;

    /* renamed from: q */
    public int f19128q;

    /* renamed from: q0 */
    @ColorInt
    public int f19129q0;

    /* renamed from: r */
    public int f19130r;

    /* renamed from: r0 */
    @ColorInt
    public int f19131r0;

    /* renamed from: s */
    public CharSequence f19132s;

    /* renamed from: s0 */
    public boolean f19133s0;

    /* renamed from: t */
    public boolean f19134t;

    /* renamed from: t0 */
    public final CollapsingTextHelper f19135t0;

    /* renamed from: u */
    public TextView f19136u;

    /* renamed from: u0 */
    public boolean f19137u0;

    /* renamed from: v */
    @Nullable
    public ColorStateList f19138v;

    /* renamed from: v0 */
    public boolean f19139v0;

    /* renamed from: w */
    public int f19140w;

    /* renamed from: w0 */
    public ValueAnimator f19141w0;

    /* renamed from: x */
    @Nullable
    public Fade f19142x;

    /* renamed from: x0 */
    public boolean f19143x0;

    /* renamed from: y */
    @Nullable
    public Fade f19144y;

    /* renamed from: y0 */
    public boolean f19145y0;

    /* renamed from: z */
    @Nullable
    public ColorStateList f19146z;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: d */
        public final TextInputLayout f19151d;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            super(AccessibilityDelegateCompat.f3569c);
            this.f19151d = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: d */
        public void mo2044d(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
            EditText editText = this.f19151d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f19151d.getHint();
            CharSequence error = this.f19151d.getError();
            CharSequence placeholderText = this.f19151d.getPlaceholderText();
            int counterMaxLength = this.f19151d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f19151d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f19151d.f19133s0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            StartCompoundLayout startCompoundLayout = this.f19151d.f19100c;
            if (startCompoundLayout.f19062c.getVisibility() == 0) {
                accessibilityNodeInfoCompat.f3743a.setLabelFor(startCompoundLayout.f19062c);
                accessibilityNodeInfoCompat.m2515u(startCompoundLayout.f19062c);
            } else {
                accessibilityNodeInfoCompat.m2515u(startCompoundLayout.f19064e);
            }
            if (z) {
                accessibilityNodeInfoCompat.f3743a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfoCompat.f3743a.setText(charSequence);
                if (z3 && placeholderText != null) {
                    accessibilityNodeInfoCompat.f3743a.setText(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.f3743a.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 26) {
                    accessibilityNodeInfoCompat.m2513s(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    accessibilityNodeInfoCompat.f3743a.setText(charSequence);
                }
                boolean z6 = true ^ z;
                if (i2 >= 26) {
                    accessibilityNodeInfoCompat.f3743a.setShowingHintText(z6);
                } else {
                    accessibilityNodeInfoCompat.m2510p(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.f3743a.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.f3743a.setError(error);
            }
            TextView textView = this.f19151d.f19116k.f19037r;
            if (textView != null) {
                accessibilityNodeInfoCompat.f3743a.setLabelFor(textView);
            }
            this.f19151d.f19102d.m10456c().mo10446n(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        /* renamed from: e */
        public void mo2045e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            this.f3570a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f19151d.f19102d.m10456c().mo10447o(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        /* renamed from: b */
        int mo7338b(@Nullable Editable editable);
    }

    public interface OnEditTextAttachedListener {
        /* renamed from: a */
        void mo10475a(@NonNull TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        /* renamed from: a */
        void m10531a(@NonNull TextInputLayout textInputLayout, int i2);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        @Nullable
        public CharSequence f19152d;

        /* renamed from: e */
        public boolean f19153e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("TextInputLayout.SavedState{");
            m24u.append(Integer.toHexString(System.identityHashCode(this)));
            m24u.append(" error=");
            m24u.append((Object) this.f19152d);
            m24u.append("}");
            return m24u.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            TextUtils.writeToParcel(this.f19152d, parcel, i2);
            parcel.writeInt(this.f19153e ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19152d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f19153e = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.textInputStyle, C2507R.style.Widget_Design_TextInputLayout), attributeSet, C2507R.attr.textInputStyle);
        this.f19108g = -1;
        this.f19110h = -1;
        this.f19112i = -1;
        this.f19114j = -1;
        this.f19116k = new IndicatorViewController(this);
        this.f19124o = C1136a.f14041h;
        this.f19094U = new Rect();
        this.f19095V = new Rect();
        this.f19096W = new RectF();
        this.f19103d0 = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.f19135t0 = collapsingTextHelper;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f19098b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.f17342a;
        collapsingTextHelper.f18247W = timeInterpolator;
        collapsingTextHelper.m10127l(false);
        collapsingTextHelper.f18246V = timeInterpolator;
        collapsingTextHelper.m10127l(false);
        collapsingTextHelper.m10130p(8388659);
        TintTypedArray m10160e = ThemeEnforcement.m10160e(context2, attributeSet, C1195R.styleable.f17313N, C2507R.attr.textInputStyle, C2507R.style.Widget_Design_TextInputLayout, 22, 20, 37, 42, 46);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, m10160e);
        this.f19100c = startCompoundLayout;
        this.f19075B = m10160e.m952a(45, true);
        setHint(m10160e.m966o(4));
        this.f19139v0 = m10160e.m952a(44, true);
        this.f19137u0 = m10160e.m952a(39, true);
        if (m10160e.m967p(6)) {
            setMinEms(m10160e.m961j(6, -1));
        } else if (m10160e.m967p(3)) {
            setMinWidth(m10160e.m957f(3, -1));
        }
        if (m10160e.m967p(5)) {
            setMaxEms(m10160e.m961j(5, -1));
        } else if (m10160e.m967p(2)) {
            setMaxWidth(m10160e.m957f(2, -1));
        }
        this.f19084K = ShapeAppearanceModel.m10313c(context2, attributeSet, C2507R.attr.textInputStyle, C2507R.style.Widget_Design_TextInputLayout).m10320a();
        this.f19086M = context2.getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f19088O = m10160e.m956e(9, 0);
        this.f19090Q = m10160e.m957f(16, context2.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f19091R = m10160e.m957f(17, context2.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f19089P = this.f19090Q;
        float m955d = m10160e.m955d(13, -1.0f);
        float m955d2 = m10160e.m955d(12, -1.0f);
        float m955d3 = m10160e.m955d(10, -1.0f);
        float m955d4 = m10160e.m955d(11, -1.0f);
        ShapeAppearanceModel shapeAppearanceModel = this.f19084K;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
        if (m955d >= 0.0f) {
            builder.m10324f(m955d);
        }
        if (m955d2 >= 0.0f) {
            builder.m10325g(m955d2);
        }
        if (m955d3 >= 0.0f) {
            builder.m10323e(m955d3);
        }
        if (m955d4 >= 0.0f) {
            builder.m10322d(m955d4);
        }
        this.f19084K = builder.m10320a();
        ColorStateList m10241b = MaterialResources.m10241b(context2, m10160e, 7);
        if (m10241b != null) {
            int defaultColor = m10241b.getDefaultColor();
            this.f19123n0 = defaultColor;
            this.f19093T = defaultColor;
            if (m10241b.isStateful()) {
                this.f19125o0 = m10241b.getColorForState(new int[]{-16842910}, -1);
                this.f19127p0 = m10241b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f19129q0 = m10241b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f19127p0 = this.f19123n0;
                ColorStateList m496a = AppCompatResources.m496a(context2, C2507R.color.mtrl_filled_background_color);
                this.f19125o0 = m496a.getColorForState(new int[]{-16842910}, -1);
                this.f19129q0 = m496a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f19093T = 0;
            this.f19123n0 = 0;
            this.f19125o0 = 0;
            this.f19127p0 = 0;
            this.f19129q0 = 0;
        }
        if (m10160e.m967p(1)) {
            ColorStateList m954c = m10160e.m954c(1);
            this.f19113i0 = m954c;
            this.f19111h0 = m954c;
        }
        ColorStateList m10241b2 = MaterialResources.m10241b(context2, m10160e, 14);
        this.f19119l0 = m10160e.m953b(14, 0);
        this.f19115j0 = ContextCompat.m1670c(context2, C2507R.color.mtrl_textinput_default_box_stroke_color);
        this.f19131r0 = ContextCompat.m1670c(context2, C2507R.color.mtrl_textinput_disabled_color);
        this.f19117k0 = ContextCompat.m1670c(context2, C2507R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m10241b2 != null) {
            setBoxStrokeColorStateList(m10241b2);
        }
        if (m10160e.m967p(15)) {
            setBoxStrokeErrorColor(MaterialResources.m10241b(context2, m10160e, 15));
        }
        if (m10160e.m964m(46, -1) != -1) {
            setHintTextAppearance(m10160e.m964m(46, 0));
        }
        int m964m = m10160e.m964m(37, 0);
        CharSequence m966o = m10160e.m966o(32);
        boolean m952a = m10160e.m952a(33, false);
        int m964m2 = m10160e.m964m(42, 0);
        boolean m952a2 = m10160e.m952a(41, false);
        CharSequence m966o2 = m10160e.m966o(40);
        int m964m3 = m10160e.m964m(54, 0);
        CharSequence m966o3 = m10160e.m966o(53);
        boolean m952a3 = m10160e.m952a(18, false);
        setCounterMaxLength(m10160e.m961j(19, -1));
        this.f19130r = m10160e.m964m(22, 0);
        this.f19128q = m10160e.m964m(20, 0);
        setBoxBackgroundMode(m10160e.m961j(8, 0));
        setErrorContentDescription(m966o);
        setCounterOverflowTextAppearance(this.f19128q);
        setHelperTextTextAppearance(m964m2);
        setErrorTextAppearance(m964m);
        setCounterTextAppearance(this.f19130r);
        setPlaceholderText(m966o3);
        setPlaceholderTextAppearance(m964m3);
        if (m10160e.m967p(38)) {
            setErrorTextColor(m10160e.m954c(38));
        }
        if (m10160e.m967p(43)) {
            setHelperTextColor(m10160e.m954c(43));
        }
        if (m10160e.m967p(47)) {
            setHintTextColor(m10160e.m954c(47));
        }
        if (m10160e.m967p(23)) {
            setCounterTextColor(m10160e.m954c(23));
        }
        if (m10160e.m967p(21)) {
            setCounterOverflowTextColor(m10160e.m954c(21));
        }
        if (m10160e.m967p(55)) {
            setPlaceholderTextColor(m10160e.m954c(55));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, m10160e);
        this.f19102d = endCompoundLayout;
        boolean m952a4 = m10160e.m952a(0, true);
        m10160e.f1582b.recycle();
        ViewCompat.m2216o0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.m2218p0(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(m952a4);
        setHelperTextEnabled(m952a2);
        setErrorEnabled(m952a);
        setCounterEnabled(m952a3);
        setHelperText(m966o2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f19104e;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.m10453a(editText)) {
            return this.f19078E;
        }
        int m9971d = MaterialColors.m9971d(this.f19104e, C2507R.attr.colorControlHighlight);
        int i2 = this.f19087N;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.f19078E;
            int i3 = this.f19093T;
            return new RippleDrawable(new ColorStateList(f19073z0, new int[]{MaterialColors.m9973f(m9971d, i3, 0.1f), i3}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.f19078E;
        int[][] iArr = f19073z0;
        int m9970c = MaterialColors.m9970c(context, C2507R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        int m9973f = MaterialColors.m9973f(m9971d, m9970c, 0.1f);
        materialShapeDrawable3.m10301x(new ColorStateList(iArr, new int[]{m9973f, 0}));
        materialShapeDrawable3.setTint(m9970c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m9973f, m9970c});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f19080G == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f19080G = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f19080G.addState(new int[0], m10513e(false));
        }
        return this.f19080G;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f19079F == null) {
            this.f19079F = m10513e(true);
        }
        return this.f19079F;
    }

    /* renamed from: k */
    public static void m10508k(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m10508k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f19104e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f19104e = editText;
        int i2 = this.f19108g;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f19112i);
        }
        int i3 = this.f19110h;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f19114j);
        }
        this.f19081H = false;
        m10517i();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        CollapsingTextHelper collapsingTextHelper = this.f19135t0;
        Typeface typeface = this.f19104e.getTypeface();
        boolean m10131q = collapsingTextHelper.m10131q(typeface);
        boolean m10135u = collapsingTextHelper.m10135u(typeface);
        if (m10131q || m10135u) {
            collapsingTextHelper.m10127l(false);
        }
        this.f19135t0.m10134t(this.f19104e.getTextSize());
        CollapsingTextHelper collapsingTextHelper2 = this.f19135t0;
        float letterSpacing = this.f19104e.getLetterSpacing();
        if (collapsingTextHelper2.f18264g0 != letterSpacing) {
            collapsingTextHelper2.f18264g0 = letterSpacing;
            collapsingTextHelper2.m10127l(false);
        }
        int gravity = this.f19104e.getGravity();
        this.f19135t0.m10130p((gravity & (-113)) | 48);
        this.f19135t0.m10133s(gravity);
        this.f19104e.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NonNull Editable editable) {
                TextInputLayout.this.m10527t(!r0.f19145y0, false);
                TextInputLayout textInputLayout = TextInputLayout.this;
                if (textInputLayout.f19118l) {
                    textInputLayout.m10521n(editable);
                }
                TextInputLayout textInputLayout2 = TextInputLayout.this;
                if (textInputLayout2.f19134t) {
                    textInputLayout2.m10528u(editable);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        if (this.f19111h0 == null) {
            this.f19111h0 = this.f19104e.getHintTextColors();
        }
        if (this.f19075B) {
            if (TextUtils.isEmpty(this.f19076C)) {
                CharSequence hint = this.f19104e.getHint();
                this.f19106f = hint;
                setHint(hint);
                this.f19104e.setHint((CharSequence) null);
            }
            this.f19077D = true;
        }
        if (this.f19126p != null) {
            m10521n(this.f19104e.getText());
        }
        m10524q();
        this.f19116k.m10486b();
        this.f19100c.bringToFront();
        this.f19102d.bringToFront();
        Iterator<OnEditTextAttachedListener> it = this.f19103d0.iterator();
        while (it.hasNext()) {
            it.next().mo10475a(this);
        }
        this.f19102d.m10473t();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m10527t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f19076C)) {
            return;
        }
        this.f19076C = charSequence;
        this.f19135t0.m10139y(charSequence);
        if (this.f19133s0) {
            return;
        }
        m10518j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f19134t == z) {
            return;
        }
        if (z) {
            TextView textView = this.f19136u;
            if (textView != null) {
                this.f19098b.addView(textView);
                this.f19136u.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f19136u;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f19136u = null;
        }
        this.f19134t = z;
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m10509a(float f2) {
        if (this.f19135t0.f18253b == f2) {
            return;
        }
        if (this.f19141w0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f19141w0 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17343b));
            this.f19141w0.setDuration(MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationMedium4, 167));
            this.f19141w0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TextInputLayout.this.f19135t0.m10136v(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.f19141w0.setFloatValues(this.f19135t0.f18253b, f2);
        this.f19141w0.start();
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i2, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f19098b.addView(view, layoutParams2);
        this.f19098b.setLayoutParams(layoutParams);
        m10526s();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10510b() {
        /*
            r6 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f19078E
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel r1 = r6.f19084K
            if (r0 == r1) goto L12
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f19078E
            r0.setShapeAppearanceModel(r1)
        L12:
            int r0 = r6.f19087N
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L29
            int r0 = r6.f19089P
            if (r0 <= r2) goto L24
            int r0 = r6.f19092S
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L36
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f19078E
            int r1 = r6.f19089P
            float r1 = (float) r1
            int r5 = r6.f19092S
            r0.m10273E(r1, r5)
        L36:
            int r0 = r6.f19093T
            int r1 = r6.f19087N
            if (r1 != r4) goto L4d
            r0 = 2130968862(0x7f04011e, float:1.754639E38)
            android.content.Context r1 = r6.getContext()
            int r0 = com.google.android.material.color.MaterialColors.m9969b(r1, r0, r3)
            int r1 = r6.f19093T
            int r0 = androidx.core.graphics.ColorUtils.m1773b(r1, r0)
        L4d:
            r6.f19093T = r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = r6.f19078E
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m10301x(r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f19082I
            if (r0 == 0) goto L92
            com.google.android.material.shape.MaterialShapeDrawable r1 = r6.f19083J
            if (r1 != 0) goto L61
            goto L92
        L61:
            int r1 = r6.f19089P
            if (r1 <= r2) goto L6a
            int r1 = r6.f19092S
            if (r1 == 0) goto L6a
            r3 = 1
        L6a:
            if (r3 == 0) goto L8f
            android.widget.EditText r1 = r6.f19104e
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L7b
            int r1 = r6.f19115j0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L81
        L7b:
            int r1 = r6.f19092S
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L81:
            r0.m10301x(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f19083J
            int r1 = r6.f19092S
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m10301x(r1)
        L8f:
            r6.invalidate()
        L92:
            r6.m10525r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10510b():void");
    }

    /* renamed from: c */
    public final int m10511c() {
        float m10123g;
        if (!this.f19075B) {
            return 0;
        }
        int i2 = this.f19087N;
        if (i2 == 0) {
            m10123g = this.f19135t0.m10123g();
        } else {
            if (i2 != 2) {
                return 0;
            }
            m10123g = this.f19135t0.m10123g() / 2.0f;
        }
        return (int) m10123g;
    }

    /* renamed from: d */
    public final boolean m10512d() {
        return this.f19075B && !TextUtils.isEmpty(this.f19076C) && (this.f19078E instanceof CutoutDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i2) {
        EditText editText = this.f19104e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f19106f != null) {
            boolean z = this.f19077D;
            this.f19077D = false;
            CharSequence hint = editText.getHint();
            this.f19104e.setHint(this.f19106f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f19104e.setHint(hint);
                this.f19077D = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f19098b.getChildCount());
        for (int i3 = 0; i3 < this.f19098b.getChildCount(); i3++) {
            View childAt = this.f19098b.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f19104e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f19145y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f19145y0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        if (this.f19075B) {
            this.f19135t0.m10122f(canvas);
        }
        if (this.f19083J == null || (materialShapeDrawable = this.f19082I) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f19104e.isFocused()) {
            Rect bounds = this.f19083J.getBounds();
            Rect bounds2 = this.f19082I.getBounds();
            float f2 = this.f19135t0.f18253b;
            int centerX = bounds2.centerX();
            bounds.left = AnimationUtils.m9739c(centerX, bounds2.left, f2);
            bounds.right = AnimationUtils.m9739c(centerX, bounds2.right, f2);
            this.f19083J.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f19143x0) {
            return;
        }
        this.f19143x0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.f19135t0;
        boolean m10138x = collapsingTextHelper != null ? collapsingTextHelper.m10138x(drawableState) | false : false;
        if (this.f19104e != null) {
            m10527t(ViewCompat.m2174N(this) && isEnabled(), false);
        }
        m10524q();
        m10530w();
        if (m10138x) {
            invalidate();
        }
        this.f19143x0 = false;
    }

    /* renamed from: e */
    public final MaterialShapeDrawable m10513e(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f19104e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.m10324f(f2);
        builder.m10325g(f2);
        builder.m10322d(dimensionPixelOffset);
        builder.m10323e(dimensionPixelOffset);
        ShapeAppearanceModel m10320a = builder.m10320a();
        MaterialShapeDrawable m10268f = MaterialShapeDrawable.m10268f(getContext(), popupElevation);
        m10268f.setShapeAppearanceModel(m10320a);
        m10268f.m10303z(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m10268f;
    }

    /* renamed from: f */
    public final int m10514f(int i2, boolean z) {
        int compoundPaddingLeft = this.f19104e.getCompoundPaddingLeft() + i2;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: g */
    public final int m10515g(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.f19104e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f19104e;
        if (editText == null) {
            return super.getBaseline();
        }
        return m10511c() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i2 = this.f19087N;
        if (i2 == 1 || i2 == 2) {
            return this.f19078E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f19093T;
    }

    public int getBoxBackgroundMode() {
        return this.f19087N;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f19088O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return ViewUtils.m10171h(this) ? this.f19084K.f18691h.mo10265a(this.f19096W) : this.f19084K.f18690g.mo10265a(this.f19096W);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ViewUtils.m10171h(this) ? this.f19084K.f18690g.mo10265a(this.f19096W) : this.f19084K.f18691h.mo10265a(this.f19096W);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ViewUtils.m10171h(this) ? this.f19084K.f18688e.mo10265a(this.f19096W) : this.f19084K.f18689f.mo10265a(this.f19096W);
    }

    public float getBoxCornerRadiusTopStart() {
        return ViewUtils.m10171h(this) ? this.f19084K.f18689f.mo10265a(this.f19096W) : this.f19084K.f18688e.mo10265a(this.f19096W);
    }

    public int getBoxStrokeColor() {
        return this.f19119l0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f19121m0;
    }

    public int getBoxStrokeWidth() {
        return this.f19090Q;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f19091R;
    }

    public int getCounterMaxLength() {
        return this.f19120m;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f19118l && this.f19122n && (textView = this.f19126p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f19146z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f19146z;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f19111h0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f19104e;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f19102d.f18992h.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f19102d.m10457d();
    }

    public int getEndIconMinSize() {
        return this.f19102d.f18998n;
    }

    public int getEndIconMode() {
        return this.f19102d.f18994j;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f19102d.f18999o;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f19102d.f18992h;
    }

    @Nullable
    public CharSequence getError() {
        IndicatorViewController indicatorViewController = this.f19116k;
        if (indicatorViewController.f19030k) {
            return indicatorViewController.f19029j;
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f19116k.f19032m;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        TextView textView = this.f19116k.f19031l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f19102d.f18988d.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        IndicatorViewController indicatorViewController = this.f19116k;
        if (indicatorViewController.f19036q) {
            return indicatorViewController.f19035p;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f19116k.f19037r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f19075B) {
            return this.f19076C;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f19135t0.m10123g();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f19135t0.m10124h();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f19113i0;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.f19124o;
    }

    public int getMaxEms() {
        return this.f19110h;
    }

    @Px
    public int getMaxWidth() {
        return this.f19114j;
    }

    public int getMinEms() {
        return this.f19108g;
    }

    @Px
    public int getMinWidth() {
        return this.f19112i;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f19102d.f18992h.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f19102d.f18992h.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f19134t) {
            return this.f19132s;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f19140w;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f19138v;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f19100c.f19063d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f19100c.f19062c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f19100c.f19062c;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f19084K;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f19100c.f19064e.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f19100c.f19064e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f19100c.f19067h;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f19100c.f19068i;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f19102d.f19001q;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f19102d.f19002r.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f19102d.f19002r;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f19097a0;
    }

    /* renamed from: h */
    public final void m10516h() {
        TextView textView = this.f19136u;
        if (textView == null || !this.f19134t) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.m4256a(this.f19098b, this.f19144y);
        this.f19136u.setVisibility(4);
    }

    /* renamed from: i */
    public final void m10517i() {
        int i2 = this.f19087N;
        if (i2 == 0) {
            this.f19078E = null;
            this.f19082I = null;
            this.f19083J = null;
        } else if (i2 == 1) {
            this.f19078E = new MaterialShapeDrawable(this.f19084K);
            this.f19082I = new MaterialShapeDrawable();
            this.f19083J = new MaterialShapeDrawable();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(C0000a.m18o(new StringBuilder(), this.f19087N, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f19075B || (this.f19078E instanceof CutoutDrawable)) {
                this.f19078E = new MaterialShapeDrawable(this.f19084K);
            } else {
                this.f19078E = new CutoutDrawable(this.f19084K);
            }
            this.f19082I = null;
            this.f19083J = null;
        }
        m10525r();
        m10530w();
        if (this.f19087N == 1) {
            if (MaterialResources.m10246g(getContext())) {
                this.f19088O = getResources().getDimensionPixelSize(C2507R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.m10245f(getContext())) {
                this.f19088O = getResources().getDimensionPixelSize(C2507R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f19104e != null && this.f19087N == 1) {
            if (MaterialResources.m10246g(getContext())) {
                EditText editText = this.f19104e;
                ViewCompat.m2226t0(editText, ViewCompat.m2159B(editText), getResources().getDimensionPixelSize(C2507R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.m2157A(this.f19104e), getResources().getDimensionPixelSize(C2507R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.m10245f(getContext())) {
                EditText editText2 = this.f19104e;
                ViewCompat.m2226t0(editText2, ViewCompat.m2159B(editText2), getResources().getDimensionPixelSize(C2507R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.m2157A(this.f19104e), getResources().getDimensionPixelSize(C2507R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f19087N != 0) {
            m10526s();
        }
        EditText editText3 = this.f19104e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f19087N;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m10518j() {
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        if (m10512d()) {
            RectF rectF = this.f19096W;
            CollapsingTextHelper collapsingTextHelper = this.f19135t0;
            int width = this.f19104e.getWidth();
            int gravity = this.f19104e.getGravity();
            boolean m10118b = collapsingTextHelper.m10118b(collapsingTextHelper.f18231G);
            collapsingTextHelper.f18233I = m10118b;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (m10118b) {
                        i3 = collapsingTextHelper.f18265h.left;
                        f4 = i3;
                    } else {
                        f2 = collapsingTextHelper.f18265h.right;
                        f3 = collapsingTextHelper.f18270j0;
                    }
                } else if (m10118b) {
                    f2 = collapsingTextHelper.f18265h.right;
                    f3 = collapsingTextHelper.f18270j0;
                } else {
                    i3 = collapsingTextHelper.f18265h.left;
                    f4 = i3;
                }
                float max = Math.max(f4, collapsingTextHelper.f18265h.left);
                rectF.left = max;
                Rect rect = collapsingTextHelper.f18265h;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (collapsingTextHelper.f18270j0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (collapsingTextHelper.f18233I) {
                        f5 = collapsingTextHelper.f18270j0 + max;
                    } else {
                        i2 = rect.right;
                        f5 = i2;
                    }
                } else if (collapsingTextHelper.f18233I) {
                    i2 = rect.right;
                    f5 = i2;
                } else {
                    f5 = collapsingTextHelper.f18270j0 + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = collapsingTextHelper.m10123g() + collapsingTextHelper.f18265h.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f19086M;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f19089P);
                CutoutDrawable cutoutDrawable = (CutoutDrawable) this.f19078E;
                Objects.requireNonNull(cutoutDrawable);
                cutoutDrawable.m10441L(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = collapsingTextHelper.f18270j0 / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, collapsingTextHelper.f18265h.left);
            rectF.left = max2;
            Rect rect2 = collapsingTextHelper.f18265h;
            rectF.top = rect2.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (collapsingTextHelper.f18270j0 / 2.0f);
            rectF.right = Math.min(f5, rect2.right);
            rectF.bottom = collapsingTextHelper.m10123g() + collapsingTextHelper.f18265h.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10519l(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.StyleRes int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.TextViewCompat.m2649k(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L32
            r4 = 2132017657(0x7f1401f9, float:1.9673599E38)
            androidx.core.widget.TextViewCompat.m2649k(r3, r4)
            android.content.Context r4 = r2.getContext()
            r0 = 2131099770(0x7f06007a, float:1.7811903E38)
            int r4 = androidx.core.content.ContextCompat.m1670c(r4, r0)
            r3.setTextColor(r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10519l(android.widget.TextView, int):void");
    }

    /* renamed from: m */
    public boolean m10520m() {
        IndicatorViewController indicatorViewController = this.f19116k;
        return (indicatorViewController.f19028i != 1 || indicatorViewController.f19031l == null || TextUtils.isEmpty(indicatorViewController.f19029j)) ? false : true;
    }

    /* renamed from: n */
    public void m10521n(@Nullable Editable editable) {
        int mo7338b = this.f19124o.mo7338b(editable);
        boolean z = this.f19122n;
        int i2 = this.f19120m;
        if (i2 == -1) {
            this.f19126p.setText(String.valueOf(mo7338b));
            this.f19126p.setContentDescription(null);
            this.f19122n = false;
        } else {
            this.f19122n = mo7338b > i2;
            Context context = getContext();
            this.f19126p.setContentDescription(context.getString(this.f19122n ? C2507R.string.character_counter_overflowed_content_description : C2507R.string.character_counter_content_description, Integer.valueOf(mo7338b), Integer.valueOf(this.f19120m)));
            if (z != this.f19122n) {
                m10522o();
            }
            BidiFormatter m2004c = BidiFormatter.m2004c();
            TextView textView = this.f19126p;
            String string = getContext().getString(C2507R.string.character_counter_pattern, Integer.valueOf(mo7338b), Integer.valueOf(this.f19120m));
            textView.setText(string != null ? m2004c.m2005d(string, m2004c.f3518c, true).toString() : null);
        }
        if (this.f19104e == null || z == this.f19122n) {
            return;
        }
        m10527t(false, false);
        m10530w();
        m10524q();
    }

    /* renamed from: o */
    public final void m10522o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f19126p;
        if (textView != null) {
            m10519l(textView, this.f19122n ? this.f19128q : this.f19130r);
            if (!this.f19122n && (colorStateList2 = this.f19146z) != null) {
                this.f19126p.setTextColor(colorStateList2);
            }
            if (!this.f19122n || (colorStateList = this.f19074A) == null) {
                return;
            }
            this.f19126p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f19135t0.m10126k(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f19104e;
        if (editText != null) {
            Rect rect = this.f19094U;
            DescendantOffsetUtils.m10143a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f19082I;
            if (materialShapeDrawable != null) {
                int i6 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i6 - this.f19090Q, rect.right, i6);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f19083J;
            if (materialShapeDrawable2 != null) {
                int i7 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i7 - this.f19091R, rect.right, i7);
            }
            if (this.f19075B) {
                this.f19135t0.m10134t(this.f19104e.getTextSize());
                int gravity = this.f19104e.getGravity();
                this.f19135t0.m10130p((gravity & (-113)) | 48);
                this.f19135t0.m10133s(gravity);
                CollapsingTextHelper collapsingTextHelper = this.f19135t0;
                if (this.f19104e == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f19095V;
                boolean m10171h = ViewUtils.m10171h(this);
                rect2.bottom = rect.bottom;
                int i8 = this.f19087N;
                if (i8 == 1) {
                    rect2.left = m10514f(rect.left, m10171h);
                    rect2.top = rect.top + this.f19088O;
                    rect2.right = m10515g(rect.right, m10171h);
                } else if (i8 != 2) {
                    rect2.left = m10514f(rect.left, m10171h);
                    rect2.top = getPaddingTop();
                    rect2.right = m10515g(rect.right, m10171h);
                } else {
                    rect2.left = this.f19104e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m10511c();
                    rect2.right = rect.right - this.f19104e.getPaddingRight();
                }
                Objects.requireNonNull(collapsingTextHelper);
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                if (!CollapsingTextHelper.m10117m(collapsingTextHelper.f18265h, i9, i10, i11, i12)) {
                    collapsingTextHelper.f18265h.set(i9, i10, i11, i12);
                    collapsingTextHelper.f18243S = true;
                }
                CollapsingTextHelper collapsingTextHelper2 = this.f19135t0;
                if (this.f19104e == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f19095V;
                TextPaint textPaint = collapsingTextHelper2.f18245U;
                textPaint.setTextSize(collapsingTextHelper2.f18273l);
                textPaint.setTypeface(collapsingTextHelper2.f18294z);
                textPaint.setLetterSpacing(collapsingTextHelper2.f18264g0);
                float f2 = -collapsingTextHelper2.f18245U.ascent();
                rect3.left = this.f19104e.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.f19087N == 1 && this.f19104e.getMinLines() <= 1 ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f19104e.getCompoundPaddingTop();
                rect3.right = rect.right - this.f19104e.getCompoundPaddingRight();
                rect3.bottom = this.f19087N == 1 && this.f19104e.getMinLines() <= 1 ? (int) (rect3.top + f2) : rect.bottom - this.f19104e.getCompoundPaddingBottom();
                Objects.requireNonNull(collapsingTextHelper2);
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                int i16 = rect3.bottom;
                if (!CollapsingTextHelper.m10117m(collapsingTextHelper2.f18263g, i13, i14, i15, i16)) {
                    collapsingTextHelper2.f18263g.set(i13, i14, i15, i16);
                    collapsingTextHelper2.f18243S = true;
                }
                this.f19135t0.m10127l(false);
                if (!m10512d() || this.f19133s0) {
                    return;
                }
                m10518j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z = false;
        if (this.f19104e != null && this.f19104e.getMeasuredHeight() < (max = Math.max(this.f19102d.getMeasuredHeight(), this.f19100c.getMeasuredHeight()))) {
            this.f19104e.setMinimumHeight(max);
            z = true;
        }
        boolean m10523p = m10523p();
        if (z || m10523p) {
            this.f19104e.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.f19104e.requestLayout();
                }
            });
        }
        if (this.f19136u != null && (editText = this.f19104e) != null) {
            this.f19136u.setGravity(editText.getGravity());
            this.f19136u.setPadding(this.f19104e.getCompoundPaddingLeft(), this.f19104e.getCompoundPaddingTop(), this.f19104e.getCompoundPaddingRight(), this.f19104e.getCompoundPaddingBottom());
        }
        this.f19102d.m10473t();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        setError(savedState.f19152d);
        if (savedState.f19153e) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    EndCompoundLayout endCompoundLayout = TextInputLayout.this.f19102d;
                    endCompoundLayout.f18992h.performClick();
                    endCompoundLayout.f18992h.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.f19085L) {
            float mo10265a = this.f19084K.f18688e.mo10265a(this.f19096W);
            float mo10265a2 = this.f19084K.f18689f.mo10265a(this.f19096W);
            float mo10265a3 = this.f19084K.f18691h.mo10265a(this.f19096W);
            float mo10265a4 = this.f19084K.f18690g.mo10265a(this.f19096W);
            ShapeAppearanceModel shapeAppearanceModel = this.f19084K;
            CornerTreatment cornerTreatment = shapeAppearanceModel.f18684a;
            CornerTreatment cornerTreatment2 = shapeAppearanceModel.f18685b;
            CornerTreatment cornerTreatment3 = shapeAppearanceModel.f18687d;
            CornerTreatment cornerTreatment4 = shapeAppearanceModel.f18686c;
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.f18696a = cornerTreatment2;
            ShapeAppearanceModel.Builder.m10319b(cornerTreatment2);
            builder.f18697b = cornerTreatment;
            ShapeAppearanceModel.Builder.m10319b(cornerTreatment);
            builder.f18699d = cornerTreatment4;
            ShapeAppearanceModel.Builder.m10319b(cornerTreatment4);
            builder.f18698c = cornerTreatment3;
            ShapeAppearanceModel.Builder.m10319b(cornerTreatment3);
            builder.m10324f(mo10265a2);
            builder.m10325g(mo10265a);
            builder.m10322d(mo10265a4);
            builder.m10323e(mo10265a3);
            ShapeAppearanceModel m10320a = builder.m10320a();
            this.f19085L = z;
            setShapeAppearanceModel(m10320a);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m10520m()) {
            savedState.f19152d = getError();
        }
        EndCompoundLayout endCompoundLayout = this.f19102d;
        savedState.f19153e = endCompoundLayout.m10458e() && endCompoundLayout.f18992h.isChecked();
        return savedState;
    }

    /* renamed from: p */
    public boolean m10523p() {
        boolean z;
        if (this.f19104e == null) {
            return false;
        }
        boolean z2 = true;
        CheckableImageButton checkableImageButton = null;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f19100c.getMeasuredWidth() > 0) {
            int measuredWidth = this.f19100c.getMeasuredWidth() - this.f19104e.getPaddingLeft();
            if (this.f19099b0 == null || this.f19101c0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f19099b0 = colorDrawable;
                this.f19101c0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m2639a = TextViewCompat.m2639a(this.f19104e);
            Drawable drawable = m2639a[0];
            Drawable drawable2 = this.f19099b0;
            if (drawable != drawable2) {
                TextViewCompat.m2644f(this.f19104e, drawable2, m2639a[1], m2639a[2], m2639a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f19099b0 != null) {
                Drawable[] m2639a2 = TextViewCompat.m2639a(this.f19104e);
                TextViewCompat.m2644f(this.f19104e, null, m2639a2[1], m2639a2[2], m2639a2[3]);
                this.f19099b0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.f19102d.m10460g() || ((this.f19102d.m10458e() && this.f19102d.m10459f()) || this.f19102d.f19001q != null)) && this.f19102d.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f19102d.f19002r.getMeasuredWidth() - this.f19104e.getPaddingRight();
            EndCompoundLayout endCompoundLayout = this.f19102d;
            if (endCompoundLayout.m10460g()) {
                checkableImageButton = endCompoundLayout.f18988d;
            } else if (endCompoundLayout.m10458e() && endCompoundLayout.m10459f()) {
                checkableImageButton = endCompoundLayout.f18992h;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = MarginLayoutParamsCompat.m2091b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] m2639a3 = TextViewCompat.m2639a(this.f19104e);
            Drawable drawable3 = this.f19105e0;
            if (drawable3 == null || this.f19107f0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f19105e0 = colorDrawable2;
                    this.f19107f0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m2639a3[2];
                Drawable drawable5 = this.f19105e0;
                if (drawable4 != drawable5) {
                    this.f19109g0 = m2639a3[2];
                    TextViewCompat.m2644f(this.f19104e, m2639a3[0], m2639a3[1], drawable5, m2639a3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f19107f0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.m2644f(this.f19104e, m2639a3[0], m2639a3[1], this.f19105e0, m2639a3[3]);
            }
        } else {
            if (this.f19105e0 == null) {
                return z;
            }
            Drawable[] m2639a4 = TextViewCompat.m2639a(this.f19104e);
            if (m2639a4[2] == this.f19105e0) {
                TextViewCompat.m2644f(this.f19104e, m2639a4[0], m2639a4[1], this.f19109g0, m2639a4[3]);
            } else {
                z2 = z;
            }
            this.f19105e0 = null;
        }
        return z2;
    }

    /* renamed from: q */
    public void m10524q() {
        Drawable background;
        TextView textView;
        EditText editText = this.f19104e;
        if (editText == null || this.f19087N != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = DrawableUtils.f1295a;
        Drawable mutate = background.mutate();
        if (m10520m()) {
            mutate.setColorFilter(AppCompatDrawableManager.m727c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f19122n && (textView = this.f19126p) != null) {
            mutate.setColorFilter(AppCompatDrawableManager.m727c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.m1831c(mutate);
            this.f19104e.refreshDrawableState();
        }
    }

    /* renamed from: r */
    public void m10525r() {
        EditText editText = this.f19104e;
        if (editText == null || this.f19078E == null) {
            return;
        }
        if ((this.f19081H || editText.getBackground() == null) && this.f19087N != 0) {
            ViewCompat.m2204i0(this.f19104e, getEditTextBoxBackground());
            this.f19081H = true;
        }
    }

    /* renamed from: s */
    public final void m10526s() {
        if (this.f19087N != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f19098b.getLayoutParams();
            int m10511c = m10511c();
            if (m10511c != layoutParams.topMargin) {
                layoutParams.topMargin = m10511c;
                this.f19098b.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i2) {
        if (this.f19093T != i2) {
            this.f19093T = i2;
            this.f19123n0 = i2;
            this.f19127p0 = i2;
            this.f19129q0 = i2;
            m10510b();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i2) {
        setBoxBackgroundColor(ContextCompat.m1670c(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f19123n0 = defaultColor;
        this.f19093T = defaultColor;
        this.f19125o0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f19127p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f19129q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m10510b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f19087N) {
            return;
        }
        this.f19087N = i2;
        if (this.f19104e != null) {
            m10517i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f19088O = i2;
    }

    public void setBoxCornerFamily(int i2) {
        ShapeAppearanceModel shapeAppearanceModel = this.f19084K;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
        CornerSize cornerSize = this.f19084K.f18688e;
        CornerTreatment m10307a = MaterialShapeUtils.m10307a(i2);
        builder.f18696a = m10307a;
        ShapeAppearanceModel.Builder.m10319b(m10307a);
        builder.f18700e = cornerSize;
        CornerSize cornerSize2 = this.f19084K.f18689f;
        CornerTreatment m10307a2 = MaterialShapeUtils.m10307a(i2);
        builder.f18697b = m10307a2;
        ShapeAppearanceModel.Builder.m10319b(m10307a2);
        builder.f18701f = cornerSize2;
        CornerSize cornerSize3 = this.f19084K.f18691h;
        CornerTreatment m10307a3 = MaterialShapeUtils.m10307a(i2);
        builder.f18699d = m10307a3;
        ShapeAppearanceModel.Builder.m10319b(m10307a3);
        builder.f18703h = cornerSize3;
        CornerSize cornerSize4 = this.f19084K.f18690g;
        CornerTreatment m10307a4 = MaterialShapeUtils.m10307a(i2);
        builder.f18698c = m10307a4;
        ShapeAppearanceModel.Builder.m10319b(m10307a4);
        builder.f18702g = cornerSize4;
        this.f19084K = builder.m10320a();
        m10510b();
    }

    public void setBoxStrokeColor(@ColorInt int i2) {
        if (this.f19119l0 != i2) {
            this.f19119l0 = i2;
            m10530w();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f19115j0 = colorStateList.getDefaultColor();
            this.f19131r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f19117k0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f19119l0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f19119l0 != colorStateList.getDefaultColor()) {
            this.f19119l0 = colorStateList.getDefaultColor();
        }
        m10530w();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f19121m0 != colorStateList) {
            this.f19121m0 = colorStateList;
            m10530w();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f19090Q = i2;
        m10530w();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f19091R = i2;
        m10530w();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f19118l != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f19126p = appCompatTextView;
                appCompatTextView.setId(C2507R.id.textinput_counter);
                Typeface typeface = this.f19097a0;
                if (typeface != null) {
                    this.f19126p.setTypeface(typeface);
                }
                this.f19126p.setMaxLines(1);
                this.f19116k.m10485a(this.f19126p, 2);
                MarginLayoutParamsCompat.m2093d((ViewGroup.MarginLayoutParams) this.f19126p.getLayoutParams(), getResources().getDimensionPixelOffset(C2507R.dimen.mtrl_textinput_counter_margin_start));
                m10522o();
                if (this.f19126p != null) {
                    EditText editText = this.f19104e;
                    m10521n(editText != null ? editText.getText() : null);
                }
            } else {
                this.f19116k.m10492h(this.f19126p, 2);
                this.f19126p = null;
            }
            this.f19118l = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f19120m != i2) {
            if (i2 > 0) {
                this.f19120m = i2;
            } else {
                this.f19120m = -1;
            }
            if (!this.f19118l || this.f19126p == null) {
                return;
            }
            EditText editText = this.f19104e;
            m10521n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f19128q != i2) {
            this.f19128q = i2;
            m10522o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f19074A != colorStateList) {
            this.f19074A = colorStateList;
            m10522o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f19130r != i2) {
            this.f19130r = i2;
            m10522o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f19146z != colorStateList) {
            this.f19146z = colorStateList;
            m10522o();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f19111h0 = colorStateList;
        this.f19113i0 = colorStateList;
        if (this.f19104e != null) {
            m10527t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m10508k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f19102d.f18992h.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f19102d.f18992h.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i2) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.m10463j(i2 != 0 ? endCompoundLayout.getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i2) {
        this.f19102d.m10464k(i2);
    }

    public void setEndIconMinSize(@IntRange int i2) {
        this.f19102d.m10465l(i2);
    }

    public void setEndIconMode(int i2) {
        this.f19102d.m10466m(i2);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        CheckableImageButton checkableImageButton = endCompoundLayout.f18992h;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.f19000p;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f19000p = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f18992h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18999o = scaleType;
        endCompoundLayout.f18992h.setScaleType(scaleType);
        endCompoundLayout.f18988d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        if (endCompoundLayout.f18996l != colorStateList) {
            endCompoundLayout.f18996l = colorStateList;
            IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, colorStateList, endCompoundLayout.f18997m);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        if (endCompoundLayout.f18997m != mode) {
            endCompoundLayout.f18997m = mode;
            IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, endCompoundLayout.f18996l, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f19102d.m10467n(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f19116k.f19030k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f19116k.m10491g();
            return;
        }
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.m10487c();
        indicatorViewController.f19029j = charSequence;
        indicatorViewController.f19031l.setText(charSequence);
        int i2 = indicatorViewController.f19027h;
        if (i2 != 1) {
            indicatorViewController.f19028i = 1;
        }
        indicatorViewController.m10494j(i2, indicatorViewController.f19028i, indicatorViewController.m10493i(indicatorViewController.f19031l, charSequence));
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.f19032m = charSequence;
        TextView textView = indicatorViewController.f19031l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        IndicatorViewController indicatorViewController = this.f19116k;
        if (indicatorViewController.f19030k == z) {
            return;
        }
        indicatorViewController.m10487c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f19020a, null);
            indicatorViewController.f19031l = appCompatTextView;
            appCompatTextView.setId(C2507R.id.textinput_error);
            indicatorViewController.f19031l.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f19040u;
            if (typeface != null) {
                indicatorViewController.f19031l.setTypeface(typeface);
            }
            int i2 = indicatorViewController.f19033n;
            indicatorViewController.f19033n = i2;
            TextView textView = indicatorViewController.f19031l;
            if (textView != null) {
                indicatorViewController.f19021b.m10519l(textView, i2);
            }
            ColorStateList colorStateList = indicatorViewController.f19034o;
            indicatorViewController.f19034o = colorStateList;
            TextView textView2 = indicatorViewController.f19031l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.f19032m;
            indicatorViewController.f19032m = charSequence;
            TextView textView3 = indicatorViewController.f19031l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            indicatorViewController.f19031l.setVisibility(4);
            ViewCompat.m2200g0(indicatorViewController.f19031l, 1);
            indicatorViewController.m10485a(indicatorViewController.f19031l, 0);
        } else {
            indicatorViewController.m10491g();
            indicatorViewController.m10492h(indicatorViewController.f19031l, 0);
            indicatorViewController.f19031l = null;
            indicatorViewController.f19021b.m10524q();
            indicatorViewController.f19021b.m10530w();
        }
        indicatorViewController.f19030k = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i2) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.m10468o(i2 != 0 ? AppCompatResources.m497b(endCompoundLayout.getContext(), i2) : null);
        IconHelper.m10482d(endCompoundLayout.f18986b, endCompoundLayout.f18988d, endCompoundLayout.f18989e);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        CheckableImageButton checkableImageButton = endCompoundLayout.f18988d;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.f18991g;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18991g = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f18988d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        if (endCompoundLayout.f18989e != colorStateList) {
            endCompoundLayout.f18989e = colorStateList;
            IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18988d, colorStateList, endCompoundLayout.f18990f);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        if (endCompoundLayout.f18990f != mode) {
            endCompoundLayout.f18990f = mode;
            IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18988d, endCompoundLayout.f18989e, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i2) {
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.f19033n = i2;
        TextView textView = indicatorViewController.f19031l;
        if (textView != null) {
            indicatorViewController.f19021b.m10519l(textView, i2);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.f19034o = colorStateList;
        TextView textView = indicatorViewController.f19031l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f19137u0 != z) {
            this.f19137u0 = z;
            m10527t(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f19116k.f19036q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f19116k.f19036q) {
            setHelperTextEnabled(true);
        }
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.m10487c();
        indicatorViewController.f19035p = charSequence;
        indicatorViewController.f19037r.setText(charSequence);
        int i2 = indicatorViewController.f19027h;
        if (i2 != 2) {
            indicatorViewController.f19028i = 2;
        }
        indicatorViewController.m10494j(i2, indicatorViewController.f19028i, indicatorViewController.m10493i(indicatorViewController.f19037r, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.f19039t = colorStateList;
        TextView textView = indicatorViewController.f19037r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        final IndicatorViewController indicatorViewController = this.f19116k;
        if (indicatorViewController.f19036q == z) {
            return;
        }
        indicatorViewController.m10487c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f19020a, null);
            indicatorViewController.f19037r = appCompatTextView;
            appCompatTextView.setId(C2507R.id.textinput_helper_text);
            indicatorViewController.f19037r.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f19040u;
            if (typeface != null) {
                indicatorViewController.f19037r.setTypeface(typeface);
            }
            indicatorViewController.f19037r.setVisibility(4);
            ViewCompat.m2200g0(indicatorViewController.f19037r, 1);
            int i2 = indicatorViewController.f19038s;
            indicatorViewController.f19038s = i2;
            TextView textView = indicatorViewController.f19037r;
            if (textView != null) {
                TextViewCompat.m2649k(textView, i2);
            }
            ColorStateList colorStateList = indicatorViewController.f19039t;
            indicatorViewController.f19039t = colorStateList;
            TextView textView2 = indicatorViewController.f19037r;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            indicatorViewController.m10485a(indicatorViewController.f19037r, 1);
            indicatorViewController.f19037r.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.f19021b.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            indicatorViewController.m10487c();
            int i3 = indicatorViewController.f19027h;
            if (i3 == 2) {
                indicatorViewController.f19028i = 0;
            }
            indicatorViewController.m10494j(i3, indicatorViewController.f19028i, indicatorViewController.m10493i(indicatorViewController.f19037r, ""));
            indicatorViewController.m10492h(indicatorViewController.f19037r, 1);
            indicatorViewController.f19037r = null;
            indicatorViewController.f19021b.m10524q();
            indicatorViewController.f19021b.m10530w();
        }
        indicatorViewController.f19036q = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i2) {
        IndicatorViewController indicatorViewController = this.f19116k;
        indicatorViewController.f19038s = i2;
        TextView textView = indicatorViewController.f19037r;
        if (textView != null) {
            TextViewCompat.m2649k(textView, i2);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f19075B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.ViewHolder.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f19139v0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f19075B) {
            this.f19075B = z;
            if (z) {
                CharSequence hint = this.f19104e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f19076C)) {
                        setHint(hint);
                    }
                    this.f19104e.setHint((CharSequence) null);
                }
                this.f19077D = true;
            } else {
                this.f19077D = false;
                if (!TextUtils.isEmpty(this.f19076C) && TextUtils.isEmpty(this.f19104e.getHint())) {
                    this.f19104e.setHint(this.f19076C);
                }
                setHintInternal(null);
            }
            if (this.f19104e != null) {
                m10526s();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i2) {
        this.f19135t0.m10128n(i2);
        this.f19113i0 = this.f19135t0.f18279o;
        if (this.f19104e != null) {
            m10527t(false, false);
            m10526s();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f19113i0 != colorStateList) {
            if (this.f19111h0 == null) {
                CollapsingTextHelper collapsingTextHelper = this.f19135t0;
                if (collapsingTextHelper.f18279o != colorStateList) {
                    collapsingTextHelper.f18279o = colorStateList;
                    collapsingTextHelper.m10127l(false);
                }
            }
            this.f19113i0 = colorStateList;
            if (this.f19104e != null) {
                m10527t(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.f19124o = lengthCounter;
    }

    public void setMaxEms(int i2) {
        this.f19110h = i2;
        EditText editText = this.f19104e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(@Px int i2) {
        this.f19114j = i2;
        EditText editText = this.f19104e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(@DimenRes int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f19108g = i2;
        EditText editText = this.f19104e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(@Px int i2) {
        this.f19112i = i2;
        EditText editText = this.f19104e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(@DimenRes int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i2) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18992h.setContentDescription(i2 != 0 ? endCompoundLayout.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i2) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18992h.setImageDrawable(i2 != 0 ? AppCompatResources.m497b(endCompoundLayout.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        Objects.requireNonNull(endCompoundLayout);
        if (z && endCompoundLayout.f18994j != 1) {
            endCompoundLayout.m10466m(1);
        } else {
            if (z) {
                return;
            }
            endCompoundLayout.m10466m(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18996l = colorStateList;
        IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, colorStateList, endCompoundLayout.f18997m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18997m = mode;
        IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, endCompoundLayout.f18996l, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f19136u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f19136u = appCompatTextView;
            appCompatTextView.setId(C2507R.id.textinput_placeholder);
            ViewCompat.m2216o0(this.f19136u, 2);
            Fade fade = new Fade();
            fade.f6267d = 87L;
            TimeInterpolator timeInterpolator = AnimationUtils.f17342a;
            fade.f6268e = timeInterpolator;
            this.f19142x = fade;
            fade.f6266c = 67L;
            Fade fade2 = new Fade();
            fade2.f6267d = 87L;
            fade2.f6268e = timeInterpolator;
            this.f19144y = fade2;
            setPlaceholderTextAppearance(this.f19140w);
            setPlaceholderTextColor(this.f19138v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f19134t) {
                setPlaceholderTextEnabled(true);
            }
            this.f19132s = charSequence;
        }
        EditText editText = this.f19104e;
        m10528u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i2) {
        this.f19140w = i2;
        TextView textView = this.f19136u;
        if (textView != null) {
            TextViewCompat.m2649k(textView, i2);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f19138v != colorStateList) {
            this.f19138v = colorStateList;
            TextView textView = this.f19136u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f19100c.m10498a(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i2) {
        TextViewCompat.m2649k(this.f19100c.f19062c, i2);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f19100c.f19062c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.f19078E;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.f19084K = shapeAppearanceModel;
        m10510b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f19100c.f19064e.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i2) {
        setStartIconDrawable(i2 != 0 ? AppCompatResources.m497b(getContext(), i2) : null);
    }

    public void setStartIconMinSize(@IntRange int i2) {
        this.f19100c.m10501d(i2);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        CheckableImageButton checkableImageButton = startCompoundLayout.f19064e;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.f19069j;
        checkableImageButton.setOnClickListener(onClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        startCompoundLayout.f19069j = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.f19064e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        IconHelper.m10484f(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        startCompoundLayout.f19068i = scaleType;
        startCompoundLayout.f19064e.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        if (startCompoundLayout.f19065f != colorStateList) {
            startCompoundLayout.f19065f = colorStateList;
            IconHelper.m10479a(startCompoundLayout.f19061b, startCompoundLayout.f19064e, colorStateList, startCompoundLayout.f19066g);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        if (startCompoundLayout.f19066g != mode) {
            startCompoundLayout.f19066g = mode;
            IconHelper.m10479a(startCompoundLayout.f19061b, startCompoundLayout.f19064e, startCompoundLayout.f19065f, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f19100c.m10504g(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f19102d.m10470q(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i2) {
        TextViewCompat.m2649k(this.f19102d.f19002r, i2);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f19102d.f19002r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f19104e;
        if (editText != null) {
            ViewCompat.m2196e0(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f19097a0) {
            this.f19097a0 = typeface;
            CollapsingTextHelper collapsingTextHelper = this.f19135t0;
            boolean m10131q = collapsingTextHelper.m10131q(typeface);
            boolean m10135u = collapsingTextHelper.m10135u(typeface);
            if (m10131q || m10135u) {
                collapsingTextHelper.m10127l(false);
            }
            IndicatorViewController indicatorViewController = this.f19116k;
            if (typeface != indicatorViewController.f19040u) {
                indicatorViewController.f19040u = typeface;
                TextView textView = indicatorViewController.f19031l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = indicatorViewController.f19037r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f19126p;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m10527t(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f19104e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f19104e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f19111h0;
        if (colorStateList2 != null) {
            this.f19135t0.m10129o(colorStateList2);
            this.f19135t0.m10132r(this.f19111h0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f19111h0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f19131r0) : this.f19131r0;
            this.f19135t0.m10129o(ColorStateList.valueOf(colorForState));
            this.f19135t0.m10132r(ColorStateList.valueOf(colorForState));
        } else if (m10520m()) {
            CollapsingTextHelper collapsingTextHelper = this.f19135t0;
            TextView textView2 = this.f19116k.f19031l;
            collapsingTextHelper.m10129o(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f19122n && (textView = this.f19126p) != null) {
            this.f19135t0.m10129o(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f19113i0) != null) {
            this.f19135t0.m10129o(colorStateList);
        }
        if (z3 || !this.f19137u0 || (isEnabled() && z4)) {
            if (z2 || this.f19133s0) {
                ValueAnimator valueAnimator = this.f19141w0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f19141w0.cancel();
                }
                if (z && this.f19139v0) {
                    m10509a(1.0f);
                } else {
                    this.f19135t0.m10136v(1.0f);
                }
                this.f19133s0 = false;
                if (m10512d()) {
                    m10518j();
                }
                EditText editText3 = this.f19104e;
                m10528u(editText3 != null ? editText3.getText() : null);
                StartCompoundLayout startCompoundLayout = this.f19100c;
                startCompoundLayout.f19070k = false;
                startCompoundLayout.m10506i();
                EndCompoundLayout endCompoundLayout = this.f19102d;
                endCompoundLayout.f19003s = false;
                endCompoundLayout.m10474u();
                return;
            }
            return;
        }
        if (z2 || !this.f19133s0) {
            ValueAnimator valueAnimator2 = this.f19141w0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f19141w0.cancel();
            }
            if (z && this.f19139v0) {
                m10509a(0.0f);
            } else {
                this.f19135t0.m10136v(0.0f);
            }
            if (m10512d() && (!((CutoutDrawable) this.f19078E).f18972z.isEmpty()) && m10512d()) {
                ((CutoutDrawable) this.f19078E).m10441L(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f19133s0 = true;
            m10516h();
            StartCompoundLayout startCompoundLayout2 = this.f19100c;
            startCompoundLayout2.f19070k = true;
            startCompoundLayout2.m10506i();
            EndCompoundLayout endCompoundLayout2 = this.f19102d;
            endCompoundLayout2.f19003s = true;
            endCompoundLayout2.m10474u();
        }
    }

    /* renamed from: u */
    public final void m10528u(@Nullable Editable editable) {
        if (this.f19124o.mo7338b(editable) != 0 || this.f19133s0) {
            m10516h();
            return;
        }
        if (this.f19136u == null || !this.f19134t || TextUtils.isEmpty(this.f19132s)) {
            return;
        }
        this.f19136u.setText(this.f19132s);
        TransitionManager.m4256a(this.f19098b, this.f19142x);
        this.f19136u.setVisibility(0);
        this.f19136u.bringToFront();
        announceForAccessibility(this.f19132s);
    }

    /* renamed from: v */
    public final void m10529v(boolean z, boolean z2) {
        int defaultColor = this.f19121m0.getDefaultColor();
        int colorForState = this.f19121m0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f19121m0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f19092S = colorForState2;
        } else if (z2) {
            this.f19092S = colorForState;
        } else {
            this.f19092S = defaultColor;
        }
    }

    /* renamed from: w */
    public void m10530w() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f19078E == null || this.f19087N == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f19104e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f19104e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f19092S = this.f19131r0;
        } else if (m10520m()) {
            if (this.f19121m0 != null) {
                m10529v(z2, z);
            } else {
                this.f19092S = getErrorCurrentTextColors();
            }
        } else if (!this.f19122n || (textView = this.f19126p) == null) {
            if (z2) {
                this.f19092S = this.f19119l0;
            } else if (z) {
                this.f19092S = this.f19117k0;
            } else {
                this.f19092S = this.f19115j0;
            }
        } else if (this.f19121m0 != null) {
            m10529v(z2, z);
        } else {
            this.f19092S = textView.getCurrentTextColor();
        }
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.m10472s();
        IconHelper.m10482d(endCompoundLayout.f18986b, endCompoundLayout.f18988d, endCompoundLayout.f18989e);
        endCompoundLayout.m10461h();
        if (endCompoundLayout.m10456c() instanceof DropdownMenuEndIconDelegate) {
            if (!endCompoundLayout.f18986b.m10520m() || endCompoundLayout.m10457d() == null) {
                IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, endCompoundLayout.f18996l, endCompoundLayout.f18997m);
            } else {
                Drawable mutate = DrawableCompat.m1845q(endCompoundLayout.m10457d()).mutate();
                DrawableCompat.m1841m(mutate, endCompoundLayout.f18986b.getErrorCurrentTextColors());
                endCompoundLayout.f18992h.setImageDrawable(mutate);
            }
        }
        StartCompoundLayout startCompoundLayout = this.f19100c;
        IconHelper.m10482d(startCompoundLayout.f19061b, startCompoundLayout.f19064e, startCompoundLayout.f19065f);
        if (this.f19087N == 2) {
            int i2 = this.f19089P;
            if (z2 && isEnabled()) {
                this.f19089P = this.f19091R;
            } else {
                this.f19089P = this.f19090Q;
            }
            if (this.f19089P != i2 && m10512d() && !this.f19133s0) {
                if (m10512d()) {
                    ((CutoutDrawable) this.f19078E).m10441L(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m10518j();
            }
        }
        if (this.f19087N == 1) {
            if (!isEnabled()) {
                this.f19093T = this.f19125o0;
            } else if (z && !z2) {
                this.f19093T = this.f19129q0;
            } else if (z2) {
                this.f19093T = this.f19127p0;
            } else {
                this.f19093T = this.f19123n0;
            }
        }
        m10510b();
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        endCompoundLayout.f18992h.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.m10479a(endCompoundLayout.f18986b, endCompoundLayout.f18992h, endCompoundLayout.f18996l, endCompoundLayout.f18997m);
            endCompoundLayout.m10461h();
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        StartCompoundLayout startCompoundLayout = this.f19100c;
        if (startCompoundLayout.f19064e.getContentDescription() != charSequence) {
            startCompoundLayout.f19064e.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f19100c.m10500c(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        EndCompoundLayout endCompoundLayout = this.f19102d;
        if (endCompoundLayout.f18992h.getContentDescription() != charSequence) {
            endCompoundLayout.f18992h.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f19102d.m10468o(drawable);
    }

    public void setHint(@StringRes int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f19102d.f18992h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f19102d.f18992h.setImageDrawable(drawable);
    }
}
