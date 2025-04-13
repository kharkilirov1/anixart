package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* renamed from: a */
    public final ParsableByteArray f11628a;

    /* renamed from: b */
    public final MpegAudioUtil.Header f11629b;

    /* renamed from: c */
    @Nullable
    public final String f11630c;

    /* renamed from: d */
    public TrackOutput f11631d;

    /* renamed from: e */
    public String f11632e;

    /* renamed from: f */
    public int f11633f;

    /* renamed from: g */
    public int f11634g;

    /* renamed from: h */
    public boolean f11635h;

    /* renamed from: i */
    public boolean f11636i;

    /* renamed from: j */
    public long f11637j;

    /* renamed from: k */
    public int f11638k;

    /* renamed from: l */
    public long f11639l;

    public MpegAudioReader() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    public void mo6548b(ParsableByteArray parsableByteArray) {
        Assertions.m7518f(this.f11631d);
        while (parsableByteArray.m7637a() > 0) {
            int i2 = this.f11633f;
            if (i2 == 0) {
                byte[] bArr = parsableByteArray.f14698a;
                int i3 = parsableByteArray.f14699b;
                int i4 = parsableByteArray.f14700c;
                while (true) {
                    if (i3 >= i4) {
                        parsableByteArray.m7635F(i4);
                        break;
                    }
                    boolean z = (bArr[i3] & 255) == 255;
                    boolean z2 = this.f11636i && (bArr[i3] & 224) == 224;
                    this.f11636i = z;
                    if (z2) {
                        parsableByteArray.m7635F(i3 + 1);
                        this.f11636i = false;
                        this.f11628a.f14698a[1] = bArr[i3];
                        this.f11634g = 2;
                        this.f11633f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(parsableByteArray.m7637a(), 4 - this.f11634g);
                parsableByteArray.m7641e(this.f11628a.f14698a, this.f11634g, min);
                int i5 = this.f11634g + min;
                this.f11634g = i5;
                if (i5 >= 4) {
                    this.f11628a.m7635F(0);
                    if (this.f11629b.m6225a(this.f11628a.m7642f())) {
                        MpegAudioUtil.Header header = this.f11629b;
                        this.f11638k = header.f10490c;
                        if (!this.f11635h) {
                            int i6 = header.f10491d;
                            this.f11637j = (header.f10494g * 1000000) / i6;
                            Format.Builder builder = new Format.Builder();
                            builder.f9677a = this.f11632e;
                            builder.f9687k = header.f10489b;
                            builder.f9688l = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                            builder.f9700x = header.f10492e;
                            builder.f9701y = i6;
                            builder.f9679c = this.f11630c;
                            this.f11631d.mo6399e(builder.m5833a());
                            this.f11635h = true;
                        }
                        this.f11628a.m7635F(0);
                        this.f11631d.mo6397c(this.f11628a, 4);
                        this.f11633f = 2;
                    } else {
                        this.f11634g = 0;
                        this.f11633f = 1;
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(parsableByteArray.m7637a(), this.f11638k - this.f11634g);
                this.f11631d.mo6397c(parsableByteArray, min2);
                int i7 = this.f11634g + min2;
                this.f11634g = i7;
                int i8 = this.f11638k;
                if (i7 >= i8) {
                    long j2 = this.f11639l;
                    if (j2 != -9223372036854775807L) {
                        this.f11631d.mo6398d(j2, 1, i8, 0, null);
                        this.f11639l += this.f11637j;
                    }
                    this.f11634g = 0;
                    this.f11633f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11633f = 0;
        this.f11634g = 0;
        this.f11636i = false;
        this.f11639l = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11632e = trackIdGenerator.m6590b();
        this.f11631d = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11639l = j2;
        }
    }

    public MpegAudioReader(@Nullable String str) {
        this.f11633f = 0;
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f11628a = parsableByteArray;
        parsableByteArray.f14698a[0] = -1;
        this.f11629b = new MpegAudioUtil.Header();
        this.f11639l = -9223372036854775807L;
        this.f11630c = str;
    }
}
