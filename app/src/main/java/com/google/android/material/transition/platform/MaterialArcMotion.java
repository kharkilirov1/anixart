package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
public final class MaterialArcMotion extends PathMotion {
    @Override // android.transition.PathMotion
    @NonNull
    public Path getPath(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        PointF pointF = f3 > f5 ? new PointF(f4, f3) : new PointF(f2, f5);
        path.quadTo(pointF.x, pointF.y, f4, f5);
        return path;
    }
}
