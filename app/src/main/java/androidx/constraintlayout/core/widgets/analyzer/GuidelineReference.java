package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

/* loaded from: classes.dex */
class GuidelineReference extends WidgetRun {
    public GuidelineReference(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2192d.mo1330f();
        constraintWidget.f2194e.mo1330f();
        this.f2399f = ((Guideline) constraintWidget).f2314J0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    public void mo1327a(Dependency dependency) {
        DependencyNode dependencyNode = this.f2401h;
        if (dependencyNode.f2357c && !dependencyNode.f2364j) {
            this.f2401h.mo1345c((int) ((dependencyNode.f2366l.get(0).f2361g * ((Guideline) this.f2395b).f2309E0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public void mo1328d() {
        ConstraintWidget constraintWidget = this.f2395b;
        Guideline guideline = (Guideline) constraintWidget;
        int i2 = guideline.f2310F0;
        int i3 = guideline.f2311G0;
        if (guideline.f2314J0 == 1) {
            if (i2 != -1) {
                this.f2401h.f2366l.add(constraintWidget.f2181V.f2192d.f2401h);
                this.f2395b.f2181V.f2192d.f2401h.f2365k.add(this.f2401h);
                this.f2401h.f2360f = i2;
            } else if (i3 != -1) {
                this.f2401h.f2366l.add(constraintWidget.f2181V.f2192d.f2402i);
                this.f2395b.f2181V.f2192d.f2402i.f2365k.add(this.f2401h);
                this.f2401h.f2360f = -i3;
            } else {
                DependencyNode dependencyNode = this.f2401h;
                dependencyNode.f2356b = true;
                dependencyNode.f2366l.add(constraintWidget.f2181V.f2192d.f2402i);
                this.f2395b.f2181V.f2192d.f2402i.f2365k.add(this.f2401h);
            }
            m1356m(this.f2395b.f2192d.f2401h);
            m1356m(this.f2395b.f2192d.f2402i);
            return;
        }
        if (i2 != -1) {
            this.f2401h.f2366l.add(constraintWidget.f2181V.f2194e.f2401h);
            this.f2395b.f2181V.f2194e.f2401h.f2365k.add(this.f2401h);
            this.f2401h.f2360f = i2;
        } else if (i3 != -1) {
            this.f2401h.f2366l.add(constraintWidget.f2181V.f2194e.f2402i);
            this.f2395b.f2181V.f2194e.f2402i.f2365k.add(this.f2401h);
            this.f2401h.f2360f = -i3;
        } else {
            DependencyNode dependencyNode2 = this.f2401h;
            dependencyNode2.f2356b = true;
            dependencyNode2.f2366l.add(constraintWidget.f2181V.f2194e.f2402i);
            this.f2395b.f2181V.f2194e.f2402i.f2365k.add(this.f2401h);
        }
        m1356m(this.f2395b.f2194e.f2401h);
        m1356m(this.f2395b.f2194e.f2402i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: e */
    public void mo1329e() {
        ConstraintWidget constraintWidget = this.f2395b;
        if (((Guideline) constraintWidget).f2314J0 == 1) {
            constraintWidget.f2187a0 = this.f2401h.f2361g;
        } else {
            constraintWidget.f2189b0 = this.f2401h.f2361g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: f */
    public void mo1330f() {
        this.f2401h.m1344b();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: k */
    public boolean mo1332k() {
        return false;
    }

    /* renamed from: m */
    public final void m1356m(DependencyNode dependencyNode) {
        this.f2401h.f2365k.add(dependencyNode);
        dependencyNode.f2366l.add(this.f2401h);
    }
}
