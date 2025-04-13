package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* renamed from: a */
    public final List<TsPayloadReader.DvbSubtitleInfo> f11471a;

    /* renamed from: b */
    public final TrackOutput[] f11472b;

    /* renamed from: c */
    public boolean f11473c;

    /* renamed from: d */
    public int f11474d;

    /* renamed from: e */
    public int f11475e;

    /* renamed from: f */
    public long f11476f = -9223372036854775807L;

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> list) {
        this.f11471a = list;
        this.f11472b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public final boolean m6562a(ParsableByteArray parsableByteArray, int i2) {
        if (parsableByteArray.m7637a() == 0) {
            return false;
        }
        if (parsableByteArray.m7657u() != i2) {
            this.f11473c = false;
        }
        this.f11474d--;
        return this.f11473c;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    public void mo6548b(ParsableByteArray parsableByteArray) {
        if (this.f11473c) {
            if (this.f11474d != 2 || m6562a(parsableByteArray, 32)) {
                if (this.f11474d != 1 || m6562a(parsableByteArray, 0)) {
                    int i2 = parsableByteArray.f14699b;
                    int m7637a = parsableByteArray.m7637a();
                    for (TrackOutput trackOutput : this.f11472b) {
                        parsableByteArray.m7635F(i2);
                        trackOutput.mo6397c(parsableByteArray, m7637a);
                    }
                    this.f11475e += m7637a;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11473c = false;
        this.f11476f = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
        if (this.f11473c) {
            if (this.f11476f != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f11472b) {
                    trackOutput.mo6398d(this.f11476f, 1, this.f11475e, 0, null);
                }
            }
            this.f11473c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i2 = 0; i2 < this.f11472b.length; i2++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.f11471a.get(i2);
            trackIdGenerator.m6589a();
            TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 3);
            Format.Builder builder = new Format.Builder();
            builder.f9677a = trackIdGenerator.m6590b();
            builder.f9687k = "application/dvbsubs";
            builder.f9689m = Collections.singletonList(dvbSubtitleInfo.f11736b);
            builder.f9679c = dvbSubtitleInfo.f11735a;
            mo6392b.mo6399e(builder.m5833a());
            this.f11472b[i2] = mo6392b;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f11473c = true;
        if (j2 != -9223372036854775807L) {
            this.f11476f = j2;
        }
        this.f11475e = 0;
        this.f11474d = 2;
    }
}
