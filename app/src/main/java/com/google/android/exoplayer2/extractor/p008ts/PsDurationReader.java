package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class PsDurationReader {

    /* renamed from: c */
    public boolean f11664c;

    /* renamed from: d */
    public boolean f11665d;

    /* renamed from: e */
    public boolean f11666e;

    /* renamed from: a */
    public final TimestampAdjuster f11662a = new TimestampAdjuster(0);

    /* renamed from: f */
    public long f11667f = -9223372036854775807L;

    /* renamed from: g */
    public long f11668g = -9223372036854775807L;

    /* renamed from: h */
    public long f11669h = -9223372036854775807L;

    /* renamed from: b */
    public final ParsableByteArray f11663b = new ParsableByteArray();

    /* renamed from: c */
    public static long m6584c(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.f14699b;
        if (parsableByteArray.m7637a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, 9);
        parsableByteArray.f14699b += 9;
        parsableByteArray.m7635F(i2);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final int m6585a(ExtractorInput extractorInput) {
        this.f11663b.m7632C(Util.f14741f);
        this.f11664c = true;
        extractorInput.mo6383j();
        return 0;
    }

    /* renamed from: b */
    public final int m6586b(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
