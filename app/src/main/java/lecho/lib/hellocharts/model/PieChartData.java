package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.formatter.PieChartValueFormatter;
import lecho.lib.hellocharts.formatter.SimplePieChartValueFormatter;

/* loaded from: classes3.dex */
public class PieChartData extends AbstractChartData {

    /* renamed from: d */
    public int f68611d;

    /* renamed from: e */
    public int f68612e;

    /* renamed from: f */
    public float f68613f;

    /* renamed from: g */
    public int f68614g;

    /* renamed from: h */
    public PieChartValueFormatter f68615h;

    /* renamed from: i */
    public boolean f68616i;

    /* renamed from: j */
    public int f68617j;

    /* renamed from: k */
    public int f68618k;

    /* renamed from: l */
    public List<SliceValue> f68619l;

    public PieChartData() {
        this.f68611d = 42;
        this.f68612e = 16;
        this.f68613f = 0.6f;
        this.f68614g = 2;
        this.f68615h = new SimplePieChartValueFormatter();
        this.f68616i = false;
        this.f68617j = -16777216;
        this.f68618k = -16777216;
        this.f68619l = new ArrayList();
        this.f68572a = null;
        this.f68573b = null;
    }

    /* renamed from: m */
    public static PieChartData m34458m() {
        PieChartData pieChartData = new PieChartData();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new SliceValue(40.0f));
        arrayList.add(new SliceValue(20.0f));
        arrayList.add(new SliceValue(30.0f));
        arrayList.add(new SliceValue(50.0f));
        pieChartData.f68619l = arrayList;
        return pieChartData;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: d */
    public void mo34455d(float f2) {
        for (SliceValue sliceValue : this.f68619l) {
            sliceValue.f68631a = (0.0f * f2) + sliceValue.f68632b;
        }
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: g */
    public void mo34456g() {
        for (SliceValue sliceValue : this.f68619l) {
            sliceValue.m34464a(sliceValue.f68632b + 0.0f);
        }
    }

    public PieChartData(List<SliceValue> list) {
        this.f68611d = 42;
        this.f68612e = 16;
        this.f68613f = 0.6f;
        this.f68614g = 2;
        this.f68615h = new SimplePieChartValueFormatter();
        this.f68616i = false;
        this.f68617j = -16777216;
        this.f68618k = -16777216;
        this.f68619l = new ArrayList();
        this.f68619l = list;
        this.f68572a = null;
        this.f68573b = null;
    }
}
