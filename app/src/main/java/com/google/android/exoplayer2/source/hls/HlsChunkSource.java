package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class HlsChunkSource {

    /* renamed from: a */
    public final HlsExtractorFactory f13047a;

    /* renamed from: b */
    public final DataSource f13048b;

    /* renamed from: c */
    public final DataSource f13049c;

    /* renamed from: d */
    public final TimestampAdjusterProvider f13050d;

    /* renamed from: e */
    public final Uri[] f13051e;

    /* renamed from: f */
    public final Format[] f13052f;

    /* renamed from: g */
    public final HlsPlaylistTracker f13053g;

    /* renamed from: h */
    public final TrackGroup f13054h;

    /* renamed from: i */
    @Nullable
    public final List<Format> f13055i;

    /* renamed from: k */
    public boolean f13057k;

    /* renamed from: m */
    @Nullable
    public IOException f13059m;

    /* renamed from: n */
    @Nullable
    public Uri f13060n;

    /* renamed from: o */
    public boolean f13061o;

    /* renamed from: p */
    public ExoTrackSelection f13062p;

    /* renamed from: r */
    public boolean f13064r;

    /* renamed from: j */
    public final FullSegmentEncryptionKeyCache f13056j = new FullSegmentEncryptionKeyCache(4);

    /* renamed from: l */
    public byte[] f13058l = Util.f14741f;

    /* renamed from: q */
    public long f13063q = -9223372036854775807L;

    public static final class EncryptionKeyChunk extends DataChunk {

        /* renamed from: l */
        public byte[] f13065l;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i2, obj, bArr);
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        /* renamed from: b */
        public void mo6985b(byte[] bArr, int i2) {
            this.f13065l = Arrays.copyOf(bArr, i2);
        }
    }

    public static final class HlsChunkHolder {

        /* renamed from: a */
        @Nullable
        public Chunk f13066a = null;

        /* renamed from: b */
        public boolean f13067b = false;

        /* renamed from: c */
        @Nullable
        public Uri f13068c = null;
    }

    @VisibleForTesting
    public static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {

        /* renamed from: e */
        public final List<HlsMediaPlaylist.SegmentBase> f13069e;

        /* renamed from: f */
        public final long f13070f;

        public HlsMediaPlaylistSegmentIterator(String str, long j2, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.f13070f = j2;
            this.f13069e = list;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: a */
        public long mo6986a() {
            m6957c();
            return this.f13070f + this.f13069e.get((int) this.f12677d).f13325f;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: b */
        public long mo6987b() {
            m6957c();
            HlsMediaPlaylist.SegmentBase segmentBase = this.f13069e.get((int) this.f12677d);
            return this.f13070f + segmentBase.f13325f + segmentBase.f13323d;
        }
    }

    public static final class InitializationTrackSelection extends BaseTrackSelection {

        /* renamed from: g */
        public int f13071g;

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr, 0);
            this.f13071g = mo7301l(trackGroup.f12590c[iArr[0]]);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: b */
        public int mo6736b() {
            return this.f13071g;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: m */
        public void mo6737m(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo7296d(this.f13071g, elapsedRealtime)) {
                int i2 = this.f13882b;
                do {
                    i2--;
                    if (i2 < 0) {
                        throw new IllegalStateException();
                    }
                } while (mo7296d(i2, elapsedRealtime));
                this.f13071g = i2;
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: p */
        public int mo6738p() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        /* renamed from: r */
        public Object mo6739r() {
            return null;
        }
    }

    public static final class SegmentBaseHolder {

        /* renamed from: a */
        public final HlsMediaPlaylist.SegmentBase f13072a;

        /* renamed from: b */
        public final long f13073b;

        /* renamed from: c */
        public final int f13074c;

        /* renamed from: d */
        public final boolean f13075d;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long j2, int i2) {
            this.f13072a = segmentBase;
            this.f13073b = j2;
            this.f13074c = i2;
            this.f13075d = (segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).f13315n;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable List<Format> list) {
        this.f13047a = hlsExtractorFactory;
        this.f13053g = hlsPlaylistTracker;
        this.f13051e = uriArr;
        this.f13052f = formatArr;
        this.f13050d = timestampAdjusterProvider;
        this.f13055i = list;
        DataSource mo7088a = hlsDataSourceFactory.mo7088a(1);
        this.f13048b = mo7088a;
        if (transferListener != null) {
            mo7088a.mo6818c(transferListener);
        }
        this.f13049c = hlsDataSourceFactory.mo7088a(3);
        this.f13054h = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((formatArr[i2].f9652f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        this.f13062p = new InitializationTrackSelection(this.f13054h, Ints.m12085g(arrayList));
    }

    /* renamed from: a */
    public MediaChunkIterator[] m7090a(@Nullable HlsMediaChunk hlsMediaChunk, long j2) {
        List m11627D;
        int m6922b = hlsMediaChunk == null ? -1 : this.f13054h.m6922b(hlsMediaChunk.f12701d);
        int length = this.f13062p.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int mo7300j = this.f13062p.mo7300j(i2);
            Uri uri = this.f13051e[mo7300j];
            if (this.f13053g.mo7131a(uri)) {
                HlsMediaPlaylist mo7142n = this.f13053g.mo7142n(uri, z);
                Objects.requireNonNull(mo7142n);
                long mo7134d = mo7142n.f13299h - this.f13053g.mo7134d();
                Pair<Long, Integer> m7092c = m7092c(hlsMediaChunk, mo7300j != m6922b, mo7142n, mo7134d, j2);
                long longValue = ((Long) m7092c.first).longValue();
                int intValue = ((Integer) m7092c.second).intValue();
                String str = mo7142n.f13337a;
                int i3 = (int) (longValue - mo7142n.f13302k);
                if (i3 < 0 || mo7142n.f13309r.size() < i3) {
                    m11627D = ImmutableList.m11627D();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i3 < mo7142n.f13309r.size()) {
                        if (intValue != -1) {
                            HlsMediaPlaylist.Segment segment = mo7142n.f13309r.get(i3);
                            if (intValue == 0) {
                                arrayList.add(segment);
                            } else if (intValue < segment.f13320n.size()) {
                                List<HlsMediaPlaylist.Part> list = segment.f13320n;
                                arrayList.addAll(list.subList(intValue, list.size()));
                            }
                            i3++;
                        }
                        List<HlsMediaPlaylist.Segment> list2 = mo7142n.f13309r;
                        arrayList.addAll(list2.subList(i3, list2.size()));
                        intValue = 0;
                    }
                    if (mo7142n.f13305n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < mo7142n.f13310s.size()) {
                            List<HlsMediaPlaylist.Part> list3 = mo7142n.f13310s;
                            arrayList.addAll(list3.subList(intValue, list3.size()));
                        }
                    }
                    m11627D = Collections.unmodifiableList(arrayList);
                }
                mediaChunkIteratorArr[i2] = new HlsMediaPlaylistSegmentIterator(str, mo7134d, m11627D);
            } else {
                mediaChunkIteratorArr[i2] = MediaChunkIterator.f12750a;
            }
            i2++;
            z = false;
        }
        return mediaChunkIteratorArr;
    }

    /* renamed from: b */
    public int m7091b(HlsMediaChunk hlsMediaChunk) {
        if (hlsMediaChunk.f13093o == -1) {
            return 1;
        }
        HlsMediaPlaylist mo7142n = this.f13053g.mo7142n(this.f13051e[this.f13054h.m6922b(hlsMediaChunk.f12701d)], false);
        Objects.requireNonNull(mo7142n);
        int i2 = (int) (hlsMediaChunk.f12749j - mo7142n.f13302k);
        if (i2 < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i2 < mo7142n.f13309r.size() ? mo7142n.f13309r.get(i2).f13320n : mo7142n.f13310s;
        if (hlsMediaChunk.f13093o >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.f13093o);
        if (part.f13315n) {
            return 0;
        }
        return Util.m7728a(Uri.parse(UriUtil.m7700c(mo7142n.f13337a, part.f13321b)), hlsMediaChunk.f12699b.f14362a) ? 1 : 2;
    }

    /* renamed from: c */
    public final Pair<Long, Integer> m7092c(@Nullable HlsMediaChunk hlsMediaChunk, boolean z, HlsMediaPlaylist hlsMediaPlaylist, long j2, long j3) {
        if (hlsMediaChunk != null && !z) {
            if (!hlsMediaChunk.f13085H) {
                return new Pair<>(Long.valueOf(hlsMediaChunk.f12749j), Integer.valueOf(hlsMediaChunk.f13093o));
            }
            Long valueOf = Long.valueOf(hlsMediaChunk.f13093o == -1 ? hlsMediaChunk.mo6983b() : hlsMediaChunk.f12749j);
            int i2 = hlsMediaChunk.f13093o;
            return new Pair<>(valueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j4 = hlsMediaPlaylist.f13312u + j2;
        if (hlsMediaChunk != null && !this.f13061o) {
            j3 = hlsMediaChunk.f12704g;
        }
        if (!hlsMediaPlaylist.f13306o && j3 >= j4) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.f13302k + hlsMediaPlaylist.f13309r.size()), -1);
        }
        long j5 = j3 - j2;
        int i3 = 0;
        int m7734d = Util.m7734d(hlsMediaPlaylist.f13309r, Long.valueOf(j5), true, !this.f13053g.mo7135e() || hlsMediaChunk == null);
        long j6 = m7734d + hlsMediaPlaylist.f13302k;
        if (m7734d >= 0) {
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.f13309r.get(m7734d);
            List<HlsMediaPlaylist.Part> list = j5 < segment.f13325f + segment.f13323d ? segment.f13320n : hlsMediaPlaylist.f13310s;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                HlsMediaPlaylist.Part part = list.get(i3);
                if (j5 >= part.f13325f + part.f13323d) {
                    i3++;
                } else if (part.f13314m) {
                    j6 += list == hlsMediaPlaylist.f13310s ? 1L : 0L;
                    r1 = i3;
                }
            }
        }
        return new Pair<>(Long.valueOf(j6), Integer.valueOf(r1));
    }

    @Nullable
    /* renamed from: d */
    public final Chunk m7093d(@Nullable Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] remove = this.f13056j.f13045a.remove(uri);
        if (remove != null) {
            this.f13056j.f13045a.put(uri, remove);
            return null;
        }
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f14372a = uri;
        builder.f14380i = 1;
        return new EncryptionKeyChunk(this.f13049c, builder.m7438a(), this.f13052f[i2], this.f13062p.mo6738p(), this.f13062p.mo6739r(), this.f13058l);
    }
}
