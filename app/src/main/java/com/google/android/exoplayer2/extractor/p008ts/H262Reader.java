package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H262Reader implements ElementaryStreamReader {

    /* renamed from: q */
    public static final double[] f11477q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f11478a;

    /* renamed from: b */
    public TrackOutput f11479b;

    /* renamed from: c */
    @Nullable
    public final UserDataReader f11480c;

    /* renamed from: d */
    @Nullable
    public final ParsableByteArray f11481d;

    /* renamed from: e */
    @Nullable
    public final NalUnitTargetBuffer f11482e;

    /* renamed from: f */
    public final boolean[] f11483f;

    /* renamed from: g */
    public final CsdBuffer f11484g;

    /* renamed from: h */
    public long f11485h;

    /* renamed from: i */
    public boolean f11486i;

    /* renamed from: j */
    public boolean f11487j;

    /* renamed from: k */
    public long f11488k;

    /* renamed from: l */
    public long f11489l;

    /* renamed from: m */
    public long f11490m;

    /* renamed from: n */
    public long f11491n;

    /* renamed from: o */
    public boolean f11492o;

    /* renamed from: p */
    public boolean f11493p;

    public static final class CsdBuffer {

        /* renamed from: e */
        public static final byte[] f11494e = {0, 0, 1};

        /* renamed from: a */
        public boolean f11495a;

        /* renamed from: b */
        public int f11496b;

        /* renamed from: c */
        public int f11497c;

        /* renamed from: d */
        public byte[] f11498d;

        public CsdBuffer(int i2) {
            this.f11498d = new byte[i2];
        }

        /* renamed from: a */
        public void m6563a(byte[] bArr, int i2, int i3) {
            if (this.f11495a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f11498d;
                int length = bArr2.length;
                int i5 = this.f11496b;
                if (length < i5 + i4) {
                    this.f11498d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f11498d, this.f11496b, i4);
                this.f11496b += i4;
            }
        }
    }

    public H262Reader() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r23) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.H262Reader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        NalUnitUtil.m7609a(this.f11483f);
        CsdBuffer csdBuffer = this.f11484g;
        csdBuffer.f11495a = false;
        csdBuffer.f11496b = 0;
        csdBuffer.f11497c = 0;
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f11482e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.m6574c();
        }
        this.f11485h = 0L;
        this.f11486i = false;
        this.f11489l = -9223372036854775807L;
        this.f11491n = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11478a = trackIdGenerator.m6590b();
        this.f11479b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 2);
        UserDataReader userDataReader = this.f11480c;
        if (userDataReader != null) {
            userDataReader.m6594b(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        this.f11489l = j2;
    }

    public H262Reader(@Nullable UserDataReader userDataReader) {
        this.f11480c = userDataReader;
        this.f11483f = new boolean[4];
        this.f11484g = new CsdBuffer(128);
        if (userDataReader != null) {
            this.f11482e = new NalUnitTargetBuffer(178, 128);
            this.f11481d = new ParsableByteArray();
        } else {
            this.f11482e = null;
            this.f11481d = null;
        }
        this.f11489l = -9223372036854775807L;
        this.f11491n = -9223372036854775807L;
    }
}
