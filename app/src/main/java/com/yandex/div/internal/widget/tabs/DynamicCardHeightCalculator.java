package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

@MainThread
/* loaded from: classes2.dex */
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: b */
    public boolean mo17503b(int i2, float f2) {
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: c */
    public int mo17463c(int i2, int i3) {
        this.f34150d.clear();
        return super.mo17463c(i2, i3);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    /* renamed from: e */
    public int mo17465e(@NonNull TabMeasurement tabMeasurement, int i2, float f2) {
        if (f2 < 0.01f) {
            return tabMeasurement.m17510c(i2);
        }
        return Math.round(((tabMeasurement.m17510c(i2 + 1) - r0) * f2) + tabMeasurement.m17510c(i2));
    }
}
