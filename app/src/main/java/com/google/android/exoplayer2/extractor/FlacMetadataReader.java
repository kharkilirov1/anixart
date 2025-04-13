package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class FlacMetadataReader {

    public static final class FlacStreamMetadataHolder {

        /* renamed from: a */
        @Nullable
        public FlacStreamMetadata f10845a;

        public FlacStreamMetadataHolder(@Nullable FlacStreamMetadata flacStreamMetadata) {
            this.f10845a = flacStreamMetadata;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Metadata m6411a(ExtractorInput extractorInput, boolean z) throws IOException {
        Metadata m6424a = new Id3Peeker().m6424a(extractorInput, z ? null : Id3Decoder.f12056b);
        if (m6424a == null || m6424a.f11986b.length == 0) {
            return null;
        }
        return m6424a;
    }

    /* renamed from: b */
    public static FlacStreamMetadata.SeekTable m6412b(ParsableByteArray parsableByteArray) {
        parsableByteArray.m7636G(1);
        int m7659w = parsableByteArray.m7659w();
        long j2 = parsableByteArray.f14699b + m7659w;
        int i2 = m7659w / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long m7650n = parsableByteArray.m7650n();
            if (m7650n == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = m7650n;
            jArr2[i3] = parsableByteArray.m7650n();
            parsableByteArray.m7636G(2);
            i3++;
        }
        parsableByteArray.m7636G((int) (j2 - parsableByteArray.f14699b));
        return new FlacStreamMetadata.SeekTable(jArr, jArr2);
    }
}
