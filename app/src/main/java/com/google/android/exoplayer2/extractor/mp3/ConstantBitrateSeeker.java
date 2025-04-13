package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;

/* loaded from: classes.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    public ConstantBitrateSeeker(long j2, long j3, MpegAudioUtil.Header header, boolean z) {
        super(j2, j3, header.f10493f, header.f10490c, z);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: a */
    public long mo6482a(long j2) {
        return ConstantBitrateSeekMap.m6375c(j2, this.f10825b, this.f10828e);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    /* renamed from: d */
    public long mo6483d() {
        return -1L;
    }
}
