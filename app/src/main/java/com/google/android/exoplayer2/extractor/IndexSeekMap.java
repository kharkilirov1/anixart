package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class IndexSeekMap implements SeekMap {

    /* renamed from: a */
    public final long[] f10867a;

    /* renamed from: b */
    public final long[] f10868b;

    /* renamed from: c */
    public final long f10869c;

    /* renamed from: d */
    public final boolean f10870d;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j2) {
        Assertions.m7513a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f10870d = z;
        if (!z || jArr2[0] <= 0) {
            this.f10867a = jArr;
            this.f10868b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f10867a = jArr3;
            long[] jArr4 = new long[i2];
            this.f10868b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f10869c = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return this.f10870d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        if (!this.f10870d) {
            return new SeekMap.SeekPoints(SeekPoint.f10876c);
        }
        int m7737f = Util.m7737f(this.f10868b, j2, true, true);
        long[] jArr = this.f10868b;
        long j3 = jArr[m7737f];
        long[] jArr2 = this.f10867a;
        SeekPoint seekPoint = new SeekPoint(j3, jArr2[m7737f]);
        if (j3 == j2 || m7737f == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i2 = m7737f + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f10869c;
    }
}
