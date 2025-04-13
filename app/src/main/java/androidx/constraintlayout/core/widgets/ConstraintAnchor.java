package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintAnchor {

    /* renamed from: b */
    public int f2138b;

    /* renamed from: c */
    public boolean f2139c;

    /* renamed from: d */
    public final ConstraintWidget f2140d;

    /* renamed from: e */
    public final Type f2141e;

    /* renamed from: f */
    public ConstraintAnchor f2142f;

    /* renamed from: i */
    public SolverVariable f2145i;

    /* renamed from: a */
    public HashSet<ConstraintAnchor> f2137a = null;

    /* renamed from: g */
    public int f2143g = 0;

    /* renamed from: h */
    public int f2144h = Integer.MIN_VALUE;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$1 */
    public static /* synthetic */ class C01881 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2146a;

        static {
            int[] iArr = new int[Type.values().length];
            f2146a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2146a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2146a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2146a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2146a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2146a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2146a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2146a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2146a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f2140d = constraintWidget;
        this.f2141e = type;
    }

    /* renamed from: a */
    public boolean m1232a(ConstraintAnchor constraintAnchor, int i2) {
        return m1233b(constraintAnchor, i2, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean m1233b(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z) {
        if (constraintAnchor == null) {
            m1242k();
            return true;
        }
        if (!z && !m1241j(constraintAnchor)) {
            return false;
        }
        this.f2142f = constraintAnchor;
        if (constraintAnchor.f2137a == null) {
            constraintAnchor.f2137a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f2142f.f2137a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f2143g = i2;
        this.f2144h = i3;
        return true;
    }

    /* renamed from: c */
    public void m1234c(int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        HashSet<ConstraintAnchor> hashSet = this.f2137a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.m1353a(it.next().f2140d, i2, arrayList, widgetGroup);
            }
        }
    }

    /* renamed from: d */
    public int m1235d() {
        if (this.f2139c) {
            return this.f2138b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m1236e() {
        ConstraintAnchor constraintAnchor;
        if (this.f2140d.f2213n0 == 8) {
            return 0;
        }
        int i2 = this.f2144h;
        return (i2 == Integer.MIN_VALUE || (constraintAnchor = this.f2142f) == null || constraintAnchor.f2140d.f2213n0 != 8) ? this.f2143g : i2;
    }

    /* renamed from: f */
    public final ConstraintAnchor m1237f() {
        switch (this.f2141e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f2140d.f2171L;
            case TOP:
                return this.f2140d.f2172M;
            case RIGHT:
                return this.f2140d.f2169J;
            case BOTTOM:
                return this.f2140d.f2170K;
            default:
                throw new AssertionError(this.f2141e.name());
        }
    }

    /* renamed from: g */
    public boolean m1238g() {
        HashSet<ConstraintAnchor> hashSet = this.f2137a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m1237f().m1240i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m1239h() {
        HashSet<ConstraintAnchor> hashSet = this.f2137a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: i */
    public boolean m1240i() {
        return this.f2142f != null;
    }

    /* renamed from: j */
    public boolean m1241j(ConstraintAnchor constraintAnchor) {
        Type type = Type.CENTER_Y;
        Type type2 = Type.RIGHT;
        Type type3 = Type.CENTER_X;
        Type type4 = Type.LEFT;
        Type type5 = Type.BASELINE;
        if (constraintAnchor == null) {
            return false;
        }
        Type type6 = constraintAnchor.f2141e;
        Type type7 = this.f2141e;
        if (type6 == type7) {
            return type7 != type5 || (constraintAnchor.f2140d.f2164E && this.f2140d.f2164E);
        }
        switch (type7) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = type6 == type4 || type6 == type2;
                if (constraintAnchor.f2140d instanceof Guideline) {
                    return z || type6 == type3;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = type6 == Type.TOP || type6 == Type.BOTTOM;
                if (constraintAnchor.f2140d instanceof Guideline) {
                    return z2 || type6 == type;
                }
                return z2;
            case BASELINE:
                return (type6 == type4 || type6 == type2) ? false : true;
            case CENTER:
                return (type6 == type5 || type6 == type3 || type6 == type) ? false : true;
            default:
                throw new AssertionError(this.f2141e.name());
        }
    }

    /* renamed from: k */
    public void m1242k() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f2142f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f2137a) != null) {
            hashSet.remove(this);
            if (this.f2142f.f2137a.size() == 0) {
                this.f2142f.f2137a = null;
            }
        }
        this.f2137a = null;
        this.f2142f = null;
        this.f2143g = 0;
        this.f2144h = Integer.MIN_VALUE;
        this.f2139c = false;
        this.f2138b = 0;
    }

    /* renamed from: l */
    public void m1243l() {
        SolverVariable solverVariable = this.f2145i;
        if (solverVariable == null) {
            this.f2145i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.m1203c();
        }
    }

    /* renamed from: m */
    public void m1244m(int i2) {
        this.f2138b = i2;
        this.f2139c = true;
    }

    /* renamed from: n */
    public void m1245n(int i2) {
        if (m1240i()) {
            this.f2144h = i2;
        }
    }

    public String toString() {
        return this.f2140d.f2217p0 + ":" + this.f2141e.toString();
    }
}
