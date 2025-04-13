package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes.dex */
final class VarintReader {

    /* renamed from: d */
    public static final long[] f11114d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f11115a = new byte[8];

    /* renamed from: b */
    public int f11116b;

    /* renamed from: c */
    public int f11117c;

    /* renamed from: a */
    public static long m6479a(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= ~f11114d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    /* renamed from: b */
    public static int m6480b(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = f11114d;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & i2) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public long m6481c(ExtractorInput extractorInput, boolean z, boolean z2, int i2) throws IOException {
        if (this.f11116b == 0) {
            if (!extractorInput.mo6377b(this.f11115a, 0, 1, z)) {
                return -1L;
            }
            int m6480b = m6480b(this.f11115a[0] & 255);
            this.f11117c = m6480b;
            if (m6480b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f11116b = 1;
        }
        int i3 = this.f11117c;
        if (i3 > i2) {
            this.f11116b = 0;
            return -2L;
        }
        if (i3 != 1) {
            extractorInput.readFully(this.f11115a, 1, i3 - 1);
        }
        this.f11116b = 0;
        return m6479a(this.f11115a, this.f11117c, z2);
    }
}
