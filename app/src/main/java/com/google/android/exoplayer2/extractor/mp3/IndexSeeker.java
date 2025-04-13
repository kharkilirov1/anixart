package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class IndexSeeker implements Seeker {

    /* renamed from: a */
    public final long f11118a;

    /* renamed from: b */
    public final LongArray f11119b;

    /* renamed from: c */
    public final LongArray f11120c;

    /* renamed from: d */
    public long f11121d;

    public IndexSeeker(long j2, long j3, long j4) {
        this.f11121d = j2;
        this.f11118a = j4;
        LongArray longArray = new LongArray();
        this.f11119b = longArray;
        LongArray longArray2 = new LongArray();
        this.f11120c = longArray2;
        longArray.m7589a(0L);
        longArray2.m7589a(j3);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: a */
    public long mo6482a(long j2) {
        return this.f11119b.m7590b(Util.m7732c(this.f11120c, j2, true, true));
    }

    /* renamed from: b */
    public boolean m6484b(long j2) {
        LongArray longArray = this.f11119b;
        return j2 - longArray.m7590b(longArray.f14652a - 1) < 100000;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: d */
    public long mo6483d() {
        return this.f11118a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        int m7732c = Util.m7732c(this.f11119b, j2, true, true);
        long m7590b = this.f11119b.m7590b(m7732c);
        SeekPoint seekPoint = new SeekPoint(m7590b, this.f11120c.m7590b(m7732c));
        if (m7590b != j2) {
            LongArray longArray = this.f11119b;
            if (m7732c != longArray.f14652a - 1) {
                int i2 = m7732c + 1;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(longArray.m7590b(i2), this.f11120c.m7590b(i2)));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11121d;
    }
}
