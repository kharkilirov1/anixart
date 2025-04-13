package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* renamed from: a */
    public Format f11645a;

    /* renamed from: b */
    public TimestampAdjuster f11646b;

    /* renamed from: c */
    public TrackOutput f11647c;

    public PassthroughSectionPayloadReader(String str) {
        Format.Builder builder = new Format.Builder();
        builder.f9687k = str;
        this.f11645a = builder.m5833a();
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
    /* renamed from: a */
    public void mo6576a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f11646b = timestampAdjuster;
        trackIdGenerator.m6589a();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 5);
        this.f11647c = mo6392b;
        mo6392b.mo6399e(this.f11645a);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.SectionPayloadReader
    /* renamed from: b */
    public void mo6577b(ParsableByteArray parsableByteArray) {
        long m7693c;
        Assertions.m7518f(this.f11646b);
        int i2 = Util.f14736a;
        TimestampAdjuster timestampAdjuster = this.f11646b;
        synchronized (timestampAdjuster) {
            long j2 = timestampAdjuster.f14734c;
            m7693c = j2 != -9223372036854775807L ? j2 + timestampAdjuster.f14733b : timestampAdjuster.m7693c();
        }
        long m7694d = this.f11646b.m7694d();
        if (m7693c == -9223372036854775807L || m7694d == -9223372036854775807L) {
            return;
        }
        Format format = this.f11645a;
        if (m7694d != format.f9663q) {
            Format.Builder m5829b = format.m5829b();
            m5829b.f9691o = m7694d;
            Format m5833a = m5829b.m5833a();
            this.f11645a = m5833a;
            this.f11647c.mo6399e(m5833a);
        }
        int m7637a = parsableByteArray.m7637a();
        this.f11647c.mo6397c(parsableByteArray, m7637a);
        this.f11647c.mo6398d(m7693c, 1, m7637a, 0, null);
    }
}
