package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class FlacReader extends StreamReader {

    /* renamed from: n */
    @Nullable
    public FlacStreamMetadata f11338n;

    /* renamed from: o */
    @Nullable
    public FlacOggSeeker f11339o;

    public static final class FlacOggSeeker implements OggSeeker {

        /* renamed from: a */
        public FlacStreamMetadata f11340a;

        /* renamed from: b */
        public FlacStreamMetadata.SeekTable f11341b;

        /* renamed from: c */
        public long f11342c = -1;

        /* renamed from: d */
        public long f11343d = -1;

        public FlacOggSeeker(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.SeekTable seekTable) {
            this.f11340a = flacStreamMetadata;
            this.f11341b = seekTable;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: a */
        public long mo6534a(ExtractorInput extractorInput) {
            long j2 = this.f11343d;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.f11343d = -1L;
            return j3;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: b */
        public SeekMap mo6535b() {
            Assertions.m7516d(this.f11342c != -1);
            return new FlacSeekTableSeekMap(this.f11340a, this.f11342c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: c */
        public void mo6536c(long j2) {
            long[] jArr = this.f11341b.f10860a;
            this.f11343d = jArr[Util.m7737f(jArr, j2, true, true)];
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: c */
    public long mo6537c(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f14698a;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i2 = (bArr[2] & 255) >> 4;
        if (i2 == 6 || i2 == 7) {
            parsableByteArray.m7636G(4);
            parsableByteArray.m7630A();
        }
        int m6410c = FlacFrameReader.m6410c(parsableByteArray, i2);
        parsableByteArray.m7635F(0);
        return m6410c;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public boolean mo6538d(ParsableByteArray parsableByteArray, long j2, StreamReader.SetupData setupData) {
        byte[] bArr = parsableByteArray.f14698a;
        FlacStreamMetadata flacStreamMetadata = this.f11338n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f11338n = flacStreamMetadata2;
            setupData.f11374a = flacStreamMetadata2.m6419e(Arrays.copyOfRange(bArr, 9, parsableByteArray.f14700c), null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            FlacStreamMetadata.SeekTable m6412b = FlacMetadataReader.m6412b(parsableByteArray);
            FlacStreamMetadata m6417b = flacStreamMetadata.m6417b(m6412b);
            this.f11338n = m6417b;
            this.f11339o = new FlacOggSeeker(m6417b, m6412b);
            return true;
        }
        if (!(bArr[0] == -1)) {
            return true;
        }
        FlacOggSeeker flacOggSeeker = this.f11339o;
        if (flacOggSeeker != null) {
            flacOggSeeker.f11342c = j2;
            setupData.f11375b = flacOggSeeker;
        }
        Objects.requireNonNull(setupData.f11374a);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    /* renamed from: e */
    public void mo6539e(boolean z) {
        super.mo6539e(z);
        if (z) {
            this.f11338n = null;
            this.f11339o = null;
        }
    }
}
