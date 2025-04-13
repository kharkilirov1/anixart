package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class H265Reader implements ElementaryStreamReader {

    /* renamed from: a */
    public final SeiReader f11574a;

    /* renamed from: b */
    public String f11575b;

    /* renamed from: c */
    public TrackOutput f11576c;

    /* renamed from: d */
    public SampleReader f11577d;

    /* renamed from: e */
    public boolean f11578e;

    /* renamed from: l */
    public long f11585l;

    /* renamed from: f */
    public final boolean[] f11579f = new boolean[3];

    /* renamed from: g */
    public final NalUnitTargetBuffer f11580g = new NalUnitTargetBuffer(32, 128);

    /* renamed from: h */
    public final NalUnitTargetBuffer f11581h = new NalUnitTargetBuffer(33, 128);

    /* renamed from: i */
    public final NalUnitTargetBuffer f11582i = new NalUnitTargetBuffer(34, 128);

    /* renamed from: j */
    public final NalUnitTargetBuffer f11583j = new NalUnitTargetBuffer(39, 128);

    /* renamed from: k */
    public final NalUnitTargetBuffer f11584k = new NalUnitTargetBuffer(40, 128);

    /* renamed from: m */
    public long f11586m = -9223372036854775807L;

    /* renamed from: n */
    public final ParsableByteArray f11587n = new ParsableByteArray();

    public static final class SampleReader {

        /* renamed from: a */
        public final TrackOutput f11588a;

        /* renamed from: b */
        public long f11589b;

        /* renamed from: c */
        public boolean f11590c;

        /* renamed from: d */
        public int f11591d;

        /* renamed from: e */
        public long f11592e;

        /* renamed from: f */
        public boolean f11593f;

        /* renamed from: g */
        public boolean f11594g;

        /* renamed from: h */
        public boolean f11595h;

        /* renamed from: i */
        public boolean f11596i;

        /* renamed from: j */
        public boolean f11597j;

        /* renamed from: k */
        public long f11598k;

        /* renamed from: l */
        public long f11599l;

        /* renamed from: m */
        public boolean f11600m;

        public SampleReader(TrackOutput trackOutput) {
            this.f11588a = trackOutput;
        }

        /* renamed from: a */
        public final void m6569a(int i2) {
            long j2 = this.f11599l;
            if (j2 == -9223372036854775807L) {
                return;
            }
            boolean z = this.f11600m;
            this.f11588a.mo6398d(j2, z ? 1 : 0, (int) (this.f11589b - this.f11598k), i2, null);
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.f11574a = seiReader;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: a */
    public final void m6568a(byte[] bArr, int i2, int i3) {
        SampleReader sampleReader = this.f11577d;
        if (sampleReader.f11593f) {
            int i4 = sampleReader.f11591d;
            int i5 = (i2 + 2) - i4;
            if (i5 < i3) {
                sampleReader.f11594g = (bArr[i5] & 128) != 0;
                sampleReader.f11593f = false;
            } else {
                sampleReader.f11591d = (i3 - i2) + i4;
            }
        }
        if (!this.f11578e) {
            this.f11580g.m6572a(bArr, i2, i3);
            this.f11581h.m6572a(bArr, i2, i3);
            this.f11582i.m6572a(bArr, i2, i3);
        }
        this.f11583j.m6572a(bArr, i2, i3);
        this.f11584k.m6572a(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0379  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r33) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.H265Reader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11585l = 0L;
        this.f11586m = -9223372036854775807L;
        NalUnitUtil.m7609a(this.f11579f);
        this.f11580g.m6574c();
        this.f11581h.m6574c();
        this.f11582i.m6574c();
        this.f11583j.m6574c();
        this.f11584k.m6574c();
        SampleReader sampleReader = this.f11577d;
        if (sampleReader != null) {
            sampleReader.f11593f = false;
            sampleReader.f11594g = false;
            sampleReader.f11595h = false;
            sampleReader.f11596i = false;
            sampleReader.f11597j = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11575b = trackIdGenerator.m6590b();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 2);
        this.f11576c = mo6392b;
        this.f11577d = new SampleReader(mo6392b);
        this.f11574a.m6587a(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11586m = j2;
        }
    }
}
