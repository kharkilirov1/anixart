package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* renamed from: com.yandex.mobile.ads.impl.uv */
/* loaded from: classes3.dex */
final class C5889uv {

    /* renamed from: a */
    private final float[] f55689a = new float[16];

    /* renamed from: b */
    private final float[] f55690b = new float[16];

    /* renamed from: c */
    private final j61<float[]> f55691c = new j61<>();

    /* renamed from: d */
    private boolean f55692d;

    /* renamed from: a */
    public final void m29141a() {
        this.f55691c.m25807a();
        this.f55692d = false;
    }

    /* renamed from: b */
    public final void m29143b(long j2, float[] fArr) {
        this.f55691c.m25808a(fArr, j2);
    }

    /* renamed from: a */
    public final void m29142a(long j2, float[] fArr) {
        float[] m25809b = this.f55691c.m25809b(j2);
        if (m25809b == null) {
            return;
        }
        float[] fArr2 = this.f55690b;
        float f2 = m25809b[0];
        float f3 = -m25809b[1];
        float f4 = -m25809b[2];
        float length = Matrix.length(f2, f3, f4);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f55692d) {
            m29140a(this.f55689a, this.f55690b);
            this.f55692d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f55689a, 0, this.f55690b, 0);
    }

    /* renamed from: a */
    public static void m29140a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / sqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / sqrt;
        fArr[8] = (-f5) / sqrt;
        fArr[10] = f4;
    }
}
