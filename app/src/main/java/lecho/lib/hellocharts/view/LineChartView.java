package lecho.lib.hellocharts.view;

import java.util.ArrayList;
import lecho.lib.hellocharts.listener.LineChartOnValueSelectListener;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.provider.LineChartDataProvider;

/* loaded from: classes3.dex */
public class LineChartView extends AbstractChartView implements LineChartDataProvider {

    /* renamed from: i */
    public LineChartData f68728i;

    /* renamed from: j */
    public LineChartOnValueSelectListener f68729j;

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: c */
    public void mo34500c() {
        SelectedValue mo34475i = this.f68718e.mo34475i();
        if (!mo34475i.m34461b()) {
            this.f68729j.mo34441g();
        } else {
            this.f68729j.mo34442a(mo34475i.f68624a, mo34475i.f68625b, this.f68728i.f68610d.get(mo34475i.f68624a).f68609j.get(mo34475i.f68625b));
        }
    }

    @Override // lecho.lib.hellocharts.view.AbstractChartView, lecho.lib.hellocharts.view.Chart
    public ChartData getChartData() {
        return this.f68728i;
    }

    public LineChartData getLineChartData() {
        return this.f68728i;
    }

    public LineChartOnValueSelectListener getOnValueTouchListener() {
        return this.f68729j;
    }

    public void setLineChartData(LineChartData lineChartData) {
        if (lineChartData == null) {
            LineChartData lineChartData2 = new LineChartData();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(new PointValue(0.0f, 2.0f));
            arrayList.add(new PointValue(1.0f, 4.0f));
            arrayList.add(new PointValue(2.0f, 3.0f));
            arrayList.add(new PointValue(3.0f, 4.0f));
            Line line = new Line(arrayList);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(line);
            lineChartData2.f68610d = arrayList2;
            this.f68728i = lineChartData2;
        } else {
            this.f68728i = lineChartData;
        }
        m34499d();
    }

    public void setOnValueTouchListener(LineChartOnValueSelectListener lineChartOnValueSelectListener) {
        if (lineChartOnValueSelectListener != null) {
            this.f68729j = lineChartOnValueSelectListener;
        }
    }
}
