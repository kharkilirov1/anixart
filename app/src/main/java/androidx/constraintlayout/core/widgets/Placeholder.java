package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* loaded from: classes.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /* renamed from: c0 */
    public void mo1303c0(int i2, int i3, int i4, int i5) {
        int i6 = this.f2324K0 + this.f2325L0 + 0;
        int i7 = this.f2320G0 + this.f2321H0 + 0;
        if (this.f2318F0 > 0) {
            i6 += this.f2317E0[0].m1289y();
            i7 += this.f2317E0[0].m1280p();
        }
        int max = Math.max(this.f2201h0, i6);
        int max2 = Math.max(this.f2203i0, i7);
        if (i2 != 1073741824) {
            i3 = i2 == Integer.MIN_VALUE ? Math.min(max, i3) : i2 == 0 ? max : 0;
        }
        if (i4 != 1073741824) {
            i5 = i4 == Integer.MIN_VALUE ? Math.min(max2, i5) : i4 == 0 ? max2 : 0;
        }
        this.f2327N0 = i3;
        this.f2328O0 = i5;
        m1267X(i3);
        m1262S(i5);
        this.f2326M0 = this.f2318F0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo1229f(LinearSystem linearSystem, boolean z) {
        super.mo1229f(linearSystem, z);
        if (this.f2318F0 > 0) {
            ConstraintWidget constraintWidget = this.f2317E0[0];
            constraintWidget.m1254K();
            constraintWidget.f2207k0 = 0.5f;
            constraintWidget.f2205j0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.m1273i(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.m1273i(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.m1273i(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.m1273i(type4, this, type4, 0);
        }
    }
}
