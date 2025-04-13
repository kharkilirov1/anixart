package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperLineHeightEditText.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "lineHeight", "", "setFixedLineHeight", "(Ljava/lang/Integer;)V", "getCompoundPaddingTop", "getCompoundPaddingBottom", "", "whether", "setHorizontallyScrolling", "getVisibleLineCount", "()I", "visibleLineCount", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SuperLineHeightEditText extends AppCompatEditText {

    /* renamed from: g */
    public int f34017g;

    /* renamed from: h */
    public int f34018h;

    /* renamed from: i */
    public int f34019i;

    /* renamed from: j */
    public boolean f34020j;

    public SuperLineHeightEditText(@NotNull Context context) {
        super(context, null);
        this.f34017g = -1;
        this.f34020j = true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f34019i;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f34018h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f34017g == -1 || View.MeasureSpec.getMode(i3) == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + (this.f34017g * getVisibleLineCount()), View.MeasureSpec.getMode(getMeasuredHeightAndState())));
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.m32179h(event, "event");
        if (!this.f34020j) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    public final void setFixedLineHeight(@Nullable Integer lineHeight) {
        this.f34017g = lineHeight == null ? -1 : lineHeight.intValue();
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean whether) {
        this.f34020j = !whether;
        super.setHorizontallyScrolling(whether);
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f2, float f3) {
        float f4 = f2 / 2;
        this.f34018h = MathKt.m32223c(f4);
        this.f34019i = (int) f4;
        super.setLineSpacing(f2, f3);
    }
}
