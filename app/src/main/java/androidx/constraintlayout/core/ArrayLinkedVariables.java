package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* renamed from: b */
    public final ArrayRow f1885b;

    /* renamed from: c */
    public final Cache f1886c;

    /* renamed from: a */
    public int f1884a = 0;

    /* renamed from: d */
    public int f1887d = 8;

    /* renamed from: e */
    public int[] f1888e = new int[8];

    /* renamed from: f */
    public int[] f1889f = new int[8];

    /* renamed from: g */
    public float[] f1890g = new float[8];

    /* renamed from: h */
    public int f1891h = -1;

    /* renamed from: i */
    public int f1892i = -1;

    /* renamed from: j */
    public boolean f1893j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f1885b = arrayRow;
        this.f1886c = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: a */
    public int mo1151a() {
        return this.f1884a;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: b */
    public boolean mo1152b(SolverVariable solverVariable) {
        int i2 = this.f1891h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            if (this.f1888e[i2] == solverVariable.f1931c) {
                return true;
            }
            i2 = this.f1889f[i2];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: c */
    public float mo1153c(ArrayRow arrayRow, boolean z) {
        float mo1160j = mo1160j(arrayRow.f1894a);
        mo1159i(arrayRow.f1894a, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f1897d;
        int mo1151a = arrayRowVariables.mo1151a();
        for (int i2 = 0; i2 < mo1151a; i2++) {
            SolverVariable mo1155e = arrayRowVariables.mo1155e(i2);
            mo1156f(mo1155e, arrayRowVariables.mo1160j(mo1155e) * mo1160j, z);
        }
        return mo1160j;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i2 = this.f1891h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            SolverVariable solverVariable = this.f1886c.f1902d[this.f1888e[i2]];
            if (solverVariable != null) {
                solverVariable.m1202b(this.f1885b);
            }
            i2 = this.f1889f[i2];
        }
        this.f1891h = -1;
        this.f1892i = -1;
        this.f1893j = false;
        this.f1884a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: d */
    public final void mo1154d(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            mo1159i(solverVariable, true);
            return;
        }
        int i2 = this.f1891h;
        if (i2 == -1) {
            this.f1891h = 0;
            this.f1890g[0] = f2;
            this.f1888e[0] = solverVariable.f1931c;
            this.f1889f[0] = -1;
            solverVariable.f1941m++;
            solverVariable.m1201a(this.f1885b);
            this.f1884a++;
            if (this.f1893j) {
                return;
            }
            int i3 = this.f1892i + 1;
            this.f1892i = i3;
            int[] iArr = this.f1888e;
            if (i3 >= iArr.length) {
                this.f1893j = true;
                this.f1892i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1884a; i5++) {
            int[] iArr2 = this.f1888e;
            int i6 = iArr2[i2];
            int i7 = solverVariable.f1931c;
            if (i6 == i7) {
                this.f1890g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f1889f[i2];
        }
        int i8 = this.f1892i;
        int i9 = i8 + 1;
        if (this.f1893j) {
            int[] iArr3 = this.f1888e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f1888e;
        if (i8 >= iArr4.length && this.f1884a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f1888e;
                if (i10 >= iArr5.length) {
                    break;
                }
                if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr6 = this.f1888e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f1887d * 2;
            this.f1887d = i11;
            this.f1893j = false;
            this.f1892i = i8 - 1;
            this.f1890g = Arrays.copyOf(this.f1890g, i11);
            this.f1888e = Arrays.copyOf(this.f1888e, this.f1887d);
            this.f1889f = Arrays.copyOf(this.f1889f, this.f1887d);
        }
        this.f1888e[i8] = solverVariable.f1931c;
        this.f1890g[i8] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f1889f;
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            this.f1889f[i8] = this.f1891h;
            this.f1891h = i8;
        }
        solverVariable.f1941m++;
        solverVariable.m1201a(this.f1885b);
        int i12 = this.f1884a + 1;
        this.f1884a = i12;
        if (!this.f1893j) {
            this.f1892i++;
        }
        int[] iArr8 = this.f1888e;
        if (i12 >= iArr8.length) {
            this.f1893j = true;
        }
        if (this.f1892i >= iArr8.length) {
            this.f1893j = true;
            this.f1892i = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: e */
    public SolverVariable mo1155e(int i2) {
        int i3 = this.f1891h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1884a; i4++) {
            if (i4 == i2) {
                return this.f1886c.f1902d[this.f1888e[i3]];
            }
            i3 = this.f1889f[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: f */
    public void mo1156f(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f1891h;
            if (i2 == -1) {
                this.f1891h = 0;
                this.f1890g[0] = f2;
                this.f1888e[0] = solverVariable.f1931c;
                this.f1889f[0] = -1;
                solverVariable.f1941m++;
                solverVariable.m1201a(this.f1885b);
                this.f1884a++;
                if (this.f1893j) {
                    return;
                }
                int i3 = this.f1892i + 1;
                this.f1892i = i3;
                int[] iArr = this.f1888e;
                if (i3 >= iArr.length) {
                    this.f1893j = true;
                    this.f1892i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f1884a; i5++) {
                int[] iArr2 = this.f1888e;
                int i6 = iArr2[i2];
                int i7 = solverVariable.f1931c;
                if (i6 == i7) {
                    float[] fArr = this.f1890g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f1891h) {
                            this.f1891h = this.f1889f[i2];
                        } else {
                            int[] iArr3 = this.f1889f;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            solverVariable.m1202b(this.f1885b);
                        }
                        if (this.f1893j) {
                            this.f1892i = i2;
                        }
                        solverVariable.f1941m--;
                        this.f1884a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f1889f[i2];
            }
            int i8 = this.f1892i;
            int i9 = i8 + 1;
            if (this.f1893j) {
                int[] iArr4 = this.f1888e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f1888e;
            if (i8 >= iArr5.length && this.f1884a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f1888e;
                    if (i10 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr7 = this.f1888e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f1887d * 2;
                this.f1887d = i11;
                this.f1893j = false;
                this.f1892i = i8 - 1;
                this.f1890g = Arrays.copyOf(this.f1890g, i11);
                this.f1888e = Arrays.copyOf(this.f1888e, this.f1887d);
                this.f1889f = Arrays.copyOf(this.f1889f, this.f1887d);
            }
            this.f1888e[i8] = solverVariable.f1931c;
            this.f1890g[i8] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f1889f;
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                this.f1889f[i8] = this.f1891h;
                this.f1891h = i8;
            }
            solverVariable.f1941m++;
            solverVariable.m1201a(this.f1885b);
            this.f1884a++;
            if (!this.f1893j) {
                this.f1892i++;
            }
            int i12 = this.f1892i;
            int[] iArr9 = this.f1888e;
            if (i12 >= iArr9.length) {
                this.f1893j = true;
                this.f1892i = iArr9.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: g */
    public void mo1157g() {
        int i2 = this.f1891h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            float[] fArr = this.f1890g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1889f[i2];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: h */
    public float mo1158h(int i2) {
        int i3 = this.f1891h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1884a; i4++) {
            if (i4 == i2) {
                return this.f1890g[i3];
            }
            i3 = this.f1889f[i3];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: i */
    public final float mo1159i(SolverVariable solverVariable, boolean z) {
        int i2 = this.f1891h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1884a) {
            if (this.f1888e[i2] == solverVariable.f1931c) {
                if (i2 == this.f1891h) {
                    this.f1891h = this.f1889f[i2];
                } else {
                    int[] iArr = this.f1889f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.m1202b(this.f1885b);
                }
                solverVariable.f1941m--;
                this.f1884a--;
                this.f1888e[i2] = -1;
                if (this.f1893j) {
                    this.f1892i = i2;
                }
                return this.f1890g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1889f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: j */
    public final float mo1160j(SolverVariable solverVariable) {
        int i2 = this.f1891h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            if (this.f1888e[i2] == solverVariable.f1931c) {
                return this.f1890g[i2];
            }
            i2 = this.f1889f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* renamed from: k */
    public void mo1161k(float f2) {
        int i2 = this.f1891h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            float[] fArr = this.f1890g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1889f[i2];
        }
    }

    public String toString() {
        int i2 = this.f1891h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f1884a; i3++) {
            StringBuilder m24u = C0000a.m24u(C0000a.m14k(str, " -> "));
            m24u.append(this.f1890g[i2]);
            m24u.append(" : ");
            StringBuilder m24u2 = C0000a.m24u(m24u.toString());
            m24u2.append(this.f1886c.f1902d[this.f1888e[i2]]);
            str = m24u2.toString();
            i2 = this.f1889f[i2];
        }
        return str;
    }
}
