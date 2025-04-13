package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {

    /* renamed from: E0 */
    public ConstraintWidget[] f2317E0 = new ConstraintWidget[4];

    /* renamed from: F0 */
    public int f2318F0 = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* renamed from: a */
    public void mo1314a() {
        this.f2318F0 = 0;
        Arrays.fill(this.f2317E0, (Object) null);
    }

    /* renamed from: a0 */
    public void m1317a0(ArrayList<WidgetGroup> arrayList, int i2, WidgetGroup widgetGroup) {
        for (int i3 = 0; i3 < this.f2318F0; i3++) {
            widgetGroup.m1363a(this.f2317E0[i3]);
        }
        for (int i4 = 0; i4 < this.f2318F0; i4++) {
            Grouping.m1353a(this.f2317E0[i4], i2, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* renamed from: b */
    public void mo1315b(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i2 = this.f2318F0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f2317E0;
        if (i2 > constraintWidgetArr.length) {
            this.f2317E0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f2317E0;
        int i3 = this.f2318F0;
        constraintWidgetArr2[i3] = constraintWidget;
        this.f2318F0 = i3 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* renamed from: c */
    public void mo1316c(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
