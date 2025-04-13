package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* loaded from: classes.dex */
public class PathKeyframe extends Keyframe<PointF> {

    /* renamed from: o */
    @Nullable
    public Path f7428o;

    /* renamed from: p */
    public final Keyframe<PointF> f7429p;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.f7854b, keyframe.f7855c, keyframe.f7856d, keyframe.f7857e, keyframe.f7858f);
        this.f7429p = keyframe;
        m4721e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m4721e() {
        T t;
        T t2 = this.f7855c;
        boolean z = (t2 == 0 || (t = this.f7854b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f7855c;
        if (t3 == 0 || z) {
            return;
        }
        PointF pointF = (PointF) this.f7854b;
        PointF pointF2 = (PointF) t3;
        Keyframe<PointF> keyframe = this.f7429p;
        PointF pointF3 = keyframe.f7865m;
        PointF pointF4 = keyframe.f7866n;
        PathMeasure pathMeasure = Utils.f7847a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF3.x + pointF.x;
            float f3 = pointF.y + pointF3.y;
            float f4 = pointF2.x;
            float f5 = f4 + pointF4.x;
            float f6 = pointF2.y;
            path.cubicTo(f2, f3, f5, f6 + pointF4.y, f4, f6);
        }
        this.f7428o = path;
    }
}
