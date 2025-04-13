package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

@MainThread
/* loaded from: classes2.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: b */
    public boolean mo17503b(int i2, float f2) {
        if (!(this.f34150d.size() == 0)) {
            if (i2 != 0 && (i2 != 1 || f2 > 0.0f)) {
                return false;
            }
            this.f34150d.size();
            int i3 = Assert.f33709a;
            SparseArray<TabMeasurement> sparseArray = this.f34150d;
            TabMeasurement valueAt = sparseArray.valueAt(sparseArray.size() - 1);
            if (!(valueAt.m17508a() != valueAt.m17509b())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    /* renamed from: e */
    public int mo17465e(@NonNull TabMeasurement tabMeasurement, int i2, float f2) {
        if (i2 > 0) {
            return tabMeasurement.m17509b();
        }
        if (f2 < 0.01f) {
            return tabMeasurement.m17508a();
        }
        return Math.round(((tabMeasurement.m17509b() - r3) * f2) + tabMeasurement.m17508a());
    }
}
