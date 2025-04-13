package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {

    /* renamed from: A */
    public boolean f9567A;

    /* renamed from: B */
    public boolean f9568B;

    /* renamed from: C */
    public boolean f9569C;

    /* renamed from: D */
    public boolean f9570D;

    /* renamed from: E */
    public boolean f9571E;

    /* renamed from: F */
    public int f9572F;

    /* renamed from: G */
    public boolean f9573G;

    /* renamed from: H */
    public boolean f9574H;

    /* renamed from: I */
    public boolean f9575I;

    /* renamed from: J */
    public boolean f9576J;

    /* renamed from: K */
    public int f9577K;

    /* renamed from: L */
    @Nullable
    public SeekPosition f9578L;

    /* renamed from: M */
    public long f9579M;

    /* renamed from: N */
    public int f9580N;

    /* renamed from: O */
    public boolean f9581O;

    /* renamed from: P */
    @Nullable
    public ExoPlaybackException f9582P;

    /* renamed from: b */
    public final Renderer[] f9583b;

    /* renamed from: c */
    public final Set<Renderer> f9584c;

    /* renamed from: d */
    public final RendererCapabilities[] f9585d;

    /* renamed from: e */
    public final TrackSelector f9586e;

    /* renamed from: f */
    public final TrackSelectorResult f9587f;

    /* renamed from: g */
    public final LoadControl f9588g;

    /* renamed from: h */
    public final BandwidthMeter f9589h;

    /* renamed from: i */
    public final HandlerWrapper f9590i;

    /* renamed from: j */
    public final HandlerThread f9591j;

    /* renamed from: k */
    public final Looper f9592k;

    /* renamed from: l */
    public final Timeline.Window f9593l;

    /* renamed from: m */
    public final Timeline.Period f9594m;

    /* renamed from: n */
    public final long f9595n;

    /* renamed from: o */
    public final boolean f9596o;

    /* renamed from: p */
    public final DefaultMediaClock f9597p;

    /* renamed from: q */
    public final ArrayList<PendingMessageInfo> f9598q;

    /* renamed from: r */
    public final Clock f9599r;

    /* renamed from: s */
    public final PlaybackInfoUpdateListener f9600s;

    /* renamed from: t */
    public final MediaPeriodQueue f9601t;

    /* renamed from: u */
    public final MediaSourceList f9602u;

    /* renamed from: v */
    public final LivePlaybackSpeedControl f9603v;

    /* renamed from: w */
    public final long f9604w;

    /* renamed from: x */
    public SeekParameters f9605x;

    /* renamed from: y */
    public PlaybackInfo f9606y;

    /* renamed from: z */
    public PlaybackInfoUpdate f9607z;

    public static final class MediaSourceListUpdateMessage {

        /* renamed from: a */
        public final List<MediaSourceList.MediaSourceHolder> f9609a;

        /* renamed from: b */
        public final ShuffleOrder f9610b;

        /* renamed from: c */
        public final int f9611c;

        /* renamed from: d */
        public final long f9612d;

        public MediaSourceListUpdateMessage(List list, ShuffleOrder shuffleOrder, int i2, long j2, C09341 c09341) {
            this.f9609a = list;
            this.f9610b = shuffleOrder;
            this.f9611c = i2;
            this.f9612d = j2;
        }
    }

    public static class MoveMediaItemsMessage {

        /* renamed from: a */
        public final int f9613a;

        /* renamed from: b */
        public final int f9614b;

        /* renamed from: c */
        public final int f9615c;

        /* renamed from: d */
        public final ShuffleOrder f9616d;
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {

        /* renamed from: b */
        public final PlayerMessage f9617b;

        /* renamed from: c */
        public int f9618c;

        /* renamed from: d */
        public long f9619d;

        /* renamed from: e */
        @Nullable
        public Object f9620e;

        /* renamed from: a */
        public void m5821a(int i2, long j2, Object obj) {
            this.f9618c = i2;
            this.f9619d = j2;
            this.f9620e = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            PendingMessageInfo pendingMessageInfo2 = pendingMessageInfo;
            Object obj = this.f9620e;
            if ((obj == null) != (pendingMessageInfo2.f9620e == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i2 = this.f9618c - pendingMessageInfo2.f9618c;
            return i2 != 0 ? i2 : Util.m7739h(this.f9619d, pendingMessageInfo2.f9619d);
        }
    }

    public static final class PlaybackInfoUpdate {

        /* renamed from: a */
        public boolean f9621a;

        /* renamed from: b */
        public PlaybackInfo f9622b;

        /* renamed from: c */
        public int f9623c;

        /* renamed from: d */
        public boolean f9624d;

        /* renamed from: e */
        public int f9625e;

        /* renamed from: f */
        public boolean f9626f;

        /* renamed from: g */
        public int f9627g;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.f9622b = playbackInfo;
        }

        /* renamed from: a */
        public void m5822a(int i2) {
            this.f9621a |= i2 > 0;
            this.f9623c += i2;
        }
    }

    public interface PlaybackInfoUpdateListener {
        /* renamed from: a */
        void mo5823a(PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PositionUpdateForPlaylistChange {

        /* renamed from: a */
        public final MediaSource.MediaPeriodId f9628a;

        /* renamed from: b */
        public final long f9629b;

        /* renamed from: c */
        public final long f9630c;

        /* renamed from: d */
        public final boolean f9631d;

        /* renamed from: e */
        public final boolean f9632e;

        /* renamed from: f */
        public final boolean f9633f;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.f9628a = mediaPeriodId;
            this.f9629b = j2;
            this.f9630c = j3;
            this.f9631d = z;
            this.f9632e = z2;
            this.f9633f = z3;
        }
    }

    public static final class SeekPosition {

        /* renamed from: a */
        public final Timeline f9634a;

        /* renamed from: b */
        public final int f9635b;

        /* renamed from: c */
        public final long f9636c;

        public SeekPosition(Timeline timeline, int i2, long j2) {
            this.f9634a = timeline;
            this.f9635b = i2;
            this.f9636c = j2;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i2, boolean z, @Nullable AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j2, boolean z2, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener) {
        this.f9600s = playbackInfoUpdateListener;
        this.f9583b = rendererArr;
        this.f9586e = trackSelector;
        this.f9587f = trackSelectorResult;
        this.f9588g = loadControl;
        this.f9589h = bandwidthMeter;
        this.f9572F = i2;
        this.f9573G = z;
        this.f9605x = seekParameters;
        this.f9603v = livePlaybackSpeedControl;
        this.f9604w = j2;
        this.f9568B = z2;
        this.f9599r = clock;
        this.f9595n = loadControl.mo5689c();
        this.f9596o = loadControl.mo5688b();
        PlaybackInfo m5912i = PlaybackInfo.m5912i(trackSelectorResult);
        this.f9606y = m5912i;
        this.f9607z = new PlaybackInfoUpdate(m5912i);
        this.f9585d = new RendererCapabilities[rendererArr.length];
        for (int i3 = 0; i3 < rendererArr.length; i3++) {
            rendererArr[i3].mo5659e(i3);
            this.f9585d[i3] = rendererArr[i3].mo5665k();
        }
        this.f9597p = new DefaultMediaClock(this, clock);
        this.f9598q = new ArrayList<>();
        this.f9584c = Sets.m11890h();
        this.f9593l = new Timeline.Window();
        this.f9594m = new Timeline.Period();
        trackSelector.f14029a = this;
        trackSelector.f14030b = bandwidthMeter;
        this.f9581O = true;
        Handler handler = new Handler(looper);
        this.f9601t = new MediaPeriodQueue(analyticsCollector, handler);
        this.f9602u = new MediaSourceList(this, analyticsCollector, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9591j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9592k = looper2;
        this.f9590i = clock.mo7529c(looper2, this);
    }

    /* renamed from: A */
    public static boolean m5750A(Renderer renderer) {
        return renderer.getState() != 0;
    }

    /* renamed from: C */
    public static boolean m5751C(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f9930b;
        Timeline timeline = playbackInfo.f9929a;
        return timeline.m5991s() || timeline.mo5613j(mediaPeriodId.f12356a, period).f10054g;
    }

    /* renamed from: O */
    public static boolean m5752O(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i2, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.f9620e;
        if (obj == null) {
            Objects.requireNonNull(pendingMessageInfo.f9617b);
            Objects.requireNonNull(pendingMessageInfo.f9617b);
            long m7717P = Util.m7717P(-9223372036854775807L);
            PlayerMessage playerMessage = pendingMessageInfo.f9617b;
            Pair<Object, Long> m5753Q = m5753Q(timeline, new SeekPosition(playerMessage.f9968d, playerMessage.f9972h, m7717P), false, i2, z, window, period);
            if (m5753Q == null) {
                return false;
            }
            pendingMessageInfo.m5821a(timeline.mo5609d(m5753Q.first), ((Long) m5753Q.second).longValue(), m5753Q.first);
            Objects.requireNonNull(pendingMessageInfo.f9617b);
            return true;
        }
        int mo5609d = timeline.mo5609d(obj);
        if (mo5609d == -1) {
            return false;
        }
        Objects.requireNonNull(pendingMessageInfo.f9617b);
        pendingMessageInfo.f9618c = mo5609d;
        timeline2.mo5613j(pendingMessageInfo.f9620e, period);
        if (period.f10054g && timeline2.m5990p(period.f10051d, window).f10078p == timeline2.mo5609d(pendingMessageInfo.f9620e)) {
            Pair<Object, Long> m5988l = timeline.m5988l(window, period, timeline.mo5613j(pendingMessageInfo.f9620e, period).f10051d, pendingMessageInfo.f9619d + period.f10053f);
            pendingMessageInfo.m5821a(timeline.mo5609d(m5988l.first), ((Long) m5988l.second).longValue(), m5988l.first);
        }
        return true;
    }

    @Nullable
    /* renamed from: Q */
    public static Pair<Object, Long> m5753Q(Timeline timeline, SeekPosition seekPosition, boolean z, int i2, boolean z2, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> m5988l;
        Object m5754R;
        Timeline timeline2 = seekPosition.f9634a;
        if (timeline.m5991s()) {
            return null;
        }
        Timeline timeline3 = timeline2.m5991s() ? timeline : timeline2;
        try {
            m5988l = timeline3.m5988l(window, period, seekPosition.f9635b, seekPosition.f9636c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline3)) {
            return m5988l;
        }
        if (timeline.mo5609d(m5988l.first) != -1) {
            return (timeline3.mo5613j(m5988l.first, period).f10054g && timeline3.m5990p(period.f10051d, window).f10078p == timeline3.mo5609d(m5988l.first)) ? timeline.m5988l(window, period, timeline.mo5613j(m5988l.first, period).f10051d, seekPosition.f9636c) : m5988l;
        }
        if (z && (m5754R = m5754R(window, period, i2, z2, m5988l.first, timeline3, timeline)) != null) {
            return timeline.m5988l(window, period, timeline.mo5613j(m5754R, period).f10051d, -9223372036854775807L);
        }
        return null;
    }

    @Nullable
    /* renamed from: R */
    public static Object m5754R(Timeline.Window window, Timeline.Period period, int i2, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int mo5609d = timeline.mo5609d(obj);
        int mo5936k = timeline.mo5936k();
        int i3 = mo5609d;
        int i4 = -1;
        for (int i5 = 0; i5 < mo5936k && i4 == -1; i5++) {
            i3 = timeline.m5986f(i3, period, window, i2, z);
            if (i3 == -1) {
                break;
            }
            i4 = timeline2.mo5609d(timeline.mo5615o(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return timeline2.mo5615o(i4);
    }

    /* renamed from: m */
    public static Format[] m5755m(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = exoTrackSelection.mo7299h(i2);
        }
        return formatArr;
    }

    /* renamed from: B */
    public final boolean m5756B() {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        long j2 = mediaPeriodHolder.f9862f.f9876e;
        return mediaPeriodHolder.f9860d && (j2 == -9223372036854775807L || this.f9606y.f9947s < j2 || !m5796k0());
    }

    /* renamed from: D */
    public final void m5757D() {
        long j2;
        long j3;
        boolean mo5693g;
        if (m5818z()) {
            MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
            long m5808r = m5808r(!mediaPeriodHolder.f9860d ? 0L : mediaPeriodHolder.f9857a.getNextLoadPositionUs());
            if (mediaPeriodHolder == this.f9601t.f9888h) {
                j2 = this.f9579M;
                j3 = mediaPeriodHolder.f9871o;
            } else {
                j2 = this.f9579M - mediaPeriodHolder.f9871o;
                j3 = mediaPeriodHolder.f9862f.f9873b;
            }
            mo5693g = this.f9588g.mo5693g(j2 - j3, m5808r, this.f9597p.getPlaybackParameters().f9949b);
        } else {
            mo5693g = false;
        }
        this.f9571E = mo5693g;
        if (mo5693g) {
            MediaPeriodHolder mediaPeriodHolder2 = this.f9601t.f9890j;
            long j4 = this.f9579M;
            Assertions.m7516d(mediaPeriodHolder2.m5856g());
            mediaPeriodHolder2.f9857a.continueLoading(j4 - mediaPeriodHolder2.f9871o);
        }
        m5805p0();
    }

    /* renamed from: E */
    public final void m5758E() {
        PlaybackInfoUpdate playbackInfoUpdate = this.f9607z;
        PlaybackInfo playbackInfo = this.f9606y;
        boolean z = playbackInfoUpdate.f9621a | (playbackInfoUpdate.f9622b != playbackInfo);
        playbackInfoUpdate.f9621a = z;
        playbackInfoUpdate.f9622b = playbackInfo;
        if (z) {
            this.f9600s.mo5823a(playbackInfoUpdate);
            this.f9607z = new PlaybackInfoUpdate(this.f9606y);
        }
    }

    /* renamed from: F */
    public final void m5759F() throws ExoPlaybackException {
        m5814v(this.f9602u.m5882c(), true);
    }

    /* renamed from: G */
    public final void m5760G(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
        Timeline m5882c;
        this.f9607z.m5822a(1);
        MediaSourceList mediaSourceList = this.f9602u;
        int i2 = moveMediaItemsMessage.f9613a;
        int i3 = moveMediaItemsMessage.f9614b;
        int i4 = moveMediaItemsMessage.f9615c;
        ShuffleOrder shuffleOrder = moveMediaItemsMessage.f9616d;
        Objects.requireNonNull(mediaSourceList);
        Assertions.m7513a(i2 >= 0 && i2 <= i3 && i3 <= mediaSourceList.m5884e() && i4 >= 0);
        mediaSourceList.f9902i = shuffleOrder;
        if (i2 == i3 || i2 == i4) {
            m5882c = mediaSourceList.m5882c();
        } else {
            int min = Math.min(i2, i4);
            int max = Math.max(((i3 - i2) + i4) - 1, i3 - 1);
            int i5 = mediaSourceList.f9894a.get(min).f9915d;
            Util.m7716O(mediaSourceList.f9894a, i2, i3, i4);
            while (min <= max) {
                MediaSourceList.MediaSourceHolder mediaSourceHolder = mediaSourceList.f9894a.get(min);
                mediaSourceHolder.f9915d = i5;
                i5 += mediaSourceHolder.f9912a.f12336o.mo5937r();
                min++;
            }
            m5882c = mediaSourceList.m5882c();
        }
        m5814v(m5882c, false);
    }

    /* renamed from: H */
    public final void m5761H() {
        this.f9607z.m5822a(1);
        m5765L(false, false, false, true);
        this.f9588g.mo5687a();
        m5794j0(this.f9606y.f9929a.m5991s() ? 4 : 2);
        MediaSourceList mediaSourceList = this.f9602u;
        TransferListener mo6742d = this.f9589h.mo6742d();
        Assertions.m7516d(!mediaSourceList.f9903j);
        mediaSourceList.f9904k = mo6742d;
        for (int i2 = 0; i2 < mediaSourceList.f9894a.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = mediaSourceList.f9894a.get(i2);
            mediaSourceList.m5886g(mediaSourceHolder);
            mediaSourceList.f9901h.add(mediaSourceHolder);
        }
        mediaSourceList.f9903j = true;
        this.f9590i.mo7571f(2);
    }

    /* renamed from: I */
    public final void m5762I() {
        m5765L(true, false, true, false);
        this.f9588g.mo5691e();
        m5794j0(1);
        this.f9591j.quit();
        synchronized (this) {
            this.f9567A = true;
            notifyAll();
        }
    }

    /* renamed from: J */
    public final void m5763J(int i2, int i3, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.f9607z.m5822a(1);
        MediaSourceList mediaSourceList = this.f9602u;
        Objects.requireNonNull(mediaSourceList);
        Assertions.m7513a(i2 >= 0 && i2 <= i3 && i3 <= mediaSourceList.m5884e());
        mediaSourceList.f9902i = shuffleOrder;
        mediaSourceList.m5888i(i2, i3);
        m5814v(mediaSourceList.m5882c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5764K() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.m5764K():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5765L(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.m5765L(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: M */
    public final void m5766M() {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        this.f9569C = mediaPeriodHolder != null && mediaPeriodHolder.f9862f.f9879h && this.f9568B;
    }

    /* renamed from: N */
    public final void m5767N(long j2) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        long j3 = j2 + (mediaPeriodHolder == null ? 1000000000000L : mediaPeriodHolder.f9871o);
        this.f9579M = j3;
        this.f9597p.f9494b.m7681a(j3);
        for (Renderer renderer : this.f9583b) {
            if (m5750A(renderer)) {
                renderer.mo5673u(this.f9579M);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = this.f9601t.f9888h; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.f9868l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder2.f9870n.f14033c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.mo7304s();
                }
            }
        }
    }

    /* renamed from: P */
    public final void m5768P(Timeline timeline, Timeline timeline2) {
        if (timeline.m5991s() && timeline2.m5991s()) {
            return;
        }
        int size = this.f9598q.size();
        while (true) {
            size--;
            if (size < 0) {
                Collections.sort(this.f9598q);
                return;
            } else if (!m5752O(this.f9598q.get(size), timeline, timeline2, this.f9572F, this.f9573G, this.f9593l, this.f9594m)) {
                this.f9598q.get(size).f9617b.m5932c(false);
                this.f9598q.remove(size);
            }
        }
    }

    /* renamed from: S */
    public final void m5769S(long j2, long j3) {
        this.f9590i.mo7574i(2);
        this.f9590i.mo7573h(2, j2 + j3);
    }

    /* renamed from: T */
    public final void m5770T(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.f9601t.f9888h.f9862f.f9872a;
        long m5773W = m5773W(mediaPeriodId, this.f9606y.f9947s, true, false);
        if (m5773W != this.f9606y.f9947s) {
            PlaybackInfo playbackInfo = this.f9606y;
            this.f9606y = m5817y(mediaPeriodId, m5773W, playbackInfo.f9931c, playbackInfo.f9932d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:6:0x00a1, B:8:0x00ab, B:15:0x00b1, B:17:0x00b7, B:18:0x00ba, B:19:0x00c0, B:21:0x00ca, B:23:0x00d0, B:27:0x00d8, B:28:0x00e2, B:30:0x00f2, B:34:0x00fc, B:37:0x010e, B:40:0x0117), top: B:5:0x00a1 }] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5771U(com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r20) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.m5771U(com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition):void");
    }

    /* renamed from: V */
    public final long m5772V(MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z) throws ExoPlaybackException {
        MediaPeriodQueue mediaPeriodQueue = this.f9601t;
        return m5773W(mediaPeriodId, j2, mediaPeriodQueue.f9888h != mediaPeriodQueue.f9889i, z);
    }

    /* renamed from: W */
    public final long m5773W(MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z, boolean z2) throws ExoPlaybackException {
        MediaPeriodQueue mediaPeriodQueue;
        m5803o0();
        this.f9570D = false;
        if (z2 || this.f9606y.f9933e == 3) {
            m5794j0(2);
        }
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !mediaPeriodId.equals(mediaPeriodHolder2.f9862f.f9872a)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.f9868l;
        }
        if (z || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.f9871o + j2 < 0)) {
            for (Renderer renderer : this.f9583b) {
                m5791i(renderer);
            }
            if (mediaPeriodHolder2 != null) {
                while (true) {
                    mediaPeriodQueue = this.f9601t;
                    if (mediaPeriodQueue.f9888h == mediaPeriodHolder2) {
                        break;
                    }
                    mediaPeriodQueue.m5863a();
                }
                mediaPeriodQueue.m5876n(mediaPeriodHolder2);
                mediaPeriodHolder2.f9871o = 1000000000000L;
                m5795k();
            }
        }
        if (mediaPeriodHolder2 != null) {
            this.f9601t.m5876n(mediaPeriodHolder2);
            if (!mediaPeriodHolder2.f9860d) {
                mediaPeriodHolder2.f9862f = mediaPeriodHolder2.f9862f.m5861b(j2);
            } else if (mediaPeriodHolder2.f9861e) {
                long seekToUs = mediaPeriodHolder2.f9857a.seekToUs(j2);
                mediaPeriodHolder2.f9857a.discardBuffer(seekToUs - this.f9595n, this.f9596o);
                j2 = seekToUs;
            }
            m5767N(j2);
            m5757D();
        } else {
            this.f9601t.m5864b();
            m5767N(j2);
        }
        m5813u(false);
        this.f9590i.mo7571f(2);
        return j2;
    }

    /* renamed from: X */
    public final void m5774X(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.f9971g != this.f9592k) {
            this.f9590i.mo7575j(15, playerMessage).mo7577a();
            return;
        }
        m5789h(playerMessage);
        int i2 = this.f9606y.f9933e;
        if (i2 == 3 || i2 == 2) {
            this.f9590i.mo7571f(2);
        }
    }

    /* renamed from: Y */
    public final void m5775Y(PlayerMessage playerMessage) {
        Looper looper = playerMessage.f9971g;
        if (looper.getThread().isAlive()) {
            this.f9599r.mo7529c(looper, null).mo7567b(new RunnableC1001e(this, playerMessage, 1));
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.m5932c(false);
        }
    }

    /* renamed from: Z */
    public final void m5776Z(Renderer renderer, long j2) {
        renderer.mo5664j();
        if (renderer instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) renderer;
            Assertions.m7516d(textRenderer.f9452k);
            textRenderer.f13496A = j2;
        }
    }

    /* renamed from: a0 */
    public final void m5777a0(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f9574H != z) {
            this.f9574H = z;
            if (!z) {
                for (Renderer renderer : this.f9583b) {
                    if (!m5750A(renderer) && this.f9584c.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    /* renamed from: b */
    public synchronized void mo5778b(PlayerMessage playerMessage) {
        if (!this.f9567A && this.f9591j.isAlive()) {
            this.f9590i.mo7575j(14, playerMessage).mo7577a();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        playerMessage.m5932c(false);
    }

    /* renamed from: b0 */
    public final void m5779b0(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
        this.f9607z.m5822a(1);
        if (mediaSourceListUpdateMessage.f9611c != -1) {
            this.f9578L = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.f9609a, mediaSourceListUpdateMessage.f9610b), mediaSourceListUpdateMessage.f9611c, mediaSourceListUpdateMessage.f9612d);
        }
        MediaSourceList mediaSourceList = this.f9602u;
        List<MediaSourceList.MediaSourceHolder> list = mediaSourceListUpdateMessage.f9609a;
        ShuffleOrder shuffleOrder = mediaSourceListUpdateMessage.f9610b;
        mediaSourceList.m5888i(0, mediaSourceList.f9894a.size());
        m5814v(mediaSourceList.m5880a(mediaSourceList.f9894a.size(), list, shuffleOrder), false);
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    /* renamed from: c */
    public void mo5780c() {
        this.f9590i.mo7571f(22);
    }

    /* renamed from: c0 */
    public final void m5781c0(boolean z) {
        if (z == this.f9576J) {
            return;
        }
        this.f9576J = z;
        PlaybackInfo playbackInfo = this.f9606y;
        int i2 = playbackInfo.f9933e;
        if (z || i2 == 4 || i2 == 1) {
            this.f9606y = playbackInfo.m5915c(z);
        } else {
            this.f9590i.mo7571f(2);
        }
    }

    /* renamed from: d */
    public final void m5782d(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i2) throws ExoPlaybackException {
        this.f9607z.m5822a(1);
        MediaSourceList mediaSourceList = this.f9602u;
        if (i2 == -1) {
            i2 = mediaSourceList.m5884e();
        }
        m5814v(mediaSourceList.m5880a(i2, mediaSourceListUpdateMessage.f9609a, mediaSourceListUpdateMessage.f9610b), false);
    }

    /* renamed from: d0 */
    public final void m5783d0(boolean z) throws ExoPlaybackException {
        this.f9568B = z;
        m5766M();
        if (this.f9569C) {
            MediaPeriodQueue mediaPeriodQueue = this.f9601t;
            if (mediaPeriodQueue.f9889i != mediaPeriodQueue.f9888h) {
                m5770T(true);
                m5813u(false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(MediaPeriod mediaPeriod) {
        this.f9590i.mo7575j(9, mediaPeriod).mo7577a();
    }

    /* renamed from: e0 */
    public final void m5785e0(boolean z, int i2, boolean z2, int i3) throws ExoPlaybackException {
        this.f9607z.m5822a(z2 ? 1 : 0);
        PlaybackInfoUpdate playbackInfoUpdate = this.f9607z;
        playbackInfoUpdate.f9621a = true;
        playbackInfoUpdate.f9626f = true;
        playbackInfoUpdate.f9627g = i3;
        this.f9606y = this.f9606y.m5916d(z, i2);
        this.f9570D = false;
        for (MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f9868l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder.f9870n.f14033c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.mo7298g(z);
                }
            }
        }
        if (!m5796k0()) {
            m5803o0();
            m5809r0();
            return;
        }
        int i4 = this.f9606y.f9933e;
        if (i4 == 3) {
            m5799m0();
            this.f9590i.mo7571f(2);
        } else if (i4 == 2) {
            this.f9590i.mo7571f(2);
        }
    }

    /* renamed from: f0 */
    public final void m5786f0(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.f9597p.mo5697d(playbackParameters);
        PlaybackParameters playbackParameters2 = this.f9597p.getPlaybackParameters();
        m5816x(playbackParameters2, playbackParameters2.f9949b, true, true);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    /* renamed from: g */
    public void mo5787g(MediaPeriod mediaPeriod) {
        this.f9590i.mo7575j(8, mediaPeriod).mo7577a();
    }

    /* renamed from: g0 */
    public final void m5788g0(int i2) throws ExoPlaybackException {
        this.f9572F = i2;
        MediaPeriodQueue mediaPeriodQueue = this.f9601t;
        Timeline timeline = this.f9606y.f9929a;
        mediaPeriodQueue.f9886f = i2;
        if (!mediaPeriodQueue.m5878q(timeline)) {
            m5770T(true);
        }
        m5813u(false);
    }

    /* renamed from: h */
    public final void m5789h(PlayerMessage playerMessage) throws ExoPlaybackException {
        playerMessage.m5931b();
        try {
            playerMessage.f9965a.mo5669q(playerMessage.f9969e, playerMessage.f9970f);
        } finally {
            playerMessage.m5932c(true);
        }
    }

    /* renamed from: h0 */
    public final void m5790h0(boolean z) throws ExoPlaybackException {
        this.f9573G = z;
        MediaPeriodQueue mediaPeriodQueue = this.f9601t;
        Timeline timeline = this.f9606y.f9929a;
        mediaPeriodQueue.f9887g = z;
        if (!mediaPeriodQueue.m5878q(timeline)) {
            m5770T(true);
        }
        m5813u(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        MediaPeriodHolder mediaPeriodHolder;
        try {
            switch (message.what) {
                case 0:
                    m5761H();
                    break;
                case 1:
                    m5785e0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m5793j();
                    break;
                case 3:
                    m5771U((SeekPosition) message.obj);
                    break;
                case 4:
                    m5786f0((PlaybackParameters) message.obj);
                    break;
                case 5:
                    this.f9605x = (SeekParameters) message.obj;
                    break;
                case 6:
                    m5801n0(false, true);
                    break;
                case 7:
                    m5762I();
                    return true;
                case 8:
                    m5815w((MediaPeriod) message.obj);
                    break;
                case 9:
                    m5810s((MediaPeriod) message.obj);
                    break;
                case 10:
                    m5764K();
                    break;
                case 11:
                    m5788g0(message.arg1);
                    break;
                case 12:
                    m5790h0(message.arg1 != 0);
                    break;
                case 13:
                    m5777a0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    PlayerMessage playerMessage = (PlayerMessage) message.obj;
                    Objects.requireNonNull(playerMessage);
                    m5774X(playerMessage);
                    break;
                case 15:
                    m5775Y((PlayerMessage) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    m5816x(playbackParameters, playbackParameters.f9949b, true, false);
                    break;
                case 17:
                    m5779b0((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    m5782d((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    m5760G((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    m5763J(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    m5792i0((ShuffleOrder) message.obj);
                    break;
                case 22:
                    m5759F();
                    break;
                case 23:
                    m5783d0(message.arg1 != 0);
                    break;
                case 24:
                    m5781c0(message.arg1 == 1);
                    break;
                case 25:
                    m5770T(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.f9506d == 1 && (mediaPeriodHolder = this.f9601t.f9889i) != null) {
                e = e.m5702c(mediaPeriodHolder.f9862f.f9872a);
            }
            if (e.f9512j && this.f9582P == null) {
                com.google.android.exoplayer2.util.Log.m7588e("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f9582P = e;
                HandlerWrapper handlerWrapper = this.f9590i;
                handlerWrapper.mo7569d(handlerWrapper.mo7575j(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f9582P;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f9582P;
                }
                com.google.android.exoplayer2.util.Log.m7585b("ExoPlayerImplInternal", "Playback error", e);
                m5801n0(true, false);
                this.f9606y = this.f9606y.m5917e(e);
            }
        } catch (ParserException e3) {
            int i2 = e3.f9923c;
            if (i2 == 1) {
                r4 = e3.f9922b ? 3001 : 3003;
            } else if (i2 == 4) {
                r4 = e3.f9922b ? 3002 : 3004;
            }
            m5812t(e3, r4);
        } catch (DrmSession.DrmSessionException e4) {
            m5812t(e4, e4.f10717b);
        } catch (BehindLiveWindowException e5) {
            m5812t(e5, 1002);
        } catch (DataSourceException e6) {
            m5812t(e6, e6.f14355b);
        } catch (IOException e7) {
            m5812t(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException m5701d = ExoPlaybackException.m5701d(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            com.google.android.exoplayer2.util.Log.m7585b("ExoPlayerImplInternal", "Playback error", m5701d);
            m5801n0(true, false);
            this.f9606y = this.f9606y.m5917e(m5701d);
        }
        m5758E();
        return true;
    }

    /* renamed from: i */
    public final void m5791i(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() != 0) {
            DefaultMediaClock defaultMediaClock = this.f9597p;
            if (renderer == defaultMediaClock.f9496d) {
                defaultMediaClock.f9497e = null;
                defaultMediaClock.f9496d = null;
                defaultMediaClock.f9498f = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.mo5660f();
            this.f9577K--;
        }
    }

    /* renamed from: i0 */
    public final void m5792i0(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.f9607z.m5822a(1);
        MediaSourceList mediaSourceList = this.f9602u;
        int m5884e = mediaSourceList.m5884e();
        if (shuffleOrder.getLength() != m5884e) {
            shuffleOrder = shuffleOrder.mo6915g().mo6913e(0, m5884e);
        }
        mediaSourceList.f9902i = shuffleOrder;
        m5814v(mediaSourceList.m5882c(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:354:0x0475, code lost:
    
        if (r36.f9588g.mo5692f(m5806q(), r36.f9597p.getPlaybackParameters().f9949b, r36.f9570D, r26) == false) goto L298;
     */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x04ad  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5793j() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.m5793j():void");
    }

    /* renamed from: j0 */
    public final void m5794j0(int i2) {
        PlaybackInfo playbackInfo = this.f9606y;
        if (playbackInfo.f9933e != i2) {
            this.f9606y = playbackInfo.m5919g(i2);
        }
    }

    /* renamed from: k */
    public final void m5795k() throws ExoPlaybackException {
        m5797l(new boolean[this.f9583b.length]);
    }

    /* renamed from: k0 */
    public final boolean m5796k0() {
        PlaybackInfo playbackInfo = this.f9606y;
        return playbackInfo.f9940l && playbackInfo.f9941m == 0;
    }

    /* renamed from: l */
    public final void m5797l(boolean[] zArr) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9889i;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.f9870n;
        for (int i2 = 0; i2 < this.f9583b.length; i2++) {
            if (!trackSelectorResult.m7336b(i2) && this.f9584c.remove(this.f9583b[i2])) {
                this.f9583b[i2].reset();
            }
        }
        for (int i3 = 0; i3 < this.f9583b.length; i3++) {
            if (trackSelectorResult.m7336b(i3)) {
                boolean z = zArr[i3];
                Renderer renderer = this.f9583b[i3];
                if (m5750A(renderer)) {
                    continue;
                } else {
                    MediaPeriodQueue mediaPeriodQueue = this.f9601t;
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.f9889i;
                    boolean z2 = mediaPeriodHolder2 == mediaPeriodQueue.f9888h;
                    TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder2.f9870n;
                    RendererConfiguration rendererConfiguration = trackSelectorResult2.f14032b[i3];
                    Format[] m5755m = m5755m(trackSelectorResult2.f14033c[i3]);
                    boolean z3 = m5796k0() && this.f9606y.f9933e == 3;
                    boolean z4 = !z && z3;
                    this.f9577K++;
                    this.f9584c.add(renderer);
                    renderer.mo5667n(rendererConfiguration, m5755m, mediaPeriodHolder2.f9859c[i3], this.f9579M, z4, z2, mediaPeriodHolder2.m5854e(), mediaPeriodHolder2.f9871o);
                    renderer.mo5669q(11, new Renderer.WakeupListener() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
                        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
                        /* renamed from: a */
                        public void mo5819a() {
                            ExoPlayerImplInternal.this.f9590i.mo7571f(2);
                        }

                        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
                        /* renamed from: b */
                        public void mo5820b(long j2) {
                            if (j2 >= 2000) {
                                ExoPlayerImplInternal.this.f9575I = true;
                            }
                        }
                    });
                    DefaultMediaClock defaultMediaClock = this.f9597p;
                    Objects.requireNonNull(defaultMediaClock);
                    MediaClock mo5675w = renderer.mo5675w();
                    if (mo5675w != null && mo5675w != (mediaClock = defaultMediaClock.f9497e)) {
                        if (mediaClock != null) {
                            throw ExoPlaybackException.m5701d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        defaultMediaClock.f9497e = mo5675w;
                        defaultMediaClock.f9496d = renderer;
                        mo5675w.mo5697d(defaultMediaClock.f9494b.f14724f);
                    }
                    if (z3) {
                        renderer.start();
                    }
                }
            }
        }
        mediaPeriodHolder.f9863g = true;
    }

    /* renamed from: l0 */
    public final boolean m5798l0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.m6828a() || timeline.m5991s()) {
            return false;
        }
        timeline.m5990p(timeline.mo5613j(mediaPeriodId.f12356a, this.f9594m).f10051d, this.f9593l);
        if (!this.f9593l.m6004d()) {
            return false;
        }
        Timeline.Window window = this.f9593l;
        return window.f10072j && window.f10069g != -9223372036854775807L;
    }

    /* renamed from: m0 */
    public final void m5799m0() throws ExoPlaybackException {
        this.f9570D = false;
        DefaultMediaClock defaultMediaClock = this.f9597p;
        defaultMediaClock.f9499g = true;
        defaultMediaClock.f9494b.m7682b();
        for (Renderer renderer : this.f9583b) {
            if (m5750A(renderer)) {
                renderer.start();
            }
        }
    }

    /* renamed from: n */
    public final long m5800n(Timeline timeline, Object obj, long j2) {
        timeline.m5990p(timeline.mo5613j(obj, this.f9594m).f10051d, this.f9593l);
        Timeline.Window window = this.f9593l;
        if (window.f10069g != -9223372036854775807L && window.m6004d()) {
            Timeline.Window window2 = this.f9593l;
            if (window2.f10072j) {
                return Util.m7717P(Util.m7757z(window2.f10070h) - this.f9593l.f10069g) - (j2 + this.f9594m.f10053f);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: n0 */
    public final void m5801n0(boolean z, boolean z2) {
        m5765L(z || !this.f9574H, false, true, false);
        this.f9607z.m5822a(z2 ? 1 : 0);
        this.f9588g.mo5695i();
        m5794j0(1);
    }

    /* renamed from: o */
    public final long m5802o() {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9889i;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long j2 = mediaPeriodHolder.f9871o;
        if (!mediaPeriodHolder.f9860d) {
            return j2;
        }
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.f9583b;
            if (i2 >= rendererArr.length) {
                return j2;
            }
            if (m5750A(rendererArr[i2]) && this.f9583b[i2].mo5670r() == mediaPeriodHolder.f9859c[i2]) {
                long mo5672t = this.f9583b[i2].mo5672t();
                if (mo5672t == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j2 = Math.max(mo5672t, j2);
            }
            i2++;
        }
    }

    /* renamed from: o0 */
    public final void m5803o0() throws ExoPlaybackException {
        DefaultMediaClock defaultMediaClock = this.f9597p;
        defaultMediaClock.f9499g = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.f9494b;
        if (standaloneMediaClock.f14721c) {
            standaloneMediaClock.m7681a(standaloneMediaClock.mo5698l());
            standaloneMediaClock.f14721c = false;
        }
        for (Renderer renderer : this.f9583b) {
            if (m5750A(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f9590i.mo7575j(16, playbackParameters).mo7577a();
    }

    /* renamed from: p */
    public final Pair<MediaSource.MediaPeriodId, Long> m5804p(Timeline timeline) {
        if (timeline.m5991s()) {
            MediaSource.MediaPeriodId mediaPeriodId = PlaybackInfo.f9928t;
            return Pair.create(PlaybackInfo.f9928t, 0L);
        }
        Pair<Object, Long> m5988l = timeline.m5988l(this.f9593l, this.f9594m, timeline.mo5608c(this.f9573G), -9223372036854775807L);
        MediaSource.MediaPeriodId m5877o = this.f9601t.m5877o(timeline, m5988l.first, 0L);
        long longValue = ((Long) m5988l.second).longValue();
        if (m5877o.m6828a()) {
            timeline.mo5613j(m5877o.f12356a, this.f9594m);
            longValue = m5877o.f12358c == this.f9594m.m5996e(m5877o.f12357b) ? this.f9594m.f10055h.f12604d : 0L;
        }
        return Pair.create(m5877o, Long.valueOf(longValue));
    }

    /* renamed from: p0 */
    public final void m5805p0() {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
        boolean z = this.f9571E || (mediaPeriodHolder != null && mediaPeriodHolder.f9857a.isLoading());
        PlaybackInfo playbackInfo = this.f9606y;
        if (z != playbackInfo.f9935g) {
            this.f9606y = new PlaybackInfo(playbackInfo.f9929a, playbackInfo.f9930b, playbackInfo.f9931c, playbackInfo.f9932d, playbackInfo.f9933e, playbackInfo.f9934f, z, playbackInfo.f9936h, playbackInfo.f9937i, playbackInfo.f9938j, playbackInfo.f9939k, playbackInfo.f9940l, playbackInfo.f9941m, playbackInfo.f9942n, playbackInfo.f9945q, playbackInfo.f9946r, playbackInfo.f9947s, playbackInfo.f9943o, playbackInfo.f9944p);
        }
    }

    /* renamed from: q */
    public final long m5806q() {
        return m5808r(this.f9606y.f9945q);
    }

    /* renamed from: q0 */
    public final void m5807q0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j2) {
        if (timeline.m5991s() || !m5798l0(timeline, mediaPeriodId)) {
            float f2 = this.f9597p.getPlaybackParameters().f9949b;
            PlaybackParameters playbackParameters = this.f9606y.f9942n;
            if (f2 != playbackParameters.f9949b) {
                this.f9597p.mo5697d(playbackParameters);
                return;
            }
            return;
        }
        timeline.m5990p(timeline.mo5613j(mediaPeriodId.f12356a, this.f9594m).f10051d, this.f9593l);
        LivePlaybackSpeedControl livePlaybackSpeedControl = this.f9603v;
        MediaItem.LiveConfiguration liveConfiguration = this.f9593l.f10074l;
        int i2 = Util.f14736a;
        livePlaybackSpeedControl.mo5680a(liveConfiguration);
        if (j2 != -9223372036854775807L) {
            this.f9603v.mo5684e(m5800n(timeline, mediaPeriodId.f12356a, j2));
            return;
        }
        if (Util.m7728a(timeline2.m5991s() ? null : timeline2.m5990p(timeline2.mo5613j(mediaPeriodId2.f12356a, this.f9594m).f10051d, this.f9593l).f10064b, this.f9593l.f10064b)) {
            return;
        }
        this.f9603v.mo5684e(-9223372036854775807L);
    }

    /* renamed from: r */
    public final long m5808r(long j2) {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.f9579M - mediaPeriodHolder.f9871o));
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x015a, code lost:
    
        r7 = null;
     */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5809r0() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.m5809r0():void");
    }

    /* renamed from: s */
    public final void m5810s(MediaPeriod mediaPeriod) {
        MediaPeriodQueue mediaPeriodQueue = this.f9601t;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f9890j;
        if (mediaPeriodHolder != null && mediaPeriodHolder.f9857a == mediaPeriod) {
            mediaPeriodQueue.m5875m(this.f9579M);
            m5757D();
        }
    }

    /* renamed from: s0 */
    public final synchronized void m5811s0(Supplier<Boolean> supplier, long j2) {
        long mo7527a = this.f9599r.mo7527a() + j2;
        boolean z = false;
        while (!((Boolean) ((C1069o) supplier).get()).booleanValue() && j2 > 0) {
            try {
                this.f9599r.mo7530d();
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
            j2 = mo7527a - this.f9599r.mo7527a();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: t */
    public final void m5812t(IOException iOException, int i2) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i2);
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        if (mediaPeriodHolder != null) {
            exoPlaybackException = exoPlaybackException.m5702c(mediaPeriodHolder.f9862f.f9872a);
        }
        com.google.android.exoplayer2.util.Log.m7585b("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        m5801n0(false, false);
        this.f9606y = this.f9606y.m5917e(exoPlaybackException);
    }

    /* renamed from: u */
    public final void m5813u(boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? this.f9606y.f9930b : mediaPeriodHolder.f9862f.f9872a;
        boolean z2 = !this.f9606y.f9939k.equals(mediaPeriodId);
        if (z2) {
            this.f9606y = this.f9606y.m5913a(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.f9606y;
        playbackInfo.f9945q = mediaPeriodHolder == null ? playbackInfo.f9947s : mediaPeriodHolder.m5853d();
        this.f9606y.f9946r = m5806q();
        if ((z2 || z) && mediaPeriodHolder != null && mediaPeriodHolder.f9860d) {
            this.f9588g.mo5690d(this.f9583b, mediaPeriodHolder.f9869m, mediaPeriodHolder.f9870n.f14033c);
        }
    }

    /* renamed from: v */
    public final void m5814v(Timeline timeline, boolean z) throws ExoPlaybackException {
        Object obj;
        MediaSource.MediaPeriodId mediaPeriodId;
        int i2;
        Object obj2;
        long j2;
        long j3;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        long j4;
        long j5;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChange;
        long j6;
        int i6;
        long longValue;
        Object obj3;
        boolean z7;
        int i7;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        long j7;
        SeekPosition seekPosition;
        boolean z11;
        boolean z12;
        boolean z13;
        PlaybackInfo playbackInfo = this.f9606y;
        SeekPosition seekPosition2 = this.f9578L;
        MediaPeriodQueue mediaPeriodQueue = this.f9601t;
        int i9 = this.f9572F;
        boolean z14 = this.f9573G;
        Timeline.Window window = this.f9593l;
        Timeline.Period period = this.f9594m;
        if (timeline.m5991s()) {
            MediaSource.MediaPeriodId mediaPeriodId2 = PlaybackInfo.f9928t;
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(PlaybackInfo.f9928t, 0L, -9223372036854775807L, false, true, false);
        } else {
            MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo.f9930b;
            Object obj4 = mediaPeriodId3.f12356a;
            boolean m5751C = m5751C(playbackInfo, period);
            long j8 = (playbackInfo.f9930b.m6828a() || m5751C) ? playbackInfo.f9931c : playbackInfo.f9947s;
            if (seekPosition2 != null) {
                Object obj5 = obj4;
                Pair<Object, Long> m5753Q = m5753Q(timeline, seekPosition2, true, i9, z14, window, period);
                if (m5753Q == null) {
                    i8 = timeline.mo5608c(z14);
                    j7 = j8;
                    z10 = false;
                    z9 = false;
                    z8 = true;
                } else {
                    if (seekPosition2.f9636c == -9223372036854775807L) {
                        i7 = timeline.mo5613j(m5753Q.first, period).f10051d;
                        longValue = j8;
                        obj3 = obj5;
                        z7 = false;
                    } else {
                        Object obj6 = m5753Q.first;
                        longValue = ((Long) m5753Q.second).longValue();
                        obj3 = obj6;
                        z7 = true;
                        i7 = -1;
                    }
                    obj5 = obj3;
                    i8 = i7;
                    z8 = false;
                    long j9 = longValue;
                    z9 = playbackInfo.f9933e == 4;
                    z10 = z7;
                    j7 = j9;
                }
                z4 = z10;
                z2 = z9;
                j3 = j7;
                z3 = z8;
                mediaPeriodId = mediaPeriodId3;
                i4 = -1;
                i3 = i8;
                obj2 = obj5;
            } else {
                if (playbackInfo.f9929a.m5991s()) {
                    i2 = timeline.mo5608c(z14);
                    obj = obj4;
                } else if (timeline.mo5609d(obj4) == -1) {
                    obj = obj4;
                    Object m5754R = m5754R(window, period, i9, z14, obj4, playbackInfo.f9929a, timeline);
                    if (m5754R == null) {
                        i5 = timeline.mo5608c(z14);
                        z5 = true;
                    } else {
                        i5 = timeline.mo5613j(m5754R, period).f10051d;
                        z5 = false;
                    }
                    z6 = z5;
                    mediaPeriodId = mediaPeriodId3;
                    i3 = i5;
                    z3 = z6;
                    obj2 = obj;
                    j3 = j8;
                    i4 = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    obj = obj4;
                    if (j8 == -9223372036854775807L) {
                        i2 = timeline.mo5613j(obj, period).f10051d;
                    } else if (m5751C) {
                        mediaPeriodId = mediaPeriodId3;
                        playbackInfo.f9929a.mo5613j(mediaPeriodId.f12356a, period);
                        if (playbackInfo.f9929a.m5990p(period.f10051d, window).f10078p == playbackInfo.f9929a.mo5609d(mediaPeriodId.f12356a)) {
                            Pair<Object, Long> m5988l = timeline.m5988l(window, period, timeline.mo5613j(obj, period).f10051d, j8 + period.f10053f);
                            Object obj7 = m5988l.first;
                            long longValue2 = ((Long) m5988l.second).longValue();
                            obj2 = obj7;
                            j2 = longValue2;
                        } else {
                            obj2 = obj;
                            j2 = j8;
                        }
                        j3 = j2;
                        i3 = -1;
                        i4 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        mediaPeriodId = mediaPeriodId3;
                        i2 = -1;
                        i5 = i2;
                        z6 = false;
                        i3 = i5;
                        z3 = z6;
                        obj2 = obj;
                        j3 = j8;
                        i4 = -1;
                        z2 = false;
                        z4 = false;
                    }
                }
                mediaPeriodId = mediaPeriodId3;
                i5 = i2;
                z6 = false;
                i3 = i5;
                z3 = z6;
                obj2 = obj;
                j3 = j8;
                i4 = -1;
                z2 = false;
                z4 = false;
            }
            if (i3 != i4) {
                Pair<Object, Long> m5988l2 = timeline.m5988l(window, period, i3, -9223372036854775807L);
                Object obj8 = m5988l2.first;
                long longValue3 = ((Long) m5988l2.second).longValue();
                obj2 = obj8;
                j3 = longValue3;
                j4 = -9223372036854775807L;
            } else {
                j4 = j3;
            }
            MediaSource.MediaPeriodId m5877o = mediaPeriodQueue.m5877o(timeline, obj2, j3);
            boolean z15 = m5877o.f12360e == -1 || ((i6 = mediaPeriodId.f12360e) != -1 && m5877o.f12357b >= i6);
            boolean equals = mediaPeriodId.f12356a.equals(obj2);
            boolean z16 = equals && !mediaPeriodId.m6828a() && !m5877o.m6828a() && z15;
            timeline.mo5613j(obj2, period);
            boolean z17 = equals && !m5751C && j8 == j4 && ((m5877o.m6828a() && period.m5998g(m5877o.f12357b)) || (mediaPeriodId.m6828a() && period.m5998g(mediaPeriodId.f12357b)));
            if (z16 || z17) {
                m5877o = mediaPeriodId;
            }
            if (m5877o.m6828a()) {
                if (m5877o.equals(mediaPeriodId)) {
                    j6 = playbackInfo.f9947s;
                } else {
                    timeline.mo5613j(m5877o.f12356a, period);
                    j6 = m5877o.f12358c == period.m5996e(m5877o.f12357b) ? period.f10055h.f12604d : 0L;
                }
                j5 = j6;
            } else {
                j5 = j3;
            }
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(m5877o, j5, j4, z2, z3, z4);
        }
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChange2 = positionUpdateForPlaylistChange;
        MediaSource.MediaPeriodId mediaPeriodId4 = positionUpdateForPlaylistChange2.f9628a;
        long j10 = positionUpdateForPlaylistChange2.f9630c;
        boolean z18 = positionUpdateForPlaylistChange2.f9631d;
        long j11 = positionUpdateForPlaylistChange2.f9629b;
        boolean z19 = (this.f9606y.f9930b.equals(mediaPeriodId4) && j11 == this.f9606y.f9947s) ? false : true;
        try {
            if (positionUpdateForPlaylistChange2.f9632e) {
                if (this.f9606y.f9933e != 1) {
                    m5794j0(4);
                }
                m5765L(false, false, false, true);
            }
            try {
                if (z19) {
                    z12 = false;
                    z13 = true;
                    if (!timeline.m5991s()) {
                        for (MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f9868l) {
                            if (mediaPeriodHolder.f9862f.f9872a.equals(mediaPeriodId4)) {
                                mediaPeriodHolder.f9862f = this.f9601t.m5870h(timeline, mediaPeriodHolder.f9862f);
                                mediaPeriodHolder.m5859j();
                            }
                        }
                        j11 = m5772V(mediaPeriodId4, j11, z18);
                    }
                } else {
                    try {
                        z12 = false;
                        z13 = true;
                        if (!this.f9601t.m5879r(timeline, this.f9579M, m5802o())) {
                            m5770T(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z11 = true;
                        seekPosition = null;
                        PlaybackInfo playbackInfo2 = this.f9606y;
                        SeekPosition seekPosition3 = seekPosition;
                        m5807q0(timeline, mediaPeriodId4, playbackInfo2.f9929a, playbackInfo2.f9930b, positionUpdateForPlaylistChange2.f9633f ? j11 : -9223372036854775807L);
                        if (z19 || j10 != this.f9606y.f9931c) {
                            PlaybackInfo playbackInfo3 = this.f9606y;
                            Object obj9 = playbackInfo3.f9930b.f12356a;
                            Timeline timeline2 = playbackInfo3.f9929a;
                            if (!z19 || !z || timeline2.m5991s() || timeline2.mo5613j(obj9, this.f9594m).f10054g) {
                                z11 = false;
                            }
                            this.f9606y = m5817y(mediaPeriodId4, j11, j10, this.f9606y.f9932d, z11, timeline.mo5609d(obj9) == -1 ? 4 : 3);
                        }
                        m5766M();
                        m5768P(timeline, this.f9606y.f9929a);
                        this.f9606y = this.f9606y.m5920h(timeline);
                        if (!timeline.m5991s()) {
                            this.f9578L = seekPosition3;
                        }
                        m5813u(false);
                        throw th;
                    }
                }
                PlaybackInfo playbackInfo4 = this.f9606y;
                m5807q0(timeline, mediaPeriodId4, playbackInfo4.f9929a, playbackInfo4.f9930b, positionUpdateForPlaylistChange2.f9633f ? j11 : -9223372036854775807L);
                if (z19 || j10 != this.f9606y.f9931c) {
                    PlaybackInfo playbackInfo5 = this.f9606y;
                    Object obj10 = playbackInfo5.f9930b.f12356a;
                    Timeline timeline3 = playbackInfo5.f9929a;
                    if (!z19 || !z || timeline3.m5991s() || timeline3.mo5613j(obj10, this.f9594m).f10054g) {
                        z13 = false;
                    }
                    this.f9606y = m5817y(mediaPeriodId4, j11, j10, this.f9606y.f9932d, z13, timeline.mo5609d(obj10) == -1 ? 4 : 3);
                }
                m5766M();
                m5768P(timeline, this.f9606y.f9929a);
                this.f9606y = this.f9606y.m5920h(timeline);
                if (!timeline.m5991s()) {
                    this.f9578L = null;
                }
                m5813u(z12);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            seekPosition = null;
            z11 = true;
        }
    }

    /* renamed from: w */
    public final void m5815w(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
        if (mediaPeriodHolder != null && mediaPeriodHolder.f9857a == mediaPeriod) {
            float f2 = this.f9597p.getPlaybackParameters().f9949b;
            Timeline timeline = this.f9606y.f9929a;
            mediaPeriodHolder.f9860d = true;
            mediaPeriodHolder.f9869m = mediaPeriodHolder.f9857a.getTrackGroups();
            TrackSelectorResult m5858i = mediaPeriodHolder.m5858i(f2, timeline);
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f9862f;
            long j2 = mediaPeriodInfo.f9873b;
            long j3 = mediaPeriodInfo.f9876e;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                j2 = Math.max(0L, j3 - 1);
            }
            long m5850a = mediaPeriodHolder.m5850a(m5858i, j2, false, new boolean[mediaPeriodHolder.f9865i.length]);
            long j4 = mediaPeriodHolder.f9871o;
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f9862f;
            mediaPeriodHolder.f9871o = (mediaPeriodInfo2.f9873b - m5850a) + j4;
            mediaPeriodHolder.f9862f = mediaPeriodInfo2.m5861b(m5850a);
            this.f9588g.mo5690d(this.f9583b, mediaPeriodHolder.f9869m, mediaPeriodHolder.f9870n.f14033c);
            if (mediaPeriodHolder == this.f9601t.f9888h) {
                m5767N(mediaPeriodHolder.f9862f.f9873b);
                m5795k();
                PlaybackInfo playbackInfo = this.f9606y;
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f9930b;
                long j5 = mediaPeriodHolder.f9862f.f9873b;
                this.f9606y = m5817y(mediaPeriodId, j5, playbackInfo.f9931c, j5, false, 5);
            }
            m5757D();
        }
    }

    /* renamed from: x */
    public final void m5816x(PlaybackParameters playbackParameters, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        int i2;
        if (z) {
            if (z2) {
                this.f9607z.m5822a(1);
            }
            this.f9606y = this.f9606y.m5918f(playbackParameters);
        }
        float f3 = playbackParameters.f9949b;
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
        while (true) {
            i2 = 0;
            if (mediaPeriodHolder == null) {
                break;
            }
            ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.f9870n.f14033c;
            int length = exoTrackSelectionArr.length;
            while (i2 < length) {
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                if (exoTrackSelection != null) {
                    exoTrackSelection.mo7291q(f3);
                }
                i2++;
            }
            mediaPeriodHolder = mediaPeriodHolder.f9868l;
        }
        Renderer[] rendererArr = this.f9583b;
        int length2 = rendererArr.length;
        while (i2 < length2) {
            Renderer renderer = rendererArr[i2];
            if (renderer != null) {
                renderer.mo5666m(f2, playbackParameters.f9949b);
            }
            i2++;
        }
    }

    @CheckResult
    /* renamed from: y */
    public final PlaybackInfo m5817y(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, boolean z, int i2) {
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        List<Metadata> list;
        this.f9581O = (!this.f9581O && j2 == this.f9606y.f9947s && mediaPeriodId.equals(this.f9606y.f9930b)) ? false : true;
        m5766M();
        PlaybackInfo playbackInfo = this.f9606y;
        TrackGroupArray trackGroupArray2 = playbackInfo.f9936h;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.f9937i;
        List<Metadata> list2 = playbackInfo.f9938j;
        if (this.f9602u.f9903j) {
            MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9888h;
            TrackGroupArray trackGroupArray3 = mediaPeriodHolder == null ? TrackGroupArray.f12592e : mediaPeriodHolder.f9869m;
            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder == null ? this.f9587f : mediaPeriodHolder.f9870n;
            ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult3.f14033c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            boolean z2 = false;
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Metadata metadata = exoTrackSelection.mo7299h(0).f9657k;
                    if (metadata == null) {
                        builder.m11640d(new Metadata(new Metadata.Entry[0]));
                    } else {
                        builder.m11640d(metadata);
                        z2 = true;
                    }
                }
            }
            ImmutableList m11641e = z2 ? builder.m11641e() : ImmutableList.m11627D();
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f9862f;
                if (mediaPeriodInfo.f9874c != j3) {
                    mediaPeriodHolder.f9862f = mediaPeriodInfo.m5860a(j3);
                }
            }
            list = m11641e;
            trackGroupArray = trackGroupArray3;
            trackSelectorResult = trackSelectorResult3;
        } else if (mediaPeriodId.equals(playbackInfo.f9930b)) {
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
            list = list2;
        } else {
            trackGroupArray = TrackGroupArray.f12592e;
            trackSelectorResult = this.f9587f;
            list = ImmutableList.m11627D();
        }
        if (z) {
            PlaybackInfoUpdate playbackInfoUpdate = this.f9607z;
            if (!playbackInfoUpdate.f9624d || playbackInfoUpdate.f9625e == 5) {
                playbackInfoUpdate.f9621a = true;
                playbackInfoUpdate.f9624d = true;
                playbackInfoUpdate.f9625e = i2;
            } else {
                Assertions.m7513a(i2 == 5);
            }
        }
        return this.f9606y.m5914b(mediaPeriodId, j2, j3, j4, m5806q(), trackGroupArray, trackSelectorResult, list);
    }

    /* renamed from: z */
    public final boolean m5818z() {
        MediaPeriodHolder mediaPeriodHolder = this.f9601t.f9890j;
        if (mediaPeriodHolder == null) {
            return false;
        }
        return (!mediaPeriodHolder.f9860d ? 0L : mediaPeriodHolder.f9857a.getNextLoadPositionUs()) != Long.MIN_VALUE;
    }
}
