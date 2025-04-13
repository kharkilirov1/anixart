package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaPeriod;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {

    /* renamed from: h */
    public final MediaItem f12457h;

    /* renamed from: i */
    public final MediaItem.LocalConfiguration f12458i;

    /* renamed from: j */
    public final DataSource.Factory f12459j;

    /* renamed from: k */
    public final ProgressiveMediaExtractor.Factory f12460k;

    /* renamed from: l */
    public final DrmSessionManager f12461l;

    /* renamed from: m */
    public final LoadErrorHandlingPolicy f12462m;

    /* renamed from: n */
    public final int f12463n;

    /* renamed from: o */
    public boolean f12464o;

    /* renamed from: p */
    public long f12465p;

    /* renamed from: q */
    public boolean f12466q;

    /* renamed from: r */
    public boolean f12467r;

    /* renamed from: s */
    @Nullable
    public TransferListener f12468s;

    public static final class Factory implements MediaSourceFactory {

        /* renamed from: a */
        public final DataSource.Factory f12469a;

        /* renamed from: b */
        public ProgressiveMediaExtractor.Factory f12470b;

        /* renamed from: c */
        public boolean f12471c;

        /* renamed from: d */
        public DrmSessionManagerProvider f12472d;

        /* renamed from: e */
        public LoadErrorHandlingPolicy f12473e;

        /* renamed from: f */
        public int f12474f;

        public Factory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            C1097c c1097c = new C1097c(extractorsFactory);
            this.f12469a = factory;
            this.f12470b = c1097c;
            this.f12472d = new DefaultDrmSessionManagerProvider();
            this.f12473e = new DefaultLoadErrorHandlingPolicy();
            this.f12474f = 1048576;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: a */
        public MediaSourceFactory mo6810a(@Nullable String str) {
            if (!this.f12471c) {
                ((DefaultDrmSessionManagerProvider) this.f12472d).f10707f = str;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: b */
        public MediaSourceFactory mo6811b(List list) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: d */
        public MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory) {
            if (!this.f12471c) {
                ((DefaultDrmSessionManagerProvider) this.f12472d).f10706e = factory;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: e */
        public MediaSourceFactory mo6814e(@Nullable DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                m6871i(null);
            } else {
                m6871i(new C1097c(drmSessionManager));
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: f */
        public /* bridge */ /* synthetic */ MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            m6871i(drmSessionManagerProvider);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: g */
        public MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.f12473e = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public ProgressiveMediaSource mo6812c(MediaItem mediaItem) {
            Objects.requireNonNull(mediaItem.f9714c);
            MediaItem.LocalConfiguration localConfiguration = mediaItem.f9714c;
            Object obj = localConfiguration.f9777h;
            String str = localConfiguration.f9775f;
            return new ProgressiveMediaSource(mediaItem, this.f12469a, this.f12470b, this.f12472d.mo2562b(mediaItem), this.f12473e, this.f12474f, null);
        }

        /* renamed from: i */
        public Factory m6871i(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.f12472d = drmSessionManagerProvider;
                this.f12471c = true;
            } else {
                this.f12472d = new DefaultDrmSessionManagerProvider();
                this.f12471c = false;
            }
            return this;
        }
    }

    public ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i2, C10871 c10871) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f9714c;
        Objects.requireNonNull(localConfiguration);
        this.f12458i = localConfiguration;
        this.f12457h = mediaItem;
        this.f12459j = factory;
        this.f12460k = factory2;
        this.f12461l = drmSessionManager;
        this.f12462m = loadErrorHandlingPolicy;
        this.f12463n = i2;
        this.f12464o = true;
        this.f12465p = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12468s = transferListener;
        this.f12461l.prepare();
        m6869J();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        this.f12461l.release();
    }

    /* renamed from: J */
    public final void m6869J() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.f12465p, this.f12466q, false, this.f12467r, null, this.f12457h);
        if (this.f12464o) {
            singlePeriodTimeline = new ForwardingTimeline(singlePeriodTimeline) { // from class: com.google.android.exoplayer2.source.ProgressiveMediaSource.1
                @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
                /* renamed from: i */
                public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
                    super.mo5612i(i2, period, z);
                    period.f10054g = true;
                    return period;
                }

                @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
                /* renamed from: q */
                public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
                    super.mo5616q(i2, window, j2);
                    window.f10075m = true;
                    return window;
                }
            };
        }
        m6767G(singlePeriodTimeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        DataSource mo6355a = this.f12459j.mo6355a();
        TransferListener transferListener = this.f12468s;
        if (transferListener != null) {
            mo6355a.mo6818c(transferListener);
        }
        return new ProgressiveMediaPeriod(this.f12458i.f9770a, mo6355a, this.f12460k.mo6849a(), this.f12461l, this.f12231e.m6308i(0, mediaPeriodId), this.f12462m, this.f12230d.m6848s(0, mediaPeriodId, 0L), this, allocator, this.f12458i.f9775f, this.f12463n);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12457h;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener
    /* renamed from: m */
    public void mo6868m(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.f12465p;
        }
        if (!this.f12464o && this.f12465p == j2 && this.f12466q == z && this.f12467r == z2) {
            return;
        }
        this.f12465p = j2;
        this.f12466q = z;
        this.f12467r = z2;
        this.f12464o = false;
        m6869J();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) mediaPeriod;
        if (progressiveMediaPeriod.f12430w) {
            for (SampleQueue sampleQueue : progressiveMediaPeriod.f12427t) {
                sampleQueue.m6881B();
            }
        }
        progressiveMediaPeriod.f12419l.m7474g(progressiveMediaPeriod);
        progressiveMediaPeriod.f12424q.removeCallbacksAndMessages(null);
        progressiveMediaPeriod.f12425r = null;
        progressiveMediaPeriod.f12408M = true;
    }
}
