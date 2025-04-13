package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapeData {

    /* renamed from: a */
    public final List<CubicCurveData> f7589a;

    /* renamed from: b */
    public PointF f7590b;

    /* renamed from: c */
    public boolean f7591c;

    public ShapeData(PointF pointF, boolean z, List<CubicCurveData> list) {
        this.f7590b = pointF;
        this.f7591c = z;
        this.f7589a = new ArrayList(list);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShapeData{numCurves=");
        m24u.append(this.f7589a.size());
        m24u.append("closed=");
        m24u.append(this.f7591c);
        m24u.append('}');
        return m24u.toString();
    }

    public ShapeData() {
        this.f7589a = new ArrayList();
    }
}
