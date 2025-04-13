package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.internal.p038ws.WebSocketProtocol;
import p000a.C0000a;

/* loaded from: classes.dex */
public class EventLogger implements AnalyticsListener {

    /* renamed from: a */
    public static final NumberFormat f14636a;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f14636a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* renamed from: t0 */
    public static String m7542t0(long j2) {
        return j2 == -9223372036854775807L ? "?" : f14636a.format(j2 / 1000.0f);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: A */
    public void mo6024A(AnalyticsListener.EventTime eventTime, String str, long j2) {
        android.util.Log.d(null, m7543r0(eventTime, "audioDecoderInitialized", str, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: B */
    public void mo6025B(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        String valueOf = String.valueOf(m7544s0(eventTime));
        android.util.Log.d(null, valueOf.length() != 0 ? "metadata [".concat(valueOf) : new String("metadata ["));
        m7545u0(metadata, "  ");
        android.util.Log.d(null, "]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: C */
    public void mo6026C(AnalyticsListener.EventTime eventTime, int i2) {
        android.util.Log.d(null, m7543r0(eventTime, "repeatMode", i2 != 0 ? i2 != 1 ? i2 != 2 ? "?" : "ALL" : "ONE" : "OFF", null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: D */
    public /* synthetic */ void mo6027D(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: E */
    public /* synthetic */ void mo6028E(Player player, AnalyticsListener.Events events) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: F */
    public /* synthetic */ void mo6029F(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: G */
    public void mo6030G(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        int i2 = videoSize.f14901b;
        int i3 = videoSize.f14902c;
        StringBuilder sb = new StringBuilder(24);
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        android.util.Log.d(null, m7543r0(eventTime, "videoSize", sb.toString(), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: H */
    public void mo6031H(AnalyticsListener.EventTime eventTime, int i2) {
        android.util.Log.d(null, m7543r0(eventTime, "state", i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE", null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: I */
    public /* synthetic */ void mo6032I(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: J */
    public void mo6033J(AnalyticsListener.EventTime eventTime) {
        android.util.Log.d(null, m7543r0(eventTime, "drmKeysLoaded", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: K */
    public /* synthetic */ void mo6034K(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: L */
    public void mo6035L(AnalyticsListener.EventTime eventTime, float f2) {
        android.util.Log.d(null, m7543r0(eventTime, "volume", Float.toString(f2), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: M */
    public void mo6036M(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: N */
    public void mo6037N(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        android.util.Log.d(null, m7543r0(eventTime, "tracks", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: O */
    public /* synthetic */ void mo6038O(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: P */
    public void mo6039P(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        android.util.Log.d(null, m7543r0(eventTime, "surfaceSize", sb.toString(), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Q */
    public void mo6040Q(AnalyticsListener.EventTime eventTime, boolean z) {
        android.util.Log.d(null, m7543r0(eventTime, "shuffleModeEnabled", Boolean.toString(z), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: R */
    public void mo6041R(AnalyticsListener.EventTime eventTime, boolean z) {
        android.util.Log.d(null, m7543r0(eventTime, "isPlaying", Boolean.toString(z), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: S */
    public /* synthetic */ void mo6042S(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: T */
    public void mo6043T(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        android.util.Log.d(null, m7543r0(eventTime, "downstreamFormat", Format.m5828h(mediaLoadData.f12347c), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: U */
    public void mo6044U(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: V */
    public void mo6045V(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        android.util.Log.d(null, m7543r0(eventTime, "upstreamDiscarded", Format.m5828h(mediaLoadData.f12347c), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: W */
    public void mo6046W(AnalyticsListener.EventTime eventTime, int i2, long j2) {
        android.util.Log.d(null, m7543r0(eventTime, "droppedFrames", Integer.toString(i2), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: X */
    public void mo6047X(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        StringBuilder m24u = C0000a.m24u("reason=");
        C0000a.m1B(m24u, i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION", ", PositionInfo:old [", "mediaItem=");
        m24u.append(positionInfo.f9957c);
        m24u.append(", period=");
        m24u.append(positionInfo.f9960f);
        m24u.append(", pos=");
        m24u.append(positionInfo.f9961g);
        if (positionInfo.f9963i != -1) {
            m24u.append(", contentPos=");
            m24u.append(positionInfo.f9962h);
            m24u.append(", adGroup=");
            m24u.append(positionInfo.f9963i);
            m24u.append(", ad=");
            m24u.append(positionInfo.f9964j);
        }
        m24u.append("], PositionInfo:new [");
        m24u.append("mediaItem=");
        m24u.append(positionInfo2.f9957c);
        m24u.append(", period=");
        m24u.append(positionInfo2.f9960f);
        m24u.append(", pos=");
        m24u.append(positionInfo2.f9961g);
        if (positionInfo2.f9963i != -1) {
            m24u.append(", contentPos=");
            m24u.append(positionInfo2.f9962h);
            m24u.append(", adGroup=");
            m24u.append(positionInfo2.f9963i);
            m24u.append(", ad=");
            m24u.append(positionInfo2.f9964j);
        }
        m24u.append("]");
        android.util.Log.d(null, m7543r0(eventTime, "positionDiscontinuity", m24u.toString(), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Y */
    public /* synthetic */ void mo6048Y(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: Z */
    public void mo6049Z(AnalyticsListener.EventTime eventTime, boolean z) {
        android.util.Log.d(null, m7543r0(eventTime, "skipSilenceEnabled", Boolean.toString(z), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: a */
    public void mo6050a(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: a0 */
    public void mo6051a0(AnalyticsListener.EventTime eventTime, String str) {
        android.util.Log.d(null, m7543r0(eventTime, "audioDecoderReleased", str, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: b */
    public /* synthetic */ void mo6052b(AnalyticsListener.EventTime eventTime, int i2, int i3, int i4, float f2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: b0 */
    public void mo6053b0(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
        StringBuilder sb = new StringBuilder(str.length() + 7);
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        android.util.Log.d(null, m7543r0(eventTime, "playWhenReady", sb.toString(), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: c */
    public void mo6054c(AnalyticsListener.EventTime eventTime, String str) {
        android.util.Log.d(null, m7543r0(eventTime, "videoDecoderReleased", str, null));
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
    public void mo6057d0(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        android.util.Log.d(null, m7543r0(eventTime, "videoInputFormat", Format.m5828h(format), null));
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
    public void mo6060f(AnalyticsListener.EventTime eventTime, int i2) {
        android.util.Log.d(null, m7543r0(eventTime, "drmSessionAcquired", C0576a.m4111j(17, "state=", i2), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: f0 */
    public void mo6061f0(AnalyticsListener.EventTime eventTime, int i2) {
        int mo5936k = eventTime.f10114b.mo5936k();
        int mo5937r = eventTime.f10114b.mo5937r();
        String m7544s0 = m7544s0(eventTime);
        String str = i2 != 0 ? i2 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
        StringBuilder sb = new StringBuilder(str.length() + C0576a.m4106e(m7544s0, 69));
        sb.append("timeline [");
        sb.append(m7544s0);
        sb.append(", periodCount=");
        sb.append(mo5936k);
        sb.append(", windowCount=");
        sb.append(mo5937r);
        sb.append(", reason=");
        sb.append(str);
        android.util.Log.d(null, sb.toString());
        if (Math.min(mo5936k, 3) > 0) {
            eventTime.f10114b.m5987h(0, null);
            throw null;
        }
        if (mo5936k > 3) {
            android.util.Log.d(null, "  ...");
        }
        if (Math.min(mo5937r, 3) > 0) {
            eventTime.f10114b.m5990p(0, null);
            throw null;
        }
        if (mo5937r > 3) {
            android.util.Log.d(null, "  ...");
        }
        android.util.Log.d(null, "]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: g */
    public /* synthetic */ void mo6062g(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: g0 */
    public void mo6063g0(AnalyticsListener.EventTime eventTime, String str, long j2) {
        android.util.Log.d(null, m7543r0(eventTime, "videoDecoderInitialized", str, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: h */
    public void mo6064h(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
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
    public void mo6067i0(AnalyticsListener.EventTime eventTime, @Nullable MediaItem mediaItem, int i2) {
        String m7544s0 = m7544s0(eventTime);
        String str = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
        StringBuilder m4122u = C0576a.m4122u(str.length() + C0576a.m4106e(m7544s0, 21), "mediaItem [", m7544s0, ", reason=", str);
        m4122u.append("]");
        android.util.Log.d(null, m4122u.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: j */
    public void mo6068j(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        android.util.Log.e(null, m7543r0(eventTime, "playerFailed", null, playbackException));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: j0 */
    public void mo6069j0(AnalyticsListener.EventTime eventTime, Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        android.util.Log.d(null, m7543r0(eventTime, "audioInputFormat", Format.m5828h(format), null));
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
        android.util.Log.e(null, m7543r0(eventTime, "internalError", "drmSessionManagerError", exc));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: l0 */
    public void mo6073l0(AnalyticsListener.EventTime eventTime, Object obj, long j2) {
        android.util.Log.d(null, m7543r0(eventTime, "renderedFirstFrame", String.valueOf(obj), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: m */
    public void mo6074m(AnalyticsListener.EventTime eventTime) {
        android.util.Log.d(null, m7543r0(eventTime, "drmSessionReleased", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: m0 */
    public /* synthetic */ void mo6075m0(AnalyticsListener.EventTime eventTime, int i2, DecoderCounters decoderCounters) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: n */
    public void mo6076n(AnalyticsListener.EventTime eventTime) {
        android.util.Log.d(null, m7543r0(eventTime, "drmKeysRestored", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: n0 */
    public /* synthetic */ void mo6077n0(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: o */
    public void mo6078o(AnalyticsListener.EventTime eventTime, int i2) {
        android.util.Log.d(null, m7543r0(eventTime, "playbackSuppressionReason", i2 != 0 ? i2 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE", null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: o0 */
    public void mo6079o0(AnalyticsListener.EventTime eventTime, boolean z) {
        android.util.Log.d(null, m7543r0(eventTime, "loading", Boolean.toString(z), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: p */
    public void mo6080p(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        android.util.Log.d(null, m7543r0(eventTime, "playbackParameters", playbackParameters.toString(), null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: p0 */
    public void mo6081p0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        android.util.Log.d(null, m7543r0(eventTime, "videoDisabled", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: q */
    public /* synthetic */ void mo6082q(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: q0 */
    public void mo6083q0(AnalyticsListener.EventTime eventTime) {
        android.util.Log.d(null, m7543r0(eventTime, "drmKeysRemoved", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: r */
    public void mo6084r(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
        StringBuilder sb = new StringBuilder(55);
        sb.append(i2);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        android.util.Log.e(null, m7543r0(eventTime, "audioTrackUnderrun", sb.toString(), null));
    }

    /* renamed from: r0 */
    public final String m7543r0(AnalyticsListener.EventTime eventTime, String str, @Nullable String str2, @Nullable Throwable th) {
        String str3;
        String m7544s0 = m7544s0(eventTime);
        String m4115n = C0576a.m4115n(C0576a.m4106e(m7544s0, C0576a.m4106e(str, 2)), str, " [", m7544s0);
        if (th instanceof PlaybackException) {
            String valueOf = String.valueOf(m4115n);
            int i2 = ((PlaybackException) th).f9926b;
            if (i2 == 5001) {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i2 != 5002) {
                switch (i2) {
                    case 1000:
                        str3 = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                        str3 = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str3 = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i2) {
                            case 2000:
                                str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i2) {
                                    case 3001:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i2) {
                                            case 4001:
                                                str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str3 = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i2) {
                                                    case ByteQuadsCanonicalizer.MAX_ENTRIES_FOR_REUSE /* 6000 */:
                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case 6001:
                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case 6002:
                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case 6003:
                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case 6004:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case 6005:
                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case 6006:
                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        if (i2 < 1000000) {
                                                            str3 = "invalid error code";
                                                            break;
                                                        } else {
                                                            str3 = "custom error code";
                                                            break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            }
            m4115n = C0576a.m4115n(str3.length() + valueOf.length() + 12, valueOf, ", errorCode=", str3);
        }
        if (str2 != null) {
            String valueOf2 = String.valueOf(m4115n);
            m4115n = C0576a.m4115n(str2.length() + valueOf2.length() + 2, valueOf2, ", ", str2);
        }
        String m7586c = Log.m7586c(th);
        if (!TextUtils.isEmpty(m7586c)) {
            String valueOf3 = String.valueOf(m4115n);
            String replace = m7586c.replace("\n", "\n  ");
            StringBuilder sb = new StringBuilder(C0576a.m4106e(replace, valueOf3.length() + 4));
            sb.append(valueOf3);
            sb.append("\n  ");
            sb.append(replace);
            sb.append('\n');
            m4115n = sb.toString();
        }
        return String.valueOf(m4115n).concat("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: s */
    public /* synthetic */ void mo6085s(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    /* renamed from: s0 */
    public final String m7544s0(AnalyticsListener.EventTime eventTime) {
        String m4111j = C0576a.m4111j(18, "window=", eventTime.f10115c);
        if (eventTime.f10116d != null) {
            String valueOf = String.valueOf(m4111j);
            int mo5609d = eventTime.f10114b.mo5609d(eventTime.f10116d.f12356a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append(valueOf);
            sb.append(", period=");
            sb.append(mo5609d);
            m4111j = sb.toString();
            if (eventTime.f10116d.m6828a()) {
                String valueOf2 = String.valueOf(m4111j);
                int i2 = eventTime.f10116d.f12357b;
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 21);
                sb2.append(valueOf2);
                sb2.append(", adGroup=");
                sb2.append(i2);
                String valueOf3 = String.valueOf(sb2.toString());
                int i3 = eventTime.f10116d.f12358c;
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 16);
                sb3.append(valueOf3);
                sb3.append(", ad=");
                sb3.append(i3);
                m4111j = sb3.toString();
            }
        }
        String m7542t0 = m7542t0(eventTime.f10113a - 0);
        String m7542t02 = m7542t0(eventTime.f10117e);
        return C0000a.m20q(C0576a.m4122u(C0576a.m4106e(m4111j, C0576a.m4106e(m7542t02, C0576a.m4106e(m7542t0, 23))), "eventTime=", m7542t0, ", mediaPos=", m7542t02), ", ", m4111j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: t */
    public void mo6086t(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        android.util.Log.d(null, m7543r0(eventTime, "audioDisabled", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: u */
    public void mo6087u(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        android.util.Log.d(null, m7543r0(eventTime, "audioEnabled", null, null));
    }

    /* renamed from: u0 */
    public final void m7545u0(Metadata metadata, String str) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f11986b;
            if (i2 >= entryArr.length) {
                return;
            }
            String valueOf = String.valueOf(entryArr[i2]);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length());
            sb.append(str);
            sb.append(valueOf);
            android.util.Log.d(null, sb.toString());
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: v */
    public void mo6088v(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        android.util.Log.e(null, m7543r0(eventTime, "internalError", "loadError", iOException));
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
    public void mo6091y(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        android.util.Log.d(null, m7543r0(eventTime, "videoEnabled", null, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    /* renamed from: z */
    public /* synthetic */ void mo6092z(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
    }
}
