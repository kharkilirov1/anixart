package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes.dex */
public final class TrueHdSampleRechunker {

    /* renamed from: a */
    public final byte[] f10883a = new byte[10];

    /* renamed from: b */
    public boolean f10884b;

    /* renamed from: c */
    public int f10885c;

    /* renamed from: d */
    public long f10886d;

    /* renamed from: e */
    public int f10887e;

    /* renamed from: f */
    public int f10888f;

    /* renamed from: g */
    public int f10889g;

    /* renamed from: a */
    public void m6425a(TrackOutput trackOutput, @Nullable TrackOutput.CryptoData cryptoData) {
        if (this.f10885c > 0) {
            trackOutput.mo6398d(this.f10886d, this.f10887e, this.f10888f, this.f10889g, cryptoData);
            this.f10885c = 0;
        }
    }

    /* renamed from: b */
    public void m6426b(TrackOutput trackOutput, long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
        Assertions.m7517e(this.f10889g <= i3 + i4, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f10884b) {
            int i5 = this.f10885c;
            int i6 = i5 + 1;
            this.f10885c = i6;
            if (i5 == 0) {
                this.f10886d = j2;
                this.f10887e = i2;
                this.f10888f = 0;
            }
            this.f10888f += i3;
            this.f10889g = i4;
            if (i6 >= 16) {
                m6425a(trackOutput, cryptoData);
            }
        }
    }

    /* renamed from: c */
    public void m6427c(ExtractorInput extractorInput) throws IOException {
        if (this.f10884b) {
            return;
        }
        extractorInput.mo6386n(this.f10883a, 0, 10);
        extractorInput.mo6383j();
        byte[] bArr = this.f10883a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            r2 = 40 << ((bArr[((bArr[7] & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
        }
        if (r2 == 0) {
            return;
        }
        this.f10884b = true;
    }
}
