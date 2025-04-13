package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.C1195R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: f */
    @NonNull
    public final LinkedHashSet<OnErrorChangedListener> f17751f;

    /* renamed from: g */
    @NonNull
    public final LinkedHashSet<OnCheckedStateChangedListener> f17752g;

    /* renamed from: h */
    @Nullable
    public ColorStateList f17753h;

    /* renamed from: i */
    public boolean f17754i;

    /* renamed from: j */
    public boolean f17755j;

    /* renamed from: k */
    public boolean f17756k;

    /* renamed from: l */
    @Nullable
    public CharSequence f17757l;

    /* renamed from: m */
    @Nullable
    public Drawable f17758m;

    /* renamed from: n */
    @Nullable
    public Drawable f17759n;

    /* renamed from: o */
    public boolean f17760o;

    /* renamed from: p */
    @Nullable
    public ColorStateList f17761p;

    /* renamed from: q */
    @Nullable
    public ColorStateList f17762q;

    /* renamed from: r */
    @NonNull
    public PorterDuff.Mode f17763r;

    /* renamed from: s */
    public int f17764s;

    /* renamed from: t */
    public int[] f17765t;

    /* renamed from: u */
    public boolean f17766u;

    /* renamed from: v */
    @Nullable
    public CharSequence f17767v;

    /* renamed from: w */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f17768w;

    /* renamed from: x */
    @Nullable
    public final AnimatedVectorDrawableCompat f17769x;

    /* renamed from: y */
    public final Animatable2Compat.AnimationCallback f17770y;

    /* renamed from: z */
    public static final int[] f17750z = {C2507R.attr.state_indeterminate};

    /* renamed from: A */
    public static final int[] f17747A = {C2507R.attr.state_error};

    /* renamed from: B */
    public static final int[][] f17748B = {new int[]{R.attr.state_enabled, C2507R.attr.state_error}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: C */
    @SuppressLint
    public static final int f17749C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        /* renamed from: a */
        void m9897a(@NonNull MaterialCheckBox materialCheckBox, int i2);
    }

    public interface OnErrorChangedListener {
        /* renamed from: a */
        void m9898a(@NonNull MaterialCheckBox materialCheckBox, boolean z);
    }

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public int f17772b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("MaterialCheckBox.SavedState{");
            m24u.append(Integer.toHexString(System.identityHashCode(this)));
            m24u.append(" CheckedState=");
            int i2 = this.f17772b;
            return C0000a.m20q(m24u, i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Integer.valueOf(this.f17772b));
        }

        public SavedState(Parcel parcel, C12451 c12451) {
            super(parcel);
            this.f17772b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.checkboxStyle, C2507R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, C2507R.attr.checkboxStyle);
        this.f17751f = new LinkedHashSet<>();
        this.f17752g = new LinkedHashSet<>();
        this.f17769x = AnimatedVectorDrawableCompat.m4294a(getContext(), C2507R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f17770y = new Animatable2Compat.AnimationCallback() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            /* renamed from: a */
            public void mo4292a(Drawable drawable) {
                ColorStateList colorStateList = MaterialCheckBox.this.f17761p;
                if (colorStateList != null) {
                    DrawableCompat.m1842n(drawable, colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            /* renamed from: b */
            public void mo4293b(Drawable drawable) {
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.f17761p;
                if (colorStateList != null) {
                    DrawableCompat.m1841m(drawable, colorStateList.getColorForState(materialCheckBox.f17765t, colorStateList.getDefaultColor()));
                }
            }
        };
        Context context2 = getContext();
        this.f17758m = CompoundButtonCompat.m2575a(this);
        this.f17761p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray m10160e = ThemeEnforcement.m10160e(context2, attributeSet, C1195R.styleable.f17339x, C2507R.attr.checkboxStyle, C2507R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f17759n = m10160e.m958g(2);
        if (this.f17758m != null && MaterialAttributes.m10237b(context2, C2507R.attr.isMaterial3Theme, false)) {
            if (m10160e.m964m(0, 0) == f17749C && m10160e.m964m(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f17758m = AppCompatResources.m497b(context2, C2507R.drawable.mtrl_checkbox_button);
                this.f17760o = true;
                if (this.f17759n == null) {
                    this.f17759n = AppCompatResources.m497b(context2, C2507R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f17762q = MaterialResources.m10241b(context2, m10160e, 3);
        this.f17763r = ViewUtils.m10172i(m10160e.m961j(4, -1), PorterDuff.Mode.SRC_IN);
        this.f17754i = m10160e.m952a(10, false);
        this.f17755j = m10160e.m952a(6, true);
        this.f17756k = m10160e.m952a(9, false);
        this.f17757l = m10160e.m966o(8);
        if (m10160e.m967p(7)) {
            setCheckedState(m10160e.m961j(7, 0));
        }
        m10160e.f1582b.recycle();
        m9896b();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i2 = this.f17764s;
        return i2 == 1 ? getResources().getString(C2507R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(C2507R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C2507R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17753h == null) {
            int[][] iArr = f17748B;
            int[] iArr2 = new int[iArr.length];
            int m9971d = MaterialColors.m9971d(this, C2507R.attr.colorControlActivated);
            int m9971d2 = MaterialColors.m9971d(this, C2507R.attr.colorError);
            int m9971d3 = MaterialColors.m9971d(this, C2507R.attr.colorSurface);
            int m9971d4 = MaterialColors.m9971d(this, C2507R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.m9973f(m9971d3, m9971d2, 1.0f);
            iArr2[1] = MaterialColors.m9973f(m9971d3, m9971d, 1.0f);
            iArr2[2] = MaterialColors.m9973f(m9971d3, m9971d4, 0.54f);
            iArr2[3] = MaterialColors.m9973f(m9971d3, m9971d4, 0.38f);
            iArr2[4] = MaterialColors.m9973f(m9971d3, m9971d4, 0.38f);
            this.f17753h = new ColorStateList(iArr, iArr2);
        }
        return this.f17753h;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f17761p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: b */
    public final void m9896b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        Drawable drawable = this.f17758m;
        ColorStateList colorStateList3 = this.f17761p;
        PorterDuff.Mode m2577c = CompoundButtonCompat.m2577c(this);
        int i2 = Build.VERSION.SDK_INT;
        this.f17758m = DrawableUtils.m10043c(drawable, colorStateList3, m2577c, i2 < 23);
        this.f17759n = DrawableUtils.m10043c(this.f17759n, this.f17762q, this.f17763r, i2 < 23);
        if (this.f17760o) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f17769x;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.m4297d(this.f17770y);
                this.f17769x.m4296c(this.f17770y);
            }
            if (i2 >= 24) {
                Drawable drawable2 = this.f17758m;
                if ((drawable2 instanceof AnimatedStateListDrawable) && (animatedVectorDrawableCompat = this.f17769x) != null) {
                    ((AnimatedStateListDrawable) drawable2).addTransition(C2507R.id.checked, C2507R.id.unchecked, animatedVectorDrawableCompat, false);
                    ((AnimatedStateListDrawable) this.f17758m).addTransition(C2507R.id.indeterminate, C2507R.id.unchecked, this.f17769x, false);
                }
            }
        }
        Drawable drawable3 = this.f17758m;
        if (drawable3 != null && (colorStateList2 = this.f17761p) != null) {
            DrawableCompat.m1842n(drawable3, colorStateList2);
        }
        Drawable drawable4 = this.f17759n;
        if (drawable4 != null && (colorStateList = this.f17762q) != null) {
            DrawableCompat.m1842n(drawable4, colorStateList);
        }
        super.setButtonDrawable(DrawableUtils.m10041a(this.f17758m, this.f17759n));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f17758m;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f17759n;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f17762q;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f17763r;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f17761p;
    }

    public int getCheckedState() {
        return this.f17764s;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f17757l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f17764s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17754i && this.f17761p == null && this.f17762q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f17750z);
        }
        if (this.f17756k) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f17747A);
        }
        this.f17765t = DrawableUtils.m10044d(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable m2575a;
        if (!this.f17755j || !TextUtils.isEmpty(getText()) || (m2575a = CompoundButtonCompat.m2575a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m2575a.getIntrinsicWidth()) / 2) * (ViewUtils.m10171h(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m2575a.getBounds();
            DrawableCompat.m1839k(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f17756k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f17757l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f17772b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17772b = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i2) {
        setButtonDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f17759n = drawable;
        m9896b();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i2) {
        setButtonIconDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17762q == colorStateList) {
            return;
        }
        this.f17762q = colorStateList;
        m9896b();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f17763r == mode) {
            return;
        }
        this.f17763r = mode;
        m9896b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17761p == colorStateList) {
            return;
        }
        this.f17761p = colorStateList;
        m9896b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m9896b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f17755j = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f17764s != i2) {
            this.f17764s = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f17767v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f17766u) {
                return;
            }
            this.f17766u = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.f17752g;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m9897a(this, this.f17764s);
                }
            }
            if (this.f17764s != 2 && (onCheckedChangeListener = this.f17768w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f17766u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f17757l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f17756k == z) {
            return;
        }
        this.f17756k = z;
        refreshDrawableState();
        Iterator<OnErrorChangedListener> it = this.f17751f.iterator();
        while (it.hasNext()) {
            it.next().m9898a(this, this.f17756k);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17768w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f17767v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17754i = z;
        if (z) {
            CompoundButtonCompat.m2578d(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.m2578d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f17758m = drawable;
        this.f17760o = false;
        m9896b();
    }
}
