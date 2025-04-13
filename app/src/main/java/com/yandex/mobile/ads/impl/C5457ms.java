package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ms */
/* loaded from: classes3.dex */
public final class C5457ms implements Player.Listener {

    /* renamed from: a */
    @NonNull
    private final C5914ve f52789a;

    /* renamed from: b */
    @NonNull
    private final C5603ps f52790b;

    /* renamed from: c */
    @NonNull
    private final tq0 f52791c;

    /* renamed from: d */
    @NonNull
    private final xq0 f52792d;

    /* renamed from: e */
    @NonNull
    private final qq0 f52793e;

    /* renamed from: f */
    @NonNull
    private final l61 f52794f;

    /* renamed from: g */
    @NonNull
    private final fq0 f52795g;

    public C5457ms(@NonNull C5914ve c5914ve, @NonNull C5603ps c5603ps, @NonNull qq0 qq0Var, @NonNull xq0 xq0Var, @NonNull tq0 tq0Var, @NonNull l61 l61Var, @NonNull fq0 fq0Var) {
        this.f52789a = c5914ve;
        this.f52790b = c5603ps;
        this.f52793e = qq0Var;
        this.f52791c = tq0Var;
        this.f52792d = xq0Var;
        this.f52794f = l61Var;
        this.f52795g = fq0Var;
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onMediaItemTransition(@Nullable MediaItem mediaItem, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayWhenReadyChanged(boolean z, int i2) {
        Player m27369a = this.f52790b.m27369a();
        if (!this.f52789a.m29220b() || m27369a == null) {
            return;
        }
        this.f52792d.m29782a(z, m27369a.getPlaybackState());
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackStateChanged(int i2) {
        Player m27369a = this.f52790b.m27369a();
        if (!this.f52789a.m29220b() || m27369a == null) {
            return;
        }
        this.f52793e.m27776b(m27369a, i2);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerError(@NonNull PlaybackException playbackException) {
        this.f52791c.m28698a(playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(@NonNull Player.PositionInfo positionInfo, @NonNull Player.PositionInfo positionInfo2, int i2) {
        this.f52795g.m24723a();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRenderedFirstFrame() {
        Player m27369a = this.f52790b.m27369a();
        if (m27369a != null) {
            onPlaybackStateChanged(m27369a.getPlaybackState());
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i2) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j2) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j2) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onTimelineChanged(@NonNull Timeline timeline, int i2) {
        this.f52794f.m26357a(timeline);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* bridge */ /* synthetic */ void onTracksInfoChanged(TracksInfo tracksInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f2) {
    }
}
