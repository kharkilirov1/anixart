package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public interface ElementaryStreamReader {
    /* renamed from: b */
    void mo6548b(ParsableByteArray parsableByteArray) throws ParserException;

    /* renamed from: c */
    void mo6549c();

    /* renamed from: d */
    void mo6550d();

    /* renamed from: e */
    void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    /* renamed from: f */
    void mo6552f(long j2, int i2);
}
