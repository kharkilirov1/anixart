package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;

/* loaded from: classes.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {

    /* renamed from: a */
    public final int[] f12678a;

    /* renamed from: b */
    public final SampleQueue[] f12679b;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.f12678a = iArr;
        this.f12679b = sampleQueueArr;
    }

    /* renamed from: a */
    public void m6958a(long j2) {
        for (SampleQueue sampleQueue : this.f12679b) {
            if (sampleQueue.f12493G != j2) {
                sampleQueue.f12493G = j2;
                sampleQueue.f12487A = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    /* renamed from: b */
    public TrackOutput mo6959b(int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f12678a;
            if (i4 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i3);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new DummyTrackOutput();
            }
            if (i3 == iArr[i4]) {
                return this.f12679b[i4];
            }
            i4++;
        }
    }
}
