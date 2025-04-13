package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Oscillator {

    /* renamed from: a */
    public float[] f2047a = new float[0];

    /* renamed from: b */
    public double[] f2048b = new double[0];

    public String toString() {
        StringBuilder m24u = C0000a.m24u("pos =");
        m24u.append(Arrays.toString(this.f2048b));
        m24u.append(" period=");
        m24u.append(Arrays.toString(this.f2047a));
        return m24u.toString();
    }
}
