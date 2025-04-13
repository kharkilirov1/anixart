package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameContainerLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R(\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0014\u0010&\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0014\u0010(\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001b¨\u0006)"}, m31884d2 = {"Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "", "gravity", "", "setForegroundGravity", "", "d", "Z", "getMeasureAllChildren", "()Z", "setMeasureAllChildren", "(Z)V", "getMeasureAllChildren$annotations", "()V", "measureAllChildren", "", "<set-?>", "k", "Lkotlin/properties/ReadWriteProperty;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getPaddingLeftWithForeground", "()I", "paddingLeftWithForeground", "getPaddingRightWithForeground", "paddingRightWithForeground", "getPaddingTopWithForeground", "paddingTopWithForeground", "getPaddingBottomWithForeground", "paddingBottomWithForeground", "getUseAspect", "useAspect", "getHorizontalPadding", "horizontalPadding", "getVerticalPadding", "verticalPadding", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class FrameContainerLayout extends DivViewGroup implements AspectView {

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f33977l = {Reflection.m32195c(new MutablePropertyReference1Impl(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: c */
    @NotNull
    public final Rect f33978c;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean measureAllChildren;

    /* renamed from: e */
    @NotNull
    public final Set<View> f33980e;

    /* renamed from: f */
    @NotNull
    public final Set<View> f33981f;

    /* renamed from: g */
    @NotNull
    public final Set<View> f33982g;

    /* renamed from: h */
    public int f33983h;

    /* renamed from: i */
    public int f33984i;

    /* renamed from: j */
    public int f33985j;

    /* renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty aspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.m32179h(context, "context");
        this.f33978c = new Rect();
        this.f33980e = new LinkedHashSet();
        this.f33981f = new LinkedHashSet();
        this.f33982g = new LinkedHashSet();
        this.aspectRatio = ViewsKt.m17187b(Float.valueOf(0.0f), new Function1<Float, Float>() { // from class: com.yandex.div.internal.widget.FrameContainerLayout$aspectRatio$2
            @Override // kotlin.jvm.functions.Function1
            public Float invoke(Float f2) {
                return Float.valueOf(RangesKt.m32234a(f2.floatValue(), 0.0f));
            }
        });
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.f33978c.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.f33978c.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.f33978c.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.f33978c.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    /* renamed from: g */
    public final boolean m17415g(DivLayoutParams divLayoutParams, boolean z, boolean z2) {
        if (!(!z && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1)) {
            if (!(!z2 && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f33977l[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.measureAllChildren;
    }

    /* renamed from: i */
    public final void m17416i(int i2) {
        this.f33984i = Math.max(this.f33984i, i2);
    }

    /* renamed from: j */
    public final void m17417j(int i2) {
        this.f33983h = Math.max(this.f33983h, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r11 = r8.getRight()
            int r12 = r8.getBottom()
            int r13 = r8.getPaddingLeftWithForeground()
            int r11 = r11 - r9
            int r9 = r8.getPaddingRightWithForeground()
            int r11 = r11 - r9
            int r9 = r8.getPaddingTopWithForeground()
            int r12 = r12 - r10
            int r10 = r8.getPaddingBottomWithForeground()
            int r12 = r12 - r10
            int r10 = r8.getChildCount()
            r0 = 0
        L29:
            if (r0 >= r10) goto L9f
            int r1 = r0 + 1
            android.view.View r0 = r8.getChildAt(r0)
            int r2 = r0.getVisibility()
            r3 = 8
            if (r2 != r3) goto L3a
            goto L9d
        L3a:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams"
            java.util.Objects.requireNonNull(r2, r3)
            com.yandex.div.internal.widget.DivLayoutParams r2 = (com.yandex.div.internal.widget.DivLayoutParams) r2
            int r3 = r0.getMeasuredWidth()
            int r4 = r0.getMeasuredHeight()
            int r5 = r2.f33956a
            int r6 = r8.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            int r6 = r2.f33956a
            r6 = r6 & 112(0x70, float:1.57E-43)
            r5 = r5 & 7
            r7 = 1
            if (r5 == r7) goto L6c
            r7 = 5
            if (r5 == r7) goto L66
            int r5 = r2.leftMargin
            goto L77
        L66:
            int r5 = r11 - r3
            int r7 = r2.rightMargin
            int r5 = r5 - r7
            goto L78
        L6c:
            int r5 = r11 - r13
            int r5 = r5 - r3
            int r7 = r2.leftMargin
            int r5 = r5 + r7
            int r7 = r2.rightMargin
            int r5 = r5 - r7
            int r5 = r5 / 2
        L77:
            int r5 = r5 + r13
        L78:
            r7 = 16
            if (r6 == r7) goto L8b
            r7 = 80
            if (r6 == r7) goto L84
            int r2 = r2.topMargin
            int r2 = r2 + r9
            goto L98
        L84:
            int r6 = r12 - r4
            int r2 = r2.bottomMargin
            int r2 = r6 - r2
            goto L98
        L8b:
            int r6 = r12 - r9
            int r6 = r6 - r4
            int r7 = r2.topMargin
            int r6 = r6 + r7
            int r2 = r2.bottomMargin
            r7 = 2
            int r2 = p000a.C0000a.m5b(r6, r2, r7, r9)
        L98:
            int r3 = r3 + r5
            int r4 = r4 + r2
            r0.layout(r5, r2, r3, r4)
        L9d:
            r0 = r1
            goto L29
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.FrameContainerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        String str;
        DivLayoutParams divLayoutParams;
        View view;
        String str2;
        int horizontalPadding;
        Integer valueOf;
        int verticalPadding;
        int i6;
        int m17411a;
        int m17411a2;
        int i7;
        View view2;
        this.f33983h = 0;
        this.f33984i = 0;
        this.f33985j = 0;
        int makeMeasureSpec = getUseAspect() ? !ViewsKt.m17190e(i2) ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.m17193h(MathKt.m32223c(View.MeasureSpec.getSize(i2) / getAspectRatio())) : i3;
        boolean z = !this.measureAllChildren;
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i4 = 8;
            i5 = -1;
            str = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams";
            if (i8 >= childCount) {
                break;
            }
            int i9 = i8 + 1;
            View child = getChildAt(i8);
            if (!z || child.getVisibility() != 8) {
                Intrinsics.m32178g(child, "child");
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams;
                boolean m17190e = ViewsKt.m17190e(i2);
                boolean m17190e2 = ViewsKt.m17190e(makeMeasureSpec);
                boolean z2 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).width == -1;
                int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).height;
                boolean z3 = i10 == -1;
                if ((m17190e && m17190e2) || (!m17190e2 ? !m17190e ? !(z2 && (z3 || (i10 == -3 && getUseAspect()))) : !z3 : z2)) {
                    measureChildWithMargins(child, i2, 0, makeMeasureSpec, 0);
                    this.f33985j = ViewGroup.combineMeasuredStates(this.f33985j, child.getMeasuredState());
                    if (m17415g(divLayoutParams2, m17190e, m17190e2)) {
                        view2 = child;
                        this.f33980e.add(view2);
                    } else {
                        view2 = child;
                    }
                    if (!m17190e && !z2) {
                        m17417j(divLayoutParams2.m17409a() + view2.getMeasuredWidth());
                    }
                    if (!m17190e2 && !z3 && !getUseAspect()) {
                        m17416i(divLayoutParams2.m17410b() + view2.getMeasuredHeight());
                    }
                } else if (m17415g(divLayoutParams2, m17190e, m17190e2)) {
                    this.f33981f.add(child);
                }
            }
            i8 = i9;
        }
        CollectionsKt.m32020g(this.f33982g, this.f33980e);
        CollectionsKt.m32020g(this.f33982g, this.f33981f);
        if (!this.f33982g.isEmpty()) {
            if (ViewsKt.m17189d(i2) && this.f33983h == 0) {
                this.f33983h = View.MeasureSpec.getSize(i2);
            }
            if (!getUseAspect() && ViewsKt.m17189d(makeMeasureSpec) && this.f33984i == 0) {
                this.f33984i = View.MeasureSpec.getSize(makeMeasureSpec);
            }
        }
        if (!this.f33982g.isEmpty()) {
            boolean m17190e3 = ViewsKt.m17190e(i2);
            boolean m17190e4 = ViewsKt.m17190e(makeMeasureSpec);
            if (!m17190e3 || !m17190e4) {
                boolean z4 = !m17190e3 && this.f33983h == 0;
                boolean z5 = (m17190e4 || getUseAspect() || this.f33984i != 0) ? false : true;
                if (z4 || z5) {
                    for (View view3 : this.f33982g) {
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        Objects.requireNonNull(layoutParams2, str);
                        DivLayoutParams divLayoutParams3 = (DivLayoutParams) layoutParams2;
                        if (this.f33981f.contains(view3) && ((((ViewGroup.MarginLayoutParams) divLayoutParams3).width == i5 && z4) || (((ViewGroup.MarginLayoutParams) divLayoutParams3).height == i5 && z5))) {
                            divLayoutParams = divLayoutParams3;
                            str2 = str;
                            measureChildWithMargins(view3, i2, 0, makeMeasureSpec, 0);
                            this.f33985j = ViewGroup.combineMeasuredStates(this.f33985j, view3.getMeasuredState());
                            view = view3;
                            this.f33981f.remove(view);
                        } else {
                            divLayoutParams = divLayoutParams3;
                            view = view3;
                            str2 = str;
                        }
                        if (z4) {
                            m17417j(divLayoutParams.m17409a() + view.getMeasuredWidth());
                        }
                        if (z5) {
                            m17416i(divLayoutParams.m17410b() + view.getMeasuredHeight());
                        }
                        str = str2;
                        i5 = -1;
                    }
                } else {
                    Iterator<T> it = this.f33982g.iterator();
                    while (it.hasNext()) {
                        ViewGroup.LayoutParams layoutParams3 = ((View) it.next()).getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams4 = (DivLayoutParams) layoutParams3;
                        if (!m17190e3 && ((ViewGroup.MarginLayoutParams) divLayoutParams4).width == -1) {
                            m17417j(divLayoutParams4.m17409a());
                        }
                        if (!m17190e4 && ((ViewGroup.MarginLayoutParams) divLayoutParams4).height == -1) {
                            m17416i(divLayoutParams4.m17410b());
                        }
                    }
                }
            }
        }
        String str3 = str;
        Integer num = null;
        if (ViewsKt.m17190e(i2)) {
            horizontalPadding = 0;
        } else {
            horizontalPadding = this.f33983h + getHorizontalPadding();
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            if (horizontalPadding < suggestedMinimumWidth) {
                horizontalPadding = suggestedMinimumWidth;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                Drawable foreground = getForeground();
                if (foreground == null) {
                    valueOf = null;
                } else {
                    int minimumWidth = foreground.getMinimumWidth();
                    if (horizontalPadding >= minimumWidth) {
                        minimumWidth = horizontalPadding;
                    }
                    valueOf = Integer.valueOf(minimumWidth);
                }
                if (valueOf != null) {
                    horizontalPadding = valueOf.intValue();
                }
            }
        }
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(horizontalPadding, i2, this.f33985j);
        int i11 = 16777215 & resolveSizeAndState;
        if (ViewsKt.m17190e(makeMeasureSpec)) {
            i6 = 0;
        } else {
            if (getUseAspect() && !ViewsKt.m17190e(i2)) {
                verticalPadding = MathKt.m32223c(i11 / getAspectRatio());
            } else {
                verticalPadding = this.f33984i + getVerticalPadding();
                int suggestedMinimumHeight = getSuggestedMinimumHeight();
                if (verticalPadding < suggestedMinimumHeight) {
                    verticalPadding = suggestedMinimumHeight;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    Drawable foreground2 = getForeground();
                    if (foreground2 != null) {
                        int minimumHeight = foreground2.getMinimumHeight();
                        if (verticalPadding >= minimumHeight) {
                            minimumHeight = verticalPadding;
                        }
                        num = Integer.valueOf(minimumHeight);
                    }
                    if (num != null) {
                        verticalPadding = num.intValue();
                    }
                }
            }
            i6 = verticalPadding;
        }
        if (ViewsKt.m17191f(makeMeasureSpec)) {
            makeMeasureSpec = ViewsKt.m17193h(i6);
            if (getUseAspect() && !ViewsKt.m17190e(i2)) {
                boolean z6 = true ^ this.measureAllChildren;
                int childCount2 = getChildCount();
                int i12 = 0;
                while (i12 < childCount2) {
                    int i13 = i12 + 1;
                    View child2 = getChildAt(i12);
                    if (!z6 || child2.getVisibility() != i4) {
                        Intrinsics.m32178g(child2, "child");
                        ViewGroup.LayoutParams layoutParams4 = child2.getLayoutParams();
                        Objects.requireNonNull(layoutParams4, str3);
                        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams4)).height == -3) {
                            i7 = childCount2;
                            measureChildWithMargins(child2, i2, 0, makeMeasureSpec, 0);
                            this.f33982g.remove(child2);
                            i12 = i13;
                            childCount2 = i7;
                            i4 = 8;
                        }
                    }
                    i7 = childCount2;
                    i12 = i13;
                    childCount2 = i7;
                    i4 = 8;
                }
            }
        }
        setMeasuredDimension(resolveSizeAndState, ViewGroup.resolveSizeAndState(i6, makeMeasureSpec, this.f33985j << 16));
        for (View view4 : this.f33982g) {
            DivViewGroup.Companion companion = DivViewGroup.f33964b;
            ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams5, str3);
            DivLayoutParams divLayoutParams5 = (DivLayoutParams) layoutParams5;
            int m17409a = divLayoutParams5.m17409a() + getHorizontalPadding();
            int verticalPadding2 = getVerticalPadding() + divLayoutParams5.m17410b();
            int i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams5).width;
            if (i14 == -1) {
                int measuredWidth = getMeasuredWidth() - m17409a;
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                m17411a = ViewsKt.m17193h(measuredWidth);
            } else {
                m17411a = companion.m17411a(i2, m17409a, i14, view4.getMinimumWidth(), divLayoutParams5.f33963h);
            }
            int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams5).height;
            if (i15 == -1) {
                int measuredHeight = getMeasuredHeight() - verticalPadding2;
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                }
                m17411a2 = ViewsKt.m17193h(measuredHeight);
            } else {
                m17411a2 = companion.m17411a(makeMeasureSpec, verticalPadding2, i15, view4.getMinimumHeight(), divLayoutParams5.f33962g);
            }
            view4.measure(m17411a, m17411a2);
            if (this.f33981f.contains(view4)) {
                this.f33985j = ViewGroup.combineMeasuredStates(this.f33985j, view4.getMeasuredState());
            }
        }
        this.f33980e.clear();
        this.f33981f.clear();
        this.f33982g.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f2) {
        this.aspectRatio.setValue(this, f33977l[0], Float.valueOf(f2));
    }

    @Override // android.view.View
    public void setForegroundGravity(int gravity) {
        if (Build.VERSION.SDK_INT < 23 || getForegroundGravity() == gravity) {
            return;
        }
        super.setForegroundGravity(gravity);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.f33978c.setEmpty();
        } else {
            getForeground().getPadding(this.f33978c);
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z) {
        this.measureAllChildren = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
