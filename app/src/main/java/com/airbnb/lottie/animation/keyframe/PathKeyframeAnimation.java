package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* renamed from: i */
    public final PointF f7430i;

    /* renamed from: j */
    public final float[] f7431j;

    /* renamed from: k */
    public PathKeyframe f7432k;

    /* renamed from: l */
    public PathMeasure f7433l;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f7430i = new PointF();
        this.f7431j = new float[2];
        this.f7433l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.f7428o;
        if (path == null) {
            return (PointF) keyframe.f7854b;
        }
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        if (lottieValueCallback != 0 && (pointF = (PointF) lottieValueCallback.m4861b(pathKeyframe.f7857e, pathKeyframe.f7858f.floatValue(), pathKeyframe.f7854b, pathKeyframe.f7855c, m4706d(), f2, this.f7413d)) != null) {
            return pointF;
        }
        if (this.f7432k != pathKeyframe) {
            this.f7433l.setPath(path, false);
            this.f7432k = pathKeyframe;
        }
        PathMeasure pathMeasure = this.f7433l;
        pathMeasure.getPosTan(pathMeasure.getLength() * f2, this.f7431j, null);
        PointF pointF2 = this.f7430i;
        float[] fArr = this.f7431j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f7430i;
    }
}
