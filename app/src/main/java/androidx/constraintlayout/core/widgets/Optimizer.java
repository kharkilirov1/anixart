package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Optimizer {

    /* renamed from: a */
    public static boolean[] f2319a = new boolean[3];

    /* renamed from: a */
    public static void m1318a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        constraintWidget.f2214o = -1;
        constraintWidget.f2216p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidgetContainer.f2180U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour2 != dimensionBehaviour3 && constraintWidget.f2180U[0] == dimensionBehaviour) {
            int i2 = constraintWidget.f2169J.f2143g;
            int m1289y = constraintWidgetContainer.m1289y() - constraintWidget.f2171L.f2143g;
            ConstraintAnchor constraintAnchor = constraintWidget.f2169J;
            constraintAnchor.f2145i = linearSystem.m1186l(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f2171L;
            constraintAnchor2.f2145i = linearSystem.m1186l(constraintAnchor2);
            linearSystem.m1179e(constraintWidget.f2169J.f2145i, i2);
            linearSystem.m1179e(constraintWidget.f2171L.f2145i, m1289y);
            constraintWidget.f2214o = 2;
            constraintWidget.f2187a0 = i2;
            int i3 = m1289y - i2;
            constraintWidget.f2182W = i3;
            int i4 = constraintWidget.f2201h0;
            if (i3 < i4) {
                constraintWidget.f2182W = i4;
            }
        }
        if (constraintWidgetContainer.f2180U[1] == dimensionBehaviour3 || constraintWidget.f2180U[1] != dimensionBehaviour) {
            return;
        }
        int i5 = constraintWidget.f2170K.f2143g;
        int m1280p = constraintWidgetContainer.m1280p() - constraintWidget.f2172M.f2143g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f2170K;
        constraintAnchor3.f2145i = linearSystem.m1186l(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f2172M;
        constraintAnchor4.f2145i = linearSystem.m1186l(constraintAnchor4);
        linearSystem.m1179e(constraintWidget.f2170K.f2145i, i5);
        linearSystem.m1179e(constraintWidget.f2172M.f2145i, m1280p);
        if (constraintWidget.f2199g0 > 0 || constraintWidget.f2213n0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f2173N;
            constraintAnchor5.f2145i = linearSystem.m1186l(constraintAnchor5);
            linearSystem.m1179e(constraintWidget.f2173N.f2145i, constraintWidget.f2199g0 + i5);
        }
        constraintWidget.f2216p = 2;
        constraintWidget.f2189b0 = i5;
        int i6 = m1280p - i5;
        constraintWidget.f2183X = i6;
        int i7 = constraintWidget.f2203i0;
        if (i6 < i7) {
            constraintWidget.f2183X = i7;
        }
    }

    /* renamed from: b */
    public static final boolean m1319b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
