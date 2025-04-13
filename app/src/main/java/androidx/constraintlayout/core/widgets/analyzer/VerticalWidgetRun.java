package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import p000a.C0000a;

/* loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f2385k;

    /* renamed from: l */
    public DimensionDependency f2386l;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1 */
    public static /* synthetic */ class C01921 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2387a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2387a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2387a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2387a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f2385k = dependencyNode;
        this.f2386l = null;
        this.f2401h.f2359e = DependencyNode.Type.TOP;
        this.f2402i.f2359e = DependencyNode.Type.BOTTOM;
        dependencyNode.f2359e = DependencyNode.Type.BASELINE;
        this.f2399f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    public void mo1327a(Dependency dependency) {
        float f2;
        float f3;
        float f4;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (this.f2403j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f2395b;
            m1372l(constraintWidget.f2170K, constraintWidget.f2172M, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.f2398e;
        if (dimensionDependency.f2357c && !dimensionDependency.f2364j && this.f2397d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f2395b;
            int i3 = constraintWidget2.f2222s;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f2181V;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.f2194e.f2398e.f2364j) {
                        dimensionDependency.mo1345c((int) ((r1.f2361g * constraintWidget2.f2236z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                DimensionDependency dimensionDependency2 = constraintWidget2.f2192d.f2398e;
                if (dimensionDependency2.f2364j) {
                    int i4 = constraintWidget2.f2185Z;
                    if (i4 == -1) {
                        f2 = dimensionDependency2.f2361g;
                        f3 = constraintWidget2.f2184Y;
                    } else if (i4 == 0) {
                        f4 = dimensionDependency2.f2361g * constraintWidget2.f2184Y;
                        i2 = (int) (f4 + 0.5f);
                        dimensionDependency.mo1345c(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        dimensionDependency.mo1345c(i2);
                    } else {
                        f2 = dimensionDependency2.f2361g;
                        f3 = constraintWidget2.f2184Y;
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    dimensionDependency.mo1345c(i2);
                }
            }
        }
        DependencyNode dependencyNode = this.f2401h;
        if (dependencyNode.f2357c) {
            DependencyNode dependencyNode2 = this.f2402i;
            if (dependencyNode2.f2357c) {
                if (dependencyNode.f2364j && dependencyNode2.f2364j && this.f2398e.f2364j) {
                    return;
                }
                if (!this.f2398e.f2364j && this.f2397d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f2395b;
                    if (constraintWidget4.f2220r == 0 && !constraintWidget4.m1251F()) {
                        DependencyNode dependencyNode3 = this.f2401h.f2366l.get(0);
                        DependencyNode dependencyNode4 = this.f2402i.f2366l.get(0);
                        int i5 = dependencyNode3.f2361g;
                        DependencyNode dependencyNode5 = this.f2401h;
                        int i6 = i5 + dependencyNode5.f2360f;
                        int i7 = dependencyNode4.f2361g + this.f2402i.f2360f;
                        dependencyNode5.mo1345c(i6);
                        this.f2402i.mo1345c(i7);
                        this.f2398e.mo1345c(i7 - i6);
                        return;
                    }
                }
                if (!this.f2398e.f2364j && this.f2397d == dimensionBehaviour && this.f2394a == 1 && this.f2401h.f2366l.size() > 0 && this.f2402i.f2366l.size() > 0) {
                    DependencyNode dependencyNode6 = this.f2401h.f2366l.get(0);
                    int i8 = (this.f2402i.f2366l.get(0).f2361g + this.f2402i.f2360f) - (dependencyNode6.f2361g + this.f2401h.f2360f);
                    DimensionDependency dimensionDependency3 = this.f2398e;
                    int i9 = dimensionDependency3.f2376m;
                    if (i8 < i9) {
                        dimensionDependency3.mo1345c(i8);
                    } else {
                        dimensionDependency3.mo1345c(i9);
                    }
                }
                if (this.f2398e.f2364j && this.f2401h.f2366l.size() > 0 && this.f2402i.f2366l.size() > 0) {
                    DependencyNode dependencyNode7 = this.f2401h.f2366l.get(0);
                    DependencyNode dependencyNode8 = this.f2402i.f2366l.get(0);
                    int i10 = dependencyNode7.f2361g;
                    DependencyNode dependencyNode9 = this.f2401h;
                    int i11 = dependencyNode9.f2360f + i10;
                    int i12 = dependencyNode8.f2361g;
                    int i13 = this.f2402i.f2360f + i12;
                    float f5 = this.f2395b.f2207k0;
                    if (dependencyNode7 == dependencyNode8) {
                        f5 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    dependencyNode9.mo1345c((int) ((((i12 - i10) - this.f2398e.f2361g) * f5) + i10 + 0.5f));
                    this.f2402i.mo1345c(this.f2401h.f2361g + this.f2398e.f2361g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public void mo1328d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget constraintWidget4 = this.f2395b;
        if (constraintWidget4.f2186a) {
            this.f2398e.mo1345c(constraintWidget4.m1280p());
        }
        if (!this.f2398e.f2364j) {
            this.f2397d = this.f2395b.m1288x();
            if (this.f2395b.f2164E) {
                this.f2386l = new BaselineDimensionDependency(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f2397d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget3 = this.f2395b.f2181V) != null && constraintWidget3.m1288x() == dimensionBehaviour2) {
                    int m1280p = (constraintWidget3.m1280p() - this.f2395b.f2170K.m1236e()) - this.f2395b.f2172M.m1236e();
                    m1367b(this.f2401h, constraintWidget3.f2194e.f2401h, this.f2395b.f2170K.m1236e());
                    m1367b(this.f2402i, constraintWidget3.f2194e.f2402i, -this.f2395b.f2172M.m1236e());
                    this.f2398e.mo1345c(m1280p);
                    return;
                }
                if (this.f2397d == dimensionBehaviour2) {
                    this.f2398e.mo1345c(this.f2395b.m1280p());
                }
            }
        } else if (this.f2397d == dimensionBehaviour && (constraintWidget = this.f2395b.f2181V) != null && constraintWidget.m1288x() == dimensionBehaviour2) {
            m1367b(this.f2401h, constraintWidget.f2194e.f2401h, this.f2395b.f2170K.m1236e());
            m1367b(this.f2402i, constraintWidget.f2194e.f2402i, -this.f2395b.f2172M.m1236e());
            return;
        }
        DimensionDependency dimensionDependency = this.f2398e;
        boolean z = dimensionDependency.f2364j;
        if (z) {
            ConstraintWidget constraintWidget5 = this.f2395b;
            if (constraintWidget5.f2186a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.f2177R;
                if (constraintAnchorArr[2].f2142f != null && constraintAnchorArr[3].f2142f != null) {
                    if (constraintWidget5.m1251F()) {
                        this.f2401h.f2360f = this.f2395b.f2177R[2].m1236e();
                        this.f2402i.f2360f = -this.f2395b.f2177R[3].m1236e();
                    } else {
                        DependencyNode m1370h = m1370h(this.f2395b.f2177R[2]);
                        if (m1370h != null) {
                            DependencyNode dependencyNode = this.f2401h;
                            int m1236e = this.f2395b.f2177R[2].m1236e();
                            dependencyNode.f2366l.add(m1370h);
                            dependencyNode.f2360f = m1236e;
                            m1370h.f2365k.add(dependencyNode);
                        }
                        DependencyNode m1370h2 = m1370h(this.f2395b.f2177R[3]);
                        if (m1370h2 != null) {
                            DependencyNode dependencyNode2 = this.f2402i;
                            int i2 = -this.f2395b.f2177R[3].m1236e();
                            dependencyNode2.f2366l.add(m1370h2);
                            dependencyNode2.f2360f = i2;
                            m1370h2.f2365k.add(dependencyNode2);
                        }
                        this.f2401h.f2356b = true;
                        this.f2402i.f2356b = true;
                    }
                    ConstraintWidget constraintWidget6 = this.f2395b;
                    if (constraintWidget6.f2164E) {
                        m1367b(this.f2385k, this.f2401h, constraintWidget6.f2199g0);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[2].f2142f != null) {
                    DependencyNode m1370h3 = m1370h(constraintAnchorArr[2]);
                    if (m1370h3 != null) {
                        DependencyNode dependencyNode3 = this.f2401h;
                        int m1236e2 = this.f2395b.f2177R[2].m1236e();
                        dependencyNode3.f2366l.add(m1370h3);
                        dependencyNode3.f2360f = m1236e2;
                        m1370h3.f2365k.add(dependencyNode3);
                        m1367b(this.f2402i, this.f2401h, this.f2398e.f2361g);
                        ConstraintWidget constraintWidget7 = this.f2395b;
                        if (constraintWidget7.f2164E) {
                            m1367b(this.f2385k, this.f2401h, constraintWidget7.f2199g0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[3].f2142f != null) {
                    DependencyNode m1370h4 = m1370h(constraintAnchorArr[3]);
                    if (m1370h4 != null) {
                        DependencyNode dependencyNode4 = this.f2402i;
                        int i3 = -this.f2395b.f2177R[3].m1236e();
                        dependencyNode4.f2366l.add(m1370h4);
                        dependencyNode4.f2360f = i3;
                        m1370h4.f2365k.add(dependencyNode4);
                        m1367b(this.f2401h, this.f2402i, -this.f2398e.f2361g);
                    }
                    ConstraintWidget constraintWidget8 = this.f2395b;
                    if (constraintWidget8.f2164E) {
                        m1367b(this.f2385k, this.f2401h, constraintWidget8.f2199g0);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[4].f2142f != null) {
                    DependencyNode m1370h5 = m1370h(constraintAnchorArr[4]);
                    if (m1370h5 != null) {
                        DependencyNode dependencyNode5 = this.f2385k;
                        dependencyNode5.f2366l.add(m1370h5);
                        dependencyNode5.f2360f = 0;
                        m1370h5.f2365k.add(dependencyNode5);
                        m1367b(this.f2401h, this.f2385k, -this.f2395b.f2199g0);
                        m1367b(this.f2402i, this.f2401h, this.f2398e.f2361g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget5 instanceof Helper) || constraintWidget5.f2181V == null || constraintWidget5.mo1277m(ConstraintAnchor.Type.CENTER).f2142f != null) {
                    return;
                }
                ConstraintWidget constraintWidget9 = this.f2395b;
                m1367b(this.f2401h, constraintWidget9.f2181V.f2194e.f2401h, constraintWidget9.m1246A());
                m1367b(this.f2402i, this.f2401h, this.f2398e.f2361g);
                ConstraintWidget constraintWidget10 = this.f2395b;
                if (constraintWidget10.f2164E) {
                    m1367b(this.f2385k, this.f2401h, constraintWidget10.f2199g0);
                    return;
                }
                return;
            }
        }
        if (z || this.f2397d != dimensionBehaviour3) {
            dimensionDependency.f2365k.add(this);
            if (dimensionDependency.f2364j) {
                mo1327a(this);
            }
        } else {
            ConstraintWidget constraintWidget11 = this.f2395b;
            int i4 = constraintWidget11.f2222s;
            if (i4 == 2) {
                ConstraintWidget constraintWidget12 = constraintWidget11.f2181V;
                if (constraintWidget12 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget12.f2194e.f2398e;
                    dimensionDependency.f2366l.add(dimensionDependency2);
                    dimensionDependency2.f2365k.add(this.f2398e);
                    DimensionDependency dimensionDependency3 = this.f2398e;
                    dimensionDependency3.f2356b = true;
                    dimensionDependency3.f2365k.add(this.f2401h);
                    this.f2398e.f2365k.add(this.f2402i);
                }
            } else if (i4 == 3 && !constraintWidget11.m1251F()) {
                ConstraintWidget constraintWidget13 = this.f2395b;
                if (constraintWidget13.f2220r != 3) {
                    DimensionDependency dimensionDependency4 = constraintWidget13.f2192d.f2398e;
                    this.f2398e.f2366l.add(dimensionDependency4);
                    dimensionDependency4.f2365k.add(this.f2398e);
                    DimensionDependency dimensionDependency5 = this.f2398e;
                    dimensionDependency5.f2356b = true;
                    dimensionDependency5.f2365k.add(this.f2401h);
                    this.f2398e.f2365k.add(this.f2402i);
                }
            }
        }
        ConstraintWidget constraintWidget14 = this.f2395b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget14.f2177R;
        if (constraintAnchorArr2[2].f2142f != null && constraintAnchorArr2[3].f2142f != null) {
            if (constraintWidget14.m1251F()) {
                this.f2401h.f2360f = this.f2395b.f2177R[2].m1236e();
                this.f2402i.f2360f = -this.f2395b.f2177R[3].m1236e();
            } else {
                DependencyNode m1370h6 = m1370h(this.f2395b.f2177R[2]);
                DependencyNode m1370h7 = m1370h(this.f2395b.f2177R[3]);
                if (m1370h6 != null) {
                    m1370h6.f2365k.add(this);
                    if (m1370h6.f2364j) {
                        mo1327a(this);
                    }
                }
                if (m1370h7 != null) {
                    m1370h7.f2365k.add(this);
                    if (m1370h7.f2364j) {
                        mo1327a(this);
                    }
                }
                this.f2403j = WidgetRun.RunType.CENTER;
            }
            if (this.f2395b.f2164E) {
                m1368c(this.f2385k, this.f2401h, 1, this.f2386l);
            }
        } else if (constraintAnchorArr2[2].f2142f != null) {
            DependencyNode m1370h8 = m1370h(constraintAnchorArr2[2]);
            if (m1370h8 != null) {
                DependencyNode dependencyNode6 = this.f2401h;
                int m1236e3 = this.f2395b.f2177R[2].m1236e();
                dependencyNode6.f2366l.add(m1370h8);
                dependencyNode6.f2360f = m1236e3;
                m1370h8.f2365k.add(dependencyNode6);
                m1368c(this.f2402i, this.f2401h, 1, this.f2398e);
                if (this.f2395b.f2164E) {
                    m1368c(this.f2385k, this.f2401h, 1, this.f2386l);
                }
                if (this.f2397d == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget15 = this.f2395b;
                    if (constraintWidget15.f2184Y > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget15.f2192d;
                        if (horizontalWidgetRun.f2397d == dimensionBehaviour3) {
                            horizontalWidgetRun.f2398e.f2365k.add(this.f2398e);
                            this.f2398e.f2366l.add(this.f2395b.f2192d.f2398e);
                            this.f2398e.f2355a = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f2142f != null) {
            DependencyNode m1370h9 = m1370h(constraintAnchorArr2[3]);
            if (m1370h9 != null) {
                DependencyNode dependencyNode7 = this.f2402i;
                int i5 = -this.f2395b.f2177R[3].m1236e();
                dependencyNode7.f2366l.add(m1370h9);
                dependencyNode7.f2360f = i5;
                m1370h9.f2365k.add(dependencyNode7);
                m1368c(this.f2401h, this.f2402i, -1, this.f2398e);
                if (this.f2395b.f2164E) {
                    m1368c(this.f2385k, this.f2401h, 1, this.f2386l);
                }
            }
        } else if (constraintAnchorArr2[4].f2142f != null) {
            DependencyNode m1370h10 = m1370h(constraintAnchorArr2[4]);
            if (m1370h10 != null) {
                DependencyNode dependencyNode8 = this.f2385k;
                dependencyNode8.f2366l.add(m1370h10);
                dependencyNode8.f2360f = 0;
                m1370h10.f2365k.add(dependencyNode8);
                m1368c(this.f2401h, this.f2385k, -1, this.f2386l);
                m1368c(this.f2402i, this.f2401h, 1, this.f2398e);
            }
        } else if (!(constraintWidget14 instanceof Helper) && (constraintWidget2 = constraintWidget14.f2181V) != null) {
            m1367b(this.f2401h, constraintWidget2.f2194e.f2401h, constraintWidget14.m1246A());
            m1368c(this.f2402i, this.f2401h, 1, this.f2398e);
            if (this.f2395b.f2164E) {
                m1368c(this.f2385k, this.f2401h, 1, this.f2386l);
            }
            if (this.f2397d == dimensionBehaviour3) {
                ConstraintWidget constraintWidget16 = this.f2395b;
                if (constraintWidget16.f2184Y > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget16.f2192d;
                    if (horizontalWidgetRun2.f2397d == dimensionBehaviour3) {
                        horizontalWidgetRun2.f2398e.f2365k.add(this.f2398e);
                        this.f2398e.f2366l.add(this.f2395b.f2192d.f2398e);
                        this.f2398e.f2355a = this;
                    }
                }
            }
        }
        if (this.f2398e.f2366l.size() == 0) {
            this.f2398e.f2357c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: e */
    public void mo1329e() {
        DependencyNode dependencyNode = this.f2401h;
        if (dependencyNode.f2364j) {
            this.f2395b.f2189b0 = dependencyNode.f2361g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: f */
    public void mo1330f() {
        this.f2396c = null;
        this.f2401h.m1344b();
        this.f2402i.m1344b();
        this.f2385k.m1344b();
        this.f2398e.m1344b();
        this.f2400g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: k */
    public boolean mo1332k() {
        return this.f2397d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2395b.f2222s == 0;
    }

    /* renamed from: m */
    public void m1362m() {
        this.f2400g = false;
        this.f2401h.m1344b();
        this.f2401h.f2364j = false;
        this.f2402i.m1344b();
        this.f2402i.f2364j = false;
        this.f2385k.m1344b();
        this.f2385k.f2364j = false;
        this.f2398e.f2364j = false;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("VerticalRun ");
        m24u.append(this.f2395b.f2217p0);
        return m24u.toString();
    }
}
