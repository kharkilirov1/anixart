package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes.dex */
public interface SectionPayloadReader {
    /* renamed from: a */
    void mo6576a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    /* renamed from: b */
    void mo6577b(ParsableByteArray parsableByteArray);
}
