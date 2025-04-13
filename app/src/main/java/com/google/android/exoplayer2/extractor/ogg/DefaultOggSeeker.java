package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class DefaultOggSeeker implements OggSeeker {

    /* renamed from: a */
    public final OggPageHeader f11325a;

    /* renamed from: b */
    public final long f11326b;

    /* renamed from: c */
    public final long f11327c;

    /* renamed from: d */
    public final StreamReader f11328d;

    /* renamed from: e */
    public int f11329e;

    /* renamed from: f */
    public long f11330f;

    /* renamed from: g */
    public long f11331g;

    /* renamed from: h */
    public long f11332h;

    /* renamed from: i */
    public long f11333i;

    /* renamed from: j */
    public long f11334j;

    /* renamed from: k */
    public long f11335k;

    /* renamed from: l */
    public long f11336l;

    public final class OggSeekMap implements SeekMap {
        public OggSeekMap(C10161 c10161) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: f */
        public boolean mo6363f() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: h */
        public SeekMap.SeekPoints mo6364h(long j2) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            long j3 = (defaultOggSeeker.f11328d.f11369i * j2) / 1000000;
            long j4 = defaultOggSeeker.f11326b;
            long j5 = defaultOggSeeker.f11327c;
            return new SeekMap.SeekPoints(new SeekPoint(j2, Util.m7742k(((((j5 - j4) * j3) / defaultOggSeeker.f11330f) + j4) - 30000, j4, j5 - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        /* renamed from: i */
        public long mo6365i() {
            return (DefaultOggSeeker.this.f11330f * 1000000) / r0.f11328d.f11369i;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j2, long j3, long j4, long j5, boolean z) {
        Assertions.m7513a(j2 >= 0 && j3 > j2);
        this.f11328d = streamReader;
        this.f11326b = j2;
        this.f11327c = j3;
        if (j4 == j3 - j2 || z) {
            this.f11330f = j5;
            this.f11329e = 4;
        } else {
            this.f11329e = 0;
        }
        this.f11325a = new OggPageHeader();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6534a(com.google.android.exoplayer2.extractor.ExtractorInput r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.mo6534a(com.google.android.exoplayer2.extractor.ExtractorInput):long");
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    @Nullable
    /* renamed from: b */
    public SeekMap mo6535b() {
        if (this.f11330f != 0) {
            return new OggSeekMap(null);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    /* renamed from: c */
    public void mo6536c(long j2) {
        this.f11332h = Util.m7742k(j2, 0L, this.f11330f - 1);
        this.f11329e = 2;
        this.f11333i = this.f11326b;
        this.f11334j = this.f11327c;
        this.f11335k = 0L;
        this.f11336l = this.f11330f;
    }
}
