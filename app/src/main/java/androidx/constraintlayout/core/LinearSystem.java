package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class LinearSystem {

    /* renamed from: p */
    public static boolean f1903p = false;

    /* renamed from: q */
    public static int f1904q = 1000;

    /* renamed from: r */
    public static long f1905r;

    /* renamed from: c */
    public Row f1908c;

    /* renamed from: f */
    public ArrayRow[] f1911f;

    /* renamed from: l */
    public final Cache f1917l;

    /* renamed from: o */
    public Row f1920o;

    /* renamed from: a */
    public boolean f1906a = false;

    /* renamed from: b */
    public int f1907b = 0;

    /* renamed from: d */
    public int f1909d = 32;

    /* renamed from: e */
    public int f1910e = 32;

    /* renamed from: g */
    public boolean f1912g = false;

    /* renamed from: h */
    public boolean[] f1913h = new boolean[32];

    /* renamed from: i */
    public int f1914i = 1;

    /* renamed from: j */
    public int f1915j = 0;

    /* renamed from: k */
    public int f1916k = 32;

    /* renamed from: m */
    public SolverVariable[] f1918m = new SolverVariable[f1904q];

    /* renamed from: n */
    public int f1919n = 0;

    public interface Row {
        /* renamed from: a */
        void mo1162a(Row row);

        /* renamed from: b */
        SolverVariable mo1163b(LinearSystem linearSystem, boolean[] zArr);

        /* renamed from: c */
        void mo1164c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    public class ValuesRow extends ArrayRow {
    }

    public LinearSystem() {
        this.f1911f = null;
        this.f1911f = new ArrayRow[32];
        m1194t();
        Cache cache = new Cache();
        this.f1917l = cache;
        this.f1908c = new PriorityGoalRow(cache);
        this.f1920o = new ArrayRow(cache);
    }

    /* renamed from: a */
    public final SolverVariable m1175a(SolverVariable.Type type, String str) {
        SolverVariable mo1197b = this.f1917l.f1901c.mo1197b();
        if (mo1197b == null) {
            mo1197b = new SolverVariable(type);
            mo1197b.f1938j = type;
        } else {
            mo1197b.m1203c();
            mo1197b.f1938j = type;
        }
        int i2 = this.f1919n;
        int i3 = f1904q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1904q = i4;
            this.f1918m = (SolverVariable[]) Arrays.copyOf(this.f1918m, i4);
        }
        SolverVariable[] solverVariableArr = this.f1918m;
        int i5 = this.f1919n;
        this.f1919n = i5 + 1;
        solverVariableArr[i5] = mo1197b;
        return mo1197b;
    }

    /* renamed from: b */
    public void m1176b(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
        ArrayRow m1187m = m1187m();
        if (solverVariable2 == solverVariable3) {
            m1187m.f1897d.mo1154d(solverVariable, 1.0f);
            m1187m.f1897d.mo1154d(solverVariable4, 1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, -2.0f);
        } else if (f2 == 0.5f) {
            m1187m.f1897d.mo1154d(solverVariable, 1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, -1.0f);
            m1187m.f1897d.mo1154d(solverVariable3, -1.0f);
            m1187m.f1897d.mo1154d(solverVariable4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m1187m.f1895b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            m1187m.f1897d.mo1154d(solverVariable, -1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, 1.0f);
            m1187m.f1895b = i2;
        } else if (f2 >= 1.0f) {
            m1187m.f1897d.mo1154d(solverVariable4, -1.0f);
            m1187m.f1897d.mo1154d(solverVariable3, 1.0f);
            m1187m.f1895b = -i3;
        } else {
            float f3 = 1.0f - f2;
            m1187m.f1897d.mo1154d(solverVariable, f3 * 1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, f3 * (-1.0f));
            m1187m.f1897d.mo1154d(solverVariable3, (-1.0f) * f2);
            m1187m.f1897d.mo1154d(solverVariable4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                m1187m.f1895b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            m1187m.m1165d(this, i4);
        }
        m1177c(m1187m);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0195  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1177c(androidx.constraintlayout.core.ArrayRow r17) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.m1177c(androidx.constraintlayout.core.ArrayRow):void");
    }

    /* renamed from: d */
    public ArrayRow m1178d(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        if (i3 == 8 && solverVariable2.f1935g && solverVariable.f1932d == -1) {
            solverVariable.m1204d(this, solverVariable2.f1934f + i2);
            return null;
        }
        ArrayRow m1187m = m1187m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m1187m.f1895b = i2;
        }
        if (z) {
            m1187m.f1897d.mo1154d(solverVariable, 1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, -1.0f);
        } else {
            m1187m.f1897d.mo1154d(solverVariable, -1.0f);
            m1187m.f1897d.mo1154d(solverVariable2, 1.0f);
        }
        if (i3 != 8) {
            m1187m.m1165d(this, i3);
        }
        m1177c(m1187m);
        return m1187m;
    }

    /* renamed from: e */
    public void m1179e(SolverVariable solverVariable, int i2) {
        int i3 = solverVariable.f1932d;
        if (i3 == -1) {
            solverVariable.m1204d(this, i2);
            for (int i4 = 0; i4 < this.f1907b + 1; i4++) {
                SolverVariable solverVariable2 = this.f1917l.f1902d[i4];
            }
            return;
        }
        if (i3 == -1) {
            ArrayRow m1187m = m1187m();
            m1187m.f1894a = solverVariable;
            float f2 = i2;
            solverVariable.f1934f = f2;
            m1187m.f1895b = f2;
            m1187m.f1898e = true;
            m1177c(m1187m);
            return;
        }
        ArrayRow arrayRow = this.f1911f[i3];
        if (arrayRow.f1898e) {
            arrayRow.f1895b = i2;
            return;
        }
        if (arrayRow.f1897d.mo1151a() == 0) {
            arrayRow.f1898e = true;
            arrayRow.f1895b = i2;
            return;
        }
        ArrayRow m1187m2 = m1187m();
        if (i2 < 0) {
            m1187m2.f1895b = i2 * (-1);
            m1187m2.f1897d.mo1154d(solverVariable, 1.0f);
        } else {
            m1187m2.f1895b = i2;
            m1187m2.f1897d.mo1154d(solverVariable, -1.0f);
        }
        m1177c(m1187m2);
    }

    /* renamed from: f */
    public void m1180f(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow m1187m = m1187m();
        SolverVariable m1188n = m1188n();
        m1188n.f1933e = 0;
        m1187m.m1167f(solverVariable, solverVariable2, m1188n, i2);
        if (i3 != 8) {
            m1187m.f1897d.mo1154d(m1185k(i3, null), (int) (m1187m.f1897d.mo1160j(m1188n) * (-1.0f)));
        }
        m1177c(m1187m);
    }

    /* renamed from: g */
    public void m1181g(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow m1187m = m1187m();
        SolverVariable m1188n = m1188n();
        m1188n.f1933e = 0;
        m1187m.m1168g(solverVariable, solverVariable2, m1188n, i2);
        if (i3 != 8) {
            m1187m.f1897d.mo1154d(m1185k(i3, null), (int) (m1187m.f1897d.mo1160j(m1188n) * (-1.0f)));
        }
        m1177c(m1187m);
    }

    /* renamed from: h */
    public void m1182h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
        ArrayRow m1187m = m1187m();
        m1187m.m1166e(solverVariable, solverVariable2, solverVariable3, solverVariable4, f2);
        if (i2 != 8) {
            m1187m.m1165d(this, i2);
        }
        m1177c(m1187m);
    }

    /* renamed from: i */
    public final void m1183i(ArrayRow arrayRow) {
        int i2;
        if (arrayRow.f1898e) {
            arrayRow.f1894a.m1204d(this, arrayRow.f1895b);
        } else {
            ArrayRow[] arrayRowArr = this.f1911f;
            int i3 = this.f1915j;
            arrayRowArr[i3] = arrayRow;
            SolverVariable solverVariable = arrayRow.f1894a;
            solverVariable.f1932d = i3;
            this.f1915j = i3 + 1;
            solverVariable.m1205e(this, arrayRow);
        }
        if (this.f1906a) {
            int i4 = 0;
            while (i4 < this.f1915j) {
                if (this.f1911f[i4] == null) {
                    System.out.println("WTF");
                }
                ArrayRow[] arrayRowArr2 = this.f1911f;
                if (arrayRowArr2[i4] != null && arrayRowArr2[i4].f1898e) {
                    ArrayRow arrayRow2 = arrayRowArr2[i4];
                    arrayRow2.f1894a.m1204d(this, arrayRow2.f1895b);
                    this.f1917l.f1900b.mo1196a(arrayRow2);
                    this.f1911f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f1915j;
                        if (i5 >= i2) {
                            break;
                        }
                        ArrayRow[] arrayRowArr3 = this.f1911f;
                        int i7 = i5 - 1;
                        arrayRowArr3[i7] = arrayRowArr3[i5];
                        if (arrayRowArr3[i7].f1894a.f1932d == i5) {
                            arrayRowArr3[i7].f1894a.f1932d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f1911f[i6] = null;
                    }
                    this.f1915j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f1906a = false;
        }
    }

    /* renamed from: j */
    public final void m1184j() {
        for (int i2 = 0; i2 < this.f1915j; i2++) {
            ArrayRow arrayRow = this.f1911f[i2];
            arrayRow.f1894a.f1934f = arrayRow.f1895b;
        }
    }

    /* renamed from: k */
    public SolverVariable m1185k(int i2, String str) {
        if (this.f1914i + 1 >= this.f1910e) {
            m1190p();
        }
        SolverVariable m1175a = m1175a(SolverVariable.Type.ERROR, str);
        int i3 = this.f1907b + 1;
        this.f1907b = i3;
        this.f1914i++;
        m1175a.f1931c = i3;
        m1175a.f1933e = i2;
        this.f1917l.f1902d[i3] = m1175a;
        this.f1908c.mo1164c(m1175a);
        return m1175a;
    }

    /* renamed from: l */
    public SolverVariable m1186l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f1914i + 1 >= this.f1910e) {
            m1190p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f2145i;
            if (solverVariable == null) {
                constraintAnchor.m1243l();
                solverVariable = constraintAnchor.f2145i;
            }
            int i2 = solverVariable.f1931c;
            if (i2 == -1 || i2 > this.f1907b || this.f1917l.f1902d[i2] == null) {
                if (i2 != -1) {
                    solverVariable.m1203c();
                }
                int i3 = this.f1907b + 1;
                this.f1907b = i3;
                this.f1914i++;
                solverVariable.f1931c = i3;
                solverVariable.f1938j = SolverVariable.Type.UNRESTRICTED;
                this.f1917l.f1902d[i3] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: m */
    public ArrayRow m1187m() {
        ArrayRow mo1197b = this.f1917l.f1900b.mo1197b();
        if (mo1197b == null) {
            mo1197b = new ArrayRow(this.f1917l);
            f1905r++;
        } else {
            mo1197b.f1894a = null;
            mo1197b.f1897d.clear();
            mo1197b.f1895b = 0.0f;
            mo1197b.f1898e = false;
        }
        SolverVariable.f1929n++;
        return mo1197b;
    }

    /* renamed from: n */
    public SolverVariable m1188n() {
        if (this.f1914i + 1 >= this.f1910e) {
            m1190p();
        }
        SolverVariable m1175a = m1175a(SolverVariable.Type.SLACK, null);
        int i2 = this.f1907b + 1;
        this.f1907b = i2;
        this.f1914i++;
        m1175a.f1931c = i2;
        this.f1917l.f1902d[i2] = m1175a;
        return m1175a;
    }

    /* renamed from: o */
    public int m1189o(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f2145i;
        if (solverVariable != null) {
            return (int) (solverVariable.f1934f + 0.5f);
        }
        return 0;
    }

    /* renamed from: p */
    public final void m1190p() {
        int i2 = this.f1909d * 2;
        this.f1909d = i2;
        this.f1911f = (ArrayRow[]) Arrays.copyOf(this.f1911f, i2);
        Cache cache = this.f1917l;
        cache.f1902d = (SolverVariable[]) Arrays.copyOf(cache.f1902d, this.f1909d);
        int i3 = this.f1909d;
        this.f1913h = new boolean[i3];
        this.f1910e = i3;
        this.f1916k = i3;
    }

    /* renamed from: q */
    public void m1191q() throws Exception {
        if (this.f1908c.isEmpty()) {
            m1184j();
            return;
        }
        if (!this.f1912g) {
            m1192r(this.f1908c);
            return;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f1915j) {
                z = true;
                break;
            } else if (!this.f1911f[i2].f1898e) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            m1184j();
        } else {
            m1192r(this.f1908c);
        }
    }

    /* renamed from: r */
    public void m1192r(Row row) throws Exception {
        float f2;
        int i2;
        boolean z;
        SolverVariable.Type type = SolverVariable.Type.UNRESTRICTED;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.f1915j) {
                z = false;
                break;
            }
            ArrayRow[] arrayRowArr = this.f1911f;
            if (arrayRowArr[i3].f1894a.f1938j != type && arrayRowArr[i3].f1895b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f1915j) {
                    ArrayRow arrayRow = this.f1911f[i5];
                    if (arrayRow.f1894a.f1938j != type && !arrayRow.f1898e && arrayRow.f1895b < f2) {
                        int mo1151a = arrayRow.f1897d.mo1151a();
                        int i9 = 0;
                        while (i9 < mo1151a) {
                            SolverVariable mo1155e = arrayRow.f1897d.mo1155e(i9);
                            float mo1160j = arrayRow.f1897d.mo1160j(mo1155e);
                            if (mo1160j > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = mo1155e.f1936h[i10] / mo1160j;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i7 = mo1155e.f1931c;
                                        i8 = i10;
                                        f3 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i5++;
                    f2 = 0.0f;
                }
                if (i6 != -1) {
                    ArrayRow arrayRow2 = this.f1911f[i6];
                    arrayRow2.f1894a.f1932d = -1;
                    arrayRow2.m1172k(this.f1917l.f1902d[i7]);
                    SolverVariable solverVariable = arrayRow2.f1894a;
                    solverVariable.f1932d = i6;
                    solverVariable.m1205e(this, arrayRow2);
                } else {
                    z2 = true;
                }
                if (i4 > this.f1914i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        m1193s(row);
        m1184j();
    }

    /* renamed from: s */
    public final int m1193s(Row row) {
        for (int i2 = 0; i2 < this.f1914i; i2++) {
            this.f1913h[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.f1914i * 2) {
                return i3;
            }
            if (row.getKey() != null) {
                this.f1913h[row.getKey().f1931c] = true;
            }
            SolverVariable mo1163b = row.mo1163b(this, this.f1913h);
            if (mo1163b != null) {
                boolean[] zArr = this.f1913h;
                int i4 = mo1163b.f1931c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (mo1163b != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f1915j; i6++) {
                    ArrayRow arrayRow = this.f1911f[i6];
                    if (arrayRow.f1894a.f1938j != SolverVariable.Type.UNRESTRICTED && !arrayRow.f1898e && arrayRow.f1897d.mo1152b(mo1163b)) {
                        float mo1160j = arrayRow.f1897d.mo1160j(mo1163b);
                        if (mo1160j < 0.0f) {
                            float f3 = (-arrayRow.f1895b) / mo1160j;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    ArrayRow arrayRow2 = this.f1911f[i5];
                    arrayRow2.f1894a.f1932d = -1;
                    arrayRow2.m1172k(mo1163b);
                    SolverVariable solverVariable = arrayRow2.f1894a;
                    solverVariable.f1932d = i5;
                    solverVariable.m1205e(this, arrayRow2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    /* renamed from: t */
    public final void m1194t() {
        for (int i2 = 0; i2 < this.f1915j; i2++) {
            ArrayRow arrayRow = this.f1911f[i2];
            if (arrayRow != null) {
                this.f1917l.f1900b.mo1196a(arrayRow);
            }
            this.f1911f[i2] = null;
        }
    }

    /* renamed from: u */
    public void m1195u() {
        Cache cache;
        int i2 = 0;
        while (true) {
            cache = this.f1917l;
            SolverVariable[] solverVariableArr = cache.f1902d;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.m1203c();
            }
            i2++;
        }
        cache.f1901c.mo1198c(this.f1918m, this.f1919n);
        this.f1919n = 0;
        Arrays.fill(this.f1917l.f1902d, (Object) null);
        this.f1907b = 0;
        this.f1908c.clear();
        this.f1914i = 1;
        for (int i3 = 0; i3 < this.f1915j; i3++) {
            ArrayRow[] arrayRowArr = this.f1911f;
            if (arrayRowArr[i3] != null) {
                Objects.requireNonNull(arrayRowArr[i3]);
            }
        }
        m1194t();
        this.f1915j = 0;
        this.f1920o = new ArrayRow(this.f1917l);
    }
}
