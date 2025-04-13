package lecho.lib.hellocharts.renderer;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public class BubbleChartRenderer extends AbstractChartRenderer {

    /* renamed from: o */
    public boolean f68687o;

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: b */
    public boolean mo34486b(float f2, float f3) {
        this.f68656j.m34460a();
        throw null;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: c */
    public void mo34487c() {
        if (this.f68653g) {
            throw null;
        }
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: d */
    public void mo34488d(Canvas canvas) {
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: j */
    public void mo34489j(Canvas canvas) {
        throw null;
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: k */
    public void mo34490k() {
        Rect rect = this.f68647a.getChartComputator().f68510d;
        if (rect.width() < rect.height()) {
            this.f68687o = true;
        } else {
            this.f68687o = false;
        }
    }

    @Override // lecho.lib.hellocharts.renderer.AbstractChartRenderer, lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: l */
    public void mo34476l() {
        super.mo34476l();
        throw null;
    }
}
