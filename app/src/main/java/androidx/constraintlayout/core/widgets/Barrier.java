package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Barrier extends HelperWidget {

    /* renamed from: G0 */
    public int f2113G0 = 0;

    /* renamed from: H0 */
    public boolean f2114H0 = true;

    /* renamed from: I0 */
    public int f2115I0 = 0;

    /* renamed from: J0 */
    public boolean f2116J0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: H */
    public boolean mo1225H() {
        return this.f2116J0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: I */
    public boolean mo1226I() {
        return this.f2116J0;
    }

    /* renamed from: b0 */
    public boolean m1227b0() {
        int i2;
        int i3;
        int i4;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.BOTTOM;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.LEFT;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.f2318F0;
            if (i5 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget = this.f2317E0[i5];
            if ((this.f2114H0 || constraintWidget.mo1230g()) && ((((i3 = this.f2113G0) == 0 || i3 == 1) && !constraintWidget.mo1225H()) || (((i4 = this.f2113G0) == 2 || i4 == 3) && !constraintWidget.mo1226I()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < this.f2318F0; i7++) {
            ConstraintWidget constraintWidget2 = this.f2317E0[i7];
            if (this.f2114H0 || constraintWidget2.mo1230g()) {
                if (!z2) {
                    int i8 = this.f2113G0;
                    if (i8 == 0) {
                        i6 = constraintWidget2.mo1277m(type4).m1235d();
                    } else if (i8 == 1) {
                        i6 = constraintWidget2.mo1277m(type3).m1235d();
                    } else if (i8 == 2) {
                        i6 = constraintWidget2.mo1277m(type2).m1235d();
                    } else if (i8 == 3) {
                        i6 = constraintWidget2.mo1277m(type).m1235d();
                    }
                    z2 = true;
                }
                int i9 = this.f2113G0;
                if (i9 == 0) {
                    i6 = Math.min(i6, constraintWidget2.mo1277m(type4).m1235d());
                } else if (i9 == 1) {
                    i6 = Math.max(i6, constraintWidget2.mo1277m(type3).m1235d());
                } else if (i9 == 2) {
                    i6 = Math.min(i6, constraintWidget2.mo1277m(type2).m1235d());
                } else if (i9 == 3) {
                    i6 = Math.max(i6, constraintWidget2.mo1277m(type).m1235d());
                }
            }
        }
        int i10 = i6 + this.f2115I0;
        int i11 = this.f2113G0;
        if (i11 == 0 || i11 == 1) {
            m1260Q(i10, i10);
        } else {
            m1261R(i10, i10);
        }
        this.f2116J0 = true;
        return true;
    }

    /* renamed from: c0 */
    public int m1228c0() {
        int i2 = this.f2113G0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo1229f(LinearSystem linearSystem, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i2;
        int i3;
        int i4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintAnchor[] constraintAnchorArr2 = this.f2177R;
        constraintAnchorArr2[0] = this.f2169J;
        constraintAnchorArr2[2] = this.f2170K;
        constraintAnchorArr2[1] = this.f2171L;
        constraintAnchorArr2[3] = this.f2172M;
        int i5 = 0;
        while (true) {
            constraintAnchorArr = this.f2177R;
            if (i5 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i5].f2145i = linearSystem.m1186l(constraintAnchorArr[i5]);
            i5++;
        }
        int i6 = this.f2113G0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i6];
        if (!this.f2116J0) {
            m1227b0();
        }
        if (this.f2116J0) {
            this.f2116J0 = false;
            int i7 = this.f2113G0;
            if (i7 == 0 || i7 == 1) {
                linearSystem.m1179e(this.f2169J.f2145i, this.f2187a0);
                linearSystem.m1179e(this.f2171L.f2145i, this.f2187a0);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    linearSystem.m1179e(this.f2170K.f2145i, this.f2189b0);
                    linearSystem.m1179e(this.f2172M.f2145i, this.f2189b0);
                    return;
                }
                return;
            }
        }
        for (int i8 = 0; i8 < this.f2318F0; i8++) {
            ConstraintWidget constraintWidget = this.f2317E0[i8];
            if ((this.f2114H0 || constraintWidget.mo1230g()) && ((((i3 = this.f2113G0) == 0 || i3 == 1) && constraintWidget.m1281q() == dimensionBehaviour && constraintWidget.f2169J.f2142f != null && constraintWidget.f2171L.f2142f != null) || (((i4 = this.f2113G0) == 2 || i4 == 3) && constraintWidget.m1288x() == dimensionBehaviour && constraintWidget.f2170K.f2142f != null && constraintWidget.f2172M.f2142f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f2169J.m1238g() || this.f2171L.m1238g();
        boolean z4 = this.f2170K.m1238g() || this.f2172M.m1238g();
        int i9 = !z2 && (((i2 = this.f2113G0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.f2318F0; i10++) {
            ConstraintWidget constraintWidget2 = this.f2317E0[i10];
            if (this.f2114H0 || constraintWidget2.mo1230g()) {
                SolverVariable m1186l = linearSystem.m1186l(constraintWidget2.f2177R[this.f2113G0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f2177R;
                int i11 = this.f2113G0;
                constraintAnchorArr3[i11].f2145i = m1186l;
                int i12 = (constraintAnchorArr3[i11].f2142f == null || constraintAnchorArr3[i11].f2142f.f2140d != this) ? 0 : constraintAnchorArr3[i11].f2143g + 0;
                if (i11 == 0 || i11 == 2) {
                    SolverVariable solverVariable = constraintAnchor.f2145i;
                    int i13 = this.f2115I0 - i12;
                    ArrayRow m1187m = linearSystem.m1187m();
                    SolverVariable m1188n = linearSystem.m1188n();
                    m1188n.f1933e = 0;
                    m1187m.m1168g(solverVariable, m1186l, m1188n, i13);
                    linearSystem.m1177c(m1187m);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor.f2145i;
                    int i14 = this.f2115I0 + i12;
                    ArrayRow m1187m2 = linearSystem.m1187m();
                    SolverVariable m1188n2 = linearSystem.m1188n();
                    m1188n2.f1933e = 0;
                    m1187m2.m1167f(solverVariable2, m1186l, m1188n2, i14);
                    linearSystem.m1177c(m1187m2);
                }
                linearSystem.m1178d(constraintAnchor.f2145i, m1186l, this.f2115I0 + i12, i9);
            }
        }
        int i15 = this.f2113G0;
        if (i15 == 0) {
            linearSystem.m1178d(this.f2171L.f2145i, this.f2169J.f2145i, 0, 8);
            linearSystem.m1178d(this.f2169J.f2145i, this.f2181V.f2171L.f2145i, 0, 4);
            linearSystem.m1178d(this.f2169J.f2145i, this.f2181V.f2169J.f2145i, 0, 0);
            return;
        }
        if (i15 == 1) {
            linearSystem.m1178d(this.f2169J.f2145i, this.f2171L.f2145i, 0, 8);
            linearSystem.m1178d(this.f2169J.f2145i, this.f2181V.f2169J.f2145i, 0, 4);
            linearSystem.m1178d(this.f2169J.f2145i, this.f2181V.f2171L.f2145i, 0, 0);
        } else if (i15 == 2) {
            linearSystem.m1178d(this.f2172M.f2145i, this.f2170K.f2145i, 0, 8);
            linearSystem.m1178d(this.f2170K.f2145i, this.f2181V.f2172M.f2145i, 0, 4);
            linearSystem.m1178d(this.f2170K.f2145i, this.f2181V.f2170K.f2145i, 0, 0);
        } else if (i15 == 3) {
            linearSystem.m1178d(this.f2170K.f2145i, this.f2172M.f2145i, 0, 8);
            linearSystem.m1178d(this.f2170K.f2145i, this.f2181V.f2170K.f2145i, 0, 4);
            linearSystem.m1178d(this.f2170K.f2145i, this.f2181V.f2172M.f2145i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo1230g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String m20q = C0000a.m20q(C0000a.m24u("[Barrier] "), this.f2217p0, " {");
        for (int i2 = 0; i2 < this.f2318F0; i2++) {
            ConstraintWidget constraintWidget = this.f2317E0[i2];
            if (i2 > 0) {
                m20q = C0000a.m14k(m20q, ", ");
            }
            StringBuilder m24u = C0000a.m24u(m20q);
            m24u.append(constraintWidget.f2217p0);
            m20q = m24u.toString();
        }
        return C0000a.m14k(m20q, "}");
    }
}
