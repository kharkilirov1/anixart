package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Grouping {
    /* renamed from: a */
    public static WidgetGroup m1353a(ConstraintWidget constraintWidget, int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int i3;
        int i4 = i2 == 0 ? constraintWidget.f2161C0 : constraintWidget.f2163D0;
        if (i4 != -1 && (widgetGroup == null || i4 != widgetGroup.f2390b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i5);
                if (widgetGroup2.f2390b == i4) {
                    if (widgetGroup != null) {
                        widgetGroup.m1366d(i2, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if (constraintWidget instanceof HelperWidget) {
                HelperWidget helperWidget = (HelperWidget) constraintWidget;
                int i6 = 0;
                while (true) {
                    if (i6 >= helperWidget.f2318F0) {
                        i3 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = helperWidget.f2317E0[i6];
                    if ((i2 == 0 && (i3 = constraintWidget2.f2161C0) != -1) || (i2 == 1 && (i3 = constraintWidget2.f2163D0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        WidgetGroup widgetGroup3 = arrayList.get(i7);
                        if (widgetGroup3.f2390b == i3) {
                            widgetGroup = widgetGroup3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i2);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.m1363a(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                guideline.f2313I0.m1234c(guideline.f2314J0 == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i2 == 0) {
                constraintWidget.f2161C0 = widgetGroup.f2390b;
                constraintWidget.f2169J.m1234c(i2, arrayList, widgetGroup);
                constraintWidget.f2171L.m1234c(i2, arrayList, widgetGroup);
            } else {
                constraintWidget.f2163D0 = widgetGroup.f2390b;
                constraintWidget.f2170K.m1234c(i2, arrayList, widgetGroup);
                constraintWidget.f2173N.m1234c(i2, arrayList, widgetGroup);
                constraintWidget.f2172M.m1234c(i2, arrayList, widgetGroup);
            }
            constraintWidget.f2176Q.m1234c(i2, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    /* renamed from: b */
    public static WidgetGroup m1354b(ArrayList<WidgetGroup> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WidgetGroup widgetGroup = arrayList.get(i3);
            if (i2 == widgetGroup.f2390b) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m1355c(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == dimensionBehaviour6 || (dimensionBehaviour3 == dimensionBehaviour5 && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour6 || (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour2 != dimensionBehaviour6));
    }
}
