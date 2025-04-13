package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public class OggExtractor implements Extractor {

    /* renamed from: a */
    public ExtractorOutput f11344a;

    /* renamed from: b */
    public StreamReader f11345b;

    /* renamed from: c */
    public boolean f11346c;

    static {
        C0954j c0954j = C0954j.f10218k;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: a */
    public final boolean m6540a(ExtractorInput extractorInput) throws IOException {
        boolean z;
        boolean equals;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.m6543a(extractorInput, true) && (oggPageHeader.f11352a & 2) == 2) {
            int min = Math.min(oggPageHeader.f11356e, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(min);
            extractorInput.mo6386n(parsableByteArray.f14698a, 0, min);
            parsableByteArray.m7635F(0);
            if (parsableByteArray.m7637a() >= 5 && parsableByteArray.m7657u() == 127 && parsableByteArray.m7658v() == 1179402563) {
                this.f11345b = new FlacReader();
            } else {
                parsableByteArray.m7635F(0);
                try {
                    z = VorbisUtil.m6433c(1, parsableByteArray, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.f11345b = new VorbisReader();
                } else {
                    parsableByteArray.m7635F(0);
                    int m7637a = parsableByteArray.m7637a();
                    byte[] bArr = OpusReader.f11359o;
                    if (m7637a < bArr.length) {
                        equals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr2, 0, length);
                        parsableByteArray.f14699b += length;
                        equals = Arrays.equals(bArr2, bArr);
                    }
                    if (equals) {
                        this.f11345b = new OpusReader();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11344a = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        StreamReader streamReader = this.f11345b;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.f11361a;
            oggPacket.f11347a.m6544b();
            oggPacket.f11348b.m7631B(0);
            oggPacket.f11349c = -1;
            oggPacket.f11351e = false;
            if (j2 == 0) {
                streamReader.mo6539e(!streamReader.f11372l);
                return;
            }
            if (streamReader.f11368h != 0) {
                long j4 = (streamReader.f11369i * j3) / 1000000;
                streamReader.f11365e = j4;
                OggSeeker oggSeeker = streamReader.f11364d;
                int i2 = Util.f14736a;
                oggSeeker.mo6536c(j4);
                streamReader.f11368h = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        try {
            return m6540a(extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r21, com.google.android.exoplayer2.extractor.PositionHolder r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.OggExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
