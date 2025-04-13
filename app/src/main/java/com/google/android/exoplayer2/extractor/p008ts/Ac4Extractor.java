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
public final class Ac4Extractor implements Extractor {

    /* renamed from: a */
    public final Ac4Reader f11408a = new Ac4Reader(null);

    /* renamed from: b */
    public final ParsableByteArray f11409b = new ParsableByteArray(16384);

    /* renamed from: c */
    public boolean f11410c;

    static {
        C0954j c0954j = C0954j.f10220m;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11408a.mo6551e(extractorOutput, new TsPayloadReader.TrackIdGenerator(Integer.MIN_VALUE, 0, 1));
        extractorOutput.mo6394h();
        extractorOutput.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11410c = false;
        this.f11408a.mo6549c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r15.mo6383j();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if ((r4 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return false;
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo6403e(com.google.android.exoplayer2.extractor.ExtractorInput r15) throws java.io.IOException {
        /*
            r14 = this;
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f14698a
            r15.mo6386n(r4, r2, r1)
            r0.m7635F(r2)
            int r4 = r0.m7659w()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L8e
            r15.mo6383j()
            r15.mo6380f(r3)
            r4 = r3
        L22:
            r1 = 0
        L23:
            byte[] r5 = r0.f14698a
            r7 = 7
            r15.mo6386n(r5, r2, r7)
            r0.m7635F(r2)
            int r5 = r0.m7662z()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L4a
            if (r5 == r9) goto L4a
            r15.mo6383j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L46
            return r2
        L46:
            r15.mo6380f(r4)
            goto L22
        L4a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L50
            return r8
        L50:
            byte[] r8 = r0.f14698a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L58
            r11 = -1
            goto L85
        L58:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L7f
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L80
        L7f:
            r7 = 4
        L80:
            if (r5 != r9) goto L84
            int r7 = r7 + 2
        L84:
            int r11 = r11 + r7
        L85:
            if (r11 != r12) goto L88
            return r2
        L88:
            int r11 = r11 + (-7)
            r15.mo6380f(r11)
            goto L23
        L8e:
            r0.m7636G(r6)
            int r4 = r0.m7656t()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.mo6380f(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.Ac4Extractor.mo6403e(com.google.android.exoplayer2.extractor.ExtractorInput):boolean");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = extractorInput.read(this.f11409b.f14698a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f11409b.m7635F(0);
        this.f11409b.m7634E(read);
        if (!this.f11410c) {
            this.f11408a.mo6552f(0L, 4);
            this.f11410c = true;
        }
        this.f11408a.mo6548b(this.f11409b);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
