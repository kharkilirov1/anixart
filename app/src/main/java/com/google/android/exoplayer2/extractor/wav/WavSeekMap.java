package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class WavSeekMap implements SeekMap {

    /* renamed from: a */
    public final WavFormat f11783a;

    /* renamed from: b */
    public final int f11784b;

    /* renamed from: c */
    public final long f11785c;

    /* renamed from: d */
    public final long f11786d;

    /* renamed from: e */
    public final long f11787e;

    public WavSeekMap(WavFormat wavFormat, int i2, long j2, long j3) {
        this.f11783a = wavFormat;
        this.f11784b = i2;
        this.f11785c = j2;
        long j4 = (j3 - j2) / wavFormat.f11778c;
        this.f11786d = j4;
        this.f11787e = m6603b(j4);
    }

    /* renamed from: b */
    public final long m6603b(long j2) {
        return Util.m7723V(j2 * this.f11784b, 1000000L, this.f11783a.f11777b);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        long m7742k = Util.m7742k((this.f11783a.f11777b * j2) / (this.f11784b * 1000000), 0L, this.f11786d - 1);
        long j3 = (this.f11783a.f11778c * m7742k) + this.f11785c;
        long m6603b = m6603b(m7742k);
        SeekPoint seekPoint = new SeekPoint(m6603b, j3);
        if (m6603b >= j2 || m7742k == this.f11786d - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j4 = m7742k + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(m6603b(j4), (this.f11783a.f11778c * j4) + this.f11785c));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11787e;
    }
}
