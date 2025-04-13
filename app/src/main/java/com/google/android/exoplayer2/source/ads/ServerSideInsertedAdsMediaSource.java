package com.google.android.exoplayer2.source.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ServerSideInsertedAdsMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    public static final class MediaPeriodImpl implements MediaPeriod {

        /* renamed from: b */
        public final SharedMediaPeriod f12640b;

        /* renamed from: c */
        public final MediaSource.MediaPeriodId f12641c;

        /* renamed from: d */
        public final MediaSourceEventListener.EventDispatcher f12642d;

        /* renamed from: e */
        public MediaPeriod.Callback f12643e;

        /* renamed from: f */
        public long f12644f;

        /* renamed from: g */
        public boolean[] f12645g;

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: c */
        public long mo6788c(long j2, SeekParameters seekParameters) {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            Objects.requireNonNull(sharedMediaPeriod);
            return ServerSideInsertedAdsUtil.m6951a(sharedMediaPeriod.f12649b.mo6788c(ServerSideInsertedAdsUtil.m6954d(j2, this.f12641c, sharedMediaPeriod.f12652e), seekParameters), this.f12641c, sharedMediaPeriod.f12652e);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j2) {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            MediaPeriodImpl mediaPeriodImpl = sharedMediaPeriod.f12653f;
            if (mediaPeriodImpl != null && !equals(mediaPeriodImpl)) {
                for (Pair<LoadEventInfo, MediaLoadData> pair : sharedMediaPeriod.f12651d.values()) {
                    mediaPeriodImpl.f12642d.m6839j((LoadEventInfo) pair.first, ServerSideInsertedAdsMediaSource.m6944K(mediaPeriodImpl, (MediaLoadData) pair.second, sharedMediaPeriod.f12652e));
                    this.f12642d.m6845p((LoadEventInfo) pair.first, ServerSideInsertedAdsMediaSource.m6944K(this, (MediaLoadData) pair.second, sharedMediaPeriod.f12652e));
                }
            }
            sharedMediaPeriod.f12653f = this;
            return sharedMediaPeriod.f12649b.continueLoading(sharedMediaPeriod.m6949c(this, j2));
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j2, boolean z) {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            Objects.requireNonNull(sharedMediaPeriod);
            sharedMediaPeriod.f12649b.discardBuffer(ServerSideInsertedAdsUtil.m6954d(j2, this.f12641c, sharedMediaPeriod.f12652e), z);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            return sharedMediaPeriod.m6948b(this, sharedMediaPeriod.f12649b.getBufferedPositionUs());
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            return sharedMediaPeriod.m6948b(this, sharedMediaPeriod.f12649b.getNextLoadPositionUs());
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.f12640b.f12649b.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: i */
        public void mo6789i(MediaPeriod.Callback callback, long j2) {
            this.f12643e = callback;
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            Objects.requireNonNull(sharedMediaPeriod);
            this.f12644f = j2;
            if (!sharedMediaPeriod.f12654g) {
                sharedMediaPeriod.f12654g = true;
                sharedMediaPeriod.f12649b.mo6789i(sharedMediaPeriod, ServerSideInsertedAdsUtil.m6954d(j2, this.f12641c, sharedMediaPeriod.f12652e));
            } else if (sharedMediaPeriod.f12655h) {
                MediaPeriod.Callback callback2 = this.f12643e;
                Objects.requireNonNull(callback2);
                callback2.mo5787g(this);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            return equals(sharedMediaPeriod.f12653f) && sharedMediaPeriod.f12649b.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: j */
        public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            if (this.f12645g.length == 0) {
                this.f12645g = new boolean[sampleStreamArr.length];
            }
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            Objects.requireNonNull(sharedMediaPeriod);
            this.f12644f = j2;
            if (!equals(sharedMediaPeriod.f12650c.get(0))) {
                for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                    boolean z = true;
                    if (exoTrackSelectionArr[i2] != null) {
                        if (zArr[i2] && sampleStreamArr[i2] != null) {
                            z = false;
                        }
                        zArr2[i2] = z;
                        if (zArr2[i2]) {
                            sampleStreamArr[i2] = Util.m7728a(sharedMediaPeriod.f12656i[i2], exoTrackSelectionArr[i2]) ? new SampleStreamImpl(this, i2) : new EmptySampleStream();
                        }
                    } else {
                        sampleStreamArr[i2] = null;
                        zArr2[i2] = true;
                    }
                }
                return j2;
            }
            sharedMediaPeriod.f12656i = (ExoTrackSelection[]) Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
            long m6954d = ServerSideInsertedAdsUtil.m6954d(j2, this.f12641c, sharedMediaPeriod.f12652e);
            SampleStream[] sampleStreamArr2 = sharedMediaPeriod.f12657j;
            SampleStream[] sampleStreamArr3 = sampleStreamArr2.length == 0 ? new SampleStream[exoTrackSelectionArr.length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr2, sampleStreamArr2.length);
            long mo6790j = sharedMediaPeriod.f12649b.mo6790j(exoTrackSelectionArr, zArr, sampleStreamArr3, zArr2, m6954d);
            sharedMediaPeriod.f12657j = (SampleStream[]) Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
            sharedMediaPeriod.f12658k = (MediaLoadData[]) Arrays.copyOf(sharedMediaPeriod.f12658k, sampleStreamArr3.length);
            for (int i3 = 0; i3 < sampleStreamArr3.length; i3++) {
                if (sampleStreamArr3[i3] == null) {
                    sampleStreamArr[i3] = null;
                    sharedMediaPeriod.f12658k[i3] = null;
                } else if (sampleStreamArr[i3] == null || zArr2[i3]) {
                    sampleStreamArr[i3] = new SampleStreamImpl(this, i3);
                    sharedMediaPeriod.f12658k[i3] = null;
                }
            }
            return ServerSideInsertedAdsUtil.m6951a(mo6790j, this.f12641c, sharedMediaPeriod.f12652e);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.f12640b.f12649b.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            if (!equals(sharedMediaPeriod.f12650c.get(0))) {
                return -9223372036854775807L;
            }
            long readDiscontinuity = sharedMediaPeriod.f12649b.readDiscontinuity();
            if (readDiscontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return ServerSideInsertedAdsUtil.m6951a(readDiscontinuity, this.f12641c, sharedMediaPeriod.f12652e);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            sharedMediaPeriod.f12649b.reevaluateBuffer(sharedMediaPeriod.m6949c(this, j2));
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j2) {
            SharedMediaPeriod sharedMediaPeriod = this.f12640b;
            Objects.requireNonNull(sharedMediaPeriod);
            return ServerSideInsertedAdsUtil.m6951a(sharedMediaPeriod.f12649b.seekToUs(ServerSideInsertedAdsUtil.m6954d(j2, this.f12641c, sharedMediaPeriod.f12652e)), this.f12641c, sharedMediaPeriod.f12652e);
        }
    }

    public static final class SampleStreamImpl implements SampleStream {

        /* renamed from: b */
        public final MediaPeriodImpl f12646b;

        /* renamed from: c */
        public final int f12647c;

        public SampleStreamImpl(MediaPeriodImpl mediaPeriodImpl, int i2) {
            this.f12646b = mediaPeriodImpl;
            this.f12647c = i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() throws IOException {
            SharedMediaPeriod sharedMediaPeriod = this.f12646b.f12640b;
            SampleStream sampleStream = sharedMediaPeriod.f12657j[this.f12647c];
            int i2 = Util.f14736a;
            sampleStream.mo6791a();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            SharedMediaPeriod sharedMediaPeriod = this.f12646b.f12640b;
            SampleStream sampleStream = sharedMediaPeriod.f12657j[this.f12647c];
            int i2 = Util.f14736a;
            return sampleStream.mo6792b();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            MediaPeriodImpl mediaPeriodImpl = this.f12646b;
            SharedMediaPeriod sharedMediaPeriod = mediaPeriodImpl.f12640b;
            int i3 = this.f12647c;
            SampleStream sampleStream = sharedMediaPeriod.f12657j[i3];
            int i4 = Util.f14736a;
            int mo6793d = sampleStream.mo6793d(formatHolder, decoderInputBuffer, i2 | 1 | 4);
            long m6948b = sharedMediaPeriod.m6948b(mediaPeriodImpl, decoderInputBuffer.f10607f);
            if ((mo6793d == -4 && m6948b == Long.MIN_VALUE) || (mo6793d == -3 && sharedMediaPeriod.m6948b(mediaPeriodImpl, sharedMediaPeriod.f12649b.getBufferedPositionUs()) == Long.MIN_VALUE && !decoderInputBuffer.f10606e)) {
                sharedMediaPeriod.m6950d(mediaPeriodImpl, i3);
                decoderInputBuffer.mo6248l();
                decoderInputBuffer.m6238e(4);
                return -4;
            }
            if (mo6793d != -4) {
                return mo6793d;
            }
            sharedMediaPeriod.m6950d(mediaPeriodImpl, i3);
            sharedMediaPeriod.f12657j[i3].mo6793d(formatHolder, decoderInputBuffer, i2);
            decoderInputBuffer.f10607f = m6948b;
            return mo6793d;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            MediaPeriodImpl mediaPeriodImpl = this.f12646b;
            SharedMediaPeriod sharedMediaPeriod = mediaPeriodImpl.f12640b;
            int i2 = this.f12647c;
            Objects.requireNonNull(sharedMediaPeriod);
            long m6954d = ServerSideInsertedAdsUtil.m6954d(j2, mediaPeriodImpl.f12641c, sharedMediaPeriod.f12652e);
            SampleStream sampleStream = sharedMediaPeriod.f12657j[i2];
            int i3 = Util.f14736a;
            return sampleStream.mo6794h(m6954d);
        }
    }

    public static final class ServerSideInsertedAdsTimeline extends ForwardingTimeline {

        /* renamed from: d */
        public final AdPlaybackState f12648d;

        public ServerSideInsertedAdsTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
            super(timeline);
            Assertions.m7516d(timeline.mo5936k() == 1);
            Assertions.m7516d(timeline.mo5937r() == 1);
            this.f12648d = null;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            super.mo5612i(i2, period, z);
            long j2 = period.f10052e;
            period.m6000j(period.f10049b, period.f10050c, period.f10051d, j2 == -9223372036854775807L ? this.f12648d.f12605e : ServerSideInsertedAdsUtil.m6953c(j2, -1, this.f12648d), -ServerSideInsertedAdsUtil.m6953c(-period.f10053f, -1, this.f12648d), this.f12648d, period.f10054g);
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            super.mo5616q(i2, window, j2);
            long m6953c = ServerSideInsertedAdsUtil.m6953c(window.f10080r, -1, this.f12648d);
            long j3 = window.f10077o;
            if (j3 == -9223372036854775807L) {
                long j4 = this.f12648d.f12605e;
                if (j4 != -9223372036854775807L) {
                    window.f10077o = j4 - m6953c;
                }
            } else {
                window.f10077o = ServerSideInsertedAdsUtil.m6953c(window.f10080r + j3, -1, this.f12648d) - m6953c;
            }
            window.f10080r = m6953c;
            return window;
        }
    }

    public static final class SharedMediaPeriod implements MediaPeriod.Callback {

        /* renamed from: b */
        public final MediaPeriod f12649b;

        /* renamed from: c */
        public final List<MediaPeriodImpl> f12650c;

        /* renamed from: d */
        public final Map<Long, Pair<LoadEventInfo, MediaLoadData>> f12651d;

        /* renamed from: e */
        public AdPlaybackState f12652e;

        /* renamed from: f */
        @Nullable
        public MediaPeriodImpl f12653f;

        /* renamed from: g */
        public boolean f12654g;

        /* renamed from: h */
        public boolean f12655h;

        /* renamed from: i */
        public ExoTrackSelection[] f12656i;

        /* renamed from: j */
        public SampleStream[] f12657j;

        /* renamed from: k */
        public MediaLoadData[] f12658k;

        /* renamed from: b */
        public final long m6948b(MediaPeriodImpl mediaPeriodImpl, long j2) {
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long m6951a = ServerSideInsertedAdsUtil.m6951a(j2, mediaPeriodImpl.f12641c, this.f12652e);
            if (m6951a >= ServerSideInsertedAdsMediaSource.m6943J(mediaPeriodImpl, this.f12652e)) {
                return Long.MIN_VALUE;
            }
            return m6951a;
        }

        /* renamed from: c */
        public final long m6949c(MediaPeriodImpl mediaPeriodImpl, long j2) {
            long j3 = mediaPeriodImpl.f12644f;
            return j2 < j3 ? ServerSideInsertedAdsUtil.m6954d(j3, mediaPeriodImpl.f12641c, this.f12652e) - (mediaPeriodImpl.f12644f - j2) : ServerSideInsertedAdsUtil.m6954d(j2, mediaPeriodImpl.f12641c, this.f12652e);
        }

        /* renamed from: d */
        public final void m6950d(MediaPeriodImpl mediaPeriodImpl, int i2) {
            boolean[] zArr = mediaPeriodImpl.f12645g;
            if (zArr[i2]) {
                return;
            }
            MediaLoadData[] mediaLoadDataArr = this.f12658k;
            if (mediaLoadDataArr[i2] != null) {
                zArr[i2] = true;
                mediaPeriodImpl.f12642d.m6833d(ServerSideInsertedAdsMediaSource.m6944K(mediaPeriodImpl, mediaLoadDataArr[i2], this.f12652e));
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* renamed from: e */
        public void mo5784e(MediaPeriod mediaPeriod) {
            MediaPeriodImpl mediaPeriodImpl = this.f12653f;
            if (mediaPeriodImpl == null) {
                return;
            }
            MediaPeriod.Callback callback = mediaPeriodImpl.f12643e;
            Objects.requireNonNull(callback);
            callback.mo5784e(this.f12653f);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        /* renamed from: g */
        public void mo5787g(MediaPeriod mediaPeriod) {
            this.f12655h = true;
            for (int i2 = 0; i2 < this.f12650c.size(); i2++) {
                MediaPeriodImpl mediaPeriodImpl = this.f12650c.get(i2);
                MediaPeriod.Callback callback = mediaPeriodImpl.f12643e;
                if (callback != null) {
                    callback.mo5787g(mediaPeriodImpl);
                }
            }
        }
    }

    /* renamed from: J */
    public static long m6943J(MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.f12641c;
        if (mediaPeriodId.m6828a()) {
            AdPlaybackState.AdGroup m6925b = adPlaybackState.m6925b(mediaPeriodId.f12357b);
            if (m6925b.f12610c == -1) {
                return 0L;
            }
            return m6925b.f12613f[mediaPeriodId.f12358c];
        }
        int i2 = mediaPeriodId.f12360e;
        if (i2 != -1) {
            long j2 = adPlaybackState.m6925b(i2).f12609b;
            if (j2 != Long.MIN_VALUE) {
                return j2;
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: K */
    public static MediaLoadData m6944K(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.f12345a, mediaLoadData.f12346b, mediaLoadData.f12347c, mediaLoadData.f12348d, mediaLoadData.f12349e, m6945L(mediaLoadData.f12350f, mediaPeriodImpl, adPlaybackState), m6945L(mediaLoadData.f12351g, mediaPeriodImpl, adPlaybackState));
    }

    /* renamed from: L */
    public static long m6945L(long j2, MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long m7717P = Util.m7717P(j2);
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.f12641c;
        return Util.m7735d0(mediaPeriodId.m6828a() ? ServerSideInsertedAdsUtil.m6952b(m7717P, mediaPeriodId.f12357b, mediaPeriodId.f12358c, adPlaybackState) : ServerSideInsertedAdsUtil.m6953c(m7717P, -1, adPlaybackState));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: A */
    public void mo5889A(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        m6946M(mediaPeriodId, mediaLoadData, true);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: B */
    public void mo6765B() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: C */
    public void mo5890C(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        m6946M(mediaPeriodId, null, true);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: D */
    public void mo5891D(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        m6946M(mediaPeriodId, null, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        Util.m7744m();
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: F */
    public void mo5892F(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        m6946M(mediaPeriodId, mediaLoadData, true);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: H */
    public void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        m6946M(mediaPeriodId, null, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        m6947N();
        synchronized (this) {
        }
        throw null;
    }

    @Nullable
    /* renamed from: M */
    public final MediaPeriodImpl m6946M(@Nullable MediaSource.MediaPeriodId mediaPeriodId, @Nullable MediaLoadData mediaLoadData, boolean z) {
        if (mediaPeriodId == null) {
            return null;
        }
        throw null;
    }

    /* renamed from: N */
    public final void m6947N() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        long j3 = mediaPeriodId.f12359d;
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    /* renamed from: b */
    public void mo5903b(MediaSource mediaSource, Timeline timeline) {
        if (AdPlaybackState.f12599h.equals(null)) {
            return;
        }
        m6767G(new ServerSideInsertedAdsTimeline(timeline, null));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: f */
    public void mo5895f(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        m6946M(mediaPeriodId, mediaLoadData, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: g */
    public void mo5896g(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        m6946M(mediaPeriodId, mediaLoadData, true);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: h */
    public void mo5897h(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        m6946M(mediaPeriodId, mediaLoadData, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: i */
    public void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        m6946M(mediaPeriodId, null, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: j */
    public void mo5899j(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        m6946M(mediaPeriodId, mediaLoadData, true);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: p */
    public void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        m6946M(mediaPeriodId, null, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: r */
    public /* synthetic */ void mo5901r(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) mediaPeriod;
        SharedMediaPeriod sharedMediaPeriod = mediaPeriodImpl.f12640b;
        if (mediaPeriodImpl.equals(sharedMediaPeriod.f12653f)) {
            sharedMediaPeriod.f12653f = null;
            sharedMediaPeriod.f12651d.clear();
        }
        sharedMediaPeriod.f12650c.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.f12640b.f12650c.isEmpty()) {
            long j2 = mediaPeriodImpl.f12641c.f12359d;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: w */
    public void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        m6946M(mediaPeriodId, null, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: z */
    public void mo6781z() {
        throw null;
    }
}
