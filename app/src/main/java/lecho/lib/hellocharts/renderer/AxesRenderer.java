package lecho.lib.hellocharts.renderer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.Objects;
import lecho.lib.hellocharts.computator.ChartComputator;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.util.AxisAutoValues;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.Chart;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class AxesRenderer {

    /* renamed from: z */
    public static final char[] f68661z = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};

    /* renamed from: a */
    public Chart f68662a;

    /* renamed from: b */
    public ChartComputator f68663b;

    /* renamed from: c */
    public int f68664c;

    /* renamed from: d */
    public float f68665d;

    /* renamed from: e */
    public float f68666e;

    /* renamed from: f */
    public Paint[] f68667f = {new Paint(), new Paint(), new Paint(), new Paint()};

    /* renamed from: g */
    public Paint[] f68668g = {new Paint(), new Paint(), new Paint(), new Paint()};

    /* renamed from: h */
    public Paint[] f68669h = {new Paint(), new Paint(), new Paint(), new Paint()};

    /* renamed from: i */
    public float[] f68670i = new float[4];

    /* renamed from: j */
    public float[] f68671j = new float[4];

    /* renamed from: k */
    public float[] f68672k = new float[4];

    /* renamed from: l */
    public int[] f68673l = new int[4];

    /* renamed from: m */
    public int[] f68674m = new int[4];

    /* renamed from: n */
    public int[] f68675n = new int[4];

    /* renamed from: o */
    public int[] f68676o = new int[4];

    /* renamed from: p */
    public int[] f68677p = new int[4];

    /* renamed from: q */
    public int[] f68678q = new int[4];

    /* renamed from: r */
    public int[] f68679r = new int[4];

    /* renamed from: s */
    public Paint.FontMetricsInt[] f68680s = {new Paint.FontMetricsInt(), new Paint.FontMetricsInt(), new Paint.FontMetricsInt(), new Paint.FontMetricsInt()};

    /* renamed from: t */
    public char[] f68681t = new char[64];

    /* renamed from: u */
    public int[] f68682u = new int[4];

    /* renamed from: v */
    public float[][] f68683v = (float[][]) Array.newInstance((Class<?>) float.class, 4, 0);

    /* renamed from: w */
    public float[][] f68684w = (float[][]) Array.newInstance((Class<?>) float.class, 4, 0);

    /* renamed from: x */
    public AxisValue[][] f68685x = (AxisValue[][]) Array.newInstance((Class<?>) AxisValue.class, 4, 0);

    /* renamed from: y */
    public AxisAutoValues[] f68686y;

    public AxesRenderer(Context context, Chart chart) {
        this.f68686y = new AxisAutoValues[]{new AxisAutoValues(), new AxisAutoValues(), new AxisAutoValues(), new AxisAutoValues()};
        this.f68662a = chart;
        this.f68663b = chart.getChartComputator();
        this.f68665d = context.getResources().getDisplayMetrics().density;
        this.f68666e = context.getResources().getDisplayMetrics().scaledDensity;
        this.f68664c = ChartUtils.m34495b(this.f68665d, 2);
        for (int i2 = 0; i2 < 4; i2++) {
            this.f68667f[i2].setStyle(Paint.Style.FILL);
            this.f68667f[i2].setAntiAlias(true);
            this.f68668g[i2].setStyle(Paint.Style.FILL);
            this.f68668g[i2].setAntiAlias(true);
            this.f68669h[i2].setStyle(Paint.Style.STROKE);
            this.f68669h[i2].setAntiAlias(true);
        }
    }

    /* renamed from: a */
    public final boolean m34479a(Rect rect, float f2, boolean z, int i2, boolean z2) {
        if (!z) {
            return true;
        }
        if (!z2) {
            float f3 = this.f68673l[i2] / 2;
            return f2 >= ((float) rect.left) + f3 && f2 <= ((float) rect.right) - f3;
        }
        int[] iArr = this.f68674m;
        int i3 = iArr[3];
        int i4 = this.f68664c;
        return f2 <= ((float) rect.bottom) - ((float) (i3 + i4)) && f2 >= ((float) rect.top) + ((float) (iArr[0] + i4));
    }

    /* renamed from: b */
    public final void m34480b(Canvas canvas, Axis axis, int i2) {
        float f2;
        boolean m34483e = m34483e(i2);
        if (1 == i2 || 2 == i2) {
            f2 = this.f68671j[i2];
        } else {
            r1 = (i2 == 0 || 3 == i2) ? this.f68671j[i2] : 0.0f;
            f2 = 0.0f;
        }
        for (int i3 = 0; i3 < this.f68682u[i2]; i3++) {
            int mo34428b = axis.f68576b ? axis.f68579e.mo34428b(this.f68681t, this.f68684w[i2][i3], this.f68686y[i2].f68711c) : axis.f68579e.mo34427a(this.f68681t, this.f68685x[i2][i3]);
            if (m34483e) {
                r1 = this.f68683v[i2][i3];
            } else {
                f2 = this.f68683v[i2][i3];
            }
            char[] cArr = this.f68681t;
            canvas.drawText(cArr, cArr.length - mo34428b, mo34428b, f2, r1, this.f68667f[i2]);
        }
        Rect rect = this.f68663b.f68511e;
        Objects.requireNonNull(axis);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        if (!m34483e) {
            canvas.drawText(null, rect.centerX(), this.f68670i[i2], this.f68668g[i2]);
            return;
        }
        canvas.save();
        canvas.rotate(-90.0f, rect.centerY(), rect.centerY());
        canvas.drawText(null, rect.centerY(), this.f68670i[i2], this.f68668g[i2]);
        canvas.restore();
    }

    /* renamed from: c */
    public final void m34481c(Canvas canvas, Axis axis, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        Rect rect = this.f68663b.f68511e;
        m34483e(i2);
        if (1 == i2 || 2 == i2) {
            float f6 = this.f68672k[i2];
            float f7 = rect.bottom;
            f2 = rect.top;
            f3 = f6;
            f4 = f3;
            f5 = f7;
        } else if (i2 == 0 || 3 == i2) {
            float f8 = rect.left;
            f4 = rect.right;
            f3 = f8;
            f5 = this.f68672k[i2];
            f2 = f5;
        } else {
            f3 = 0.0f;
            f5 = 0.0f;
            f4 = 0.0f;
            f2 = 0.0f;
        }
        if (axis.f68580f) {
            canvas.drawLine(f3, f5, f4, f2, this.f68667f[i2]);
        }
    }

    /* renamed from: d */
    public final void m34482d(Axis axis, int i2) {
        if (axis == null) {
            return;
        }
        Objects.requireNonNull(axis);
        this.f68667f[i2].setColor(axis.f68577c);
        this.f68667f[i2].setTextSize(ChartUtils.m34496c(this.f68666e, 12));
        this.f68667f[i2].getFontMetricsInt(this.f68680s[i2]);
        this.f68668g[i2].setColor(axis.f68577c);
        this.f68668g[i2].setTextSize(ChartUtils.m34496c(this.f68666e, 12));
        this.f68669h[i2].setColor(axis.f68578d);
        this.f68674m[i2] = Math.abs(this.f68680s[i2].ascent);
        this.f68675n[i2] = Math.abs(this.f68680s[i2].descent);
        this.f68673l[i2] = (int) this.f68667f[i2].measureText(f68661z, 0, 3);
        this.f68668g[i2].setTextAlign(Paint.Align.CENTER);
        if (i2 == 0 || 3 == i2) {
            this.f68667f[i2].setTextAlign(Paint.Align.CENTER);
        } else if (1 == i2) {
            this.f68667f[i2].setTextAlign(Paint.Align.RIGHT);
        } else if (2 == i2) {
            this.f68667f[i2].setTextAlign(Paint.Align.LEFT);
        }
        if (1 == i2 || 2 == i2) {
            this.f68676o[i2] = this.f68673l[i2];
            this.f68677p[i2] = this.f68674m[i2];
        } else if (i2 == 0 || 3 == i2) {
            this.f68676o[i2] = this.f68674m[i2] + this.f68675n[i2];
            this.f68677p[i2] = this.f68673l[i2];
        }
        int i3 = ((axis.f68576b || !axis.f68575a.isEmpty()) ? this.f68664c + this.f68676o[i2] + 0 : 0) + (!TextUtils.isEmpty(null) ? this.f68674m[i2] + 0 + this.f68675n[i2] + this.f68664c : 0);
        if (1 == i2) {
            this.f68662a.getChartComputator().m34421g(i3, 0, 0, 0);
        } else if (2 == i2) {
            this.f68662a.getChartComputator().m34421g(0, 0, i3, 0);
        } else if (i2 == 0) {
            this.f68662a.getChartComputator().m34421g(0, i3, 0, 0);
        } else if (3 == i2) {
            this.f68662a.getChartComputator().m34421g(0, 0, 0, i3);
        }
        if (1 == i2) {
            float[] fArr = this.f68671j;
            int i4 = this.f68663b.f68511e.left;
            int i5 = this.f68664c;
            fArr[i2] = i4 - i5;
            this.f68670i[i2] = ((fArr[i2] - i5) - this.f68675n[i2]) - this.f68676o[i2];
            this.f68672k[i2] = r0.f68510d.left;
            return;
        }
        if (2 == i2) {
            float[] fArr2 = this.f68671j;
            int i6 = this.f68663b.f68511e.right;
            int i7 = this.f68664c;
            fArr2[i2] = i6 + i7;
            this.f68670i[i2] = fArr2[i2] + i7 + this.f68674m[i2] + this.f68676o[i2];
            this.f68672k[i2] = r0.f68510d.right;
            return;
        }
        if (3 == i2) {
            float[] fArr3 = this.f68671j;
            int i8 = this.f68663b.f68511e.bottom;
            int i9 = this.f68664c;
            fArr3[i2] = i8 + i9 + this.f68674m[i2];
            this.f68670i[i2] = fArr3[i2] + i9 + this.f68676o[i2];
            this.f68672k[i2] = r0.f68510d.bottom;
            return;
        }
        if (i2 != 0) {
            throw new IllegalArgumentException(C0000a.m7d("Invalid axis position: ", i2));
        }
        float[] fArr4 = this.f68671j;
        int i10 = this.f68663b.f68511e.top;
        int i11 = this.f68664c;
        fArr4[i2] = (i10 - i11) - this.f68675n[i2];
        this.f68670i[i2] = (fArr4[i2] - i11) - this.f68676o[i2];
        this.f68672k[i2] = r0.f68510d.top;
    }

    /* renamed from: e */
    public final boolean m34483e(int i2) {
        if (1 == i2 || 2 == i2) {
            return true;
        }
        if (i2 == 0 || 3 == i2) {
            return false;
        }
        throw new IllegalArgumentException(C0000a.m7d("Invalid axis position ", i2));
    }

    /* renamed from: f */
    public final void m34484f() {
        m34482d(this.f68662a.getChartData().mo34447c(), 0);
        m34482d(this.f68662a.getChartData().mo34451i(), 3);
        m34482d(this.f68662a.getChartData().mo34448e(), 1);
        m34482d(this.f68662a.getChartData().mo34445a(), 2);
    }

    /* renamed from: g */
    public final void m34485g(Axis axis, int i2) {
        float m34469g;
        float f2;
        float f3;
        float f4;
        float f5;
        int width;
        if (!axis.f68576b) {
            ChartComputator chartComputator = this.f68663b;
            Viewport viewport = chartComputator.f68514h;
            Viewport mo34420f = chartComputator.mo34420f();
            Rect rect = this.f68663b.f68510d;
            boolean m34483e = m34483e(i2);
            if (m34483e) {
                m34469g = (viewport.m34466c() <= 0.0f || mo34420f.m34466c() <= 0.0f) ? 1.0f : (viewport.m34466c() / mo34420f.m34466c()) * rect.height();
                f2 = mo34420f.f68646e;
                f3 = mo34420f.f68644c;
            } else {
                m34469g = (viewport.m34469g() <= 0.0f || mo34420f.m34469g() <= 0.0f) ? 1.0f : (viewport.m34469g() / mo34420f.m34469g()) * rect.width();
                f2 = mo34420f.f68643b;
                f3 = mo34420f.f68645d;
            }
            float f6 = f3;
            float f7 = f2;
            int max = (int) Math.max(1.0d, Math.ceil(((axis.f68575a.size() * this.f68677p[i2]) * 1.5d) / (m34469g != 0.0f ? m34469g : 1.0f)));
            if (this.f68683v[i2].length < axis.f68575a.size()) {
                this.f68683v[i2] = new float[axis.f68575a.size()];
            }
            if (this.f68685x[i2].length < axis.f68575a.size()) {
                this.f68685x[i2] = new AxisValue[axis.f68575a.size()];
            }
            int i3 = 0;
            int i4 = 0;
            for (AxisValue axisValue : axis.f68575a) {
                Objects.requireNonNull(axisValue);
                if (0.0f >= f7 && 0.0f <= f6) {
                    if (i4 % max == 0) {
                        float mo34417c = m34483e ? this.f68663b.mo34417c(0.0f) : this.f68663b.mo34416b(0.0f);
                        if (m34479a(rect, mo34417c, false, i2, m34483e)) {
                            this.f68683v[i2][i3] = mo34417c;
                            this.f68685x[i2][i3] = axisValue;
                            i3++;
                        }
                    }
                    i4++;
                }
            }
            this.f68682u[i2] = i3;
            return;
        }
        Viewport mo34420f2 = this.f68663b.mo34420f();
        Rect rect2 = this.f68663b.f68510d;
        boolean m34483e2 = m34483e(i2);
        if (m34483e2) {
            f4 = mo34420f2.f68646e;
            f5 = mo34420f2.f68644c;
            width = rect2.height();
        } else {
            f4 = mo34420f2.f68643b;
            f5 = mo34420f2.f68645d;
            width = rect2.width();
        }
        int i5 = (width / this.f68677p[i2]) / 2;
        AxisAutoValues axisAutoValues = this.f68686y[i2];
        double d = f5 - f4;
        if (i5 == 0 || d <= 0.0d) {
            axisAutoValues.f68709a = new float[0];
            axisAutoValues.f68710b = 0;
        } else {
            double round = Math.round(r11 * r4) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d / i5 < 0.0d ? -r11 : r11)))));
            double pow = Math.pow(10.0d, (int) Math.log10(round));
            if (((int) (round / pow)) > 5) {
                round = Math.floor(pow * 10.0d);
            }
            double ceil = Math.ceil(f4 / round) * round;
            double floor = Math.floor(f5 / round) * round;
            if (!Double.isNaN(floor) && floor != Double.POSITIVE_INFINITY) {
                double d2 = floor + 0.0d;
                floor = Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1 : -1));
            }
            int i6 = 0;
            for (double d3 = ceil; d3 <= floor; d3 += round) {
                i6++;
            }
            axisAutoValues.f68710b = i6;
            if (axisAutoValues.f68709a.length < i6) {
                axisAutoValues.f68709a = new float[i6];
            }
            for (int i7 = 0; i7 < i6; i7++) {
                axisAutoValues.f68709a[i7] = (float) ceil;
                ceil += round;
            }
            if (round < 1.0d) {
                axisAutoValues.f68711c = (int) Math.ceil(-Math.log10(round));
            } else {
                axisAutoValues.f68711c = 0;
            }
        }
        float[][] fArr = this.f68683v;
        int length = fArr[i2].length;
        AxisAutoValues[] axisAutoValuesArr = this.f68686y;
        if (length < axisAutoValuesArr[i2].f68710b) {
            fArr[i2] = new float[axisAutoValuesArr[i2].f68710b];
        }
        float[][] fArr2 = this.f68684w;
        if (fArr2[i2].length < axisAutoValuesArr[i2].f68710b) {
            fArr2[i2] = new float[axisAutoValuesArr[i2].f68710b];
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            AxisAutoValues[] axisAutoValuesArr2 = this.f68686y;
            if (i8 >= axisAutoValuesArr2[i2].f68710b) {
                this.f68682u[i2] = i9;
                return;
            }
            float mo34417c2 = m34483e2 ? this.f68663b.mo34417c(axisAutoValuesArr2[i2].f68709a[i8]) : this.f68663b.mo34416b(axisAutoValuesArr2[i2].f68709a[i8]);
            if (m34479a(rect2, mo34417c2, false, i2, m34483e2)) {
                this.f68683v[i2][i9] = mo34417c2;
                this.f68684w[i2][i9] = this.f68686y[i2].f68709a[i8];
                i9++;
            }
            i8++;
        }
    }
}
