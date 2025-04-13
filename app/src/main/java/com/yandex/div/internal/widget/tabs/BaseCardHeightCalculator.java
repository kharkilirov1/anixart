package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabMeasurement;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

@MainThread
/* loaded from: classes2.dex */
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    /* renamed from: a */
    @NonNull
    public final ViewGroup f34147a;

    /* renamed from: b */
    @NonNull
    public final HeightCalculatorFactory.MeasureTabHeightFn f34148b;

    /* renamed from: c */
    @NonNull
    public final HeightCalculatorFactory.GetTabCountFn f34149c;

    /* renamed from: d */
    @NonNull
    public final SparseArray<TabMeasurement> f34150d = new SparseArray<>();

    /* renamed from: e */
    public int f34151e = 0;

    /* renamed from: f */
    public float f34152f = 0.0f;

    public BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.f34147a = viewGroup;
        this.f34148b = measureTabHeightFn;
        this.f34149c = getTabCountFn;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: a */
    public void mo17462a(int i2, float f2) {
        this.f34151e = i2;
        this.f34152f = f2;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: c */
    public int mo17463c(int i2, int i3) {
        TabMeasurement tabMeasurement = this.f34150d.get(i2);
        if (tabMeasurement == null) {
            int mo17505a = this.f34149c.mo17505a();
            if (mo17505a == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i2);
            TabMeasurement tabMeasurement2 = new TabMeasurement(mo17505a, new TabMeasurement.TabMeasurementFunction() { // from class: com.yandex.div.internal.widget.tabs.a
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.TabMeasurementFunction
                /* renamed from: a */
                public final int mo17511a(int i4) {
                    BaseCardHeightCalculator baseCardHeightCalculator = BaseCardHeightCalculator.this;
                    return baseCardHeightCalculator.f34148b.mo17506b(baseCardHeightCalculator.f34147a, size, i4);
                }
            });
            this.f34150d.put(i2, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return mo17465e(tabMeasurement, this.f34151e, this.f34152f);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    /* renamed from: d */
    public void mo17464d() {
        this.f34150d.clear();
    }

    /* renamed from: e */
    public abstract int mo17465e(@NonNull TabMeasurement tabMeasurement, int i2, float f2);
}
