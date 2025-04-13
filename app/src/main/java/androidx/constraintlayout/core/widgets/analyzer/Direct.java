package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Direct {

    /* renamed from: a */
    public static BasicMeasure.Measure f2377a = new BasicMeasure.Measure();

    /* renamed from: b */
    public static int f2378b;

    /* renamed from: c */
    public static int f2379c;

    /* renamed from: a */
    public static boolean m1346a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour m1281q = constraintWidget.m1281q();
        ConstraintWidget.DimensionBehaviour m1288x = constraintWidget.m1288x();
        ConstraintWidget constraintWidget2 = constraintWidget.f2181V;
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget2 != null ? (ConstraintWidgetContainer) constraintWidget2 : null;
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.m1281q();
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.m1288x();
        }
        boolean z = m1281q == dimensionBehaviour3 || constraintWidget.mo1225H() || m1281q == dimensionBehaviour2 || (m1281q == dimensionBehaviour && constraintWidget.f2220r == 0 && constraintWidget.f2184Y == 0.0f && constraintWidget.m1247B(0)) || (m1281q == dimensionBehaviour && constraintWidget.f2220r == 1 && constraintWidget.m1248C(0, constraintWidget.m1289y()));
        boolean z2 = m1288x == dimensionBehaviour3 || constraintWidget.mo1226I() || m1288x == dimensionBehaviour2 || (m1288x == dimensionBehaviour && constraintWidget.f2222s == 0 && constraintWidget.f2184Y == 0.0f && constraintWidget.m1247B(1)) || (m1288x == dimensionBehaviour && constraintWidget.f2222s == 1 && constraintWidget.m1248C(1, constraintWidget.m1280p()));
        if (constraintWidget.f2184Y <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: b */
    public static void m1347b(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (constraintWidget.f2210m) {
            return;
        }
        f2378b++;
        int i3 = 0;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.m1252G() && m1346a(constraintWidget)) {
            ConstraintWidgetContainer.m1291i0(constraintWidget, measurer, new BasicMeasure.Measure(), 0);
        }
        ConstraintAnchor mo1277m = constraintWidget.mo1277m(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor mo1277m2 = constraintWidget.mo1277m(ConstraintAnchor.Type.RIGHT);
        int m1235d = mo1277m.m1235d();
        int m1235d2 = mo1277m2.m1235d();
        HashSet<ConstraintAnchor> hashSet = mo1277m.f2137a;
        if (hashSet != null && mo1277m.f2139c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2140d;
                int i4 = i2 + 1;
                boolean m1346a = m1346a(constraintWidget2);
                if (constraintWidget2.m1252G() && m1346a) {
                    ConstraintWidgetContainer.m1291i0(constraintWidget2, measurer, new BasicMeasure.Measure(), i3);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f2169J;
                boolean z2 = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.f2171L.f2142f) != null && constraintAnchor4.f2139c) || (next == constraintWidget2.f2171L && (constraintAnchor3 = constraintAnchor5.f2142f) != null && constraintAnchor3.f2139c);
                if (constraintWidget2.m1281q() != dimensionBehaviour || m1346a) {
                    if (!constraintWidget2.m1252G()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f2169J;
                        if (next == constraintAnchor6 && constraintWidget2.f2171L.f2142f == null) {
                            int m1236e = constraintAnchor6.m1236e() + m1235d;
                            constraintWidget2.m1260Q(m1236e, constraintWidget2.m1289y() + m1236e);
                            m1347b(i4, constraintWidget2, measurer, z);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f2171L;
                            if (next == constraintAnchor7 && constraintAnchor6.f2142f == null) {
                                int m1236e2 = m1235d - constraintAnchor7.m1236e();
                                constraintWidget2.m1260Q(m1236e2 - constraintWidget2.m1289y(), m1236e2);
                                m1347b(i4, constraintWidget2, measurer, z);
                            } else if (z2 && !constraintWidget2.m1250E()) {
                                m1348c(i4, measurer, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.m1281q() == dimensionBehaviour && constraintWidget2.f2228v >= 0 && constraintWidget2.f2226u >= 0 && ((constraintWidget2.f2213n0 == 8 || (constraintWidget2.f2220r == 0 && constraintWidget2.f2184Y == 0.0f)) && !constraintWidget2.m1250E() && !constraintWidget2.f2166G && z2 && !constraintWidget2.m1250E())) {
                    m1349d(i4, constraintWidget, measurer, constraintWidget2, z);
                }
                i3 = 0;
            }
        }
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = mo1277m2.f2137a;
        if (hashSet2 != null && mo1277m2.f2139c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f2140d;
                int i5 = i2 + 1;
                boolean m1346a2 = m1346a(constraintWidget3);
                if (constraintWidget3.m1252G() && m1346a2) {
                    ConstraintWidgetContainer.m1291i0(constraintWidget3, measurer, new BasicMeasure.Measure(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f2169J;
                boolean z3 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.f2171L.f2142f) != null && constraintAnchor2.f2139c) || (next2 == constraintWidget3.f2171L && (constraintAnchor = constraintAnchor8.f2142f) != null && constraintAnchor.f2139c);
                if (constraintWidget3.m1281q() != dimensionBehaviour || m1346a2) {
                    if (!constraintWidget3.m1252G()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.f2169J;
                        if (next2 == constraintAnchor9 && constraintWidget3.f2171L.f2142f == null) {
                            int m1236e3 = constraintAnchor9.m1236e() + m1235d2;
                            constraintWidget3.m1260Q(m1236e3, constraintWidget3.m1289y() + m1236e3);
                            m1347b(i5, constraintWidget3, measurer, z);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.f2171L;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f2142f == null) {
                                int m1236e4 = m1235d2 - constraintAnchor10.m1236e();
                                constraintWidget3.m1260Q(m1236e4 - constraintWidget3.m1289y(), m1236e4);
                                m1347b(i5, constraintWidget3, measurer, z);
                            } else if (z3 && !constraintWidget3.m1250E()) {
                                m1348c(i5, measurer, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.m1281q() == dimensionBehaviour && constraintWidget3.f2228v >= 0 && constraintWidget3.f2226u >= 0 && (constraintWidget3.f2213n0 == 8 || (constraintWidget3.f2220r == 0 && constraintWidget3.f2184Y == 0.0f))) {
                    if (!constraintWidget3.m1250E() && !constraintWidget3.f2166G && z3 && !constraintWidget3.m1250E()) {
                        m1349d(i5, constraintWidget, measurer, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.f2210m = true;
    }

    /* renamed from: c */
    public static void m1348c(int i2, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget, boolean z) {
        float f2 = constraintWidget.f2205j0;
        int m1235d = constraintWidget.f2169J.f2142f.m1235d();
        int m1235d2 = constraintWidget.f2171L.f2142f.m1235d();
        int m1236e = constraintWidget.f2169J.m1236e() + m1235d;
        int m1236e2 = m1235d2 - constraintWidget.f2171L.m1236e();
        if (m1235d == m1235d2) {
            f2 = 0.5f;
        } else {
            m1235d = m1236e;
            m1235d2 = m1236e2;
        }
        int m1289y = constraintWidget.m1289y();
        int i3 = (m1235d2 - m1235d) - m1289y;
        if (m1235d > m1235d2) {
            i3 = (m1235d - m1235d2) - m1289y;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + m1235d;
        int i5 = i4 + m1289y;
        if (m1235d > m1235d2) {
            i5 = i4 - m1289y;
        }
        constraintWidget.m1260Q(i4, i5);
        m1347b(i2 + 1, constraintWidget, measurer, z);
    }

    /* renamed from: d */
    public static void m1349d(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z) {
        float f2 = constraintWidget2.f2205j0;
        int m1236e = constraintWidget2.f2169J.m1236e() + constraintWidget2.f2169J.f2142f.m1235d();
        int m1235d = constraintWidget2.f2171L.f2142f.m1235d() - constraintWidget2.f2171L.m1236e();
        if (m1235d >= m1236e) {
            int m1289y = constraintWidget2.m1289y();
            if (constraintWidget2.f2213n0 != 8) {
                int i3 = constraintWidget2.f2220r;
                if (i3 == 2) {
                    m1289y = (int) (constraintWidget2.f2205j0 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.m1289y() : constraintWidget.f2181V.m1289y()));
                } else if (i3 == 0) {
                    m1289y = m1235d - m1236e;
                }
                m1289y = Math.max(constraintWidget2.f2226u, m1289y);
                int i4 = constraintWidget2.f2228v;
                if (i4 > 0) {
                    m1289y = Math.min(i4, m1289y);
                }
            }
            int i5 = m1236e + ((int) ((f2 * ((m1235d - m1236e) - m1289y)) + 0.5f));
            constraintWidget2.m1260Q(i5, m1289y + i5);
            m1347b(i2 + 1, constraintWidget2, measurer, z);
        }
    }

    /* renamed from: e */
    public static void m1350e(int i2, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float f2 = constraintWidget.f2207k0;
        int m1235d = constraintWidget.f2170K.f2142f.m1235d();
        int m1235d2 = constraintWidget.f2172M.f2142f.m1235d();
        int m1236e = constraintWidget.f2170K.m1236e() + m1235d;
        int m1236e2 = m1235d2 - constraintWidget.f2172M.m1236e();
        if (m1235d == m1235d2) {
            f2 = 0.5f;
        } else {
            m1235d = m1236e;
            m1235d2 = m1236e2;
        }
        int m1280p = constraintWidget.m1280p();
        int i3 = (m1235d2 - m1235d) - m1280p;
        if (m1235d > m1235d2) {
            i3 = (m1235d - m1235d2) - m1280p;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = m1235d + i4;
        int i6 = i5 + m1280p;
        if (m1235d > m1235d2) {
            i5 = m1235d - i4;
            i6 = i5 - m1280p;
        }
        constraintWidget.m1261R(i5, i6);
        m1352g(i2 + 1, constraintWidget, measurer);
    }

    /* renamed from: f */
    public static void m1351f(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        float f2 = constraintWidget2.f2207k0;
        int m1236e = constraintWidget2.f2170K.m1236e() + constraintWidget2.f2170K.f2142f.m1235d();
        int m1235d = constraintWidget2.f2172M.f2142f.m1235d() - constraintWidget2.f2172M.m1236e();
        if (m1235d >= m1236e) {
            int m1280p = constraintWidget2.m1280p();
            if (constraintWidget2.f2213n0 != 8) {
                int i3 = constraintWidget2.f2222s;
                if (i3 == 2) {
                    m1280p = (int) (f2 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.m1280p() : constraintWidget.f2181V.m1280p()));
                } else if (i3 == 0) {
                    m1280p = m1235d - m1236e;
                }
                m1280p = Math.max(constraintWidget2.f2232x, m1280p);
                int i4 = constraintWidget2.f2234y;
                if (i4 > 0) {
                    m1280p = Math.min(i4, m1280p);
                }
            }
            int i5 = m1236e + ((int) ((f2 * ((m1235d - m1236e) - m1280p)) + 0.5f));
            constraintWidget2.m1261R(i5, m1280p + i5);
            m1352g(i2 + 1, constraintWidget2, measurer);
        }
    }

    /* renamed from: g */
    public static void m1352g(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (constraintWidget.f2212n) {
            return;
        }
        f2379c++;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.m1252G() && m1346a(constraintWidget)) {
            ConstraintWidgetContainer.m1291i0(constraintWidget, measurer, new BasicMeasure.Measure(), 0);
        }
        ConstraintAnchor mo1277m = constraintWidget.mo1277m(ConstraintAnchor.Type.TOP);
        ConstraintAnchor mo1277m2 = constraintWidget.mo1277m(ConstraintAnchor.Type.BOTTOM);
        int m1235d = mo1277m.m1235d();
        int m1235d2 = mo1277m2.m1235d();
        HashSet<ConstraintAnchor> hashSet = mo1277m.f2137a;
        if (hashSet != null && mo1277m.f2139c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2140d;
                int i3 = i2 + 1;
                boolean m1346a = m1346a(constraintWidget2);
                if (constraintWidget2.m1252G() && m1346a) {
                    ConstraintWidgetContainer.m1291i0(constraintWidget2, measurer, new BasicMeasure.Measure(), 0);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f2170K;
                boolean z = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.f2172M.f2142f) != null && constraintAnchor4.f2139c) || (next == constraintWidget2.f2172M && (constraintAnchor3 = constraintAnchor5.f2142f) != null && constraintAnchor3.f2139c);
                if (constraintWidget2.m1288x() != dimensionBehaviour || m1346a) {
                    if (!constraintWidget2.m1252G()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f2170K;
                        if (next == constraintAnchor6 && constraintWidget2.f2172M.f2142f == null) {
                            int m1236e = constraintAnchor6.m1236e() + m1235d;
                            constraintWidget2.m1261R(m1236e, constraintWidget2.m1280p() + m1236e);
                            m1352g(i3, constraintWidget2, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f2172M;
                            if (next == constraintAnchor7 && constraintAnchor6.f2142f == null) {
                                int m1236e2 = m1235d - constraintAnchor7.m1236e();
                                constraintWidget2.m1261R(m1236e2 - constraintWidget2.m1280p(), m1236e2);
                                m1352g(i3, constraintWidget2, measurer);
                            } else if (z && !constraintWidget2.m1251F()) {
                                m1350e(i3, measurer, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.m1288x() == dimensionBehaviour && constraintWidget2.f2234y >= 0 && constraintWidget2.f2232x >= 0 && ((constraintWidget2.f2213n0 == 8 || (constraintWidget2.f2222s == 0 && constraintWidget2.f2184Y == 0.0f)) && !constraintWidget2.m1251F() && !constraintWidget2.f2166G && z && !constraintWidget2.m1251F())) {
                    m1351f(i3, constraintWidget, measurer, constraintWidget2);
                }
            }
        }
        if (constraintWidget instanceof Guideline) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = mo1277m2.f2137a;
        if (hashSet2 != null && mo1277m2.f2139c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f2140d;
                int i4 = i2 + 1;
                boolean m1346a2 = m1346a(constraintWidget3);
                if (constraintWidget3.m1252G() && m1346a2) {
                    ConstraintWidgetContainer.m1291i0(constraintWidget3, measurer, new BasicMeasure.Measure(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f2170K;
                boolean z2 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.f2172M.f2142f) != null && constraintAnchor2.f2139c) || (next2 == constraintWidget3.f2172M && (constraintAnchor = constraintAnchor8.f2142f) != null && constraintAnchor.f2139c);
                if (constraintWidget3.m1288x() != dimensionBehaviour || m1346a2) {
                    if (!constraintWidget3.m1252G()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.f2170K;
                        if (next2 == constraintAnchor9 && constraintWidget3.f2172M.f2142f == null) {
                            int m1236e3 = constraintAnchor9.m1236e() + m1235d2;
                            constraintWidget3.m1261R(m1236e3, constraintWidget3.m1280p() + m1236e3);
                            m1352g(i4, constraintWidget3, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.f2172M;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f2142f == null) {
                                int m1236e4 = m1235d2 - constraintAnchor10.m1236e();
                                constraintWidget3.m1261R(m1236e4 - constraintWidget3.m1280p(), m1236e4);
                                m1352g(i4, constraintWidget3, measurer);
                            } else if (z2 && !constraintWidget3.m1251F()) {
                                m1350e(i4, measurer, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.m1288x() == dimensionBehaviour && constraintWidget3.f2234y >= 0 && constraintWidget3.f2232x >= 0 && (constraintWidget3.f2213n0 == 8 || (constraintWidget3.f2222s == 0 && constraintWidget3.f2184Y == 0.0f))) {
                    if (!constraintWidget3.m1251F() && !constraintWidget3.f2166G && z2 && !constraintWidget3.m1251F()) {
                        m1351f(i4, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor mo1277m3 = constraintWidget.mo1277m(ConstraintAnchor.Type.BASELINE);
        if (mo1277m3.f2137a != null && mo1277m3.f2139c) {
            int m1235d3 = mo1277m3.m1235d();
            Iterator<ConstraintAnchor> it3 = mo1277m3.f2137a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f2140d;
                int i5 = i2 + 1;
                boolean m1346a3 = m1346a(constraintWidget4);
                if (constraintWidget4.m1252G() && m1346a3) {
                    ConstraintWidgetContainer.m1291i0(constraintWidget4, measurer, new BasicMeasure.Measure(), 0);
                }
                if (constraintWidget4.m1288x() != dimensionBehaviour || m1346a3) {
                    if (!constraintWidget4.m1252G() && next3 == constraintWidget4.f2173N) {
                        int m1236e5 = next3.m1236e() + m1235d3;
                        if (constraintWidget4.f2164E) {
                            int i6 = m1236e5 - constraintWidget4.f2199g0;
                            int i7 = constraintWidget4.f2183X + i6;
                            constraintWidget4.f2189b0 = i6;
                            constraintWidget4.f2170K.m1244m(i6);
                            constraintWidget4.f2172M.m1244m(i7);
                            ConstraintAnchor constraintAnchor11 = constraintWidget4.f2173N;
                            constraintAnchor11.f2138b = m1236e5;
                            constraintAnchor11.f2139c = true;
                            constraintWidget4.f2208l = true;
                        }
                        m1352g(i5, constraintWidget4, measurer);
                    }
                }
            }
        }
        constraintWidget.f2212n = true;
    }
}
