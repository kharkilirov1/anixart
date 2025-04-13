package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class DtsReader implements ElementaryStreamReader {

    /* renamed from: b */
    @Nullable
    public final String f11461b;

    /* renamed from: c */
    public String f11462c;

    /* renamed from: d */
    public TrackOutput f11463d;

    /* renamed from: f */
    public int f11465f;

    /* renamed from: g */
    public int f11466g;

    /* renamed from: h */
    public long f11467h;

    /* renamed from: i */
    public Format f11468i;

    /* renamed from: j */
    public int f11469j;

    /* renamed from: a */
    public final ParsableByteArray f11460a = new ParsableByteArray(new byte[18]);

    /* renamed from: e */
    public int f11464e = 0;

    /* renamed from: k */
    public long f11470k = -9223372036854775807L;

    public DtsReader(@Nullable String str) {
        this.f11461b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r23) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.DtsReader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11464e = 0;
        this.f11465f = 0;
        this.f11466g = 0;
        this.f11470k = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11462c = trackIdGenerator.m6590b();
        this.f11463d = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11470k = j2;
        }
    }
}
