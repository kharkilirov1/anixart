package androidx.constraintlayout.motion.widget;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {

    /* renamed from: o */
    public static String[] f2636o = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: c */
    public float f2638c;

    /* renamed from: d */
    public float f2639d;

    /* renamed from: e */
    public float f2640e;

    /* renamed from: b */
    public int f2637b = 0;

    /* renamed from: f */
    public float f2641f = Float.NaN;

    /* renamed from: g */
    public int f2642g = -1;

    /* renamed from: h */
    public int f2643h = -1;

    /* renamed from: i */
    public float f2644i = Float.NaN;

    /* renamed from: j */
    public MotionController f2645j = null;

    /* renamed from: k */
    public LinkedHashMap<String, ConstraintAttribute> f2646k = new LinkedHashMap<>();

    /* renamed from: l */
    public int f2647l = 0;

    /* renamed from: m */
    public double[] f2648m = new double[18];

    /* renamed from: n */
    public double[] f2649n = new double[18];

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.f2638c, motionPaths.f2638c);
    }
}
