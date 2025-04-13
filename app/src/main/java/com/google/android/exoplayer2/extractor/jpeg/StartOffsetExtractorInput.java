package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ForwardingExtractorInput;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* renamed from: b */
    public final long f10985b;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j2) {
        super(extractorInput);
        Assertions.m7513a(extractorInput.getPosition() >= j2);
        this.f10985b = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: e */
    public long mo6379e() {
        return super.mo6379e() - this.f10985b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.f10985b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.f10985b;
    }
}
