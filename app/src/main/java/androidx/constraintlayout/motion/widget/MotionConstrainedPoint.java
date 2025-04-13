package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* renamed from: b */
    public float f2544b = 1.0f;

    /* renamed from: c */
    public int f2545c = 0;

    /* renamed from: d */
    public float f2546d = 0.0f;

    /* renamed from: e */
    public float f2547e = 0.0f;

    /* renamed from: f */
    public float f2548f = 0.0f;

    /* renamed from: g */
    public float f2549g = 0.0f;

    /* renamed from: h */
    public float f2550h = 1.0f;

    /* renamed from: i */
    public float f2551i = 1.0f;

    /* renamed from: j */
    public float f2552j = Float.NaN;

    /* renamed from: k */
    public float f2553k = Float.NaN;

    /* renamed from: l */
    public float f2554l = 0.0f;

    /* renamed from: m */
    public float f2555m = 0.0f;

    /* renamed from: n */
    public float f2556n = 0.0f;

    /* renamed from: o */
    public float f2557o = Float.NaN;

    /* renamed from: p */
    public float f2558p = Float.NaN;

    /* renamed from: q */
    public LinkedHashMap<String, ConstraintAttribute> f2559q = new LinkedHashMap<>();

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        Objects.requireNonNull(motionConstrainedPoint);
        return Float.compare(0.0f, 0.0f);
    }
}
