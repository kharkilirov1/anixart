package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface AnalyticsListener {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    public static final class EventTime {

        /* renamed from: a */
        public final long f10113a;

        /* renamed from: b */
        public final Timeline f10114b;

        /* renamed from: c */
        public final int f10115c;

        /* renamed from: d */
        @Nullable
        public final MediaSource.MediaPeriodId f10116d;

        /* renamed from: e */
        public final long f10117e;

        /* renamed from: f */
        public final Timeline f10118f;

        /* renamed from: g */
        public final int f10119g;

        /* renamed from: h */
        @Nullable
        public final MediaSource.MediaPeriodId f10120h;

        /* renamed from: i */
        public final long f10121i;

        /* renamed from: j */
        public final long f10122j;

        public EventTime(long j2, Timeline timeline, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j3, Timeline timeline2, int i3, @Nullable MediaSource.MediaPeriodId mediaPeriodId2, long j4, long j5) {
            this.f10113a = j2;
            this.f10114b = timeline;
            this.f10115c = i2;
            this.f10116d = mediaPeriodId;
            this.f10117e = j3;
            this.f10118f = timeline2;
            this.f10119g = i3;
            this.f10120h = mediaPeriodId2;
            this.f10121i = j4;
            this.f10122j = j5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTime.class != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            return this.f10113a == eventTime.f10113a && this.f10115c == eventTime.f10115c && this.f10117e == eventTime.f10117e && this.f10119g == eventTime.f10119g && this.f10121i == eventTime.f10121i && this.f10122j == eventTime.f10122j && Objects.m11173a(this.f10114b, eventTime.f10114b) && Objects.m11173a(this.f10116d, eventTime.f10116d) && Objects.m11173a(this.f10118f, eventTime.f10118f) && Objects.m11173a(this.f10120h, eventTime.f10120h);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f10113a), this.f10114b, Integer.valueOf(this.f10115c), this.f10116d, Long.valueOf(this.f10117e), this.f10118f, Integer.valueOf(this.f10119g), this.f10120h, Long.valueOf(this.f10121i), Long.valueOf(this.f10122j)});
        }
    }

    public static final class Events {

        /* renamed from: a */
        public final FlagSet f10123a;

        /* renamed from: b */
        public final SparseArray<EventTime> f10124b;

        public Events(FlagSet flagSet, SparseArray<EventTime> sparseArray) {
            this.f10123a = flagSet;
            SparseArray<EventTime> sparseArray2 = new SparseArray<>(flagSet.m7551c());
            for (int i2 = 0; i2 < flagSet.m7551c(); i2++) {
                int m7550b = flagSet.m7550b(i2);
                EventTime eventTime = sparseArray.get(m7550b);
                java.util.Objects.requireNonNull(eventTime);
                sparseArray2.append(m7550b, eventTime);
            }
            this.f10124b = sparseArray2;
        }

        /* renamed from: a */
        public EventTime m6093a(int i2) {
            EventTime eventTime = this.f10124b.get(i2);
            java.util.Objects.requireNonNull(eventTime);
            return eventTime;
        }

        /* renamed from: b */
        public int m6094b() {
            return this.f10123a.m7551c();
        }
    }

    @Deprecated
    /* renamed from: A */
    void mo6024A(EventTime eventTime, String str, long j2);

    /* renamed from: B */
    void mo6025B(EventTime eventTime, Metadata metadata);

    /* renamed from: C */
    void mo6026C(EventTime eventTime, int i2);

    /* renamed from: D */
    void mo6027D(EventTime eventTime);

    /* renamed from: E */
    void mo6028E(Player player, Events events);

    @Deprecated
    /* renamed from: F */
    void mo6029F(EventTime eventTime, boolean z, int i2);

    /* renamed from: G */
    void mo6030G(EventTime eventTime, VideoSize videoSize);

    /* renamed from: H */
    void mo6031H(EventTime eventTime, int i2);

    @Deprecated
    /* renamed from: I */
    void mo6032I(EventTime eventTime, Format format);

    /* renamed from: J */
    void mo6033J(EventTime eventTime);

    @Deprecated
    /* renamed from: K */
    void mo6034K(EventTime eventTime, Format format);

    /* renamed from: L */
    void mo6035L(EventTime eventTime, float f2);

    /* renamed from: M */
    void mo6036M(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    /* renamed from: N */
    void mo6037N(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    /* renamed from: O */
    void mo6038O(EventTime eventTime, long j2);

    /* renamed from: P */
    void mo6039P(EventTime eventTime, int i2, int i3);

    /* renamed from: Q */
    void mo6040Q(EventTime eventTime, boolean z);

    /* renamed from: R */
    void mo6041R(EventTime eventTime, boolean z);

    /* renamed from: S */
    void mo6042S(EventTime eventTime, Exception exc);

    /* renamed from: T */
    void mo6043T(EventTime eventTime, MediaLoadData mediaLoadData);

    /* renamed from: U */
    void mo6044U(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: V */
    void mo6045V(EventTime eventTime, MediaLoadData mediaLoadData);

    /* renamed from: W */
    void mo6046W(EventTime eventTime, int i2, long j2);

    /* renamed from: X */
    void mo6047X(EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2);

    /* renamed from: Y */
    void mo6048Y(EventTime eventTime, Exception exc);

    /* renamed from: Z */
    void mo6049Z(EventTime eventTime, boolean z);

    /* renamed from: a */
    void mo6050a(EventTime eventTime, int i2, long j2, long j3);

    /* renamed from: a0 */
    void mo6051a0(EventTime eventTime, String str);

    @Deprecated
    /* renamed from: b */
    void mo6052b(EventTime eventTime, int i2, int i3, int i4, float f2);

    /* renamed from: b0 */
    void mo6053b0(EventTime eventTime, boolean z, int i2);

    /* renamed from: c */
    void mo6054c(EventTime eventTime, String str);

    /* renamed from: c0 */
    void mo6055c0(EventTime eventTime, String str, long j2, long j3);

    @Deprecated
    /* renamed from: d */
    void mo6056d(EventTime eventTime, int i2, Format format);

    /* renamed from: d0 */
    void mo6057d0(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    /* renamed from: e */
    void mo6058e(EventTime eventTime, long j2, int i2);

    /* renamed from: e0 */
    void mo6059e0(EventTime eventTime, Exception exc);

    /* renamed from: f */
    void mo6060f(EventTime eventTime, int i2);

    /* renamed from: f0 */
    void mo6061f0(EventTime eventTime, int i2);

    @Deprecated
    /* renamed from: g */
    void mo6062g(EventTime eventTime);

    @Deprecated
    /* renamed from: g0 */
    void mo6063g0(EventTime eventTime, String str, long j2);

    /* renamed from: h */
    void mo6064h(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    /* renamed from: h0 */
    void mo6065h0(EventTime eventTime);

    @Deprecated
    /* renamed from: i */
    void mo6066i(EventTime eventTime, int i2, String str, long j2);

    /* renamed from: i0 */
    void mo6067i0(EventTime eventTime, @Nullable MediaItem mediaItem, int i2);

    /* renamed from: j */
    void mo6068j(EventTime eventTime, PlaybackException playbackException);

    /* renamed from: j0 */
    void mo6069j0(EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    @Deprecated
    /* renamed from: k */
    void mo6070k(EventTime eventTime, int i2);

    /* renamed from: k0 */
    void mo6071k0(EventTime eventTime, Player.Commands commands);

    /* renamed from: l */
    void mo6072l(EventTime eventTime, Exception exc);

    /* renamed from: l0 */
    void mo6073l0(EventTime eventTime, Object obj, long j2);

    /* renamed from: m */
    void mo6074m(EventTime eventTime);

    @Deprecated
    /* renamed from: m0 */
    void mo6075m0(EventTime eventTime, int i2, DecoderCounters decoderCounters);

    /* renamed from: n */
    void mo6076n(EventTime eventTime);

    @Deprecated
    /* renamed from: n0 */
    void mo6077n0(EventTime eventTime);

    /* renamed from: o */
    void mo6078o(EventTime eventTime, int i2);

    /* renamed from: o0 */
    void mo6079o0(EventTime eventTime, boolean z);

    /* renamed from: p */
    void mo6080p(EventTime eventTime, PlaybackParameters playbackParameters);

    /* renamed from: p0 */
    void mo6081p0(EventTime eventTime, DecoderCounters decoderCounters);

    @Deprecated
    /* renamed from: q */
    void mo6082q(EventTime eventTime, boolean z);

    /* renamed from: q0 */
    void mo6083q0(EventTime eventTime);

    /* renamed from: r */
    void mo6084r(EventTime eventTime, int i2, long j2, long j3);

    /* renamed from: s */
    void mo6085s(EventTime eventTime, MediaMetadata mediaMetadata);

    /* renamed from: t */
    void mo6086t(EventTime eventTime, DecoderCounters decoderCounters);

    /* renamed from: u */
    void mo6087u(EventTime eventTime, DecoderCounters decoderCounters);

    /* renamed from: v */
    void mo6088v(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    @Deprecated
    /* renamed from: w */
    void mo6089w(EventTime eventTime, int i2, DecoderCounters decoderCounters);

    /* renamed from: x */
    void mo6090x(EventTime eventTime, TracksInfo tracksInfo);

    /* renamed from: y */
    void mo6091y(EventTime eventTime, DecoderCounters decoderCounters);

    /* renamed from: z */
    void mo6092z(EventTime eventTime, String str, long j2, long j3);
}
