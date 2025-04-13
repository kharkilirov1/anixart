package com.google.android.exoplayer2.extractor.flv;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;

/* loaded from: classes.dex */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    public final ParsableByteArray f10964b;

    /* renamed from: c */
    public final ParsableByteArray f10965c;

    /* renamed from: d */
    public int f10966d;

    /* renamed from: e */
    public boolean f10967e;

    /* renamed from: f */
    public boolean f10968f;

    /* renamed from: g */
    public int f10969g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.f10964b = new ParsableByteArray(NalUnitUtil.f14658a);
        this.f10965c = new ParsableByteArray(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    public boolean mo6442b(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        int m7657u = parsableByteArray.m7657u();
        int i2 = (m7657u >> 4) & 15;
        int i3 = m7657u & 15;
        if (i3 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException(C0576a.m4111j(39, "Video format not supported: ", i3));
        }
        this.f10969g = i2;
        return i2 != 5;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: c */
    public boolean mo6443c(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        int m7657u = parsableByteArray.m7657u();
        byte[] bArr = parsableByteArray.f14698a;
        int i2 = parsableByteArray.f14699b;
        int i3 = i2 + 1;
        parsableByteArray.f14699b = i3;
        int i4 = ((bArr[i2] & 255) << 24) >> 8;
        int i5 = i3 + 1;
        parsableByteArray.f14699b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        parsableByteArray.f14699b = i5 + 1;
        long j3 = (((bArr[i5] & 255) | i6) * 1000) + j2;
        if (m7657u == 0 && !this.f10967e) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.m7637a()]);
            parsableByteArray.m7641e(parsableByteArray2.f14698a, 0, parsableByteArray.m7637a());
            AvcConfig m7763b = AvcConfig.m7763b(parsableByteArray2);
            this.f10966d = m7763b.f14755b;
            Format.Builder builder = new Format.Builder();
            builder.f9687k = "video/avc";
            builder.f9684h = m7763b.f14759f;
            builder.f9692p = m7763b.f14756c;
            builder.f9693q = m7763b.f14757d;
            builder.f9696t = m7763b.f14758e;
            builder.f9689m = m7763b.f14754a;
            this.f10963a.mo6399e(builder.m5833a());
            this.f10967e = true;
            return false;
        }
        if (m7657u != 1 || !this.f10967e) {
            return false;
        }
        int i7 = this.f10969g == 1 ? 1 : 0;
        if (!this.f10968f && i7 == 0) {
            return false;
        }
        byte[] bArr2 = this.f10965c.f14698a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i8 = 4 - this.f10966d;
        int i9 = 0;
        while (parsableByteArray.m7637a() > 0) {
            parsableByteArray.m7641e(this.f10965c.f14698a, i8, this.f10966d);
            this.f10965c.m7635F(0);
            int m7660x = this.f10965c.m7660x();
            this.f10964b.m7635F(0);
            this.f10963a.mo6397c(this.f10964b, 4);
            this.f10963a.mo6397c(parsableByteArray, m7660x);
            i9 = i9 + 4 + m7660x;
        }
        this.f10963a.mo6398d(j3, i7, i9, 0, null);
        this.f10968f = true;
        return true;
    }
}
