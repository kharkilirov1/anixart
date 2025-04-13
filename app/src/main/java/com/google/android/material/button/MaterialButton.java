package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {

    /* renamed from: r */
    public static final int[] f17684r = {R.attr.state_checkable};

    /* renamed from: s */
    public static final int[] f17685s = {R.attr.state_checked};

    /* renamed from: e */
    @NonNull
    public final MaterialButtonHelper f17686e;

    /* renamed from: f */
    @NonNull
    public final LinkedHashSet<OnCheckedChangeListener> f17687f;

    /* renamed from: g */
    @Nullable
    public OnPressedChangeListener f17688g;

    /* renamed from: h */
    @Nullable
    public PorterDuff.Mode f17689h;

    /* renamed from: i */
    @Nullable
    public ColorStateList f17690i;

    /* renamed from: j */
    @Nullable
    public Drawable f17691j;

    /* renamed from: k */
    @Px
    public int f17692k;

    /* renamed from: l */
    @Px
    public int f17693l;

    /* renamed from: m */
    @Px
    public int f17694m;

    /* renamed from: n */
    @Px
    public int f17695n;

    /* renamed from: o */
    public boolean f17696o;

    /* renamed from: p */
    public boolean f17697p;

    /* renamed from: q */
    public int f17698q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void m9879a(MaterialButton materialButton, boolean z);
    }

    public interface OnPressedChangeListener {
        /* renamed from: a */
        void mo9880a(MaterialButton materialButton, boolean z);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
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
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public boolean f17699d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f17699d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f17699d = parcel.readInt() == 1;
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.materialButtonStyle, C2507R.style.Widget_MaterialComponents_Button), attributeSet, C2507R.attr.materialButtonStyle);
        this.f17687f = new LinkedHashSet<>();
        this.f17696o = false;
        this.f17697p = false;
        Context context2 = getContext();
        TypedArray m10159d = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17335t, C2507R.attr.materialButtonStyle, C2507R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f17695n = m10159d.getDimensionPixelSize(12, 0);
        this.f17689h = ViewUtils.m10172i(m10159d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f17690i = MaterialResources.m10240a(getContext(), m10159d, 14);
        this.f17691j = MaterialResources.m10243d(getContext(), m10159d, 10);
        this.f17698q = m10159d.getInteger(11, 1);
        this.f17692k = m10159d.getDimensionPixelSize(13, 0);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, ShapeAppearanceModel.m10313c(context2, attributeSet, C2507R.attr.materialButtonStyle, C2507R.style.Widget_MaterialComponents_Button).m10320a());
        this.f17686e = materialButtonHelper;
        materialButtonHelper.f17704c = m10159d.getDimensionPixelOffset(1, 0);
        materialButtonHelper.f17705d = m10159d.getDimensionPixelOffset(2, 0);
        materialButtonHelper.f17706e = m10159d.getDimensionPixelOffset(3, 0);
        materialButtonHelper.f17707f = m10159d.getDimensionPixelOffset(4, 0);
        if (m10159d.hasValue(8)) {
            int dimensionPixelSize = m10159d.getDimensionPixelSize(8, -1);
            materialButtonHelper.f17708g = dimensionPixelSize;
            materialButtonHelper.m9885e(materialButtonHelper.f17703b.m10317g(dimensionPixelSize));
            materialButtonHelper.f17717p = true;
        }
        materialButtonHelper.f17709h = m10159d.getDimensionPixelSize(20, 0);
        materialButtonHelper.f17710i = ViewUtils.m10172i(m10159d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        materialButtonHelper.f17711j = MaterialResources.m10240a(getContext(), m10159d, 6);
        materialButtonHelper.f17712k = MaterialResources.m10240a(getContext(), m10159d, 19);
        materialButtonHelper.f17713l = MaterialResources.m10240a(getContext(), m10159d, 16);
        materialButtonHelper.f17718q = m10159d.getBoolean(5, false);
        materialButtonHelper.f17721t = m10159d.getDimensionPixelSize(9, 0);
        materialButtonHelper.f17719r = m10159d.getBoolean(21, true);
        int m2159B = ViewCompat.m2159B(this);
        int paddingTop = getPaddingTop();
        int m2157A = ViewCompat.m2157A(this);
        int paddingBottom = getPaddingBottom();
        if (m10159d.hasValue(0)) {
            materialButtonHelper.f17716o = true;
            setSupportBackgroundTintList(materialButtonHelper.f17711j);
            setSupportBackgroundTintMode(materialButtonHelper.f17710i);
        } else {
            materialButtonHelper.m9887g();
        }
        ViewCompat.m2226t0(this, m2159B + materialButtonHelper.f17704c, paddingTop + materialButtonHelper.f17706e, m2157A + materialButtonHelper.f17705d, paddingBottom + materialButtonHelper.f17707f);
        m10159d.recycle();
        setCompoundDrawablePadding(this.f17695n);
        m9877g(this.f17691j != null);
    }

    @NonNull
    private String getA11yClassName() {
        return (m9871a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int i2 = 0;
        for (int i3 = 0; i3 < lineCount; i3++) {
            CharSequence subSequence = getText().subSequence(getLayout().getLineStart(i3), getLayout().getLineEnd(i3));
            TextPaint paint = getPaint();
            String charSequence = subSequence.toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            i2 = Math.max(i2, Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth()));
        }
        return i2;
    }

    /* renamed from: a */
    public boolean m9871a() {
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        return materialButtonHelper != null && materialButtonHelper.f17718q;
    }

    /* renamed from: b */
    public final boolean m9872b() {
        int i2 = this.f17698q;
        return i2 == 3 || i2 == 4;
    }

    /* renamed from: c */
    public final boolean m9873c() {
        int i2 = this.f17698q;
        return i2 == 1 || i2 == 2;
    }

    /* renamed from: d */
    public final boolean m9874d() {
        int i2 = this.f17698q;
        return i2 == 16 || i2 == 32;
    }

    /* renamed from: e */
    public final boolean m9875e() {
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        return (materialButtonHelper == null || materialButtonHelper.f17716o) ? false : true;
    }

    /* renamed from: f */
    public final void m9876f() {
        if (m9873c()) {
            TextViewCompat.m2644f(this, this.f17691j, null, null, null);
        } else if (m9872b()) {
            TextViewCompat.m2644f(this, null, null, this.f17691j, null);
        } else if (m9874d()) {
            TextViewCompat.m2644f(this, null, this.f17691j, null, null);
        }
    }

    /* renamed from: g */
    public final void m9877g(boolean z) {
        Drawable drawable = this.f17691j;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.m1845q(drawable).mutate();
            this.f17691j = mutate;
            DrawableCompat.m1842n(mutate, this.f17690i);
            PorterDuff.Mode mode = this.f17689h;
            if (mode != null) {
                DrawableCompat.m1843o(this.f17691j, mode);
            }
            int i2 = this.f17692k;
            if (i2 == 0) {
                i2 = this.f17691j.getIntrinsicWidth();
            }
            int i3 = this.f17692k;
            if (i3 == 0) {
                i3 = this.f17691j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f17691j;
            int i4 = this.f17693l;
            int i5 = this.f17694m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f17691j.setVisible(true, z);
        }
        if (z) {
            m9876f();
            return;
        }
        Drawable[] m2639a = TextViewCompat.m2639a(this);
        Drawable drawable3 = m2639a[0];
        Drawable drawable4 = m2639a[1];
        Drawable drawable5 = m2639a[2];
        if ((!m9873c() || drawable3 == this.f17691j) && ((!m9872b() || drawable5 == this.f17691j) && (!m9874d() || drawable4 == this.f17691j))) {
            z2 = false;
        }
        if (z2) {
            m9876f();
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (m9875e()) {
            return this.f17686e.f17708g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f17691j;
    }

    public int getIconGravity() {
        return this.f17698q;
    }

    @Px
    public int getIconPadding() {
        return this.f17695n;
    }

    @Px
    public int getIconSize() {
        return this.f17692k;
    }

    public ColorStateList getIconTint() {
        return this.f17690i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f17689h;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f17686e.f17707f;
    }

    @Dimension
    public int getInsetTop() {
        return this.f17686e.f17706e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m9875e()) {
            return this.f17686e.f17713l;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m9875e()) {
            return this.f17686e.f17703b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m9875e()) {
            return this.f17686e.f17712k;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (m9875e()) {
            return this.f17686e.f17709h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        return m9875e() ? this.f17686e.f17711j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m9875e() ? this.f17686e.f17710i : super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final void m9878h(int i2, int i3) {
        if (this.f17691j == null || getLayout() == null) {
            return;
        }
        if (!m9873c() && !m9872b()) {
            if (m9874d()) {
                this.f17693l = 0;
                if (this.f17698q == 16) {
                    this.f17694m = 0;
                    m9877g(false);
                    return;
                }
                int i4 = this.f17692k;
                if (i4 == 0) {
                    i4 = this.f17691j.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - i4) - this.f17695n) - getPaddingBottom()) / 2);
                if (this.f17694m != max) {
                    this.f17694m = max;
                    m9877g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f17694m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f17698q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f17693l = 0;
            m9877g(false);
            return;
        }
        int i6 = this.f17692k;
        if (i6 == 0) {
            i6 = this.f17691j.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - ViewCompat.m2157A(this)) - i6) - this.f17695n) - ViewCompat.m2159B(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((ViewCompat.m2231w(this) == 1) != (this.f17698q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f17693l != textLayoutWidth) {
            this.f17693l = textLayoutWidth;
            m9877g(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f17696o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m9875e()) {
            MaterialShapeUtils.m10309c(this, this.f17686e.m9882b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (m9871a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f17684r);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f17685s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m9871a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MaterialButtonHelper materialButtonHelper;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (materialButtonHelper = this.f17686e) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = materialButtonHelper.f17714m;
            if (drawable != null) {
                drawable.setBounds(materialButtonHelper.f17704c, materialButtonHelper.f17706e, i7 - materialButtonHelper.f17705d, i6 - materialButtonHelper.f17707f);
            }
        }
        m9878h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        setChecked(savedState.f17699d);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17699d = this.f17696o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m9878h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f17686e.f17719r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f17691j != null) {
            if (this.f17691j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        if (!m9875e()) {
            super.setBackgroundColor(i2);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        if (materialButtonHelper.m9882b() != null) {
            materialButtonHelper.m9882b().setTint(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!m9875e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        materialButtonHelper.f17716o = true;
        materialButtonHelper.f17702a.setSupportBackgroundTintList(materialButtonHelper.f17711j);
        materialButtonHelper.f17702a.setSupportBackgroundTintMode(materialButtonHelper.f17710i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        setBackgroundDrawable(i2 != 0 ? AppCompatResources.m497b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m9875e()) {
            this.f17686e.f17718q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m9871a() && isEnabled() && this.f17696o != z) {
            this.f17696o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f17696o;
                if (!materialButtonToggleGroup.f17728g) {
                    materialButtonToggleGroup.m9890b(getId(), z2);
                }
            }
            if (this.f17697p) {
                return;
            }
            this.f17697p = true;
            Iterator<OnCheckedChangeListener> it = this.f17687f.iterator();
            while (it.hasNext()) {
                it.next().m9879a(this, this.f17696o);
            }
            this.f17697p = false;
        }
    }

    public void setCornerRadius(@Px int i2) {
        if (m9875e()) {
            MaterialButtonHelper materialButtonHelper = this.f17686e;
            if (materialButtonHelper.f17717p && materialButtonHelper.f17708g == i2) {
                return;
            }
            materialButtonHelper.f17708g = i2;
            materialButtonHelper.f17717p = true;
            materialButtonHelper.m9885e(materialButtonHelper.f17703b.m10317g(i2));
        }
    }

    public void setCornerRadiusResource(@DimenRes int i2) {
        if (m9875e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m9875e()) {
            this.f17686e.m9882b().m10300w(f2);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f17691j != drawable) {
            this.f17691j = drawable;
            m9877g(true);
            m9878h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f17698q != i2) {
            this.f17698q = i2;
            m9878h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i2) {
        if (this.f17695n != i2) {
            this.f17695n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(@DrawableRes int i2) {
        setIcon(i2 != 0 ? AppCompatResources.m497b(getContext(), i2) : null);
    }

    public void setIconSize(@Px int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f17692k != i2) {
            this.f17692k = i2;
            m9877g(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f17690i != colorStateList) {
            this.f17690i = colorStateList;
            m9877g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f17689h != mode) {
            this.f17689h = mode;
            m9877g(false);
        }
    }

    public void setIconTintResource(@ColorRes int i2) {
        setIconTint(AppCompatResources.m496a(getContext(), i2));
    }

    public void setInsetBottom(@Dimension int i2) {
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        materialButtonHelper.m9886f(materialButtonHelper.f17706e, i2);
    }

    public void setInsetTop(@Dimension int i2) {
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        materialButtonHelper.m9886f(i2, materialButtonHelper.f17707f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.f17688g = onPressedChangeListener;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        OnPressedChangeListener onPressedChangeListener = this.f17688g;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.mo9880a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m9875e()) {
            MaterialButtonHelper materialButtonHelper = this.f17686e;
            if (materialButtonHelper.f17713l != colorStateList) {
                materialButtonHelper.f17713l = colorStateList;
                boolean z = MaterialButtonHelper.f17700u;
                if (z && (materialButtonHelper.f17702a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButtonHelper.f17702a.getBackground()).setColor(RippleUtils.m10258d(colorStateList));
                } else {
                    if (z || !(materialButtonHelper.f17702a.getBackground() instanceof RippleDrawableCompat)) {
                        return;
                    }
                    ((RippleDrawableCompat) materialButtonHelper.f17702a.getBackground()).setTintList(RippleUtils.m10258d(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i2) {
        if (m9875e()) {
            setRippleColor(AppCompatResources.m496a(getContext(), i2));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!m9875e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f17686e.m9885e(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m9875e()) {
            MaterialButtonHelper materialButtonHelper = this.f17686e;
            materialButtonHelper.f17715n = z;
            materialButtonHelper.m9888h();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m9875e()) {
            MaterialButtonHelper materialButtonHelper = this.f17686e;
            if (materialButtonHelper.f17712k != colorStateList) {
                materialButtonHelper.f17712k = colorStateList;
                materialButtonHelper.m9888h();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i2) {
        if (m9875e()) {
            setStrokeColor(AppCompatResources.m496a(getContext(), i2));
        }
    }

    public void setStrokeWidth(@Px int i2) {
        if (m9875e()) {
            MaterialButtonHelper materialButtonHelper = this.f17686e;
            if (materialButtonHelper.f17709h != i2) {
                materialButtonHelper.f17709h = i2;
                materialButtonHelper.m9888h();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i2) {
        if (m9875e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!m9875e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        if (materialButtonHelper.f17711j != colorStateList) {
            materialButtonHelper.f17711j = colorStateList;
            if (materialButtonHelper.m9882b() != null) {
                DrawableCompat.m1842n(materialButtonHelper.m9882b(), materialButtonHelper.f17711j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!m9875e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f17686e;
        if (materialButtonHelper.f17710i != mode) {
            materialButtonHelper.f17710i = mode;
            if (materialButtonHelper.m9882b() == null || materialButtonHelper.f17710i == null) {
                return;
            }
            DrawableCompat.m1843o(materialButtonHelper.m9882b(), materialButtonHelper.f17710i);
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        m9878h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f17686e.f17719r = z;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f17696o);
    }
}
