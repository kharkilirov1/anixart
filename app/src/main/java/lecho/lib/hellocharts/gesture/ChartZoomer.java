package lecho.lib.hellocharts.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public class ChartZoomer {

    /* renamed from: b */
    public ZoomType f68551b;

    /* renamed from: c */
    public PointF f68552c = new PointF();

    /* renamed from: d */
    public PointF f68553d = new PointF();

    /* renamed from: e */
    public Viewport f68554e = new Viewport();

    /* renamed from: a */
    public ZoomerCompat f68550a = new ZoomerCompat();

    public ChartZoomer(Context context, ZoomType zoomType) {
        this.f68551b = zoomType;
    }

    /* renamed from: a */
    public boolean m34434a(ChartComputator chartComputator, float f2, float f3, float f4) {
        float m34469g = chartComputator.f68513g.m34469g() * f4;
        float m34466c = chartComputator.f68513g.m34466c() * f4;
        if (!chartComputator.m34423i(f2, f3, this.f68553d)) {
            return false;
        }
        float f5 = this.f68553d.x;
        Rect rect = chartComputator.f68510d;
        float width = f5 - ((m34469g / rect.width()) * (f2 - rect.left));
        float f6 = this.f68553d.y;
        Rect rect2 = chartComputator.f68510d;
        float height = ((m34466c / rect2.height()) * (f3 - rect2.top)) + f6;
        m34435b(chartComputator, width, height, width + m34469g, height - m34466c);
        return true;
    }

    /* renamed from: b */
    public final void m34435b(ChartComputator chartComputator, float f2, float f3, float f4, float f5) {
        Viewport viewport = chartComputator.f68513g;
        ZoomType zoomType = ZoomType.HORIZONTAL_AND_VERTICAL;
        ZoomType zoomType2 = this.f68551b;
        if (zoomType == zoomType2) {
            chartComputator.mo34419e(f2, f3, f4, f5);
        } else if (ZoomType.HORIZONTAL == zoomType2) {
            chartComputator.mo34419e(f2, viewport.f68644c, f4, viewport.f68646e);
        } else if (ZoomType.VERTICAL == zoomType2) {
            chartComputator.mo34419e(viewport.f68643b, f3, viewport.f68645d, f5);
        }
    }
}
