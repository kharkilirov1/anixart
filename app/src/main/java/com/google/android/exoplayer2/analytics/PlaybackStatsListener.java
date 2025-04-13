package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    public interface Callback {
    }

    public static final class PlaybackStatsTracker {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: A */
    public /* synthetic */ void mo6024A(AnalyticsListener.EventTime eventTime, String str, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: B */
    public /* synthetic */ void mo6025B(AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: C */
    public /* synthetic */ void mo6026C(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: D */
    public /* synthetic */ void mo6027D(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: E */
    public void mo6028E(Player player, AnalyticsListener.Events events) {
        if (events.m6094b() == 0) {
            return;
        }
        if (events.m6094b() <= 0) {
            throw null;
        }
        int m7550b = events.f10123a.m7550b(0);
        events.m6093a(m7550b);
        if (m7550b == 0) {
            throw null;
        }
        if (m7550b != 11) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: F */
    public /* synthetic */ void mo6029F(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: G */
    public void mo6030G(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: H */
    public /* synthetic */ void mo6031H(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: I */
    public /* synthetic */ void mo6032I(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: J */
    public /* synthetic */ void mo6033J(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: K */
    public /* synthetic */ void mo6034K(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: L */
    public /* synthetic */ void mo6035L(AnalyticsListener.EventTime eventTime, float f2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: M */
    public /* synthetic */ void mo6036M(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: N */
    public /* synthetic */ void mo6037N(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: O */
    public /* synthetic */ void mo6038O(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: P */
    public /* synthetic */ void mo6039P(AnalyticsListener.EventTime eventTime, int i2, int i3) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Q */
    public /* synthetic */ void mo6040Q(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: R */
    public /* synthetic */ void mo6041R(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: S */
    public /* synthetic */ void mo6042S(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: T */
    public void mo6043T(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i2 = mediaLoadData.f12346b;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: U */
    public /* synthetic */ void mo6044U(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: V */
    public /* synthetic */ void mo6045V(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: W */
    public void mo6046W(AnalyticsListener.EventTime eventTime, int i2, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: X */
    public void mo6047X(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Y */
    public /* synthetic */ void mo6048Y(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Z */
    public /* synthetic */ void mo6049Z(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: a */
    public void mo6050a(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: a0 */
    public /* synthetic */ void mo6051a0(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: b */
    public /* synthetic */ void mo6052b(AnalyticsListener.EventTime eventTime, int i2, int i3, int i4, float f2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: b0 */
    public /* synthetic */ void mo6053b0(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: c */
    public /* synthetic */ void mo6054c(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: c0 */
    public /* synthetic */ void mo6055c0(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: d */
    public /* synthetic */ void mo6056d(AnalyticsListener.EventTime eventTime, int i2, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: d0 */
    public /* synthetic */ void mo6057d0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: e */
    public /* synthetic */ void mo6058e(AnalyticsListener.EventTime eventTime, long j2, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: e0 */
    public /* synthetic */ void mo6059e0(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: f */
    public /* synthetic */ void mo6060f(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: f0 */
    public /* synthetic */ void mo6061f0(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: g */
    public /* synthetic */ void mo6062g(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: g0 */
    public /* synthetic */ void mo6063g0(AnalyticsListener.EventTime eventTime, String str, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: h */
    public /* synthetic */ void mo6064h(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: h0 */
    public /* synthetic */ void mo6065h0(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: i */
    public /* synthetic */ void mo6066i(AnalyticsListener.EventTime eventTime, int i2, String str, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: i0 */
    public /* synthetic */ void mo6067i0(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: j */
    public /* synthetic */ void mo6068j(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: j0 */
    public /* synthetic */ void mo6069j0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: k */
    public /* synthetic */ void mo6070k(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: k0 */
    public /* synthetic */ void mo6071k0(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: l */
    public void mo6072l(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: l0 */
    public /* synthetic */ void mo6073l0(AnalyticsListener.EventTime eventTime, Object obj, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: m */
    public /* synthetic */ void mo6074m(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: m0 */
    public /* synthetic */ void mo6075m0(AnalyticsListener.EventTime eventTime, int i2, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: n */
    public /* synthetic */ void mo6076n(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: n0 */
    public /* synthetic */ void mo6077n0(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: o */
    public /* synthetic */ void mo6078o(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: o0 */
    public /* synthetic */ void mo6079o0(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: p */
    public /* synthetic */ void mo6080p(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: p0 */
    public /* synthetic */ void mo6081p0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: q */
    public /* synthetic */ void mo6082q(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: q0 */
    public /* synthetic */ void mo6083q0(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: r */
    public /* synthetic */ void mo6084r(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: s */
    public /* synthetic */ void mo6085s(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: t */
    public /* synthetic */ void mo6086t(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: u */
    public /* synthetic */ void mo6087u(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: v */
    public void mo6088v(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: w */
    public /* synthetic */ void mo6089w(AnalyticsListener.EventTime eventTime, int i2, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: x */
    public /* synthetic */ void mo6090x(AnalyticsListener.EventTime eventTime, TracksInfo tracksInfo) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: y */
    public /* synthetic */ void mo6091y(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: z */
    public /* synthetic */ void mo6092z(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
    }
}
