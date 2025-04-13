package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AmrExtractor implements Extractor {

    /* renamed from: q */
    public static final int[] f10904q;

    /* renamed from: t */
    public static final int f10907t;

    /* renamed from: a */
    public final byte[] f10908a;

    /* renamed from: b */
    public final int f10909b;

    /* renamed from: c */
    public boolean f10910c;

    /* renamed from: d */
    public long f10911d;

    /* renamed from: e */
    public int f10912e;

    /* renamed from: f */
    public int f10913f;

    /* renamed from: g */
    public boolean f10914g;

    /* renamed from: h */
    public long f10915h;

    /* renamed from: i */
    public int f10916i;

    /* renamed from: j */
    public int f10917j;

    /* renamed from: k */
    public long f10918k;

    /* renamed from: l */
    public ExtractorOutput f10919l;

    /* renamed from: m */
    public TrackOutput f10920m;

    /* renamed from: n */
    public SeekMap f10921n;

    /* renamed from: o */
    public boolean f10922o;

    /* renamed from: p */
    public static final int[] f10903p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r */
    public static final byte[] f10905r = Util.m7708G("#!AMR\n");

    /* renamed from: s */
    public static final byte[] f10906s = Util.m7708G("#!AMR-WB\n");

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10904q = iArr;
        f10907t = iArr[8];
    }

    public AmrExtractor() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if ((!r0 && (r5 < 12 || r5 > 14)) != false) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m6438a(com.google.android.exoplayer2.extractor.ExtractorInput r5) throws java.io.IOException {
        /*
            r4 = this;
            r5.mo6383j()
            byte[] r0 = r4.f10908a
            r1 = 0
            r2 = 1
            r5.mo6386n(r0, r1, r2)
            byte[] r5 = r4.f10908a
            r5 = r5[r1]
            r0 = r5 & 131(0x83, float:1.84E-43)
            r2 = 0
            if (r0 > 0) goto L7a
            int r5 = r5 >> 3
            r0 = 15
            r5 = r5 & r0
            if (r5 < 0) goto L3d
            if (r5 > r0) goto L3d
            boolean r0 = r4.f10910c
            if (r0 == 0) goto L2a
            r3 = 10
            if (r5 < r3) goto L28
            r3 = 13
            if (r5 <= r3) goto L2a
        L28:
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 != 0) goto L3c
            if (r0 != 0) goto L39
            r0 = 12
            if (r5 < r0) goto L37
            r0 = 14
            if (r5 <= r0) goto L39
        L37:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3d
        L3c:
            r1 = 1
        L3d:
            if (r1 != 0) goto L6c
            boolean r0 = r4.f10910c
            if (r0 == 0) goto L46
            java.lang.String r0 = "WB"
            goto L48
        L46:
            java.lang.String r0 = "NB"
        L48:
            int r1 = r0.length()
            int r1 = r1 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Illegal AMR "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " frame type "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.ParserException.m5907a(r5, r2)
            throw r5
        L6c:
            boolean r0 = r4.f10910c
            if (r0 == 0) goto L75
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.f10904q
            r5 = r0[r5]
            goto L79
        L75:
            int[] r0 = com.google.android.exoplayer2.extractor.amr.AmrExtractor.f10903p
            r5 = r0[r5]
        L79:
            return r5
        L7a:
            r0 = 42
            java.lang.String r1 = "Invalid padding bits for frame header "
            com.google.android.exoplayer2.ParserException r5 = com.google.android.exoplayer2.extractor.C1008a.m6436c(r0, r1, r5, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.amr.AmrExtractor.m6438a(com.google.android.exoplayer2.extractor.ExtractorInput):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f10919l = extractorOutput;
        this.f10920m = extractorOutput.mo6392b(0, 1);
        extractorOutput.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f10911d = 0L;
        this.f10912e = 0;
        this.f10913f = 0;
        if (j2 != 0) {
            SeekMap seekMap = this.f10921n;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                ConstantBitrateSeekMap constantBitrateSeekMap = (ConstantBitrateSeekMap) seekMap;
                this.f10918k = ConstantBitrateSeekMap.m6375c(j2, constantBitrateSeekMap.f10825b, constantBitrateSeekMap.f10828e);
                return;
            }
        }
        this.f10918k = 0L;
    }

    /* renamed from: d */
    public final boolean m6439d(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = f10905r;
        extractorInput.mo6383j();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.mo6386n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f10910c = false;
            extractorInput.mo6384k(bArr.length);
            return true;
        }
        byte[] bArr3 = f10906s;
        extractorInput.mo6383j();
        byte[] bArr4 = new byte[bArr3.length];
        extractorInput.mo6386n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f10910c = true;
        extractorInput.mo6384k(bArr3.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return m6439d(extractorInput);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r19, com.google.android.exoplayer2.extractor.PositionHolder r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.amr.AmrExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public AmrExtractor(int i2) {
        this.f10909b = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f10908a = new byte[1];
        this.f10916i = -1;
    }
}
