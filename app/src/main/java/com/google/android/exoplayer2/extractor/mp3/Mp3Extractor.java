package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Mp3Extractor implements Extractor {

    /* renamed from: u */
    public static final Id3Decoder.FramePredicate f11125u;

    /* renamed from: a */
    public final int f11126a;

    /* renamed from: b */
    public final long f11127b;

    /* renamed from: c */
    public final ParsableByteArray f11128c;

    /* renamed from: d */
    public final MpegAudioUtil.Header f11129d;

    /* renamed from: e */
    public final GaplessInfoHolder f11130e;

    /* renamed from: f */
    public final Id3Peeker f11131f;

    /* renamed from: g */
    public final TrackOutput f11132g;

    /* renamed from: h */
    public ExtractorOutput f11133h;

    /* renamed from: i */
    public TrackOutput f11134i;

    /* renamed from: j */
    public TrackOutput f11135j;

    /* renamed from: k */
    public int f11136k;

    /* renamed from: l */
    @Nullable
    public Metadata f11137l;

    /* renamed from: m */
    public long f11138m;

    /* renamed from: n */
    public long f11139n;

    /* renamed from: o */
    public long f11140o;

    /* renamed from: p */
    public int f11141p;

    /* renamed from: q */
    public Seeker f11142q;

    /* renamed from: r */
    public boolean f11143r;

    /* renamed from: s */
    public boolean f11144s;

    /* renamed from: t */
    public long f11145t;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        C0954j c0954j = C0954j.f10215h;
        f11125u = C0954j.f10216i;
    }

    public Mp3Extractor() {
        this(0, -9223372036854775807L);
    }

    /* renamed from: f */
    public static long m6486f(@Nullable Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        int length = metadata.f11986b.length;
        for (int i2 = 0; i2 < length; i2++) {
            Metadata.Entry entry = metadata.f11986b[i2];
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f12061b.equals("TLEN")) {
                    return Util.m7717P(Long.parseLong(textInformationFrame.f12073d));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public static boolean m6487h(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    /* renamed from: a */
    public final long m6488a(long j2) {
        return ((j2 * 1000000) / this.f11129d.f10491d) + this.f11138m;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11133h = extractorOutput;
        TrackOutput mo6392b = extractorOutput.mo6392b(0, 1);
        this.f11134i = mo6392b;
        this.f11135j = mo6392b;
        this.f11133h.mo6394h();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11136k = 0;
        this.f11138m = -9223372036854775807L;
        this.f11139n = 0L;
        this.f11141p = 0;
        this.f11145t = j3;
        Seeker seeker = this.f11142q;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).m6484b(j3)) {
            return;
        }
        this.f11144s = true;
        this.f11135j = this.f11132g;
    }

    /* renamed from: d */
    public final Seeker m6489d(ExtractorInput extractorInput, boolean z) throws IOException {
        extractorInput.mo6386n(this.f11128c.f14698a, 0, 4);
        this.f11128c.m7635F(0);
        this.f11129d.m6225a(this.f11128c.m7642f());
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.f11129d, z);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return m6491j(extractorInput, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r3 != 1231971951) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x032f  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r33, com.google.android.exoplayer2.extractor.PositionHolder r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    /* renamed from: i */
    public final boolean m6490i(ExtractorInput extractorInput) throws IOException {
        Seeker seeker = this.f11142q;
        if (seeker != null) {
            long mo6483d = seeker.mo6483d();
            if (mo6483d != -1 && extractorInput.mo6379e() > mo6483d - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.mo6378d(this.f11128c.f14698a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.mo6384k(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f11136k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.mo6383j();
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6491j(com.google.android.exoplayer2.extractor.ExtractorInput r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.mo6383j()
            long r1 = r12.getPosition()
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L42
            int r1 = r11.f11126a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L25
            r1 = r5
            goto L27
        L25:
            com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r1 = com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.f11125u
        L27:
            com.google.android.exoplayer2.extractor.Id3Peeker r2 = r11.f11131f
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.m6424a(r12, r1)
            r11.f11137l = r1
            if (r1 == 0) goto L36
            com.google.android.exoplayer2.extractor.GaplessInfoHolder r2 = r11.f11130e
            r2.m6423b(r1)
        L36:
            long r1 = r12.mo6379e()
            int r2 = (int) r1
            if (r13 != 0) goto L40
            r12.mo6384k(r2)
        L40:
            r1 = 0
            goto L44
        L42:
            r1 = 0
            r2 = 0
        L44:
            r3 = 0
            r4 = 0
        L46:
            boolean r8 = r11.m6490i(r12)
            if (r8 == 0) goto L55
            if (r3 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r11.f11128c
            r8.m7635F(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r8 = r11.f11128c
            int r8 = r8.m7642f()
            if (r1 == 0) goto L69
            long r9 = (long) r1
            boolean r9 = m6487h(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = com.google.android.exoplayer2.audio.MpegAudioUtil.m6221a(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r13 == 0) goto L77
            return r7
        L77:
            java.lang.String r12 = "Searched too many bytes."
            com.google.android.exoplayer2.ParserException r12 = com.google.android.exoplayer2.ParserException.m5907a(r12, r5)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.mo6383j()
            int r3 = r2 + r1
            r12.mo6380f(r3)
            goto L8c
        L89:
            r12.mo6384k(r6)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L46
        L90:
            int r3 = r3 + 1
            if (r3 != r6) goto L9b
            com.google.android.exoplayer2.audio.MpegAudioUtil$Header r1 = r11.f11129d
            r1.m6225a(r8)
            r1 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r3 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r2 = r2 + r4
            r12.mo6384k(r2)
            goto La8
        La5:
            r12.mo6383j()
        La8:
            r11.f11136k = r1
            return r6
        Lab:
            int r9 = r9 + (-4)
            r12.mo6380f(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.m6491j(com.google.android.exoplayer2.extractor.ExtractorInput, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public Mp3Extractor(int i2, long j2) {
        this.f11126a = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f11127b = j2;
        this.f11128c = new ParsableByteArray(10);
        this.f11129d = new MpegAudioUtil.Header();
        this.f11130e = new GaplessInfoHolder();
        this.f11138m = -9223372036854775807L;
        this.f11131f = new Id3Peeker();
        DummyTrackOutput dummyTrackOutput = new DummyTrackOutput();
        this.f11132g = dummyTrackOutput;
        this.f11135j = dummyTrackOutput;
    }
}
