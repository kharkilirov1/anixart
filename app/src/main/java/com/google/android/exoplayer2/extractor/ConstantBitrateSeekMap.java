package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;

/* loaded from: classes.dex */
public class ConstantBitrateSeekMap implements SeekMap {

    /* renamed from: a */
    public final long f10824a;

    /* renamed from: b */
    public final long f10825b;

    /* renamed from: c */
    public final int f10826c;

    /* renamed from: d */
    public final long f10827d;

    /* renamed from: e */
    public final int f10828e;

    /* renamed from: f */
    public final long f10829f;

    /* renamed from: g */
    public final boolean f10830g;

    public ConstantBitrateSeekMap(long j2, long j3, int i2, int i3, boolean z) {
        this.f10824a = j2;
        this.f10825b = j3;
        this.f10826c = i3 == -1 ? 1 : i3;
        this.f10828e = i2;
        this.f10830g = z;
        if (j2 == -1) {
            this.f10827d = -1L;
            this.f10829f = -9223372036854775807L;
        } else {
            this.f10827d = j2 - j3;
            this.f10829f = m6375c(j2, j3, i2);
        }
    }

    /* renamed from: c */
    public static long m6375c(long j2, long j3, int i2) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / i2;
    }

    /* renamed from: b */
    public long m6376b(long j2) {
        return m6375c(j2, this.f10825b, this.f10828e);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return this.f10827d != -1 || this.f10830g;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        long j3 = this.f10827d;
        if (j3 == -1 && !this.f10830g) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.f10825b));
        }
        long j4 = this.f10826c;
        long j5 = (((this.f10828e * j2) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = this.f10825b + Math.max(j5, 0L);
        long m6376b = m6376b(max);
        SeekPoint seekPoint = new SeekPoint(m6376b, max);
        if (this.f10827d != -1 && m6376b < j2) {
            int i2 = this.f10826c;
            if (i2 + max < this.f10824a) {
                long j6 = max + i2;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(m6376b(j6), j6));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f10829f;
    }
}
