package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ChainRun extends WidgetRun {

    /* renamed from: k */
    public ArrayList<WidgetRun> f2345k;

    /* renamed from: l */
    public int f2346l;

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        this.f2345k = new ArrayList<>();
        this.f2399f = i2;
        ConstraintWidget constraintWidget3 = this.f2395b;
        ConstraintWidget m1283s = constraintWidget3.m1283s(i2);
        while (true) {
            ConstraintWidget constraintWidget4 = m1283s;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                m1283s = constraintWidget3.m1283s(this.f2399f);
            }
        }
        this.f2395b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.f2345k;
        int i3 = this.f2399f;
        arrayList.add(i3 == 0 ? constraintWidget2.f2192d : i3 == 1 ? constraintWidget2.f2194e : null);
        ConstraintWidget m1282r = constraintWidget2.m1282r(this.f2399f);
        while (m1282r != null) {
            ArrayList<WidgetRun> arrayList2 = this.f2345k;
            int i4 = this.f2399f;
            arrayList2.add(i4 == 0 ? m1282r.f2192d : i4 == 1 ? m1282r.f2194e : null);
            m1282r = m1282r.m1282r(this.f2399f);
        }
        Iterator<WidgetRun> it = this.f2345k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i5 = this.f2399f;
            if (i5 == 0) {
                next.f2395b.f2188b = this;
            } else if (i5 == 1) {
                next.f2395b.f2190c = this;
            }
        }
        if ((this.f2399f == 0 && ((ConstraintWidgetContainer) this.f2395b.f2181V).f2249J0) && this.f2345k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.f2345k;
            this.f2395b = arrayList3.get(arrayList3.size() - 1).f2395b;
        }
        this.f2346l = this.f2399f == 0 ? this.f2395b.f2225t0 : this.f2395b.f2227u0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x03d2, code lost:
    
        r10 = r10 - r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1327a(androidx.constraintlayout.core.widgets.analyzer.Dependency r27) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.mo1327a(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public void mo1328d() {
        Iterator<WidgetRun> it = this.f2345k.iterator();
        while (it.hasNext()) {
            it.next().mo1328d();
        }
        int size = this.f2345k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f2345k.get(0).f2395b;
        ConstraintWidget constraintWidget2 = this.f2345k.get(size - 1).f2395b;
        if (this.f2399f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f2169J;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f2171L;
            DependencyNode m1371i = m1371i(constraintAnchor, 0);
            int m1236e = constraintAnchor.m1236e();
            ConstraintWidget m1333m = m1333m();
            if (m1333m != null) {
                m1236e = m1333m.f2169J.m1236e();
            }
            if (m1371i != null) {
                DependencyNode dependencyNode = this.f2401h;
                dependencyNode.f2366l.add(m1371i);
                dependencyNode.f2360f = m1236e;
                m1371i.f2365k.add(dependencyNode);
            }
            DependencyNode m1371i2 = m1371i(constraintAnchor2, 0);
            int m1236e2 = constraintAnchor2.m1236e();
            ConstraintWidget m1334n = m1334n();
            if (m1334n != null) {
                m1236e2 = m1334n.f2171L.m1236e();
            }
            if (m1371i2 != null) {
                DependencyNode dependencyNode2 = this.f2402i;
                dependencyNode2.f2366l.add(m1371i2);
                dependencyNode2.f2360f = -m1236e2;
                m1371i2.f2365k.add(dependencyNode2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f2170K;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f2172M;
            DependencyNode m1371i3 = m1371i(constraintAnchor3, 1);
            int m1236e3 = constraintAnchor3.m1236e();
            ConstraintWidget m1333m2 = m1333m();
            if (m1333m2 != null) {
                m1236e3 = m1333m2.f2170K.m1236e();
            }
            if (m1371i3 != null) {
                DependencyNode dependencyNode3 = this.f2401h;
                dependencyNode3.f2366l.add(m1371i3);
                dependencyNode3.f2360f = m1236e3;
                m1371i3.f2365k.add(dependencyNode3);
            }
            DependencyNode m1371i4 = m1371i(constraintAnchor4, 1);
            int m1236e4 = constraintAnchor4.m1236e();
            ConstraintWidget m1334n2 = m1334n();
            if (m1334n2 != null) {
                m1236e4 = m1334n2.f2172M.m1236e();
            }
            if (m1371i4 != null) {
                DependencyNode dependencyNode4 = this.f2402i;
                dependencyNode4.f2366l.add(m1371i4);
                dependencyNode4.f2360f = -m1236e4;
                m1371i4.f2365k.add(dependencyNode4);
            }
        }
        this.f2401h.f2355a = this;
        this.f2402i.f2355a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: e */
    public void mo1329e() {
        for (int i2 = 0; i2 < this.f2345k.size(); i2++) {
            this.f2345k.get(i2).mo1329e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: f */
    public void mo1330f() {
        this.f2396c = null;
        Iterator<WidgetRun> it = this.f2345k.iterator();
        while (it.hasNext()) {
            it.next().mo1330f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: j */
    public long mo1331j() {
        int size = this.f2345k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = r4.f2402i.f2360f + this.f2345k.get(i2).mo1331j() + j2 + r4.f2401h.f2360f;
        }
        return j2;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: k */
    public boolean mo1332k() {
        int size = this.f2345k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2345k.get(i2).mo1332k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final ConstraintWidget m1333m() {
        for (int i2 = 0; i2 < this.f2345k.size(); i2++) {
            ConstraintWidget constraintWidget = this.f2345k.get(i2).f2395b;
            if (constraintWidget.f2213n0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final ConstraintWidget m1334n() {
        for (int size = this.f2345k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f2345k.get(size).f2395b;
            if (constraintWidget.f2213n0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f2399f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.f2345k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }
}
