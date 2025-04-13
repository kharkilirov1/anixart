package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ColumnChartData extends AbstractChartData {

    /* renamed from: d */
    public float f68596d = 0.75f;

    /* renamed from: e */
    public List<Column> f68597e = new ArrayList();

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: d */
    public void mo34455d(float f2) {
        Iterator<Column> it = this.f68597e.iterator();
        while (it.hasNext()) {
            for (SubcolumnValue subcolumnValue : it.next().f68595b) {
                subcolumnValue.f68635a = (0.0f * f2) + subcolumnValue.f68636b;
            }
        }
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: g */
    public void mo34456g() {
        Iterator<Column> it = this.f68597e.iterator();
        while (it.hasNext()) {
            for (SubcolumnValue subcolumnValue : it.next().f68595b) {
                subcolumnValue.m34465a(subcolumnValue.f68636b + 0.0f);
            }
        }
    }
}
