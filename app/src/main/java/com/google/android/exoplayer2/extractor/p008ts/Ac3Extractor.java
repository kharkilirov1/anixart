package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Ac3Extractor implements Extractor {

    /* renamed from: a */
    public final Ac3Reader f11393a = new Ac3Reader(null);

    /* renamed from: b */
    public final ParsableByteArray f11394b = new ParsableByteArray(2786);

    /* renamed from: c */
    public boolean f11395c;

    static {
        C0954j c0954j = C0954j.f10219l;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11393a.mo6551e(extractorOutput, new TsPayloadReader.TrackIdGenerator(Integer.MIN_VALUE, 0, 1));
        extractorOutput.mo6394h();
        extractorOutput.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11395c = false;
        this.f11393a.mo6549c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r14.mo6383j();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        if ((r5 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
    
        return false;
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo6403e(com.google.android.exoplayer2.extractor.ExtractorInput r14) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f14698a
            r14.mo6386n(r4, r2, r1)
            r0.m7635F(r2)
            int r4 = r0.m7659w()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L85
            r14.mo6383j()
            r14.mo6380f(r3)
            r5 = r3
        L22:
            r4 = 0
        L23:
            byte[] r7 = r0.f14698a
            r8 = 6
            r14.mo6386n(r7, r2, r8)
            r0.m7635F(r2)
            int r7 = r0.m7662z()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L44
            r14.mo6383j()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.148E-41)
            if (r4 < r7) goto L40
            return r2
        L40:
            r14.mo6380f(r5)
            goto L22
        L44:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 < r9) goto L4a
            return r7
        L4a:
            byte[] r10 = r0.f14698a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L52
            r9 = -1
            goto L7c
        L52:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r6
            if (r11 <= r1) goto L5c
            r11 = 1
            goto L5d
        L5c:
            r11 = 0
        L5d:
            if (r11 == 0) goto L6f
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r7
            int r9 = r9 * 2
            goto L7c
        L6f:
            r7 = r10[r9]
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r7 = r7 >> r8
            r8 = r10[r9]
            r8 = r8 & 63
            int r9 = com.google.android.exoplayer2.audio.Ac3Util.m6104a(r7, r8)
        L7c:
            if (r9 != r12) goto L7f
            return r2
        L7f:
            int r9 = r9 + (-6)
            r14.mo6380f(r9)
            goto L23
        L85:
            r0.m7636G(r6)
            int r4 = r0.m7656t()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.mo6380f(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.Ac3Extractor.mo6403e(com.google.android.exoplayer2.extractor.ExtractorInput):boolean");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = extractorInput.read(this.f11394b.f14698a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f11394b.m7635F(0);
        this.f11394b.m7634E(read);
        if (!this.f11395c) {
            this.f11393a.mo6552f(0L, 4);
            this.f11395c = true;
        }
        this.f11393a.mo6548b(this.f11394b);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
