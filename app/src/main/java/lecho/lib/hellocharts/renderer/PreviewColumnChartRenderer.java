package lecho.lib.hellocharts.renderer;

import android.graphics.Canvas;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public class PreviewColumnChartRenderer extends ColumnChartRenderer {
    @Override // lecho.lib.hellocharts.renderer.ColumnChartRenderer, lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: d */
    public void mo34488d(Canvas canvas) {
        ChartComputator chartComputator = this.f68648b;
        Viewport viewport = chartComputator.f68513g;
        chartComputator.mo34416b(viewport.f68643b);
        this.f68648b.mo34417c(viewport.f68644c);
        this.f68648b.mo34416b(viewport.f68645d);
        this.f68648b.mo34417c(viewport.f68646e);
        throw null;
    }
}
