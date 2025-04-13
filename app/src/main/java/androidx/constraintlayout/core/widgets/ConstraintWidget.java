package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ConstraintWidget {

    /* renamed from: A */
    public int f2156A;

    /* renamed from: A0 */
    public ConstraintWidget f2157A0;

    /* renamed from: B */
    public float f2158B;

    /* renamed from: B0 */
    public ConstraintWidget f2159B0;

    /* renamed from: C */
    public int[] f2160C;

    /* renamed from: C0 */
    public int f2161C0;

    /* renamed from: D */
    public float f2162D;

    /* renamed from: D0 */
    public int f2163D0;

    /* renamed from: E */
    public boolean f2164E;

    /* renamed from: F */
    public boolean f2165F;

    /* renamed from: G */
    public boolean f2166G;

    /* renamed from: H */
    public int f2167H;

    /* renamed from: I */
    public int f2168I;

    /* renamed from: J */
    public ConstraintAnchor f2169J;

    /* renamed from: K */
    public ConstraintAnchor f2170K;

    /* renamed from: L */
    public ConstraintAnchor f2171L;

    /* renamed from: M */
    public ConstraintAnchor f2172M;

    /* renamed from: N */
    public ConstraintAnchor f2173N;

    /* renamed from: O */
    public ConstraintAnchor f2174O;

    /* renamed from: P */
    public ConstraintAnchor f2175P;

    /* renamed from: Q */
    public ConstraintAnchor f2176Q;

    /* renamed from: R */
    public ConstraintAnchor[] f2177R;

    /* renamed from: S */
    public ArrayList<ConstraintAnchor> f2178S;

    /* renamed from: T */
    public boolean[] f2179T;

    /* renamed from: U */
    public DimensionBehaviour[] f2180U;

    /* renamed from: V */
    public ConstraintWidget f2181V;

    /* renamed from: W */
    public int f2182W;

    /* renamed from: X */
    public int f2183X;

    /* renamed from: Y */
    public float f2184Y;

    /* renamed from: Z */
    public int f2185Z;

    /* renamed from: a0 */
    public int f2187a0;

    /* renamed from: b */
    public ChainRun f2188b;

    /* renamed from: b0 */
    public int f2189b0;

    /* renamed from: c */
    public ChainRun f2190c;

    /* renamed from: c0 */
    public int f2191c0;

    /* renamed from: d0 */
    public int f2193d0;

    /* renamed from: e0 */
    public int f2195e0;

    /* renamed from: f0 */
    public int f2197f0;

    /* renamed from: g0 */
    public int f2199g0;

    /* renamed from: h0 */
    public int f2201h0;

    /* renamed from: i0 */
    public int f2203i0;

    /* renamed from: j */
    public String f2204j;

    /* renamed from: j0 */
    public float f2205j0;

    /* renamed from: k */
    public boolean f2206k;

    /* renamed from: k0 */
    public float f2207k0;

    /* renamed from: l */
    public boolean f2208l;

    /* renamed from: l0 */
    public Object f2209l0;

    /* renamed from: m */
    public boolean f2210m;

    /* renamed from: m0 */
    public int f2211m0;

    /* renamed from: n */
    public boolean f2212n;

    /* renamed from: n0 */
    public int f2213n0;

    /* renamed from: o */
    public int f2214o;

    /* renamed from: o0 */
    public boolean f2215o0;

    /* renamed from: p */
    public int f2216p;

    /* renamed from: p0 */
    public String f2217p0;

    /* renamed from: q */
    public int f2218q;

    /* renamed from: q0 */
    public String f2219q0;

    /* renamed from: r */
    public int f2220r;

    /* renamed from: r0 */
    public boolean f2221r0;

    /* renamed from: s */
    public int f2222s;

    /* renamed from: s0 */
    public boolean f2223s0;

    /* renamed from: t */
    public int[] f2224t;

    /* renamed from: t0 */
    public int f2225t0;

    /* renamed from: u */
    public int f2226u;

    /* renamed from: u0 */
    public int f2227u0;

    /* renamed from: v */
    public int f2228v;

    /* renamed from: v0 */
    public boolean f2229v0;

    /* renamed from: w */
    public float f2230w;

    /* renamed from: w0 */
    public boolean f2231w0;

    /* renamed from: x */
    public int f2232x;

    /* renamed from: x0 */
    public float[] f2233x0;

    /* renamed from: y */
    public int f2234y;

    /* renamed from: y0 */
    public ConstraintWidget[] f2235y0;

    /* renamed from: z */
    public float f2236z;

    /* renamed from: z0 */
    public ConstraintWidget[] f2237z0;

    /* renamed from: a */
    public boolean f2186a = false;

    /* renamed from: d */
    public HorizontalWidgetRun f2192d = null;

    /* renamed from: e */
    public VerticalWidgetRun f2194e = null;

    /* renamed from: f */
    public boolean[] f2196f = {true, true};

    /* renamed from: g */
    public boolean f2198g = true;

    /* renamed from: h */
    public int f2200h = -1;

    /* renamed from: i */
    public int f2202i = -1;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    public static /* synthetic */ class C01891 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2238a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2239b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f2239b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2239b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2239b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2239b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f2238a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2238a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2238a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2238a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2238a[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2238a[6] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2238a[7] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2238a[8] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2238a[0] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        new WidgetFrame(this);
        this.f2206k = false;
        this.f2208l = false;
        this.f2210m = false;
        this.f2212n = false;
        this.f2214o = -1;
        this.f2216p = -1;
        this.f2218q = 0;
        this.f2220r = 0;
        this.f2222s = 0;
        this.f2224t = new int[2];
        this.f2226u = 0;
        this.f2228v = 0;
        this.f2230w = 1.0f;
        this.f2232x = 0;
        this.f2234y = 0;
        this.f2236z = 1.0f;
        this.f2156A = -1;
        this.f2158B = 1.0f;
        this.f2160C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f2162D = 0.0f;
        this.f2164E = false;
        this.f2166G = false;
        this.f2167H = 0;
        this.f2168I = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f2169J = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f2170K = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f2171L = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f2172M = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f2173N = constraintAnchor5;
        this.f2174O = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f2175P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f2176Q = constraintAnchor6;
        this.f2177R = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f2178S = arrayList;
        this.f2179T = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f2180U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f2181V = null;
        this.f2182W = 0;
        this.f2183X = 0;
        this.f2184Y = 0.0f;
        this.f2185Z = -1;
        this.f2187a0 = 0;
        this.f2189b0 = 0;
        this.f2191c0 = 0;
        this.f2193d0 = 0;
        this.f2195e0 = 0;
        this.f2197f0 = 0;
        this.f2199g0 = 0;
        this.f2205j0 = 0.5f;
        this.f2207k0 = 0.5f;
        this.f2211m0 = 0;
        this.f2213n0 = 0;
        this.f2215o0 = false;
        this.f2217p0 = null;
        this.f2219q0 = null;
        this.f2225t0 = 0;
        this.f2227u0 = 0;
        this.f2233x0 = new float[]{-1.0f, -1.0f};
        this.f2235y0 = new ConstraintWidget[]{null, null};
        this.f2237z0 = new ConstraintWidget[]{null, null};
        this.f2157A0 = null;
        this.f2159B0 = null;
        this.f2161C0 = -1;
        this.f2163D0 = -1;
        arrayList.add(this.f2169J);
        this.f2178S.add(this.f2170K);
        this.f2178S.add(this.f2171L);
        this.f2178S.add(this.f2172M);
        this.f2178S.add(this.f2174O);
        this.f2178S.add(this.f2175P);
        this.f2178S.add(this.f2176Q);
        this.f2178S.add(this.f2173N);
    }

    /* renamed from: A */
    public int m1246A() {
        ConstraintWidget constraintWidget = this.f2181V;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f2189b0 : ((ConstraintWidgetContainer) constraintWidget).f2252M0 + this.f2189b0;
    }

    /* renamed from: B */
    public boolean m1247B(int i2) {
        if (i2 == 0) {
            return (this.f2169J.f2142f != null ? 1 : 0) + (this.f2171L.f2142f != null ? 1 : 0) < 2;
        }
        return ((this.f2170K.f2142f != null ? 1 : 0) + (this.f2172M.f2142f != null ? 1 : 0)) + (this.f2173N.f2142f != null ? 1 : 0) < 2;
    }

    /* renamed from: C */
    public boolean m1248C(int i2, int i3) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f2169J.f2142f;
            if (constraintAnchor3 != null && constraintAnchor3.f2139c && (constraintAnchor2 = this.f2171L.f2142f) != null && constraintAnchor2.f2139c) {
                return (constraintAnchor2.m1235d() - this.f2171L.m1236e()) - (this.f2169J.m1236e() + this.f2169J.f2142f.m1235d()) >= i3;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f2170K.f2142f;
            if (constraintAnchor4 != null && constraintAnchor4.f2139c && (constraintAnchor = this.f2172M.f2142f) != null && constraintAnchor.f2139c) {
                return (constraintAnchor.m1235d() - this.f2172M.m1236e()) - (this.f2170K.m1236e() + this.f2170K.f2142f.m1235d()) >= i3;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m1249D(int i2) {
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f2177R;
        if (constraintAnchorArr[i3].f2142f != null && constraintAnchorArr[i3].f2142f.f2142f != constraintAnchorArr[i3]) {
            int i4 = i3 + 1;
            if (constraintAnchorArr[i4].f2142f != null && constraintAnchorArr[i4].f2142f.f2142f == constraintAnchorArr[i4]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public boolean m1250E() {
        ConstraintAnchor constraintAnchor = this.f2169J;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2142f;
        if (constraintAnchor2 != null && constraintAnchor2.f2142f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2171L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2142f;
        return constraintAnchor4 != null && constraintAnchor4.f2142f == constraintAnchor3;
    }

    /* renamed from: F */
    public boolean m1251F() {
        ConstraintAnchor constraintAnchor = this.f2170K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2142f;
        if (constraintAnchor2 != null && constraintAnchor2.f2142f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2172M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2142f;
        return constraintAnchor4 != null && constraintAnchor4.f2142f == constraintAnchor3;
    }

    /* renamed from: G */
    public boolean m1252G() {
        return this.f2198g && this.f2213n0 != 8;
    }

    /* renamed from: H */
    public boolean mo1225H() {
        return this.f2206k || (this.f2169J.f2139c && this.f2171L.f2139c);
    }

    /* renamed from: I */
    public boolean mo1226I() {
        return this.f2208l || (this.f2170K.f2139c && this.f2172M.f2139c);
    }

    /* renamed from: J */
    public void mo1253J() {
        this.f2169J.m1242k();
        this.f2170K.m1242k();
        this.f2171L.m1242k();
        this.f2172M.m1242k();
        this.f2173N.m1242k();
        this.f2174O.m1242k();
        this.f2175P.m1242k();
        this.f2176Q.m1242k();
        this.f2181V = null;
        this.f2162D = 0.0f;
        this.f2182W = 0;
        this.f2183X = 0;
        this.f2184Y = 0.0f;
        this.f2185Z = -1;
        this.f2187a0 = 0;
        this.f2189b0 = 0;
        this.f2195e0 = 0;
        this.f2197f0 = 0;
        this.f2199g0 = 0;
        this.f2201h0 = 0;
        this.f2203i0 = 0;
        this.f2205j0 = 0.5f;
        this.f2207k0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f2180U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f2209l0 = null;
        this.f2211m0 = 0;
        this.f2213n0 = 0;
        this.f2219q0 = null;
        this.f2221r0 = false;
        this.f2223s0 = false;
        this.f2225t0 = 0;
        this.f2227u0 = 0;
        this.f2229v0 = false;
        this.f2231w0 = false;
        float[] fArr = this.f2233x0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2214o = -1;
        this.f2216p = -1;
        int[] iArr = this.f2160C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2220r = 0;
        this.f2222s = 0;
        this.f2230w = 1.0f;
        this.f2236z = 1.0f;
        this.f2228v = Integer.MAX_VALUE;
        this.f2234y = Integer.MAX_VALUE;
        this.f2226u = 0;
        this.f2232x = 0;
        this.f2156A = -1;
        this.f2158B = 1.0f;
        boolean[] zArr = this.f2196f;
        zArr[0] = true;
        zArr[1] = true;
        this.f2166G = false;
        boolean[] zArr2 = this.f2179T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2198g = true;
        int[] iArr2 = this.f2224t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2200h = -1;
        this.f2202i = -1;
    }

    /* renamed from: K */
    public void m1254K() {
        ConstraintWidget constraintWidget = this.f2181V;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            Objects.requireNonNull((ConstraintWidgetContainer) constraintWidget);
        }
        int size = this.f2178S.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2178S.get(i2).m1242k();
        }
    }

    /* renamed from: L */
    public void m1255L() {
        this.f2206k = false;
        this.f2208l = false;
        this.f2210m = false;
        this.f2212n = false;
        int size = this.f2178S.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintAnchor constraintAnchor = this.f2178S.get(i2);
            constraintAnchor.f2139c = false;
            constraintAnchor.f2138b = 0;
        }
    }

    /* renamed from: M */
    public void mo1256M(Cache cache) {
        this.f2169J.m1243l();
        this.f2170K.m1243l();
        this.f2171L.m1243l();
        this.f2172M.m1243l();
        this.f2173N.m1243l();
        this.f2176Q.m1243l();
        this.f2174O.m1243l();
        this.f2175P.m1243l();
    }

    /* renamed from: N */
    public final void m1257N(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    /* renamed from: O */
    public final void m1258O(StringBuilder sb, String str, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    /* renamed from: P */
    public void m1259P(int i2) {
        this.f2199g0 = i2;
        this.f2164E = i2 > 0;
    }

    /* renamed from: Q */
    public void m1260Q(int i2, int i3) {
        if (this.f2206k) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f2169J;
        constraintAnchor.f2138b = i2;
        constraintAnchor.f2139c = true;
        ConstraintAnchor constraintAnchor2 = this.f2171L;
        constraintAnchor2.f2138b = i3;
        constraintAnchor2.f2139c = true;
        this.f2187a0 = i2;
        this.f2182W = i3 - i2;
        this.f2206k = true;
    }

    /* renamed from: R */
    public void m1261R(int i2, int i3) {
        if (this.f2208l) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f2170K;
        constraintAnchor.f2138b = i2;
        constraintAnchor.f2139c = true;
        ConstraintAnchor constraintAnchor2 = this.f2172M;
        constraintAnchor2.f2138b = i3;
        constraintAnchor2.f2139c = true;
        this.f2189b0 = i2;
        this.f2183X = i3 - i2;
        if (this.f2164E) {
            this.f2173N.m1244m(i2 + this.f2199g0);
        }
        this.f2208l = true;
    }

    /* renamed from: S */
    public void m1262S(int i2) {
        this.f2183X = i2;
        int i3 = this.f2203i0;
        if (i2 < i3) {
            this.f2183X = i3;
        }
    }

    /* renamed from: T */
    public void m1263T(DimensionBehaviour dimensionBehaviour) {
        this.f2180U[0] = dimensionBehaviour;
    }

    /* renamed from: U */
    public void m1264U(int i2) {
        if (i2 < 0) {
            this.f2203i0 = 0;
        } else {
            this.f2203i0 = i2;
        }
    }

    /* renamed from: V */
    public void m1265V(int i2) {
        if (i2 < 0) {
            this.f2201h0 = 0;
        } else {
            this.f2201h0 = i2;
        }
    }

    /* renamed from: W */
    public void m1266W(DimensionBehaviour dimensionBehaviour) {
        this.f2180U[1] = dimensionBehaviour;
    }

    /* renamed from: X */
    public void m1267X(int i2) {
        this.f2182W = i2;
        int i3 = this.f2201h0;
        if (i2 < i3) {
            this.f2182W = i3;
        }
    }

    /* renamed from: Y */
    public void mo1268Y(boolean z, boolean z2) {
        int i2;
        int i3;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        HorizontalWidgetRun horizontalWidgetRun = this.f2192d;
        boolean z3 = z & horizontalWidgetRun.f2400g;
        VerticalWidgetRun verticalWidgetRun = this.f2194e;
        boolean z4 = z2 & verticalWidgetRun.f2400g;
        int i4 = horizontalWidgetRun.f2401h.f2361g;
        int i5 = verticalWidgetRun.f2401h.f2361g;
        int i6 = horizontalWidgetRun.f2402i.f2361g;
        int i7 = verticalWidgetRun.f2402i.f2361g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z3) {
            this.f2187a0 = i4;
        }
        if (z4) {
            this.f2189b0 = i5;
        }
        if (this.f2213n0 == 8) {
            this.f2182W = 0;
            this.f2183X = 0;
            return;
        }
        if (z3) {
            if (this.f2180U[0] == dimensionBehaviour && i9 < (i3 = this.f2182W)) {
                i9 = i3;
            }
            this.f2182W = i9;
            int i11 = this.f2201h0;
            if (i9 < i11) {
                this.f2182W = i11;
            }
        }
        if (z4) {
            if (this.f2180U[1] == dimensionBehaviour && i10 < (i2 = this.f2183X)) {
                i10 = i2;
            }
            this.f2183X = i10;
            int i12 = this.f2203i0;
            if (i10 < i12) {
                this.f2183X = i12;
            }
        }
    }

    /* renamed from: Z */
    public void mo1269Z(LinearSystem linearSystem, boolean z) {
        int i2;
        int i3;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int m1189o = linearSystem.m1189o(this.f2169J);
        int m1189o2 = linearSystem.m1189o(this.f2170K);
        int m1189o3 = linearSystem.m1189o(this.f2171L);
        int m1189o4 = linearSystem.m1189o(this.f2172M);
        if (z && (horizontalWidgetRun = this.f2192d) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.f2401h;
            if (dependencyNode.f2364j) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.f2402i;
                if (dependencyNode2.f2364j) {
                    m1189o = dependencyNode.f2361g;
                    m1189o3 = dependencyNode2.f2361g;
                }
            }
        }
        if (z && (verticalWidgetRun = this.f2194e) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.f2401h;
            if (dependencyNode3.f2364j) {
                DependencyNode dependencyNode4 = verticalWidgetRun.f2402i;
                if (dependencyNode4.f2364j) {
                    m1189o2 = dependencyNode3.f2361g;
                    m1189o4 = dependencyNode4.f2361g;
                }
            }
        }
        int i4 = m1189o4 - m1189o2;
        if (m1189o3 - m1189o < 0 || i4 < 0 || m1189o == Integer.MIN_VALUE || m1189o == Integer.MAX_VALUE || m1189o2 == Integer.MIN_VALUE || m1189o2 == Integer.MAX_VALUE || m1189o3 == Integer.MIN_VALUE || m1189o3 == Integer.MAX_VALUE || m1189o4 == Integer.MIN_VALUE || m1189o4 == Integer.MAX_VALUE) {
            m1189o4 = 0;
            m1189o = 0;
            m1189o2 = 0;
            m1189o3 = 0;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.MATCH_CONSTRAINT;
        int i5 = m1189o3 - m1189o;
        int i6 = m1189o4 - m1189o2;
        this.f2187a0 = m1189o;
        this.f2189b0 = m1189o2;
        if (this.f2213n0 == 8) {
            this.f2182W = 0;
            this.f2183X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f2180U;
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 && i5 < (i3 = this.f2182W)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour3 && i6 < (i2 = this.f2183X)) {
            i6 = i2;
        }
        this.f2182W = i5;
        this.f2183X = i6;
        int i7 = this.f2203i0;
        if (i6 < i7) {
            this.f2183X = i7;
        }
        int i8 = this.f2201h0;
        if (i5 < i8) {
            this.f2182W = i8;
        }
        int i9 = this.f2228v;
        if (i9 > 0 && dimensionBehaviourArr[0] == dimensionBehaviour) {
            this.f2182W = Math.min(this.f2182W, i9);
        }
        int i10 = this.f2234y;
        if (i10 > 0 && this.f2180U[1] == dimensionBehaviour) {
            this.f2183X = Math.min(this.f2183X, i10);
        }
        int i11 = this.f2182W;
        if (i5 != i11) {
            this.f2200h = i11;
        }
        int i12 = this.f2183X;
        if (i6 != i12) {
            this.f2202i = i12;
        }
    }

    /* renamed from: d */
    public void m1270d(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i2, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.m1318a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            mo1229f(linearSystem, constraintWidgetContainer.m1300j0(64));
        }
        if (i2 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f2169J.f2137a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f2140d.m1270d(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f2171L.f2137a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2140d.m1270d(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f2170K.f2137a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f2140d.m1270d(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f2172M.f2137a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f2140d.m1270d(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f2173N.f2137a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f2140d.m1270d(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
    }

    /* renamed from: e */
    public boolean m1271e() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1229f(androidx.constraintlayout.core.LinearSystem r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo1229f(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    /* renamed from: g */
    public boolean mo1230g() {
        return this.f2213n0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1272h(androidx.constraintlayout.core.LinearSystem r31, boolean r32, boolean r33, boolean r34, boolean r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r38, boolean r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.m1272h(androidx.constraintlayout.core.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: i */
    public void m1273i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
        boolean z;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.CENTER_Y;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.CENTER_X;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.LEFT;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.TOP;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.BOTTOM;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.CENTER;
        if (type == type9) {
            if (type2 != type9) {
                if (type2 == type5 || type2 == type7) {
                    m1273i(type5, constraintWidget, type2, 0);
                    m1273i(type7, constraintWidget, type2, 0);
                    mo1277m(type9).m1232a(constraintWidget.mo1277m(type2), 0);
                    return;
                } else {
                    if (type2 == type6 || type2 == type8) {
                        m1273i(type6, constraintWidget, type2, 0);
                        m1273i(type8, constraintWidget, type2, 0);
                        mo1277m(type9).m1232a(constraintWidget.mo1277m(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor mo1277m = mo1277m(type5);
            ConstraintAnchor mo1277m2 = mo1277m(type7);
            ConstraintAnchor mo1277m3 = mo1277m(type6);
            ConstraintAnchor mo1277m4 = mo1277m(type8);
            boolean z2 = true;
            if ((mo1277m == null || !mo1277m.m1240i()) && (mo1277m2 == null || !mo1277m2.m1240i())) {
                m1273i(type5, constraintWidget, type5, 0);
                m1273i(type7, constraintWidget, type7, 0);
                z = true;
            } else {
                z = false;
            }
            if ((mo1277m3 == null || !mo1277m3.m1240i()) && (mo1277m4 == null || !mo1277m4.m1240i())) {
                m1273i(type6, constraintWidget, type6, 0);
                m1273i(type8, constraintWidget, type8, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo1277m(type9).m1232a(constraintWidget.mo1277m(type9), 0);
                return;
            } else if (z) {
                mo1277m(type4).m1232a(constraintWidget.mo1277m(type4), 0);
                return;
            } else {
                if (z2) {
                    mo1277m(type3).m1232a(constraintWidget.mo1277m(type3), 0);
                    return;
                }
                return;
            }
        }
        if (type == type4 && (type2 == type5 || type2 == type7)) {
            ConstraintAnchor mo1277m5 = mo1277m(type5);
            ConstraintAnchor mo1277m6 = constraintWidget.mo1277m(type2);
            ConstraintAnchor mo1277m7 = mo1277m(type7);
            mo1277m5.m1232a(mo1277m6, 0);
            mo1277m7.m1232a(mo1277m6, 0);
            mo1277m(type4).m1232a(mo1277m6, 0);
            return;
        }
        if (type == type3 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor mo1277m8 = constraintWidget.mo1277m(type2);
            mo1277m(type6).m1232a(mo1277m8, 0);
            mo1277m(type8).m1232a(mo1277m8, 0);
            mo1277m(type3).m1232a(mo1277m8, 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            mo1277m(type5).m1232a(constraintWidget.mo1277m(type5), 0);
            mo1277m(type7).m1232a(constraintWidget.mo1277m(type7), 0);
            mo1277m(type4).m1232a(constraintWidget.mo1277m(type2), 0);
            return;
        }
        if (type == type3 && type2 == type3) {
            mo1277m(type6).m1232a(constraintWidget.mo1277m(type6), 0);
            mo1277m(type8).m1232a(constraintWidget.mo1277m(type8), 0);
            mo1277m(type3).m1232a(constraintWidget.mo1277m(type2), 0);
            return;
        }
        ConstraintAnchor mo1277m9 = mo1277m(type);
        ConstraintAnchor mo1277m10 = constraintWidget.mo1277m(type2);
        if (mo1277m9.m1241j(mo1277m10)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.BASELINE;
            if (type == type10) {
                ConstraintAnchor mo1277m11 = mo1277m(type6);
                ConstraintAnchor mo1277m12 = mo1277m(type8);
                if (mo1277m11 != null) {
                    mo1277m11.m1242k();
                }
                if (mo1277m12 != null) {
                    mo1277m12.m1242k();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor mo1277m13 = mo1277m(type10);
                if (mo1277m13 != null) {
                    mo1277m13.m1242k();
                }
                ConstraintAnchor mo1277m14 = mo1277m(type9);
                if (mo1277m14.f2142f != mo1277m10) {
                    mo1277m14.m1242k();
                }
                ConstraintAnchor m1237f = mo1277m(type).m1237f();
                ConstraintAnchor mo1277m15 = mo1277m(type3);
                if (mo1277m15.m1240i()) {
                    m1237f.m1242k();
                    mo1277m15.m1242k();
                }
            } else if (type == type5 || type == type7) {
                ConstraintAnchor mo1277m16 = mo1277m(type9);
                if (mo1277m16.f2142f != mo1277m10) {
                    mo1277m16.m1242k();
                }
                ConstraintAnchor m1237f2 = mo1277m(type).m1237f();
                ConstraintAnchor mo1277m17 = mo1277m(type4);
                if (mo1277m17.m1240i()) {
                    m1237f2.m1242k();
                    mo1277m17.m1242k();
                }
            }
            mo1277m9.m1232a(mo1277m10, i2);
        }
    }

    /* renamed from: j */
    public void m1274j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.f2140d == this) {
            m1273i(constraintAnchor.f2141e, constraintAnchor2.f2140d, constraintAnchor2.f2141e, i2);
        }
    }

    /* renamed from: k */
    public void m1275k(LinearSystem linearSystem) {
        linearSystem.m1186l(this.f2169J);
        linearSystem.m1186l(this.f2170K);
        linearSystem.m1186l(this.f2171L);
        linearSystem.m1186l(this.f2172M);
        if (this.f2199g0 > 0) {
            linearSystem.m1186l(this.f2173N);
        }
    }

    /* renamed from: l */
    public void m1276l() {
        if (this.f2192d == null) {
            this.f2192d = new HorizontalWidgetRun(this);
        }
        if (this.f2194e == null) {
            this.f2194e = new VerticalWidgetRun(this);
        }
    }

    /* renamed from: m */
    public ConstraintAnchor mo1277m(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f2169J;
            case 2:
                return this.f2170K;
            case 3:
                return this.f2171L;
            case 4:
                return this.f2172M;
            case 5:
                return this.f2173N;
            case 6:
                return this.f2176Q;
            case 7:
                return this.f2174O;
            case 8:
                return this.f2175P;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: n */
    public int m1278n() {
        return m1246A() + this.f2183X;
    }

    /* renamed from: o */
    public DimensionBehaviour m1279o(int i2) {
        if (i2 == 0) {
            return m1281q();
        }
        if (i2 == 1) {
            return m1288x();
        }
        return null;
    }

    /* renamed from: p */
    public int m1280p() {
        if (this.f2213n0 == 8) {
            return 0;
        }
        return this.f2183X;
    }

    /* renamed from: q */
    public DimensionBehaviour m1281q() {
        return this.f2180U[0];
    }

    /* renamed from: r */
    public ConstraintWidget m1282r(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f2172M).f2142f) != null && constraintAnchor2.f2142f == constraintAnchor) {
                return constraintAnchor2.f2140d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f2171L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2142f;
        if (constraintAnchor4 == null || constraintAnchor4.f2142f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f2140d;
    }

    /* renamed from: s */
    public ConstraintWidget m1283s(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f2170K).f2142f) != null && constraintAnchor2.f2142f == constraintAnchor) {
                return constraintAnchor2.f2140d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f2169J;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2142f;
        if (constraintAnchor4 == null || constraintAnchor4.f2142f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f2140d;
    }

    /* renamed from: t */
    public int m1284t() {
        return m1290z() + this.f2182W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2219q0 != null ? C0000a.m20q(C0000a.m24u("type: "), this.f2219q0, " ") : "");
        sb.append(this.f2217p0 != null ? C0000a.m20q(C0000a.m24u("id: "), this.f2217p0, " ") : "");
        sb.append("(");
        sb.append(this.f2187a0);
        sb.append(", ");
        sb.append(this.f2189b0);
        sb.append(") - (");
        sb.append(this.f2182W);
        sb.append(" x ");
        return C0000a.m18o(sb, this.f2183X, ")");
    }

    /* renamed from: u */
    public void mo1285u(StringBuilder sb) {
        StringBuilder m24u = C0000a.m24u("  ");
        m24u.append(this.f2204j);
        m24u.append(":{\n");
        sb.append(m24u.toString());
        sb.append("    actualWidth:" + this.f2182W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.f2183X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f2187a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f2189b0);
        sb.append("\n");
        m1287w(sb, "left", this.f2169J);
        m1287w(sb, "top", this.f2170K);
        m1287w(sb, "right", this.f2171L);
        m1287w(sb, "bottom", this.f2172M);
        m1287w(sb, "baseline", this.f2173N);
        m1287w(sb, "centerX", this.f2174O);
        m1287w(sb, "centerY", this.f2175P);
        int i2 = this.f2182W;
        int i3 = this.f2201h0;
        int i4 = this.f2160C[0];
        int i5 = this.f2226u;
        int i6 = this.f2220r;
        float f2 = this.f2230w;
        float f3 = this.f2233x0[0];
        m1286v(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.f2183X;
        int i8 = this.f2203i0;
        int i9 = this.f2160C[1];
        int i10 = this.f2232x;
        int i11 = this.f2222s;
        float f4 = this.f2236z;
        float f5 = this.f2233x0[1];
        m1286v(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.f2184Y;
        int i12 = this.f2185Z;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append("");
            sb.append("],\n");
        }
        m1257N(sb, "    horizontalBias", this.f2205j0, 0.5f);
        m1257N(sb, "    verticalBias", this.f2207k0, 0.5f);
        m1258O(sb, "    horizontalChainStyle", this.f2225t0, 0);
        m1258O(sb, "    verticalChainStyle", this.f2227u0, 0);
        sb.append("  }");
    }

    /* renamed from: v */
    public final void m1286v(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        m1258O(sb, "      size", i2, 0);
        m1258O(sb, "      min", i3, 0);
        m1258O(sb, "      max", i4, Integer.MAX_VALUE);
        m1258O(sb, "      matchMin", i5, 0);
        m1258O(sb, "      matchDef", i6, 0);
        m1257N(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: w */
    public final void m1287w(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f2142f == null) {
            return;
        }
        C0000a.m1B(sb, "    ", str, " : [ '");
        sb.append(constraintAnchor.f2142f);
        sb.append("'");
        if (constraintAnchor.f2144h != Integer.MIN_VALUE || constraintAnchor.f2143g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f2143g);
            if (constraintAnchor.f2144h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f2144h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* renamed from: x */
    public DimensionBehaviour m1288x() {
        return this.f2180U[1];
    }

    /* renamed from: y */
    public int m1289y() {
        if (this.f2213n0 == 8) {
            return 0;
        }
        return this.f2182W;
    }

    /* renamed from: z */
    public int m1290z() {
        ConstraintWidget constraintWidget = this.f2181V;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f2187a0 : ((ConstraintWidgetContainer) constraintWidget).f2251L0 + this.f2187a0;
    }
}
