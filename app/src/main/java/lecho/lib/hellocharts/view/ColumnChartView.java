package lecho.lib.hellocharts.view;

import java.util.ArrayList;
import lecho.lib.hellocharts.listener.ColumnChartOnValueSelectListener;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.provider.ColumnChartDataProvider;

/* loaded from: classes3.dex */
public class ColumnChartView extends AbstractChartView implements ColumnChartDataProvider {

    /* renamed from: i */
    public ColumnChartData f68724i;

    /* renamed from: j */
    public ColumnChartOnValueSelectListener f68725j;

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: c */
    public void mo34500c() {
        SelectedValue mo34475i = this.f68718e.mo34475i();
        if (!mo34475i.m34461b()) {
            this.f68725j.mo34441g();
        } else {
            this.f68725j.mo34438f(mo34475i.f68624a, mo34475i.f68625b, this.f68724i.f68597e.get(mo34475i.f68624a).f68595b.get(mo34475i.f68625b));
        }
    }

    public ColumnChartData getColumnChartData() {
        return this.f68724i;
    }

    public ColumnChartOnValueSelectListener getOnValueTouchListener() {
        return this.f68725j;
    }

    public void setColumnChartData(ColumnChartData columnChartData) {
        if (columnChartData == null) {
            ColumnChartData columnChartData2 = new ColumnChartData();
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 1; i2 <= 4; i2++) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(new SubcolumnValue(i2));
                arrayList.add(new Column(arrayList2));
            }
            columnChartData2.f68597e = arrayList;
            this.f68724i = columnChartData2;
        } else {
            this.f68724i = columnChartData;
        }
        m34499d();
    }

    public void setOnValueTouchListener(ColumnChartOnValueSelectListener columnChartOnValueSelectListener) {
        if (columnChartOnValueSelectListener != null) {
            this.f68725j = columnChartOnValueSelectListener;
        }
    }

    @Override // lecho.lib.hellocharts.view.AbstractChartView, lecho.lib.hellocharts.view.Chart
    public ColumnChartData getChartData() {
        return this.f68724i;
    }
}
