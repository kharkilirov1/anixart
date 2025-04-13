package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class CubicCurveData {

    /* renamed from: a */
    public final PointF f7467a;

    /* renamed from: b */
    public final PointF f7468b;

    /* renamed from: c */
    public final PointF f7469c;

    public CubicCurveData() {
        this.f7467a = new PointF();
        this.f7468b = new PointF();
        this.f7469c = new PointF();
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f7467a = pointF;
        this.f7468b = pointF2;
        this.f7469c = pointF3;
    }
}
