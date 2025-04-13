package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.sf */
/* loaded from: classes3.dex */
public final class C5745sf extends View {

    /* renamed from: a */
    @NonNull
    private final C6084yo f54660a;

    /* renamed from: b */
    @NonNull
    private Paint f54661b;

    /* renamed from: c */
    @NonNull
    private Paint f54662c;

    /* renamed from: d */
    @NonNull
    private Paint f54663d;

    /* renamed from: e */
    private float f54664e;

    /* renamed from: f */
    private float f54665f;

    /* renamed from: g */
    private float f54666g;

    /* renamed from: h */
    private float f54667h;

    public C5745sf(@NonNull Context context, @NonNull C6084yo c6084yo) {
        super(context);
        this.f54660a = c6084yo;
        m28241a(context);
    }

    /* renamed from: a */
    private void m28241a(@NonNull Context context) {
        this.f54664e = 40.0f;
        Objects.requireNonNull(this.f54660a);
        this.f54665f = Math.round(TypedValue.applyDimension(1, 34.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f54660a);
        this.f54666g = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f54660a);
        this.f54667h = Math.round(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        this.f54661b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f54662c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f54662c.setStrokeWidth(this.f54666g);
        this.f54662c.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f54663d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f54663d.setTextSize(this.f54667h);
        this.f54663d.setTextAlign(Paint.Align.CENTER);
        this.f54662c.setColor(tg1.m28650a(-65536, this.f54664e));
        this.f54661b.setColor(tg1.m28650a(-1, this.f54664e));
        this.f54663d.setColor(tg1.m28650a(-65536, this.f54664e));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f2 = this.f54665f / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.f54661b);
        canvas.drawCircle(f2, f2, f2 - (this.f54666g / 2.0f), this.f54662c);
        float f3 = this.f54665f / 2.0f;
        canvas.drawText("!", f3, f3 - ((this.f54663d.ascent() + this.f54663d.descent()) / 2.0f), this.f54663d);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4 = (int) this.f54665f;
        setMeasuredDimension(i4, i4);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        float f2 = z ? 0.0f : 40.0f;
        this.f54664e = f2;
        this.f54662c.setColor(tg1.m28650a(-65536, f2));
        this.f54661b.setColor(tg1.m28650a(-1, this.f54664e));
        this.f54663d.setColor(tg1.m28650a(-65536, this.f54664e));
        invalidate();
    }
}
