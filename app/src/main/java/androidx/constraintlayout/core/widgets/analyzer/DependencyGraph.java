package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DependencyGraph {

    /* renamed from: a */
    public ConstraintWidgetContainer f2347a;

    /* renamed from: d */
    public ConstraintWidgetContainer f2350d;

    /* renamed from: f */
    public BasicMeasure.Measurer f2352f;

    /* renamed from: g */
    public BasicMeasure.Measure f2353g;

    /* renamed from: h */
    public ArrayList<RunGroup> f2354h;

    /* renamed from: b */
    public boolean f2348b = true;

    /* renamed from: c */
    public boolean f2349c = true;

    /* renamed from: e */
    public ArrayList<WidgetRun> f2351e = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        new ArrayList();
        this.f2352f = null;
        this.f2353g = new BasicMeasure.Measure();
        this.f2354h = new ArrayList<>();
        this.f2347a = constraintWidgetContainer;
        this.f2350d = constraintWidgetContainer;
    }

    /* renamed from: a */
    public final void m1335a(DependencyNode dependencyNode, int i2, int i3, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.f2358d;
        if (widgetRun.f2396c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f2347a;
            if (widgetRun == constraintWidgetContainer.f2192d || widgetRun == constraintWidgetContainer.f2194e) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i3);
                arrayList.add(runGroup);
            }
            widgetRun.f2396c = runGroup;
            runGroup.f2384b.add(widgetRun);
            for (Dependency dependency : widgetRun.f2401h.f2365k) {
                if (dependency instanceof DependencyNode) {
                    m1335a((DependencyNode) dependency, i2, 0, dependencyNode2, arrayList, runGroup);
                }
            }
            for (Dependency dependency2 : widgetRun.f2402i.f2365k) {
                if (dependency2 instanceof DependencyNode) {
                    m1335a((DependencyNode) dependency2, i2, 1, dependencyNode2, arrayList, runGroup);
                }
            }
            if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).f2385k.f2365k) {
                    if (dependency3 instanceof DependencyNode) {
                        m1335a((DependencyNode) dependency3, i2, 2, dependencyNode2, arrayList, runGroup);
                    }
                }
            }
            Iterator<DependencyNode> it = widgetRun.f2401h.f2366l.iterator();
            while (it.hasNext()) {
                m1335a(it.next(), i2, 0, dependencyNode2, arrayList, runGroup);
            }
            Iterator<DependencyNode> it2 = widgetRun.f2402i.f2366l.iterator();
            while (it2.hasNext()) {
                m1335a(it2.next(), i2, 1, dependencyNode2, arrayList, runGroup);
            }
            if (i2 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator<DependencyNode> it3 = ((VerticalWidgetRun) widgetRun).f2385k.f2366l.iterator();
                while (it3.hasNext()) {
                    m1335a(it3.next(), i2, 2, dependencyNode2, arrayList, runGroup);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m1336b(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i2;
        int i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        Iterator<ConstraintWidget> it = constraintWidgetContainer.f2331E0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f2180U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (next.f2213n0 == 8) {
                next.f2186a = true;
            } else {
                float f2 = next.f2230w;
                if (f2 < 1.0f && dimensionBehaviour6 == dimensionBehaviour3) {
                    next.f2220r = 2;
                }
                float f3 = next.f2236z;
                if (f3 < 1.0f && dimensionBehaviour7 == dimensionBehaviour3) {
                    next.f2222s = 2;
                }
                if (next.f2184Y > 0.0f) {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour7 == dimensionBehaviour4 || dimensionBehaviour7 == dimensionBehaviour5)) {
                        next.f2220r = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        next.f2222s = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour7 == dimensionBehaviour3) {
                        if (next.f2220r == 0) {
                            next.f2220r = 3;
                        }
                        if (next.f2222s == 0) {
                            next.f2222s = 3;
                        }
                    }
                }
                if (dimensionBehaviour6 == dimensionBehaviour3 && next.f2220r == 1 && (next.f2169J.f2142f == null || next.f2171L.f2142f == null)) {
                    dimensionBehaviour6 = dimensionBehaviour4;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = (dimensionBehaviour7 == dimensionBehaviour3 && next.f2222s == 1 && (next.f2170K.f2142f == null || next.f2172M.f2142f == null)) ? dimensionBehaviour4 : dimensionBehaviour7;
                HorizontalWidgetRun horizontalWidgetRun = next.f2192d;
                horizontalWidgetRun.f2397d = dimensionBehaviour6;
                int i4 = next.f2220r;
                horizontalWidgetRun.f2394a = i4;
                VerticalWidgetRun verticalWidgetRun = next.f2194e;
                verticalWidgetRun.f2397d = dimensionBehaviour8;
                int i5 = next.f2222s;
                verticalWidgetRun.f2394a = i5;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour9 || dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == dimensionBehaviour4) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == dimensionBehaviour5 || dimensionBehaviour8 == dimensionBehaviour4)) {
                    int m1289y = next.m1289y();
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        i2 = (constraintWidgetContainer.m1289y() - next.f2169J.f2143g) - next.f2171L.f2143g;
                        dimensionBehaviour = dimensionBehaviour5;
                    } else {
                        dimensionBehaviour = dimensionBehaviour6;
                        i2 = m1289y;
                    }
                    int m1280p = next.m1280p();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        i3 = (constraintWidgetContainer.m1280p() - next.f2170K.f2143g) - next.f2172M.f2143g;
                        dimensionBehaviour2 = dimensionBehaviour5;
                    } else {
                        i3 = m1280p;
                        dimensionBehaviour2 = dimensionBehaviour8;
                    }
                    m1342h(next, dimensionBehaviour, i2, dimensionBehaviour2, i3);
                    next.f2192d.f2398e.mo1345c(next.m1289y());
                    next.f2194e.f2398e.mo1345c(next.m1280p());
                    next.f2186a = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour8 == dimensionBehaviour4 || dimensionBehaviour8 == dimensionBehaviour5)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour4) {
                                m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int m1280p2 = next.m1280p();
                            m1342h(next, dimensionBehaviour5, (int) ((m1280p2 * next.f2184Y) + 0.5f), dimensionBehaviour5, m1280p2);
                            next.f2192d.f2398e.mo1345c(next.m1289y());
                            next.f2194e.f2398e.mo1345c(next.m1280p());
                            next.f2186a = true;
                        } else if (i4 == 1) {
                            m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                            next.f2192d.f2398e.f2376m = next.m1289y();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.f2180U;
                            if (dimensionBehaviourArr2[0] == dimensionBehaviour5 || dimensionBehaviourArr2[0] == dimensionBehaviour9) {
                                m1342h(next, dimensionBehaviour5, (int) ((f2 * constraintWidgetContainer.m1289y()) + 0.5f), dimensionBehaviour8, next.m1280p());
                                next.f2192d.f2398e.mo1345c(next.m1289y());
                                next.f2194e.f2398e.mo1345c(next.m1280p());
                                next.f2186a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.f2177R;
                            if (constraintAnchorArr[0].f2142f == null || constraintAnchorArr[1].f2142f == null) {
                                m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.f2192d.f2398e.mo1345c(next.m1289y());
                                next.f2194e.f2398e.mo1345c(next.m1280p());
                                next.f2186a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        if (i5 == 3) {
                            if (dimensionBehaviour6 == dimensionBehaviour4) {
                                m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int m1289y2 = next.m1289y();
                            float f4 = next.f2184Y;
                            if (next.f2185Z == -1) {
                                f4 = 1.0f / f4;
                            }
                            m1342h(next, dimensionBehaviour5, m1289y2, dimensionBehaviour5, (int) ((m1289y2 * f4) + 0.5f));
                            next.f2192d.f2398e.mo1345c(next.m1289y());
                            next.f2194e.f2398e.mo1345c(next.m1280p());
                            next.f2186a = true;
                        } else if (i5 == 1) {
                            m1342h(next, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                            next.f2194e.f2398e.f2376m = next.m1280p();
                        } else if (i5 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidgetContainer.f2180U;
                            if (dimensionBehaviourArr3[1] == dimensionBehaviour5 || dimensionBehaviourArr3[1] == dimensionBehaviour9) {
                                m1342h(next, dimensionBehaviour6, next.m1289y(), dimensionBehaviour5, (int) ((f3 * constraintWidgetContainer.m1280p()) + 0.5f));
                                next.f2192d.f2398e.mo1345c(next.m1289y());
                                next.f2194e.f2398e.mo1345c(next.m1280p());
                                next.f2186a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.f2177R;
                            if (constraintAnchorArr2[2].f2142f == null || constraintAnchorArr2[3].f2142f == null) {
                                m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.f2192d.f2398e.mo1345c(next.m1289y());
                                next.f2194e.f2398e.mo1345c(next.m1280p());
                                next.f2186a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour8 == dimensionBehaviour3) {
                        if (i4 == 1 || i5 == 1) {
                            m1342h(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            next.f2192d.f2398e.f2376m = next.m1289y();
                            next.f2194e.f2398e.f2376m = next.m1280p();
                        } else if (i5 == 2 && i4 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidgetContainer.f2180U;
                            if (dimensionBehaviourArr4[0] == dimensionBehaviour5 && dimensionBehaviourArr4[1] == dimensionBehaviour5) {
                                m1342h(next, dimensionBehaviour5, (int) ((f2 * constraintWidgetContainer.m1289y()) + 0.5f), dimensionBehaviour5, (int) ((f3 * constraintWidgetContainer.m1280p()) + 0.5f));
                                next.f2192d.f2398e.mo1345c(next.m1289y());
                                next.f2194e.f2398e.mo1345c(next.m1280p());
                                next.f2186a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m1337c() {
        ArrayList<WidgetRun> arrayList = this.f2351e;
        arrayList.clear();
        this.f2350d.f2192d.mo1330f();
        this.f2350d.f2194e.mo1330f();
        arrayList.add(this.f2350d.f2192d);
        arrayList.add(this.f2350d.f2194e);
        Iterator<ConstraintWidget> it = this.f2350d.f2331E0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                arrayList.add(new GuidelineReference(next));
            } else {
                if (next.m1250E()) {
                    if (next.f2188b == null) {
                        next.f2188b = new ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2188b);
                } else {
                    arrayList.add(next.f2192d);
                }
                if (next.m1251F()) {
                    if (next.f2190c == null) {
                        next.f2190c = new ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2190c);
                } else {
                    arrayList.add(next.f2194e);
                }
                if (next instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo1330f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2395b != this.f2350d) {
                next2.mo1328d();
            }
        }
        this.f2354h.clear();
        RunGroup.f2382c = 0;
        m1341g(this.f2347a.f2192d, 0, this.f2354h);
        m1341g(this.f2347a.f2194e, 1, this.f2354h);
        this.f2348b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1338d(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r18, int r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.m1338d(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, int):int");
    }

    /* renamed from: e */
    public boolean m1339e(boolean z) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f2348b || this.f2349c) {
            Iterator<ConstraintWidget> it = this.f2347a.f2331E0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.m1276l();
                next.f2186a = false;
                next.f2192d.m1359n();
                next.f2194e.m1362m();
            }
            this.f2347a.m1276l();
            ConstraintWidgetContainer constraintWidgetContainer = this.f2347a;
            constraintWidgetContainer.f2186a = false;
            constraintWidgetContainer.f2192d.m1359n();
            this.f2347a.f2194e.m1362m();
            this.f2349c = false;
        }
        m1336b(this.f2350d);
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f2347a;
        constraintWidgetContainer2.f2187a0 = 0;
        constraintWidgetContainer2.f2189b0 = 0;
        ConstraintWidget.DimensionBehaviour m1279o = constraintWidgetContainer2.m1279o(0);
        ConstraintWidget.DimensionBehaviour m1279o2 = this.f2347a.m1279o(1);
        if (this.f2348b) {
            m1337c();
        }
        int m1290z = this.f2347a.m1290z();
        int m1246A = this.f2347a.m1246A();
        this.f2347a.f2192d.f2401h.mo1345c(m1290z);
        this.f2347a.f2194e.f2401h.mo1345c(m1246A);
        m1343i();
        if (m1279o == dimensionBehaviour3 || m1279o2 == dimensionBehaviour3) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.f2351e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo1332k()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m1279o == dimensionBehaviour3) {
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f2347a;
                constraintWidgetContainer3.f2180U[0] = dimensionBehaviour2;
                constraintWidgetContainer3.m1267X(m1338d(constraintWidgetContainer3, 0));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f2347a;
                constraintWidgetContainer4.f2192d.f2398e.mo1345c(constraintWidgetContainer4.m1289y());
            }
            if (z4 && m1279o2 == dimensionBehaviour3) {
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f2347a;
                constraintWidgetContainer5.f2180U[1] = dimensionBehaviour2;
                constraintWidgetContainer5.m1262S(m1338d(constraintWidgetContainer5, 1));
                ConstraintWidgetContainer constraintWidgetContainer6 = this.f2347a;
                constraintWidgetContainer6.f2194e.f2398e.mo1345c(constraintWidgetContainer6.m1280p());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer7 = this.f2347a;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer7.f2180U;
        if (dimensionBehaviourArr[0] == dimensionBehaviour2 || dimensionBehaviourArr[0] == dimensionBehaviour) {
            int m1289y = constraintWidgetContainer7.m1289y() + m1290z;
            this.f2347a.f2192d.f2402i.mo1345c(m1289y);
            this.f2347a.f2192d.f2398e.mo1345c(m1289y - m1290z);
            m1343i();
            ConstraintWidgetContainer constraintWidgetContainer8 = this.f2347a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer8.f2180U;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour2 || dimensionBehaviourArr2[1] == dimensionBehaviour) {
                int m1280p = constraintWidgetContainer8.m1280p() + m1246A;
                this.f2347a.f2194e.f2402i.mo1345c(m1280p);
                this.f2347a.f2194e.f2398e.mo1345c(m1280p - m1246A);
            }
            m1343i();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.f2351e.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2395b != this.f2347a || next2.f2400g) {
                next2.mo1329e();
            }
        }
        Iterator<WidgetRun> it4 = this.f2351e.iterator();
        while (it4.hasNext()) {
            WidgetRun next3 = it4.next();
            if (z2 || next3.f2395b != this.f2347a) {
                if (!next3.f2401h.f2364j || ((!next3.f2402i.f2364j && !(next3 instanceof GuidelineReference)) || (!next3.f2398e.f2364j && !(next3 instanceof ChainRun) && !(next3 instanceof GuidelineReference)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f2347a.m1263T(m1279o);
        this.f2347a.m1266W(m1279o2);
        return z3;
    }

    /* renamed from: f */
    public boolean m1340f(boolean z, int i2) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.DimensionBehaviour m1279o = this.f2347a.m1279o(0);
        ConstraintWidget.DimensionBehaviour m1279o2 = this.f2347a.m1279o(1);
        int m1290z = this.f2347a.m1290z();
        int m1246A = this.f2347a.m1246A();
        if (z4 && (m1279o == dimensionBehaviour2 || m1279o2 == dimensionBehaviour2)) {
            Iterator<WidgetRun> it = this.f2351e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.f2399f == i2 && !next.mo1332k()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && m1279o == dimensionBehaviour2) {
                    ConstraintWidgetContainer constraintWidgetContainer = this.f2347a;
                    constraintWidgetContainer.f2180U[0] = dimensionBehaviour3;
                    constraintWidgetContainer.m1267X(m1338d(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f2347a;
                    constraintWidgetContainer2.f2192d.f2398e.mo1345c(constraintWidgetContainer2.m1289y());
                }
            } else if (z4 && m1279o2 == dimensionBehaviour2) {
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f2347a;
                constraintWidgetContainer3.f2180U[1] = dimensionBehaviour3;
                constraintWidgetContainer3.m1262S(m1338d(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f2347a;
                constraintWidgetContainer4.f2194e.f2398e.mo1345c(constraintWidgetContainer4.m1280p());
            }
        }
        if (i2 == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f2347a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer5.f2180U;
            if (dimensionBehaviourArr[0] == dimensionBehaviour3 || dimensionBehaviourArr[0] == dimensionBehaviour) {
                int m1289y = constraintWidgetContainer5.m1289y() + m1290z;
                this.f2347a.f2192d.f2402i.mo1345c(m1289y);
                this.f2347a.f2192d.f2398e.mo1345c(m1289y - m1290z);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f2347a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer6.f2180U;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour3 || dimensionBehaviourArr2[1] == dimensionBehaviour) {
                int m1280p = constraintWidgetContainer6.m1280p() + m1246A;
                this.f2347a.f2194e.f2402i.mo1345c(m1280p);
                this.f2347a.f2194e.f2398e.mo1345c(m1280p - m1246A);
                z2 = true;
            }
            z2 = false;
        }
        m1343i();
        Iterator<WidgetRun> it2 = this.f2351e.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.f2399f == i2 && (next2.f2395b != this.f2347a || next2.f2400g)) {
                next2.mo1329e();
            }
        }
        Iterator<WidgetRun> it3 = this.f2351e.iterator();
        while (it3.hasNext()) {
            WidgetRun next3 = it3.next();
            if (next3.f2399f == i2 && (z2 || next3.f2395b != this.f2347a)) {
                if (!next3.f2401h.f2364j || !next3.f2402i.f2364j || (!(next3 instanceof ChainRun) && !next3.f2398e.f2364j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f2347a.m1263T(m1279o);
        this.f2347a.m1266W(m1279o2);
        return z3;
    }

    /* renamed from: g */
    public final void m1341g(WidgetRun widgetRun, int i2, ArrayList<RunGroup> arrayList) {
        for (Dependency dependency : widgetRun.f2401h.f2365k) {
            if (dependency instanceof DependencyNode) {
                m1335a((DependencyNode) dependency, i2, 0, widgetRun.f2402i, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                m1335a(((WidgetRun) dependency).f2401h, i2, 0, widgetRun.f2402i, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.f2402i.f2365k) {
            if (dependency2 instanceof DependencyNode) {
                m1335a((DependencyNode) dependency2, i2, 1, widgetRun.f2401h, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                m1335a(((WidgetRun) dependency2).f2402i, i2, 1, widgetRun.f2401h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).f2385k.f2365k) {
                if (dependency3 instanceof DependencyNode) {
                    m1335a((DependencyNode) dependency3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: h */
    public final void m1342h(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measure measure = this.f2353g;
        measure.f2335a = dimensionBehaviour;
        measure.f2336b = dimensionBehaviour2;
        measure.f2337c = i2;
        measure.f2338d = i3;
        this.f2352f.mo1326b(constraintWidget, measure);
        constraintWidget.m1267X(this.f2353g.f2339e);
        constraintWidget.m1262S(this.f2353g.f2340f);
        BasicMeasure.Measure measure2 = this.f2353g;
        constraintWidget.f2164E = measure2.f2342h;
        constraintWidget.m1259P(measure2.f2341g);
    }

    /* renamed from: i */
    public void m1343i() {
        DimensionDependency dimensionDependency;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        Iterator<ConstraintWidget> it = this.f2347a.f2331E0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2186a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f2180U;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                int i2 = next.f2220r;
                int i3 = next.f2222s;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour3 == dimensionBehaviour5 || (dimensionBehaviour3 == dimensionBehaviour2 && i2 == 1);
                if (dimensionBehaviour4 == dimensionBehaviour5 || (dimensionBehaviour4 == dimensionBehaviour2 && i3 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency2 = next.f2192d.f2398e;
                boolean z3 = dimensionDependency2.f2364j;
                DimensionDependency dimensionDependency3 = next.f2194e.f2398e;
                boolean z4 = dimensionDependency3.f2364j;
                if (z3 && z4) {
                    m1342h(next, dimensionBehaviour, dimensionDependency2.f2361g, dimensionBehaviour, dimensionDependency3.f2361g);
                    next.f2186a = true;
                } else if (z3 && z) {
                    m1342h(next, dimensionBehaviour, dimensionDependency2.f2361g, dimensionBehaviour5, dimensionDependency3.f2361g);
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        next.f2194e.f2398e.f2376m = next.m1280p();
                    } else {
                        next.f2194e.f2398e.mo1345c(next.m1280p());
                        next.f2186a = true;
                    }
                } else if (z4 && z2) {
                    m1342h(next, dimensionBehaviour5, dimensionDependency2.f2361g, dimensionBehaviour, dimensionDependency3.f2361g);
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        next.f2192d.f2398e.f2376m = next.m1289y();
                    } else {
                        next.f2192d.f2398e.mo1345c(next.m1289y());
                        next.f2186a = true;
                    }
                }
                if (next.f2186a && (dimensionDependency = next.f2194e.f2386l) != null) {
                    dimensionDependency.mo1345c(next.f2199g0);
                }
            }
        }
    }
}
