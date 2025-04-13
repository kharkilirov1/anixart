package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: o1 */
    public ConstraintWidget[] f2289o1;

    /* renamed from: R0 */
    public int f2266R0 = -1;

    /* renamed from: S0 */
    public int f2267S0 = -1;

    /* renamed from: T0 */
    public int f2268T0 = -1;

    /* renamed from: U0 */
    public int f2269U0 = -1;

    /* renamed from: V0 */
    public int f2270V0 = -1;

    /* renamed from: W0 */
    public int f2271W0 = -1;

    /* renamed from: X0 */
    public float f2272X0 = 0.5f;

    /* renamed from: Y0 */
    public float f2273Y0 = 0.5f;

    /* renamed from: Z0 */
    public float f2274Z0 = 0.5f;

    /* renamed from: a1 */
    public float f2275a1 = 0.5f;

    /* renamed from: b1 */
    public float f2276b1 = 0.5f;

    /* renamed from: c1 */
    public float f2277c1 = 0.5f;

    /* renamed from: d1 */
    public int f2278d1 = 0;

    /* renamed from: e1 */
    public int f2279e1 = 0;

    /* renamed from: f1 */
    public int f2280f1 = 2;

    /* renamed from: g1 */
    public int f2281g1 = 2;

    /* renamed from: h1 */
    public int f2282h1 = 0;

    /* renamed from: i1 */
    public int f2283i1 = -1;

    /* renamed from: j1 */
    public int f2284j1 = 0;

    /* renamed from: k1 */
    public ArrayList<WidgetsList> f2285k1 = new ArrayList<>();

    /* renamed from: l1 */
    public ConstraintWidget[] f2286l1 = null;

    /* renamed from: m1 */
    public ConstraintWidget[] f2287m1 = null;

    /* renamed from: n1 */
    public int[] f2288n1 = null;

    /* renamed from: p1 */
    public int f2290p1 = 0;

    public class WidgetsList {

        /* renamed from: a */
        public int f2291a;

        /* renamed from: d */
        public ConstraintAnchor f2294d;

        /* renamed from: e */
        public ConstraintAnchor f2295e;

        /* renamed from: f */
        public ConstraintAnchor f2296f;

        /* renamed from: g */
        public ConstraintAnchor f2297g;

        /* renamed from: h */
        public int f2298h;

        /* renamed from: i */
        public int f2299i;

        /* renamed from: j */
        public int f2300j;

        /* renamed from: k */
        public int f2301k;

        /* renamed from: q */
        public int f2307q;

        /* renamed from: b */
        public ConstraintWidget f2292b = null;

        /* renamed from: c */
        public int f2293c = 0;

        /* renamed from: l */
        public int f2302l = 0;

        /* renamed from: m */
        public int f2303m = 0;

        /* renamed from: n */
        public int f2304n = 0;

        /* renamed from: o */
        public int f2305o = 0;

        /* renamed from: p */
        public int f2306p = 0;

        public WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.f2291a = 0;
            this.f2298h = 0;
            this.f2299i = 0;
            this.f2300j = 0;
            this.f2301k = 0;
            this.f2307q = 0;
            this.f2291a = i2;
            this.f2294d = constraintAnchor;
            this.f2295e = constraintAnchor2;
            this.f2296f = constraintAnchor3;
            this.f2297g = constraintAnchor4;
            this.f2298h = Flow.this.f2324K0;
            this.f2299i = Flow.this.f2320G0;
            this.f2300j = Flow.this.f2325L0;
            this.f2301k = Flow.this.f2321H0;
            this.f2307q = i3;
        }

        /* renamed from: a */
        public void m1306a(ConstraintWidget constraintWidget) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (this.f2291a == 0) {
                int m1305f0 = Flow.this.m1305f0(constraintWidget, this.f2307q);
                if (constraintWidget.m1281q() == dimensionBehaviour) {
                    this.f2306p++;
                    m1305f0 = 0;
                }
                Flow flow = Flow.this;
                this.f2302l = m1305f0 + (constraintWidget.f2213n0 != 8 ? flow.f2278d1 : 0) + this.f2302l;
                int m1304e0 = flow.m1304e0(constraintWidget, this.f2307q);
                if (this.f2292b == null || this.f2293c < m1304e0) {
                    this.f2292b = constraintWidget;
                    this.f2293c = m1304e0;
                    this.f2303m = m1304e0;
                }
            } else {
                int m1305f02 = Flow.this.m1305f0(constraintWidget, this.f2307q);
                int m1304e02 = Flow.this.m1304e0(constraintWidget, this.f2307q);
                if (constraintWidget.m1288x() == dimensionBehaviour) {
                    this.f2306p++;
                    m1304e02 = 0;
                }
                this.f2303m = m1304e02 + (constraintWidget.f2213n0 != 8 ? Flow.this.f2279e1 : 0) + this.f2303m;
                if (this.f2292b == null || this.f2293c < m1305f02) {
                    this.f2292b = constraintWidget;
                    this.f2293c = m1305f02;
                    this.f2302l = m1305f02;
                }
            }
            this.f2305o++;
        }

        /* renamed from: b */
        public void m1307b(boolean z, int i2, boolean z2) {
            int i3;
            float f2;
            ConstraintWidget constraintWidget;
            int i4;
            float f3;
            float f4;
            int i5 = this.f2305o;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = this.f2304n + i6;
                Flow flow = Flow.this;
                if (i7 >= flow.f2290p1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.f2289o1[i7];
                if (constraintWidget2 != null) {
                    constraintWidget2.m1254K();
                }
            }
            if (i5 == 0 || this.f2292b == null) {
                return;
            }
            boolean z3 = z2 && i2 == 0;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = this.f2304n + (z ? (i5 - 1) - i10 : i10);
                Flow flow2 = Flow.this;
                if (i11 >= flow2.f2290p1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = flow2.f2289o1[i11];
                if (constraintWidget3 != null && constraintWidget3.f2213n0 == 0) {
                    if (i8 == -1) {
                        i8 = i10;
                    }
                    i9 = i10;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f2291a != 0) {
                ConstraintWidget constraintWidget5 = this.f2292b;
                Flow flow3 = Flow.this;
                constraintWidget5.f2225t0 = flow3.f2266R0;
                int i12 = this.f2298h;
                if (i2 > 0) {
                    i12 += flow3.f2278d1;
                }
                if (z) {
                    constraintWidget5.f2171L.m1232a(this.f2296f, i12);
                    if (z2) {
                        constraintWidget5.f2169J.m1232a(this.f2294d, this.f2300j);
                    }
                    if (i2 > 0) {
                        this.f2296f.f2140d.f2169J.m1232a(constraintWidget5.f2171L, 0);
                    }
                } else {
                    constraintWidget5.f2169J.m1232a(this.f2294d, i12);
                    if (z2) {
                        constraintWidget5.f2171L.m1232a(this.f2296f, this.f2300j);
                    }
                    if (i2 > 0) {
                        this.f2294d.f2140d.f2171L.m1232a(constraintWidget5.f2169J, 0);
                    }
                }
                for (int i13 = 0; i13 < i5; i13++) {
                    int i14 = this.f2304n + i13;
                    Flow flow4 = Flow.this;
                    if (i14 >= flow4.f2290p1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow4.f2289o1[i14];
                    if (constraintWidget6 != null) {
                        if (i13 == 0) {
                            constraintWidget6.m1274j(constraintWidget6.f2170K, this.f2295e, this.f2299i);
                            Flow flow5 = Flow.this;
                            int i15 = flow5.f2267S0;
                            float f5 = flow5.f2273Y0;
                            if (this.f2304n != 0 || (i3 = flow5.f2269U0) == -1) {
                                if (z2 && (i3 = flow5.f2271W0) != -1) {
                                    f2 = flow5.f2277c1;
                                }
                                constraintWidget6.f2227u0 = i15;
                                constraintWidget6.f2207k0 = f5;
                            } else {
                                f2 = flow5.f2275a1;
                            }
                            f5 = f2;
                            i15 = i3;
                            constraintWidget6.f2227u0 = i15;
                            constraintWidget6.f2207k0 = f5;
                        }
                        if (i13 == i5 - 1) {
                            constraintWidget6.m1274j(constraintWidget6.f2172M, this.f2297g, this.f2301k);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.f2170K.m1232a(constraintWidget4.f2172M, Flow.this.f2279e1);
                            if (i13 == i8) {
                                constraintWidget6.f2170K.m1245n(this.f2299i);
                            }
                            constraintWidget4.f2172M.m1232a(constraintWidget6.f2170K, 0);
                            if (i13 == i9 + 1) {
                                constraintWidget4.f2172M.m1245n(this.f2301k);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z) {
                                int i16 = Flow.this.f2280f1;
                                if (i16 == 0) {
                                    constraintWidget6.f2171L.m1232a(constraintWidget5.f2171L, 0);
                                } else if (i16 == 1) {
                                    constraintWidget6.f2169J.m1232a(constraintWidget5.f2169J, 0);
                                } else if (i16 == 2) {
                                    constraintWidget6.f2169J.m1232a(constraintWidget5.f2169J, 0);
                                    constraintWidget6.f2171L.m1232a(constraintWidget5.f2171L, 0);
                                }
                            } else {
                                int i17 = Flow.this.f2280f1;
                                if (i17 == 0) {
                                    constraintWidget6.f2169J.m1232a(constraintWidget5.f2169J, 0);
                                } else if (i17 == 1) {
                                    constraintWidget6.f2171L.m1232a(constraintWidget5.f2171L, 0);
                                } else if (i17 == 2) {
                                    if (z3) {
                                        constraintWidget6.f2169J.m1232a(this.f2294d, this.f2298h);
                                        constraintWidget6.f2171L.m1232a(this.f2296f, this.f2300j);
                                    } else {
                                        constraintWidget6.f2169J.m1232a(constraintWidget5.f2169J, 0);
                                        constraintWidget6.f2171L.m1232a(constraintWidget5.f2171L, 0);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f2292b;
            Flow flow6 = Flow.this;
            constraintWidget7.f2227u0 = flow6.f2267S0;
            int i18 = this.f2299i;
            if (i2 > 0) {
                i18 += flow6.f2279e1;
            }
            constraintWidget7.f2170K.m1232a(this.f2295e, i18);
            if (z2) {
                constraintWidget7.f2172M.m1232a(this.f2297g, this.f2301k);
            }
            if (i2 > 0) {
                this.f2295e.f2140d.f2172M.m1232a(constraintWidget7.f2170K, 0);
            }
            if (Flow.this.f2281g1 == 3 && !constraintWidget7.f2164E) {
                for (int i19 = 0; i19 < i5; i19++) {
                    int i20 = this.f2304n + (z ? (i5 - 1) - i19 : i19);
                    Flow flow7 = Flow.this;
                    if (i20 >= flow7.f2290p1) {
                        break;
                    }
                    constraintWidget = flow7.f2289o1[i20];
                    if (constraintWidget.f2164E) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            for (int i21 = 0; i21 < i5; i21++) {
                int i22 = z ? (i5 - 1) - i21 : i21;
                int i23 = this.f2304n + i22;
                Flow flow8 = Flow.this;
                if (i23 >= flow8.f2290p1) {
                    return;
                }
                ConstraintWidget constraintWidget8 = flow8.f2289o1[i23];
                if (constraintWidget8 != null) {
                    if (i21 == 0) {
                        constraintWidget8.m1274j(constraintWidget8.f2169J, this.f2294d, this.f2298h);
                    }
                    if (i22 == 0) {
                        Flow flow9 = Flow.this;
                        int i24 = flow9.f2266R0;
                        float f6 = z ? 1.0f - flow9.f2272X0 : flow9.f2272X0;
                        if (this.f2304n != 0 || (i4 = flow9.f2268T0) == -1) {
                            if (z2 && (i4 = flow9.f2270V0) != -1) {
                                if (z) {
                                    f4 = flow9.f2276b1;
                                    i24 = i4;
                                    f6 = 1.0f - f4;
                                } else {
                                    f3 = flow9.f2276b1;
                                    i24 = i4;
                                    f6 = f3;
                                }
                            }
                        } else if (z) {
                            f4 = flow9.f2274Z0;
                            i24 = i4;
                            f6 = 1.0f - f4;
                        } else {
                            f3 = flow9.f2274Z0;
                            i24 = i4;
                            f6 = f3;
                        }
                        constraintWidget8.f2225t0 = i24;
                        constraintWidget8.f2205j0 = f6;
                    }
                    if (i21 == i5 - 1) {
                        constraintWidget8.m1274j(constraintWidget8.f2171L, this.f2296f, this.f2300j);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.f2169J.m1232a(constraintWidget4.f2171L, Flow.this.f2278d1);
                        if (i21 == i8) {
                            constraintWidget8.f2169J.m1245n(this.f2298h);
                        }
                        constraintWidget4.f2171L.m1232a(constraintWidget8.f2169J, 0);
                        if (i21 == i9 + 1) {
                            constraintWidget4.f2171L.m1245n(this.f2300j);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        int i25 = Flow.this.f2281g1;
                        if (i25 == 3 && constraintWidget.f2164E && constraintWidget8 != constraintWidget && constraintWidget8.f2164E) {
                            constraintWidget8.f2173N.m1232a(constraintWidget.f2173N, 0);
                        } else if (i25 == 0) {
                            constraintWidget8.f2170K.m1232a(constraintWidget7.f2170K, 0);
                        } else if (i25 == 1) {
                            constraintWidget8.f2172M.m1232a(constraintWidget7.f2172M, 0);
                        } else if (z3) {
                            constraintWidget8.f2170K.m1232a(this.f2295e, this.f2299i);
                            constraintWidget8.f2172M.m1232a(this.f2297g, this.f2301k);
                        } else {
                            constraintWidget8.f2170K.m1232a(constraintWidget7.f2170K, 0);
                            constraintWidget8.f2172M.m1232a(constraintWidget7.f2172M, 0);
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        /* renamed from: c */
        public int m1308c() {
            return this.f2291a == 1 ? this.f2303m - Flow.this.f2279e1 : this.f2303m;
        }

        /* renamed from: d */
        public int m1309d() {
            return this.f2291a == 0 ? this.f2302l - Flow.this.f2278d1 : this.f2302l;
        }

        /* renamed from: e */
        public void m1310e(int i2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i3 = this.f2306p;
            if (i3 == 0) {
                return;
            }
            int i4 = this.f2305o;
            int i5 = i2 / i3;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = this.f2304n;
                int i8 = i7 + i6;
                Flow flow = Flow.this;
                if (i8 >= flow.f2290p1) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.f2289o1[i7 + i6];
                if (this.f2291a == 0) {
                    if (constraintWidget != null && constraintWidget.m1281q() == dimensionBehaviour2 && constraintWidget.f2220r == 0) {
                        Flow.this.m1321d0(constraintWidget, dimensionBehaviour, i5, constraintWidget.m1288x(), constraintWidget.m1280p());
                    }
                } else if (constraintWidget != null && constraintWidget.m1288x() == dimensionBehaviour2 && constraintWidget.f2222s == 0) {
                    Flow.this.m1321d0(constraintWidget, constraintWidget.m1281q(), constraintWidget.m1289y(), dimensionBehaviour, i5);
                }
            }
            this.f2302l = 0;
            this.f2303m = 0;
            this.f2292b = null;
            this.f2293c = 0;
            int i9 = this.f2305o;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = this.f2304n + i10;
                Flow flow2 = Flow.this;
                if (i11 >= flow2.f2290p1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow2.f2289o1[i11];
                if (this.f2291a == 0) {
                    int m1289y = constraintWidget2.m1289y();
                    Flow flow3 = Flow.this;
                    int i12 = flow3.f2278d1;
                    if (constraintWidget2.f2213n0 == 8) {
                        i12 = 0;
                    }
                    this.f2302l = m1289y + i12 + this.f2302l;
                    int m1304e0 = flow3.m1304e0(constraintWidget2, this.f2307q);
                    if (this.f2292b == null || this.f2293c < m1304e0) {
                        this.f2292b = constraintWidget2;
                        this.f2293c = m1304e0;
                        this.f2303m = m1304e0;
                    }
                } else {
                    int m1305f0 = flow2.m1305f0(constraintWidget2, this.f2307q);
                    int m1304e02 = Flow.this.m1304e0(constraintWidget2, this.f2307q);
                    int i13 = Flow.this.f2279e1;
                    if (constraintWidget2.f2213n0 == 8) {
                        i13 = 0;
                    }
                    this.f2303m = m1304e02 + i13 + this.f2303m;
                    if (this.f2292b == null || this.f2293c < m1305f0) {
                        this.f2292b = constraintWidget2;
                        this.f2293c = m1305f0;
                        this.f2302l = m1305f0;
                    }
                }
            }
        }

        /* renamed from: f */
        public void m1311f(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
            this.f2291a = i2;
            this.f2294d = constraintAnchor;
            this.f2295e = constraintAnchor2;
            this.f2296f = constraintAnchor3;
            this.f2297g = constraintAnchor4;
            this.f2298h = i3;
            this.f2299i = i4;
            this.f2300j = i5;
            this.f2301k = i6;
            this.f2307q = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0790  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x0498 -> B:212:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x049a -> B:212:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x04a0 -> B:212:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x04a2 -> B:212:0x04a8). Please report as a decompilation issue!!! */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1303c0(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.mo1303c0(int, int, int, int):void");
    }

    /* renamed from: e0 */
    public final int m1304e0(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.m1288x() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.f2222s;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.f2236z * i2);
                if (i4 != constraintWidget.m1280p()) {
                    constraintWidget.f2198g = true;
                    m1321d0(constraintWidget, constraintWidget.m1281q(), constraintWidget.m1289y(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
                return i4;
            }
            if (i3 == 1) {
                return constraintWidget.m1280p();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget.m1289y() * constraintWidget.f2184Y) + 0.5f);
            }
        }
        return constraintWidget.m1280p();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo1229f(LinearSystem linearSystem, boolean z) {
        ConstraintWidget constraintWidget;
        float f2;
        int i2;
        super.mo1229f(linearSystem, z);
        ConstraintWidget constraintWidget2 = this.f2181V;
        boolean z2 = constraintWidget2 != null && ((ConstraintWidgetContainer) constraintWidget2).f2249J0;
        int i3 = this.f2282h1;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = this.f2285k1.size();
                int i4 = 0;
                while (i4 < size) {
                    this.f2285k1.get(i4).m1307b(z2, i4, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int size2 = this.f2285k1.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        this.f2285k1.get(i5).m1307b(z2, i5, i5 == size2 + (-1));
                        i5++;
                    }
                }
            } else if (this.f2288n1 != null && this.f2287m1 != null && this.f2286l1 != null) {
                for (int i6 = 0; i6 < this.f2290p1; i6++) {
                    this.f2289o1[i6].m1254K();
                }
                int[] iArr = this.f2288n1;
                int i7 = iArr[0];
                int i8 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                float f3 = this.f2272X0;
                int i9 = 0;
                while (i9 < i7) {
                    if (z2) {
                        i2 = (i7 - i9) - 1;
                        f2 = 1.0f - this.f2272X0;
                    } else {
                        f2 = f3;
                        i2 = i9;
                    }
                    ConstraintWidget constraintWidget4 = this.f2287m1[i2];
                    if (constraintWidget4 != null && constraintWidget4.f2213n0 != 8) {
                        if (i9 == 0) {
                            constraintWidget4.m1274j(constraintWidget4.f2169J, this.f2169J, this.f2324K0);
                            constraintWidget4.f2225t0 = this.f2266R0;
                            constraintWidget4.f2205j0 = f2;
                        }
                        if (i9 == i7 - 1) {
                            constraintWidget4.m1274j(constraintWidget4.f2171L, this.f2171L, this.f2325L0);
                        }
                        if (i9 > 0 && constraintWidget3 != null) {
                            constraintWidget4.m1274j(constraintWidget4.f2169J, constraintWidget3.f2171L, this.f2278d1);
                            constraintWidget3.m1274j(constraintWidget3.f2171L, constraintWidget4.f2169J, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i9++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    ConstraintWidget constraintWidget5 = this.f2286l1[i10];
                    if (constraintWidget5 != null && constraintWidget5.f2213n0 != 8) {
                        if (i10 == 0) {
                            constraintWidget5.m1274j(constraintWidget5.f2170K, this.f2170K, this.f2320G0);
                            constraintWidget5.f2227u0 = this.f2267S0;
                            constraintWidget5.f2207k0 = this.f2273Y0;
                        }
                        if (i10 == i8 - 1) {
                            constraintWidget5.m1274j(constraintWidget5.f2172M, this.f2172M, this.f2321H0);
                        }
                        if (i10 > 0 && constraintWidget3 != null) {
                            constraintWidget5.m1274j(constraintWidget5.f2170K, constraintWidget3.f2172M, this.f2279e1);
                            constraintWidget3.m1274j(constraintWidget3.f2172M, constraintWidget5.f2170K, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i11 = 0; i11 < i7; i11++) {
                    for (int i12 = 0; i12 < i8; i12++) {
                        int i13 = (i12 * i7) + i11;
                        if (this.f2284j1 == 1) {
                            i13 = (i11 * i8) + i12;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f2289o1;
                        if (i13 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i13]) != null && constraintWidget.f2213n0 != 8) {
                            ConstraintWidget constraintWidget6 = this.f2287m1[i11];
                            ConstraintWidget constraintWidget7 = this.f2286l1[i12];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.m1274j(constraintWidget.f2169J, constraintWidget6.f2169J, 0);
                                constraintWidget.m1274j(constraintWidget.f2171L, constraintWidget6.f2171L, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.m1274j(constraintWidget.f2170K, constraintWidget7.f2170K, 0);
                                constraintWidget.m1274j(constraintWidget.f2172M, constraintWidget7.f2172M, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.f2285k1.size() > 0) {
            this.f2285k1.get(0).m1307b(z2, 0, true);
        }
        this.f2326M0 = false;
    }

    /* renamed from: f0 */
    public final int m1305f0(ConstraintWidget constraintWidget, int i2) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.m1281q() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.f2220r;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (constraintWidget.f2230w * i2);
                if (i4 != constraintWidget.m1289y()) {
                    constraintWidget.f2198g = true;
                    m1321d0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.m1288x(), constraintWidget.m1280p());
                }
                return i4;
            }
            if (i3 == 1) {
                return constraintWidget.m1289y();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget.m1280p() * constraintWidget.f2184Y) + 0.5f);
            }
        }
        return constraintWidget.m1289y();
    }
}
