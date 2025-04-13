package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
abstract class StreamReader {

    /* renamed from: b */
    public TrackOutput f11362b;

    /* renamed from: c */
    public ExtractorOutput f11363c;

    /* renamed from: d */
    public OggSeeker f11364d;

    /* renamed from: e */
    public long f11365e;

    /* renamed from: f */
    public long f11366f;

    /* renamed from: g */
    public long f11367g;

    /* renamed from: h */
    public int f11368h;

    /* renamed from: i */
    public int f11369i;

    /* renamed from: k */
    public long f11371k;

    /* renamed from: l */
    public boolean f11372l;

    /* renamed from: m */
    public boolean f11373m;

    /* renamed from: a */
    public final OggPacket f11361a = new OggPacket();

    /* renamed from: j */
    public SetupData f11370j = new SetupData();

    public static class SetupData {

        /* renamed from: a */
        public Format f11374a;

        /* renamed from: b */
        public OggSeeker f11375b;
    }

    public static final class UnseekableOggSeeker implements OggSeeker {
        public UnseekableOggSeeker() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: a */
        public long mo6534a(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: b */
        public SeekMap mo6535b() {
            return new SeekMap.Unseekable(-9223372036854775807L, 0L);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        /* renamed from: c */
        public void mo6536c(long j2) {
        }

        public UnseekableOggSeeker(C10171 c10171) {
        }
    }

    /* renamed from: a */
    public long m6546a(long j2) {
        return (this.f11369i * j2) / 1000000;
    }

    /* renamed from: b */
    public void mo6547b(long j2) {
        this.f11367g = j2;
    }

    /* renamed from: c */
    public abstract long mo6537c(ParsableByteArray parsableByteArray);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public abstract boolean mo6538d(ParsableByteArray parsableByteArray, long j2, SetupData setupData) throws IOException;

    /* renamed from: e */
    public void mo6539e(boolean z) {
        if (z) {
            this.f11370j = new SetupData();
            this.f11366f = 0L;
            this.f11368h = 0;
        } else {
            this.f11368h = 1;
        }
        this.f11365e = -1L;
        this.f11367g = 0L;
    }
}
