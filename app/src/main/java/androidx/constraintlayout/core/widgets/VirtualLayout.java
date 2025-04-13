package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {

    /* renamed from: G0 */
    public int f2320G0 = 0;

    /* renamed from: H0 */
    public int f2321H0 = 0;

    /* renamed from: I0 */
    public int f2322I0 = 0;

    /* renamed from: J0 */
    public int f2323J0 = 0;

    /* renamed from: K0 */
    public int f2324K0 = 0;

    /* renamed from: L0 */
    public int f2325L0 = 0;

    /* renamed from: M0 */
    public boolean f2326M0 = false;

    /* renamed from: N0 */
    public int f2327N0 = 0;

    /* renamed from: O0 */
    public int f2328O0 = 0;

    /* renamed from: P0 */
    public BasicMeasure.Measure f2329P0 = new BasicMeasure.Measure();

    /* renamed from: Q0 */
    public BasicMeasure.Measurer f2330Q0 = null;

    /* renamed from: b0 */
    public void m1320b0() {
        for (int i2 = 0; i2 < this.f2318F0; i2++) {
            ConstraintWidget constraintWidget = this.f2317E0[i2];
            if (constraintWidget != null) {
                constraintWidget.f2166G = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    /* renamed from: c */
    public void mo1316c(ConstraintWidgetContainer constraintWidgetContainer) {
        m1320b0();
    }

    /* renamed from: c0 */
    public void mo1303c0(int i2, int i3, int i4, int i5) {
    }

    /* renamed from: d0 */
    public void m1321d0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.f2330Q0;
            if (measurer != null || (constraintWidget2 = this.f2181V) == null) {
                break;
            } else {
                this.f2330Q0 = ((ConstraintWidgetContainer) constraintWidget2).f2248I0;
            }
        }
        BasicMeasure.Measure measure = this.f2329P0;
        measure.f2335a = dimensionBehaviour;
        measure.f2336b = dimensionBehaviour2;
        measure.f2337c = i2;
        measure.f2338d = i3;
        measurer.mo1326b(constraintWidget, measure);
        constraintWidget.m1267X(this.f2329P0.f2339e);
        constraintWidget.m1262S(this.f2329P0.f2340f);
        BasicMeasure.Measure measure2 = this.f2329P0;
        constraintWidget.f2164E = measure2.f2342h;
        constraintWidget.m1259P(measure2.f2341g);
    }
}
