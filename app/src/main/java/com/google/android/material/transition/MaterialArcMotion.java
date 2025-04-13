package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* loaded from: classes.dex */
public final class MaterialArcMotion extends PathMotion {
    @Override // androidx.transition.PathMotion
    @NonNull
    /* renamed from: a */
    public Path mo4184a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        PointF pointF = f3 > f5 ? new PointF(f4, f3) : new PointF(f2, f5);
        path.quadTo(pointF.x, pointF.y, f4, f5);
        return path;
    }
}
