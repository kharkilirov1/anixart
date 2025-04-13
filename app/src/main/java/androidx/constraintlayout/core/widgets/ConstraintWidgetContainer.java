package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {

    /* renamed from: H0 */
    public int f2247H0;

    /* renamed from: L0 */
    public int f2251L0;

    /* renamed from: M0 */
    public int f2252M0;

    /* renamed from: F0 */
    public BasicMeasure f2245F0 = new BasicMeasure(this);

    /* renamed from: G0 */
    public DependencyGraph f2246G0 = new DependencyGraph(this);

    /* renamed from: I0 */
    public BasicMeasure.Measurer f2248I0 = null;

    /* renamed from: J0 */
    public boolean f2249J0 = false;

    /* renamed from: K0 */
    public LinearSystem f2250K0 = new LinearSystem();

    /* renamed from: N0 */
    public int f2253N0 = 0;

    /* renamed from: O0 */
    public int f2254O0 = 0;

    /* renamed from: P0 */
    public ChainHead[] f2255P0 = new ChainHead[4];

    /* renamed from: Q0 */
    public ChainHead[] f2256Q0 = new ChainHead[4];

    /* renamed from: R0 */
    public int f2257R0 = 257;

    /* renamed from: S0 */
    public boolean f2258S0 = false;

    /* renamed from: T0 */
    public boolean f2259T0 = false;

    /* renamed from: U0 */
    public WeakReference<ConstraintAnchor> f2260U0 = null;

    /* renamed from: V0 */
    public WeakReference<ConstraintAnchor> f2261V0 = null;

    /* renamed from: W0 */
    public WeakReference<ConstraintAnchor> f2262W0 = null;

    /* renamed from: X0 */
    public WeakReference<ConstraintAnchor> f2263X0 = null;

    /* renamed from: Y0 */
    public HashSet<ConstraintWidget> f2264Y0 = new HashSet<>();

    /* renamed from: Z0 */
    public BasicMeasure.Measure f2265Z0 = new BasicMeasure.Measure();

    /* renamed from: i0 */
    public static boolean m1291i0(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, int i2) {
        int i3;
        int i4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.f2213n0 == 8 || (constraintWidget instanceof Guideline) || (constraintWidget instanceof Barrier)) {
            measure.f2339e = 0;
            measure.f2340f = 0;
            return false;
        }
        measure.f2335a = constraintWidget.m1281q();
        measure.f2336b = constraintWidget.m1288x();
        measure.f2337c = constraintWidget.m1289y();
        measure.f2338d = constraintWidget.m1280p();
        measure.f2343i = false;
        measure.f2344j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.f2335a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour3 == dimensionBehaviour4;
        boolean z2 = measure.f2336b == dimensionBehaviour4;
        boolean z3 = z && constraintWidget.f2184Y > 0.0f;
        boolean z4 = z2 && constraintWidget.f2184Y > 0.0f;
        if (z && constraintWidget.m1247B(0) && constraintWidget.f2220r == 0 && !z3) {
            measure.f2335a = dimensionBehaviour;
            if (z2 && constraintWidget.f2222s == 0) {
                measure.f2335a = dimensionBehaviour2;
            }
            z = false;
        }
        if (z2 && constraintWidget.m1247B(1) && constraintWidget.f2222s == 0 && !z4) {
            measure.f2336b = dimensionBehaviour;
            if (z && constraintWidget.f2220r == 0) {
                measure.f2336b = dimensionBehaviour2;
            }
            z2 = false;
        }
        if (constraintWidget.mo1225H()) {
            measure.f2335a = dimensionBehaviour2;
            z = false;
        }
        if (constraintWidget.mo1226I()) {
            measure.f2336b = dimensionBehaviour2;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f2224t[0] == 4) {
                measure.f2335a = dimensionBehaviour2;
            } else if (!z2) {
                if (measure.f2336b == dimensionBehaviour2) {
                    i4 = measure.f2338d;
                } else {
                    measure.f2335a = dimensionBehaviour;
                    measurer.mo1326b(constraintWidget, measure);
                    i4 = measure.f2340f;
                }
                measure.f2335a = dimensionBehaviour2;
                measure.f2337c = (int) (constraintWidget.f2184Y * i4);
            }
        }
        if (z4) {
            if (constraintWidget.f2224t[1] == 4) {
                measure.f2336b = dimensionBehaviour2;
            } else if (!z) {
                if (measure.f2335a == dimensionBehaviour2) {
                    i3 = measure.f2337c;
                } else {
                    measure.f2336b = dimensionBehaviour;
                    measurer.mo1326b(constraintWidget, measure);
                    i3 = measure.f2339e;
                }
                measure.f2336b = dimensionBehaviour2;
                if (constraintWidget.f2185Z == -1) {
                    measure.f2338d = (int) (i3 / constraintWidget.f2184Y);
                } else {
                    measure.f2338d = (int) (constraintWidget.f2184Y * i3);
                }
            }
        }
        measurer.mo1326b(constraintWidget, measure);
        constraintWidget.m1267X(measure.f2339e);
        constraintWidget.m1262S(measure.f2340f);
        constraintWidget.f2164E = measure.f2342h;
        constraintWidget.m1259P(measure.f2341g);
        measure.f2344j = 0;
        return measure.f2343i;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: J */
    public void mo1253J() {
        this.f2250K0.m1195u();
        this.f2251L0 = 0;
        this.f2252M0 = 0;
        super.mo1253J();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: Y */
    public void mo1268Y(boolean z, boolean z2) {
        super.mo1268Y(z, z2);
        int size = this.f2331E0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2331E0.get(i2).mo1268Y(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x068a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0838 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1292a0() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.mo1292a0():void");
    }

    /* renamed from: b0 */
    public void m1293b0(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            int i3 = this.f2253N0 + 1;
            ChainHead[] chainHeadArr = this.f2256Q0;
            if (i3 >= chainHeadArr.length) {
                this.f2256Q0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            ChainHead[] chainHeadArr2 = this.f2256Q0;
            int i4 = this.f2253N0;
            chainHeadArr2[i4] = new ChainHead(constraintWidget, 0, this.f2249J0);
            this.f2253N0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f2254O0 + 1;
            ChainHead[] chainHeadArr3 = this.f2255P0;
            if (i5 >= chainHeadArr3.length) {
                this.f2255P0 = (ChainHead[]) Arrays.copyOf(chainHeadArr3, chainHeadArr3.length * 2);
            }
            ChainHead[] chainHeadArr4 = this.f2255P0;
            int i6 = this.f2254O0;
            chainHeadArr4[i6] = new ChainHead(constraintWidget, 1, this.f2249J0);
            this.f2254O0 = i6 + 1;
        }
    }

    /* renamed from: c0 */
    public boolean m1294c0(LinearSystem linearSystem) {
        boolean z;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean m1300j0 = m1300j0(64);
        mo1229f(linearSystem, m1300j0);
        int size = this.f2331E0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.f2331E0.get(i2);
            boolean[] zArr = constraintWidget.f2179T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = this.f2331E0.get(i3);
                if (constraintWidget2 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget2;
                    for (int i4 = 0; i4 < barrier.f2318F0; i4++) {
                        ConstraintWidget constraintWidget3 = barrier.f2317E0[i4];
                        if (barrier.f2114H0 || constraintWidget3.mo1230g()) {
                            int i5 = barrier.f2113G0;
                            if (i5 == 0 || i5 == 1) {
                                constraintWidget3.f2179T[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                constraintWidget3.f2179T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f2264Y0.clear();
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = this.f2331E0.get(i6);
            if (constraintWidget4.m1271e()) {
                if (constraintWidget4 instanceof VirtualLayout) {
                    this.f2264Y0.add(constraintWidget4);
                } else {
                    constraintWidget4.mo1229f(linearSystem, m1300j0);
                }
            }
        }
        while (this.f2264Y0.size() > 0) {
            int size2 = this.f2264Y0.size();
            Iterator<ConstraintWidget> it = this.f2264Y0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VirtualLayout virtualLayout = (VirtualLayout) it.next();
                HashSet<ConstraintWidget> hashSet = this.f2264Y0;
                int i7 = 0;
                while (true) {
                    if (i7 >= virtualLayout.f2318F0) {
                        z = false;
                        break;
                    }
                    if (hashSet.contains(virtualLayout.f2317E0[i7])) {
                        z = true;
                        break;
                    }
                    i7++;
                }
                if (z) {
                    virtualLayout.mo1229f(linearSystem, m1300j0);
                    this.f2264Y0.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == this.f2264Y0.size()) {
                Iterator<ConstraintWidget> it2 = this.f2264Y0.iterator();
                while (it2.hasNext()) {
                    it2.next().mo1229f(linearSystem, m1300j0);
                }
                this.f2264Y0.clear();
            }
        }
        if (LinearSystem.f1903p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget5 = this.f2331E0.get(i8);
                if (!constraintWidget5.m1271e()) {
                    hashSet2.add(constraintWidget5);
                }
            }
            m1270d(this, linearSystem, hashSet2, m1281q() == dimensionBehaviour2 ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                Optimizer.m1318a(this, linearSystem, next);
                next.mo1229f(linearSystem, m1300j0);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget6 = this.f2331E0.get(i9);
                if (constraintWidget6 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f2180U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        dimensionBehaviourArr[0] = dimensionBehaviour;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        dimensionBehaviourArr[1] = dimensionBehaviour;
                    }
                    constraintWidget6.mo1229f(linearSystem, m1300j0);
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        constraintWidget6.m1263T(dimensionBehaviour3);
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        constraintWidget6.m1266W(dimensionBehaviour4);
                    }
                } else {
                    Optimizer.m1318a(this, linearSystem, constraintWidget6);
                    if (!constraintWidget6.m1271e()) {
                        constraintWidget6.mo1229f(linearSystem, m1300j0);
                    }
                }
            }
        }
        if (this.f2253N0 > 0) {
            Chain.m1231a(this, linearSystem, null, 0);
        }
        if (this.f2254O0 > 0) {
            Chain.m1231a(this, linearSystem, null, 1);
        }
        return true;
    }

    /* renamed from: d0 */
    public void m1295d0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2263X0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m1235d() > this.f2263X0.get().m1235d()) {
            this.f2263X0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: e0 */
    public void m1296e0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2261V0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m1235d() > this.f2261V0.get().m1235d()) {
            this.f2261V0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: f0 */
    public void m1297f0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2262W0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m1235d() > this.f2262W0.get().m1235d()) {
            this.f2262W0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: g0 */
    public void m1298g0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2260U0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m1235d() > this.f2260U0.get().m1235d()) {
            this.f2260U0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: h0 */
    public void m1299h0() {
        this.f2246G0.f2348b = true;
    }

    /* renamed from: j0 */
    public boolean m1300j0(int i2) {
        return (this.f2257R0 & i2) == i2;
    }

    /* renamed from: k0 */
    public void m1301k0(BasicMeasure.Measurer measurer) {
        this.f2248I0 = measurer;
        this.f2246G0.f2352f = measurer;
    }

    /* renamed from: l0 */
    public void m1302l0(int i2) {
        this.f2257R0 = i2;
        LinearSystem.f1903p = m1300j0(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* renamed from: u */
    public void mo1285u(StringBuilder sb) {
        sb.append(this.f2204j + ":{\n");
        sb.append("  actualWidth:" + this.f2182W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f2183X);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.f2331E0.iterator();
        while (it.hasNext()) {
            it.next().mo1285u(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
