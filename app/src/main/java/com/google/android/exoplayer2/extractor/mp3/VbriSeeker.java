package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class VbriSeeker implements Seeker {

    /* renamed from: a */
    public final long[] f11146a;

    /* renamed from: b */
    public final long[] f11147b;

    /* renamed from: c */
    public final long f11148c;

    /* renamed from: d */
    public final long f11149d;

    public VbriSeeker(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f11146a = jArr;
        this.f11147b = jArr2;
        this.f11148c = j2;
        this.f11149d = j3;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: a */
    public long mo6482a(long j2) {
        return this.f11146a[Util.m7737f(this.f11147b, j2, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: d */
    public long mo6483d() {
        return this.f11149d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        int m7737f = Util.m7737f(this.f11146a, j2, true, true);
        long[] jArr = this.f11146a;
        long j3 = jArr[m7737f];
        long[] jArr2 = this.f11147b;
        SeekPoint seekPoint = new SeekPoint(j3, jArr2[m7737f]);
        if (j3 >= j2 || m7737f == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = m7737f + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11148c;
    }
}
