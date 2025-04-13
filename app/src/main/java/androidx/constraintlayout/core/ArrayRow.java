package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {

    /* renamed from: d */
    public ArrayRowVariables f1897d;

    /* renamed from: a */
    public SolverVariable f1894a = null;

    /* renamed from: b */
    public float f1895b = 0.0f;

    /* renamed from: c */
    public ArrayList<SolverVariable> f1896c = new ArrayList<>();

    /* renamed from: e */
    public boolean f1898e = false;

    public interface ArrayRowVariables {
        /* renamed from: a */
        int mo1151a();

        /* renamed from: b */
        boolean mo1152b(SolverVariable solverVariable);

        /* renamed from: c */
        float mo1153c(ArrayRow arrayRow, boolean z);

        void clear();

        /* renamed from: d */
        void mo1154d(SolverVariable solverVariable, float f2);

        /* renamed from: e */
        SolverVariable mo1155e(int i2);

        /* renamed from: f */
        void mo1156f(SolverVariable solverVariable, float f2, boolean z);

        /* renamed from: g */
        void mo1157g();

        /* renamed from: h */
        float mo1158h(int i2);

        /* renamed from: i */
        float mo1159i(SolverVariable solverVariable, boolean z);

        /* renamed from: j */
        float mo1160j(SolverVariable solverVariable);

        /* renamed from: k */
        void mo1161k(float f2);
    }

    public ArrayRow() {
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    /* renamed from: a */
    public void mo1162a(LinearSystem.Row row) {
        ArrayRow arrayRow = (ArrayRow) row;
        this.f1894a = null;
        this.f1897d.clear();
        for (int i2 = 0; i2 < arrayRow.f1897d.mo1151a(); i2++) {
            this.f1897d.mo1156f(arrayRow.f1897d.mo1155e(i2), arrayRow.f1897d.mo1158h(i2), true);
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    /* renamed from: b */
    public SolverVariable mo1163b(LinearSystem linearSystem, boolean[] zArr) {
        return m1171j(zArr, null);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    /* renamed from: c */
    public void mo1164c(SolverVariable solverVariable) {
        int i2 = solverVariable.f1933e;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f1897d.mo1154d(solverVariable, f2);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.f1897d.clear();
        this.f1894a = null;
        this.f1895b = 0.0f;
    }

    /* renamed from: d */
    public ArrayRow m1165d(LinearSystem linearSystem, int i2) {
        this.f1897d.mo1154d(linearSystem.m1185k(i2, "ep"), 1.0f);
        this.f1897d.mo1154d(linearSystem.m1185k(i2, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public ArrayRow m1166e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.f1897d.mo1154d(solverVariable, -1.0f);
        this.f1897d.mo1154d(solverVariable2, 1.0f);
        this.f1897d.mo1154d(solverVariable3, f2);
        this.f1897d.mo1154d(solverVariable4, -f2);
        return this;
    }

    /* renamed from: f */
    public ArrayRow m1167f(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1895b = i2;
        }
        if (z) {
            this.f1897d.mo1154d(solverVariable, 1.0f);
            this.f1897d.mo1154d(solverVariable2, -1.0f);
            this.f1897d.mo1154d(solverVariable3, -1.0f);
        } else {
            this.f1897d.mo1154d(solverVariable, -1.0f);
            this.f1897d.mo1154d(solverVariable2, 1.0f);
            this.f1897d.mo1154d(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: g */
    public ArrayRow m1168g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1895b = i2;
        }
        if (z) {
            this.f1897d.mo1154d(solverVariable, 1.0f);
            this.f1897d.mo1154d(solverVariable2, -1.0f);
            this.f1897d.mo1154d(solverVariable3, 1.0f);
        } else {
            this.f1897d.mo1154d(solverVariable, -1.0f);
            this.f1897d.mo1154d(solverVariable2, 1.0f);
            this.f1897d.mo1154d(solverVariable3, -1.0f);
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.f1894a;
    }

    /* renamed from: h */
    public ArrayRow m1169h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2) {
        this.f1897d.mo1154d(solverVariable3, 0.5f);
        this.f1897d.mo1154d(solverVariable4, 0.5f);
        this.f1897d.mo1154d(solverVariable, -0.5f);
        this.f1897d.mo1154d(solverVariable2, -0.5f);
        this.f1895b = -f2;
        return this;
    }

    /* renamed from: i */
    public final boolean m1170i(SolverVariable solverVariable) {
        return solverVariable.f1941m <= 1;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.f1894a == null && this.f1895b == 0.0f && this.f1897d.mo1151a() == 0;
    }

    /* renamed from: j */
    public final SolverVariable m1171j(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int mo1151a = this.f1897d.mo1151a();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < mo1151a; i2++) {
            float mo1158h = this.f1897d.mo1158h(i2);
            if (mo1158h < 0.0f) {
                SolverVariable mo1155e = this.f1897d.mo1155e(i2);
                if ((zArr == null || !zArr[mo1155e.f1931c]) && mo1155e != solverVariable && (((type = mo1155e.f1938j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && mo1158h < f2)) {
                    f2 = mo1158h;
                    solverVariable2 = mo1155e;
                }
            }
        }
        return solverVariable2;
    }

    /* renamed from: k */
    public void m1172k(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1894a;
        if (solverVariable2 != null) {
            this.f1897d.mo1154d(solverVariable2, -1.0f);
            this.f1894a.f1932d = -1;
            this.f1894a = null;
        }
        float mo1159i = this.f1897d.mo1159i(solverVariable, true) * (-1.0f);
        this.f1894a = solverVariable;
        if (mo1159i == 1.0f) {
            return;
        }
        this.f1895b /= mo1159i;
        this.f1897d.mo1161k(mo1159i);
    }

    /* renamed from: l */
    public void m1173l(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f1935g) {
            float mo1160j = this.f1897d.mo1160j(solverVariable);
            this.f1895b = (solverVariable.f1934f * mo1160j) + this.f1895b;
            this.f1897d.mo1159i(solverVariable, z);
            if (z) {
                solverVariable.m1202b(this);
            }
            if (this.f1897d.mo1151a() == 0) {
                this.f1898e = true;
                linearSystem.f1906a = true;
            }
        }
    }

    /* renamed from: m */
    public void mo1174m(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        float mo1153c = this.f1897d.mo1153c(arrayRow, z);
        this.f1895b = (arrayRow.f1895b * mo1153c) + this.f1895b;
        if (z) {
            arrayRow.f1894a.m1202b(this);
        }
        if (this.f1894a == null || this.f1897d.mo1151a() != 0) {
            return;
        }
        this.f1898e = true;
        linearSystem.f1906a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r9.f1894a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r9.f1894a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
            float r1 = r9.f1895b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            float r1 = r9.f1895b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r9.f1897d
            int r4 = r4.mo1151a()
        L3a:
            if (r3 >= r4) goto L9a
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r9.f1897d
            androidx.constraintlayout.core.SolverVariable r5 = r5.mo1155e(r3)
            if (r5 != 0) goto L45
            goto L97
        L45:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r9.f1897d
            float r6 = r6.mo1158h(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L97
        L50:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L74
            java.lang.String r1 = "- "
            java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
            goto L72
        L63:
            if (r7 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
            goto L74
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
        L72:
            float r6 = r6 * r8
        L74:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L7f
            java.lang.String r0 = p000a.C0000a.m14k(r0, r5)
            goto L96
        L7f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L96:
            r1 = 1
        L97:
            int r3 = r3 + 1
            goto L3a
        L9a:
            if (r1 != 0) goto La2
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p000a.C0000a.m14k(r0, r1)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toString():java.lang.String");
    }

    public ArrayRow(Cache cache) {
        this.f1897d = new ArrayLinkedVariables(this, cache);
    }
}
