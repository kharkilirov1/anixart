package lecho.lib.hellocharts.gesture;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewParent;
import androidx.core.widget.ScrollerCompat;
import java.util.Objects;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.gesture.ChartScroller;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.renderer.ChartRenderer;
import lecho.lib.hellocharts.view.Chart;

/* loaded from: classes3.dex */
public class ChartTouchHandler {

    /* renamed from: a */
    public GestureDetector f68531a;

    /* renamed from: b */
    public ScaleGestureDetector f68532b;

    /* renamed from: c */
    public ChartScroller f68533c;

    /* renamed from: d */
    public ChartZoomer f68534d;

    /* renamed from: e */
    public Chart f68535e;

    /* renamed from: f */
    public ChartComputator f68536f;

    /* renamed from: g */
    public ChartRenderer f68537g;

    /* renamed from: h */
    public boolean f68538h = true;

    /* renamed from: i */
    public boolean f68539i = true;

    /* renamed from: j */
    public boolean f68540j = true;

    /* renamed from: k */
    public boolean f68541k = false;

    /* renamed from: l */
    public SelectedValue f68542l = new SelectedValue();

    /* renamed from: m */
    public SelectedValue f68543m = new SelectedValue();

    /* renamed from: n */
    public SelectedValue f68544n = new SelectedValue();

    /* renamed from: o */
    public ViewParent f68545o;

    /* renamed from: p */
    public ContainerScrollType f68546p;

    public class ChartGestureListener extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public ChartScroller.ScrollResult f68547b = new ChartScroller.ScrollResult();

        public ChartGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            ChartTouchHandler chartTouchHandler = ChartTouchHandler.this;
            if (!chartTouchHandler.f68538h) {
                return false;
            }
            ChartZoomer chartZoomer = chartTouchHandler.f68534d;
            ChartComputator chartComputator = chartTouchHandler.f68536f;
            chartZoomer.f68550a.f68568c = true;
            chartZoomer.f68554e.m34468f(chartComputator.f68513g);
            if (!chartComputator.m34423i(motionEvent.getX(), motionEvent.getY(), chartZoomer.f68552c)) {
                return false;
            }
            ZoomerCompat zoomerCompat = chartZoomer.f68550a;
            Objects.requireNonNull(zoomerCompat);
            zoomerCompat.f68570e = SystemClock.elapsedRealtime();
            zoomerCompat.f68571f = 0.25f;
            zoomerCompat.f68568c = false;
            zoomerCompat.f68569d = 1.0f;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            ChartTouchHandler chartTouchHandler = ChartTouchHandler.this;
            if (!chartTouchHandler.f68539i) {
                return false;
            }
            ViewParent viewParent = chartTouchHandler.f68545o;
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
            ChartTouchHandler chartTouchHandler2 = ChartTouchHandler.this;
            ChartScroller chartScroller = chartTouchHandler2.f68533c;
            ChartComputator chartComputator = chartTouchHandler2.f68536f;
            chartScroller.f68528c.f3852a.abortAnimation();
            chartScroller.f68526a.m34468f(chartComputator.f68513g);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            ChartTouchHandler chartTouchHandler = ChartTouchHandler.this;
            if (!chartTouchHandler.f68539i) {
                return false;
            }
            ChartScroller chartScroller = chartTouchHandler.f68533c;
            int i2 = (int) (-f2);
            int i3 = (int) (-f3);
            ChartComputator chartComputator = chartTouchHandler.f68536f;
            chartComputator.m34418d(chartScroller.f68527b);
            chartScroller.f68526a.m34468f(chartComputator.f68513g);
            float f4 = chartScroller.f68527b.x;
            float f5 = chartScroller.f68526a.f68643b;
            Viewport viewport = chartComputator.f68514h;
            int m34469g = (int) (((f5 - viewport.f68643b) * f4) / viewport.m34469g());
            float f6 = chartScroller.f68527b.y;
            Viewport viewport2 = chartComputator.f68514h;
            int m34466c = (int) (((viewport2.f68644c - chartScroller.f68526a.f68644c) * f6) / viewport2.m34466c());
            chartScroller.f68528c.f3852a.abortAnimation();
            int width = chartComputator.f68510d.width();
            int height = chartComputator.f68510d.height();
            ScrollerCompat scrollerCompat = chartScroller.f68528c;
            Point point = chartScroller.f68527b;
            scrollerCompat.m2638a(m34469g, m34466c, i2, i3, 0, (point.x - width) + 1, 0, (point.y - height) + 1);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            ChartTouchHandler chartTouchHandler = ChartTouchHandler.this;
            if (!chartTouchHandler.f68539i) {
                return false;
            }
            ChartScroller chartScroller = chartTouchHandler.f68533c;
            ChartComputator chartComputator = chartTouchHandler.f68536f;
            ChartScroller.ScrollResult scrollResult = this.f68547b;
            Objects.requireNonNull(chartScroller);
            Viewport viewport = chartComputator.f68514h;
            Viewport mo34420f = chartComputator.mo34420f();
            Viewport viewport2 = chartComputator.f68513g;
            Rect rect = chartComputator.f68510d;
            boolean z = true;
            boolean z2 = viewport2.f68643b > viewport.f68643b;
            boolean z3 = viewport2.f68645d < viewport.f68645d;
            boolean z4 = viewport2.f68644c < viewport.f68644c;
            boolean z5 = viewport2.f68646e > viewport.f68646e;
            boolean z6 = (z2 && f2 <= 0.0f) || (z3 && f2 >= 0.0f);
            boolean z7 = (z4 && f3 <= 0.0f) || (z5 && f3 >= 0.0f);
            if (z6 || z7) {
                chartComputator.m34418d(chartScroller.f68527b);
                chartComputator.m34426l(viewport2.f68643b + ((mo34420f.m34469g() * f2) / rect.width()), viewport2.f68644c + ((mo34420f.m34466c() * (-f3)) / rect.height()));
            }
            scrollResult.f68529a = z6;
            scrollResult.f68530b = z7;
            if (!z6 && !z7) {
                z = false;
            }
            ChartTouchHandler chartTouchHandler2 = ChartTouchHandler.this;
            ChartScroller.ScrollResult scrollResult2 = this.f68547b;
            if (chartTouchHandler2.f68545o != null) {
                if (ContainerScrollType.HORIZONTAL == chartTouchHandler2.f68546p && !scrollResult2.f68529a && !chartTouchHandler2.f68532b.isInProgress()) {
                    chartTouchHandler2.f68545o.requestDisallowInterceptTouchEvent(false);
                } else if (ContainerScrollType.VERTICAL == chartTouchHandler2.f68546p && !scrollResult2.f68530b && !chartTouchHandler2.f68532b.isInProgress()) {
                    chartTouchHandler2.f68545o.requestDisallowInterceptTouchEvent(false);
                }
            }
            return z;
        }
    }

    public class ChartScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ChartScaleGestureListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!ChartTouchHandler.this.f68538h) {
                return false;
            }
            float scaleFactor = 2.0f - scaleGestureDetector.getScaleFactor();
            if (Float.isInfinite(scaleFactor)) {
                scaleFactor = 1.0f;
            }
            ChartTouchHandler chartTouchHandler = ChartTouchHandler.this;
            return chartTouchHandler.f68534d.m34434a(chartTouchHandler.f68536f, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleFactor);
        }
    }

    public ChartTouchHandler(Context context, Chart chart) {
        this.f68535e = chart;
        this.f68536f = chart.getChartComputator();
        this.f68537g = chart.getChartRenderer();
        this.f68531a = new GestureDetector(context, new ChartGestureListener());
        this.f68532b = new ScaleGestureDetector(context, new ChartScaleGestureListener());
        this.f68533c = new ChartScroller(context);
        this.f68534d = new ChartZoomer(context, ZoomType.HORIZONTAL_AND_VERTICAL);
    }

    /* renamed from: a */
    public final boolean m34431a(float f2, float f3) {
        this.f68544n.m34463d(this.f68543m);
        this.f68543m.m34460a();
        if (this.f68537g.mo34486b(f2, f3)) {
            this.f68543m.m34463d(this.f68537g.mo34475i());
        }
        if (this.f68544n.m34461b() && this.f68543m.m34461b() && !this.f68544n.equals(this.f68543m)) {
            return false;
        }
        return this.f68537g.mo34474h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo34432b() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lecho.lib.hellocharts.gesture.ChartTouchHandler.mo34432b():boolean");
    }

    /* renamed from: c */
    public boolean mo34433c(MotionEvent motionEvent) {
        boolean z;
        ViewParent viewParent;
        boolean z2 = this.f68532b.onTouchEvent(motionEvent) || this.f68531a.onTouchEvent(motionEvent);
        if (this.f68538h && this.f68532b.isInProgress() && (viewParent = this.f68545o) != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
        }
        if (!this.f68540j) {
            return z2;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean mo34474h = this.f68537g.mo34474h();
            if (mo34474h != m34431a(motionEvent.getX(), motionEvent.getY())) {
                if (this.f68541k) {
                    this.f68542l.m34460a();
                    if (mo34474h && !this.f68537g.mo34474h()) {
                        this.f68535e.mo34500c();
                    }
                }
                z = true;
            }
            z = false;
        } else if (action == 1) {
            if (this.f68537g.mo34474h()) {
                if (!m34431a(motionEvent.getX(), motionEvent.getY())) {
                    this.f68537g.mo34472f();
                } else if (!this.f68541k) {
                    this.f68535e.mo34500c();
                    this.f68537g.mo34472f();
                } else if (!this.f68542l.equals(this.f68543m)) {
                    this.f68542l.m34463d(this.f68543m);
                    this.f68535e.mo34500c();
                }
                z = true;
            }
            z = false;
        } else if (action != 2) {
            if (action == 3 && this.f68537g.mo34474h()) {
                this.f68537g.mo34472f();
                z = true;
            }
            z = false;
        } else {
            if (this.f68537g.mo34474h() && !m34431a(motionEvent.getX(), motionEvent.getY())) {
                this.f68537g.mo34472f();
                z = true;
            }
            z = false;
        }
        return z || z2;
    }
}
