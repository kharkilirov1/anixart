package com.google.android.exoplayer2.extractor.p008ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;

/* loaded from: classes.dex */
public final class H264Reader implements ElementaryStreamReader {

    /* renamed from: a */
    public final SeiReader f11525a;

    /* renamed from: b */
    public final boolean f11526b;

    /* renamed from: c */
    public final boolean f11527c;

    /* renamed from: g */
    public long f11531g;

    /* renamed from: i */
    public String f11533i;

    /* renamed from: j */
    public TrackOutput f11534j;

    /* renamed from: k */
    public SampleReader f11535k;

    /* renamed from: l */
    public boolean f11536l;

    /* renamed from: n */
    public boolean f11538n;

    /* renamed from: h */
    public final boolean[] f11532h = new boolean[3];

    /* renamed from: d */
    public final NalUnitTargetBuffer f11528d = new NalUnitTargetBuffer(7, 128);

    /* renamed from: e */
    public final NalUnitTargetBuffer f11529e = new NalUnitTargetBuffer(8, 128);

    /* renamed from: f */
    public final NalUnitTargetBuffer f11530f = new NalUnitTargetBuffer(6, 128);

    /* renamed from: m */
    public long f11537m = -9223372036854775807L;

    /* renamed from: o */
    public final ParsableByteArray f11539o = new ParsableByteArray();

    public static final class SampleReader {

        /* renamed from: a */
        public final TrackOutput f11540a;

        /* renamed from: b */
        public final boolean f11541b;

        /* renamed from: c */
        public final boolean f11542c;

        /* renamed from: f */
        public final ParsableNalUnitBitArray f11545f;

        /* renamed from: g */
        public byte[] f11546g;

        /* renamed from: h */
        public int f11547h;

        /* renamed from: i */
        public int f11548i;

        /* renamed from: j */
        public long f11549j;

        /* renamed from: l */
        public long f11551l;

        /* renamed from: p */
        public long f11555p;

        /* renamed from: q */
        public long f11556q;

        /* renamed from: r */
        public boolean f11557r;

        /* renamed from: d */
        public final SparseArray<NalUnitUtil.SpsData> f11543d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<NalUnitUtil.PpsData> f11544e = new SparseArray<>();

        /* renamed from: m */
        public SliceHeaderData f11552m = new SliceHeaderData(null);

        /* renamed from: n */
        public SliceHeaderData f11553n = new SliceHeaderData(null);

        /* renamed from: k */
        public boolean f11550k = false;

        /* renamed from: o */
        public boolean f11554o = false;

        public static final class SliceHeaderData {

            /* renamed from: a */
            public boolean f11558a;

            /* renamed from: b */
            public boolean f11559b;

            /* renamed from: c */
            @Nullable
            public NalUnitUtil.SpsData f11560c;

            /* renamed from: d */
            public int f11561d;

            /* renamed from: e */
            public int f11562e;

            /* renamed from: f */
            public int f11563f;

            /* renamed from: g */
            public int f11564g;

            /* renamed from: h */
            public boolean f11565h;

            /* renamed from: i */
            public boolean f11566i;

            /* renamed from: j */
            public boolean f11567j;

            /* renamed from: k */
            public boolean f11568k;

            /* renamed from: l */
            public int f11569l;

            /* renamed from: m */
            public int f11570m;

            /* renamed from: n */
            public int f11571n;

            /* renamed from: o */
            public int f11572o;

            /* renamed from: p */
            public int f11573p;

            public SliceHeaderData() {
            }

            public SliceHeaderData(C10181 c10181) {
            }
        }

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.f11540a = trackOutput;
            this.f11541b = z;
            this.f11542c = z2;
            byte[] bArr = new byte[128];
            this.f11546g = bArr;
            this.f11545f = new ParsableNalUnitBitArray(bArr, 0, 0);
            SliceHeaderData sliceHeaderData = this.f11553n;
            sliceHeaderData.f11559b = false;
            sliceHeaderData.f11558a = false;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2) {
        this.f11525a = seiReader;
        this.f11526b = z;
        this.f11527c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6567a(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.H264Reader.m6567a(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ac, code lost:
    
        if (r7.f11567j == r10.f11567j) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:
    
        if (r14 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ca, code lost:
    
        if (r7.f11571n == r10.f11571n) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01dd, code lost:
    
        if (r7.f11573p == r10.f11573p) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01eb, code lost:
    
        if (r7.f11569l == r10.f11569l) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f1, code lost:
    
        if (r7 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0284, code lost:
    
        if (r6 != 1) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028c  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r26) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.H264Reader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        this.f11531g = 0L;
        this.f11538n = false;
        this.f11537m = -9223372036854775807L;
        NalUnitUtil.m7609a(this.f11532h);
        this.f11528d.m6574c();
        this.f11529e.m6574c();
        this.f11530f.m6574c();
        SampleReader sampleReader = this.f11535k;
        if (sampleReader != null) {
            sampleReader.f11550k = false;
            sampleReader.f11554o = false;
            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f11553n;
            sliceHeaderData.f11559b = false;
            sliceHeaderData.f11558a = false;
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
        this.f11533i = trackIdGenerator.m6590b();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 2);
        this.f11534j = mo6392b;
        this.f11535k = new SampleReader(mo6392b, this.f11526b, this.f11527c);
        this.f11525a.m6587a(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11537m = j2;
        }
        this.f11538n |= (i2 & 2) != 0;
    }
}
