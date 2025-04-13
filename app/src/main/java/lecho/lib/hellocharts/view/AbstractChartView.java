package lecho.lib.hellocharts.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import lecho.lib.hellocharts.animation.ChartAnimationListener;
import lecho.lib.hellocharts.animation.ChartDataAnimator;
import lecho.lib.hellocharts.animation.ChartDataAnimatorV14;
import lecho.lib.hellocharts.animation.ChartViewportAnimator;
import lecho.lib.hellocharts.animation.ChartViewportAnimatorV14;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.gesture.ChartTouchHandler;
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.listener.DummyVieportChangeListener;
import lecho.lib.hellocharts.listener.ViewportChangeListener;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.renderer.AxesRenderer;
import lecho.lib.hellocharts.renderer.ChartRenderer;
import lecho.lib.hellocharts.util.ChartUtils;

/* loaded from: classes3.dex */
public abstract class AbstractChartView extends View implements Chart {

    /* renamed from: b */
    public ChartComputator f68715b;

    /* renamed from: c */
    public AxesRenderer f68716c;

    /* renamed from: d */
    public ChartTouchHandler f68717d;

    /* renamed from: e */
    public ChartRenderer f68718e;

    /* renamed from: f */
    public ChartDataAnimator f68719f;

    /* renamed from: g */
    public ChartViewportAnimator f68720g;

    /* renamed from: h */
    public boolean f68721h;

    public AbstractChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: a */
    public void mo34497a(float f2) {
        getChartData().mo34455d(f2);
        this.f68718e.mo34487c();
        ViewCompat.m2183W(this);
    }

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: b */
    public void mo34498b() {
        getChartData().mo34456g();
        this.f68718e.mo34487c();
        ViewCompat.m2183W(this);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f68721h && this.f68717d.mo34432b()) {
            ViewCompat.m2183W(this);
        }
    }

    /* renamed from: d */
    public void m34499d() {
        ChartComputator chartComputator = this.f68715b;
        chartComputator.f68511e.set(chartComputator.f68512f);
        chartComputator.f68510d.set(chartComputator.f68512f);
        this.f68718e.mo34476l();
        this.f68716c.m34484f();
        ViewCompat.m2183W(this);
    }

    public AxesRenderer getAxesRenderer() {
        return this.f68716c;
    }

    @Override // lecho.lib.hellocharts.view.Chart
    public ChartComputator getChartComputator() {
        return this.f68715b;
    }

    @Override // lecho.lib.hellocharts.view.Chart
    public abstract /* synthetic */ ChartData getChartData();

    @Override // lecho.lib.hellocharts.view.Chart
    public ChartRenderer getChartRenderer() {
        return this.f68718e;
    }

    public Viewport getCurrentViewport() {
        return getChartRenderer().mo34473g();
    }

    public float getMaxZoom() {
        return this.f68715b.f68507a;
    }

    public Viewport getMaximumViewport() {
        return this.f68718e.mo34478n();
    }

    public SelectedValue getSelectedValue() {
        return this.f68718e.mo34475i();
    }

    public ChartTouchHandler getTouchHandler() {
        return this.f68717d;
    }

    public float getZoomLevel() {
        Viewport maximumViewport = getMaximumViewport();
        Viewport currentViewport = getCurrentViewport();
        return Math.max(maximumViewport.m34469g() / currentViewport.m34469g(), maximumViewport.m34466c() / currentViewport.m34466c());
    }

    public ZoomType getZoomType() {
        return this.f68717d.f68534d.f68551b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isEnabled()) {
            canvas.drawColor(ChartUtils.f68712a);
            return;
        }
        AxesRenderer axesRenderer = this.f68716c;
        Axis mo34448e = axesRenderer.f68662a.getChartData().mo34448e();
        if (mo34448e != null) {
            axesRenderer.m34485g(mo34448e, 1);
            axesRenderer.m34481c(canvas, mo34448e, 1);
        }
        Axis mo34445a = axesRenderer.f68662a.getChartData().mo34445a();
        if (mo34445a != null) {
            axesRenderer.m34485g(mo34445a, 2);
            axesRenderer.m34481c(canvas, mo34445a, 2);
        }
        Axis mo34451i = axesRenderer.f68662a.getChartData().mo34451i();
        if (mo34451i != null) {
            axesRenderer.m34485g(mo34451i, 3);
            axesRenderer.m34481c(canvas, mo34451i, 3);
        }
        Axis mo34447c = axesRenderer.f68662a.getChartData().mo34447c();
        if (mo34447c != null) {
            axesRenderer.m34485g(mo34447c, 0);
            axesRenderer.m34481c(canvas, mo34447c, 0);
        }
        int save = canvas.save();
        canvas.clipRect(this.f68715b.f68510d);
        this.f68718e.mo34489j(canvas);
        canvas.restoreToCount(save);
        this.f68718e.mo34488d(canvas);
        AxesRenderer axesRenderer2 = this.f68716c;
        Axis mo34448e2 = axesRenderer2.f68662a.getChartData().mo34448e();
        if (mo34448e2 != null) {
            axesRenderer2.m34480b(canvas, mo34448e2, 1);
        }
        Axis mo34445a2 = axesRenderer2.f68662a.getChartData().mo34445a();
        if (mo34445a2 != null) {
            axesRenderer2.m34480b(canvas, mo34445a2, 2);
        }
        Axis mo34451i2 = axesRenderer2.f68662a.getChartData().mo34451i();
        if (mo34451i2 != null) {
            axesRenderer2.m34480b(canvas, mo34451i2, 3);
        }
        Axis mo34447c2 = axesRenderer2.f68662a.getChartData().mo34447c();
        if (mo34447c2 != null) {
            axesRenderer2.m34480b(canvas, mo34447c2, 0);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        ChartComputator chartComputator = this.f68715b;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        chartComputator.f68508b = width;
        chartComputator.f68509c = height;
        chartComputator.f68512f.set(paddingLeft, paddingTop, width - paddingRight, height - paddingBottom);
        chartComputator.f68511e.set(chartComputator.f68512f);
        chartComputator.f68510d.set(chartComputator.f68512f);
        this.f68718e.mo34490k();
        this.f68716c.m34484f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!this.f68721h) {
            return false;
        }
        if (!this.f68717d.mo34433c(motionEvent)) {
            return true;
        }
        ViewCompat.m2183W(this);
        return true;
    }

    public void setChartRenderer(ChartRenderer chartRenderer) {
        this.f68718e = chartRenderer;
        chartRenderer.mo34470a();
        AxesRenderer axesRenderer = this.f68716c;
        axesRenderer.f68663b = axesRenderer.f68662a.getChartComputator();
        ChartTouchHandler chartTouchHandler = this.f68717d;
        chartTouchHandler.f68536f = chartTouchHandler.f68535e.getChartComputator();
        chartTouchHandler.f68537g = chartTouchHandler.f68535e.getChartRenderer();
        ViewCompat.m2183W(this);
    }

    @Override // lecho.lib.hellocharts.view.Chart
    public void setCurrentViewport(Viewport viewport) {
        if (viewport != null) {
            this.f68718e.setCurrentViewport(viewport);
        }
        ViewCompat.m2183W(this);
    }

    public void setCurrentViewportWithAnimation(Viewport viewport) {
        if (viewport != null) {
            this.f68720g.mo34410a();
            this.f68720g.mo34412c(getCurrentViewport(), viewport);
        }
        ViewCompat.m2183W(this);
    }

    public void setDataAnimationListener(ChartAnimationListener chartAnimationListener) {
        this.f68719f.mo34409b(chartAnimationListener);
    }

    public void setInteractive(boolean z) {
        this.f68721h = z;
    }

    public void setMaxZoom(float f2) {
        ChartComputator chartComputator = this.f68715b;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        chartComputator.f68507a = f2;
        chartComputator.m34415a();
        chartComputator.m34424j(chartComputator.f68513g);
        ViewCompat.m2183W(this);
    }

    public void setMaximumViewport(Viewport viewport) {
        this.f68718e.mo34471e(viewport);
        ViewCompat.m2183W(this);
    }

    public void setScrollEnabled(boolean z) {
        this.f68717d.f68539i = z;
    }

    public void setValueSelectionEnabled(boolean z) {
        this.f68717d.f68541k = z;
    }

    public void setValueTouchEnabled(boolean z) {
        this.f68717d.f68540j = z;
    }

    public void setViewportAnimationListener(ChartAnimationListener chartAnimationListener) {
        this.f68720g.mo34411b(chartAnimationListener);
    }

    public void setViewportCalculationEnabled(boolean z) {
        this.f68718e.mo34477m(z);
    }

    public void setViewportChangeListener(ViewportChangeListener viewportChangeListener) {
        ChartComputator chartComputator = this.f68715b;
        if (viewportChangeListener == null) {
            chartComputator.f68517k = new DummyVieportChangeListener();
        } else {
            chartComputator.f68517k = viewportChangeListener;
        }
    }

    public void setZoomEnabled(boolean z) {
        this.f68717d.f68538h = z;
    }

    public void setZoomType(ZoomType zoomType) {
        this.f68717d.f68534d.f68551b = zoomType;
    }

    public AbstractChartView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f68721h = true;
        this.f68715b = new ChartComputator();
        this.f68717d = new ChartTouchHandler(context, this);
        this.f68716c = new AxesRenderer(context, this);
        this.f68720g = new ChartViewportAnimatorV14(this);
        this.f68719f = new ChartDataAnimatorV14(this);
    }
}
