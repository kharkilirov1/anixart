package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0918d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0920f;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.p038ws.WebSocketProtocol;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p005c.C0694a;

/* loaded from: classes.dex */
public class AnalyticsCollector implements Player.Listener, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {

    /* renamed from: b */
    public final Clock f10098b;

    /* renamed from: c */
    public final Timeline.Period f10099c;

    /* renamed from: d */
    public final Timeline.Window f10100d;

    /* renamed from: e */
    public final MediaPeriodQueueTracker f10101e;

    /* renamed from: f */
    public final SparseArray<AnalyticsListener.EventTime> f10102f;

    /* renamed from: g */
    public ListenerSet<AnalyticsListener> f10103g;

    /* renamed from: h */
    public Player f10104h;

    /* renamed from: i */
    public HandlerWrapper f10105i;

    /* renamed from: j */
    public boolean f10106j;

    public static final class MediaPeriodQueueTracker {

        /* renamed from: a */
        public final Timeline.Period f10107a;

        /* renamed from: b */
        public ImmutableList<MediaSource.MediaPeriodId> f10108b = ImmutableList.m11627D();

        /* renamed from: c */
        public ImmutableMap<MediaSource.MediaPeriodId, Timeline> f10109c = ImmutableMap.m11650l();

        /* renamed from: d */
        @Nullable
        public MediaSource.MediaPeriodId f10110d;

        /* renamed from: e */
        public MediaSource.MediaPeriodId f10111e;

        /* renamed from: f */
        public MediaSource.MediaPeriodId f10112f;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.f10107a = period;
        }

        @Nullable
        /* renamed from: b */
        public static MediaSource.MediaPeriodId m6020b(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object mo5615o = currentTimeline.m5991s() ? null : currentTimeline.mo5615o(currentPeriodIndex);
            int m5994c = (player.isPlayingAd() || currentTimeline.m5991s()) ? -1 : currentTimeline.m5987h(currentPeriodIndex, period).m5994c(Util.m7717P(player.getCurrentPosition()) - period.f10053f);
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i2);
                if (m6021c(mediaPeriodId2, mo5615o, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), m5994c)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null) {
                if (m6021c(mediaPeriodId, mo5615o, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), m5994c)) {
                    return mediaPeriodId;
                }
            }
            return null;
        }

        /* renamed from: c */
        public static boolean m6021c(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object obj, boolean z, int i2, int i3, int i4) {
            if (mediaPeriodId.f12356a.equals(obj)) {
                return (z && mediaPeriodId.f12357b == i2 && mediaPeriodId.f12358c == i3) || (!z && mediaPeriodId.f12357b == -1 && mediaPeriodId.f12360e == i4);
            }
            return false;
        }

        /* renamed from: a */
        public final void m6022a(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.mo5609d(mediaPeriodId.f12356a) != -1) {
                builder.mo11614c(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = this.f10109c.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.mo11614c(mediaPeriodId, timeline2);
            }
        }

        /* renamed from: d */
        public final void m6023d(Timeline timeline) {
            ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> m11648a = ImmutableMap.m11648a();
            if (this.f10108b.isEmpty()) {
                m6022a(m11648a, this.f10111e, timeline);
                if (!Objects.m11173a(this.f10112f, this.f10111e)) {
                    m6022a(m11648a, this.f10112f, timeline);
                }
                if (!Objects.m11173a(this.f10110d, this.f10111e) && !Objects.m11173a(this.f10110d, this.f10112f)) {
                    m6022a(m11648a, this.f10110d, timeline);
                }
            } else {
                for (int i2 = 0; i2 < this.f10108b.size(); i2++) {
                    m6022a(m11648a, this.f10108b.get(i2), timeline);
                }
                if (!this.f10108b.contains(this.f10110d)) {
                    m6022a(m11648a, this.f10110d, timeline);
                }
            }
            this.f10109c = m11648a.mo11613a();
        }
    }

    public AnalyticsCollector(Clock clock) {
        this.f10098b = clock;
        this.f10103g = new ListenerSet<>(new CopyOnWriteArraySet(), Util.m7753v(), clock, C0954j.f10210c);
        Timeline.Period period = new Timeline.Period();
        this.f10099c = period;
        this.f10100d = new Timeline.Window();
        this.f10101e = new MediaPeriodQueueTracker(period);
        this.f10102f = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: A */
    public final void mo5889A(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0959o c0959o = new C0959o(m6014L, loadEventInfo, mediaLoadData, 2);
        this.f10102f.put(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, c0959o);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: B */
    public final void mo5952B(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime m6015M = m6015M();
        C0958n c0958n = new C0958n(m6015M, decoderCounters, 3);
        this.f10102f.put(1025, m6015M);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1025, c0958n);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: C */
    public final void mo5890C(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0955k c0955k = new C0955k(m6014L, i3, 0);
        this.f10102f.put(1030, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1030, c0955k);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: D */
    public final void mo5891D(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0945a c0945a = new C0945a(m6014L, 1);
        this.f10102f.put(1035, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1035, c0945a);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: E */
    public final void mo5953E(int i2, long j2, long j3) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0956l c0956l = new C0956l(m6016N, i2, j2, j3, 1);
        this.f10102f.put(1012, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1012, c0956l);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: F */
    public final void mo5892F(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0953i c0953i = new C0953i(m6014L, loadEventInfo, mediaLoadData, iOException, z, 0);
        this.f10102f.put(1003, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1003, c0953i);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: G */
    public final void mo5954G(long j2, int i2) {
        AnalyticsListener.EventTime m6015M = m6015M();
        C0948d c0948d = new C0948d(m6015M, j2, i2);
        this.f10102f.put(1026, m6015M);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1026, c0948d);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: H */
    public final void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0945a c0945a = new C0945a(m6014L, 4);
        this.f10102f.put(1033, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1033, c0945a);
        listenerSet.m7580c();
    }

    /* renamed from: I */
    public final AnalyticsListener.EventTime m6011I() {
        return m6013K(this.f10101e.f10110d);
    }

    @RequiresNonNull({"player"})
    /* renamed from: J */
    public final AnalyticsListener.EventTime m6012J(Timeline timeline, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        long contentPosition;
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.m5991s() ? null : mediaPeriodId;
        long mo7527a = this.f10098b.mo7527a();
        boolean z = false;
        boolean z2 = timeline.equals(this.f10104h.getCurrentTimeline()) && i2 == this.f10104h.getCurrentMediaItemIndex();
        long j2 = 0;
        if (mediaPeriodId2 != null && mediaPeriodId2.m6828a()) {
            if (z2 && this.f10104h.getCurrentAdGroupIndex() == mediaPeriodId2.f12357b && this.f10104h.getCurrentAdIndexInAdGroup() == mediaPeriodId2.f12358c) {
                z = true;
            }
            if (z) {
                j2 = this.f10104h.getCurrentPosition();
            }
        } else {
            if (z2) {
                contentPosition = this.f10104h.getContentPosition();
                return new AnalyticsListener.EventTime(mo7527a, timeline, i2, mediaPeriodId2, contentPosition, this.f10104h.getCurrentTimeline(), this.f10104h.getCurrentMediaItemIndex(), this.f10101e.f10110d, this.f10104h.getCurrentPosition(), this.f10104h.getTotalBufferedDuration());
            }
            if (!timeline.m5991s()) {
                j2 = timeline.mo5616q(i2, this.f10100d, 0L).m6002b();
            }
        }
        contentPosition = j2;
        return new AnalyticsListener.EventTime(mo7527a, timeline, i2, mediaPeriodId2, contentPosition, this.f10104h.getCurrentTimeline(), this.f10104h.getCurrentMediaItemIndex(), this.f10101e.f10110d, this.f10104h.getCurrentPosition(), this.f10104h.getTotalBufferedDuration());
    }

    /* renamed from: K */
    public final AnalyticsListener.EventTime m6013K(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        java.util.Objects.requireNonNull(this.f10104h);
        Timeline timeline = mediaPeriodId == null ? null : this.f10101e.f10109c.get(mediaPeriodId);
        if (mediaPeriodId != null && timeline != null) {
            return m6012J(timeline, timeline.mo5613j(mediaPeriodId.f12356a, this.f10099c).f10051d, mediaPeriodId);
        }
        int currentMediaItemIndex = this.f10104h.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.f10104h.getCurrentTimeline();
        if (!(currentMediaItemIndex < currentTimeline.mo5937r())) {
            currentTimeline = Timeline.f10047b;
        }
        return m6012J(currentTimeline, currentMediaItemIndex, null);
    }

    /* renamed from: L */
    public final AnalyticsListener.EventTime m6014L(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        java.util.Objects.requireNonNull(this.f10104h);
        if (mediaPeriodId != null) {
            return this.f10101e.f10109c.get(mediaPeriodId) != null ? m6013K(mediaPeriodId) : m6012J(Timeline.f10047b, i2, mediaPeriodId);
        }
        Timeline currentTimeline = this.f10104h.getCurrentTimeline();
        if (!(i2 < currentTimeline.mo5937r())) {
            currentTimeline = Timeline.f10047b;
        }
        return m6012J(currentTimeline, i2, null);
    }

    /* renamed from: M */
    public final AnalyticsListener.EventTime m6015M() {
        return m6013K(this.f10101e.f10111e);
    }

    /* renamed from: N */
    public final AnalyticsListener.EventTime m6016N() {
        return m6013K(this.f10101e.f10112f);
    }

    @CallSuper
    /* renamed from: O */
    public void m6017O(Player player, Looper looper) {
        Assertions.m7516d(this.f10104h == null || this.f10101e.f10108b.isEmpty());
        this.f10104h = player;
        this.f10105i = this.f10098b.mo7529c(looper, null);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        this.f10103g = new ListenerSet<>(listenerSet.f14644d, looper, listenerSet.f14641a, new C0919e(this, player, 5));
    }

    /* renamed from: P */
    public final void m6018P(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.f10101e;
        Player player = this.f10104h;
        java.util.Objects.requireNonNull(player);
        java.util.Objects.requireNonNull(mediaPeriodQueueTracker);
        mediaPeriodQueueTracker.f10108b = ImmutableList.m11634y(list);
        if (!list.isEmpty()) {
            mediaPeriodQueueTracker.f10111e = list.get(0);
            java.util.Objects.requireNonNull(mediaPeriodId);
            mediaPeriodQueueTracker.f10112f = mediaPeriodId;
        }
        if (mediaPeriodQueueTracker.f10110d == null) {
            mediaPeriodQueueTracker.f10110d = MediaPeriodQueueTracker.m6020b(player, mediaPeriodQueueTracker.f10108b, mediaPeriodQueueTracker.f10111e, mediaPeriodQueueTracker.f10107a);
        }
        mediaPeriodQueueTracker.m6023d(player.getCurrentTimeline());
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: a */
    public final void mo5955a(String str) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0962r c0962r = new C0962r(m6016N, str, 0);
        this.f10102f.put(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, c0962r);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: b */
    public final void mo5956b(Exception exc) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0961q c0961q = new C0961q(m6016N, exc, 3);
        this.f10102f.put(1018, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1018, c0961q);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: c */
    public final void mo5957c(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime m6015M = m6015M();
        C0958n c0958n = new C0958n(m6015M, decoderCounters, 2);
        this.f10102f.put(1014, m6015M);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1014, c0958n);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: d */
    public final void mo5958d(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0958n c0958n = new C0958n(m6016N, decoderCounters, 1);
        this.f10102f.put(1008, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1008, c0958n);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: e */
    public final void mo5959e(String str, long j2, long j3) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0963s c0963s = new C0963s(m6016N, str, j3, j2, 1);
        this.f10102f.put(1021, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1021, c0963s);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: f */
    public final void mo5895f(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0960p c0960p = new C0960p(m6014L, mediaLoadData, 1);
        this.f10102f.put(1004, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1004, c0960p);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: g */
    public final void mo5896g(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0959o c0959o = new C0959o(m6014L, loadEventInfo, mediaLoadData, 0);
        this.f10102f.put(1002, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1002, c0959o);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: h */
    public final void mo5897h(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0960p c0960p = new C0960p(m6014L, mediaLoadData, 0);
        this.f10102f.put(WebSocketProtocol.CLOSE_NO_STATUS_CODE, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(WebSocketProtocol.CLOSE_NO_STATUS_CODE, c0960p);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: i */
    public final void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0961q c0961q = new C0961q(m6014L, exc, 2);
        this.f10102f.put(1032, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1032, c0961q);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    /* renamed from: j */
    public final void mo5899j(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0959o c0959o = new C0959o(m6014L, loadEventInfo, mediaLoadData, 1);
        this.f10102f.put(1000, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1000, c0959o);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    /* renamed from: k */
    public final void mo6019k(int i2, long j2, long j3) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.f10101e;
        AnalyticsListener.EventTime m6013K = m6013K(mediaPeriodQueueTracker.f10108b.isEmpty() ? null : (MediaSource.MediaPeriodId) Iterables.m11700e(mediaPeriodQueueTracker.f10108b));
        C0956l c0956l = new C0956l(m6013K, i2, j2, j3, 0);
        this.f10102f.put(1006, m6013K);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1006, c0956l);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: l */
    public final void mo5962l(String str) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0962r c0962r = new C0962r(m6016N, str, 1);
        this.f10102f.put(1013, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1013, c0962r);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: m */
    public final void mo5963m(String str, long j2, long j3) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0963s c0963s = new C0963s(m6016N, str, j3, j2, 0);
        this.f10102f.put(1009, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1009, c0963s);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: n */
    public final void mo5964n(int i2, long j2) {
        AnalyticsListener.EventTime m6015M = m6015M();
        C0948d c0948d = new C0948d(m6015M, i2, j2);
        this.f10102f.put(1023, m6015M);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1023, c0948d);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: o */
    public final void mo5965o(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0957m c0957m = new C0957m(m6016N, format, decoderReuseEvaluation, 1);
        this.f10102f.put(1010, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1010, c0957m);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0919e c0919e = new C0919e(m6011I, commands, 9);
        this.f10102f.put(13, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(13, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onIsLoadingChanged(boolean z) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0946b c0946b = new C0946b(m6011I, z, 1);
        this.f10102f.put(3, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(3, c0946b);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onIsPlayingChanged(boolean z) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0946b c0946b = new C0946b(m6011I, z, 2);
        this.f10102f.put(7, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(7, c0946b);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onMediaItemTransition(@Nullable MediaItem mediaItem, int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0918d c0918d = new C0918d(m6011I, mediaItem, i2);
        this.f10102f.put(1, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1, c0918d);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0919e c0919e = new C0919e(m6011I, mediaMetadata, 7);
        this.f10102f.put(14, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(14, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0919e c0919e = new C0919e(m6011I, metadata, 2);
        this.f10102f.put(1007, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1007, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayWhenReadyChanged(boolean z, int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0947c c0947c = new C0947c(m6011I, z, i2, 0);
        this.f10102f.put(5, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(5, c0947c);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0919e c0919e = new C0919e(m6011I, playbackParameters, 8);
        this.f10102f.put(12, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(12, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackStateChanged(int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0955k c0955k = new C0955k(m6011I, i2, 4);
        this.f10102f.put(4, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(4, c0955k);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackSuppressionReasonChanged(int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0955k c0955k = new C0955k(m6011I, i2, 2);
        this.f10102f.put(6, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(6, c0955k);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerError(PlaybackException playbackException) {
        MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime m6013K = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).f9511i) == null) ? null : m6013K(new MediaSource.MediaPeriodId(mediaPeriodId));
        if (m6013K == null) {
            m6013K = m6011I();
        }
        C0919e c0919e = new C0919e(m6013K, playbackException, 4);
        this.f10102f.put(10, m6013K);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(10, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(boolean z, int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0947c c0947c = new C0947c(m6011I, z, i2, 1);
        this.f10102f.put(-1, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(-1, c0947c);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPositionDiscontinuity(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (i2 == 1) {
            this.f10106j = false;
        }
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.f10101e;
        Player player = this.f10104h;
        java.util.Objects.requireNonNull(player);
        mediaPeriodQueueTracker.f10110d = MediaPeriodQueueTracker.m6020b(player, mediaPeriodQueueTracker.f10108b, mediaPeriodQueueTracker.f10111e, mediaPeriodQueueTracker.f10107a);
        AnalyticsListener.EventTime m6011I = m6011I();
        C0950f c0950f = new C0950f(m6011I, i2, positionInfo, positionInfo2, 0);
        this.f10102f.put(11, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(11, c0950f);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(int i2) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0955k c0955k = new C0955k(m6011I, i2, 3);
        this.f10102f.put(8, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(8, c0955k);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0945a c0945a = new C0945a(m6011I, 6);
        this.f10102f.put(-1, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(-1, c0945a);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0946b c0946b = new C0946b(m6011I, z, 3);
        this.f10102f.put(9, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(9, c0946b);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0946b c0946b = new C0946b(m6016N, z, 0);
        this.f10102f.put(1017, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1017, c0946b);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSurfaceSizeChanged(int i2, int i3) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0951g c0951g = new C0951g(m6016N, i2, i3, 0);
        this.f10102f.put(1029, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1029, c0951g);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, int i2) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.f10101e;
        Player player = this.f10104h;
        java.util.Objects.requireNonNull(player);
        mediaPeriodQueueTracker.f10110d = MediaPeriodQueueTracker.m6020b(player, mediaPeriodQueueTracker.f10108b, mediaPeriodQueueTracker.f10111e, mediaPeriodQueueTracker.f10107a);
        mediaPeriodQueueTracker.m6023d(player.getCurrentTimeline());
        AnalyticsListener.EventTime m6011I = m6011I();
        C0955k c0955k = new C0955k(m6011I, i2, 1);
        this.f10102f.put(0, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(0, c0955k);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0694a c0694a = new C0694a(m6011I, trackGroupArray, trackSelectionArray);
        this.f10102f.put(2, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(2, c0694a);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTracksInfoChanged(TracksInfo tracksInfo) {
        AnalyticsListener.EventTime m6011I = m6011I();
        C0919e c0919e = new C0919e(m6011I, tracksInfo, 6);
        this.f10102f.put(2, m6011I);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(2, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0919e c0919e = new C0919e(m6016N, videoSize, 3);
        this.f10102f.put(1028, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1028, c0919e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(float f2) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0949e c0949e = new C0949e(m6016N, f2, 0);
        this.f10102f.put(1019, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1019, c0949e);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: p */
    public final void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0945a c0945a = new C0945a(m6014L, 5);
        this.f10102f.put(1034, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1034, c0945a);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: q */
    public final void mo5967q(Object obj, long j2) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0920f c0920f = new C0920f(m6016N, obj, j2, 1);
        this.f10102f.put(1027, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1027, c0920f);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: r */
    public /* synthetic */ void mo5901r(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: s */
    public /* synthetic */ void mo5969s(Format format) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: t */
    public final void mo5970t(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0958n c0958n = new C0958n(m6016N, decoderCounters, 0);
        this.f10102f.put(1020, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1020, c0958n);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: u */
    public final void mo5971u(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0957m c0957m = new C0957m(m6016N, format, decoderReuseEvaluation, 0);
        this.f10102f.put(1022, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1022, c0957m);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: v */
    public final void mo5972v(long j2) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0952h c0952h = new C0952h(m6016N, j2, 0);
        this.f10102f.put(1011, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1011, c0952h);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    /* renamed from: w */
    public final void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime m6014L = m6014L(i2, mediaPeriodId);
        C0945a c0945a = new C0945a(m6014L, 3);
        this.f10102f.put(1031, m6014L);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1031, c0945a);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: x */
    public final void mo5973x(Exception exc) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0961q c0961q = new C0961q(m6016N, exc, 0);
        this.f10102f.put(1037, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1037, c0961q);
        listenerSet.m7580c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    /* renamed from: y */
    public /* synthetic */ void mo5974y(Format format) {
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    /* renamed from: z */
    public final void mo5975z(Exception exc) {
        AnalyticsListener.EventTime m6016N = m6016N();
        C0961q c0961q = new C0961q(m6016N, exc, 1);
        this.f10102f.put(1038, m6016N);
        ListenerSet<AnalyticsListener> listenerSet = this.f10103g;
        listenerSet.m7581d(1038, c0961q);
        listenerSet.m7580c();
    }
}
