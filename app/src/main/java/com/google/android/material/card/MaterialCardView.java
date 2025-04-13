package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {

    /* renamed from: m */
    public static final int[] f17741m = {R.attr.state_checked};

    /* renamed from: n */
    public static final int[] f17742n = {C2507R.attr.state_dragged};

    /* renamed from: k */
    public boolean f17743k;

    /* renamed from: l */
    public OnCheckedChangeListener f17744l;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        new RectF();
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    @Dimension
    public int getCheckedIconMargin() {
        throw null;
    }

    @Dimension
    public int getCheckedIconSize() {
        throw null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        Objects.requireNonNull(null);
        throw null;
    }

    @FloatRange
    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        throw null;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    @Dimension
    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f17741m);
        }
        if (this.f17743k) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f17742n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i2) {
        throw null;
    }

    public void setCheckedIconMargin(@Dimension int i2) {
        throw null;
    }

    public void setCheckedIconMarginResource(@DimenRes int i2) {
        if (i2 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconResource(@DrawableRes int i2) {
        AppCompatResources.m497b(getContext(), i2);
        throw null;
    }

    public void setCheckedIconSize(@Dimension int i2) {
        throw null;
    }

    public void setCheckedIconSizeResource(@DimenRes int i2) {
        if (i2 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    public void setDragged(boolean z) {
        if (this.f17743k != z) {
            this.f17743k = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                throw null;
            }
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.f17744l = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(@FloatRange float f2) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(@ColorRes int i2) {
        AppCompatResources.m496a(getContext(), i2);
        throw null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.m10316f(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(@ColorInt int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(@Dimension int i2) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
