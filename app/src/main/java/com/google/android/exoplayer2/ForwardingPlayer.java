package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* loaded from: classes.dex */
public class ForwardingPlayer implements Player {

    public static class ForwardingEventListener implements Player.EventListener {

        /* renamed from: b */
        public final ForwardingPlayer f9705b;

        /* renamed from: c */
        public final Player.EventListener f9706c;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingEventListener)) {
                return false;
            }
            ForwardingEventListener forwardingEventListener = (ForwardingEventListener) obj;
            if (this.f9705b.equals(forwardingEventListener.f9705b)) {
                return this.f9706c.equals(forwardingEventListener.f9706c);
            }
            return false;
        }

        public int hashCode() {
            return this.f9706c.hashCode() + (this.f9705b.hashCode() * 31);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            this.f9706c.onAvailableCommandsChanged(commands);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            this.f9706c.onEvents(this.f9705b, events);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsLoadingChanged(boolean z) {
            this.f9706c.onIsLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsPlayingChanged(boolean z) {
            this.f9706c.onIsPlayingChanged(z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z) {
            this.f9706c.onIsLoadingChanged(z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onMediaItemTransition(@Nullable MediaItem mediaItem, int i2) {
            this.f9706c.onMediaItemTransition(mediaItem, i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            this.f9706c.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayWhenReadyChanged(boolean z, int i2) {
            this.f9706c.onPlayWhenReadyChanged(z, i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            this.f9706c.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i2) {
            this.f9706c.onPlaybackStateChanged(i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackSuppressionReasonChanged(int i2) {
            this.f9706c.onPlaybackSuppressionReasonChanged(i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(PlaybackException playbackException) {
            this.f9706c.onPlayerError(playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            this.f9706c.onPlayerErrorChanged(playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i2) {
            this.f9706c.onPlayerStateChanged(z, i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i2) {
            this.f9706c.onPositionDiscontinuity(i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i2) {
            this.f9706c.onRepeatModeChanged(i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
            this.f9706c.onSeekProcessed();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
            this.f9706c.onShuffleModeEnabledChanged(z);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, int i2) {
            this.f9706c.onTimelineChanged(timeline, i2);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            this.f9706c.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            this.f9706c.onTracksChanged(trackGroupArray, trackSelectionArray);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksInfoChanged(TracksInfo tracksInfo) {
            this.f9706c.onTracksInfoChanged(tracksInfo);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            this.f9706c.onPositionDiscontinuity(positionInfo, positionInfo2, i2);
        }
    }

    public static final class ForwardingListener extends ForwardingEventListener implements Player.Listener {

        /* renamed from: d */
        public final Player.Listener f9707d;

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> list) {
            this.f9707d.onCues(list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            this.f9707d.onDeviceInfoChanged(deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceVolumeChanged(int i2, boolean z) {
            this.f9707d.onDeviceVolumeChanged(i2, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMetadata(Metadata metadata) {
            this.f9707d.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            this.f9707d.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            this.f9707d.onSkipSilenceEnabledChanged(z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSurfaceSizeChanged(int i2, int i3) {
            this.f9707d.onSurfaceSizeChanged(i2, i3);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.f9707d.onVideoSizeChanged(videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVolumeChanged(float f2) {
            this.f9707d.onVolumeChanged(f2);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public boolean mo5632A(int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public void mo5709B(@Nullable SurfaceView surfaceView) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public TracksInfo mo5710C() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    /* renamed from: D */
    public Looper mo5711D() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public boolean mo5712E() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public long mo5713F() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public void mo5633G() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public void mo5634H() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public void mo5635I() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: J */
    public MediaMetadata mo5714J() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public long mo5715K() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: a */
    public PlaybackException mo5703a() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public void mo5726d(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public void mo5728e(int i2, long j2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public void mo5730f(int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: i */
    public void mo5644i() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemDynamic() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: j */
    public MediaItem mo5645j() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo5736k(boolean z) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public long mo5646m() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo5738n(@Nullable TextureView textureView) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public VideoSize mo5739o() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public void mo5740p(Player.Listener listener) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void pause() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void play() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: q */
    public void mo5741q(@Nullable SurfaceView surfaceView) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo5742r() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float f2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public void mo5647t() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public void mo5648u(int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public long mo5744v() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    /* renamed from: w */
    public void mo5745w(Player.Listener listener) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public long mo5746x() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: y */
    public boolean mo5649y() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: z */
    public List<Cue> mo5747z() {
        throw null;
    }
}
