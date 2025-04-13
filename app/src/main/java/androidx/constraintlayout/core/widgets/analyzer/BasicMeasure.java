package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class BasicMeasure {

    /* renamed from: a */
    public final ArrayList<ConstraintWidget> f2332a = new ArrayList<>();

    /* renamed from: b */
    public Measure f2333b = new Measure();

    /* renamed from: c */
    public ConstraintWidgetContainer f2334c;

    public static class Measure {

        /* renamed from: a */
        public ConstraintWidget.DimensionBehaviour f2335a;

        /* renamed from: b */
        public ConstraintWidget.DimensionBehaviour f2336b;

        /* renamed from: c */
        public int f2337c;

        /* renamed from: d */
        public int f2338d;

        /* renamed from: e */
        public int f2339e;

        /* renamed from: f */
        public int f2340f;

        /* renamed from: g */
        public int f2341g;

        /* renamed from: h */
        public boolean f2342h;

        /* renamed from: i */
        public boolean f2343i;

        /* renamed from: j */
        public int f2344j;
    }

    public interface Measurer {
        /* renamed from: a */
        void mo1325a();

        /* renamed from: b */
        void mo1326b(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f2334c = constraintWidgetContainer;
    }

    /* renamed from: a */
    public final boolean m1322a(Measurer measurer, ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        this.f2333b.f2335a = constraintWidget.m1281q();
        this.f2333b.f2336b = constraintWidget.m1288x();
        this.f2333b.f2337c = constraintWidget.m1289y();
        this.f2333b.f2338d = constraintWidget.m1280p();
        Measure measure = this.f2333b;
        measure.f2343i = false;
        measure.f2344j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f2335a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = measure.f2336b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.f2184Y > 0.0f;
        boolean z4 = z2 && constraintWidget.f2184Y > 0.0f;
        if (z3 && constraintWidget.f2224t[0] == 4) {
            measure.f2335a = dimensionBehaviour;
        }
        if (z4 && constraintWidget.f2224t[1] == 4) {
            measure.f2336b = dimensionBehaviour;
        }
        measurer.mo1326b(constraintWidget, measure);
        constraintWidget.m1267X(this.f2333b.f2339e);
        constraintWidget.m1262S(this.f2333b.f2340f);
        Measure measure2 = this.f2333b;
        constraintWidget.f2164E = measure2.f2342h;
        constraintWidget.m1259P(measure2.f2341g);
        Measure measure3 = this.f2333b;
        measure3.f2344j = 0;
        return measure3.f2343i;
    }

    /* renamed from: b */
    public final void m1323b(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
        int i5 = constraintWidgetContainer.f2201h0;
        int i6 = constraintWidgetContainer.f2203i0;
        constraintWidgetContainer.m1265V(0);
        constraintWidgetContainer.m1264U(0);
        constraintWidgetContainer.f2182W = i3;
        int i7 = constraintWidgetContainer.f2201h0;
        if (i3 < i7) {
            constraintWidgetContainer.f2182W = i7;
        }
        constraintWidgetContainer.f2183X = i4;
        int i8 = constraintWidgetContainer.f2203i0;
        if (i4 < i8) {
            constraintWidgetContainer.f2183X = i8;
        }
        constraintWidgetContainer.m1265V(i5);
        constraintWidgetContainer.m1264U(i6);
        ConstraintWidgetContainer constraintWidgetContainer2 = this.f2334c;
        constraintWidgetContainer2.f2247H0 = i2;
        constraintWidgetContainer2.mo1292a0();
    }

    /* renamed from: c */
    public void m1324c(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f2332a.clear();
        int size = constraintWidgetContainer.f2331E0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f2331E0.get(i2);
            ConstraintWidget.DimensionBehaviour m1281q = constraintWidget.m1281q();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (m1281q == dimensionBehaviour || constraintWidget.m1288x() == dimensionBehaviour) {
                this.f2332a.add(constraintWidget);
            }
        }
        constraintWidgetContainer.m1299h0();
    }
}
