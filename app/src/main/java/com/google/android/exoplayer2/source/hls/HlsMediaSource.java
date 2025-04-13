package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.FilteringHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {

    /* renamed from: h */
    public final HlsExtractorFactory f13127h;

    /* renamed from: i */
    public final MediaItem.LocalConfiguration f13128i;

    /* renamed from: j */
    public final HlsDataSourceFactory f13129j;

    /* renamed from: k */
    public final CompositeSequenceableLoaderFactory f13130k;

    /* renamed from: l */
    public final DrmSessionManager f13131l;

    /* renamed from: m */
    public final LoadErrorHandlingPolicy f13132m;

    /* renamed from: n */
    public final boolean f13133n;

    /* renamed from: o */
    public final int f13134o;

    /* renamed from: p */
    public final boolean f13135p;

    /* renamed from: q */
    public final HlsPlaylistTracker f13136q;

    /* renamed from: r */
    public final long f13137r;

    /* renamed from: s */
    public final MediaItem f13138s;

    /* renamed from: t */
    public MediaItem.LiveConfiguration f13139t;

    /* renamed from: u */
    @Nullable
    public TransferListener f13140u;

    public static final class Factory implements MediaSourceFactory {

        /* renamed from: a */
        public final HlsDataSourceFactory f13141a;

        /* renamed from: f */
        public boolean f13146f;

        /* renamed from: g */
        public DrmSessionManagerProvider f13147g = new DefaultDrmSessionManagerProvider();

        /* renamed from: c */
        public HlsPlaylistParserFactory f13143c = new DefaultHlsPlaylistParserFactory();

        /* renamed from: d */
        public HlsPlaylistTracker.Factory f13144d = DefaultHlsPlaylistTracker.f13245q;

        /* renamed from: b */
        public HlsExtractorFactory f13142b = HlsExtractorFactory.f13076x1;

        /* renamed from: h */
        public LoadErrorHandlingPolicy f13148h = new DefaultLoadErrorHandlingPolicy();

        /* renamed from: e */
        public CompositeSequenceableLoaderFactory f13145e = new DefaultCompositeSequenceableLoaderFactory();

        /* renamed from: i */
        public int f13149i = 1;

        /* renamed from: j */
        public List<StreamKey> f13150j = Collections.emptyList();

        /* renamed from: k */
        public long f13151k = -9223372036854775807L;

        public Factory(DataSource.Factory factory) {
            this.f13141a = new DefaultHlsDataSourceFactory(factory);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: a */
        public MediaSourceFactory mo6810a(@Nullable String str) {
            if (!this.f13146f) {
                ((DefaultDrmSessionManagerProvider) this.f13147g).f10707f = str;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: b */
        public MediaSourceFactory mo6811b(@Nullable List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f13150j = list;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: d */
        public MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory) {
            if (!this.f13146f) {
                ((DefaultDrmSessionManagerProvider) this.f13147g).f10706e = factory;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: e */
        public MediaSourceFactory mo6814e(@Nullable final DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                m7107i(null);
            } else {
                m7107i(new DrmSessionManagerProvider() { // from class: com.google.android.exoplayer2.source.hls.a
                    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                    /* renamed from: b */
                    public final DrmSessionManager mo2562b(MediaItem mediaItem) {
                        return DrmSessionManager.this;
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: f */
        public /* bridge */ /* synthetic */ MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            m7107i(drmSessionManagerProvider);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: g */
        public MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.f13148h = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource mo6812c(MediaItem mediaItem) {
            MediaItem mediaItem2 = mediaItem;
            Objects.requireNonNull(mediaItem2.f9714c);
            HlsPlaylistParserFactory hlsPlaylistParserFactory = this.f13143c;
            List<StreamKey> list = mediaItem2.f9714c.f9774e.isEmpty() ? this.f13150j : mediaItem2.f9714c.f9774e;
            if (!list.isEmpty()) {
                hlsPlaylistParserFactory = new FilteringHlsPlaylistParserFactory(hlsPlaylistParserFactory, list);
            }
            MediaItem.LocalConfiguration localConfiguration = mediaItem2.f9714c;
            Object obj = localConfiguration.f9777h;
            if (localConfiguration.f9774e.isEmpty() && !list.isEmpty()) {
                MediaItem.Builder m5838b = mediaItem.m5838b();
                m5838b.m5840b(list);
                mediaItem2 = m5838b.m5839a();
            }
            MediaItem mediaItem3 = mediaItem2;
            HlsDataSourceFactory hlsDataSourceFactory = this.f13141a;
            HlsExtractorFactory hlsExtractorFactory = this.f13142b;
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.f13145e;
            DrmSessionManager mo2562b = this.f13147g.mo2562b(mediaItem3);
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f13148h;
            return new HlsMediaSource(mediaItem3, hlsDataSourceFactory, hlsExtractorFactory, compositeSequenceableLoaderFactory, mo2562b, loadErrorHandlingPolicy, this.f13144d.mo6097b(this.f13141a, loadErrorHandlingPolicy, hlsPlaylistParserFactory), this.f13151k, false, this.f13149i, false, null);
        }

        /* renamed from: i */
        public Factory m7107i(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.f13147g = drmSessionManagerProvider;
                this.f13146f = true;
            } else {
                this.f13147g = new DefaultDrmSessionManagerProvider();
                this.f13146f = false;
            }
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.hls");
    }

    public HlsMediaSource(MediaItem mediaItem, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker hlsPlaylistTracker, long j2, boolean z, int i2, boolean z2, C11111 c11111) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f9714c;
        Objects.requireNonNull(localConfiguration);
        this.f13128i = localConfiguration;
        this.f13138s = mediaItem;
        this.f13139t = mediaItem.f9715d;
        this.f13129j = hlsDataSourceFactory;
        this.f13127h = hlsExtractorFactory;
        this.f13130k = compositeSequenceableLoaderFactory;
        this.f13131l = drmSessionManager;
        this.f13132m = loadErrorHandlingPolicy;
        this.f13136q = hlsPlaylistTracker;
        this.f13137r = j2;
        this.f13133n = z;
        this.f13134o = i2;
        this.f13135p = z2;
    }

    @Nullable
    /* renamed from: J */
    public static HlsMediaPlaylist.Part m7104J(List<HlsMediaPlaylist.Part> list, long j2) {
        HlsMediaPlaylist.Part part = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            HlsMediaPlaylist.Part part2 = list.get(i2);
            long j3 = part2.f13325f;
            if (j3 > j2 || !part2.f13314m) {
                if (j3 > j2) {
                    break;
                }
            } else {
                part = part2;
            }
        }
        return part;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f13140u = transferListener;
        this.f13131l.prepare();
        this.f13136q.mo7138j(this.f13128i.f9770a, m6780y(null), this);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        this.f13136q.stop();
        this.f13131l.release();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        MediaSourceEventListener.EventDispatcher m6848s = this.f12230d.m6848s(0, mediaPeriodId, 0L);
        return new HlsMediaPeriod(this.f13127h, this.f13136q, this.f13129j, this.f13140u, this.f13131l, this.f12231e.m6308i(0, mediaPeriodId), this.f13132m, m6848s, allocator, this.f13130k, this.f13133n, this.f13134o, this.f13135p);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    /* renamed from: d */
    public void mo7105d(HlsMediaPlaylist hlsMediaPlaylist) {
        long j2;
        SinglePeriodTimeline singlePeriodTimeline;
        long j3;
        long j4;
        long j5;
        long j6;
        long m7735d0 = hlsMediaPlaylist.f13307p ? Util.m7735d0(hlsMediaPlaylist.f13299h) : -9223372036854775807L;
        int i2 = hlsMediaPlaylist.f13295d;
        long j7 = (i2 == 2 || i2 == 1) ? m7735d0 : -9223372036854775807L;
        HlsMasterPlaylist mo7137i = this.f13136q.mo7137i();
        Objects.requireNonNull(mo7137i);
        HlsManifest hlsManifest = new HlsManifest(mo7137i, hlsMediaPlaylist);
        if (this.f13136q.mo7135e()) {
            long mo7134d = hlsMediaPlaylist.f13299h - this.f13136q.mo7134d();
            long j8 = hlsMediaPlaylist.f13306o ? mo7134d + hlsMediaPlaylist.f13312u : -9223372036854775807L;
            long m7717P = hlsMediaPlaylist.f13307p ? Util.m7717P(Util.m7757z(this.f13137r)) - hlsMediaPlaylist.m7150b() : 0L;
            long j9 = this.f13139t.f9760b;
            if (j9 != -9223372036854775807L) {
                j5 = Util.m7717P(j9);
            } else {
                HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.f13313v;
                long j10 = hlsMediaPlaylist.f13296e;
                if (j10 != -9223372036854775807L) {
                    j4 = hlsMediaPlaylist.f13312u - j10;
                } else {
                    long j11 = serverControl.f13335d;
                    if (j11 == -9223372036854775807L || hlsMediaPlaylist.f13305n == -9223372036854775807L) {
                        j4 = serverControl.f13334c;
                        if (j4 == -9223372036854775807L) {
                            j4 = 3 * hlsMediaPlaylist.f13304m;
                        }
                    } else {
                        j4 = j11;
                    }
                }
                j5 = j4 + m7717P;
            }
            long m7735d02 = Util.m7735d0(Util.m7742k(j5, m7717P, hlsMediaPlaylist.f13312u + m7717P));
            MediaItem.LiveConfiguration liveConfiguration = this.f13139t;
            if (m7735d02 != liveConfiguration.f9760b) {
                MediaItem.LiveConfiguration.Builder m5844b = liveConfiguration.m5844b();
                m5844b.f9765a = m7735d02;
                this.f13139t = m5844b.m5845a();
            }
            long j12 = hlsMediaPlaylist.f13296e;
            if (j12 == -9223372036854775807L) {
                j12 = (hlsMediaPlaylist.f13312u + m7717P) - Util.m7717P(this.f13139t.f9760b);
            }
            if (!hlsMediaPlaylist.f13298g) {
                HlsMediaPlaylist.Part m7104J = m7104J(hlsMediaPlaylist.f13310s, j12);
                if (m7104J != null) {
                    j12 = m7104J.f13325f;
                } else if (hlsMediaPlaylist.f13309r.isEmpty()) {
                    j6 = 0;
                    singlePeriodTimeline = new SinglePeriodTimeline(j7, m7735d0, -9223372036854775807L, j8, hlsMediaPlaylist.f13312u, mo7134d, j6, true, !hlsMediaPlaylist.f13306o, hlsMediaPlaylist.f13295d != 2 && hlsMediaPlaylist.f13297f, hlsManifest, this.f13138s, this.f13139t);
                } else {
                    List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.f13309r;
                    HlsMediaPlaylist.Segment segment = list.get(Util.m7734d(list, Long.valueOf(j12), true, true));
                    HlsMediaPlaylist.Part m7104J2 = m7104J(segment.f13320n, j12);
                    j12 = m7104J2 != null ? m7104J2.f13325f : segment.f13325f;
                }
            }
            j6 = j12;
            singlePeriodTimeline = new SinglePeriodTimeline(j7, m7735d0, -9223372036854775807L, j8, hlsMediaPlaylist.f13312u, mo7134d, j6, true, !hlsMediaPlaylist.f13306o, hlsMediaPlaylist.f13295d != 2 && hlsMediaPlaylist.f13297f, hlsManifest, this.f13138s, this.f13139t);
        } else {
            if (hlsMediaPlaylist.f13296e == -9223372036854775807L || hlsMediaPlaylist.f13309r.isEmpty()) {
                j2 = 0;
            } else {
                if (!hlsMediaPlaylist.f13298g) {
                    long j13 = hlsMediaPlaylist.f13296e;
                    if (j13 != hlsMediaPlaylist.f13312u) {
                        List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.f13309r;
                        j3 = list2.get(Util.m7734d(list2, Long.valueOf(j13), true, true)).f13325f;
                        j2 = j3;
                    }
                }
                j3 = hlsMediaPlaylist.f13296e;
                j2 = j3;
            }
            long j14 = hlsMediaPlaylist.f13312u;
            singlePeriodTimeline = new SinglePeriodTimeline(j7, m7735d0, -9223372036854775807L, j14, j14, 0L, j2, true, false, true, hlsManifest, this.f13138s, null);
        }
        m6767G(singlePeriodTimeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f13138s;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f13136q.mo7139k();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        HlsMediaPeriod hlsMediaPeriod = (HlsMediaPeriod) mediaPeriod;
        hlsMediaPeriod.f13106c.mo7132b(hlsMediaPeriod);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : hlsMediaPeriod.f13123t) {
            if (hlsSampleStreamWrapper.f13159D) {
                for (HlsSampleStreamWrapper.HlsSampleQueue hlsSampleQueue : hlsSampleStreamWrapper.f13200v) {
                    hlsSampleQueue.m6881B();
                }
            }
            hlsSampleStreamWrapper.f13188j.m7474g(hlsSampleStreamWrapper);
            hlsSampleStreamWrapper.f13196r.removeCallbacksAndMessages(null);
            hlsSampleStreamWrapper.f13163H = true;
            hlsSampleStreamWrapper.f13197s.clear();
        }
        hlsMediaPeriod.f13120q = null;
    }
}
