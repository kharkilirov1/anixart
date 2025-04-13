package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* renamed from: i */
    public final ShapeData f7436i;

    /* renamed from: j */
    public final Path f7437j;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.f7436i = new ShapeData();
        this.f7437j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Path mo4708f(Keyframe<ShapeData> keyframe, float f2) {
        ShapeData shapeData = keyframe.f7854b;
        ShapeData shapeData2 = keyframe.f7855c;
        ShapeData shapeData3 = this.f7436i;
        if (shapeData3.f7590b == null) {
            shapeData3.f7590b = new PointF();
        }
        shapeData3.f7591c = shapeData.f7591c || shapeData2.f7591c;
        if (shapeData.f7589a.size() != shapeData2.f7589a.size()) {
            StringBuilder m24u = C0000a.m24u("Curves must have the same number of control points. Shape 1: ");
            m24u.append(shapeData.f7589a.size());
            m24u.append("\tShape 2: ");
            m24u.append(shapeData2.f7589a.size());
            Logger.m4833a(m24u.toString());
        }
        int min = Math.min(shapeData.f7589a.size(), shapeData2.f7589a.size());
        if (shapeData3.f7589a.size() < min) {
            for (int size = shapeData3.f7589a.size(); size < min; size++) {
                shapeData3.f7589a.add(new CubicCurveData());
            }
        } else if (shapeData3.f7589a.size() > min) {
            for (int size2 = shapeData3.f7589a.size() - 1; size2 >= min; size2--) {
                shapeData3.f7589a.remove(r5.size() - 1);
            }
        }
        PointF pointF = shapeData.f7590b;
        PointF pointF2 = shapeData2.f7590b;
        float m4848e = MiscUtils.m4848e(pointF.x, pointF2.x, f2);
        float m4848e2 = MiscUtils.m4848e(pointF.y, pointF2.y, f2);
        if (shapeData3.f7590b == null) {
            shapeData3.f7590b = new PointF();
        }
        shapeData3.f7590b.set(m4848e, m4848e2);
        for (int size3 = shapeData3.f7589a.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.f7589a.get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.f7589a.get(size3);
            PointF pointF3 = cubicCurveData.f7467a;
            PointF pointF4 = cubicCurveData.f7468b;
            PointF pointF5 = cubicCurveData.f7469c;
            PointF pointF6 = cubicCurveData2.f7467a;
            PointF pointF7 = cubicCurveData2.f7468b;
            PointF pointF8 = cubicCurveData2.f7469c;
            shapeData3.f7589a.get(size3).f7467a.set(MiscUtils.m4848e(pointF3.x, pointF6.x, f2), MiscUtils.m4848e(pointF3.y, pointF6.y, f2));
            shapeData3.f7589a.get(size3).f7468b.set(MiscUtils.m4848e(pointF4.x, pointF7.x, f2), MiscUtils.m4848e(pointF4.y, pointF7.y, f2));
            shapeData3.f7589a.get(size3).f7469c.set(MiscUtils.m4848e(pointF5.x, pointF8.x, f2), MiscUtils.m4848e(pointF5.y, pointF8.y, f2));
        }
        ShapeData shapeData4 = this.f7436i;
        Path path = this.f7437j;
        path.reset();
        PointF pointF9 = shapeData4.f7590b;
        path.moveTo(pointF9.x, pointF9.y);
        MiscUtils.f7846a.set(pointF9.x, pointF9.y);
        for (int i2 = 0; i2 < shapeData4.f7589a.size(); i2++) {
            CubicCurveData cubicCurveData3 = shapeData4.f7589a.get(i2);
            PointF pointF10 = cubicCurveData3.f7467a;
            PointF pointF11 = cubicCurveData3.f7468b;
            PointF pointF12 = cubicCurveData3.f7469c;
            if (pointF10.equals(MiscUtils.f7846a) && pointF11.equals(pointF12)) {
                path.lineTo(pointF12.x, pointF12.y);
            } else {
                path.cubicTo(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y);
            }
            MiscUtils.f7846a.set(pointF12.x, pointF12.y);
        }
        if (shapeData4.f7591c) {
            path.close();
        }
        return this.f7437j;
    }
}
