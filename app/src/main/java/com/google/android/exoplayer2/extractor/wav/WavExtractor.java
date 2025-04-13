package com.google.android.exoplayer2.extractor.wav;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public final class WavExtractor implements Extractor {

    /* renamed from: a */
    public ExtractorOutput f11747a;

    /* renamed from: b */
    public TrackOutput f11748b;

    /* renamed from: e */
    public OutputWriter f11751e;

    /* renamed from: c */
    public int f11749c = 0;

    /* renamed from: d */
    public long f11750d = -1;

    /* renamed from: f */
    public int f11752f = -1;

    /* renamed from: g */
    public long f11753g = -1;

    public static final class ImaAdPcmOutputWriter implements OutputWriter {

        /* renamed from: m */
        public static final int[] f11754m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f11755n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final ExtractorOutput f11756a;

        /* renamed from: b */
        public final TrackOutput f11757b;

        /* renamed from: c */
        public final WavFormat f11758c;

        /* renamed from: d */
        public final int f11759d;

        /* renamed from: e */
        public final byte[] f11760e;

        /* renamed from: f */
        public final ParsableByteArray f11761f;

        /* renamed from: g */
        public final int f11762g;

        /* renamed from: h */
        public final Format f11763h;

        /* renamed from: i */
        public int f11764i;

        /* renamed from: j */
        public long f11765j;

        /* renamed from: k */
        public int f11766k;

        /* renamed from: l */
        public long f11767l;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.f11756a = extractorOutput;
            this.f11757b = trackOutput;
            this.f11758c = wavFormat;
            int max = Math.max(1, wavFormat.f11777b / 10);
            this.f11762g = max;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.f11780e);
            parsableByteArray.m7649m();
            int m7649m = parsableByteArray.m7649m();
            this.f11759d = m7649m;
            int i2 = wavFormat.f11776a;
            int i3 = (((wavFormat.f11778c - (i2 * 4)) * 8) / (wavFormat.f11779d * i2)) + 1;
            if (m7649m != i3) {
                throw ParserException.m5907a(C0576a.m4112k(56, "Expected frames per block: ", i3, "; got: ", m7649m), null);
            }
            int m7738g = Util.m7738g(max, m7649m);
            this.f11760e = new byte[wavFormat.f11778c * m7738g];
            this.f11761f = new ParsableByteArray(m7649m * 2 * i2 * m7738g);
            int i4 = wavFormat.f11777b;
            int i5 = ((wavFormat.f11778c * i4) * 8) / m7649m;
            Format.Builder builder = new Format.Builder();
            builder.f9687k = "audio/raw";
            builder.f9682f = i5;
            builder.f9683g = i5;
            builder.f9688l = max * 2 * i2;
            builder.f9700x = wavFormat.f11776a;
            builder.f9701y = i4;
            builder.f9702z = 2;
            this.f11763h = builder.m5833a();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: a */
        public void mo6595a(long j2) {
            this.f11764i = 0;
            this.f11765j = j2;
            this.f11766k = 0;
            this.f11767l = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: b */
        public void mo6596b(int i2, long j2) {
            this.f11756a.mo6393d(new WavSeekMap(this.f11758c, this.f11759d, i2, j2));
            this.f11757b.mo6399e(this.f11763h);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[LOOP:0: B:6:0x0028->B:12:0x0043, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:4:0x0041). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo6597c(com.google.android.exoplayer2.extractor.ExtractorInput r19, long r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.mo6597c(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        /* renamed from: d */
        public final int m6598d(int i2) {
            return i2 / (this.f11758c.f11776a * 2);
        }

        /* renamed from: e */
        public final void m6599e(int i2) {
            long m7723V = this.f11765j + Util.m7723V(this.f11767l, 1000000L, this.f11758c.f11777b);
            int i3 = i2 * 2 * this.f11758c.f11776a;
            this.f11757b.mo6398d(m7723V, 1, i3, this.f11766k - i3, null);
            this.f11767l += i2;
            this.f11766k -= i3;
        }
    }

    public interface OutputWriter {
        /* renamed from: a */
        void mo6595a(long j2);

        /* renamed from: b */
        void mo6596b(int i2, long j2) throws ParserException;

        /* renamed from: c */
        boolean mo6597c(ExtractorInput extractorInput, long j2) throws IOException;
    }

    public static final class PassthroughOutputWriter implements OutputWriter {

        /* renamed from: a */
        public final ExtractorOutput f11768a;

        /* renamed from: b */
        public final TrackOutput f11769b;

        /* renamed from: c */
        public final WavFormat f11770c;

        /* renamed from: d */
        public final Format f11771d;

        /* renamed from: e */
        public final int f11772e;

        /* renamed from: f */
        public long f11773f;

        /* renamed from: g */
        public int f11774g;

        /* renamed from: h */
        public long f11775h;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i2) throws ParserException {
            this.f11768a = extractorOutput;
            this.f11769b = trackOutput;
            this.f11770c = wavFormat;
            int i3 = (wavFormat.f11776a * wavFormat.f11779d) / 8;
            int i4 = wavFormat.f11778c;
            if (i4 != i3) {
                throw ParserException.m5907a(C0576a.m4112k(50, "Expected block size: ", i3, "; got: ", i4), null);
            }
            int i5 = wavFormat.f11777b * i3;
            int i6 = i5 * 8;
            int max = Math.max(i3, i5 / 10);
            this.f11772e = max;
            Format.Builder builder = new Format.Builder();
            builder.f9687k = str;
            builder.f9682f = i6;
            builder.f9683g = i6;
            builder.f9688l = max;
            builder.f9700x = wavFormat.f11776a;
            builder.f9701y = wavFormat.f11777b;
            builder.f9702z = i2;
            this.f11771d = builder.m5833a();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: a */
        public void mo6595a(long j2) {
            this.f11773f = j2;
            this.f11774g = 0;
            this.f11775h = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: b */
        public void mo6596b(int i2, long j2) {
            this.f11768a.mo6393d(new WavSeekMap(this.f11770c, 1, i2, j2));
            this.f11769b.mo6399e(this.f11771d);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /* renamed from: c */
        public boolean mo6597c(ExtractorInput extractorInput, long j2) throws IOException {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.f11774g) < (i3 = this.f11772e)) {
                int mo6396b = this.f11769b.mo6396b(extractorInput, (int) Math.min(i3 - i2, j3), true);
                if (mo6396b == -1) {
                    j3 = 0;
                } else {
                    this.f11774g += mo6396b;
                    j3 -= mo6396b;
                }
            }
            int i4 = this.f11770c.f11778c;
            int i5 = this.f11774g / i4;
            if (i5 > 0) {
                long m7723V = this.f11773f + Util.m7723V(this.f11775h, 1000000L, r1.f11777b);
                int i6 = i5 * i4;
                int i7 = this.f11774g - i6;
                this.f11769b.mo6398d(m7723V, 1, i6, i7, null);
                this.f11775h += i5;
                this.f11774g = i7;
            }
            return j3 <= 0;
        }
    }

    static {
        C0954j c0954j = C0954j.f10224q;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11747a = extractorOutput;
        this.f11748b = extractorOutput.mo6392b(0, 1);
        extractorOutput.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11749c = j2 == 0 ? 0 : 4;
        OutputWriter outputWriter = this.f11751e;
        if (outputWriter != null) {
            outputWriter.mo6595a(j3);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.m6600a(extractorInput);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r27, com.google.android.exoplayer2.extractor.PositionHolder r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
