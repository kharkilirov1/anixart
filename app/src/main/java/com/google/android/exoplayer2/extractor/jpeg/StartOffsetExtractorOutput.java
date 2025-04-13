package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* loaded from: classes.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {

    /* renamed from: b */
    public final long f10986b;

    /* renamed from: c */
    public final ExtractorOutput f10987c;

    public StartOffsetExtractorOutput(long j2, ExtractorOutput extractorOutput) {
        this.f10986b = j2;
        this.f10987c = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: b */
    public TrackOutput mo6392b(int i2, int i3) {
        return this.f10987c.mo6392b(i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: d */
    public void mo6393d(final SeekMap seekMap) {
        this.f10987c.mo6393d(new SeekMap() { // from class: com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // com.google.android.exoplayer2.extractor.SeekMap
            /* renamed from: f */
            public boolean mo6363f() {
                return seekMap.mo6363f();
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            /* renamed from: h */
            public SeekMap.SeekPoints mo6364h(long j2) {
                SeekMap.SeekPoints mo6364h = seekMap.mo6364h(j2);
                SeekPoint seekPoint = mo6364h.f10872a;
                long j3 = seekPoint.f10877a;
                long j4 = seekPoint.f10878b;
                long j5 = StartOffsetExtractorOutput.this.f10986b;
                SeekPoint seekPoint2 = new SeekPoint(j3, j4 + j5);
                SeekPoint seekPoint3 = mo6364h.f10873b;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.f10877a, seekPoint3.f10878b + j5));
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            /* renamed from: i */
            public long mo6365i() {
                return seekMap.mo6365i();
            }
        });
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: h */
    public void mo6394h() {
        this.f10987c.mo6394h();
    }
}
