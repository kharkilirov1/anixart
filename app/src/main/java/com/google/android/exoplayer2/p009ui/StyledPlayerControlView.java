package com.google.android.exoplayer2.p009ui;

import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ForwardingPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p009ui.TimeBar;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class StyledPlayerControlView extends FrameLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f14228k = 0;

    /* renamed from: b */
    @Nullable
    public Player f14229b;

    /* renamed from: c */
    @Nullable
    public ProgressUpdateListener f14230c;

    /* renamed from: d */
    @Nullable
    public OnFullScreenModeChangedListener f14231d;

    /* renamed from: e */
    public boolean f14232e;

    /* renamed from: f */
    public boolean f14233f;

    /* renamed from: g */
    public int f14234g;

    /* renamed from: h */
    public int f14235h;

    /* renamed from: i */
    public int f14236i;

    /* renamed from: j */
    public long f14237j;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: a */
        public void mo7374a(TimeBar timeBar, long j2) {
            int i2 = StyledPlayerControlView.f14228k;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: b */
        public void mo7375b(TimeBar timeBar, long j2, boolean z) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: c */
        public void mo7376c(TimeBar timeBar, long j2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            throw null;
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            int i2 = StyledPlayerControlView.f14228k;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            if (events.m5928b(4, 5)) {
                int i2 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5928b(4, 5, 7)) {
                int i3 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5927a(8)) {
                int i4 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5927a(9)) {
                int i5 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5928b(8, 9, 11, 0, 16, 17, 13)) {
                int i6 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5928b(11, 0)) {
                int i7 = StyledPlayerControlView.f14228k;
                throw null;
            }
            if (events.m5927a(12)) {
                throw null;
            }
            if (events.m5927a(2)) {
                int i8 = StyledPlayerControlView.f14228k;
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
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

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i2) {
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

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
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

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
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

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }
    }

    public interface OnFullScreenModeChangedListener {
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            throw null;
        }
    }

    public interface ProgressUpdateListener {
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f14238a;
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i2) {
            TextView textView = settingViewHolder.f14238a;
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            throw null;
        }
    }

    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        /* renamed from: k */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            throw null;
        }
    }

    public static final class TrackInformation {
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {

        /* renamed from: a */
        public List<TrackInformation> f14239a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f14239a.isEmpty()) {
                return 0;
            }
            return this.f14239a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            throw null;
        }
    }

    public interface VisibilityListener {
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.ui");
    }

    private void setPlaybackSpeed(float f2) {
        Player player = this.f14229b;
        if (player == null) {
            return;
        }
        player.mo5726d(new PlaybackParameters(f2, player.getPlaybackParameters().f9950c));
    }

    /* renamed from: a */
    public boolean m7397a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f14229b;
        if (player != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.getPlaybackState() != 4) {
                            player.mo5634H();
                        }
                    } else if (keyCode == 89) {
                        player.mo5635I();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            m7399c(player);
                        } else if (keyCode == 87) {
                            player.mo5633G();
                        } else if (keyCode == 88) {
                            player.mo5647t();
                        } else if (keyCode == 126) {
                            m7398b(player);
                        } else if (keyCode == 127) {
                            player.pause();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m7398b(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            player.mo5728e(player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    /* renamed from: c */
    public final void m7399c(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            m7398b(player);
        } else {
            player.pause();
        }
    }

    /* renamed from: d */
    public boolean m7400d() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7397a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public void m7401e() {
        m7400d();
        m7400d();
        m7400d();
        m7400d();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7402f() {
        /*
            r12 = this;
            com.google.android.exoplayer2.Player r0 = r12.f14229b
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r12.f14232e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            com.google.android.exoplayer2.Timeline r1 = r0.getCurrentTimeline()
            int r5 = r1.mo5937r()
            r6 = 100
            if (r5 <= r6) goto L19
            goto L2f
        L19:
            int r5 = r1.mo5937r()
            r6 = 0
        L1e:
            if (r6 >= r5) goto L34
            com.google.android.exoplayer2.Timeline$Window r7 = r1.m5990p(r6, r2)
            long r7 = r7.f10077o
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L31
        L2f:
            r1 = 0
            goto L35
        L31:
            int r6 = r6 + 1
            goto L1e
        L34:
            r1 = 1
        L35:
            if (r1 == 0) goto L39
            r1 = 1
            goto L3a
        L39:
            r1 = 0
        L3a:
            r12.f14233f = r1
            r5 = 0
            r12.f14237j = r5
            com.google.android.exoplayer2.Timeline r1 = r0.getCurrentTimeline()
            boolean r7 = r1.m5991s()
            if (r7 != 0) goto L6b
            int r0 = r0.getCurrentMediaItemIndex()
            boolean r7 = r12.f14233f
            if (r7 == 0) goto L53
            goto L54
        L53:
            r3 = r0
        L54:
            if (r7 == 0) goto L5c
            int r7 = r1.mo5937r()
            int r7 = r7 - r4
            goto L5d
        L5c:
            r7 = r0
        L5d:
            if (r3 > r7) goto L6b
            if (r3 != r0) goto L67
            long r4 = com.google.android.exoplayer2.util.Util.m7735d0(r5)
            r12.f14237j = r4
        L67:
            r1.m5990p(r3, r2)
            throw r2
        L6b:
            com.google.android.exoplayer2.util.Util.m7735d0(r5)
            r12.m7400d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.StyledPlayerControlView.m7402f():void");
    }

    @Nullable
    public Player getPlayer() {
        return this.f14229b;
    }

    public int getRepeatToggleModes() {
        return this.f14236i;
    }

    public boolean getShowShuffleButton() {
        throw null;
    }

    public boolean getShowSubtitleButton() {
        throw null;
    }

    public int getShowTimeoutMs() {
        return this.f14234g;
    }

    public boolean getShowVrButton() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Objects.requireNonNull(null);
        throw null;
    }

    public void setAnimationEnabled(boolean z) {
        throw null;
    }

    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.f14231d = onFullScreenModeChangedListener;
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.m7516d(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.mo5711D() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.m7513a(z);
        Player player2 = this.f14229b;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo5740p(null);
        }
        this.f14229b = player;
        if (player != null) {
            player.mo5745w(null);
        }
        if (player instanceof ForwardingPlayer) {
            Objects.requireNonNull((ForwardingPlayer) player);
        }
        m7401e();
        throw null;
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.f14230c = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i2) {
        this.f14236i = i2;
        Player player = this.f14229b;
        if (player != null) {
            int mo5742r = player.mo5742r();
            if (i2 == 0 && mo5742r != 0) {
                this.f14229b.mo5730f(0);
            } else if (i2 == 1 && mo5742r == 2) {
                this.f14229b.mo5730f(1);
            } else if (i2 == 2 && mo5742r == 1) {
                this.f14229b.mo5730f(2);
            }
        }
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowFastForwardButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f14232e = z;
        m7402f();
    }

    public void setShowNextButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowPreviousButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowRewindButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowShuffleButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowSubtitleButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setShowTimeoutMs(int i2) {
        this.f14234g = i2;
        throw null;
    }

    public void setShowVrButton(boolean z) {
        Objects.requireNonNull(null);
        throw null;
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.f14235h = Util.m7741j(i2, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
    }
}
