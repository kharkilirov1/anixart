package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4710z;
import com.yandex.mobile.ads.impl.InterfaceC5939vs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.yandex.mobile.ads.impl.w6 */
/* loaded from: classes3.dex */
public final class C5959w6 extends AbstractC5119ge {

    /* renamed from: f */
    private final InterfaceC5793tc f56020f;

    /* renamed from: g */
    private final InterfaceC4972di f56021g;

    /* renamed from: com.yandex.mobile.ads.impl.w6$a */
    public static final class a {

        /* renamed from: a */
        public final long f56022a;

        /* renamed from: b */
        public final long f56023b;

        public a(long j2, long j3) {
            this.f56022a = j2;
            this.f56023b = j3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f56022a == aVar.f56022a && this.f56023b == aVar.f56023b;
        }

        public final int hashCode() {
            return (((int) this.f56022a) * 31) + ((int) this.f56023b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.w6$b */
    public static class b implements InterfaceC5939vs.b {
        public b(int i2) {
            this((Object) null);
        }

        public b(Object obj) {
        }
    }

    public C5959w6(w61 w61Var, int[] iArr, int i2, InterfaceC5793tc interfaceC5793tc, long j2, long j3, AbstractC4698p abstractC4698p, InterfaceC4972di interfaceC4972di) {
        super(w61Var, iArr);
        if (j3 < j2) {
            d90.m23842d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f56020f = interfaceC5793tc;
        AbstractC4698p.m22050a((Collection) abstractC4698p);
        this.f56021g = interfaceC4972di;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static AbstractC4698p m29382a(InterfaceC5939vs.a[] aVarArr) {
        int i2;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        int i3 = 0;
        while (true) {
            i2 = 1;
            if (i3 >= aVarArr.length) {
                break;
            }
            InterfaceC5939vs.a aVar = aVarArr[i3];
            if (aVar == null || aVar.f55874b.length <= 1) {
                arrayList.add(null);
            } else {
                int i4 = AbstractC4698p.f47900c;
                AbstractC4698p.a aVar2 = new AbstractC4698p.a();
                aVar2.m22060b(new a(0L, 0L));
                arrayList.add(aVar2);
            }
            i3++;
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            InterfaceC5939vs.a aVar3 = aVarArr[i5];
            if (aVar3 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[aVar3.f55874b.length];
                int i6 = 0;
                while (true) {
                    if (i6 >= aVar3.f55874b.length) {
                        break;
                    }
                    jArr[i5][i6] = aVar3.f55873a.m29393a(r11[i6]).f53816h;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        m29383a(arrayList, jArr2);
        vg0 mo21979b = AbstractC4710z.m22082a().m22083a().mo21979b();
        int i8 = 0;
        while (i8 < length) {
            long[] jArr4 = jArr[i8];
            if (jArr4.length <= i2) {
                iArr = iArr2;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i9 = 0;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    int[] iArr3 = iArr2;
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i9] = d;
                    i9++;
                    iArr2 = iArr3;
                }
                iArr = iArr2;
                int i10 = length2 - 1;
                double d2 = dArr[i10] - dArr[c2];
                int i11 = 0;
                while (i11 < i10) {
                    double d3 = dArr[i11];
                    i11++;
                    mo21979b.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i11]) * 0.5d) - dArr[c2]) / d2), Integer.valueOf(i8));
                    c2 = 0;
                }
            }
            i8++;
            iArr2 = iArr;
            c2 = 0;
            i2 = 1;
        }
        int[] iArr4 = iArr2;
        AbstractC4698p m22050a = AbstractC4698p.m22050a(mo21979b.values());
        for (int i12 = 0; i12 < m22050a.size(); i12++) {
            int intValue = ((Integer) m22050a.get(i12)).intValue();
            int i13 = iArr4[intValue] + 1;
            iArr4[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            m29383a(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr2[i14] = jArr2[i14] * 2;
            }
        }
        m29383a(arrayList, jArr2);
        AbstractC4698p.a aVar4 = new AbstractC4698p.a();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            AbstractC4698p.a aVar5 = (AbstractC4698p.a) arrayList.get(i15);
            aVar4.m22060b((Object) (aVar5 == null ? AbstractC4698p.m22055i() : aVar5.m22058a()));
        }
        return aVar4.m22058a();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5119ge, com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: a */
    public final void mo24846a(float f2) {
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5119ge, com.yandex.mobile.ads.impl.InterfaceC5939vs
    @CallSuper
    /* renamed from: b */
    public final void mo24848b() {
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5119ge, com.yandex.mobile.ads.impl.InterfaceC5939vs
    @CallSuper
    /* renamed from: c */
    public final void mo24849c() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5939vs
    /* renamed from: e */
    public final void mo29261e() {
    }

    /* renamed from: a */
    private static void m29383a(ArrayList arrayList, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC4698p.a aVar = (AbstractC4698p.a) arrayList.get(i2);
            if (aVar != null) {
                aVar.m22060b(new a(j2, jArr[i2]));
            }
        }
    }
}
