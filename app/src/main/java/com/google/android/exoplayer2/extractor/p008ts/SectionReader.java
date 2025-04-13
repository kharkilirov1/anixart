package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class SectionReader implements TsPayloadReader {

    /* renamed from: a */
    public final SectionPayloadReader f11688a;

    /* renamed from: b */
    public final ParsableByteArray f11689b = new ParsableByteArray(32);

    /* renamed from: c */
    public int f11690c;

    /* renamed from: d */
    public int f11691d;

    /* renamed from: e */
    public boolean f11692e;

    /* renamed from: f */
    public boolean f11693f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f11688a = sectionPayloadReader;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: a */
    public void mo6578a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f11688a.mo6576a(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.f11693f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: b */
    public void mo6579b(ParsableByteArray parsableByteArray, int i2) {
        boolean z = (i2 & 1) != 0;
        int m7657u = z ? parsableByteArray.f14699b + parsableByteArray.m7657u() : -1;
        if (this.f11693f) {
            if (!z) {
                return;
            }
            this.f11693f = false;
            parsableByteArray.m7635F(m7657u);
            this.f11691d = 0;
        }
        while (parsableByteArray.m7637a() > 0) {
            int i3 = this.f11691d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int m7657u2 = parsableByteArray.m7657u();
                    parsableByteArray.m7635F(parsableByteArray.f14699b - 1);
                    if (m7657u2 == 255) {
                        this.f11693f = true;
                        return;
                    }
                }
                int min = Math.min(parsableByteArray.m7637a(), 3 - this.f11691d);
                parsableByteArray.m7641e(this.f11689b.f14698a, this.f11691d, min);
                int i4 = this.f11691d + min;
                this.f11691d = i4;
                if (i4 == 3) {
                    this.f11689b.m7635F(0);
                    this.f11689b.m7634E(3);
                    this.f11689b.m7636G(1);
                    int m7657u3 = this.f11689b.m7657u();
                    int m7657u4 = this.f11689b.m7657u();
                    this.f11692e = (m7657u3 & 128) != 0;
                    int i5 = (((m7657u3 & 15) << 8) | m7657u4) + 3;
                    this.f11690c = i5;
                    byte[] bArr = this.f11689b.f14698a;
                    if (bArr.length < i5) {
                        this.f11689b.m7638b(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(parsableByteArray.m7637a(), this.f11690c - this.f11691d);
                parsableByteArray.m7641e(this.f11689b.f14698a, this.f11691d, min2);
                int i6 = this.f11691d + min2;
                this.f11691d = i6;
                int i7 = this.f11690c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f11692e) {
                        byte[] bArr2 = this.f11689b.f14698a;
                        int i8 = Util.f14736a;
                        int i9 = -1;
                        for (int i10 = 0; i10 < i7; i10++) {
                            i9 = Util.f14749n[((i9 >>> 24) ^ (bArr2[i10] & 255)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i9 << 8);
                        }
                        if (i9 != 0) {
                            this.f11693f = true;
                            return;
                        }
                        this.f11689b.m7634E(this.f11690c - 4);
                    } else {
                        this.f11689b.m7634E(i7);
                    }
                    this.f11689b.m7635F(0);
                    this.f11688a.mo6577b(this.f11689b);
                    this.f11691d = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader
    /* renamed from: c */
    public void mo6580c() {
        this.f11693f = true;
    }
}
