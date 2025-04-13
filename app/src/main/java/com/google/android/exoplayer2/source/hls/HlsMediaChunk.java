package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
final class HlsMediaChunk extends MediaChunk {

    /* renamed from: L */
    public static final AtomicInteger f13077L = new AtomicInteger();

    /* renamed from: A */
    public final boolean f13078A;

    /* renamed from: B */
    public final boolean f13079B;

    /* renamed from: C */
    public HlsMediaChunkExtractor f13080C;

    /* renamed from: D */
    public HlsSampleStreamWrapper f13081D;

    /* renamed from: E */
    public int f13082E;

    /* renamed from: F */
    public boolean f13083F;

    /* renamed from: G */
    public volatile boolean f13084G;

    /* renamed from: H */
    public boolean f13085H;

    /* renamed from: I */
    public ImmutableList<Integer> f13086I;

    /* renamed from: J */
    public boolean f13087J;

    /* renamed from: K */
    public boolean f13088K;

    /* renamed from: k */
    public final int f13089k;

    /* renamed from: l */
    public final int f13090l;

    /* renamed from: m */
    public final Uri f13091m;

    /* renamed from: n */
    public final boolean f13092n;

    /* renamed from: o */
    public final int f13093o;

    /* renamed from: p */
    @Nullable
    public final DataSource f13094p;

    /* renamed from: q */
    @Nullable
    public final DataSpec f13095q;

    /* renamed from: r */
    @Nullable
    public final HlsMediaChunkExtractor f13096r;

    /* renamed from: s */
    public final boolean f13097s;

    /* renamed from: t */
    public final boolean f13098t;

    /* renamed from: u */
    public final TimestampAdjuster f13099u;

    /* renamed from: v */
    public final HlsExtractorFactory f13100v;

    /* renamed from: w */
    @Nullable
    public final List<Format> f13101w;

    /* renamed from: x */
    @Nullable
    public final DrmInitData f13102x;

    /* renamed from: y */
    public final Id3Decoder f13103y;

    /* renamed from: z */
    public final ParsableByteArray f13104z;

    public HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, @Nullable DataSource dataSource2, @Nullable DataSpec dataSpec2, boolean z2, Uri uri, @Nullable List<Format> list, int i2, @Nullable Object obj, long j2, long j3, long j4, int i3, boolean z3, int i4, boolean z4, boolean z5, TimestampAdjuster timestampAdjuster, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z6) {
        super(dataSource, dataSpec, format, i2, obj, j2, j3, j4);
        this.f13078A = z;
        this.f13093o = i3;
        this.f13088K = z3;
        this.f13090l = i4;
        this.f13095q = dataSpec2;
        this.f13094p = dataSource2;
        this.f13083F = dataSpec2 != null;
        this.f13079B = z2;
        this.f13091m = uri;
        this.f13097s = z5;
        this.f13099u = timestampAdjuster;
        this.f13098t = z4;
        this.f13100v = hlsExtractorFactory;
        this.f13101w = list;
        this.f13102x = drmInitData;
        this.f13096r = hlsMediaChunkExtractor;
        this.f13103y = id3Decoder;
        this.f13104z = parsableByteArray;
        this.f13092n = z6;
        this.f13086I = ImmutableList.m11627D();
        this.f13089k = f13077L.getAndIncrement();
    }

    /* renamed from: f */
    public static byte[] m7094f(String str) {
        if (Ascii.m11123c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public void mo6865a() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Objects.requireNonNull(this.f13081D);
        if (this.f13080C == null && (hlsMediaChunkExtractor = this.f13096r) != null && hlsMediaChunkExtractor.mo7086e()) {
            this.f13080C = this.f13096r;
            this.f13083F = false;
        }
        if (this.f13083F) {
            Objects.requireNonNull(this.f13094p);
            Objects.requireNonNull(this.f13095q);
            m7095e(this.f13094p, this.f13095q, this.f13079B);
            this.f13082E = 0;
            this.f13083F = false;
        }
        if (this.f13084G) {
            return;
        }
        if (!this.f13098t) {
            try {
                TimestampAdjuster timestampAdjuster = this.f13099u;
                boolean z = this.f13097s;
                long j2 = this.f12704g;
                synchronized (timestampAdjuster) {
                    Assertions.m7516d(timestampAdjuster.f14732a == 9223372036854775806L);
                    if (timestampAdjuster.f14733b == -9223372036854775807L) {
                        if (z) {
                            timestampAdjuster.f14735d.set(Long.valueOf(j2));
                        } else {
                            while (timestampAdjuster.f14733b == -9223372036854775807L) {
                                timestampAdjuster.wait();
                            }
                        }
                    }
                }
                m7095e(this.f12706i, this.f12699b, this.f13078A);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        this.f13085H = !this.f13084G;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public void mo6866c() {
        this.f13084G = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    /* renamed from: d */
    public boolean mo6984d() {
        return this.f13085H;
    }

    @RequiresNonNull({"output"})
    /* renamed from: e */
    public final void m7095e(DataSource dataSource, DataSpec dataSpec, boolean z) throws IOException {
        DataSpec m7436d;
        long j2;
        long j3;
        if (z) {
            r0 = this.f13082E != 0;
            m7436d = dataSpec;
        } else {
            m7436d = dataSpec.m7436d(this.f13082E);
        }
        try {
            DefaultExtractorInput m7097h = m7097h(dataSource, m7436d);
            if (r0) {
                m7097h.mo6384k(this.f13082E);
            }
            do {
                try {
                    try {
                        if (this.f13084G) {
                            break;
                        }
                    } catch (Throwable th) {
                        this.f13082E = (int) (m7097h.f10834d - dataSpec.f14367f);
                        throw th;
                    }
                } catch (EOFException e2) {
                    if ((this.f12701d.f9652f & 16384) == 0) {
                        throw e2;
                    }
                    this.f13080C.mo7084c();
                    j2 = m7097h.f10834d;
                    j3 = dataSpec.f14367f;
                }
            } while (this.f13080C.mo7082a(m7097h));
            j2 = m7097h.f10834d;
            j3 = dataSpec.f14367f;
            this.f13082E = (int) (j2 - j3);
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (dataSource != null) {
                try {
                    dataSource.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public int m7096g(int i2) {
        Assertions.m7516d(!this.f13092n);
        if (i2 >= this.f13086I.size()) {
            return 0;
        }
        return this.f13086I.get(i2).intValue();
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* renamed from: h */
    public final DefaultExtractorInput m7097h(DataSource dataSource, DataSpec dataSpec) throws IOException {
        long j2;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.f14367f, dataSource.mo6350a(dataSpec));
        int i2 = 0;
        if (this.f13080C == null) {
            defaultExtractorInput.mo6383j();
            try {
                this.f13104z.m7631B(10);
                defaultExtractorInput.mo6386n(this.f13104z.f14698a, 0, 10);
                if (this.f13104z.m7659w() == 4801587) {
                    this.f13104z.m7636G(3);
                    int m7656t = this.f13104z.m7656t();
                    int i3 = m7656t + 10;
                    ParsableByteArray parsableByteArray = this.f13104z;
                    byte[] bArr = parsableByteArray.f14698a;
                    if (i3 > bArr.length) {
                        parsableByteArray.m7631B(i3);
                        System.arraycopy(bArr, 0, this.f13104z.f14698a, 0, 10);
                    }
                    defaultExtractorInput.mo6386n(this.f13104z.f14698a, 10, m7656t);
                    Metadata m6731d = this.f13103y.m6731d(this.f13104z.f14698a, m7656t);
                    if (m6731d != null) {
                        int length = m6731d.f11986b.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            Metadata.Entry entry = m6731d.f11986b[i4];
                            if (entry instanceof PrivFrame) {
                                PrivFrame privFrame = (PrivFrame) entry;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f12070c)) {
                                    System.arraycopy(privFrame.f12071d, 0, this.f13104z.f14698a, 0, 8);
                                    this.f13104z.m7635F(0);
                                    this.f13104z.m7634E(8);
                                    j2 = this.f13104z.m7650n() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            j2 = -9223372036854775807L;
            defaultExtractorInput.f10836f = 0;
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.f13096r;
            HlsMediaChunkExtractor mo7087f = hlsMediaChunkExtractor != null ? hlsMediaChunkExtractor.mo7087f() : this.f13100v.mo6096a(dataSpec.f14362a, this.f12701d, this.f13101w, this.f13099u, dataSource.mo6351i(), defaultExtractorInput);
            this.f13080C = mo7087f;
            if (mo7087f.mo7085d()) {
                this.f13081D.m7123y(j2 != -9223372036854775807L ? this.f13099u.m7692b(j2) : this.f12704g);
            } else {
                this.f13081D.m7123y(0L);
            }
            this.f13081D.f13202x.clear();
            this.f13080C.mo7083b(this.f13081D);
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f13081D;
        DrmInitData drmInitData = this.f13102x;
        if (!Util.m7728a(hlsSampleStreamWrapper.f13178W, drmInitData)) {
            hlsSampleStreamWrapper.f13178W = drmInitData;
            while (true) {
                HlsSampleStreamWrapper.HlsSampleQueue[] hlsSampleQueueArr = hlsSampleStreamWrapper.f13200v;
                if (i2 >= hlsSampleQueueArr.length) {
                    break;
                }
                if (hlsSampleStreamWrapper.f13170O[i2]) {
                    HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue = hlsSampleQueueArr[i2];
                    hlsSampleQueue.f13214J = drmInitData;
                    hlsSampleQueue.f12487A = true;
                }
                i2++;
            }
        }
        return defaultExtractorInput;
    }
}
