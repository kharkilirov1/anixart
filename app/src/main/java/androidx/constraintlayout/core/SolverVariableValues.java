package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* renamed from: a */
    public int f1948a;

    /* renamed from: b */
    public int[] f1949b;

    /* renamed from: c */
    public int[] f1950c;

    /* renamed from: d */
    public int[] f1951d;

    /* renamed from: e */
    public float[] f1952e;

    /* renamed from: f */
    public int[] f1953f;

    /* renamed from: g */
    public int[] f1954g;

    /* renamed from: h */
    public int f1955h;

    /* renamed from: i */
    public int f1956i;

    /* renamed from: j */
    public final ArrayRow f1957j;

    /* renamed from: k */
    public final Cache f1958k;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: a */
    public int mo1151a() {
        return this.f1955h;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: b */
    public boolean mo1152b(SolverVariable solverVariable) {
        return m1208n(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: c */
    public float mo1153c(ArrayRow arrayRow, boolean z) {
        float mo1160j = mo1160j(arrayRow.f1894a);
        mo1159i(arrayRow.f1894a, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.f1897d;
        int i2 = solverVariableValues.f1955h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = solverVariableValues.f1951d;
            if (iArr[i4] != -1) {
                mo1156f(this.f1958k.f1902d[iArr[i4]], solverVariableValues.f1952e[i4] * mo1160j, z);
                i3++;
            }
            i4++;
        }
        return mo1160j;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i2 = this.f1955h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable mo1155e = mo1155e(i3);
            if (mo1155e != null) {
                mo1155e.m1202b(this.f1957j);
            }
        }
        for (int i4 = 0; i4 < this.f1948a; i4++) {
            this.f1951d[i4] = -1;
            this.f1950c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f1949b[i5] = -1;
        }
        this.f1955h = 0;
        this.f1956i = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: d */
    public void mo1154d(SolverVariable solverVariable, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            mo1159i(solverVariable, true);
            return;
        }
        int i2 = 0;
        if (this.f1955h == 0) {
            m1207m(0, solverVariable, f2);
            m1206l(solverVariable, 0);
            this.f1956i = 0;
            return;
        }
        int m1208n = m1208n(solverVariable);
        if (m1208n != -1) {
            this.f1952e[m1208n] = f2;
            return;
        }
        int i3 = this.f1955h + 1;
        int i4 = this.f1948a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f1951d = Arrays.copyOf(this.f1951d, i5);
            this.f1952e = Arrays.copyOf(this.f1952e, i5);
            this.f1953f = Arrays.copyOf(this.f1953f, i5);
            this.f1954g = Arrays.copyOf(this.f1954g, i5);
            this.f1950c = Arrays.copyOf(this.f1950c, i5);
            for (int i6 = this.f1948a; i6 < i5; i6++) {
                this.f1951d[i6] = -1;
                this.f1950c[i6] = -1;
            }
            this.f1948a = i5;
        }
        int i7 = this.f1955h;
        int i8 = this.f1956i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int[] iArr = this.f1951d;
            int i11 = iArr[i8];
            int i12 = solverVariable.f1931c;
            if (i11 == i12) {
                this.f1952e[i8] = f2;
                return;
            }
            if (iArr[i8] < i12) {
                i9 = i8;
            }
            i8 = this.f1954g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f1948a) {
                i2 = -1;
                break;
            } else if (this.f1951d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m1207m(i2, solverVariable, f2);
        if (i9 != -1) {
            this.f1953f[i2] = i9;
            int[] iArr2 = this.f1954g;
            iArr2[i2] = iArr2[i9];
            iArr2[i9] = i2;
        } else {
            this.f1953f[i2] = -1;
            if (this.f1955h > 0) {
                this.f1954g[i2] = this.f1956i;
                this.f1956i = i2;
            } else {
                this.f1954g[i2] = -1;
            }
        }
        int[] iArr3 = this.f1954g;
        if (iArr3[i2] != -1) {
            this.f1953f[iArr3[i2]] = i2;
        }
        m1206l(solverVariable, i2);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: e */
    public SolverVariable mo1155e(int i2) {
        int i3 = this.f1955h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f1956i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f1958k.f1902d[this.f1951d[i4]];
            }
            i4 = this.f1954g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: f */
    public void mo1156f(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int m1208n = m1208n(solverVariable);
            if (m1208n == -1) {
                mo1154d(solverVariable, f2);
                return;
            }
            float[] fArr = this.f1952e;
            fArr[m1208n] = fArr[m1208n] + f2;
            if (fArr[m1208n] <= -0.001f || fArr[m1208n] >= 0.001f) {
                return;
            }
            fArr[m1208n] = 0.0f;
            mo1159i(solverVariable, z);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: g */
    public void mo1157g() {
        int i2 = this.f1955h;
        int i3 = this.f1956i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1952e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f1954g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: h */
    public float mo1158h(int i2) {
        int i3 = this.f1955h;
        int i4 = this.f1956i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f1952e[i4];
            }
            i4 = this.f1954g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: i */
    public float mo1159i(SolverVariable solverVariable, boolean z) {
        int[] iArr;
        int m1208n = m1208n(solverVariable);
        if (m1208n == -1) {
            return 0.0f;
        }
        int i2 = solverVariable.f1931c;
        int i3 = i2 % 16;
        int[] iArr2 = this.f1949b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f1951d[i4] == i2) {
                int[] iArr3 = this.f1950c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f1950c;
                    if (iArr[i4] == -1 || this.f1951d[iArr[i4]] == i2) {
                        break;
                    }
                    i4 = iArr[i4];
                }
                int i5 = iArr[i4];
                if (i5 != -1 && this.f1951d[i5] == i2) {
                    iArr[i4] = iArr[i5];
                    iArr[i5] = -1;
                }
            }
        }
        float f2 = this.f1952e[m1208n];
        if (this.f1956i == m1208n) {
            this.f1956i = this.f1954g[m1208n];
        }
        this.f1951d[m1208n] = -1;
        int[] iArr4 = this.f1953f;
        if (iArr4[m1208n] != -1) {
            int[] iArr5 = this.f1954g;
            iArr5[iArr4[m1208n]] = iArr5[m1208n];
        }
        int[] iArr6 = this.f1954g;
        if (iArr6[m1208n] != -1) {
            iArr4[iArr6[m1208n]] = iArr4[m1208n];
        }
        this.f1955h--;
        solverVariable.f1941m--;
        if (z) {
            solverVariable.m1202b(this.f1957j);
        }
        return f2;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: j */
    public float mo1160j(SolverVariable solverVariable) {
        int m1208n = m1208n(solverVariable);
        if (m1208n != -1) {
            return this.f1952e[m1208n];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: k */
    public void mo1161k(float f2) {
        int i2 = this.f1955h;
        int i3 = this.f1956i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1952e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f1954g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void m1206l(SolverVariable solverVariable, int i2) {
        int[] iArr;
        int i3 = solverVariable.f1931c % 16;
        int[] iArr2 = this.f1949b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f1950c;
                if (iArr[i4] == -1) {
                    break;
                } else {
                    i4 = iArr[i4];
                }
            }
            iArr[i4] = i2;
        }
        this.f1950c[i2] = -1;
    }

    /* renamed from: m */
    public final void m1207m(int i2, SolverVariable solverVariable, float f2) {
        this.f1951d[i2] = solverVariable.f1931c;
        this.f1952e[i2] = f2;
        this.f1953f[i2] = -1;
        this.f1954g[i2] = -1;
        solverVariable.m1201a(this.f1957j);
        solverVariable.f1941m++;
        this.f1955h++;
    }

    /* renamed from: n */
    public int m1208n(SolverVariable solverVariable) {
        int[] iArr;
        if (this.f1955h != 0 && solverVariable != null) {
            int i2 = solverVariable.f1931c;
            int i3 = this.f1949b[i2 % 16];
            if (i3 == -1) {
                return -1;
            }
            if (this.f1951d[i3] == i2) {
                return i3;
            }
            while (true) {
                iArr = this.f1950c;
                if (iArr[i3] == -1 || this.f1951d[iArr[i3]] == i2) {
                    break;
                }
                i3 = iArr[i3];
            }
            if (iArr[i3] != -1 && this.f1951d[iArr[i3]] == i2) {
                return iArr[i3];
            }
        }
        return -1;
    }

    public String toString() {
        String m14k;
        String m14k2;
        String str = hashCode() + " { ";
        int i2 = this.f1955h;
        for (int i3 = 0; i3 < i2; i3++) {
            SolverVariable mo1155e = mo1155e(i3);
            if (mo1155e != null) {
                String str2 = str + mo1155e + " = " + mo1158h(i3) + " ";
                int m1208n = m1208n(mo1155e);
                String m14k3 = C0000a.m14k(str2, "[p: ");
                if (this.f1953f[m1208n] != -1) {
                    StringBuilder m24u = C0000a.m24u(m14k3);
                    m24u.append(this.f1958k.f1902d[this.f1951d[this.f1953f[m1208n]]]);
                    m14k = m24u.toString();
                } else {
                    m14k = C0000a.m14k(m14k3, "none");
                }
                String m14k4 = C0000a.m14k(m14k, ", n: ");
                if (this.f1954g[m1208n] != -1) {
                    StringBuilder m24u2 = C0000a.m24u(m14k4);
                    m24u2.append(this.f1958k.f1902d[this.f1951d[this.f1954g[m1208n]]]);
                    m14k2 = m24u2.toString();
                } else {
                    m14k2 = C0000a.m14k(m14k4, "none");
                }
                str = C0000a.m14k(m14k2, "]");
            }
        }
        return C0000a.m14k(str, " }");
    }
}
