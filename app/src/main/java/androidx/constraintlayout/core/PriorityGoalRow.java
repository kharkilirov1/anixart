package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {

    /* renamed from: f */
    public SolverVariable[] f1923f;

    /* renamed from: g */
    public SolverVariable[] f1924g;

    /* renamed from: h */
    public int f1925h;

    /* renamed from: i */
    public GoalVariableAccessor f1926i;

    public class GoalVariableAccessor {

        /* renamed from: a */
        public SolverVariable f1927a;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
        }

        public String toString() {
            String str = "[ ";
            if (this.f1927a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder m24u = C0000a.m24u(str);
                    m24u.append(this.f1927a.f1937i[i2]);
                    m24u.append(" ");
                    str = m24u.toString();
                }
            }
            StringBuilder m27x = C0000a.m27x(str, "] ");
            m27x.append(this.f1927a);
            return m27x.toString();
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.f1923f = new SolverVariable[128];
        this.f1924g = new SolverVariable[128];
        this.f1925h = 0;
        this.f1926i = new GoalVariableAccessor(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r8 < r7) goto L30;
     */
    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.core.SolverVariable mo1163b(androidx.constraintlayout.core.LinearSystem r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            int r3 = r10.f1925h
            if (r1 >= r3) goto L57
            androidx.constraintlayout.core.SolverVariable[] r3 = r10.f1923f
            r4 = r3[r1]
            int r5 = r4.f1931c
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L54
        L13:
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r5 = r10.f1926i
            r5.f1927a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L36
        L1c:
            if (r4 < 0) goto L32
            androidx.constraintlayout.core.SolverVariable r3 = r5.f1927a
            float[] r3 = r3.f1937i
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2a
            goto L32
        L2a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L33
        L2f:
            int r4 = r4 + (-1)
            goto L1c
        L32:
            r6 = 0
        L33:
            if (r6 == 0) goto L54
            goto L53
        L36:
            r3 = r3[r2]
        L38:
            if (r4 < 0) goto L50
            float[] r7 = r3.f1937i
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r8 = r5.f1927a
            float[] r8 = r8.f1937i
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L4b
            int r4 = r4 + (-1)
            goto L38
        L4b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L50
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L54
        L53:
            r2 = r1
        L54:
            int r1 = r1 + 1
            goto L4
        L57:
            if (r2 != r0) goto L5b
            r11 = 0
            return r11
        L5b:
            androidx.constraintlayout.core.SolverVariable[] r11 = r10.f1923f
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.PriorityGoalRow.mo1163b(androidx.constraintlayout.core.LinearSystem, boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    /* renamed from: c */
    public void mo1164c(SolverVariable solverVariable) {
        this.f1926i.f1927a = solverVariable;
        Arrays.fill(solverVariable.f1937i, 0.0f);
        solverVariable.f1937i[solverVariable.f1933e] = 1.0f;
        m1199n(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.f1925h = 0;
        this.f1895b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.f1925h == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    /* renamed from: m */
    public void mo1174m(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.f1894a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f1897d;
        int mo1151a = arrayRowVariables.mo1151a();
        for (int i2 = 0; i2 < mo1151a; i2++) {
            SolverVariable mo1155e = arrayRowVariables.mo1155e(i2);
            float mo1158h = arrayRowVariables.mo1158h(i2);
            GoalVariableAccessor goalVariableAccessor = this.f1926i;
            goalVariableAccessor.f1927a = mo1155e;
            boolean z2 = true;
            if (mo1155e.f1930b) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = goalVariableAccessor.f1927a.f1937i;
                    fArr[i3] = (solverVariable.f1937i[i3] * mo1158h) + fArr[i3];
                    if (Math.abs(fArr[i3]) < 1.0E-4f) {
                        goalVariableAccessor.f1927a.f1937i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    PriorityGoalRow.this.m1200o(goalVariableAccessor.f1927a);
                }
                z2 = false;
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = solverVariable.f1937i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * mo1158h;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        goalVariableAccessor.f1927a.f1937i[i4] = f3;
                    } else {
                        goalVariableAccessor.f1927a.f1937i[i4] = 0.0f;
                    }
                }
            }
            if (z2) {
                m1199n(mo1155e);
            }
            this.f1895b = (arrayRow.f1895b * mo1158h) + this.f1895b;
        }
        m1200o(solverVariable);
    }

    /* renamed from: n */
    public final void m1199n(SolverVariable solverVariable) {
        int i2;
        int i3 = this.f1925h + 1;
        SolverVariable[] solverVariableArr = this.f1923f;
        if (i3 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f1923f = solverVariableArr2;
            this.f1924g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f1923f;
        int i4 = this.f1925h;
        solverVariableArr3[i4] = solverVariable;
        int i5 = i4 + 1;
        this.f1925h = i5;
        if (i5 > 1 && solverVariableArr3[i5 - 1].f1931c > solverVariable.f1931c) {
            int i6 = 0;
            while (true) {
                i2 = this.f1925h;
                if (i6 >= i2) {
                    break;
                }
                this.f1924g[i6] = this.f1923f[i6];
                i6++;
            }
            Arrays.sort(this.f1924g, 0, i2, new Comparator<SolverVariable>(this) { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.f1931c - solverVariable3.f1931c;
                }
            });
            for (int i7 = 0; i7 < this.f1925h; i7++) {
                this.f1923f[i7] = this.f1924g[i7];
            }
        }
        solverVariable.f1930b = true;
        solverVariable.m1201a(this);
    }

    /* renamed from: o */
    public final void m1200o(SolverVariable solverVariable) {
        int i2 = 0;
        while (i2 < this.f1925h) {
            if (this.f1923f[i2] == solverVariable) {
                while (true) {
                    int i3 = this.f1925h;
                    if (i2 >= i3 - 1) {
                        this.f1925h = i3 - 1;
                        solverVariable.f1930b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f1923f;
                        int i4 = i2 + 1;
                        solverVariableArr[i2] = solverVariableArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        StringBuilder m27x = C0000a.m27x("", " goal -> (");
        m27x.append(this.f1895b);
        m27x.append(") : ");
        String sb = m27x.toString();
        for (int i2 = 0; i2 < this.f1925h; i2++) {
            this.f1926i.f1927a = this.f1923f[i2];
            StringBuilder m24u = C0000a.m24u(sb);
            m24u.append(this.f1926i);
            m24u.append(" ");
            sb = m24u.toString();
        }
        return sb;
    }
}
