package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class LineChartData extends AbstractChartData {

    /* renamed from: d */
    public List<Line> f68610d = new ArrayList();

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: d */
    public void mo34455d(float f2) {
        Iterator<Line> it = this.f68610d.iterator();
        while (it.hasNext()) {
            for (PointValue pointValue : it.next().f68609j) {
                float f3 = 0.0f * f2;
                pointValue.f68620a = pointValue.f68622c + f3;
                pointValue.f68621b = pointValue.f68623d + f3;
            }
        }
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: g */
    public void mo34456g() {
        Iterator<Line> it = this.f68610d.iterator();
        while (it.hasNext()) {
            for (PointValue pointValue : it.next().f68609j) {
                pointValue.m34459a(pointValue.f68622c + 0.0f, pointValue.f68623d + 0.0f);
            }
        }
    }
}
