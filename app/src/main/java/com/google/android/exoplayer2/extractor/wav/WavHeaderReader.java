package com.google.android.exoplayer2.extractor.wav;

import android.util.Log;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes.dex */
final class WavHeaderReader {

    public static final class ChunkHeader {

        /* renamed from: a */
        public final int f11781a;

        /* renamed from: b */
        public final long f11782b;

        public ChunkHeader(int i2, long j2) {
            this.f11781a = i2;
            this.f11782b = j2;
        }

        /* renamed from: a */
        public static ChunkHeader m6602a(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.mo6386n(parsableByteArray.f14698a, 0, 8);
            parsableByteArray.m7635F(0);
            return new ChunkHeader(parsableByteArray.m7642f(), parsableByteArray.m7647k());
        }
    }

    /* renamed from: a */
    public static boolean m6600a(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i2 = ChunkHeader.m6602a(extractorInput, parsableByteArray).f11781a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        extractorInput.mo6386n(parsableByteArray.f14698a, 0, 4);
        parsableByteArray.m7635F(0);
        int m7642f = parsableByteArray.m7642f();
        if (m7642f == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unsupported form type: ");
        sb.append(m7642f);
        Log.e("WavHeaderReader", sb.toString());
        return false;
    }

    /* renamed from: b */
    public static ChunkHeader m6601b(int i2, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        ChunkHeader m6602a = ChunkHeader.m6602a(extractorInput, parsableByteArray);
        while (true) {
            int i3 = m6602a.f11781a;
            if (i3 == i2) {
                return m6602a;
            }
            C0576a.m4123v(39, "Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = m6602a.f11782b + 8;
            if (j2 > ParserMinimalBase.MAX_INT_L) {
                int i4 = m6602a.f11781a;
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i4);
                throw ParserException.m5909c(sb.toString());
            }
            extractorInput.mo6384k((int) j2);
            m6602a = ChunkHeader.m6602a(extractorInput, parsableByteArray);
        }
    }
}
