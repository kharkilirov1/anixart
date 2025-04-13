package lecho.lib.hellocharts.renderer;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.Chart;

/* loaded from: classes3.dex */
public abstract class AbstractChartRenderer implements ChartRenderer {

    /* renamed from: a */
    public Chart f68647a;

    /* renamed from: b */
    public ChartComputator f68648b;

    /* renamed from: h */
    public float f68654h;

    /* renamed from: i */
    public float f68655i;

    /* renamed from: l */
    public int f68658l;

    /* renamed from: m */
    public boolean f68659m;

    /* renamed from: n */
    public boolean f68660n;

    /* renamed from: c */
    public Paint f68649c = new Paint();

    /* renamed from: d */
    public Paint f68650d = new Paint();

    /* renamed from: e */
    public RectF f68651e = new RectF();

    /* renamed from: f */
    public Paint.FontMetricsInt f68652f = new Paint.FontMetricsInt();

    /* renamed from: g */
    public boolean f68653g = true;

    /* renamed from: j */
    public SelectedValue f68656j = new SelectedValue();

    /* renamed from: k */
    public char[] f68657k = new char[64];

    public AbstractChartRenderer(Context context, Chart chart) {
        this.f68654h = context.getResources().getDisplayMetrics().density;
        this.f68655i = context.getResources().getDisplayMetrics().scaledDensity;
        this.f68647a = chart;
        this.f68648b = chart.getChartComputator();
        this.f68658l = ChartUtils.m34495b(this.f68654h, 4);
        this.f68649c.setAntiAlias(true);
        this.f68649c.setStyle(Paint.Style.FILL);
        this.f68649c.setTextAlign(Paint.Align.LEFT);
        this.f68649c.setTypeface(Typeface.defaultFromStyle(1));
        this.f68649c.setColor(-1);
        this.f68650d.setAntiAlias(true);
        this.f68650d.setStyle(Paint.Style.FILL);
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: a */
    public void mo34470a() {
        this.f68648b = this.f68647a.getChartComputator();
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: e */
    public void mo34471e(Viewport viewport) {
        if (viewport != null) {
            this.f68648b.m34425k(viewport);
        }
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: f */
    public void mo34472f() {
        this.f68656j.m34460a();
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: g */
    public Viewport mo34473g() {
        return this.f68648b.f68513g;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: h */
    public boolean mo34474h() {
        return this.f68656j.m34461b();
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: i */
    public SelectedValue mo34475i() {
        return this.f68656j;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: l */
    public void mo34476l() {
        ChartData chartData = this.f68647a.getChartData();
        Typeface mo34450h = this.f68647a.getChartData().mo34450h();
        if (mo34450h != null) {
            this.f68649c.setTypeface(mo34450h);
        }
        this.f68649c.setColor(chartData.mo34449f());
        this.f68649c.setTextSize(ChartUtils.m34496c(this.f68655i, chartData.mo34452j()));
        this.f68649c.getFontMetricsInt(this.f68652f);
        this.f68659m = chartData.mo34453k();
        this.f68660n = chartData.mo34446b();
        this.f68650d.setColor(chartData.mo34454l());
        this.f68656j.m34460a();
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: m */
    public void mo34477m(boolean z) {
        this.f68653g = z;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: n */
    public Viewport mo34478n() {
        return this.f68648b.f68514h;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    public void setCurrentViewport(Viewport viewport) {
        if (viewport != null) {
            this.f68648b.m34424j(viewport);
        }
    }
}
