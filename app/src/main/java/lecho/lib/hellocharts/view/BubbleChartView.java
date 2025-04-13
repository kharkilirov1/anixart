package lecho.lib.hellocharts.view;

import java.util.ArrayList;
import lecho.lib.hellocharts.listener.BubbleChartOnValueSelectListener;
import lecho.lib.hellocharts.model.BubbleChartData;
import lecho.lib.hellocharts.model.BubbleValue;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.provider.BubbleChartDataProvider;

/* loaded from: classes3.dex */
public class BubbleChartView extends AbstractChartView implements BubbleChartDataProvider {

    /* renamed from: i */
    public BubbleChartData f68722i;

    /* renamed from: j */
    public BubbleChartOnValueSelectListener f68723j;

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: c */
    public void mo34500c() {
        SelectedValue mo34475i = this.f68718e.mo34475i();
        if (!mo34475i.m34461b()) {
            this.f68723j.mo34441g();
        } else {
            this.f68723j.mo34437e(mo34475i.f68624a, this.f68722i.f68584g.get(mo34475i.f68624a));
        }
    }

    public BubbleChartData getBubbleChartData() {
        return this.f68722i;
    }

    @Override // lecho.lib.hellocharts.view.AbstractChartView, lecho.lib.hellocharts.view.Chart
    public ChartData getChartData() {
        return this.f68722i;
    }

    public BubbleChartOnValueSelectListener getOnValueTouchListener() {
        return this.f68723j;
    }

    public void setBubbleChartData(BubbleChartData bubbleChartData) {
        if (bubbleChartData == null) {
            BubbleChartData bubbleChartData2 = new BubbleChartData();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(new BubbleValue(0.0f, 20.0f, 15000.0f));
            arrayList.add(new BubbleValue(3.0f, 22.0f, 20000.0f));
            arrayList.add(new BubbleValue(5.0f, 25.0f, 5000.0f));
            arrayList.add(new BubbleValue(7.0f, 30.0f, 30000.0f));
            arrayList.add(new BubbleValue(11.0f, 22.0f, 10.0f));
            bubbleChartData2.f68584g = arrayList;
            this.f68722i = bubbleChartData2;
        } else {
            this.f68722i = bubbleChartData;
        }
        m34499d();
    }

    public void setOnValueTouchListener(BubbleChartOnValueSelectListener bubbleChartOnValueSelectListener) {
        if (bubbleChartOnValueSelectListener != null) {
            this.f68723j = bubbleChartOnValueSelectListener;
        }
    }
}
