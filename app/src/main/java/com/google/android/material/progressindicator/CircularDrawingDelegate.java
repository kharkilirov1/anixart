package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

/* loaded from: classes.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    public int f18507c;

    /* renamed from: d */
    public float f18508d;

    /* renamed from: e */
    public float f18509e;

    /* renamed from: f */
    public float f18510f;

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: a */
    public void mo10211a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange float f2) {
        float width = rect.width() / mo10215e();
        float height = rect.height() / mo10214d();
        S s = this.f18545a;
        float f3 = (((CircularProgressIndicatorSpec) s).f18523g / 2.0f) + ((CircularProgressIndicatorSpec) s).f18524h;
        canvas.translate((f3 * width) + rect.left, (f3 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        this.f18507c = ((CircularProgressIndicatorSpec) this.f18545a).f18525i == 0 ? 1 : -1;
        this.f18508d = ((CircularProgressIndicatorSpec) r8).f18501a * f2;
        this.f18509e = ((CircularProgressIndicatorSpec) r8).f18502b * f2;
        this.f18510f = (((CircularProgressIndicatorSpec) r8).f18523g - ((CircularProgressIndicatorSpec) r8).f18501a) / 2.0f;
        if ((this.f18546b.m10229f() && ((CircularProgressIndicatorSpec) this.f18545a).f18505e == 2) || (this.f18546b.m10228e() && ((CircularProgressIndicatorSpec) this.f18545a).f18506f == 1)) {
            this.f18510f = (((1.0f - f2) * ((CircularProgressIndicatorSpec) this.f18545a).f18501a) / 2.0f) + this.f18510f;
        } else if ((this.f18546b.m10229f() && ((CircularProgressIndicatorSpec) this.f18545a).f18505e == 1) || (this.f18546b.m10228e() && ((CircularProgressIndicatorSpec) this.f18545a).f18506f == 2)) {
            this.f18510f -= ((1.0f - f2) * ((CircularProgressIndicatorSpec) this.f18545a).f18501a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: b */
    public void mo10212b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange float f2, @FloatRange float f3, @ColorInt int i2) {
        if (f2 == f3) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i2);
        paint.setStrokeWidth(this.f18508d);
        float f4 = this.f18507c;
        float f5 = f2 * 360.0f * f4;
        float f6 = (f3 >= f2 ? f3 - f2 : (1.0f + f3) - f2) * 360.0f * f4;
        float f7 = this.f18510f;
        float f8 = -f7;
        canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint);
        if (this.f18509e <= 0.0f || Math.abs(f6) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m10216f(canvas, paint, this.f18508d, this.f18509e, f5);
        m10216f(canvas, paint, this.f18508d, this.f18509e, f5 + f6);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: c */
    public void mo10213c(@NonNull Canvas canvas, @NonNull Paint paint) {
        int m9968a = MaterialColors.m9968a(((CircularProgressIndicatorSpec) this.f18545a).f18504d, this.f18546b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(m9968a);
        paint.setStrokeWidth(this.f18508d);
        float f2 = this.f18510f;
        float f3 = -f2;
        canvas.drawArc(new RectF(f3, f3, f2, f2), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: d */
    public int mo10214d() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f18545a;
        return (circularProgressIndicatorSpec.f18524h * 2) + circularProgressIndicatorSpec.f18523g;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: e */
    public int mo10215e() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f18545a;
        return (circularProgressIndicatorSpec.f18524h * 2) + circularProgressIndicatorSpec.f18523g;
    }

    /* renamed from: f */
    public final void m10216f(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        canvas.save();
        canvas.rotate(f4);
        float f5 = this.f18510f;
        float f6 = f2 / 2.0f;
        canvas.drawRoundRect(new RectF(f5 - f6, f3, f5 + f6, -f3), f3, f3, paint);
        canvas.restore();
    }
}
