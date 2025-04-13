package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {

    /* renamed from: e */
    @Nullable
    public ColorStateList f18207e;

    /* renamed from: f */
    @Nullable
    public MaterialShapeDrawable f18208f;

    /* renamed from: g */
    public ShapeAppearanceModel f18209g;

    /* renamed from: h */
    @Dimension
    public float f18210h;

    /* renamed from: i */
    public boolean f18211i;

    @TargetApi
    public class OutlineProvider extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean m10107g() {
        return getLayoutDirection() == 1;
    }

    @Dimension
    public int getContentPaddingBottom() {
        return 0;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        return 0;
    }

    @Dimension
    public int getContentPaddingLeft() {
        if (m10107g()) {
            return 0;
        }
        m10107g();
        return 0;
    }

    @Dimension
    public int getContentPaddingRight() {
        if (m10107g()) {
            return 0;
        }
        m10107g();
        return 0;
    }

    @Dimension
    public final int getContentPaddingStart() {
        return 0;
    }

    @Dimension
    public int getContentPaddingTop() {
        return 0;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f18209g;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f18207e;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f18210h;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(null, null);
        if (this.f18207e != null) {
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f18211i && isLayoutDirectionResolved()) {
            this.f18211i = true;
            isPaddingRelative();
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        getPaddingLeft();
        getPaddingTop();
        getPaddingRight();
        getPaddingBottom();
        throw null;
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
        super.setPadding(getContentPaddingLeft() + i2, getContentPaddingTop() + i3, getContentPaddingRight() + i4, getContentPaddingBottom() + i5);
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
        super.setPaddingRelative(getContentPaddingStart() + i2, getContentPaddingTop() + i3, getContentPaddingEnd() + i4, getContentPaddingBottom() + i5);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f18209g = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f18208f;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        getWidth();
        getHeight();
        getPaddingLeft();
        getPaddingTop();
        getPaddingRight();
        getPaddingBottom();
        throw null;
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f18207e = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i2) {
        setStrokeColor(AppCompatResources.m496a(getContext(), i2));
    }

    public void setStrokeWidth(@Dimension float f2) {
        if (this.f18210h != f2) {
            this.f18210h = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i2) {
        setStrokeWidth(getResources().getDimensionPixelSize(i2));
    }
}
