package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/view/ViewGroup;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivViewGroup extends ViewGroup {

    /* renamed from: b */
    @NotNull
    public static final Companion f33964b = new Companion(null);

    /* compiled from: DivViewGroup.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
        
            r11 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L27;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m17411a(int r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                int r9 = android.view.View.MeasureSpec.getSize(r9)
                int r9 = r9 - r10
                r10 = 0
                int r9 = java.lang.Math.max(r10, r9)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1
                r5 = 1073741824(0x40000000, float:2.0)
                r6 = 2147483647(0x7fffffff, float:NaN)
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r7) goto L58
                if (r0 == 0) goto L3e
                if (r0 == r5) goto L21
                goto L7b
            L21:
                if (r11 < 0) goto L26
                if (r11 > r6) goto L26
                goto L27
            L26:
                r4 = 0
            L27:
                if (r4 == 0) goto L2a
                goto L60
            L2a:
                if (r11 != r3) goto L2e
                r11 = r9
                goto L60
            L2e:
                if (r11 != r2) goto L33
                if (r13 != r6) goto L6e
                goto L4a
            L33:
                if (r11 != r1) goto L7b
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L66
            L3e:
                if (r11 < 0) goto L44
                if (r11 > r6) goto L44
                r12 = 1
                goto L45
            L44:
                r12 = 0
            L45:
                if (r12 == 0) goto L48
                goto L60
            L48:
                if (r11 != r3) goto L4c
            L4a:
                r11 = r9
                goto L7c
            L4c:
                if (r11 != r2) goto L4f
                goto L53
            L4f:
                if (r11 != r1) goto L52
                goto L53
            L52:
                r4 = 0
            L53:
                if (r4 == 0) goto L7b
                if (r13 != r6) goto L6e
                goto L4a
            L58:
                if (r11 < 0) goto L5d
                if (r11 > r6) goto L5d
                goto L5e
            L5d:
                r4 = 0
            L5e:
                if (r4 == 0) goto L63
            L60:
                r10 = 1073741824(0x40000000, float:2.0)
                goto L7c
            L63:
                if (r11 != r3) goto L69
                r11 = r9
            L66:
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L7c
            L69:
                if (r11 != r2) goto L70
                if (r13 != r6) goto L6e
                goto L4a
            L6e:
                r11 = r13
                goto L66
            L70:
                if (r11 != r1) goto L7b
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L66
            L7b:
                r11 = 0
            L7c:
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.DivViewGroup.Companion.m17411a(int, int, int, int, int):int");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.m32179h(context, "context");
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NotNull View child, int i2, int i3) {
        Intrinsics.m32179h(child, "child");
        Companion companion = f33964b;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        child.measure(companion.m17411a(i2, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.f33963h), companion.m17411a(i3, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.f33962g));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(@NotNull View child, int i2, int i3, int i4, int i5) {
        Intrinsics.m32179h(child, "child");
        Companion companion = f33964b;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        child.measure(companion.m17411a(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.f33963h), companion.m17411a(i4, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.f33962g));
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }
}
