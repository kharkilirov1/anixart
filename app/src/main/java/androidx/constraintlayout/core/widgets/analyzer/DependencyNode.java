package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DependencyNode implements Dependency {

    /* renamed from: d */
    public WidgetRun f2358d;

    /* renamed from: f */
    public int f2360f;

    /* renamed from: g */
    public int f2361g;

    /* renamed from: a */
    public Dependency f2355a = null;

    /* renamed from: b */
    public boolean f2356b = false;

    /* renamed from: c */
    public boolean f2357c = false;

    /* renamed from: e */
    public Type f2359e = Type.UNKNOWN;

    /* renamed from: h */
    public int f2362h = 1;

    /* renamed from: i */
    public DimensionDependency f2363i = null;

    /* renamed from: j */
    public boolean f2364j = false;

    /* renamed from: k */
    public List<Dependency> f2365k = new ArrayList();

    /* renamed from: l */
    public List<DependencyNode> f2366l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f2358d = widgetRun;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    /* renamed from: a */
    public void mo1327a(Dependency dependency) {
        Iterator<DependencyNode> it = this.f2366l.iterator();
        while (it.hasNext()) {
            if (!it.next().f2364j) {
                return;
            }
        }
        this.f2357c = true;
        Dependency dependency2 = this.f2355a;
        if (dependency2 != null) {
            dependency2.mo1327a(this);
        }
        if (this.f2356b) {
            this.f2358d.mo1327a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i2 = 0;
        for (DependencyNode dependencyNode2 : this.f2366l) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i2++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i2 == 1 && dependencyNode.f2364j) {
            DimensionDependency dimensionDependency = this.f2363i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.f2364j) {
                    return;
                } else {
                    this.f2360f = this.f2362h * dimensionDependency.f2361g;
                }
            }
            mo1345c(dependencyNode.f2361g + this.f2360f);
        }
        Dependency dependency3 = this.f2355a;
        if (dependency3 != null) {
            dependency3.mo1327a(this);
        }
    }

    /* renamed from: b */
    public void m1344b() {
        this.f2366l.clear();
        this.f2365k.clear();
        this.f2364j = false;
        this.f2361g = 0;
        this.f2357c = false;
        this.f2356b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2358d.f2395b.f2217p0);
        sb.append(":");
        sb.append(this.f2359e);
        sb.append("(");
        sb.append(this.f2364j ? Integer.valueOf(this.f2361g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2366l.size());
        sb.append(":d=");
        sb.append(this.f2365k.size());
        sb.append(">");
        return sb.toString();
    }
}
