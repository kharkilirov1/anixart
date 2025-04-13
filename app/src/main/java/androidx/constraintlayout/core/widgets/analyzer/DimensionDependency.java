package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DimensionDependency extends DependencyNode {

    /* renamed from: m */
    public int f2376m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f2359e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f2359e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    /* renamed from: c */
    public void mo1345c(int i2) {
        if (this.f2364j) {
            return;
        }
        this.f2364j = true;
        this.f2361g = i2;
        for (Dependency dependency : this.f2365k) {
            dependency.mo1327a(dependency);
        }
    }
}
