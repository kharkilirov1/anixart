package lecho.lib.hellocharts.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.formatter.PieChartValueFormatter;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.provider.PieChartDataProvider;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.Chart;

/* loaded from: classes3.dex */
public class PieChartRenderer extends AbstractChartRenderer {

    /* renamed from: A */
    public Paint f68688A;

    /* renamed from: B */
    public Paint.FontMetricsInt f68689B;

    /* renamed from: C */
    public Paint f68690C;

    /* renamed from: D */
    public Paint.FontMetricsInt f68691D;

    /* renamed from: E */
    public Paint f68692E;

    /* renamed from: F */
    public PieChartValueFormatter f68693F;

    /* renamed from: G */
    public Viewport f68694G;

    /* renamed from: H */
    public Bitmap f68695H;

    /* renamed from: I */
    public Canvas f68696I;

    /* renamed from: o */
    public int f68697o;

    /* renamed from: p */
    public PieChartDataProvider f68698p;

    /* renamed from: q */
    public Paint f68699q;

    /* renamed from: r */
    public float f68700r;

    /* renamed from: s */
    public RectF f68701s;

    /* renamed from: t */
    public RectF f68702t;

    /* renamed from: u */
    public PointF f68703u;

    /* renamed from: v */
    public int f68704v;

    /* renamed from: w */
    public float f68705w;

    /* renamed from: x */
    public boolean f68706x;

    /* renamed from: y */
    public float f68707y;

    /* renamed from: z */
    public Paint f68708z;

    public PieChartRenderer(Context context, Chart chart, PieChartDataProvider pieChartDataProvider) {
        super(context, chart);
        this.f68697o = 45;
        this.f68699q = new Paint();
        this.f68701s = new RectF();
        this.f68702t = new RectF();
        this.f68703u = new PointF();
        this.f68705w = 1.0f;
        this.f68708z = new Paint();
        this.f68688A = new Paint();
        this.f68689B = new Paint.FontMetricsInt();
        this.f68690C = new Paint();
        this.f68691D = new Paint.FontMetricsInt();
        this.f68692E = new Paint();
        this.f68694G = new Viewport();
        this.f68696I = new Canvas();
        this.f68698p = pieChartDataProvider;
        this.f68704v = ChartUtils.m34495b(this.f68654h, 8);
        this.f68699q.setAntiAlias(true);
        this.f68699q.setStyle(Paint.Style.FILL);
        this.f68708z.setAntiAlias(true);
        this.f68708z.setStyle(Paint.Style.FILL);
        this.f68708z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f68688A.setAntiAlias(true);
        this.f68688A.setTextAlign(Paint.Align.CENTER);
        this.f68690C.setAntiAlias(true);
        this.f68690C.setTextAlign(Paint.Align.CENTER);
        this.f68692E.setAntiAlias(true);
        this.f68692E.setStyle(Paint.Style.STROKE);
        this.f68692E.setStrokeCap(Paint.Cap.ROUND);
        this.f68692E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f68692E.setColor(0);
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: b */
    public boolean mo34486b(float f2, float f3) {
        this.f68656j.m34460a();
        PieChartData pieChartData = this.f68698p.getPieChartData();
        float centerX = this.f68701s.centerX();
        float centerY = this.f68701s.centerY();
        float width = this.f68701s.width() / 2.0f;
        float f4 = f2 - centerX;
        float f5 = f3 - centerY;
        this.f68703u.set(f4, f5);
        int i2 = 0;
        if (this.f68703u.length() > this.f68704v + width) {
            return false;
        }
        if (pieChartData.f68616i && this.f68703u.length() < width * pieChartData.f68613f) {
            return false;
        }
        float degrees = (((((((float) Math.toDegrees(Math.atan2(-f4, f5))) + 360.0f) % 360.0f) + 90.0f) - this.f68697o) + 360.0f) % 360.0f;
        float f6 = 360.0f / this.f68700r;
        float f7 = 0.0f;
        Iterator<SliceValue> it = pieChartData.f68619l.iterator();
        while (it.hasNext()) {
            float abs = Math.abs(it.next().f68631a) * f6;
            if (degrees >= f7) {
                this.f68656j.m34462c(i2, i2, SelectedValue.SelectedValueType.NONE);
            }
            f7 += abs;
            i2++;
        }
        return mo34474h();
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: c */
    public void mo34487c() {
        if (this.f68653g) {
            this.f68694G.m34467d(0.0f, 100.0f, 100.0f, 0.0f);
            this.f68700r = 0.0f;
            for (SliceValue sliceValue : this.f68698p.getPieChartData().f68619l) {
                this.f68700r = Math.abs(sliceValue.f68631a) + this.f68700r;
            }
            this.f68648b.m34425k(this.f68694G);
            ChartComputator chartComputator = this.f68648b;
            chartComputator.m34424j(chartComputator.f68514h);
        }
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: d */
    public void mo34488d(Canvas canvas) {
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: j */
    public void mo34489j(Canvas canvas) {
        Canvas canvas2;
        int m34495b;
        int i2 = 0;
        if (this.f68695H != null) {
            canvas2 = this.f68696I;
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        } else {
            canvas2 = canvas;
        }
        PieChartData pieChartData = this.f68698p.getPieChartData();
        float f2 = 360.0f / this.f68700r;
        float f3 = this.f68697o;
        float f4 = f3;
        for (SliceValue sliceValue : pieChartData.f68619l) {
            float abs = Math.abs(sliceValue.f68631a) * f2;
            if (mo34474h() && this.f68656j.f68624a == i2) {
                m34492p(canvas2, sliceValue, f4, abs, 1);
            } else {
                m34492p(canvas2, sliceValue, f4, abs, 0);
            }
            f4 += abs;
            i2++;
        }
        PieChartData pieChartData2 = this.f68698p.getPieChartData();
        if (pieChartData2.f68619l.size() >= 2 && (m34495b = ChartUtils.m34495b(this.f68654h, pieChartData2.f68614g)) >= 1) {
            float f5 = 360.0f / this.f68700r;
            float f6 = this.f68697o;
            float width = this.f68701s.width() / 2.0f;
            this.f68692E.setStrokeWidth(m34495b);
            Iterator<SliceValue> it = pieChartData2.f68619l.iterator();
            float f7 = f6;
            while (it.hasNext()) {
                float abs2 = Math.abs(it.next().f68631a) * f5;
                double d = f7;
                this.f68703u.set((float) Math.cos(Math.toRadians(d)), (float) Math.sin(Math.toRadians(d)));
                m34493q(this.f68703u);
                canvas2.drawLine(this.f68701s.centerX(), this.f68701s.centerY(), this.f68701s.centerX() + ((this.f68704v + width) * this.f68703u.x), this.f68701s.centerY() + ((this.f68704v + width) * this.f68703u.y), this.f68692E);
                f7 += abs2;
            }
        }
        if (this.f68706x) {
            float width2 = (this.f68701s.width() / 2.0f) * this.f68698p.getPieChartData().f68613f;
            float centerX = this.f68701s.centerX();
            float centerY = this.f68701s.centerY();
            canvas2.drawCircle(centerX, centerY, width2, this.f68708z);
            if (!TextUtils.isEmpty(null)) {
                int abs3 = Math.abs(this.f68689B.ascent);
                if (TextUtils.isEmpty(null)) {
                    canvas2.drawText(null, centerX, centerY + (abs3 / 4), this.f68688A);
                } else {
                    int abs4 = Math.abs(this.f68691D.ascent);
                    canvas2.drawText(null, centerX, centerY - (abs3 * 0.2f), this.f68688A);
                    canvas2.drawText(null, centerX, centerY + abs4, this.f68690C);
                }
            }
        }
        Iterator<SliceValue> it2 = this.f68698p.getPieChartData().f68619l.iterator();
        while (it2.hasNext()) {
            Math.abs(it2.next().f68631a);
            mo34474h();
        }
        Bitmap bitmap = this.f68695H;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: k */
    public void mo34490k() {
        int i2;
        m34491o();
        ChartComputator chartComputator = this.f68648b;
        int i3 = chartComputator.f68508b;
        if (i3 <= 0 || (i2 = chartComputator.f68509c) <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        this.f68695H = createBitmap;
        this.f68696I.setBitmap(createBitmap);
    }

    @Override // lecho.lib.hellocharts.renderer.AbstractChartRenderer, lecho.lib.hellocharts.renderer.ChartRenderer
    /* renamed from: l */
    public void mo34476l() {
        super.mo34476l();
        PieChartData pieChartData = this.f68698p.getPieChartData();
        Objects.requireNonNull(pieChartData);
        this.f68693F = pieChartData.f68615h;
        this.f68706x = pieChartData.f68616i;
        this.f68707y = pieChartData.f68613f;
        this.f68708z.setColor(0);
        this.f68688A.setTextSize(ChartUtils.m34496c(this.f68655i, pieChartData.f68611d));
        this.f68688A.setColor(pieChartData.f68617j);
        this.f68688A.getFontMetricsInt(this.f68689B);
        this.f68690C.setTextSize(ChartUtils.m34496c(this.f68655i, pieChartData.f68612e));
        this.f68690C.setColor(pieChartData.f68618k);
        this.f68690C.getFontMetricsInt(this.f68691D);
        mo34487c();
    }

    /* renamed from: o */
    public final void m34491o() {
        Rect rect = this.f68648b.f68510d;
        float min = Math.min(rect.width() / 2.0f, rect.height() / 2.0f);
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        int i2 = this.f68704v;
        this.f68701s.set((centerX - min) + i2, (centerY - min) + i2, (centerX + min) - i2, (centerY + min) - i2);
        float width = (1.0f - this.f68705w) * this.f68701s.width() * 0.5f;
        this.f68701s.inset(width, width);
    }

    /* renamed from: p */
    public final void m34492p(Canvas canvas, SliceValue sliceValue, float f2, float f3, int i2) {
        double d = (f3 / 2.0f) + f2;
        this.f68703u.set((float) Math.cos(Math.toRadians(d)), (float) Math.sin(Math.toRadians(d)));
        m34493q(this.f68703u);
        this.f68702t.set(this.f68701s);
        if (1 != i2) {
            this.f68699q.setColor(sliceValue.f68633c);
            canvas.drawArc(this.f68702t, f2, f3, true, this.f68699q);
            return;
        }
        RectF rectF = this.f68702t;
        float f4 = -this.f68704v;
        rectF.inset(f4, f4);
        this.f68699q.setColor(sliceValue.f68634d);
        canvas.drawArc(this.f68702t, f2, f3, true, this.f68699q);
    }

    /* renamed from: q */
    public final void m34493q(PointF pointF) {
        float length = pointF.length();
        pointF.set(pointF.x / length, pointF.y / length);
    }
}
