package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* renamed from: a */
    public final FlacStreamMetadata f10846a;

    /* renamed from: b */
    public final long f10847b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j2) {
        this.f10846a = flacStreamMetadata;
        this.f10847b = j2;
    }

    /* renamed from: b */
    public final SeekPoint m6413b(long j2, long j3) {
        return new SeekPoint((j2 * 1000000) / this.f10846a.f10852e, this.f10847b + j3);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        Assertions.m7518f(this.f10846a.f10858k);
        FlacStreamMetadata flacStreamMetadata = this.f10846a;
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.f10858k;
        long[] jArr = seekTable.f10860a;
        long[] jArr2 = seekTable.f10861b;
        int m7737f = Util.m7737f(jArr, flacStreamMetadata.m6421g(j2), true, false);
        SeekPoint m6413b = m6413b(m7737f == -1 ? 0L : jArr[m7737f], m7737f != -1 ? jArr2[m7737f] : 0L);
        if (m6413b.f10877a == j2 || m7737f == jArr.length - 1) {
            return new SeekMap.SeekPoints(m6413b);
        }
        int i2 = m7737f + 1;
        return new SeekMap.SeekPoints(m6413b, m6413b(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f10846a.m6418d();
    }
}
