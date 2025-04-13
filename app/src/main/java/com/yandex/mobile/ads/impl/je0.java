package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.impl.e01;

/* loaded from: classes3.dex */
final class je0 implements h01 {

    /* renamed from: a */
    private final long[] f51585a;

    /* renamed from: b */
    private final long[] f51586b;

    /* renamed from: c */
    private final long f51587c;

    private je0(long j2, long[] jArr, long[] jArr2) {
        this.f51585a = jArr;
        this.f51586b = jArr2;
        this.f51587c = j2 == -9223372036854775807L ? s91.m28096a(jArr2[jArr2.length - 1]) : j2;
    }

    /* renamed from: a */
    public static je0 m25877a(long j2, MlltFrame mlltFrame, long j3) {
        int length = mlltFrame.f48118e.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += mlltFrame.f48116c + mlltFrame.f48118e[i4];
            j4 += mlltFrame.f48117d + mlltFrame.f48119f[i4];
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new je0(j3, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25015a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        long j3 = this.f51587c;
        int i2 = s91.f54530a;
        Pair<Long, Long> m25876a = m25876a(s91.m28119b(Math.max(0L, Math.min(j2, j3))), this.f51586b, this.f51585a);
        g01 g01Var = new g01(s91.m28096a(((Long) m25876a.first).longValue()), ((Long) m25876a.second).longValue());
        return new e01.C4997a(g01Var, g01Var);
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f51587c;
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25016a(long j2) {
        return s91.m28096a(((Long) m25876a(j2, this.f51585a, this.f51586b).second).longValue());
    }

    /* renamed from: a */
    private static Pair<Long, Long> m25876a(long j2, long[] jArr, long[] jArr2) {
        int m28118b = s91.m28118b(jArr, j2, true);
        long j3 = jArr[m28118b];
        long j4 = jArr2[m28118b];
        int i2 = m28118b + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? 0.0d : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }
}
