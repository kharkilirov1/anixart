package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SeparatorView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0010\u0018\u00002\u00020\u0001:\u0001!J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R*\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R2\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0011\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R$\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006\""}, m31884d2 = {"Lcom/yandex/div/internal/widget/SeparatorView;", "Landroid/view/View;", "", "resId", "", "setDividerColorResource", "setDividerHeightResource", "", "value", "e", "Z", "isHorizontal", "()Z", "setHorizontal", "(Z)V", "height", "f", "I", "getDividerThickness", "()I", "setDividerThickness", "(I)V", "dividerThickness", "dividerGravity", "g", "getDividerGravity", "setDividerGravity", "getDividerGravity$annotations", "()V", "color", "getDividerColor", "setDividerColor", "dividerColor", "DividerGravity", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SeparatorView extends View {

    /* renamed from: b */
    @NotNull
    public final Paint f34011b;

    /* renamed from: c */
    @NotNull
    public final Rect f34012c;

    /* renamed from: d */
    public boolean f34013d;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean isHorizontal;

    /* renamed from: f, reason: from kotlin metadata */
    public int dividerThickness;

    /* renamed from: g, reason: from kotlin metadata */
    public int dividerGravity;

    /* compiled from: SeparatorView.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SeparatorView$DividerGravity;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public @interface DividerGravity {
    }

    @JvmOverloads
    public SeparatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        paint.setColor(0);
        this.f34011b = paint;
        this.f34012c = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    @DividerGravity
    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    /* renamed from: b */
    public final int m17419b(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i2 : size : Math.min(i2, size);
    }

    public final int getDividerColor() {
        return this.f34011b.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        super.onDraw(canvas);
        if (Color.alpha(this.f34011b.getColor()) > 0) {
            if (this.f34013d) {
                int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
                int height = this.isHorizontal ? getHeight() : getWidth();
                int i2 = (height - paddingTop) - paddingBottom;
                int i3 = this.dividerGravity;
                if (i3 == 17) {
                    paddingTop = C0000a.m5b(i2, this.dividerThickness, 2, paddingTop);
                } else if (i3 != 8388611) {
                    paddingTop = i3 != 8388613 ? 0 : (height - paddingBottom) - this.dividerThickness;
                }
                if (this.isHorizontal) {
                    Rect rect = this.f34012c;
                    rect.top = paddingTop;
                    rect.bottom = Math.min(i2, this.dividerThickness) + paddingTop;
                    this.f34012c.left = getPaddingLeft();
                    this.f34012c.right = getWidth() - getPaddingRight();
                } else {
                    Rect rect2 = this.f34012c;
                    rect2.left = paddingTop;
                    rect2.right = Math.min(i2, this.dividerThickness) + paddingTop;
                    this.f34012c.top = getPaddingTop();
                    this.f34012c.bottom = getHeight() - getPaddingBottom();
                }
                this.f34013d = false;
            }
            canvas.drawRect(this.f34012c, this.f34011b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.isHorizontal) {
            paddingBottom += this.dividerThickness;
        } else {
            paddingRight += this.dividerThickness;
        }
        setMeasuredDimension(m17419b(Math.max(paddingRight, getSuggestedMinimumWidth()), i2), m17419b(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f34013d = true;
    }

    public final void setDividerColor(int i2) {
        if (this.f34011b.getColor() != i2) {
            this.f34011b.setColor(i2);
            invalidate();
        }
    }

    public final void setDividerColorResource(@ColorRes int resId) {
        setDividerColor(ContextCompat.m1670c(getContext(), resId));
    }

    public final void setDividerGravity(@DividerGravity int i2) {
        if (this.dividerGravity != i2) {
            this.dividerGravity = i2;
            this.f34013d = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(@DimenRes int resId) {
        setDividerThickness(getResources().getDimensionPixelSize(resId));
    }

    public final void setDividerThickness(int i2) {
        if (this.dividerThickness != i2) {
            this.dividerThickness = i2;
            this.f34013d = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.isHorizontal != z) {
            this.isHorizontal = z;
            this.f34013d = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        this.f34013d = true;
    }
}
