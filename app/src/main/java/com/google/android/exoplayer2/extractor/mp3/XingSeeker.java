package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class XingSeeker implements Seeker {

    /* renamed from: a */
    public final long f11150a;

    /* renamed from: b */
    public final int f11151b;

    /* renamed from: c */
    public final long f11152c;

    /* renamed from: d */
    public final long f11153d;

    /* renamed from: e */
    public final long f11154e;

    /* renamed from: f */
    @Nullable
    public final long[] f11155f;

    public XingSeeker(long j2, int i2, long j3, long j4, @Nullable long[] jArr) {
        this.f11150a = j2;
        this.f11151b = i2;
        this.f11152c = j3;
        this.f11155f = jArr;
        this.f11153d = j4;
        this.f11154e = j4 != -1 ? j2 + j4 : -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: a */
    public long mo6482a(long j2) {
        long j3 = j2 - this.f11150a;
        if (!mo6363f() || j3 <= this.f11151b) {
            return 0L;
        }
        long[] jArr = this.f11155f;
        Assertions.m7518f(jArr);
        double d = (j3 * 256.0d) / this.f11153d;
        int m7737f = Util.m7737f(jArr, (long) d, true, true);
        long j4 = this.f11152c;
        long j5 = (m7737f * j4) / 100;
        long j6 = jArr[m7737f];
        int i2 = m7737f + 1;
        long j7 = (j4 * i2) / 100;
        return Math.round((j6 == (m7737f == 99 ? 256L : jArr[i2]) ? 0.0d : (d - j6) / (r0 - j6)) * (j7 - j5)) + j5;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: d */
    public long mo6483d() {
        return this.f11154e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return this.f11155f != null;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        if (!mo6363f()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.f11150a + this.f11151b));
        }
        long m7742k = Util.m7742k(j2, 0L, this.f11152c);
        double d = (m7742k * 100.0d) / this.f11152c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.f11155f;
                Assertions.m7518f(jArr);
                double d3 = jArr[i2];
                d2 = d3 + (((i2 == 99 ? 256.0d : r3[i2 + 1]) - d3) * (d - i2));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(m7742k, this.f11150a + Util.m7742k(Math.round((d2 / 256.0d) * this.f11153d), this.f11151b, this.f11153d - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11152c;
    }
}
