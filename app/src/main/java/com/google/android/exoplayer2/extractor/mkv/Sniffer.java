package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes.dex */
final class Sniffer {

    /* renamed from: a */
    public final ParsableByteArray f11112a = new ParsableByteArray(8);

    /* renamed from: b */
    public int f11113b;

    /* renamed from: a */
    public final long m6478a(ExtractorInput extractorInput) throws IOException {
        int i2 = 0;
        extractorInput.mo6386n(this.f11112a.f14698a, 0, 1);
        int i3 = this.f11112a.f14698a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        extractorInput.mo6386n(this.f11112a.f14698a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f11112a.f14698a[i2] & 255) + (i6 << 8);
        }
        this.f11113b = i5 + 1 + this.f11113b;
        return i6;
    }
}
