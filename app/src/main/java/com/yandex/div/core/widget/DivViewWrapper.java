package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewWrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m31884d2 = {"Lcom/yandex/div/core/widget/DivViewWrapper;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "setLayoutParams", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "", "value", "m", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivViewWrapper extends FrameContainerLayout implements DivBorderSupports, TransientView {

    /* renamed from: m, reason: from kotlin metadata */
    public boolean isTransient;

    public DivViewWrapper(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return;
        }
        divBorderSupports.mo17098a(divBorder, resolver);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i2, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(getChildCount() == 0)) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view".toString());
        }
        super.addView(view, 0, layoutParams);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !Intrinsics.m32174c(layoutParams, getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof DivLayoutParams ? layoutParams : layoutParams == null ? new DivLayoutParams(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        DivViewWrapperKt.m17137a(generateDefaultLayoutParams, layoutParams);
        return generateDefaultLayoutParams;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return null;
        }
        return divBorderSupports.getBorder();
    }

    @Nullable
    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer */
    public DivBorderDrawer getF32770s() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return null;
        }
        return divBorderSupports.getF32770s();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View child = getChild();
        if (child == null) {
            return;
        }
        child.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        View child = getChild();
        if (child != null) {
            child.measure(i2, i3);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
            return;
        }
        setMeasuredDimension(ViewGroup.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i2, 0), ViewGroup.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i3, 0));
    }

    @Override // android.view.View
    public void setLayoutParams(@Nullable ViewGroup.LayoutParams params) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(params);
            return;
        }
        if (params != null) {
            DivViewWrapperKt.m17137a(params, child.getLayoutParams());
        }
        super.setLayoutParams(params);
        child.setLayoutParams(params);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
