package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AdtsReader implements ElementaryStreamReader {

    /* renamed from: v */
    public static final byte[] f11436v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f11437a;

    /* renamed from: b */
    public final ParsableBitArray f11438b = new ParsableBitArray(new byte[7]);

    /* renamed from: c */
    public final ParsableByteArray f11439c = new ParsableByteArray(Arrays.copyOf(f11436v, 10));

    /* renamed from: d */
    @Nullable
    public final String f11440d;

    /* renamed from: e */
    public String f11441e;

    /* renamed from: f */
    public TrackOutput f11442f;

    /* renamed from: g */
    public TrackOutput f11443g;

    /* renamed from: h */
    public int f11444h;

    /* renamed from: i */
    public int f11445i;

    /* renamed from: j */
    public int f11446j;

    /* renamed from: k */
    public boolean f11447k;

    /* renamed from: l */
    public boolean f11448l;

    /* renamed from: m */
    public int f11449m;

    /* renamed from: n */
    public int f11450n;

    /* renamed from: o */
    public int f11451o;

    /* renamed from: p */
    public boolean f11452p;

    /* renamed from: q */
    public long f11453q;

    /* renamed from: r */
    public int f11454r;

    /* renamed from: s */
    public long f11455s;

    /* renamed from: t */
    public TrackOutput f11456t;

    /* renamed from: u */
    public long f11457u;

    public AdtsReader(boolean z, @Nullable String str) {
        m6556h();
        this.f11449m = -1;
        this.f11450n = -1;
        this.f11453q = -9223372036854775807L;
        this.f11455s = -9223372036854775807L;
        this.f11437a = z;
        this.f11440d = str;
    }

    /* renamed from: g */
    public static boolean m6554g(int i2) {
        return (i2 & 65526) == 65520;
    }

    /* renamed from: a */
    public final boolean m6555a(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int min = Math.min(parsableByteArray.m7637a(), i2 - this.f11445i);
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, this.f11445i, min);
        parsableByteArray.f14699b += min;
        int i3 = this.f11445i + min;
        this.f11445i = i3;
        return i3 == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0275 A[EDGE_INSN: B:29:0x0275->B:30:0x0275 BREAK  A[LOOP:1: B:8:0x01a6->B:79:0x02e4], SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r18) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.AdtsReader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11455s = -9223372036854775807L;
        this.f11448l = false;
        m6556h();
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11441e = trackIdGenerator.m6590b();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
        this.f11442f = mo6392b;
        this.f11456t = mo6392b;
        if (!this.f11437a) {
            this.f11443g = new DummyTrackOutput();
            return;
        }
        trackIdGenerator.m6589a();
        TrackOutput mo6392b2 = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 5);
        this.f11443g = mo6392b2;
        Format.Builder builder = new Format.Builder();
        builder.f9677a = trackIdGenerator.m6590b();
        builder.f9687k = "application/id3";
        mo6392b2.mo6399e(builder.m5833a());
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11455s = j2;
        }
    }

    /* renamed from: h */
    public final void m6556h() {
        this.f11444h = 0;
        this.f11445i = 0;
        this.f11446j = 256;
    }

    /* renamed from: i */
    public final boolean m6557i(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        if (parsableByteArray.m7637a() < i2) {
            return false;
        }
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i2);
        parsableByteArray.f14699b += i2;
        return true;
    }
}
