package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import p000a.C0000a;

/* loaded from: classes.dex */
final class ExoPlayerImpl extends BasePlayer {

    /* renamed from: H */
    public static final /* synthetic */ int f9532H = 0;

    /* renamed from: A */
    public ShuffleOrder f9533A;

    /* renamed from: B */
    public Player.Commands f9534B;

    /* renamed from: C */
    public MediaMetadata f9535C;

    /* renamed from: D */
    public MediaMetadata f9536D;

    /* renamed from: E */
    public PlaybackInfo f9537E;

    /* renamed from: F */
    public int f9538F;

    /* renamed from: G */
    public long f9539G;

    /* renamed from: b */
    public final TrackSelectorResult f9540b;

    /* renamed from: c */
    public final Player.Commands f9541c;

    /* renamed from: d */
    public final Renderer[] f9542d;

    /* renamed from: e */
    public final TrackSelector f9543e;

    /* renamed from: f */
    public final HandlerWrapper f9544f;

    /* renamed from: g */
    public final ExoPlayerImplInternal.PlaybackInfoUpdateListener f9545g;

    /* renamed from: h */
    public final ExoPlayerImplInternal f9546h;

    /* renamed from: i */
    public final ListenerSet<Player.EventListener> f9547i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> f9548j;

    /* renamed from: k */
    public final Timeline.Period f9549k;

    /* renamed from: l */
    public final List<MediaSourceHolderSnapshot> f9550l;

    /* renamed from: m */
    public final boolean f9551m;

    /* renamed from: n */
    public final MediaSourceFactory f9552n;

    /* renamed from: o */
    @Nullable
    public final AnalyticsCollector f9553o;

    /* renamed from: p */
    public final Looper f9554p;

    /* renamed from: q */
    public final BandwidthMeter f9555q;

    /* renamed from: r */
    public final long f9556r;

    /* renamed from: s */
    public final long f9557s;

    /* renamed from: t */
    public final Clock f9558t;

    /* renamed from: u */
    public int f9559u;

    /* renamed from: v */
    public boolean f9560v;

    /* renamed from: w */
    public int f9561w;

    /* renamed from: x */
    public int f9562x;

    /* renamed from: y */
    public boolean f9563y;

    /* renamed from: z */
    public int f9564z;

    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {

        /* renamed from: a */
        public final Object f9565a;

        /* renamed from: b */
        public Timeline f9566b;

        public MediaSourceHolderSnapshot(Object obj, Timeline timeline) {
            this.f9565a = obj;
            this.f9566b = timeline;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        /* renamed from: a */
        public Object mo5748a() {
            return this.f9565a;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        /* renamed from: b */
        public Timeline mo5749b() {
            return this.f9566b;
        }
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.exoplayer");
    }

    @SuppressLint
    public ExoPlayerImpl(Renderer[] rendererArr, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, @Nullable AnalyticsCollector analyticsCollector, boolean z, SeekParameters seekParameters, long j2, long j3, LivePlaybackSpeedControl livePlaybackSpeedControl, long j4, boolean z2, Clock clock, Looper looper, @Nullable Player player, Player.Commands commands) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = Util.f14740e;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str, C0576a.m4106e(hexString, 30)), "Init ", hexString, " [", "ExoPlayerLib/2.16.1");
        m4122u.append("] [");
        m4122u.append(str);
        m4122u.append("]");
        Log.i("ExoPlayerImpl", m4122u.toString());
        int i2 = 1;
        Assertions.m7516d(rendererArr.length > 0);
        this.f9542d = rendererArr;
        Objects.requireNonNull(trackSelector);
        this.f9543e = trackSelector;
        this.f9552n = mediaSourceFactory;
        this.f9555q = bandwidthMeter;
        this.f9553o = analyticsCollector;
        this.f9551m = z;
        this.f9556r = j2;
        this.f9557s = j3;
        this.f9554p = looper;
        this.f9558t = clock;
        this.f9559u = 0;
        this.f9547i = new ListenerSet<>(new CopyOnWriteArraySet(), looper, clock, new C1068n(player, i2));
        this.f9548j = new CopyOnWriteArraySet<>();
        this.f9550l = new ArrayList();
        this.f9533A = new ShuffleOrder.DefaultShuffleOrder(0, new Random());
        this.f9540b = new TrackSelectorResult(new RendererConfiguration[rendererArr.length], new ExoTrackSelection[rendererArr.length], TracksInfo.f10081c, null);
        this.f9549k = new Timeline.Period();
        Player.Commands.Builder builder = new Player.Commands.Builder();
        int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30};
        FlagSet.Builder builder2 = builder.f9954a;
        Objects.requireNonNull(builder2);
        for (int i3 = 0; i3 < 12; i3++) {
            builder2.m7552a(iArr[i3]);
        }
        builder.m5925c(29, trackSelector instanceof DefaultTrackSelector);
        builder.m5924b(commands);
        Player.Commands m5926d = builder.m5926d();
        this.f9541c = m5926d;
        Player.Commands.Builder builder3 = new Player.Commands.Builder();
        builder3.m5924b(m5926d);
        builder3.m5923a(4);
        builder3.m5923a(10);
        this.f9534B = builder3.m5926d();
        MediaMetadata mediaMetadata = MediaMetadata.f9790I;
        this.f9535C = mediaMetadata;
        this.f9536D = mediaMetadata;
        this.f9538F = -1;
        this.f9544f = clock.mo7529c(looper, null);
        C1027m c1027m = new C1027m(this, i2);
        this.f9545g = c1027m;
        this.f9537E = PlaybackInfo.m5912i(this.f9540b);
        if (analyticsCollector != null) {
            analyticsCollector.m6017O(player, looper);
            this.f9547i.m7579b(analyticsCollector);
            bandwidthMeter.mo6745h(new Handler(looper), analyticsCollector);
        }
        this.f9546h = new ExoPlayerImplInternal(rendererArr, trackSelector, this.f9540b, loadControl, bandwidthMeter, this.f9559u, this.f9560v, analyticsCollector, seekParameters, livePlaybackSpeedControl, j4, z2, looper, clock, c1027m);
    }

    /* renamed from: Z */
    public static long m5707Z(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.f9929a.mo5613j(playbackInfo.f9930b.f12356a, period);
        long j2 = playbackInfo.f9931c;
        return j2 == -9223372036854775807L ? playbackInfo.f9929a.m5990p(period.f10051d, window).f10076n : period.f10053f + j2;
    }

    /* renamed from: a0 */
    public static boolean m5708a0(PlaybackInfo playbackInfo) {
        return playbackInfo.f9933e == 3 && playbackInfo.f9940l && playbackInfo.f9941m == 0;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public void mo5709B(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public TracksInfo mo5710C() {
        return this.f9537E.f9937i.f14034d;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public Looper mo5711D() {
        return this.f9554p;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public boolean mo5712E() {
        return this.f9560v;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public long mo5713F() {
        if (this.f9537E.f9929a.m5991s()) {
            return this.f9539G;
        }
        PlaybackInfo playbackInfo = this.f9537E;
        if (playbackInfo.f9939k.f12359d != playbackInfo.f9930b.f12359d) {
            return playbackInfo.f9929a.m5990p(getCurrentMediaItemIndex(), this.f9442a).m6003c();
        }
        long j2 = playbackInfo.f9945q;
        if (this.f9537E.f9939k.m6828a()) {
            PlaybackInfo playbackInfo2 = this.f9537E;
            Timeline.Period mo5613j = playbackInfo2.f9929a.mo5613j(playbackInfo2.f9939k.f12356a, this.f9549k);
            long m5995d = mo5613j.m5995d(this.f9537E.f9939k.f12357b);
            j2 = m5995d == Long.MIN_VALUE ? mo5613j.f10052e : m5995d;
        }
        PlaybackInfo playbackInfo3 = this.f9537E;
        return Util.m7735d0(m5725c0(playbackInfo3.f9929a, playbackInfo3.f9939k, j2));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: J */
    public MediaMetadata mo5714J() {
        return this.f9535C;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public long mo5715K() {
        return this.f9556r;
    }

    /* renamed from: R */
    public final List<MediaSourceList.MediaSourceHolder> m5716R(int i2, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i3), this.f9551m);
            arrayList.add(mediaSourceHolder);
            this.f9550l.add(i3 + i2, new MediaSourceHolderSnapshot(mediaSourceHolder.f9913b, mediaSourceHolder.f9912a.f12336o));
        }
        this.f9533A = this.f9533A.mo6913e(i2, arrayList.size());
        return arrayList;
    }

    /* renamed from: S */
    public final MediaMetadata m5717S() {
        MediaItem mo5645j = mo5645j();
        if (mo5645j == null) {
            return this.f9536D;
        }
        MediaMetadata.Builder m5847b = this.f9536D.m5847b();
        MediaMetadata mediaMetadata = mo5645j.f9716e;
        if (mediaMetadata != null) {
            CharSequence charSequence = mediaMetadata.f9800b;
            if (charSequence != null) {
                m5847b.f9831a = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.f9801c;
            if (charSequence2 != null) {
                m5847b.f9832b = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.f9802d;
            if (charSequence3 != null) {
                m5847b.f9833c = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.f9803e;
            if (charSequence4 != null) {
                m5847b.f9834d = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.f9804f;
            if (charSequence5 != null) {
                m5847b.f9835e = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata.f9805g;
            if (charSequence6 != null) {
                m5847b.f9836f = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.f9806h;
            if (charSequence7 != null) {
                m5847b.f9837g = charSequence7;
            }
            Uri uri = mediaMetadata.f9807i;
            if (uri != null) {
                m5847b.f9838h = uri;
            }
            Rating rating = mediaMetadata.f9808j;
            if (rating != null) {
                m5847b.f9839i = rating;
            }
            Rating rating2 = mediaMetadata.f9809k;
            if (rating2 != null) {
                m5847b.f9840j = rating2;
            }
            byte[] bArr = mediaMetadata.f9810l;
            if (bArr != null) {
                Integer num = mediaMetadata.f9811m;
                m5847b.f9841k = (byte[]) bArr.clone();
                m5847b.f9842l = num;
            }
            Uri uri2 = mediaMetadata.f9812n;
            if (uri2 != null) {
                m5847b.f9843m = uri2;
            }
            Integer num2 = mediaMetadata.f9813o;
            if (num2 != null) {
                m5847b.f9844n = num2;
            }
            Integer num3 = mediaMetadata.f9814p;
            if (num3 != null) {
                m5847b.f9845o = num3;
            }
            Integer num4 = mediaMetadata.f9815q;
            if (num4 != null) {
                m5847b.f9846p = num4;
            }
            Boolean bool = mediaMetadata.f9816r;
            if (bool != null) {
                m5847b.f9847q = bool;
            }
            Integer num5 = mediaMetadata.f9817s;
            if (num5 != null) {
                m5847b.f9848r = num5;
            }
            Integer num6 = mediaMetadata.f9818t;
            if (num6 != null) {
                m5847b.f9848r = num6;
            }
            Integer num7 = mediaMetadata.f9819u;
            if (num7 != null) {
                m5847b.f9849s = num7;
            }
            Integer num8 = mediaMetadata.f9820v;
            if (num8 != null) {
                m5847b.f9850t = num8;
            }
            Integer num9 = mediaMetadata.f9821w;
            if (num9 != null) {
                m5847b.f9851u = num9;
            }
            Integer num10 = mediaMetadata.f9822x;
            if (num10 != null) {
                m5847b.f9852v = num10;
            }
            Integer num11 = mediaMetadata.f9823y;
            if (num11 != null) {
                m5847b.f9853w = num11;
            }
            CharSequence charSequence8 = mediaMetadata.f9824z;
            if (charSequence8 != null) {
                m5847b.f9854x = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata.f9792A;
            if (charSequence9 != null) {
                m5847b.f9855y = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.f9793B;
            if (charSequence10 != null) {
                m5847b.f9856z = charSequence10;
            }
            Integer num12 = mediaMetadata.f9794C;
            if (num12 != null) {
                m5847b.f9825A = num12;
            }
            Integer num13 = mediaMetadata.f9795D;
            if (num13 != null) {
                m5847b.f9826B = num13;
            }
            CharSequence charSequence11 = mediaMetadata.f9796E;
            if (charSequence11 != null) {
                m5847b.f9827C = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata.f9797F;
            if (charSequence12 != null) {
                m5847b.f9828D = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata.f9798G;
            if (charSequence13 != null) {
                m5847b.f9829E = charSequence13;
            }
            Bundle bundle = mediaMetadata.f9799H;
            if (bundle != null) {
                m5847b.f9830F = bundle;
            }
        }
        return m5847b.m5848a();
    }

    /* renamed from: T */
    public final Timeline m5718T() {
        return new PlaylistTimeline(this.f9550l, this.f9533A);
    }

    /* renamed from: U */
    public PlayerMessage m5719U(PlayerMessage.Target target) {
        return new PlayerMessage(this.f9546h, target, this.f9537E.f9929a, getCurrentMediaItemIndex(), this.f9558t, this.f9546h.f9592k);
    }

    /* renamed from: V */
    public final long m5720V(PlaybackInfo playbackInfo) {
        return playbackInfo.f9929a.m5991s() ? Util.m7717P(this.f9539G) : playbackInfo.f9930b.m6828a() ? playbackInfo.f9947s : m5725c0(playbackInfo.f9929a, playbackInfo.f9930b, playbackInfo.f9947s);
    }

    /* renamed from: W */
    public final int m5721W() {
        if (this.f9537E.f9929a.m5991s()) {
            return this.f9538F;
        }
        PlaybackInfo playbackInfo = this.f9537E;
        return playbackInfo.f9929a.mo5613j(playbackInfo.f9930b.f12356a, this.f9549k).f10051d;
    }

    @Nullable
    /* renamed from: X */
    public final Pair<Object, Long> m5722X(Timeline timeline, Timeline timeline2) {
        long contentPosition = getContentPosition();
        if (timeline.m5991s() || timeline2.m5991s()) {
            boolean z = !timeline.m5991s() && timeline2.m5991s();
            int m5721W = z ? -1 : m5721W();
            if (z) {
                contentPosition = -9223372036854775807L;
            }
            return m5723Y(timeline2, m5721W, contentPosition);
        }
        Pair<Object, Long> m5988l = timeline.m5988l(this.f9442a, this.f9549k, getCurrentMediaItemIndex(), Util.m7717P(contentPosition));
        Object obj = m5988l.first;
        if (timeline2.mo5609d(obj) != -1) {
            return m5988l;
        }
        Object m5754R = ExoPlayerImplInternal.m5754R(this.f9442a, this.f9549k, this.f9559u, this.f9560v, obj, timeline, timeline2);
        if (m5754R == null) {
            return m5723Y(timeline2, -1, -9223372036854775807L);
        }
        timeline2.mo5613j(m5754R, this.f9549k);
        int i2 = this.f9549k.f10051d;
        return m5723Y(timeline2, i2, timeline2.m5990p(i2, this.f9442a).m6002b());
    }

    @Nullable
    /* renamed from: Y */
    public final Pair<Object, Long> m5723Y(Timeline timeline, int i2, long j2) {
        if (timeline.m5991s()) {
            this.f9538F = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.f9539G = j2;
            return null;
        }
        if (i2 == -1 || i2 >= timeline.mo5937r()) {
            i2 = timeline.mo5608c(this.f9560v);
            j2 = timeline.m5990p(i2, this.f9442a).m6002b();
        }
        return timeline.m5988l(this.f9442a, this.f9549k, i2, Util.m7717P(j2));
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: a */
    public PlaybackException mo5703a() {
        return this.f9537E.f9934f;
    }

    /* renamed from: b0 */
    public final PlaybackInfo m5724b0(PlaybackInfo playbackInfo, Timeline timeline, @Nullable Pair<Object, Long> pair) {
        MediaSource.MediaPeriodId mediaPeriodId;
        TrackSelectorResult trackSelectorResult;
        Assertions.m7513a(timeline.m5991s() || pair != null);
        Timeline timeline2 = playbackInfo.f9929a;
        PlaybackInfo m5920h = playbackInfo.m5920h(timeline);
        if (timeline.m5991s()) {
            MediaSource.MediaPeriodId mediaPeriodId2 = PlaybackInfo.f9928t;
            MediaSource.MediaPeriodId mediaPeriodId3 = PlaybackInfo.f9928t;
            long m7717P = Util.m7717P(this.f9539G);
            PlaybackInfo m5913a = m5920h.m5914b(mediaPeriodId3, m7717P, m7717P, m7717P, 0L, TrackGroupArray.f12592e, this.f9540b, ImmutableList.m11627D()).m5913a(mediaPeriodId3);
            m5913a.f9945q = m5913a.f9947s;
            return m5913a;
        }
        Object obj = m5920h.f9930b.f12356a;
        int i2 = Util.f14736a;
        boolean z = !obj.equals(pair.first);
        MediaSource.MediaPeriodId mediaPeriodId4 = z ? new MediaSource.MediaPeriodId(pair.first) : m5920h.f9930b;
        long longValue = ((Long) pair.second).longValue();
        long m7717P2 = Util.m7717P(getContentPosition());
        if (!timeline2.m5991s()) {
            m7717P2 -= timeline2.mo5613j(obj, this.f9549k).f10053f;
        }
        if (z || longValue < m7717P2) {
            Assertions.m7516d(!mediaPeriodId4.m6828a());
            TrackGroupArray trackGroupArray = z ? TrackGroupArray.f12592e : m5920h.f9936h;
            if (z) {
                mediaPeriodId = mediaPeriodId4;
                trackSelectorResult = this.f9540b;
            } else {
                mediaPeriodId = mediaPeriodId4;
                trackSelectorResult = m5920h.f9937i;
            }
            PlaybackInfo m5913a2 = m5920h.m5914b(mediaPeriodId, longValue, longValue, longValue, 0L, trackGroupArray, trackSelectorResult, z ? ImmutableList.m11627D() : m5920h.f9938j).m5913a(mediaPeriodId);
            m5913a2.f9945q = longValue;
            return m5913a2;
        }
        if (longValue == m7717P2) {
            int mo5609d = timeline.mo5609d(m5920h.f9939k.f12356a);
            if (mo5609d == -1 || timeline.m5987h(mo5609d, this.f9549k).f10051d != timeline.mo5613j(mediaPeriodId4.f12356a, this.f9549k).f10051d) {
                timeline.mo5613j(mediaPeriodId4.f12356a, this.f9549k);
                long m5993b = mediaPeriodId4.m6828a() ? this.f9549k.m5993b(mediaPeriodId4.f12357b, mediaPeriodId4.f12358c) : this.f9549k.f10052e;
                m5920h = m5920h.m5914b(mediaPeriodId4, m5920h.f9947s, m5920h.f9947s, m5920h.f9932d, m5993b - m5920h.f9947s, m5920h.f9936h, m5920h.f9937i, m5920h.f9938j).m5913a(mediaPeriodId4);
                m5920h.f9945q = m5993b;
            }
        } else {
            Assertions.m7516d(!mediaPeriodId4.m6828a());
            long max = Math.max(0L, m5920h.f9946r - (longValue - m7717P2));
            long j2 = m5920h.f9945q;
            if (m5920h.f9939k.equals(m5920h.f9930b)) {
                j2 = longValue + max;
            }
            m5920h = m5920h.m5914b(mediaPeriodId4, longValue, longValue, longValue, max, m5920h.f9936h, m5920h.f9937i, m5920h.f9938j);
            m5920h.f9945q = j2;
        }
        return m5920h;
    }

    /* renamed from: c0 */
    public final long m5725c0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
        timeline.mo5613j(mediaPeriodId.f12356a, this.f9549k);
        return j2 + this.f9549k.f10053f;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public void mo5726d(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.f9948e;
        }
        if (this.f9537E.f9942n.equals(playbackParameters)) {
            return;
        }
        PlaybackInfo m5918f = this.f9537E.m5918f(playbackParameters);
        this.f9561w++;
        this.f9546h.f9590i.mo7575j(4, playbackParameters).mo7577a();
        m5735i0(m5918f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    /* renamed from: d0 */
    public final PlaybackInfo m5727d0(int i2, int i3) {
        boolean z = false;
        Assertions.m7513a(i2 >= 0 && i3 >= i2 && i3 <= this.f9550l.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        Timeline timeline = this.f9537E.f9929a;
        int size = this.f9550l.size();
        this.f9561w++;
        m5729e0(i2, i3);
        Timeline m5718T = m5718T();
        PlaybackInfo m5724b0 = m5724b0(this.f9537E, m5718T, m5722X(timeline, m5718T));
        int i4 = m5724b0.f9933e;
        if (i4 != 1 && i4 != 4 && i2 < i3 && i3 == size && currentMediaItemIndex >= m5724b0.f9929a.mo5937r()) {
            z = true;
        }
        if (z) {
            m5724b0 = m5724b0.m5919g(4);
        }
        this.f9546h.f9590i.mo7572g(20, i2, i3, this.f9533A).mo7577a();
        return m5724b0;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public void mo5728e(int i2, long j2) {
        Timeline timeline = this.f9537E.f9929a;
        if (i2 < 0 || (!timeline.m5991s() && i2 >= timeline.mo5937r())) {
            throw new IllegalSeekPositionException(timeline, i2, j2);
        }
        this.f9561w++;
        if (isPlayingAd()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.f9537E);
            playbackInfoUpdate.m5822a(1);
            this.f9545g.mo5823a(playbackInfoUpdate);
            return;
        }
        int i3 = this.f9537E.f9933e != 1 ? 2 : 1;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        PlaybackInfo m5724b0 = m5724b0(this.f9537E.m5919g(i3), timeline, m5723Y(timeline, i2, j2));
        this.f9546h.f9590i.mo7575j(3, new ExoPlayerImplInternal.SeekPosition(timeline, i2, Util.m7717P(j2))).mo7577a();
        m5735i0(m5724b0, 0, 1, true, true, 1, m5720V(m5724b0), currentMediaItemIndex);
    }

    /* renamed from: e0 */
    public final void m5729e0(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.f9550l.remove(i4);
        }
        this.f9533A = this.f9533A.mo6909a(i2, i3);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public void mo5730f(final int i2) {
        if (this.f9559u != i2) {
            this.f9559u = i2;
            this.f9546h.f9590i.mo7566a(11, i2, 0).mo7577a();
            this.f9547i.m7581d(8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.h
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i3 = i2;
                    int i4 = ExoPlayerImpl.f9532H;
                    ((Player.EventListener) obj).onRepeatModeChanged(i3);
                }
            });
            m5734h0();
            this.f9547i.m7580c();
        }
    }

    /* renamed from: f0 */
    public void m5731f0(boolean z, int i2, int i3) {
        PlaybackInfo playbackInfo = this.f9537E;
        if (playbackInfo.f9940l == z && playbackInfo.f9941m == i2) {
            return;
        }
        this.f9561w++;
        PlaybackInfo m5916d = playbackInfo.m5916d(z, i2);
        this.f9546h.f9590i.mo7566a(1, z ? 1 : 0, i2).mo7577a();
        m5735i0(m5916d, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public Player.Commands mo5732g() {
        return this.f9534B;
    }

    /* renamed from: g0 */
    public void m5733g0(boolean z, @Nullable ExoPlaybackException exoPlaybackException) {
        PlaybackInfo m5913a;
        if (z) {
            m5913a = m5727d0(0, this.f9550l.size()).m5917e(null);
        } else {
            PlaybackInfo playbackInfo = this.f9537E;
            m5913a = playbackInfo.m5913a(playbackInfo.f9930b);
            m5913a.f9945q = m5913a.f9947s;
            m5913a.f9946r = 0L;
        }
        PlaybackInfo m5919g = m5913a.m5919g(1);
        if (exoPlaybackException != null) {
            m5919g = m5919g.m5917e(exoPlaybackException);
        }
        PlaybackInfo playbackInfo2 = m5919g;
        this.f9561w++;
        this.f9546h.f9590i.mo7568c(6).mo7577a();
        m5735i0(playbackInfo2, 0, 1, false, playbackInfo2.f9929a.m5991s() && !this.f9537E.f9929a.m5991s(), 4, m5720V(playbackInfo2), -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        PlaybackInfo playbackInfo = this.f9537E;
        playbackInfo.f9929a.mo5613j(playbackInfo.f9930b.f12356a, this.f9549k);
        PlaybackInfo playbackInfo2 = this.f9537E;
        return playbackInfo2.f9931c == -9223372036854775807L ? playbackInfo2.f9929a.m5990p(getCurrentMediaItemIndex(), this.f9442a).m6002b() : this.f9549k.m5997f() + Util.m7735d0(this.f9537E.f9931c);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.f9537E.f9930b.f12357b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.f9537E.f9930b.f12358c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        int m5721W = m5721W();
        if (m5721W == -1) {
            return 0;
        }
        return m5721W;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        if (this.f9537E.f9929a.m5991s()) {
            return 0;
        }
        PlaybackInfo playbackInfo = this.f9537E;
        return playbackInfo.f9929a.mo5609d(playbackInfo.f9930b.f12356a);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        return Util.m7735d0(m5720V(this.f9537E));
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.f9537E.f9929a;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        if (!isPlayingAd()) {
            return mo5646m();
        }
        PlaybackInfo playbackInfo = this.f9537E;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f9930b;
        playbackInfo.f9929a.mo5613j(mediaPeriodId.f12356a, this.f9549k);
        return Util.m7735d0(this.f9549k.m5993b(mediaPeriodId.f12357b, mediaPeriodId.f12358c));
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.f9537E.f9940l;
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.f9537E.f9942n;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.f9537E.f9933e;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        return this.f9537E.f9941m;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        return Util.m7735d0(this.f9537E.f9946r);
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        return 1.0f;
    }

    /* renamed from: h0 */
    public final void m5734h0() {
        Player.Commands commands = this.f9534B;
        Player.Commands commands2 = this.f9541c;
        Player.Commands.Builder builder = new Player.Commands.Builder();
        builder.m5924b(commands2);
        builder.m5925c(4, !isPlayingAd());
        builder.m5925c(5, m5640P() && !isPlayingAd());
        builder.m5925c(6, m5638N() && !isPlayingAd());
        builder.m5925c(7, !getCurrentTimeline().m5991s() && (m5638N() || !m5639O() || m5640P()) && !isPlayingAd());
        builder.m5925c(8, m5637M() && !isPlayingAd());
        builder.m5925c(9, !getCurrentTimeline().m5991s() && (m5637M() || (m5639O() && isCurrentMediaItemDynamic())) && !isPlayingAd());
        builder.m5925c(10, !isPlayingAd());
        builder.m5925c(11, m5640P() && !isPlayingAd());
        builder.m5925c(12, m5640P() && !isPlayingAd());
        Player.Commands m5926d = builder.m5926d();
        this.f9534B = m5926d;
        if (m5926d.equals(commands)) {
            return;
        }
        this.f9547i.m7581d(13, new C1027m(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023b  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5735i0(final com.google.android.exoplayer2.PlaybackInfo r39, final int r40, final int r41, boolean r42, boolean r43, final int r44, long r45, int r47) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImpl.m5735i0(com.google.android.exoplayer2.PlaybackInfo, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return this.f9537E.f9930b.m6828a();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo5736k(final boolean z) {
        if (this.f9560v != z) {
            this.f9560v = z;
            this.f9546h.f9590i.mo7566a(12, z ? 1 : 0, 0).mo7577a();
            this.f9547i.m7581d(9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    boolean z2 = z;
                    int i2 = ExoPlayerImpl.f9532H;
                    ((Player.EventListener) obj).onShuffleModeEnabledChanged(z2);
                }
            });
            m5734h0();
            this.f9547i.m7580c();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public long mo5737l() {
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo5738n(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public VideoSize mo5739o() {
        return VideoSize.f14900f;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public void mo5740p(Player.Listener listener) {
        this.f9547i.m7583f(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        PlaybackInfo playbackInfo = this.f9537E;
        if (playbackInfo.f9933e != 1) {
            return;
        }
        PlaybackInfo m5917e = playbackInfo.m5917e(null);
        PlaybackInfo m5919g = m5917e.m5919g(m5917e.f9929a.m5991s() ? 4 : 2);
        this.f9561w++;
        this.f9546h.f9590i.mo7568c(0).mo7577a();
        m5735i0(m5919g, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: q */
    public void mo5741q(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo5742r() {
        return this.f9559u;
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        String str;
        boolean z;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = Util.f14740e;
        HashSet<String> hashSet = ExoPlayerLibraryInfo.f9637a;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = ExoPlayerLibraryInfo.f9638b;
        }
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str, C0576a.m4106e(str2, C0576a.m4106e(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.16.1");
        C0000a.m2C(m4122u, "] [", str2, "] [", str);
        m4122u.append("]");
        Log.i("ExoPlayerImpl", m4122u.toString());
        ExoPlayerImplInternal exoPlayerImplInternal = this.f9546h;
        synchronized (exoPlayerImplInternal) {
            if (!exoPlayerImplInternal.f9567A && exoPlayerImplInternal.f9591j.isAlive()) {
                exoPlayerImplInternal.f9590i.mo7571f(7);
                exoPlayerImplInternal.m5811s0(new C1069o(exoPlayerImplInternal, 0), exoPlayerImplInternal.f9604w);
                z = exoPlayerImplInternal.f9567A;
            }
            z = true;
        }
        if (!z) {
            ListenerSet<Player.EventListener> listenerSet = this.f9547i;
            listenerSet.m7581d(10, C1026l.f11800c);
            listenerSet.m7580c();
        }
        this.f9547i.m7582e();
        this.f9544f.mo7576k(null);
        AnalyticsCollector analyticsCollector = this.f9553o;
        if (analyticsCollector != null) {
            this.f9555q.mo6743e(analyticsCollector);
        }
        PlaybackInfo m5919g = this.f9537E.m5919g(1);
        this.f9537E = m5919g;
        PlaybackInfo m5913a = m5919g.m5913a(m5919g.f9930b);
        this.f9537E = m5913a;
        m5913a.f9945q = m5913a.f9947s;
        this.f9537E.f9946r = 0L;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: s */
    public void mo5743s(int i2, int i3) {
        PlaybackInfo m5727d0 = m5727d0(i2, Math.min(i3, this.f9550l.size()));
        m5735i0(m5727d0, 0, 1, false, !m5727d0.f9930b.f12356a.equals(this.f9537E.f9930b.f12356a), 4, m5720V(m5727d0), -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        m5731f0(z, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float f2) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        m5733g0(false, null);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public long mo5744v() {
        return this.f9557s;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public void mo5745w(Player.Listener listener) {
        this.f9547i.m7579b(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public long mo5746x() {
        if (!isPlayingAd()) {
            return mo5713F();
        }
        PlaybackInfo playbackInfo = this.f9537E;
        return playbackInfo.f9939k.equals(playbackInfo.f9930b) ? Util.m7735d0(this.f9537E.f9945q) : getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: z */
    public List mo5747z() {
        return ImmutableList.m11627D();
    }
}
