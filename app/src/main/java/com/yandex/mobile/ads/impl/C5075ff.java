package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;
import java.util.Objects;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.ff */
/* loaded from: classes3.dex */
public final class C5075ff extends FrameLayout {

    /* renamed from: a */
    @NonNull
    private final C6084yo f50234a;

    /* renamed from: b */
    @NonNull
    private final Paint f50235b;

    /* renamed from: c */
    @NonNull
    private final C5089fr f50236c;

    /* renamed from: d */
    private int f50237d;

    public C5075ff(@NonNull Context context, @NonNull C6084yo c6084yo) {
        super(context);
        this.f50234a = c6084yo;
        this.f50235b = new Paint();
        this.f50236c = new C5089fr();
        m24570a(context);
    }

    /* renamed from: a */
    private void m24570a(@NonNull Context context) {
        Objects.requireNonNull(this.f50234a);
        int round = Math.round(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f50234a);
        this.f50237d = Math.round(TypedValue.applyDimension(1, 0.5f, context.getResources().getDisplayMetrics()));
        this.f50235b.setStyle(Paint.Style.STROKE);
        this.f50235b.setStrokeWidth(round);
        this.f50235b.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f2 = this.f50237d;
        canvas.drawRect(f2, f2, getWidth() - this.f50237d, getHeight() - this.f50237d, this.f50235b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        ga0.C5115a mo22622a = this.f50236c.mo22622a(i2, i3);
        super.onMeasure(mo22622a.f50538a, mo22622a.f50539b);
    }

    public void setColor(int i2) {
        if (this.f50235b.getColor() != i2) {
            this.f50235b.setColor(i2);
            requestLayout();
        }
    }
}
