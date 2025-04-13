package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class WidgetContainer extends ConstraintWidget {

    /* renamed from: E0 */
    public ArrayList<ConstraintWidget> f2331E0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: J */
    public void mo1253J() {
        this.f2331E0.clear();
        super.mo1253J();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: M */
    public void mo1256M(Cache cache) {
        super.mo1256M(cache);
        int size = this.f2331E0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2331E0.get(i2).mo1256M(cache);
        }
    }

    /* renamed from: a0 */
    public void mo1292a0() {
        ArrayList<ConstraintWidget> arrayList = this.f2331E0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.f2331E0.get(i2);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).mo1292a0();
            }
        }
    }
}
