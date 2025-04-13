package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.TimedValueQueue;

/* loaded from: classes.dex */
final class FrameRotationQueue {

    /* renamed from: a */
    public final float[] f14921a = new float[16];

    /* renamed from: b */
    public final float[] f14922b = new float[16];

    /* renamed from: c */
    public final TimedValueQueue<float[]> f14923c = new TimedValueQueue<>();

    /* renamed from: d */
    public boolean f14924d;

    /* renamed from: a */
    public static void m7821a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[8] * fArr2[8]) + (fArr2[10] * fArr2[10]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }
}
