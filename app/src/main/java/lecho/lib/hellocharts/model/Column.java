package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;
import lecho.lib.hellocharts.formatter.ColumnChartValueFormatter;
import lecho.lib.hellocharts.formatter.SimpleColumnChartValueFormatter;

/* loaded from: classes3.dex */
public class Column {

    /* renamed from: a */
    public ColumnChartValueFormatter f68594a;

    /* renamed from: b */
    public List<SubcolumnValue> f68595b;

    public Column() {
        this.f68594a = new SimpleColumnChartValueFormatter();
        this.f68595b = new ArrayList();
    }

    public Column(List<SubcolumnValue> list) {
        this.f68594a = new SimpleColumnChartValueFormatter();
        this.f68595b = new ArrayList();
        this.f68595b = list;
    }
}
