package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* loaded from: classes.dex */
class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    public void mo1327a(Dependency dependency) {
        Barrier barrier = (Barrier) this.f2395b;
        int i2 = barrier.f2113G0;
        int i3 = 0;
        Iterator<DependencyNode> it = this.f2401h.f2366l.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = it.next().f2361g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            this.f2401h.mo1345c(i4 + barrier.f2115I0);
        } else {
            this.f2401h.mo1345c(i3 + barrier.f2115I0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public void mo1328d() {
        ConstraintWidget constraintWidget = this.f2395b;
        if (constraintWidget instanceof Barrier) {
            DependencyNode dependencyNode = this.f2401h;
            dependencyNode.f2356b = true;
            Barrier barrier = (Barrier) constraintWidget;
            int i2 = barrier.f2113G0;
            boolean z = barrier.f2114H0;
            int i3 = 0;
            if (i2 == 0) {
                dependencyNode.f2359e = DependencyNode.Type.LEFT;
                while (i3 < barrier.f2318F0) {
                    ConstraintWidget constraintWidget2 = barrier.f2317E0[i3];
                    if (z || constraintWidget2.f2213n0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f2192d.f2401h;
                        dependencyNode2.f2365k.add(this.f2401h);
                        this.f2401h.f2366l.add(dependencyNode2);
                    }
                    i3++;
                }
                m1357m(this.f2395b.f2192d.f2401h);
                m1357m(this.f2395b.f2192d.f2402i);
                return;
            }
            if (i2 == 1) {
                dependencyNode.f2359e = DependencyNode.Type.RIGHT;
                while (i3 < barrier.f2318F0) {
                    ConstraintWidget constraintWidget3 = barrier.f2317E0[i3];
                    if (z || constraintWidget3.f2213n0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f2192d.f2402i;
                        dependencyNode3.f2365k.add(this.f2401h);
                        this.f2401h.f2366l.add(dependencyNode3);
                    }
                    i3++;
                }
                m1357m(this.f2395b.f2192d.f2401h);
                m1357m(this.f2395b.f2192d.f2402i);
                return;
            }
            if (i2 == 2) {
                dependencyNode.f2359e = DependencyNode.Type.TOP;
                while (i3 < barrier.f2318F0) {
                    ConstraintWidget constraintWidget4 = barrier.f2317E0[i3];
                    if (z || constraintWidget4.f2213n0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f2194e.f2401h;
                        dependencyNode4.f2365k.add(this.f2401h);
                        this.f2401h.f2366l.add(dependencyNode4);
                    }
                    i3++;
                }
                m1357m(this.f2395b.f2194e.f2401h);
                m1357m(this.f2395b.f2194e.f2402i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            dependencyNode.f2359e = DependencyNode.Type.BOTTOM;
            while (i3 < barrier.f2318F0) {
                ConstraintWidget constraintWidget5 = barrier.f2317E0[i3];
                if (z || constraintWidget5.f2213n0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f2194e.f2402i;
                    dependencyNode5.f2365k.add(this.f2401h);
                    this.f2401h.f2366l.add(dependencyNode5);
                }
                i3++;
            }
            m1357m(this.f2395b.f2194e.f2401h);
            m1357m(this.f2395b.f2194e.f2402i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: e */
    public void mo1329e() {
        ConstraintWidget constraintWidget = this.f2395b;
        if (constraintWidget instanceof Barrier) {
            int i2 = ((Barrier) constraintWidget).f2113G0;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.f2187a0 = this.f2401h.f2361g;
            } else {
                constraintWidget.f2189b0 = this.f2401h.f2361g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: f */
    public void mo1330f() {
        this.f2396c = null;
        this.f2401h.m1344b();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: k */
    public boolean mo1332k() {
        return false;
    }

    /* renamed from: m */
    public final void m1357m(DependencyNode dependencyNode) {
        this.f2401h.f2365k.add(dependencyNode);
        dependencyNode.f2366l.add(this.f2401h);
    }
}
