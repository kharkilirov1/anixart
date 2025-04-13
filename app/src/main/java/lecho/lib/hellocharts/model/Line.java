package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.formatter.LineChartValueFormatter;
import lecho.lib.hellocharts.formatter.SimpleLineChartValueFormatter;
import lecho.lib.hellocharts.util.ChartUtils;

/* loaded from: classes3.dex */
public class Line {

    /* renamed from: a */
    public int f68600a;

    /* renamed from: b */
    public int f68601b;

    /* renamed from: c */
    public int f68602c;

    /* renamed from: d */
    public int f68603d;

    /* renamed from: e */
    public int f68604e;

    /* renamed from: f */
    public boolean f68605f;

    /* renamed from: g */
    public boolean f68606g;

    /* renamed from: h */
    public ValueShape f68607h;

    /* renamed from: i */
    public LineChartValueFormatter f68608i;

    /* renamed from: j */
    public List<PointValue> f68609j;

    public Line() {
        this.f68600a = ChartUtils.f68712a;
        this.f68601b = ChartUtils.f68713b;
        this.f68602c = 64;
        this.f68603d = 3;
        this.f68604e = 6;
        this.f68605f = true;
        this.f68606g = true;
        this.f68607h = ValueShape.CIRCLE;
        this.f68608i = new SimpleLineChartValueFormatter();
        this.f68609j = new ArrayList();
    }

    public Line(List<PointValue> list) {
        this.f68600a = ChartUtils.f68712a;
        this.f68601b = ChartUtils.f68713b;
        this.f68602c = 64;
        this.f68603d = 3;
        this.f68604e = 6;
        this.f68605f = true;
        this.f68606g = true;
        this.f68607h = ValueShape.CIRCLE;
        this.f68608i = new SimpleLineChartValueFormatter();
        this.f68609j = new ArrayList();
        this.f68609j = list;
    }
}
