package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* renamed from: a */
    public final ParsableBitArray f11411a;

    /* renamed from: b */
    public final ParsableByteArray f11412b;

    /* renamed from: c */
    @Nullable
    public final String f11413c;

    /* renamed from: d */
    public String f11414d;

    /* renamed from: e */
    public TrackOutput f11415e;

    /* renamed from: f */
    public int f11416f;

    /* renamed from: g */
    public int f11417g;

    /* renamed from: h */
    public boolean f11418h;

    /* renamed from: i */
    public boolean f11419i;

    /* renamed from: j */
    public long f11420j;

    /* renamed from: k */
    public Format f11421k;

    /* renamed from: l */
    public int f11422l;

    /* renamed from: m */
    public long f11423m;

    public Ac4Reader() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    public void mo6548b(ParsableByteArray parsableByteArray) {
        boolean z;
        int m7657u;
        Assertions.m7518f(this.f11415e);
        while (parsableByteArray.m7637a() > 0) {
            int i2 = this.f11416f;
            if (i2 == 0) {
                while (true) {
                    if (parsableByteArray.m7637a() <= 0) {
                        z = false;
                        break;
                    } else if (this.f11418h) {
                        m7657u = parsableByteArray.m7657u();
                        this.f11418h = m7657u == 172;
                        if (m7657u == 64 || m7657u == 65) {
                            break;
                        }
                    } else {
                        this.f11418h = parsableByteArray.m7657u() == 172;
                    }
                }
                this.f11419i = m7657u == 65;
                z = true;
                if (z) {
                    this.f11416f = 1;
                    byte[] bArr = this.f11412b.f14698a;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f11419i ? 65 : 64);
                    this.f11417g = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.f11412b.f14698a;
                int min = Math.min(parsableByteArray.m7637a(), 16 - this.f11417g);
                System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr2, this.f11417g, min);
                parsableByteArray.f14699b += min;
                int i3 = this.f11417g + min;
                this.f11417g = i3;
                if (i3 == 16) {
                    this.f11411a.m7626k(0);
                    Ac4Util.SyncFrameInfo m6106b = Ac4Util.m6106b(this.f11411a);
                    Format format = this.f11421k;
                    if (format == null || m6106b.f10281b != format.f9672z || m6106b.f10280a != format.f9641A || !"audio/ac4".equals(format.f9659m)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f9677a = this.f11414d;
                        builder.f9687k = "audio/ac4";
                        builder.f9700x = m6106b.f10281b;
                        builder.f9701y = m6106b.f10280a;
                        builder.f9679c = this.f11413c;
                        Format m5833a = builder.m5833a();
                        this.f11421k = m5833a;
                        this.f11415e.mo6399e(m5833a);
                    }
                    this.f11422l = m6106b.f10282c;
                    this.f11420j = (m6106b.f10283d * 1000000) / this.f11421k.f9641A;
                    this.f11412b.m7635F(0);
                    this.f11415e.mo6397c(this.f11412b, 16);
                    this.f11416f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(parsableByteArray.m7637a(), this.f11422l - this.f11417g);
                this.f11415e.mo6397c(parsableByteArray, min2);
                int i4 = this.f11417g + min2;
                this.f11417g = i4;
                int i5 = this.f11422l;
                if (i4 == i5) {
                    long j2 = this.f11423m;
                    if (j2 != -9223372036854775807L) {
                        this.f11415e.mo6398d(j2, 1, i5, 0, null);
                        this.f11423m += this.f11420j;
                    }
                    this.f11416f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11416f = 0;
        this.f11417g = 0;
        this.f11418h = false;
        this.f11419i = false;
        this.f11423m = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11414d = trackIdGenerator.m6590b();
        this.f11415e = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11423m = j2;
        }
    }

    public Ac4Reader(@Nullable String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16]);
        this.f11411a = parsableBitArray;
        this.f11412b = new ParsableByteArray(parsableBitArray.f14694a);
        this.f11416f = 0;
        this.f11417g = 0;
        this.f11418h = false;
        this.f11419i = false;
        this.f11423m = -9223372036854775807L;
        this.f11413c = str;
    }
}
