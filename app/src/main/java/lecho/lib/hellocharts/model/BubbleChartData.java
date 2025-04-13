package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.formatter.BubbleChartValueFormatter;
import lecho.lib.hellocharts.formatter.SimpleBubbleChartValueFormatter;

/* loaded from: classes3.dex */
public class BubbleChartData extends AbstractChartData {

    /* renamed from: d */
    public BubbleChartValueFormatter f68581d = new SimpleBubbleChartValueFormatter();

    /* renamed from: e */
    public int f68582e = 6;

    /* renamed from: f */
    public float f68583f = 1.0f;

    /* renamed from: g */
    public List<BubbleValue> f68584g = new ArrayList();

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: d */
    public void mo34455d(float f2) {
        for (BubbleValue bubbleValue : this.f68584g) {
            float f3 = 0.0f * f2;
            bubbleValue.f68585a = bubbleValue.f68588d + f3;
            bubbleValue.f68586b = bubbleValue.f68589e + f3;
            bubbleValue.f68587c = bubbleValue.f68590f + f3;
        }
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: g */
    public void mo34456g() {
        for (BubbleValue bubbleValue : this.f68584g) {
            bubbleValue.m34457a(bubbleValue.f68588d + 0.0f, bubbleValue.f68589e + 0.0f, bubbleValue.f68590f + 0.0f);
        }
    }
}
