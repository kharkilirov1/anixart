package com.google.android.exoplayer2.extractor.p008ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p008ts.TsPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H263Reader implements ElementaryStreamReader {

    /* renamed from: l */
    public static final float[] f11499l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    @Nullable
    public final UserDataReader f11500a;

    /* renamed from: b */
    @Nullable
    public final ParsableByteArray f11501b;

    /* renamed from: c */
    public final boolean[] f11502c;

    /* renamed from: d */
    public final CsdBuffer f11503d;

    /* renamed from: e */
    @Nullable
    public final NalUnitTargetBuffer f11504e;

    /* renamed from: f */
    public SampleReader f11505f;

    /* renamed from: g */
    public long f11506g;

    /* renamed from: h */
    public String f11507h;

    /* renamed from: i */
    public TrackOutput f11508i;

    /* renamed from: j */
    public boolean f11509j;

    /* renamed from: k */
    public long f11510k;

    public static final class CsdBuffer {

        /* renamed from: f */
        public static final byte[] f11511f = {0, 0, 1};

        /* renamed from: a */
        public boolean f11512a;

        /* renamed from: b */
        public int f11513b;

        /* renamed from: c */
        public int f11514c;

        /* renamed from: d */
        public int f11515d;

        /* renamed from: e */
        public byte[] f11516e;

        public CsdBuffer(int i2) {
            this.f11516e = new byte[i2];
        }

        /* renamed from: a */
        public void m6564a(byte[] bArr, int i2, int i3) {
            if (this.f11512a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f11516e;
                int length = bArr2.length;
                int i5 = this.f11514c;
                if (length < i5 + i4) {
                    this.f11516e = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f11516e, this.f11514c, i4);
                this.f11514c += i4;
            }
        }

        /* renamed from: b */
        public void m6565b() {
            this.f11512a = false;
            this.f11514c = 0;
            this.f11513b = 0;
        }
    }

    public static final class SampleReader {

        /* renamed from: a */
        public final TrackOutput f11517a;

        /* renamed from: b */
        public boolean f11518b;

        /* renamed from: c */
        public boolean f11519c;

        /* renamed from: d */
        public boolean f11520d;

        /* renamed from: e */
        public int f11521e;

        /* renamed from: f */
        public int f11522f;

        /* renamed from: g */
        public long f11523g;

        /* renamed from: h */
        public long f11524h;

        public SampleReader(TrackOutput trackOutput) {
            this.f11517a = trackOutput;
        }

        /* renamed from: a */
        public void m6566a(byte[] bArr, int i2, int i3) {
            if (this.f11519c) {
                int i4 = this.f11522f;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f11522f = (i3 - i2) + i4;
                } else {
                    this.f11520d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f11519c = false;
                }
            }
        }
    }

    public H263Reader() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0288  */
    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6548b(com.google.android.exoplayer2.util.ParsableByteArray r26) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.H263Reader.mo6548b(com.google.android.exoplayer2.util.ParsableByteArray):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: c */
    public void mo6549c() {
        NalUnitUtil.m7609a(this.f11502c);
        this.f11503d.m6565b();
        SampleReader sampleReader = this.f11505f;
        if (sampleReader != null) {
            sampleReader.f11518b = false;
            sampleReader.f11519c = false;
            sampleReader.f11520d = false;
            sampleReader.f11521e = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f11504e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.m6574c();
        }
        this.f11506g = 0L;
        this.f11510k = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: d */
    public void mo6550d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: e */
    public void mo6551e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.m6589a();
        this.f11507h = trackIdGenerator.m6590b();
        TrackOutput mo6392b = extractorOutput.mo6392b(trackIdGenerator.m6591c(), 2);
        this.f11508i = mo6392b;
        this.f11505f = new SampleReader(mo6392b);
        UserDataReader userDataReader = this.f11500a;
        if (userDataReader != null) {
            userDataReader.m6594b(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p008ts.ElementaryStreamReader
    /* renamed from: f */
    public void mo6552f(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f11510k = j2;
        }
    }

    public H263Reader(@Nullable UserDataReader userDataReader) {
        this.f11500a = userDataReader;
        this.f11502c = new boolean[4];
        this.f11503d = new CsdBuffer(128);
        this.f11510k = -9223372036854775807L;
        if (userDataReader != null) {
            this.f11504e = new NalUnitTargetBuffer(178, 128);
            this.f11501b = new ParsableByteArray();
        } else {
            this.f11504e = null;
            this.f11501b = null;
        }
    }
}
