package lecho.lib.hellocharts.view;

import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.renderer.ChartRenderer;

/* loaded from: classes3.dex */
public interface Chart {
    /* renamed from: a */
    void mo34497a(float f2);

    /* renamed from: b */
    void mo34498b();

    /* renamed from: c */
    void mo34500c();

    ChartComputator getChartComputator();

    ChartData getChartData();

    ChartRenderer getChartRenderer();

    void setCurrentViewport(Viewport viewport);
}
