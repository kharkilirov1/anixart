package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.C1195R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: j0 */
    public static final int[] f18377j0 = {C2507R.attr.state_with_icon};

    /* renamed from: U */
    @Nullable
    public Drawable f18378U;

    /* renamed from: V */
    @Nullable
    public Drawable f18379V;

    /* renamed from: W */
    @Nullable
    public Drawable f18380W;

    /* renamed from: a0 */
    @Nullable
    public Drawable f18381a0;

    /* renamed from: b0 */
    @Nullable
    public ColorStateList f18382b0;

    /* renamed from: c0 */
    @Nullable
    public ColorStateList f18383c0;

    /* renamed from: d0 */
    @NonNull
    public PorterDuff.Mode f18384d0;

    /* renamed from: e0 */
    @Nullable
    public ColorStateList f18385e0;

    /* renamed from: f0 */
    @Nullable
    public ColorStateList f18386f0;

    /* renamed from: g0 */
    @NonNull
    public PorterDuff.Mode f18387g0;

    /* renamed from: h0 */
    public int[] f18388h0;

    /* renamed from: i0 */
    public int[] f18389i0;

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.materialSwitchStyle, C2507R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, C2507R.attr.materialSwitchStyle);
        Context context2 = getContext();
        this.f18378U = super.getThumbDrawable();
        this.f18382b0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f18380W = super.getTrackDrawable();
        this.f18385e0 = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray m10160e = ThemeEnforcement.m10160e(context2, attributeSet, C1195R.styleable.f17300A, C2507R.attr.materialSwitchStyle, C2507R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.f18379V = m10160e.m958g(0);
        this.f18383c0 = m10160e.m954c(1);
        this.f18384d0 = ViewUtils.m10172i(m10160e.m961j(2, -1), PorterDuff.Mode.SRC_IN);
        this.f18381a0 = m10160e.m958g(3);
        this.f18386f0 = m10160e.m954c(4);
        this.f18387g0 = ViewUtils.m10172i(m10160e.m961j(5, -1), PorterDuff.Mode.SRC_IN);
        m10160e.f1582b.recycle();
        setEnforceSwitchWidth(false);
        m10176h();
        m10177i();
    }

    /* renamed from: j */
    public static void m10175j(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f2) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        int colorForState = colorStateList.getColorForState(iArr, 0);
        int colorForState2 = colorStateList.getColorForState(iArr2, 0);
        ThreadLocal<double[]> threadLocal = ColorUtils.f3366a;
        float f3 = 1.0f - f2;
        DrawableCompat.m1841m(drawable, Color.argb((int) ((Color.alpha(colorForState2) * f2) + (Color.alpha(colorForState) * f3)), (int) ((Color.red(colorForState2) * f2) + (Color.red(colorForState) * f3)), (int) ((Color.green(colorForState2) * f2) + (Color.green(colorForState) * f3)), (int) ((Color.blue(colorForState2) * f2) + (Color.blue(colorForState) * f3))));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f18378U;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f18379V;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f18383c0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f18384d0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f18382b0;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f18381a0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f18386f0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f18387g0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f18380W;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f18385e0;
    }

    /* renamed from: h */
    public final void m10176h() {
        this.f18378U = DrawableUtils.m10042b(this.f18378U, this.f18382b0, getThumbTintMode());
        this.f18379V = DrawableUtils.m10042b(this.f18379V, this.f18383c0, this.f18384d0);
        m10178k();
        super.setThumbDrawable(DrawableUtils.m10041a(this.f18378U, this.f18379V));
        refreshDrawableState();
    }

    /* renamed from: i */
    public final void m10177i() {
        this.f18380W = DrawableUtils.m10042b(this.f18380W, this.f18385e0, getTrackTintMode());
        this.f18381a0 = DrawableUtils.m10042b(this.f18381a0, this.f18386f0, this.f18387g0);
        m10178k();
        Drawable drawable = this.f18380W;
        if (drawable != null && this.f18381a0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f18380W, this.f18381a0});
        } else if (drawable == null) {
            drawable = this.f18381a0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        m10178k();
        super.invalidate();
    }

    /* renamed from: k */
    public final void m10178k() {
        if (this.f18382b0 == null && this.f18383c0 == null && this.f18385e0 == null && this.f18386f0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f18382b0;
        if (colorStateList != null) {
            m10175j(this.f18378U, colorStateList, this.f18388h0, this.f18389i0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f18383c0;
        if (colorStateList2 != null) {
            m10175j(this.f18379V, colorStateList2, this.f18388h0, this.f18389i0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f18385e0;
        if (colorStateList3 != null) {
            m10175j(this.f18380W, colorStateList3, this.f18388h0, this.f18389i0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f18386f0;
        if (colorStateList4 != null) {
            m10175j(this.f18381a0, colorStateList4, this.f18388h0, this.f18389i0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f18379V != null) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f18377j0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i3 = 0;
        for (int i4 : onCreateDrawableState) {
            if (i4 != 16842912) {
                iArr[i3] = i4;
                i3++;
            }
        }
        this.f18388h0 = iArr;
        this.f18389i0 = DrawableUtils.m10044d(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f18378U = drawable;
        m10176h();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f18379V = drawable;
        m10176h();
    }

    public void setThumbIconResource(@DrawableRes int i2) {
        setThumbIconDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f18383c0 = colorStateList;
        m10176h();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f18384d0 = mode;
        m10176h();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f18382b0 = colorStateList;
        m10176h();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m10176h();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f18381a0 = drawable;
        m10177i();
    }

    public void setTrackDecorationResource(@DrawableRes int i2) {
        setTrackDecorationDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f18386f0 = colorStateList;
        m10177i();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f18387g0 = mode;
        m10177i();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f18380W = drawable;
        m10177i();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f18385e0 = colorStateList;
        m10177i();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m10177i();
    }
}
