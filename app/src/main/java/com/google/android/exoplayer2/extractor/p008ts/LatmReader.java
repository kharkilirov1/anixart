package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class LatmReader implements ElementaryStreamReader {

    /* renamed from: a */
    @Nullable
    public final String f11607a;

    /* renamed from: b */
    public final ParsableByteArray f11608b;

    /* renamed from: c */
    public final ParsableBitArray f11609c;

    /* renamed from: d */
    public TrackOutput f11610d;

    /* renamed from: e */
    public String f11611e;

    /* renamed from: f */
    public Format f11612f;

    /* renamed from: g */
    public int f11613g;

    /* renamed from: h */
    public int f11614h;

    /* renamed from: i */
    public int f11615i;

    /* renamed from: j */
    public int f11616j;

    /* renamed from: k */
    public long f11617k;

    /* renamed from: l */
    public boolean f11618l;

    /* renamed from: m */
    public int f11619m;

    /* renamed from: n */
    public int f11620n;

    /* renamed from: o */
    public int f11621o;

    /* renamed from: p */
    public boolean f11622p;

    /* renamed from: q */
    public long f11623q;

    /* renamed from: r */
    public int f11624r;

    /* renamed from: s */
    public long f11625s;

    /* renamed from: t */
    public int f11626t;

    /* renamed from: u */
    @Nullable
    public String f11627u;

    public LatmReader(@Nullable String str) {
        this.f11607a = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        this.f11608b = parsableByteArray;
        this.f11609c = new ParsableBitArray(parsableByteArray.f14698a);
        this.f11617k = -9223372036854775807L;
    }

    /* renamed from: a */
    public static long m6570a(ParsableBitArray parsableBitArray) {
        return parsableBitArray.m7622g((parsableBitArray.m7622g(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x014c, code lost:
    
        if (r14.f11618l == false) goto L88;
     */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r15) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.LatmReader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11613g = 0;
        this.f11617k = -9223372036854775807L;
        this.f11618l = false;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11610d = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
        this.f11611e = trackIdGenerator.m6590b();
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11617k = j2;
        }
    }

    /* renamed from: g */
    public final int m6571g(ParsableBitArray parsableBitArray) throws ParserException {
        int m7617b = parsableBitArray.m7617b();
        AacUtil.Config m6102b = AacUtil.m6102b(parsableBitArray, true);
        this.f11627u = m6102b.f10272c;
        this.f11624r = m6102b.f10270a;
        this.f11626t = m6102b.f10271b;
        return m7617b - parsableBitArray.m7617b();
    }
}
