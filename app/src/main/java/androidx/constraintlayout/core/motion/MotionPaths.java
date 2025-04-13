package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {

    /* renamed from: b */
    public float f1967b;

    /* renamed from: c */
    public float f1968c;

    /* renamed from: d */
    public float f1969d;

    /* renamed from: e */
    public HashMap<String, CustomVariable> f1970e = new HashMap<>();

    /* renamed from: a */
    public void m1212a(MotionWidget motionWidget) {
        Objects.requireNonNull(motionWidget.f1972b);
        Easing.m1217b(null);
        Objects.requireNonNull(motionWidget.f1972b);
        Objects.requireNonNull(motionWidget.f1972b);
        Objects.requireNonNull(motionWidget.f1972b);
        Objects.requireNonNull(motionWidget.f1972b);
        Objects.requireNonNull(motionWidget.f1972b);
        Objects.requireNonNull(motionWidget.f1973c);
        for (String str : motionWidget.f1971a.f2109a.keySet()) {
            CustomVariable customVariable = motionWidget.f1971a.f2109a.get(str);
            if (customVariable != null) {
                this.f1970e.put(str, customVariable);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.f1967b, motionPaths.f1967b);
    }
}
