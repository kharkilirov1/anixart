package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes2.dex */
public interface HeightCalculatorFactory {

    public interface GetTabCountFn {
        /* renamed from: a */
        int mo17505a();
    }

    public interface MeasureTabHeightFn {
        /* renamed from: b */
        int mo17506b(@NonNull ViewGroup viewGroup, int i2, int i3);
    }

    /* renamed from: b */
    ViewPagerFixedSizeLayout.HeightCalculator mo17504b(@NonNull ViewGroup viewGroup, @NonNull MeasureTabHeightFn measureTabHeightFn, @NonNull GetTabCountFn getTabCountFn);
}
