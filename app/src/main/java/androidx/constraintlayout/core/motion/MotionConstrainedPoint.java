package androidx.constraintlayout.core.motion;

import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* renamed from: b */
    public LinkedHashMap<String, CustomVariable> f1966b = new LinkedHashMap<>();

    /* renamed from: a */
    public void m1211a(MotionWidget motionWidget) {
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        motionWidget.m1214b();
        motionWidget.m1213a();
        Objects.requireNonNull(motionWidget.f1973c);
        Objects.requireNonNull(motionWidget.f1973c);
        Objects.requireNonNull(motionWidget.f1973c);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        for (String str : motionWidget.f1971a.f2109a.keySet()) {
            CustomVariable customVariable = motionWidget.f1971a.f2109a.get(str);
            if (customVariable != null) {
                this.f1966b.put(str, customVariable);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        Objects.requireNonNull(motionConstrainedPoint);
        return Float.compare(0.0f, 0.0f);
    }
}
