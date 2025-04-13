package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Motion implements TypedValues {

    /* renamed from: a */
    public MotionWidget f1961a;

    /* renamed from: b */
    public MotionPaths f1962b = new MotionPaths();

    /* renamed from: c */
    public MotionPaths f1963c = new MotionPaths();

    /* renamed from: d */
    public MotionConstrainedPoint f1964d = new MotionConstrainedPoint();

    /* renamed from: e */
    public MotionConstrainedPoint f1965e = new MotionConstrainedPoint();

    /* renamed from: androidx.constraintlayout.core.motion.Motion$1 */
    final class C01791 implements DifferentialInterpolator {
    }

    public Motion(MotionWidget motionWidget) {
        new ArrayList();
        new ArrayList();
        this.f1961a = motionWidget;
    }

    /* renamed from: a */
    public void m1209a(MotionWidget motionWidget) {
        Objects.requireNonNull(this.f1963c);
        MotionPaths motionPaths = this.f1963c;
        motionPaths.f1967b = 1.0f;
        Objects.requireNonNull(this.f1961a.f1971a);
        float f2 = 0;
        Objects.requireNonNull(this.f1961a.f1971a);
        this.f1961a.m1214b();
        this.f1961a.m1213a();
        motionPaths.f1968c = f2;
        motionPaths.f1969d = f2;
        MotionPaths motionPaths2 = this.f1963c;
        Objects.requireNonNull(motionWidget.f1971a);
        Objects.requireNonNull(motionWidget.f1971a);
        motionWidget.m1214b();
        motionWidget.m1213a();
        motionPaths2.f1968c = f2;
        motionPaths2.f1969d = f2;
        this.f1963c.m1212a(motionWidget);
        this.f1965e.m1211a(motionWidget);
    }

    /* renamed from: b */
    public void m1210b(MotionWidget motionWidget) {
        Objects.requireNonNull(this.f1962b);
        MotionPaths motionPaths = this.f1962b;
        motionPaths.f1967b = 0.0f;
        Objects.requireNonNull(motionWidget.f1971a);
        float f2 = 0;
        Objects.requireNonNull(motionWidget.f1971a);
        motionWidget.m1214b();
        motionWidget.m1213a();
        motionPaths.f1968c = f2;
        motionPaths.f1969d = f2;
        this.f1962b.m1212a(motionWidget);
        this.f1964d.m1211a(motionWidget);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u(" start: x: ");
        m24u.append(this.f1962b.f1968c);
        m24u.append(" y: ");
        m24u.append(this.f1962b.f1969d);
        m24u.append(" end: x: ");
        m24u.append(this.f1963c.f1968c);
        m24u.append(" y: ");
        m24u.append(this.f1963c.f1969d);
        return m24u.toString();
    }
}
