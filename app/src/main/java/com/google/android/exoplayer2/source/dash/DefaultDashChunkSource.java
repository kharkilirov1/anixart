package com.google.android.exoplayer2.source.dash;

import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DefaultDashChunkSource implements DashChunkSource {

    /* renamed from: a */
    public final LoaderErrorThrower f12866a;

    /* renamed from: b */
    public final BaseUrlExclusionList f12867b;

    /* renamed from: c */
    public final int[] f12868c;

    /* renamed from: d */
    public final int f12869d;

    /* renamed from: e */
    public final DataSource f12870e;

    /* renamed from: f */
    public final long f12871f;

    /* renamed from: g */
    public final int f12872g;

    /* renamed from: h */
    @Nullable
    public final PlayerEmsgHandler.PlayerTrackEmsgHandler f12873h;

    /* renamed from: i */
    public final RepresentationHolder[] f12874i;

    /* renamed from: j */
    public ExoTrackSelection f12875j;

    /* renamed from: k */
    public DashManifest f12876k;

    /* renamed from: l */
    public int f12877l;

    /* renamed from: m */
    @Nullable
    public IOException f12878m;

    /* renamed from: n */
    public boolean f12879n;

    public static final class Factory implements DashChunkSource.Factory {

        /* renamed from: a */
        public final DataSource.Factory f12880a;

        /* renamed from: c */
        public final ChunkExtractor.Factory f12882c = BundledChunkExtractor.f12680k;

        /* renamed from: b */
        public final int f12881b = 1;

        public Factory(DataSource.Factory factory) {
            this.f12880a = factory;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        /* renamed from: a */
        public DashChunkSource mo6994a(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i2, int[] iArr, ExoTrackSelection exoTrackSelection, int i3, long j2, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener) {
            DataSource mo6355a = this.f12880a.mo6355a();
            if (transferListener != null) {
                mo6355a.mo6818c(transferListener);
            }
            return new DefaultDashChunkSource(loaderErrorThrower, dashManifest, baseUrlExclusionList, i2, iArr, exoTrackSelection, i3, mo6355a, j2, this.f12881b, z, list, playerTrackEmsgHandler);
        }
    }

    public static final class RepresentationHolder {

        /* renamed from: a */
        @Nullable
        public final ChunkExtractor f12883a;

        /* renamed from: b */
        public final Representation f12884b;

        /* renamed from: c */
        public final BaseUrl f12885c;

        /* renamed from: d */
        @Nullable
        public final DashSegmentIndex f12886d;

        /* renamed from: e */
        public final long f12887e;

        /* renamed from: f */
        public final long f12888f;

        public RepresentationHolder(long j2, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j3, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.f12887e = j2;
            this.f12884b = representation;
            this.f12885c = baseUrl;
            this.f12888f = j3;
            this.f12883a = chunkExtractor;
            this.f12886d = dashSegmentIndex;
        }

        @CheckResult
        /* renamed from: a */
        public RepresentationHolder m7030a(long j2, Representation representation) throws BehindLiveWindowException {
            long mo7019f;
            long mo7019f2;
            DashSegmentIndex mo7070l = this.f12884b.mo7070l();
            DashSegmentIndex mo7070l2 = representation.mo7070l();
            if (mo7070l == null) {
                return new RepresentationHolder(j2, representation, this.f12885c, this.f12883a, this.f12888f, mo7070l);
            }
            if (!mo7070l.mo7020g()) {
                return new RepresentationHolder(j2, representation, this.f12885c, this.f12883a, this.f12888f, mo7070l2);
            }
            long mo7022i = mo7070l.mo7022i(j2);
            if (mo7022i == 0) {
                return new RepresentationHolder(j2, representation, this.f12885c, this.f12883a, this.f12888f, mo7070l2);
            }
            long mo7021h = mo7070l.mo7021h();
            long mo7014a = mo7070l.mo7014a(mo7021h);
            long j3 = (mo7022i + mo7021h) - 1;
            long mo7015b = mo7070l.mo7015b(j3, j2) + mo7070l.mo7014a(j3);
            long mo7021h2 = mo7070l2.mo7021h();
            long mo7014a2 = mo7070l2.mo7014a(mo7021h2);
            long j4 = this.f12888f;
            if (mo7015b == mo7014a2) {
                mo7019f = j3 + 1;
            } else {
                if (mo7015b < mo7014a2) {
                    throw new BehindLiveWindowException();
                }
                if (mo7014a2 < mo7014a) {
                    mo7019f2 = j4 - (mo7070l2.mo7019f(mo7014a, j2) - mo7021h);
                    return new RepresentationHolder(j2, representation, this.f12885c, this.f12883a, mo7019f2, mo7070l2);
                }
                mo7019f = mo7070l.mo7019f(mo7014a2, j2);
            }
            mo7019f2 = (mo7019f - mo7021h2) + j4;
            return new RepresentationHolder(j2, representation, this.f12885c, this.f12883a, mo7019f2, mo7070l2);
        }

        /* renamed from: b */
        public long m7031b(long j2) {
            return this.f12886d.mo7016c(this.f12887e, j2) + this.f12888f;
        }

        /* renamed from: c */
        public long m7032c(long j2) {
            return (this.f12886d.mo7023j(this.f12887e, j2) + (this.f12886d.mo7016c(this.f12887e, j2) + this.f12888f)) - 1;
        }

        /* renamed from: d */
        public long m7033d() {
            return this.f12886d.mo7022i(this.f12887e);
        }

        /* renamed from: e */
        public long m7034e(long j2) {
            return this.f12886d.mo7015b(j2 - this.f12888f, this.f12887e) + this.f12886d.mo7014a(j2 - this.f12888f);
        }

        /* renamed from: f */
        public long m7035f(long j2) {
            return this.f12886d.mo7014a(j2 - this.f12888f);
        }

        /* renamed from: g */
        public boolean m7036g(long j2, long j3) {
            return this.f12886d.mo7020g() || j3 == -9223372036854775807L || m7034e(j2) <= j3;
        }
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {

        /* renamed from: e */
        public final RepresentationHolder f12889e;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j2, long j3, long j4) {
            super(j2, j3);
            this.f12889e = representationHolder;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: a */
        public long mo6986a() {
            m6957c();
            return this.f12889e.m7035f(this.f12677d);
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: b */
        public long mo6987b() {
            m6957c();
            return this.f12889e.m7034e(this.f12677d);
        }
    }

    public DefaultDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i2, int[] iArr, ExoTrackSelection exoTrackSelection, int i3, DataSource dataSource, long j2, int i4, boolean z, List list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler) {
        Extractor fragmentedMp4Extractor;
        Format format;
        ChunkExtractor chunkExtractor;
        this.f12866a = loaderErrorThrower;
        this.f12876k = dashManifest;
        this.f12867b = baseUrlExclusionList;
        this.f12868c = iArr;
        this.f12875j = exoTrackSelection;
        this.f12869d = i3;
        this.f12870e = dataSource;
        this.f12877l = i2;
        this.f12871f = j2;
        this.f12872g = i4;
        this.f12873h = playerTrackEmsgHandler;
        long m7717P = Util.m7717P(dashManifest.m7041d(i2));
        ArrayList<Representation> m7027k = m7027k();
        this.f12874i = new RepresentationHolder[exoTrackSelection.length()];
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f12874i.length) {
            Representation representation = m7027k.get(exoTrackSelection.mo7300j(i6));
            BaseUrl m6991d = baseUrlExclusionList.m6991d(representation.f12975b);
            RepresentationHolder[] representationHolderArr = this.f12874i;
            BaseUrl baseUrl = m6991d == null ? representation.f12975b.get(i5) : m6991d;
            ChunkExtractor.Factory factory = BundledChunkExtractor.f12680k;
            Format format2 = representation.f12974a;
            ChunkExtractor chunkExtractor2 = null;
            switch (((C0954j) factory).f10233b) {
                case 25:
                    ChunkExtractor.Factory factory2 = BundledChunkExtractor.f12680k;
                    String str = format2.f9658l;
                    if (MimeTypes.m7606n(str)) {
                        fragmentedMp4Extractor = "application/x-rawcc".equals(str) ? new RawCcExtractor(format2) : fragmentedMp4Extractor;
                        chunkExtractor = chunkExtractor2;
                        break;
                    } else if (MimeTypes.m7605m(str)) {
                        fragmentedMp4Extractor = new MatroskaExtractor(1);
                    } else {
                        format = format2;
                        fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, null, null, list, playerTrackEmsgHandler);
                        chunkExtractor2 = new BundledChunkExtractor(fragmentedMp4Extractor, i3, format);
                        chunkExtractor = chunkExtractor2;
                    }
                    format = format2;
                    chunkExtractor2 = new BundledChunkExtractor(fragmentedMp4Extractor, i3, format);
                    chunkExtractor = chunkExtractor2;
                default:
                    int i7 = MediaParserChunkExtractor.f12751j;
                    if (!MimeTypes.m7606n(format2.f9658l)) {
                        chunkExtractor = new MediaParserChunkExtractor(i3, format2, list);
                        break;
                    } else {
                        Log.w("MediaPrsrChunkExtractor", "Ignoring an unsupported text track.");
                        chunkExtractor = chunkExtractor2;
                        break;
                    }
            }
            int i8 = i6;
            representationHolderArr[i8] = new RepresentationHolder(m7717P, representation, baseUrl, chunkExtractor, 0L, representation.mo7070l());
            i6 = i8 + 1;
            i5 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: a */
    public void mo6976a() throws IOException {
        IOException iOException = this.f12878m;
        if (iOException != null) {
            throw iOException;
        }
        this.f12866a.mo7013a();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: b */
    public boolean mo6977b(long j2, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.f12878m != null) {
            return false;
        }
        return this.f12875j.mo7297e(j2, chunk, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r3 < (r12 - 1)) goto L14;
     */
    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6978c(long r17, com.google.android.exoplayer2.SeekParameters r19) {
        /*
            r16 = this;
            r1 = r17
            r7 = r16
            com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder[] r0 = r7.f12874i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L54
            r5 = r0[r4]
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r6 = r5.f12886d
            if (r6 == 0) goto L51
            long r3 = r5.f12887e
            long r3 = r6.mo7019f(r1, r3)
            long r8 = r5.f12888f
            long r3 = r3 + r8
            long r8 = r5.m7035f(r3)
            long r10 = r5.m7033d()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L46
            r12 = -1
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L3d
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r0 = r5.f12886d
            long r12 = r0.mo7021h()
            long r14 = r5.f12888f
            long r12 = r12 + r14
            long r12 = r12 + r10
            r10 = 1
            long r12 = r12 - r10
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L46
            goto L3f
        L3d:
            r10 = 1
        L3f:
            long r3 = r3 + r10
            long r3 = r5.m7035f(r3)
            r5 = r3
            goto L47
        L46:
            r5 = r8
        L47:
            r0 = r19
            r1 = r17
            r3 = r8
            long r0 = r0.m5939a(r1, r3, r5)
            return r0
        L51:
            int r4 = r4 + 1
            goto L8
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.mo6978c(long, com.google.android.exoplayer2.SeekParameters):long");
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    /* renamed from: d */
    public void mo6992d(DashManifest dashManifest, int i2) {
        try {
            this.f12876k = dashManifest;
            this.f12877l = i2;
            long m7042e = dashManifest.m7042e(i2);
            ArrayList<Representation> m7027k = m7027k();
            for (int i3 = 0; i3 < this.f12874i.length; i3++) {
                Representation representation = m7027k.get(this.f12875j.mo7300j(i3));
                RepresentationHolder[] representationHolderArr = this.f12874i;
                representationHolderArr[i3] = representationHolderArr[i3].m7030a(m7042e, representation);
            }
        } catch (BehindLiveWindowException e2) {
            this.f12878m = e2;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: e */
    public int mo6979e(long j2, List<? extends MediaChunk> list) {
        return (this.f12878m != null || this.f12875j.length() < 2) ? list.size() : this.f12875j.mo7290k(j2, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    /* renamed from: f */
    public void mo6993f(ExoTrackSelection exoTrackSelection) {
        this.f12875j = exoTrackSelection;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: g */
    public void mo6980g(Chunk chunk) {
        ChunkIndex mo6963f;
        if (chunk instanceof InitializationChunk) {
            int mo7301l = this.f12875j.mo7301l(((InitializationChunk) chunk).f12701d);
            RepresentationHolder representationHolder = this.f12874i[mo7301l];
            if (representationHolder.f12886d == null && (mo6963f = representationHolder.f12883a.mo6963f()) != null) {
                RepresentationHolder[] representationHolderArr = this.f12874i;
                Representation representation = representationHolder.f12884b;
                representationHolderArr[mo7301l] = new RepresentationHolder(representationHolder.f12887e, representation, representationHolder.f12885c, representationHolder.f12883a, representationHolder.f12888f, new DashWrappingSegmentIndex(mo6963f, representation.f12976c));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.f12873h;
        if (playerTrackEmsgHandler != null) {
            long j2 = playerTrackEmsgHandler.f12913d;
            if (j2 == -9223372036854775807L || chunk.f12705h > j2) {
                playerTrackEmsgHandler.f12913d = chunk.f12705h;
            }
            PlayerEmsgHandler.this.f12905i = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo6981h(com.google.android.exoplayer2.source.chunk.Chunk r12, boolean r13, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r14, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r15) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.mo6981h(com.google.android.exoplayer2.source.chunk.Chunk, boolean, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy):boolean");
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /* renamed from: i */
    public void mo6982i(long j2, long j3, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        Format format;
        Representation representation;
        Chunk containerMediaChunk;
        MediaChunkIterator[] mediaChunkIteratorArr;
        int i2;
        int i3;
        long j4;
        boolean z;
        boolean z2;
        if (this.f12878m != null) {
            return;
        }
        long j5 = j3 - j2;
        long m7717P = Util.m7717P(this.f12876k.m7039b(this.f12877l).f12962b) + Util.m7717P(this.f12876k.f12927a) + j3;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.f12873h;
        if (playerTrackEmsgHandler != null) {
            PlayerEmsgHandler playerEmsgHandler = PlayerEmsgHandler.this;
            DashManifest dashManifest = playerEmsgHandler.f12903g;
            if (!dashManifest.f12930d) {
                z2 = false;
            } else if (playerEmsgHandler.f12906j) {
                z2 = true;
            } else {
                Map.Entry<Long, Long> ceilingEntry = playerEmsgHandler.f12902f.ceilingEntry(Long.valueOf(dashManifest.f12934h));
                if (ceilingEntry == null || ceilingEntry.getValue().longValue() >= m7717P) {
                    z = false;
                } else {
                    long longValue = ceilingEntry.getKey().longValue();
                    playerEmsgHandler.f12904h = longValue;
                    playerEmsgHandler.f12899c.mo7010b(longValue);
                    z = true;
                }
                if (z && playerEmsgHandler.f12905i) {
                    playerEmsgHandler.f12906j = true;
                    playerEmsgHandler.f12905i = false;
                    playerEmsgHandler.f12899c.mo7009a();
                }
                z2 = z;
            }
            if (z2) {
                return;
            }
        }
        long m7717P2 = Util.m7717P(Util.m7757z(this.f12871f));
        long m7026j = m7026j(m7717P2);
        MediaChunk mediaChunk = list.isEmpty() ? null : list.get(list.size() - 1);
        int length = this.f12875j.length();
        MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
        int i4 = 0;
        while (i4 < length) {
            RepresentationHolder representationHolder = this.f12874i[i4];
            if (representationHolder.f12886d == null) {
                mediaChunkIteratorArr2[i4] = MediaChunkIterator.f12750a;
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                i2 = i4;
                i3 = length;
                j4 = m7026j;
            } else {
                long m7031b = representationHolder.m7031b(m7717P2);
                long m7032c = representationHolder.m7032c(m7717P2);
                mediaChunkIteratorArr = mediaChunkIteratorArr2;
                i2 = i4;
                i3 = length;
                j4 = m7026j;
                long m7028l = m7028l(representationHolder, mediaChunk, j3, m7031b, m7032c);
                if (m7028l < m7031b) {
                    mediaChunkIteratorArr[i2] = MediaChunkIterator.f12750a;
                } else {
                    mediaChunkIteratorArr[i2] = new RepresentationSegmentIterator(m7029m(i2), m7028l, m7032c, j4);
                }
            }
            i4 = i2 + 1;
            mediaChunkIteratorArr2 = mediaChunkIteratorArr;
            length = i3;
            m7026j = j4;
        }
        long j6 = m7026j;
        this.f12875j.mo6737m(j2, j5, !this.f12876k.f12930d ? -9223372036854775807L : Math.max(0L, Math.min(m7026j(m7717P2), this.f12874i[0].m7034e(this.f12874i[0].m7032c(m7717P2))) - j2), list, mediaChunkIteratorArr2);
        RepresentationHolder m7029m = m7029m(this.f12875j.mo6736b());
        ChunkExtractor chunkExtractor = m7029m.f12883a;
        if (chunkExtractor != null) {
            Representation representation2 = m7029m.f12884b;
            RangedUri rangedUri = chunkExtractor.mo6961c() == null ? representation2.f12980g : null;
            RangedUri mo7071m = m7029m.f12886d == null ? representation2.mo7071m() : null;
            if (rangedUri != null || mo7071m != null) {
                DataSource dataSource = this.f12870e;
                Format mo7303o = this.f12875j.mo7303o();
                int mo6738p = this.f12875j.mo6738p();
                Object mo6739r = this.f12875j.mo6739r();
                Representation representation3 = m7029m.f12884b;
                if (rangedUri == null || (mo7071m = rangedUri.m7068a(mo7071m, m7029m.f12885c.f12923a)) != null) {
                    rangedUri = mo7071m;
                }
                chunkHolder.f12707a = new InitializationChunk(dataSource, DashUtil.m7024a(representation3, m7029m.f12885c.f12923a, rangedUri, 0), mo7303o, mo6738p, mo6739r, m7029m.f12883a);
                return;
            }
        }
        long j7 = m7029m.f12887e;
        boolean z3 = j7 != -9223372036854775807L;
        if (m7029m.m7033d() == 0) {
            chunkHolder.f12708b = z3;
            return;
        }
        long m7031b2 = m7029m.m7031b(m7717P2);
        long m7032c2 = m7029m.m7032c(m7717P2);
        boolean z4 = z3;
        long m7028l2 = m7028l(m7029m, mediaChunk, j3, m7031b2, m7032c2);
        if (m7028l2 < m7031b2) {
            this.f12878m = new BehindLiveWindowException();
            return;
        }
        if (m7028l2 > m7032c2 || (this.f12879n && m7028l2 >= m7032c2)) {
            chunkHolder.f12708b = z4;
            return;
        }
        if (z4 && m7029m.m7035f(m7028l2) >= j7) {
            chunkHolder.f12708b = true;
            return;
        }
        int min = (int) Math.min(this.f12872g, (m7032c2 - m7028l2) + 1);
        int i5 = 1;
        if (j7 != -9223372036854775807L) {
            while (min > 1 && m7029m.m7035f((min + m7028l2) - 1) >= j7) {
                min--;
            }
        }
        long j8 = list.isEmpty() ? j3 : -9223372036854775807L;
        DataSource dataSource2 = this.f12870e;
        int i6 = this.f12869d;
        Format mo7303o2 = this.f12875j.mo7303o();
        int mo6738p2 = this.f12875j.mo6738p();
        Object mo6739r2 = this.f12875j.mo6739r();
        Representation representation4 = m7029m.f12884b;
        long mo7014a = m7029m.f12886d.mo7014a(m7028l2 - m7029m.f12888f);
        RangedUri mo7018e = m7029m.f12886d.mo7018e(m7028l2 - m7029m.f12888f);
        if (m7029m.f12883a == null) {
            containerMediaChunk = new SingleSampleMediaChunk(dataSource2, DashUtil.m7024a(representation4, m7029m.f12885c.f12923a, mo7018e, m7029m.m7036g(m7028l2, j6) ? 0 : 8), mo7303o2, mo6738p2, mo6739r2, mo7014a, m7029m.m7034e(m7028l2), m7028l2, i6, mo7303o2);
        } else {
            int i7 = 1;
            while (true) {
                if (i7 >= min) {
                    format = mo7303o2;
                    representation = representation4;
                    break;
                }
                int i8 = min;
                format = mo7303o2;
                representation = representation4;
                RangedUri m7068a = mo7018e.m7068a(m7029m.f12886d.mo7018e((i7 + m7028l2) - m7029m.f12888f), m7029m.f12885c.f12923a);
                if (m7068a == null) {
                    break;
                }
                i5++;
                i7++;
                mo7303o2 = format;
                mo7018e = m7068a;
                min = i8;
                representation4 = representation;
            }
            long j9 = (i5 + m7028l2) - 1;
            long m7034e = m7029m.m7034e(j9);
            long j10 = m7029m.f12887e;
            long j11 = (j10 == -9223372036854775807L || j10 > m7034e) ? -9223372036854775807L : j10;
            int i9 = m7029m.m7036g(j9, j6) ? 0 : 8;
            Representation representation5 = representation;
            containerMediaChunk = new ContainerMediaChunk(dataSource2, DashUtil.m7024a(representation5, m7029m.f12885c.f12923a, mo7018e, i9), format, mo6738p2, mo6739r2, mo7014a, m7034e, j8, j11, m7028l2, i5, -representation5.f12976c, m7029m.f12883a);
        }
        chunkHolder.f12707a = containerMediaChunk;
    }

    /* renamed from: j */
    public final long m7026j(long j2) {
        DashManifest dashManifest = this.f12876k;
        long j3 = dashManifest.f12927a;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - Util.m7717P(j3 + dashManifest.m7039b(this.f12877l).f12962b);
    }

    /* renamed from: k */
    public final ArrayList<Representation> m7027k() {
        List<AdaptationSet> list = this.f12876k.m7039b(this.f12877l).f12963c;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i2 : this.f12868c) {
            arrayList.addAll(list.get(i2).f12919c);
        }
        return arrayList;
    }

    /* renamed from: l */
    public final long m7028l(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j2, long j3, long j4) {
        return mediaChunk != null ? mediaChunk.mo6983b() : Util.m7742k(representationHolder.f12886d.mo7019f(j2, representationHolder.f12887e) + representationHolder.f12888f, j3, j4);
    }

    /* renamed from: m */
    public final RepresentationHolder m7029m(int i2) {
        RepresentationHolder representationHolder = this.f12874i[i2];
        BaseUrl m6991d = this.f12867b.m6991d(representationHolder.f12884b.f12975b);
        if (m6991d == null || m6991d.equals(representationHolder.f12885c)) {
            return representationHolder;
        }
        RepresentationHolder representationHolder2 = new RepresentationHolder(representationHolder.f12887e, representationHolder.f12884b, m6991d, representationHolder.f12883a, representationHolder.f12888f, representationHolder.f12886d);
        this.f12874i[i2] = representationHolder2;
        return representationHolder2;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.f12874i) {
            ChunkExtractor chunkExtractor = representationHolder.f12883a;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }
}
