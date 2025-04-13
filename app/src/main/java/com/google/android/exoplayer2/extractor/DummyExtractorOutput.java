package com.google.android.exoplayer2.extractor;

/* loaded from: classes.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: b */
    public TrackOutput mo6392b(int i2, int i3) {
        return new DummyTrackOutput();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: d */
    public void mo6393d(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: h */
    public void mo6394h() {
    }
}
