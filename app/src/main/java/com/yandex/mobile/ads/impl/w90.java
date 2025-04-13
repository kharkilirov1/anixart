package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.t71;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class w90 extends d71 {

    /* renamed from: com.yandex.mobile.ads.impl.w90$a */
    public static final class C5964a {

        /* renamed from: a */
        private final int f56056a;

        /* renamed from: b */
        private final int[] f56057b;

        /* renamed from: c */
        private final x61[] f56058c;

        /* renamed from: d */
        private final int[] f56059d;

        /* renamed from: e */
        private final int[][][] f56060e;

        /* renamed from: f */
        private final x61 f56061f;

        @VisibleForTesting
        public C5964a(int[] iArr, x61[] x61VarArr, int[] iArr2, int[][][] iArr3, x61 x61Var) {
            this.f56057b = iArr;
            this.f56058c = x61VarArr;
            this.f56060e = iArr3;
            this.f56059d = iArr2;
            this.f56061f = x61Var;
            this.f56056a = iArr.length;
        }

        /* renamed from: a */
        public final int m29409a() {
            return this.f56056a;
        }

        /* renamed from: b */
        public final x61 m29414b(int i2) {
            return this.f56058c[i2];
        }

        /* renamed from: a */
        public final int m29410a(int i2) {
            return this.f56057b[i2];
        }

        /* renamed from: b */
        public final x61 m29413b() {
            return this.f56061f;
        }

        /* renamed from: a */
        public final int m29412a(int i2, int i3, int i4) {
            return this.f56060e[i2][i3][i4] & 7;
        }

        /* renamed from: a */
        public final int m29411a(int i2, int i3) {
            int i4 = this.f56058c[i2].m29682a(i3).f56028a;
            int[] iArr = new int[i4];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                if (m29412a(i2, i3, i7) == 4) {
                    iArr[i6] = i7;
                    i6++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            int i8 = 16;
            String str = null;
            boolean z = false;
            int i9 = 0;
            while (i5 < copyOf.length) {
                String str2 = this.f56058c[i2].m29682a(i3).m29393a(copyOf[i5]).f53820l;
                int i10 = i9 + 1;
                if (i9 == 0) {
                    str = str2;
                } else {
                    z |= !s91.m28112a(str, str2);
                }
                i8 = Math.min(i8, this.f56060e[i2][i3][i5] & 24);
                i5++;
                i9 = i10;
            }
            return z ? Math.min(i8, this.f56059d[i2]) : i8;
        }
    }

    /* renamed from: a */
    public abstract Pair mo25291a(C5964a c5964a, int[][][] iArr, int[] iArr2) throws C5043es;

    @Override // com.yandex.mobile.ads.impl.d71
    /* renamed from: a */
    public final void mo23826a(@Nullable Object obj) {
    }

    @Override // com.yandex.mobile.ads.impl.d71
    /* renamed from: a */
    public final e71 mo23822a(dv0[] dv0VarArr, x61 x61Var, bc0.C4858b c4858b, k61 k61Var) throws C5043es {
        boolean z;
        int[] iArr;
        x61 x61Var2 = x61Var;
        int[] iArr2 = new int[dv0VarArr.length + 1];
        int length = dv0VarArr.length + 1;
        w61[][] w61VarArr = new w61[length][];
        int[][][] iArr3 = new int[dv0VarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = x61Var2.f56385a;
            w61VarArr[i2] = new w61[i3];
            iArr3[i2] = new int[i3][];
        }
        int length2 = dv0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr4[i4] = dv0VarArr[i4].mo23944f();
        }
        int i5 = 0;
        while (i5 < x61Var2.f56385a) {
            w61 m29682a = x61Var2.m29682a(i5);
            boolean z2 = m29682a.f56030c == 5;
            int length3 = dv0VarArr.length;
            int i6 = 0;
            boolean z3 = true;
            for (int i7 = 0; i7 < dv0VarArr.length; i7++) {
                dv0 dv0Var = dv0VarArr[i7];
                int i8 = 0;
                for (int i9 = 0; i9 < m29682a.f56028a; i9++) {
                    i8 = Math.max(i8, dv0Var.mo22243a(m29682a.m29393a(i9)) & 7);
                }
                boolean z4 = iArr2[i7] == 0;
                if (i8 > i6 || (i8 == i6 && z2 && !z3 && z4)) {
                    z3 = z4;
                    i6 = i8;
                    length3 = i7;
                }
            }
            if (length3 == dv0VarArr.length) {
                iArr = new int[m29682a.f56028a];
            } else {
                dv0 dv0Var2 = dv0VarArr[length3];
                int[] iArr5 = new int[m29682a.f56028a];
                for (int i10 = 0; i10 < m29682a.f56028a; i10++) {
                    iArr5[i10] = dv0Var2.mo22243a(m29682a.m29393a(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length3];
            w61VarArr[length3][i11] = m29682a;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = i11 + 1;
            i5++;
            x61Var2 = x61Var;
        }
        x61[] x61VarArr = new x61[dv0VarArr.length];
        String[] strArr = new String[dv0VarArr.length];
        int[] iArr6 = new int[dv0VarArr.length];
        for (int i12 = 0; i12 < dv0VarArr.length; i12++) {
            int i13 = iArr2[i12];
            x61VarArr[i12] = new x61((w61[]) s91.m28113a(i13, w61VarArr[i12]));
            iArr3[i12] = (int[][]) s91.m28113a(i13, iArr3[i12]);
            strArr[i12] = dv0VarArr[i12].getName();
            iArr6[i12] = ((AbstractC5074fe) dv0VarArr[i12]).mo23533m();
        }
        C5964a c5964a = new C5964a(iArr6, x61VarArr, iArr4, iArr3, new x61((w61[]) s91.m28113a(iArr2[dv0VarArr.length], w61VarArr[dv0VarArr.length])));
        Pair mo25291a = mo25291a(c5964a, iArr3, iArr4);
        a71[] a71VarArr = (a71[]) mo25291a.second;
        List[] listArr = new List[a71VarArr.length];
        for (int i14 = 0; i14 < a71VarArr.length; i14++) {
            a71 a71Var = a71VarArr[i14];
            listArr[i14] = a71Var != null ? AbstractC4698p.m22048a(a71Var) : AbstractC4698p.m22055i();
        }
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        for (int i15 = 0; i15 < c5964a.m29409a(); i15++) {
            x61 m29414b = c5964a.m29414b(i15);
            List list = listArr[i15];
            for (int i16 = 0; i16 < m29414b.f56385a; i16++) {
                w61 m29682a2 = m29414b.m29682a(i16);
                boolean z5 = c5964a.m29411a(i15, i16) != 0;
                int i17 = m29682a2.f56028a;
                int[] iArr7 = new int[i17];
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 < m29682a2.f56028a; i18++) {
                    iArr7[i18] = c5964a.m29412a(i15, i16, i18);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            z = false;
                            break;
                        }
                        a71 a71Var2 = (a71) list.get(i19);
                        if (a71Var2.mo22394a().equals(m29682a2) && a71Var2.mo22396c(i18) != -1) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                    zArr[i18] = z;
                }
                aVar.m22060b(new t71.C5785a(m29682a2, z5, iArr7, zArr));
            }
        }
        x61 m29413b = c5964a.m29413b();
        for (int i20 = 0; i20 < m29413b.f56385a; i20++) {
            w61 m29682a3 = m29413b.m29682a(i20);
            int[] iArr8 = new int[m29682a3.f56028a];
            Arrays.fill(iArr8, 0);
            aVar.m22060b(new t71.C5785a(m29682a3, false, iArr8, new boolean[m29682a3.f56028a]));
        }
        return new e71((ev0[]) mo25291a.first, (InterfaceC5939vs[]) mo25291a.second, new t71(aVar.m22058a()), c5964a);
    }
}
