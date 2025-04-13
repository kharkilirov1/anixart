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
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    public float f18552c;

    /* renamed from: d */
    public float f18553d;

    /* renamed from: e */
    public float f18554e;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f18552c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: a */
    public void mo10211a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange float f2) {
        this.f18552c = rect.width();
        float f3 = ((LinearProgressIndicatorSpec) this.f18545a).f18501a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f18545a).f18501a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.f18545a).f18579i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f18546b.m10229f() && ((LinearProgressIndicatorSpec) this.f18545a).f18505e == 1) || (this.f18546b.m10228e() && ((LinearProgressIndicatorSpec) this.f18545a).f18506f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f18546b.m10229f() || this.f18546b.m10228e()) {
            canvas.translate(0.0f, ((f2 - 1.0f) * ((LinearProgressIndicatorSpec) this.f18545a).f18501a) / 2.0f);
        }
        float f4 = this.f18552c;
        canvas.clipRect((-f4) / 2.0f, (-f3) / 2.0f, f4 / 2.0f, f3 / 2.0f);
        S s = this.f18545a;
        this.f18553d = ((LinearProgressIndicatorSpec) s).f18501a * f2;
        this.f18554e = ((LinearProgressIndicatorSpec) s).f18502b * f2;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: b */
    public void mo10212b(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange float f2, @FloatRange float f3, @ColorInt int i2) {
        if (f2 == f3) {
            return;
        }
        float f4 = this.f18552c;
        float f5 = (-f4) / 2.0f;
        float f6 = this.f18554e * 2.0f;
        float f7 = f4 - f6;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i2);
        float f8 = this.f18553d;
        RectF rectF = new RectF((f2 * f7) + f5, (-f8) / 2.0f, f6 + (f7 * f3) + f5, f8 / 2.0f);
        float f9 = this.f18554e;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: c */
    public void mo10213c(@NonNull Canvas canvas, @NonNull Paint paint) {
        int m9968a = MaterialColors.m9968a(((LinearProgressIndicatorSpec) this.f18545a).f18504d, this.f18546b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(m9968a);
        float f2 = this.f18552c;
        float f3 = this.f18553d;
        RectF rectF = new RectF((-f2) / 2.0f, (-f3) / 2.0f, f2 / 2.0f, f3 / 2.0f);
        float f4 = this.f18554e;
        canvas.drawRoundRect(rectF, f4, f4, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: d */
    public int mo10214d() {
        return ((LinearProgressIndicatorSpec) this.f18545a).f18501a;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: e */
    public int mo10215e() {
        return -1;
    }
}
