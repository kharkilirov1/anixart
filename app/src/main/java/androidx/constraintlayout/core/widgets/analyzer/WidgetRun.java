package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {

    /* renamed from: a */
    public int f2394a;

    /* renamed from: b */
    public ConstraintWidget f2395b;

    /* renamed from: c */
    public RunGroup f2396c;

    /* renamed from: d */
    public ConstraintWidget.DimensionBehaviour f2397d;

    /* renamed from: e */
    public DimensionDependency f2398e = new DimensionDependency(this);

    /* renamed from: f */
    public int f2399f = 0;

    /* renamed from: g */
    public boolean f2400g = false;

    /* renamed from: h */
    public DependencyNode f2401h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f2402i = new DependencyNode(this);

    /* renamed from: j */
    public RunType f2403j = RunType.NONE;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1 */
    public static /* synthetic */ class C01931 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2404a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2404a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2404a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2404a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2404a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2404a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum RunType {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        START,
        /* JADX INFO: Fake field, exist only in values array */
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f2395b = constraintWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    public void mo1327a(Dependency dependency) {
    }

    /* renamed from: b */
    public final void m1367b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
        dependencyNode.f2366l.add(dependencyNode2);
        dependencyNode.f2360f = i2;
        dependencyNode2.f2365k.add(dependencyNode);
    }

    /* renamed from: c */
    public final void m1368c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, DimensionDependency dimensionDependency) {
        dependencyNode.f2366l.add(dependencyNode2);
        dependencyNode.f2366l.add(this.f2398e);
        dependencyNode.f2362h = i2;
        dependencyNode.f2363i = dimensionDependency;
        dependencyNode2.f2365k.add(dependencyNode);
        dimensionDependency.f2365k.add(dependencyNode);
    }

    /* renamed from: d */
    public abstract void mo1328d();

    /* renamed from: e */
    public abstract void mo1329e();

    /* renamed from: f */
    public abstract void mo1330f();

    /* renamed from: g */
    public final int m1369g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            ConstraintWidget constraintWidget = this.f2395b;
            int i4 = constraintWidget.f2228v;
            max = Math.max(constraintWidget.f2226u, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f2395b;
            int i5 = constraintWidget2.f2234y;
            max = Math.max(constraintWidget2.f2232x, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    /* renamed from: h */
    public final DependencyNode m1370h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2142f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2140d;
        int ordinal = constraintAnchor2.f2141e.ordinal();
        if (ordinal == 1) {
            return constraintWidget.f2192d.f2401h;
        }
        if (ordinal == 2) {
            return constraintWidget.f2194e.f2401h;
        }
        if (ordinal == 3) {
            return constraintWidget.f2192d.f2402i;
        }
        if (ordinal == 4) {
            return constraintWidget.f2194e.f2402i;
        }
        if (ordinal != 5) {
            return null;
        }
        return constraintWidget.f2194e.f2385k;
    }

    /* renamed from: i */
    public final DependencyNode m1371i(ConstraintAnchor constraintAnchor, int i2) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2142f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2140d;
        WidgetRun widgetRun = i2 == 0 ? constraintWidget.f2192d : constraintWidget.f2194e;
        int ordinal = constraintAnchor2.f2141e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.f2401h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.f2402i;
        }
        return null;
    }

    /* renamed from: j */
    public long mo1331j() {
        if (this.f2398e.f2364j) {
            return r0.f2361g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo1332k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f2394a == 3) goto L51;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1372l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m1372l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
