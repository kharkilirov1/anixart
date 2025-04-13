package lecho.lib.hellocharts.computator;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import lecho.lib.hellocharts.listener.DummyVieportChangeListener;
import lecho.lib.hellocharts.listener.ViewportChangeListener;
import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public class ChartComputator {

    /* renamed from: b */
    public int f68508b;

    /* renamed from: c */
    public int f68509c;

    /* renamed from: i */
    public float f68515i;

    /* renamed from: j */
    public float f68516j;

    /* renamed from: a */
    public float f68507a = 20.0f;

    /* renamed from: d */
    public Rect f68510d = new Rect();

    /* renamed from: e */
    public Rect f68511e = new Rect();

    /* renamed from: f */
    public Rect f68512f = new Rect();

    /* renamed from: g */
    public Viewport f68513g = new Viewport();

    /* renamed from: h */
    public Viewport f68514h = new Viewport();

    /* renamed from: k */
    public ViewportChangeListener f68517k = new DummyVieportChangeListener();

    /* renamed from: a */
    public final void m34415a() {
        this.f68515i = this.f68514h.m34469g() / this.f68507a;
        this.f68516j = this.f68514h.m34466c() / this.f68507a;
    }

    /* renamed from: b */
    public float mo34416b(float f2) {
        return this.f68510d.left + ((this.f68510d.width() / this.f68513g.m34469g()) * (f2 - this.f68513g.f68643b));
    }

    /* renamed from: c */
    public float mo34417c(float f2) {
        return this.f68510d.bottom - ((this.f68510d.height() / this.f68513g.m34466c()) * (f2 - this.f68513g.f68646e));
    }

    /* renamed from: d */
    public void m34418d(Point point) {
        point.set((int) ((this.f68514h.m34469g() * this.f68510d.width()) / this.f68513g.m34469g()), (int) ((this.f68514h.m34466c() * this.f68510d.height()) / this.f68513g.m34466c()));
    }

    /* renamed from: e */
    public void mo34419e(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = this.f68515i;
        if (f6 < f7) {
            f4 = f2 + f7;
            Viewport viewport = this.f68514h;
            float f8 = viewport.f68643b;
            if (f2 < f8) {
                f4 = f8 + f7;
                f2 = f8;
            } else {
                float f9 = viewport.f68645d;
                if (f4 > f9) {
                    f2 = f9 - f7;
                    f4 = f9;
                }
            }
        }
        float f10 = f3 - f5;
        float f11 = this.f68516j;
        if (f10 < f11) {
            f5 = f3 - f11;
            Viewport viewport2 = this.f68514h;
            float f12 = viewport2.f68644c;
            if (f3 > f12) {
                f5 = f12 - f11;
                f3 = f12;
            } else {
                float f13 = viewport2.f68646e;
                if (f5 < f13) {
                    f3 = f13 + f11;
                    f5 = f13;
                }
            }
        }
        this.f68513g.f68643b = Math.max(this.f68514h.f68643b, f2);
        this.f68513g.f68644c = Math.min(this.f68514h.f68644c, f3);
        this.f68513g.f68645d = Math.min(this.f68514h.f68645d, f4);
        this.f68513g.f68646e = Math.max(this.f68514h.f68646e, f5);
        this.f68517k.mo34444a(this.f68513g);
    }

    /* renamed from: f */
    public Viewport mo34420f() {
        return this.f68513g;
    }

    /* renamed from: g */
    public void m34421g(int i2, int i3, int i4, int i5) {
        Rect rect = this.f68511e;
        rect.left += i2;
        rect.top += i3;
        rect.right -= i4;
        rect.bottom -= i5;
        m34422h(i2, i3, i4, i5);
    }

    /* renamed from: h */
    public void m34422h(int i2, int i3, int i4, int i5) {
        Rect rect = this.f68510d;
        rect.left += i2;
        rect.top += i3;
        rect.right -= i4;
        rect.bottom -= i5;
    }

    /* renamed from: i */
    public boolean m34423i(float f2, float f3, PointF pointF) {
        if (!this.f68510d.contains((int) f2, (int) f3)) {
            return false;
        }
        Viewport viewport = this.f68513g;
        float m34469g = ((viewport.m34469g() * (f2 - this.f68510d.left)) / this.f68510d.width()) + viewport.f68643b;
        Viewport viewport2 = this.f68513g;
        pointF.set(m34469g, ((viewport2.m34466c() * (f3 - this.f68510d.bottom)) / (-this.f68510d.height())) + viewport2.f68646e);
        return true;
    }

    /* renamed from: j */
    public void m34424j(Viewport viewport) {
        mo34419e(viewport.f68643b, viewport.f68644c, viewport.f68645d, viewport.f68646e);
    }

    /* renamed from: k */
    public void m34425k(Viewport viewport) {
        float f2 = viewport.f68643b;
        float f3 = viewport.f68644c;
        float f4 = viewport.f68645d;
        float f5 = viewport.f68646e;
        Viewport viewport2 = this.f68514h;
        viewport2.f68643b = f2;
        viewport2.f68644c = f3;
        viewport2.f68645d = f4;
        viewport2.f68646e = f5;
        m34415a();
    }

    /* renamed from: l */
    public void m34426l(float f2, float f3) {
        float m34469g = this.f68513g.m34469g();
        float m34466c = this.f68513g.m34466c();
        Viewport viewport = this.f68514h;
        float max = Math.max(viewport.f68643b, Math.min(f2, viewport.f68645d - m34469g));
        Viewport viewport2 = this.f68514h;
        float max2 = Math.max(viewport2.f68646e + m34466c, Math.min(f3, viewport2.f68644c));
        mo34419e(max, max2, m34469g + max, max2 - m34466c);
    }
}
