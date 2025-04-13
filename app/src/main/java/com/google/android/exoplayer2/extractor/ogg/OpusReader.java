package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class OpusReader extends StreamReader {

    /* renamed from: o */
    public static final byte[] f11359o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f11360n;

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: c */
    public long mo6537c(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f14698a;
        int i2 = bArr[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        return m6546a(i4 * (i5 >= 16 ? 2500 << r1 : i5 >= 12 ? YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << (r1 & 1) : (i5 & 3) == 3 ? 60000 : YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << r1));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo6538d(ParsableByteArray parsableByteArray, long j2, StreamReader.SetupData setupData) {
        if (this.f11360n) {
            Objects.requireNonNull(setupData.f11374a);
            boolean z = parsableByteArray.m7642f() == 1332770163;
            parsableByteArray.m7635F(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(parsableByteArray.f14698a, parsableByteArray.f14700c);
        int i2 = copyOf[9] & 255;
        List<byte[]> m6226a = OpusUtil.m6226a(copyOf);
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/opus";
        builder.f9700x = i2;
        builder.f9701y = 48000;
        builder.f9689m = m6226a;
        setupData.f11374a = builder.m5833a();
        this.f11360n = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: e */
    public void mo6539e(boolean z) {
        super.mo6539e(z);
        if (z) {
            this.f11360n = false;
        }
    }
}
