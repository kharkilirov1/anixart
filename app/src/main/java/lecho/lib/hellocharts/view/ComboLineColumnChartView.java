package lecho.lib.hellocharts.view;

import lecho.lib.hellocharts.listener.ComboLineColumnChartOnValueSelectListener;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.ComboLineColumnChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.provider.ColumnChartDataProvider;
import lecho.lib.hellocharts.provider.ComboLineColumnChartDataProvider;
import lecho.lib.hellocharts.provider.LineChartDataProvider;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class ComboLineColumnChartView extends AbstractChartView implements ComboLineColumnChartDataProvider {

    /* renamed from: i */
    public ComboLineColumnChartData f68726i;

    /* renamed from: j */
    public ComboLineColumnChartOnValueSelectListener f68727j;

    public class ComboColumnChartDataProvider implements ColumnChartDataProvider {
    }

    public class ComboLineChartDataProvider implements LineChartDataProvider {
    }

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: c */
    public void mo34500c() {
        SelectedValue mo34475i = this.f68718e.mo34475i();
        if (!mo34475i.m34461b()) {
            this.f68727j.mo34441g();
            return;
        }
        if (SelectedValue.SelectedValueType.COLUMN.equals(mo34475i.f68626c)) {
            this.f68727j.mo34440d(mo34475i.f68624a, mo34475i.f68625b, this.f68726i.f68598d.f68597e.get(mo34475i.f68624a).f68595b.get(mo34475i.f68625b));
        } else if (SelectedValue.SelectedValueType.LINE.equals(mo34475i.f68626c)) {
            this.f68727j.mo34439c(mo34475i.f68624a, mo34475i.f68625b, this.f68726i.f68599e.f68610d.get(mo34475i.f68624a).f68609j.get(mo34475i.f68625b));
        } else {
            StringBuilder m24u = C0000a.m24u("Invalid selected value type ");
            m24u.append(mo34475i.f68626c.name());
            throw new IllegalArgumentException(m24u.toString());
        }
    }

    @Override // lecho.lib.hellocharts.view.AbstractChartView, lecho.lib.hellocharts.view.Chart
    public ChartData getChartData() {
        return this.f68726i;
    }

    public ComboLineColumnChartData getComboLineColumnChartData() {
        return this.f68726i;
    }

    public ComboLineColumnChartOnValueSelectListener getOnValueTouchListener() {
        return this.f68727j;
    }

    public void setComboLineColumnChartData(ComboLineColumnChartData comboLineColumnChartData) {
        if (comboLineColumnChartData == null) {
            this.f68726i = null;
        } else {
            this.f68726i = comboLineColumnChartData;
        }
        m34499d();
    }

    public void setOnValueTouchListener(ComboLineColumnChartOnValueSelectListener comboLineColumnChartOnValueSelectListener) {
        if (comboLineColumnChartOnValueSelectListener != null) {
            this.f68727j = comboLineColumnChartOnValueSelectListener;
        }
    }
}
