package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Guideline extends ConstraintWidget {

    /* renamed from: E0 */
    public float f2309E0 = -1.0f;

    /* renamed from: F0 */
    public int f2310F0 = -1;

    /* renamed from: G0 */
    public int f2311G0 = -1;

    /* renamed from: H0 */
    public boolean f2312H0 = true;

    /* renamed from: I0 */
    public ConstraintAnchor f2313I0 = this.f2170K;

    /* renamed from: J0 */
    public int f2314J0 = 0;

    /* renamed from: K0 */
    public boolean f2315K0;

    /* renamed from: androidx.constraintlayout.core.widgets.Guideline$1 */
    public static /* synthetic */ class C01901 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2316a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2316a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2316a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2316a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2316a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2316a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2316a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2316a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2316a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2316a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Guideline() {
        this.f2178S.clear();
        this.f2178S.add(this.f2313I0);
        int length = this.f2177R.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2177R[i2] = this.f2313I0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: H */
    public boolean mo1225H() {
        return this.f2315K0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: I */
    public boolean mo1226I() {
        return this.f2315K0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: Z */
    public void mo1269Z(LinearSystem linearSystem, boolean z) {
        if (this.f2181V == null) {
            return;
        }
        int m1189o = linearSystem.m1189o(this.f2313I0);
        if (this.f2314J0 == 1) {
            this.f2187a0 = m1189o;
            this.f2189b0 = 0;
            m1262S(this.f2181V.m1280p());
            m1267X(0);
            return;
        }
        this.f2187a0 = 0;
        this.f2189b0 = m1189o;
        m1267X(this.f2181V.m1289y());
        m1262S(0);
    }

    /* renamed from: a0 */
    public void m1312a0(int i2) {
        ConstraintAnchor constraintAnchor = this.f2313I0;
        constraintAnchor.f2138b = i2;
        constraintAnchor.f2139c = true;
        this.f2315K0 = true;
    }

    /* renamed from: b0 */
    public void m1313b0(int i2) {
        if (this.f2314J0 == i2) {
            return;
        }
        this.f2314J0 = i2;
        this.f2178S.clear();
        if (this.f2314J0 == 1) {
            this.f2313I0 = this.f2169J;
        } else {
            this.f2313I0 = this.f2170K;
        }
        this.f2178S.add(this.f2313I0);
        int length = this.f2177R.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f2177R[i3] = this.f2313I0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo1229f(LinearSystem linearSystem, boolean z) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.f2181V;
        if (constraintWidgetContainer == null) {
            return;
        }
        Object mo1277m = constraintWidgetContainer.mo1277m(ConstraintAnchor.Type.LEFT);
        Object mo1277m2 = constraintWidgetContainer.mo1277m(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f2181V;
        boolean z2 = constraintWidget != null && constraintWidget.f2180U[0] == dimensionBehaviour;
        if (this.f2314J0 == 0) {
            mo1277m = constraintWidgetContainer.mo1277m(ConstraintAnchor.Type.TOP);
            mo1277m2 = constraintWidgetContainer.mo1277m(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f2181V;
            z2 = constraintWidget2 != null && constraintWidget2.f2180U[1] == dimensionBehaviour;
        }
        if (this.f2315K0) {
            ConstraintAnchor constraintAnchor = this.f2313I0;
            if (constraintAnchor.f2139c) {
                SolverVariable m1186l = linearSystem.m1186l(constraintAnchor);
                linearSystem.m1179e(m1186l, this.f2313I0.m1235d());
                if (this.f2310F0 != -1) {
                    if (z2) {
                        linearSystem.m1180f(linearSystem.m1186l(mo1277m2), m1186l, 0, 5);
                    }
                } else if (this.f2311G0 != -1 && z2) {
                    SolverVariable m1186l2 = linearSystem.m1186l(mo1277m2);
                    linearSystem.m1180f(m1186l, linearSystem.m1186l(mo1277m), 0, 5);
                    linearSystem.m1180f(m1186l2, m1186l, 0, 5);
                }
                this.f2315K0 = false;
                return;
            }
        }
        if (this.f2310F0 != -1) {
            SolverVariable m1186l3 = linearSystem.m1186l(this.f2313I0);
            linearSystem.m1178d(m1186l3, linearSystem.m1186l(mo1277m), this.f2310F0, 8);
            if (z2) {
                linearSystem.m1180f(linearSystem.m1186l(mo1277m2), m1186l3, 0, 5);
                return;
            }
            return;
        }
        if (this.f2311G0 != -1) {
            SolverVariable m1186l4 = linearSystem.m1186l(this.f2313I0);
            SolverVariable m1186l5 = linearSystem.m1186l(mo1277m2);
            linearSystem.m1178d(m1186l4, m1186l5, -this.f2311G0, 8);
            if (z2) {
                linearSystem.m1180f(m1186l4, linearSystem.m1186l(mo1277m), 0, 5);
                linearSystem.m1180f(m1186l5, m1186l4, 0, 5);
                return;
            }
            return;
        }
        if (this.f2309E0 != -1.0f) {
            SolverVariable m1186l6 = linearSystem.m1186l(this.f2313I0);
            SolverVariable m1186l7 = linearSystem.m1186l(mo1277m2);
            float f2 = this.f2309E0;
            ArrayRow m1187m = linearSystem.m1187m();
            m1187m.f1897d.mo1154d(m1186l6, -1.0f);
            m1187m.f1897d.mo1154d(m1186l7, f2);
            linearSystem.m1177c(m1187m);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo1230g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: m */
    public ConstraintAnchor mo1277m(ConstraintAnchor.Type type) {
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f2314J0 == 0) {
                return this.f2313I0;
            }
            return null;
        }
        if (this.f2314J0 == 1) {
            return this.f2313I0;
        }
        return null;
    }
}
