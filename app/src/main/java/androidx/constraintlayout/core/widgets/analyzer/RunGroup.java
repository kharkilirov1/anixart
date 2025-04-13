package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* loaded from: classes.dex */
class RunGroup {

    /* renamed from: c */
    public static int f2382c;

    /* renamed from: a */
    public WidgetRun f2383a;

    /* renamed from: b */
    public ArrayList<WidgetRun> f2384b = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i2) {
        this.f2383a = null;
        f2382c++;
        this.f2383a = widgetRun;
    }

    /* renamed from: a */
    public final long m1360a(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f2358d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.f2365k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.f2365k.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f2358d != widgetRun) {
                    j3 = Math.min(j3, m1360a(dependencyNode2, dependencyNode2.f2360f + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f2402i) {
            return j3;
        }
        long mo1331j = j2 - widgetRun.mo1331j();
        return Math.min(Math.min(j3, m1360a(widgetRun.f2401h, mo1331j)), mo1331j - widgetRun.f2401h.f2360f);
    }

    /* renamed from: b */
    public final long m1361b(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f2358d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.f2365k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = dependencyNode.f2365k.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f2358d != widgetRun) {
                    j3 = Math.max(j3, m1361b(dependencyNode2, dependencyNode2.f2360f + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f2401h) {
            return j3;
        }
        long mo1331j = j2 + widgetRun.mo1331j();
        return Math.max(Math.max(j3, m1361b(widgetRun.f2402i, mo1331j)), mo1331j - widgetRun.f2402i.f2360f);
    }
}
