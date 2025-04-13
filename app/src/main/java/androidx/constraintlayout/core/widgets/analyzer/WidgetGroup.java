package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes.dex */
public class WidgetGroup {

    /* renamed from: f */
    public static int f2388f;

    /* renamed from: b */
    public int f2390b;

    /* renamed from: c */
    public int f2391c;

    /* renamed from: a */
    public ArrayList<ConstraintWidget> f2389a = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<MeasureResult> f2392d = null;

    /* renamed from: e */
    public int f2393e = -1;

    public class MeasureResult {
        public MeasureResult(WidgetGroup widgetGroup, ConstraintWidget constraintWidget, LinearSystem linearSystem, int i2) {
            new WeakReference(constraintWidget);
            linearSystem.m1189o(constraintWidget.f2169J);
            linearSystem.m1189o(constraintWidget.f2170K);
            linearSystem.m1189o(constraintWidget.f2171L);
            linearSystem.m1189o(constraintWidget.f2172M);
            linearSystem.m1189o(constraintWidget.f2173N);
        }
    }

    public WidgetGroup(int i2) {
        this.f2390b = -1;
        this.f2391c = 0;
        int i3 = f2388f;
        f2388f = i3 + 1;
        this.f2390b = i3;
        this.f2391c = i2;
    }

    /* renamed from: a */
    public boolean m1363a(ConstraintWidget constraintWidget) {
        if (this.f2389a.contains(constraintWidget)) {
            return false;
        }
        this.f2389a.add(constraintWidget);
        return true;
    }

    /* renamed from: b */
    public void m1364b(ArrayList<WidgetGroup> arrayList) {
        int size = this.f2389a.size();
        if (this.f2393e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                WidgetGroup widgetGroup = arrayList.get(i2);
                if (this.f2393e == widgetGroup.f2390b) {
                    m1366d(this.f2391c, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m1365c(LinearSystem linearSystem, int i2) {
        int m1189o;
        int m1189o2;
        if (this.f2389a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f2389a;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).f2181V;
        linearSystem.m1195u();
        constraintWidgetContainer.mo1229f(linearSystem, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList.get(i3).mo1229f(linearSystem, false);
        }
        if (i2 == 0 && constraintWidgetContainer.f2253N0 > 0) {
            Chain.m1231a(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i2 == 1 && constraintWidgetContainer.f2254O0 > 0) {
            Chain.m1231a(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.m1191q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2392d = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f2392d.add(new MeasureResult(this, arrayList.get(i4), linearSystem, i2));
        }
        if (i2 == 0) {
            m1189o = linearSystem.m1189o(constraintWidgetContainer.f2169J);
            m1189o2 = linearSystem.m1189o(constraintWidgetContainer.f2171L);
            linearSystem.m1195u();
        } else {
            m1189o = linearSystem.m1189o(constraintWidgetContainer.f2170K);
            m1189o2 = linearSystem.m1189o(constraintWidgetContainer.f2172M);
            linearSystem.m1195u();
        }
        return m1189o2 - m1189o;
    }

    /* renamed from: d */
    public void m1366d(int i2, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.f2389a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.m1363a(next);
            if (i2 == 0) {
                next.f2161C0 = widgetGroup.f2390b;
            } else {
                next.f2163D0 = widgetGroup.f2390b;
            }
        }
        this.f2393e = widgetGroup.f2390b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f2391c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String m18o = C0000a.m18o(sb, this.f2390b, "] <");
        Iterator<ConstraintWidget> it = this.f2389a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            StringBuilder m27x = C0000a.m27x(m18o, " ");
            m27x.append(next.f2217p0);
            m18o = m27x.toString();
        }
        return C0000a.m14k(m18o, " >");
    }
}
