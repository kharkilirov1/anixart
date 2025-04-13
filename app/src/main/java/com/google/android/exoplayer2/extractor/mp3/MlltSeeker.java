package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class MlltSeeker implements Seeker {

    /* renamed from: a */
    public final long[] f11122a;

    /* renamed from: b */
    public final long[] f11123b;

    /* renamed from: c */
    public final long f11124c;

    public MlltSeeker(long[] jArr, long[] jArr2, long j2) {
        this.f11122a = jArr;
        this.f11123b = jArr2;
        this.f11124c = j2 == -9223372036854775807L ? Util.m7717P(jArr2[jArr2.length - 1]) : j2;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m6485b(long j2, long[] jArr, long[] jArr2) {
        int m7737f = Util.m7737f(jArr, j2, true, true);
        long j3 = jArr[m7737f];
        long j4 = jArr2[m7737f];
        int i2 = m7737f + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((jArr[i2] == j3 ? 0.0d : (j2 - j3) / (r6 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: a */
    public long mo6482a(long j2) {
        return Util.m7717P(((Long) m6485b(j2, this.f11122a, this.f11123b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: d */
    public long mo6483d() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        Pair<Long, Long> m6485b = m6485b(Util.m7735d0(Util.m7742k(j2, 0L, this.f11124c)), this.f11123b, this.f11122a);
        return new SeekMap.SeekPoints(new SeekPoint(Util.m7717P(((Long) m6485b.first).longValue()), ((Long) m6485b.second).longValue()));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11124c;
    }
}
