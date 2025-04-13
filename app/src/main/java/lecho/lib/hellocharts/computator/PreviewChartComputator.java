package lecho.lib.hellocharts.computator;

import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public class PreviewChartComputator extends ChartComputator {
    @Override // lecho.lib.hellocharts.computator.ChartComputator
    /* renamed from: b */
    public float mo34416b(float f2) {
        return this.f68510d.left + ((this.f68510d.width() / this.f68514h.m34469g()) * (f2 - this.f68514h.f68643b));
    }

    @Override // lecho.lib.hellocharts.computator.ChartComputator
    /* renamed from: c */
    public float mo34417c(float f2) {
        return this.f68510d.bottom - ((this.f68510d.height() / this.f68514h.m34466c()) * (f2 - this.f68514h.f68646e));
    }

    @Override // lecho.lib.hellocharts.computator.ChartComputator
    /* renamed from: e */
    public void mo34419e(float f2, float f3, float f4, float f5) {
        super.mo34419e(f2, f3, f4, f5);
        this.f68517k.mo34444a(this.f68513g);
    }

    @Override // lecho.lib.hellocharts.computator.ChartComputator
    /* renamed from: f */
    public Viewport mo34420f() {
        return this.f68514h;
    }
}
