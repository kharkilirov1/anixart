package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dl */
/* loaded from: classes3.dex */
public final class C4975dl {

    /* renamed from: a */
    @NonNull
    private final View f49669a;

    /* renamed from: b */
    @NonNull
    private final RectF f49670b;

    /* renamed from: c */
    @NonNull
    private final Path f49671c;

    /* renamed from: d */
    @Nullable
    private final float[] f49672d;

    public C4975dl(@NonNull View view, float f2) {
        this(view, f2, f2, f2, f2);
    }

    /* renamed from: a */
    private static float[] m23902a(float f2, float f3, float f4, float f5) {
        if (f2 > 0.0f || f3 > 0.0f || f4 > 0.0f || f5 > 0.0f) {
            return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        }
        return null;
    }

    /* renamed from: a */
    public final void m23904a(@NonNull Canvas canvas) {
        if (this.f49672d == null || this.f49671c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f49671c);
    }

    public C4975dl(@NonNull View view, float f2, float f3, float f4, float f5) {
        this.f49669a = view;
        this.f49670b = new RectF();
        this.f49671c = new Path();
        this.f49672d = m23902a(f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void m23903a() {
        if (this.f49672d != null) {
            int measuredWidth = this.f49669a.getMeasuredWidth();
            int measuredHeight = this.f49669a.getMeasuredHeight();
            int paddingLeft = this.f49669a.getPaddingLeft();
            int paddingTop = this.f49669a.getPaddingTop();
            int paddingRight = measuredWidth - this.f49669a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f49669a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f49670b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f49671c.reset();
            this.f49671c.addRoundRect(this.f49670b, this.f49672d, Path.Direction.CW);
        }
    }
}
