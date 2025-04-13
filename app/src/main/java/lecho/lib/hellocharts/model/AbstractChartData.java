package lecho.lib.hellocharts.model;

import android.graphics.Typeface;
import lecho.lib.hellocharts.util.ChartUtils;

/* loaded from: classes3.dex */
public abstract class AbstractChartData implements ChartData {

    /* renamed from: a */
    public Axis f68572a;

    /* renamed from: b */
    public Axis f68573b;

    /* renamed from: c */
    public int f68574c = ChartUtils.m34494a(ChartUtils.f68713b);

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: a */
    public Axis mo34445a() {
        return null;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: b */
    public boolean mo34446b() {
        return true;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: c */
    public Axis mo34447c() {
        return null;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: e */
    public Axis mo34448e() {
        return this.f68573b;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: f */
    public int mo34449f() {
        return -1;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: h */
    public Typeface mo34450h() {
        return null;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: i */
    public Axis mo34451i() {
        return this.f68572a;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: j */
    public int mo34452j() {
        return 12;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: k */
    public boolean mo34453k() {
        return true;
    }

    @Override // lecho.lib.hellocharts.model.ChartData
    /* renamed from: l */
    public int mo34454l() {
        return this.f68574c;
    }
}
