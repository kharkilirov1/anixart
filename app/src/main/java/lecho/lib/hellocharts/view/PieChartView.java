package lecho.lib.hellocharts.view;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import lecho.lib.hellocharts.animation.PieChartRotationAnimator;
import lecho.lib.hellocharts.animation.PieChartRotationAnimatorV14;
import lecho.lib.hellocharts.gesture.ChartTouchHandler;
import lecho.lib.hellocharts.gesture.PieChartTouchHandler;
import lecho.lib.hellocharts.listener.DummyPieChartOnValueSelectListener;
import lecho.lib.hellocharts.listener.PieChartOnValueSelectListener;
import lecho.lib.hellocharts.model.ChartData;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.provider.PieChartDataProvider;
import lecho.lib.hellocharts.renderer.PieChartRenderer;

/* loaded from: classes3.dex */
public class PieChartView extends AbstractChartView implements PieChartDataProvider {

    /* renamed from: i */
    public PieChartData f68730i;

    /* renamed from: j */
    public PieChartOnValueSelectListener f68731j;

    /* renamed from: k */
    public PieChartRenderer f68732k;

    /* renamed from: l */
    public PieChartRotationAnimator f68733l;

    public PieChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f68731j = new DummyPieChartOnValueSelectListener();
        this.f68732k = new PieChartRenderer(context, this, this);
        this.f68717d = new PieChartTouchHandler(context, this);
        setChartRenderer(this.f68732k);
        this.f68733l = new PieChartRotationAnimatorV14(this);
        setPieChartData(PieChartData.m34458m());
    }

    @Override // lecho.lib.hellocharts.view.Chart
    /* renamed from: c */
    public void mo34500c() {
        SelectedValue mo34475i = this.f68718e.mo34475i();
        if (!mo34475i.m34461b()) {
            this.f68731j.mo34441g();
        } else {
            this.f68731j.mo34443b(mo34475i.f68624a, this.f68730i.f68619l.get(mo34475i.f68624a));
        }
    }

    /* renamed from: e */
    public void m34501e(int i2, boolean z) {
        if (z) {
            this.f68733l.mo34413a();
            this.f68733l.mo34414b(this.f68732k.f68697o, i2);
        } else {
            PieChartRenderer pieChartRenderer = this.f68732k;
            Objects.requireNonNull(pieChartRenderer);
            pieChartRenderer.f68697o = ((i2 % 360) + 360) % 360;
        }
        ViewCompat.m2183W(this);
    }

    @Override // lecho.lib.hellocharts.view.AbstractChartView, lecho.lib.hellocharts.view.Chart
    public ChartData getChartData() {
        return this.f68730i;
    }

    public int getChartRotation() {
        return this.f68732k.f68697o;
    }

    public float getCircleFillRatio() {
        return this.f68732k.f68705w;
    }

    public RectF getCircleOval() {
        return this.f68732k.f68701s;
    }

    public PieChartOnValueSelectListener getOnValueTouchListener() {
        return this.f68731j;
    }

    @Override // lecho.lib.hellocharts.provider.PieChartDataProvider
    public PieChartData getPieChartData() {
        return this.f68730i;
    }

    public void setChartRotationEnabled(boolean z) {
        ChartTouchHandler chartTouchHandler = this.f68717d;
        if (chartTouchHandler instanceof PieChartTouchHandler) {
            ((PieChartTouchHandler) chartTouchHandler).f68560s = z;
        }
    }

    public void setCircleFillRatio(float f2) {
        PieChartRenderer pieChartRenderer = this.f68732k;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        pieChartRenderer.f68705w = f2;
        pieChartRenderer.m34491o();
        ViewCompat.m2183W(this);
    }

    public void setCircleOval(RectF rectF) {
        this.f68732k.f68701s = rectF;
        ViewCompat.m2183W(this);
    }

    public void setOnValueTouchListener(PieChartOnValueSelectListener pieChartOnValueSelectListener) {
        if (pieChartOnValueSelectListener != null) {
            this.f68731j = pieChartOnValueSelectListener;
        }
    }

    public void setPieChartData(PieChartData pieChartData) {
        if (pieChartData == null) {
            this.f68730i = PieChartData.m34458m();
        } else {
            this.f68730i = pieChartData;
        }
        m34499d();
    }
}
