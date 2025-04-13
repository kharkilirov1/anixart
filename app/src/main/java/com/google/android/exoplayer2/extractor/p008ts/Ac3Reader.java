package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* renamed from: a */
    public final ParsableBitArray f11396a;

    /* renamed from: b */
    public final ParsableByteArray f11397b;

    /* renamed from: c */
    @Nullable
    public final String f11398c;

    /* renamed from: d */
    public String f11399d;

    /* renamed from: e */
    public TrackOutput f11400e;

    /* renamed from: f */
    public int f11401f;

    /* renamed from: g */
    public int f11402g;

    /* renamed from: h */
    public boolean f11403h;

    /* renamed from: i */
    public long f11404i;

    /* renamed from: j */
    public Format f11405j;

    /* renamed from: k */
    public int f11406k;

    /* renamed from: l */
    public long f11407l;

    public Ac3Reader() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r23) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.Ac3Reader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11401f = 0;
        this.f11402g = 0;
        this.f11403h = false;
        this.f11407l = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11399d = trackIdGenerator.m6590b();
        this.f11400e = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11407l = j2;
        }
    }

    public Ac3Reader(@Nullable String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.f11396a = parsableBitArray;
        this.f11397b = new ParsableByteArray(parsableBitArray.f14694a);
        this.f11401f = 0;
        this.f11407l = -9223372036854775807L;
        this.f11398c = str;
    }
}
