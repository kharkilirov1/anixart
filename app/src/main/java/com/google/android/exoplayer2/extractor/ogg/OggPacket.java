package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class OggPacket {

    /* renamed from: a */
    public final OggPageHeader f11347a = new OggPageHeader();

    /* renamed from: b */
    public final ParsableByteArray f11348b = new ParsableByteArray(new byte[65025], 0);

    /* renamed from: c */
    public int f11349c = -1;

    /* renamed from: d */
    public int f11350d;

    /* renamed from: e */
    public boolean f11351e;

    /* renamed from: a */
    public final int m6541a(int i2) {
        int i3;
        int i4 = 0;
        this.f11350d = 0;
        do {
            int i5 = this.f11350d;
            int i6 = i2 + i5;
            OggPageHeader oggPageHeader = this.f11347a;
            if (i6 >= oggPageHeader.f11354c) {
                break;
            }
            int[] iArr = oggPageHeader.f11357f;
            this.f11350d = i5 + 1;
            i3 = iArr[i5 + i2];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    /* renamed from: b */
    public boolean m6542b(ExtractorInput extractorInput) throws IOException {
        boolean z;
        int i2;
        boolean z2;
        Assertions.m7516d(extractorInput != null);
        if (this.f11351e) {
            this.f11351e = false;
            this.f11348b.m7631B(0);
        }
        while (!this.f11351e) {
            if (this.f11349c < 0) {
                if (!this.f11347a.m6545c(extractorInput, -1L) || !this.f11347a.m6543a(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.f11347a;
                int i3 = oggPageHeader.f11355d;
                if ((oggPageHeader.f11352a & 1) == 1 && this.f11348b.f14700c == 0) {
                    i3 += m6541a(0);
                    i2 = this.f11350d + 0;
                } else {
                    i2 = 0;
                }
                try {
                    extractorInput.mo6384k(i3);
                    z2 = true;
                } catch (EOFException unused) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                this.f11349c = i2;
            }
            int m6541a = m6541a(this.f11349c);
            int i4 = this.f11349c + this.f11350d;
            if (m6541a > 0) {
                ParsableByteArray parsableByteArray = this.f11348b;
                parsableByteArray.m7638b(parsableByteArray.f14700c + m6541a);
                ParsableByteArray parsableByteArray2 = this.f11348b;
                try {
                    extractorInput.readFully(parsableByteArray2.f14698a, parsableByteArray2.f14700c, m6541a);
                    z = true;
                } catch (EOFException unused2) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                ParsableByteArray parsableByteArray3 = this.f11348b;
                parsableByteArray3.m7634E(parsableByteArray3.f14700c + m6541a);
                this.f11351e = this.f11347a.f11357f[i4 + (-1)] != 255;
            }
            if (i4 == this.f11347a.f11354c) {
                i4 = -1;
            }
            this.f11349c = i4;
        }
        return true;
    }
}
