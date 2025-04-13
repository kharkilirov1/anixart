package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.g5 */
/* loaded from: classes3.dex */
final class C5104g5 extends View {

    /* renamed from: a */
    @NonNull
    private final C6128zl f50501a;

    /* renamed from: b */
    public Paint f50502b;

    /* renamed from: c */
    public Paint f50503c;

    /* renamed from: d */
    public Paint f50504d;

    /* renamed from: e */
    public int f50505e;

    /* renamed from: f */
    public int f50506f;

    /* renamed from: g */
    public int f50507g;

    /* renamed from: h */
    public float f50508h;

    public C5104g5(Context context) {
        super(context);
        int i2 = C4956d5.f49570a;
        this.f50505e = i2;
        this.f50506f = i2;
        this.f50507g = -1;
        this.f50508h = -1.0f;
        this.f50501a = new C6128zl(context);
        this.f50506f = i2;
        m24805a(i2);
        m24804a();
    }

    /* renamed from: a */
    private void m24805a(int i2) {
        int m28650a = tg1.m28650a(i2, 20.0f);
        this.f50505e = m28650a;
        float[] fArr = new float[3];
        Color.colorToHSV(m28650a, fArr);
        if (!(fArr[2] < 0.5f)) {
            this.f50507g = -16777216;
        } else if (this.f50501a.m30210a()) {
            this.f50507g = -7829368;
        } else {
            this.f50507g = -1;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f50501a.m30210a()) {
            this.f50507g = -7829368;
        } else {
            this.f50507g = -1;
        }
        this.f50502b.setColor(this.f50505e);
        this.f50503c.setColor(this.f50507g);
        this.f50504d.setColor(this.f50507g);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float min = Math.min(getWidth(), getHeight());
        float f2 = min / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.f50502b);
        float f3 = min / 5.0f;
        float f4 = f2 - f3;
        float f5 = f3 + f2;
        canvas.drawLine(f4, f4, f5, f5, this.f50503c);
        canvas.drawLine(f4, f5, f5, f4, this.f50503c);
        float f6 = this.f50508h;
        if (f6 > 0.0f) {
            this.f50504d.setStrokeWidth(f6);
            canvas.drawCircle(f2, f2, f2 - this.f50508h, this.f50504d);
        }
    }

    @Override // android.view.View
    @SuppressLint
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m24805a(C4904c5.f49087a);
            this.f50502b.setColor(this.f50505e);
            this.f50503c.setColor(this.f50507g);
            this.f50504d.setColor(this.f50507g);
            invalidate();
        } else if (1 == motionEvent.getAction()) {
            m24805a(this.f50506f);
            this.f50502b.setColor(this.f50505e);
            this.f50503c.setColor(this.f50507g);
            this.f50504d.setColor(this.f50507g);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f50506f = i2;
        m24805a(i2);
        this.f50502b.setColor(this.f50505e);
        this.f50503c.setColor(this.f50507g);
        this.f50504d.setColor(this.f50507g);
        invalidate();
    }

    /* renamed from: a */
    private void m24804a() {
        Paint paint = new Paint(0);
        this.f50502b = paint;
        paint.setAntiAlias(true);
        this.f50502b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(0);
        this.f50503c = paint2;
        paint2.setAntiAlias(true);
        this.f50503c.setStrokeWidth(2.0f);
        this.f50503c.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(0);
        this.f50504d = paint3;
        paint3.setAntiAlias(true);
        this.f50504d.setStyle(Paint.Style.STROKE);
        this.f50502b.setColor(this.f50505e);
        this.f50503c.setColor(this.f50507g);
        this.f50504d.setColor(this.f50507g);
    }
}
