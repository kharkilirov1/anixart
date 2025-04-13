package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes.dex */
public final class RawCcExtractor implements Extractor {

    /* renamed from: a */
    public final Format f11385a;

    /* renamed from: c */
    public TrackOutput f11387c;

    /* renamed from: e */
    public int f11389e;

    /* renamed from: f */
    public long f11390f;

    /* renamed from: g */
    public int f11391g;

    /* renamed from: h */
    public int f11392h;

    /* renamed from: b */
    public final ParsableByteArray f11386b = new ParsableByteArray(9);

    /* renamed from: d */
    public int f11388d = 0;

    public RawCcExtractor(Format format) {
        this.f11385a = format;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        extractorOutput.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
        TrackOutput mo6392b = extractorOutput.mo6392b(0, 3);
        this.f11387c = mo6392b;
        mo6392b.mo6399e(this.f11385a);
        extractorOutput.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11388d = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        this.f11386b.m7631B(8);
        extractorInput.mo6386n(this.f11386b.f14698a, 0, 8);
        return this.f11386b.m7642f() == 1380139777;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        Assertions.m7518f(this.f11387c);
        while (true) {
            int i2 = this.f11388d;
            boolean z = false;
            boolean z2 = true;
            if (i2 == 0) {
                this.f11386b.m7631B(8);
                if (extractorInput.mo6377b(this.f11386b.f14698a, 0, 8, true)) {
                    if (this.f11386b.m7642f() != 1380139777) {
                        throw new IOException("Input not RawCC");
                    }
                    this.f11389e = this.f11386b.m7657u();
                    z = true;
                }
                if (!z) {
                    return -1;
                }
                this.f11388d = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.f11391g > 0) {
                        this.f11386b.m7631B(3);
                        extractorInput.readFully(this.f11386b.f14698a, 0, 3);
                        this.f11387c.mo6397c(this.f11386b, 3);
                        this.f11392h += 3;
                        this.f11391g--;
                    }
                    int i3 = this.f11392h;
                    if (i3 > 0) {
                        this.f11387c.mo6398d(this.f11390f, 1, i3, 0, null);
                    }
                    this.f11388d = 1;
                    return 0;
                }
                int i4 = this.f11389e;
                if (i4 == 0) {
                    this.f11386b.m7631B(5);
                    if (extractorInput.mo6377b(this.f11386b.f14698a, 0, 5, true)) {
                        this.f11390f = (this.f11386b.m7658v() * 1000) / 45;
                        this.f11391g = this.f11386b.m7657u();
                        this.f11392h = 0;
                    }
                    z2 = false;
                } else {
                    if (i4 != 1) {
                        throw C1008a.m6436c(39, "Unsupported version number: ", i4, null);
                    }
                    this.f11386b.m7631B(9);
                    if (extractorInput.mo6377b(this.f11386b.f14698a, 0, 9, true)) {
                        this.f11390f = this.f11386b.m7650n();
                        this.f11391g = this.f11386b.m7657u();
                        this.f11392h = 0;
                    }
                    z2 = false;
                }
                if (!z2) {
                    this.f11388d = 0;
                    return -1;
                }
                this.f11388d = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
