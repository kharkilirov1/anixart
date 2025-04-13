package com.google.android.exoplayer2.extractor;

/* loaded from: classes.dex */
public interface ExtractorOutput {

    /* renamed from: w1 */
    public static final ExtractorOutput f10843w1 = new ExtractorOutput() { // from class: com.google.android.exoplayer2.extractor.ExtractorOutput.1
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: b */
        public TrackOutput mo6392b(int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: d */
        public void mo6393d(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        /* renamed from: h */
        public void mo6394h() {
            throw new UnsupportedOperationException();
        }
    };

    /* renamed from: b */
    TrackOutput mo6392b(int i2, int i3);

    /* renamed from: d */
    void mo6393d(SeekMap seekMap);

    /* renamed from: h */
    void mo6394h();
}
