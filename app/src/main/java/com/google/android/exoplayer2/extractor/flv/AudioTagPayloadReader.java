package com.google.android.exoplayer2.extractor.flv;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* loaded from: classes.dex */
final class AudioTagPayloadReader extends TagPayloadReader {

    /* renamed from: e */
    public static final int[] f10940e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f10941b;

    /* renamed from: c */
    public boolean f10942c;

    /* renamed from: d */
    public int f10943d;

    public AudioTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    public boolean mo6442b(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f10941b) {
            parsableByteArray.m7636G(1);
        } else {
            int m7657u = parsableByteArray.m7657u();
            int i2 = (m7657u >> 4) & 15;
            this.f10943d = i2;
            if (i2 == 2) {
                int i3 = f10940e[(m7657u >> 2) & 3];
                Format.Builder builder = new Format.Builder();
                builder.f9687k = "audio/mpeg";
                builder.f9700x = 1;
                builder.f9701y = i3;
                this.f10963a.mo6399e(builder.m5833a());
                this.f10942c = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                Format.Builder builder2 = new Format.Builder();
                builder2.f9687k = str;
                builder2.f9700x = 1;
                builder2.f9701y = 8000;
                this.f10963a.mo6399e(builder2.m5833a());
                this.f10942c = true;
            } else if (i2 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException(C0576a.m4111j(39, "Audio format not supported: ", this.f10943d));
            }
            this.f10941b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: c */
    public boolean mo6443c(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        if (this.f10943d == 2) {
            int m7637a = parsableByteArray.m7637a();
            this.f10963a.mo6397c(parsableByteArray, m7637a);
            this.f10963a.mo6398d(j2, 1, m7637a, 0, null);
            return true;
        }
        int m7657u = parsableByteArray.m7657u();
        if (m7657u != 0 || this.f10942c) {
            if (this.f10943d == 10 && m7657u != 1) {
                return false;
            }
            int m7637a2 = parsableByteArray.m7637a();
            this.f10963a.mo6397c(parsableByteArray, m7637a2);
            this.f10963a.mo6398d(j2, 1, m7637a2, 0, null);
            return true;
        }
        int m7637a3 = parsableByteArray.m7637a();
        byte[] bArr = new byte[m7637a3];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, m7637a3);
        parsableByteArray.f14699b += m7637a3;
        AacUtil.Config m6102b = AacUtil.m6102b(new ParsableBitArray(bArr), false);
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/mp4a-latm";
        builder.f9684h = m6102b.f10272c;
        builder.f9700x = m6102b.f10271b;
        builder.f9701y = m6102b.f10270a;
        builder.f9689m = Collections.singletonList(bArr);
        this.f10963a.mo6399e(builder.m5833a());
        this.f10942c = true;
        return false;
    }
}
