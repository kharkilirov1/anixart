package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPagerFixedSizeLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m31884d2 = {"Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout$HeightCalculator;", "heightCalculator", "", "setHeightCalculator", "", "padding", "getCollapsiblePaddingBottom", "()I", "setCollapsiblePaddingBottom", "(I)V", "collapsiblePaddingBottom", "HeightCalculator", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {

    /* renamed from: b */
    @Nullable
    public HeightCalculator f34301b;

    /* renamed from: c */
    public int f34302c;

    /* compiled from: ViewPagerFixedSizeLayout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout$HeightCalculator;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface HeightCalculator {
        /* renamed from: a */
        void mo17462a(int i2, float f2);

        /* renamed from: b */
        boolean mo17503b(int i2, float f2);

        /* renamed from: c */
        int mo17463c(int i2, int i3);

        /* renamed from: d */
        void mo17464d();
    }

    public ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, (i3 & 4) != 0 ? 0 : i2);
    }

    /* renamed from: getCollapsiblePaddingBottom, reason: from getter */
    public final int getF34302c() {
        return this.f34302c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        HeightCalculator heightCalculator = this.f34301b;
        if (heightCalculator != null) {
            Intrinsics.m32176e(heightCalculator);
            i3 = View.MeasureSpec.makeMeasureSpec(heightCalculator.mo17463c(i2, i3), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public final void setCollapsiblePaddingBottom(int i2) {
        if (this.f34302c != i2) {
            this.f34302c = i2;
        }
    }

    public final void setHeightCalculator(@Nullable HeightCalculator heightCalculator) {
        this.f34301b = heightCalculator;
    }
}
