package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.activity.RunnableC0042c;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AudioBecomingNoisyManager;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C0945a;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes.dex */
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {

    /* renamed from: A */
    @Nullable
    public DecoderCounters f9989A;

    /* renamed from: B */
    @Nullable
    public DecoderCounters f9990B;

    /* renamed from: C */
    public int f9991C;

    /* renamed from: D */
    public AudioAttributes f9992D;

    /* renamed from: E */
    public float f9993E;

    /* renamed from: F */
    public boolean f9994F;

    /* renamed from: G */
    public List<Cue> f9995G;

    /* renamed from: H */
    public boolean f9996H;

    /* renamed from: I */
    public boolean f9997I;

    /* renamed from: J */
    public boolean f9998J;

    /* renamed from: K */
    public DeviceInfo f9999K;

    /* renamed from: L */
    public VideoSize f10000L;

    /* renamed from: b */
    public final Renderer[] f10001b;

    /* renamed from: c */
    public final ConditionVariable f10002c = new ConditionVariable();

    /* renamed from: d */
    public final ExoPlayerImpl f10003d;

    /* renamed from: e */
    public final ComponentListener f10004e;

    /* renamed from: f */
    public final FrameMetadataListener f10005f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<Player.Listener> f10006g;

    /* renamed from: h */
    public final AnalyticsCollector f10007h;

    /* renamed from: i */
    public final AudioBecomingNoisyManager f10008i;

    /* renamed from: j */
    public final AudioFocusManager f10009j;

    /* renamed from: k */
    public final StreamVolumeManager f10010k;

    /* renamed from: l */
    public final WakeLockManager f10011l;

    /* renamed from: m */
    public final WifiLockManager f10012m;

    /* renamed from: n */
    public final long f10013n;

    /* renamed from: o */
    @Nullable
    public Format f10014o;

    /* renamed from: p */
    @Nullable
    public Format f10015p;

    /* renamed from: q */
    @Nullable
    public AudioTrack f10016q;

    /* renamed from: r */
    @Nullable
    public Object f10017r;

    /* renamed from: s */
    @Nullable
    public Surface f10018s;

    /* renamed from: t */
    @Nullable
    public SurfaceHolder f10019t;

    /* renamed from: u */
    @Nullable
    public SphericalGLSurfaceView f10020u;

    /* renamed from: v */
    public boolean f10021v;

    /* renamed from: w */
    @Nullable
    public TextureView f10022w;

    /* renamed from: x */
    public int f10023x;

    /* renamed from: y */
    public int f10024y;

    /* renamed from: z */
    public int f10025z;

    @Deprecated
    public static final class Builder {
    }

    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, Player.EventListener, ExoPlayer.AudioOffloadListener {
        public ComponentListener(C09411 c09411) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: B */
        public void mo5952B(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f10007h.mo5952B(decoderCounters);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f10014o = null;
            simpleExoPlayer.f9989A = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: E */
        public void mo5953E(int i2, long j2, long j3) {
            SimpleExoPlayer.this.f10007h.mo5953E(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: G */
        public void mo5954G(long j2, int i2) {
            SimpleExoPlayer.this.f10007h.mo5954G(j2, i2);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: a */
        public void mo5955a(String str) {
            SimpleExoPlayer.this.f10007h.mo5955a(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: b */
        public void mo5956b(Exception exc) {
            SimpleExoPlayer.this.f10007h.mo5956b(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: c */
        public void mo5957c(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f10007h.mo5957c(decoderCounters);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f10015p = null;
            simpleExoPlayer.f9990B = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: d */
        public void mo5958d(DecoderCounters decoderCounters) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f9990B = decoderCounters;
            simpleExoPlayer.f10007h.mo5958d(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: e */
        public void mo5959e(String str, long j2, long j3) {
            SimpleExoPlayer.this.f10007h.mo5959e(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        /* renamed from: f */
        public void mo5960f(int i2) {
            DeviceInfo m5941T = SimpleExoPlayer.m5941T(SimpleExoPlayer.this.f10010k);
            if (m5941T.equals(SimpleExoPlayer.this.f9999K)) {
                return;
            }
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f9999K = m5941T;
            Iterator<Player.Listener> it = simpleExoPlayer.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onDeviceInfoChanged(m5941T);
            }
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        /* renamed from: g */
        public void mo5624g() {
            SimpleExoPlayer.this.m5950b0(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        /* renamed from: h */
        public void mo5705h(boolean z) {
            SimpleExoPlayer.m5940R(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        /* renamed from: i */
        public void mo5630i(float f2) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.m5946X(1, 2, Float.valueOf(simpleExoPlayer.f9993E * simpleExoPlayer.f10009j.f9438g));
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        /* renamed from: j */
        public void mo5631j(int i2) {
            boolean playWhenReady = SimpleExoPlayer.this.getPlayWhenReady();
            SimpleExoPlayer.this.m5950b0(playWhenReady, i2, SimpleExoPlayer.m5942U(playWhenReady, i2));
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        /* renamed from: k */
        public void mo5961k(Surface surface) {
            SimpleExoPlayer.this.m5948Z(null);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: l */
        public void mo5962l(String str) {
            SimpleExoPlayer.this.f10007h.mo5962l(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: m */
        public void mo5963m(String str, long j2, long j3) {
            SimpleExoPlayer.this.f10007h.mo5963m(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: n */
        public void mo5964n(int i2, long j2) {
            SimpleExoPlayer.this.f10007h.mo5964n(i2, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: o */
        public void mo5965o(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f10015p = format;
            simpleExoPlayer.f10007h.mo5965o(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(List<Cue> list) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f9995G = list;
            Iterator<Player.Listener> it = simpleExoPlayer.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onCues(list);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean z) {
            Objects.requireNonNull(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(Metadata metadata) {
            SimpleExoPlayer.this.f10007h.onMetadata(metadata);
            ExoPlayerImpl exoPlayerImpl = SimpleExoPlayer.this.f10003d;
            MediaMetadata.Builder m5847b = exoPlayerImpl.f9536D.m5847b();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f11986b;
                if (i3 >= entryArr.length) {
                    break;
                }
                entryArr[i3].mo6699b(m5847b);
                i3++;
            }
            exoPlayerImpl.f9536D = m5847b.m5848a();
            MediaMetadata m5717S = exoPlayerImpl.m5717S();
            if (!m5717S.equals(exoPlayerImpl.f9535C)) {
                exoPlayerImpl.f9535C = m5717S;
                ListenerSet<Player.EventListener> listenerSet = exoPlayerImpl.f9547i;
                listenerSet.m7581d(14, new C1027m(exoPlayerImpl, i2));
                listenerSet.m7580c();
            }
            Iterator<Player.Listener> it = SimpleExoPlayer.this.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onMetadata(metadata);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayWhenReadyChanged(boolean z, int i2) {
            SimpleExoPlayer.m5940R(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i2) {
            SimpleExoPlayer.m5940R(SimpleExoPlayer.this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean z) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.f9994F == z) {
                return;
            }
            simpleExoPlayer.f9994F = z;
            simpleExoPlayer.f10007h.onSkipSilenceEnabledChanged(z);
            Iterator<Player.Listener> it = simpleExoPlayer.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onSkipSilenceEnabledChanged(simpleExoPlayer.f9994F);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            Objects.requireNonNull(simpleExoPlayer);
            Surface surface = new Surface(surfaceTexture);
            simpleExoPlayer.m5948Z(surface);
            simpleExoPlayer.f10018s = surface;
            SimpleExoPlayer.this.m5944V(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.m5948Z(null);
            SimpleExoPlayer.this.m5944V(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            SimpleExoPlayer.this.m5944V(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksInfoChanged(TracksInfo tracksInfo) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(VideoSize videoSize) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f10000L = videoSize;
            simpleExoPlayer.f10007h.onVideoSizeChanged(videoSize);
            Iterator<Player.Listener> it = SimpleExoPlayer.this.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onVideoSizeChanged(videoSize);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        /* renamed from: p */
        public void mo5966p(Surface surface) {
            SimpleExoPlayer.this.m5948Z(surface);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: q */
        public void mo5967q(Object obj, long j2) {
            SimpleExoPlayer.this.f10007h.mo5967q(obj, j2);
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.f10017r == obj) {
                Iterator<Player.Listener> it = simpleExoPlayer.f10006g.iterator();
                while (it.hasNext()) {
                    it.next().onRenderedFirstFrame();
                }
            }
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        /* renamed from: r */
        public void mo5968r(int i2, boolean z) {
            Iterator<Player.Listener> it = SimpleExoPlayer.this.f10006g.iterator();
            while (it.hasNext()) {
                it.next().onDeviceVolumeChanged(i2, z);
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: s */
        public /* synthetic */ void mo5969s(Format format) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            SimpleExoPlayer.this.m5944V(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.f10021v) {
                simpleExoPlayer.m5948Z(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            if (simpleExoPlayer.f10021v) {
                simpleExoPlayer.m5948Z(null);
            }
            SimpleExoPlayer.this.m5944V(0, 0);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: t */
        public void mo5970t(DecoderCounters decoderCounters) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f9989A = decoderCounters;
            simpleExoPlayer.f10007h.mo5970t(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: u */
        public void mo5971u(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer simpleExoPlayer = SimpleExoPlayer.this;
            simpleExoPlayer.f10014o = format;
            simpleExoPlayer.f10007h.mo5971u(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: v */
        public void mo5972v(long j2) {
            SimpleExoPlayer.this.f10007h.mo5972v(j2);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        /* renamed from: w */
        public /* synthetic */ void mo5706w(boolean z) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: x */
        public void mo5973x(Exception exc) {
            SimpleExoPlayer.this.f10007h.mo5973x(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: y */
        public /* synthetic */ void mo5974y(Format format) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: z */
        public void mo5975z(Exception exc) {
            SimpleExoPlayer.this.f10007h.mo5975z(exc);
        }
    }

    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {

        /* renamed from: b */
        @Nullable
        public VideoFrameMetadataListener f10027b;

        /* renamed from: c */
        @Nullable
        public CameraMotionListener f10028c;

        /* renamed from: d */
        @Nullable
        public VideoFrameMetadataListener f10029d;

        /* renamed from: e */
        @Nullable
        public CameraMotionListener f10030e;

        public FrameMetadataListener() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        /* renamed from: a */
        public void mo5976a(long j2, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.f10030e;
            if (cameraMotionListener != null) {
                cameraMotionListener.mo5976a(j2, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.f10028c;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.mo5976a(j2, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        /* renamed from: d */
        public void mo5977d() {
            CameraMotionListener cameraMotionListener = this.f10030e;
            if (cameraMotionListener != null) {
                cameraMotionListener.mo5977d();
            }
            CameraMotionListener cameraMotionListener2 = this.f10028c;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.mo5977d();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        /* renamed from: l */
        public void mo5978l(long j2, long j3, Format format, @Nullable MediaFormat mediaFormat) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.f10029d;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.mo5978l(j2, j3, format, mediaFormat);
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.f10027b;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.mo5978l(j2, j3, format, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        /* renamed from: q */
        public void mo5669q(int i2, @Nullable Object obj) {
            if (i2 == 7) {
                this.f10027b = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 8) {
                this.f10028c = (CameraMotionListener) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f10029d = null;
                this.f10030e = null;
            } else {
                this.f10029d = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f10030e = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        public FrameMetadataListener(C09411 c09411) {
        }
    }

    public SimpleExoPlayer(ExoPlayer.Builder builder) {
        SimpleExoPlayer simpleExoPlayer;
        try {
            Context applicationContext = builder.f9513a.getApplicationContext();
            this.f10007h = builder.f9520h.get();
            this.f9992D = builder.f9522j;
            this.f10023x = builder.f9523k;
            this.f9994F = false;
            this.f10013n = builder.f9530r;
            ComponentListener componentListener = new ComponentListener(null);
            this.f10004e = componentListener;
            this.f10005f = new FrameMetadataListener(null);
            this.f10006g = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(builder.f9521i);
            this.f10001b = builder.f9515c.get().mo5699a(handler, componentListener, componentListener, componentListener, componentListener);
            this.f9993E = 1.0f;
            if (Util.f14736a < 21) {
                AudioTrack audioTrack = this.f10016q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f10016q.release();
                    this.f10016q = null;
                }
                if (this.f10016q == null) {
                    this.f10016q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f9991C = this.f10016q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f9991C = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f9995G = Collections.emptyList();
            this.f9996H = true;
            Player.Commands.Builder builder2 = new Player.Commands.Builder();
            int[] iArr = {21, 22, 23, 24, 25, 26, 27, 28};
            FlagSet.Builder builder3 = builder2.f9954a;
            Objects.requireNonNull(builder3);
            for (int i2 = 0; i2 < 8; i2++) {
                builder3.m7552a(iArr[i2]);
            }
            try {
                ExoPlayerImpl exoPlayerImpl = new ExoPlayerImpl(this.f10001b, builder.f9517e.get(), builder.f9516d.get(), builder.f9518f.get(), builder.f9519g.get(), this.f10007h, builder.f9524l, builder.f9525m, builder.f9526n, builder.f9527o, builder.f9528p, builder.f9529q, false, builder.f9514b, builder.f9521i, this, builder2.m5926d());
                simpleExoPlayer = this;
                try {
                    simpleExoPlayer.f10003d = exoPlayerImpl;
                    exoPlayerImpl.f9547i.m7579b(simpleExoPlayer.f10004e);
                    exoPlayerImpl.f9548j.add(simpleExoPlayer.f10004e);
                    AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.f9513a, handler, simpleExoPlayer.f10004e);
                    simpleExoPlayer.f10008i = audioBecomingNoisyManager;
                    audioBecomingNoisyManager.m5623a(false);
                    AudioFocusManager audioFocusManager = new AudioFocusManager(builder.f9513a, handler, simpleExoPlayer.f10004e);
                    simpleExoPlayer.f10009j = audioFocusManager;
                    audioFocusManager.m5627c(null);
                    StreamVolumeManager streamVolumeManager = new StreamVolumeManager(builder.f9513a, handler, simpleExoPlayer.f10004e);
                    simpleExoPlayer.f10010k = streamVolumeManager;
                    int m7705D = Util.m7705D(simpleExoPlayer.f9992D.f10287d);
                    if (streamVolumeManager.f10039f != m7705D) {
                        streamVolumeManager.f10039f = m7705D;
                        streamVolumeManager.m5982c();
                        streamVolumeManager.f10036c.mo5960f(m7705D);
                    }
                    WakeLockManager wakeLockManager = new WakeLockManager(builder.f9513a);
                    simpleExoPlayer.f10011l = wakeLockManager;
                    wakeLockManager.f10090c = false;
                    wakeLockManager.m6009a();
                    WifiLockManager wifiLockManager = new WifiLockManager(builder.f9513a);
                    simpleExoPlayer.f10012m = wifiLockManager;
                    wifiLockManager.f10094c = false;
                    wifiLockManager.m6010a();
                    simpleExoPlayer.f9999K = m5941T(streamVolumeManager);
                    simpleExoPlayer.f10000L = VideoSize.f14900f;
                    simpleExoPlayer.m5946X(1, 10, Integer.valueOf(simpleExoPlayer.f9991C));
                    simpleExoPlayer.m5946X(2, 10, Integer.valueOf(simpleExoPlayer.f9991C));
                    simpleExoPlayer.m5946X(1, 3, simpleExoPlayer.f9992D);
                    simpleExoPlayer.m5946X(2, 4, Integer.valueOf(simpleExoPlayer.f10023x));
                    simpleExoPlayer.m5946X(2, 5, 0);
                    simpleExoPlayer.m5946X(1, 9, Boolean.valueOf(simpleExoPlayer.f9994F));
                    simpleExoPlayer.m5946X(2, 7, simpleExoPlayer.f10005f);
                    simpleExoPlayer.m5946X(6, 8, simpleExoPlayer.f10005f);
                    simpleExoPlayer.f10002c.m7538e();
                } catch (Throwable th) {
                    th = th;
                    simpleExoPlayer.f10002c.m7538e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                simpleExoPlayer = this;
            }
        } catch (Throwable th3) {
            th = th3;
            simpleExoPlayer = this;
        }
    }

    /* renamed from: R */
    public static void m5940R(SimpleExoPlayer simpleExoPlayer) {
        int playbackState = simpleExoPlayer.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                simpleExoPlayer.m5951c0();
                boolean z = simpleExoPlayer.f10003d.f9537E.f9944p;
                WakeLockManager wakeLockManager = simpleExoPlayer.f10011l;
                wakeLockManager.f10091d = simpleExoPlayer.getPlayWhenReady() && !z;
                wakeLockManager.m6009a();
                WifiLockManager wifiLockManager = simpleExoPlayer.f10012m;
                wifiLockManager.f10095d = simpleExoPlayer.getPlayWhenReady();
                wifiLockManager.m6010a();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        WakeLockManager wakeLockManager2 = simpleExoPlayer.f10011l;
        wakeLockManager2.f10091d = false;
        wakeLockManager2.m6009a();
        WifiLockManager wifiLockManager2 = simpleExoPlayer.f10012m;
        wifiLockManager2.f10095d = false;
        wifiLockManager2.m6010a();
    }

    /* renamed from: T */
    public static DeviceInfo m5941T(StreamVolumeManager streamVolumeManager) {
        Objects.requireNonNull(streamVolumeManager);
        return new DeviceInfo(0, Util.f14736a >= 28 ? streamVolumeManager.f10037d.getStreamMinVolume(streamVolumeManager.f10039f) : 0, streamVolumeManager.f10037d.getStreamMaxVolume(streamVolumeManager.f10039f));
    }

    /* renamed from: U */
    public static int m5942U(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public void mo5709B(@Nullable SurfaceView surfaceView) {
        m5951c0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m5951c0();
        if (holder == null || holder != this.f10019t) {
            return;
        }
        m5943S();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public TracksInfo mo5710C() {
        m5951c0();
        return this.f10003d.mo5710C();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public Looper mo5711D() {
        return this.f10003d.f9554p;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public boolean mo5712E() {
        m5951c0();
        return this.f10003d.f9560v;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public long mo5713F() {
        m5951c0();
        return this.f10003d.mo5713F();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: J */
    public MediaMetadata mo5714J() {
        return this.f10003d.f9535C;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public long mo5715K() {
        m5951c0();
        return this.f10003d.f9556r;
    }

    /* renamed from: S */
    public void m5943S() {
        m5951c0();
        m5945W();
        m5948Z(null);
        m5944V(0, 0);
    }

    /* renamed from: V */
    public final void m5944V(int i2, int i3) {
        if (i2 == this.f10024y && i3 == this.f10025z) {
            return;
        }
        this.f10024y = i2;
        this.f10025z = i3;
        this.f10007h.onSurfaceSizeChanged(i2, i3);
        Iterator<Player.Listener> it = this.f10006g.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceSizeChanged(i2, i3);
        }
    }

    /* renamed from: W */
    public final void m5945W() {
        if (this.f10020u != null) {
            PlayerMessage m5719U = this.f10003d.m5719U(this.f10005f);
            m5719U.m5935f(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            m5719U.m5934e(null);
            m5719U.m5933d();
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f10020u;
            sphericalGLSurfaceView.f14974b.remove(this.f10004e);
            this.f10020u = null;
        }
        TextureView textureView = this.f10022w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f10004e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f10022w.setSurfaceTextureListener(null);
            }
            this.f10022w = null;
        }
        SurfaceHolder surfaceHolder = this.f10019t;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f10004e);
            this.f10019t = null;
        }
    }

    /* renamed from: X */
    public final void m5946X(int i2, int i3, @Nullable Object obj) {
        for (Renderer renderer : this.f10001b) {
            if (renderer.mo5661g() == i2) {
                PlayerMessage m5719U = this.f10003d.m5719U(renderer);
                Assertions.m7516d(!m5719U.f9973i);
                m5719U.f9969e = i3;
                Assertions.m7516d(!m5719U.f9973i);
                m5719U.f9970f = obj;
                m5719U.m5933d();
            }
        }
    }

    /* renamed from: Y */
    public final void m5947Y(SurfaceHolder surfaceHolder) {
        this.f10021v = false;
        this.f10019t = surfaceHolder;
        surfaceHolder.addCallback(this.f10004e);
        Surface surface = this.f10019t.getSurface();
        if (surface == null || !surface.isValid()) {
            m5944V(0, 0);
        } else {
            Rect surfaceFrame = this.f10019t.getSurfaceFrame();
            m5944V(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* renamed from: Z */
    public final void m5948Z(@Nullable Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Renderer[] rendererArr = this.f10001b;
        int length = rendererArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            Renderer renderer = rendererArr[i2];
            if (renderer.mo5661g() == 2) {
                PlayerMessage m5719U = this.f10003d.m5719U(renderer);
                m5719U.m5935f(1);
                Assertions.m7516d(true ^ m5719U.f9973i);
                m5719U.f9970f = obj;
                m5719U.m5933d();
                arrayList.add(m5719U);
            }
            i2++;
        }
        Object obj2 = this.f10017r;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).m5930a(this.f10013n);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f10017r;
            Surface surface = this.f10018s;
            if (obj3 == surface) {
                surface.release();
                this.f10018s = null;
            }
        }
        this.f10017r = obj;
        if (z) {
            this.f10003d.m5733g0(false, ExoPlaybackException.m5701d(new ExoTimeoutException(3), 1003));
        }
    }

    @Deprecated
    /* renamed from: a0 */
    public void m5949a0(boolean z) {
        m5951c0();
        this.f10009j.m5629e(getPlayWhenReady(), 1);
        this.f10003d.m5733g0(z, null);
        this.f9995G = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    /* renamed from: b */
    public void mo5704b(MediaSource mediaSource, boolean z, boolean z2) {
        m5951c0();
        List<MediaSource> singletonList = Collections.singletonList(mediaSource);
        m5951c0();
        ExoPlayerImpl exoPlayerImpl = this.f10003d;
        int m5721W = exoPlayerImpl.m5721W();
        long currentPosition = exoPlayerImpl.getCurrentPosition();
        exoPlayerImpl.f9561w++;
        if (!exoPlayerImpl.f9550l.isEmpty()) {
            exoPlayerImpl.m5729e0(0, exoPlayerImpl.f9550l.size());
        }
        List<MediaSourceList.MediaSourceHolder> m5716R = exoPlayerImpl.m5716R(0, singletonList);
        Timeline m5718T = exoPlayerImpl.m5718T();
        if (!m5718T.m5991s() && -1 >= ((PlaylistTimeline) m5718T).f9976f) {
            throw new IllegalSeekPositionException(m5718T, -1, -9223372036854775807L);
        }
        if (z) {
            m5721W = m5718T.mo5608c(exoPlayerImpl.f9560v);
            currentPosition = -9223372036854775807L;
        }
        int i2 = m5721W;
        PlaybackInfo m5724b0 = exoPlayerImpl.m5724b0(exoPlayerImpl.f9537E, m5718T, exoPlayerImpl.m5723Y(m5718T, i2, currentPosition));
        int i3 = m5724b0.f9933e;
        if (i2 != -1 && i3 != 1) {
            i3 = (m5718T.m5991s() || i2 >= ((PlaylistTimeline) m5718T).f9976f) ? 4 : 2;
        }
        PlaybackInfo m5919g = m5724b0.m5919g(i3);
        exoPlayerImpl.f9546h.f9590i.mo7575j(17, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(m5716R, exoPlayerImpl.f9533A, i2, Util.m7717P(currentPosition), null)).mo7577a();
        exoPlayerImpl.m5735i0(m5919g, 0, 1, false, (exoPlayerImpl.f9537E.f9930b.f12356a.equals(m5919g.f9930b.f12356a) || exoPlayerImpl.f9537E.f9929a.m5991s()) ? false : true, 4, exoPlayerImpl.m5720V(m5919g), -1);
        prepare();
    }

    /* renamed from: b0 */
    public final void m5950b0(boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = z && i2 != -1;
        if (z2 && i2 != 1) {
            i4 = 1;
        }
        this.f10003d.m5731f0(z2, i4, i3);
    }

    /* renamed from: c0 */
    public final void m5951c0() {
        this.f10002c.m7535b();
        if (Thread.currentThread() != this.f10003d.f9554p.getThread()) {
            String m7747p = Util.m7747p("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f10003d.f9554p.getThread().getName());
            if (this.f9996H) {
                throw new IllegalStateException(m7747p);
            }
            com.google.android.exoplayer2.util.Log.m7588e("SimpleExoPlayer", m7747p, this.f9997I ? null : new IllegalStateException());
            this.f9997I = true;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public void mo5726d(PlaybackParameters playbackParameters) {
        m5951c0();
        this.f10003d.mo5726d(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public void mo5728e(int i2, long j2) {
        m5951c0();
        AnalyticsCollector analyticsCollector = this.f10007h;
        if (!analyticsCollector.f10106j) {
            AnalyticsListener.EventTime m6011I = analyticsCollector.m6011I();
            analyticsCollector.f10106j = true;
            C0945a c0945a = new C0945a(m6011I, 0);
            analyticsCollector.f10102f.put(-1, m6011I);
            ListenerSet<AnalyticsListener> listenerSet = analyticsCollector.f10103g;
            listenerSet.m7581d(-1, c0945a);
            listenerSet.m7580c();
        }
        this.f10003d.mo5728e(i2, j2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public void mo5730f(int i2) {
        m5951c0();
        this.f10003d.mo5730f(i2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public Player.Commands mo5732g() {
        m5951c0();
        return this.f10003d.f9534B;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        m5951c0();
        return this.f10003d.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        m5951c0();
        return this.f10003d.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        m5951c0();
        return this.f10003d.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        m5951c0();
        return this.f10003d.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        m5951c0();
        return this.f10003d.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        m5951c0();
        return this.f10003d.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        m5951c0();
        return this.f10003d.f9537E.f9929a;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        m5951c0();
        return this.f10003d.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        m5951c0();
        return this.f10003d.f9537E.f9940l;
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        m5951c0();
        return this.f10003d.f9537E.f9942n;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        m5951c0();
        return this.f10003d.f9537E.f9933e;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        m5951c0();
        return this.f10003d.f9537E.f9941m;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        m5951c0();
        return this.f10003d.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        return this.f9993E;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        m5951c0();
        return this.f10003d.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo5736k(boolean z) {
        m5951c0();
        this.f10003d.mo5736k(z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public long mo5737l() {
        m5951c0();
        Objects.requireNonNull(this.f10003d);
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo5738n(@Nullable TextureView textureView) {
        m5951c0();
        if (textureView == null || textureView != this.f10022w) {
            return;
        }
        m5943S();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public VideoSize mo5739o() {
        return this.f10000L;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public void mo5740p(Player.Listener listener) {
        Objects.requireNonNull(listener);
        this.f10006g.remove(listener);
        this.f10003d.f9547i.m7583f(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        m5951c0();
        boolean playWhenReady = getPlayWhenReady();
        int m5629e = this.f10009j.m5629e(playWhenReady, 2);
        m5950b0(playWhenReady, m5629e, m5942U(playWhenReady, m5629e));
        this.f10003d.prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: q */
    public void mo5741q(@Nullable SurfaceView surfaceView) {
        m5951c0();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            m5945W();
            m5948Z(surfaceView);
            m5947Y(surfaceView.getHolder());
            return;
        }
        if (surfaceView instanceof SphericalGLSurfaceView) {
            m5945W();
            this.f10020u = (SphericalGLSurfaceView) surfaceView;
            PlayerMessage m5719U = this.f10003d.m5719U(this.f10005f);
            m5719U.m5935f(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            m5719U.m5934e(this.f10020u);
            m5719U.m5933d();
            this.f10020u.f14974b.add(this.f10004e);
            m5948Z(this.f10020u.getVideoSurface());
            m5947Y(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m5951c0();
        if (holder == null) {
            m5943S();
            return;
        }
        m5945W();
        this.f10021v = true;
        this.f10019t = holder;
        holder.addCallback(this.f10004e);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            m5948Z(null);
            m5944V(0, 0);
        } else {
            m5948Z(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m5944V(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo5742r() {
        m5951c0();
        return this.f10003d.f9559u;
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        AudioTrack audioTrack;
        m5951c0();
        if (Util.f14736a < 21 && (audioTrack = this.f10016q) != null) {
            audioTrack.release();
            this.f10016q = null;
        }
        this.f10008i.m5623a(false);
        StreamVolumeManager streamVolumeManager = this.f10010k;
        StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.f10038e;
        if (volumeChangeReceiver != null) {
            try {
                streamVolumeManager.f10034a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e2) {
                com.google.android.exoplayer2.util.Log.m7588e("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            streamVolumeManager.f10038e = null;
        }
        WakeLockManager wakeLockManager = this.f10011l;
        wakeLockManager.f10091d = false;
        wakeLockManager.m6009a();
        WifiLockManager wifiLockManager = this.f10012m;
        wifiLockManager.f10095d = false;
        wifiLockManager.m6010a();
        AudioFocusManager audioFocusManager = this.f10009j;
        audioFocusManager.f9434c = null;
        audioFocusManager.m5625a();
        this.f10003d.release();
        AnalyticsCollector analyticsCollector = this.f10007h;
        HandlerWrapper handlerWrapper = analyticsCollector.f10105i;
        Assertions.m7518f(handlerWrapper);
        handlerWrapper.mo7567b(new RunnableC0042c(analyticsCollector, 4));
        m5945W();
        Surface surface = this.f10018s;
        if (surface != null) {
            surface.release();
            this.f10018s = null;
        }
        if (this.f9998J) {
            Objects.requireNonNull(null);
            throw null;
        }
        this.f9995G = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: s */
    public void mo5743s(int i2, int i3) {
        m5951c0();
        this.f10003d.mo5743s(i2, i3);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        m5951c0();
        int m5629e = this.f10009j.m5629e(z, getPlaybackState());
        m5950b0(z, m5629e, m5942U(z, m5629e));
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        m5951c0();
        if (textureView == null) {
            m5943S();
            return;
        }
        m5945W();
        this.f10022w = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f10004e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m5948Z(null);
            m5944V(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m5948Z(surface);
            this.f10018s = surface;
            m5944V(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float f2) {
        m5951c0();
        float m7740i = Util.m7740i(f2, 0.0f, 1.0f);
        if (this.f9993E == m7740i) {
            return;
        }
        this.f9993E = m7740i;
        m5946X(1, 2, Float.valueOf(this.f10009j.f9438g * m7740i));
        this.f10007h.onVolumeChanged(m7740i);
        Iterator<Player.Listener> it = this.f10006g.iterator();
        while (it.hasNext()) {
            it.next().onVolumeChanged(m7740i);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        m5949a0(false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public long mo5744v() {
        m5951c0();
        return this.f10003d.f9557s;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public void mo5745w(Player.Listener listener) {
        Objects.requireNonNull(listener);
        this.f10006g.add(listener);
        this.f10003d.f9547i.m7579b(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public long mo5746x() {
        m5951c0();
        return this.f10003d.mo5746x();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: z */
    public List<Cue> mo5747z() {
        m5951c0();
        return this.f9995G;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: a */
    public ExoPlaybackException mo5703a() {
        m5951c0();
        return this.f10003d.f9537E.f9934f;
    }
}
