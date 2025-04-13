package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import p000a.C0000a;

/* loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {

    /* renamed from: k */
    public static int[] f2380k = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1 */
    public static /* synthetic */ class C01911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2381a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2381a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2381a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2381a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2401h.f2359e = DependencyNode.Type.LEFT;
        this.f2402i.f2359e = DependencyNode.Type.RIGHT;
        this.f2399f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0278, code lost:
    
        if (r15 != 1) goto L129;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1327a(androidx.constraintlayout.core.widgets.analyzer.Dependency r19) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.mo1327a(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public void mo1328d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget constraintWidget4 = this.f2395b;
        if (constraintWidget4.f2186a) {
            this.f2398e.mo1345c(constraintWidget4.m1289y());
        }
        if (!this.f2398e.f2364j) {
            ConstraintWidget.DimensionBehaviour m1281q = this.f2395b.m1281q();
            this.f2397d = m1281q;
            if (m1281q != dimensionBehaviour) {
                if (m1281q == dimensionBehaviour2 && (constraintWidget3 = this.f2395b.f2181V) != null && (constraintWidget3.m1281q() == dimensionBehaviour3 || constraintWidget3.m1281q() == dimensionBehaviour2)) {
                    int m1289y = (constraintWidget3.m1289y() - this.f2395b.f2169J.m1236e()) - this.f2395b.f2171L.m1236e();
                    m1367b(this.f2401h, constraintWidget3.f2192d.f2401h, this.f2395b.f2169J.m1236e());
                    m1367b(this.f2402i, constraintWidget3.f2192d.f2402i, -this.f2395b.f2171L.m1236e());
                    this.f2398e.mo1345c(m1289y);
                    return;
                }
                if (this.f2397d == dimensionBehaviour3) {
                    this.f2398e.mo1345c(this.f2395b.m1289y());
                }
            }
        } else if (this.f2397d == dimensionBehaviour2 && (constraintWidget = this.f2395b.f2181V) != null && (constraintWidget.m1281q() == dimensionBehaviour3 || constraintWidget.m1281q() == dimensionBehaviour2)) {
            m1367b(this.f2401h, constraintWidget.f2192d.f2401h, this.f2395b.f2169J.m1236e());
            m1367b(this.f2402i, constraintWidget.f2192d.f2402i, -this.f2395b.f2171L.m1236e());
            return;
        }
        DimensionDependency dimensionDependency = this.f2398e;
        if (dimensionDependency.f2364j) {
            ConstraintWidget constraintWidget5 = this.f2395b;
            if (constraintWidget5.f2186a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.f2177R;
                if (constraintAnchorArr[0].f2142f != null && constraintAnchorArr[1].f2142f != null) {
                    if (constraintWidget5.m1250E()) {
                        this.f2401h.f2360f = this.f2395b.f2177R[0].m1236e();
                        this.f2402i.f2360f = -this.f2395b.f2177R[1].m1236e();
                        return;
                    }
                    DependencyNode m1370h = m1370h(this.f2395b.f2177R[0]);
                    if (m1370h != null) {
                        DependencyNode dependencyNode = this.f2401h;
                        int m1236e = this.f2395b.f2177R[0].m1236e();
                        dependencyNode.f2366l.add(m1370h);
                        dependencyNode.f2360f = m1236e;
                        m1370h.f2365k.add(dependencyNode);
                    }
                    DependencyNode m1370h2 = m1370h(this.f2395b.f2177R[1]);
                    if (m1370h2 != null) {
                        DependencyNode dependencyNode2 = this.f2402i;
                        int i2 = -this.f2395b.f2177R[1].m1236e();
                        dependencyNode2.f2366l.add(m1370h2);
                        dependencyNode2.f2360f = i2;
                        m1370h2.f2365k.add(dependencyNode2);
                    }
                    this.f2401h.f2356b = true;
                    this.f2402i.f2356b = true;
                    return;
                }
                if (constraintAnchorArr[0].f2142f != null) {
                    DependencyNode m1370h3 = m1370h(constraintAnchorArr[0]);
                    if (m1370h3 != null) {
                        DependencyNode dependencyNode3 = this.f2401h;
                        int m1236e2 = this.f2395b.f2177R[0].m1236e();
                        dependencyNode3.f2366l.add(m1370h3);
                        dependencyNode3.f2360f = m1236e2;
                        m1370h3.f2365k.add(dependencyNode3);
                        m1367b(this.f2402i, this.f2401h, this.f2398e.f2361g);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[1].f2142f == null) {
                    if ((constraintWidget5 instanceof Helper) || constraintWidget5.f2181V == null || constraintWidget5.mo1277m(ConstraintAnchor.Type.CENTER).f2142f != null) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = this.f2395b;
                    m1367b(this.f2401h, constraintWidget6.f2181V.f2192d.f2401h, constraintWidget6.m1290z());
                    m1367b(this.f2402i, this.f2401h, this.f2398e.f2361g);
                    return;
                }
                DependencyNode m1370h4 = m1370h(constraintAnchorArr[1]);
                if (m1370h4 != null) {
                    DependencyNode dependencyNode4 = this.f2402i;
                    int i3 = -this.f2395b.f2177R[1].m1236e();
                    dependencyNode4.f2366l.add(m1370h4);
                    dependencyNode4.f2360f = i3;
                    m1370h4.f2365k.add(dependencyNode4);
                    m1367b(this.f2401h, this.f2402i, -this.f2398e.f2361g);
                    return;
                }
                return;
            }
        }
        if (this.f2397d == dimensionBehaviour) {
            ConstraintWidget constraintWidget7 = this.f2395b;
            int i4 = constraintWidget7.f2220r;
            if (i4 == 2) {
                ConstraintWidget constraintWidget8 = constraintWidget7.f2181V;
                if (constraintWidget8 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget8.f2194e.f2398e;
                    dimensionDependency.f2366l.add(dimensionDependency2);
                    dimensionDependency2.f2365k.add(this.f2398e);
                    DimensionDependency dimensionDependency3 = this.f2398e;
                    dimensionDependency3.f2356b = true;
                    dimensionDependency3.f2365k.add(this.f2401h);
                    this.f2398e.f2365k.add(this.f2402i);
                }
            } else if (i4 == 3) {
                if (constraintWidget7.f2222s == 3) {
                    this.f2401h.f2355a = this;
                    this.f2402i.f2355a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget7.f2194e;
                    verticalWidgetRun.f2401h.f2355a = this;
                    verticalWidgetRun.f2402i.f2355a = this;
                    dimensionDependency.f2355a = this;
                    if (constraintWidget7.m1251F()) {
                        this.f2398e.f2366l.add(this.f2395b.f2194e.f2398e);
                        this.f2395b.f2194e.f2398e.f2365k.add(this.f2398e);
                        VerticalWidgetRun verticalWidgetRun2 = this.f2395b.f2194e;
                        verticalWidgetRun2.f2398e.f2355a = this;
                        this.f2398e.f2366l.add(verticalWidgetRun2.f2401h);
                        this.f2398e.f2366l.add(this.f2395b.f2194e.f2402i);
                        this.f2395b.f2194e.f2401h.f2365k.add(this.f2398e);
                        this.f2395b.f2194e.f2402i.f2365k.add(this.f2398e);
                    } else if (this.f2395b.m1250E()) {
                        this.f2395b.f2194e.f2398e.f2366l.add(this.f2398e);
                        this.f2398e.f2365k.add(this.f2395b.f2194e.f2398e);
                    } else {
                        this.f2395b.f2194e.f2398e.f2366l.add(this.f2398e);
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget7.f2194e.f2398e;
                    dimensionDependency.f2366l.add(dimensionDependency4);
                    dimensionDependency4.f2365k.add(this.f2398e);
                    this.f2395b.f2194e.f2401h.f2365k.add(this.f2398e);
                    this.f2395b.f2194e.f2402i.f2365k.add(this.f2398e);
                    DimensionDependency dimensionDependency5 = this.f2398e;
                    dimensionDependency5.f2356b = true;
                    dimensionDependency5.f2365k.add(this.f2401h);
                    this.f2398e.f2365k.add(this.f2402i);
                    this.f2401h.f2366l.add(this.f2398e);
                    this.f2402i.f2366l.add(this.f2398e);
                }
            }
        }
        ConstraintWidget constraintWidget9 = this.f2395b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget9.f2177R;
        if (constraintAnchorArr2[0].f2142f != null && constraintAnchorArr2[1].f2142f != null) {
            if (constraintWidget9.m1250E()) {
                this.f2401h.f2360f = this.f2395b.f2177R[0].m1236e();
                this.f2402i.f2360f = -this.f2395b.f2177R[1].m1236e();
                return;
            }
            DependencyNode m1370h5 = m1370h(this.f2395b.f2177R[0]);
            DependencyNode m1370h6 = m1370h(this.f2395b.f2177R[1]);
            if (m1370h5 != null) {
                m1370h5.f2365k.add(this);
                if (m1370h5.f2364j) {
                    mo1327a(this);
                }
            }
            if (m1370h6 != null) {
                m1370h6.f2365k.add(this);
                if (m1370h6.f2364j) {
                    mo1327a(this);
                }
            }
            this.f2403j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchorArr2[0].f2142f != null) {
            DependencyNode m1370h7 = m1370h(constraintAnchorArr2[0]);
            if (m1370h7 != null) {
                DependencyNode dependencyNode5 = this.f2401h;
                int m1236e3 = this.f2395b.f2177R[0].m1236e();
                dependencyNode5.f2366l.add(m1370h7);
                dependencyNode5.f2360f = m1236e3;
                m1370h7.f2365k.add(dependencyNode5);
                m1368c(this.f2402i, this.f2401h, 1, this.f2398e);
                return;
            }
            return;
        }
        if (constraintAnchorArr2[1].f2142f == null) {
            if ((constraintWidget9 instanceof Helper) || (constraintWidget2 = constraintWidget9.f2181V) == null) {
                return;
            }
            m1367b(this.f2401h, constraintWidget2.f2192d.f2401h, constraintWidget9.m1290z());
            m1368c(this.f2402i, this.f2401h, 1, this.f2398e);
            return;
        }
        DependencyNode m1370h8 = m1370h(constraintAnchorArr2[1]);
        if (m1370h8 != null) {
            DependencyNode dependencyNode6 = this.f2402i;
            int i5 = -this.f2395b.f2177R[1].m1236e();
            dependencyNode6.f2366l.add(m1370h8);
            dependencyNode6.f2360f = i5;
            m1370h8.f2365k.add(dependencyNode6);
            m1368c(this.f2401h, this.f2402i, -1, this.f2398e);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: e */
    public void mo1329e() {
        DependencyNode dependencyNode = this.f2401h;
        if (dependencyNode.f2364j) {
            this.f2395b.f2187a0 = dependencyNode.f2361g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: f */
    public void mo1330f() {
        this.f2396c = null;
        this.f2401h.m1344b();
        this.f2402i.m1344b();
        this.f2398e.m1344b();
        this.f2400g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: k */
    public boolean mo1332k() {
        return this.f2397d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2395b.f2220r == 0;
    }

    /* renamed from: m */
    public final void m1358m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* renamed from: n */
    public void m1359n() {
        this.f2400g = false;
        this.f2401h.m1344b();
        this.f2401h.f2364j = false;
        this.f2402i.m1344b();
        this.f2402i.f2364j = false;
        this.f2398e.f2364j = false;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("HorizontalRun ");
        m24u.append(this.f2395b.f2217p0);
        return m24u.toString();
    }
}
