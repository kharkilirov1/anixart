package com.google.android.exoplayer2.extractor.p008ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class Id3Reader implements ElementaryStreamReader {

    /* renamed from: b */
    public TrackOutput f11602b;

    /* renamed from: c */
    public boolean f11603c;

    /* renamed from: e */
    public int f11605e;

    /* renamed from: f */
    public int f11606f;

    /* renamed from: a */
    public final ParsableByteArray f11601a = new ParsableByteArray(10);

    /* renamed from: d */
    public long f11604d = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    public void mo6548b(ParsableByteArray parsableByteArray) {
        Assertions.m7518f(this.f11602b);
        if (this.f11603c) {
            int m7637a = parsableByteArray.m7637a();
            int i2 = this.f11606f;
            if (i2 < 10) {
                int min = Math.min(m7637a, 10 - i2);
                System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, this.f11601a.f14698a, this.f11606f, min);
                if (this.f11606f + min == 10) {
                    this.f11601a.m7635F(0);
                    if (73 != this.f11601a.m7657u() || 68 != this.f11601a.m7657u() || 51 != this.f11601a.m7657u()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f11603c = false;
                        return;
                    } else {
                        this.f11601a.m7636G(3);
                        this.f11605e = this.f11601a.m7656t() + 10;
                    }
                }
            }
            int min2 = Math.min(m7637a, this.f11605e - this.f11606f);
            this.f11602b.mo6397c(parsableByteArray, min2);
            this.f11606f += min2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11603c = false;
        this.f11604d = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
        int i2;
        Assertions.m7518f(this.f11602b);
        if (this.f11603c && (i2 = this.f11605e) != 0 && this.f11606f == i2) {
            long j2 = this.f11604d;
            if (j2 != -9223372036854775807L) {
                this.f11602b.mo6398d(j2, 1, i2, 0, null);
            }
            this.f11603c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 5);
        this.f11602b = mo6392b;
        Format.Builder builder = new Format.Builder();
        builder.f9677a = trackIdGenerator.m6590b();
        builder.f9687k = "application/id3";
        mo6392b.mo6399e(builder.m5833a());
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f11603c = true;
        if (j2 != -9223372036854775807L) {
            this.f11604d = j2;
        }
        this.f11605e = 0;
        this.f11606f = 0;
    }
}
