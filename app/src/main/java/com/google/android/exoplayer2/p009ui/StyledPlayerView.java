package com.google.android.exoplayer2.p009ui;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p009ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p009ui.StyledPlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class StyledPlayerView extends FrameLayout implements AdViewProvider {

    /* renamed from: o */
    public static final /* synthetic */ int f14240o = 0;

    /* renamed from: b */
    @Nullable
    public Player f14241b;

    /* renamed from: c */
    public boolean f14242c;

    /* renamed from: d */
    @Nullable
    public StyledPlayerControlView.VisibilityListener f14243d;

    /* renamed from: e */
    public boolean f14244e;

    /* renamed from: f */
    @Nullable
    public Drawable f14245f;

    /* renamed from: g */
    public int f14246g;

    /* renamed from: h */
    public boolean f14247h;

    /* renamed from: i */
    @Nullable
    public ErrorMessageProvider<? super PlaybackException> f14248i;

    /* renamed from: j */
    public int f14249j;

    /* renamed from: k */
    public boolean f14250k;

    /* renamed from: l */
    public boolean f14251l;

    /* renamed from: m */
    public boolean f14252m;

    /* renamed from: n */
    public boolean f14253n;

    public final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.VisibilityListener {
        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2 = StyledPlayerView.f14240o;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> list) {
            int i2 = StyledPlayerView.f14240o;
            Objects.requireNonNull(null);
            throw null;
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
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = StyledPlayerView.f14240o;
            Objects.requireNonNull(null);
            throw null;
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
        public void onPlayWhenReadyChanged(boolean z, int i2) {
            int i3 = StyledPlayerView.f14240o;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i2) {
            int i3 = StyledPlayerView.f14240o;
            Objects.requireNonNull(null);
            throw null;
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
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            int i3 = StyledPlayerView.f14240o;
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            int i2 = StyledPlayerView.f14240o;
            Objects.requireNonNull(null);
            throw null;
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
        public void onTracksInfoChanged(TracksInfo tracksInfo) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    /* renamed from: a */
    public final boolean m7404a() {
        Player player = this.f14241b;
        return player != null && player.isPlayingAd() && this.f14241b.getPlayWhenReady();
    }

    /* renamed from: b */
    public final void m7405b(boolean z) {
        if (!(m7404a() && this.f14251l) && m7408e()) {
            throw null;
        }
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: c */
    public final boolean m7406c(@Nullable Drawable drawable) {
        if (drawable == null) {
            return false;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: d */
    public final void m7407d(boolean z) {
        boolean z2;
        Player player = this.f14241b;
        if (player == null || player.mo5710C().f10082b.isEmpty() || player.mo5710C().m6007b(2)) {
            return;
        }
        if (this.f14244e) {
            Assertions.m7518f(null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            byte[] bArr = player.mo5714J().f9810l;
            if (bArr != null) {
                m7406c(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            m7406c(this.f14245f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f14241b;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && m7408e()) {
            throw null;
        }
        if (m7408e()) {
            throw null;
        }
        if (super.dispatchKeyEvent(keyEvent)) {
            m7405b(true);
            return true;
        }
        if (!z || !m7408e()) {
            return false;
        }
        m7405b(true);
        return false;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: e */
    public final boolean m7408e() {
        if (!this.f14242c) {
            return false;
        }
        Assertions.m7518f(null);
        return true;
    }

    @Override // com.google.android.exoplayer2.p009ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
        return ImmutableList.m11634y(new ArrayList());
    }

    @Override // com.google.android.exoplayer2.p009ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
        Assertions.m7519g(null, "exo_ad_overlay must be present for ad playback");
        throw null;
    }

    public boolean getControllerAutoShow() {
        return this.f14250k;
    }

    public boolean getControllerHideOnTouch() {
        return this.f14252m;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14249j;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f14245f;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return null;
    }

    @Nullable
    public Player getPlayer() {
        return this.f14241b;
    }

    public int getResizeMode() {
        Assertions.m7518f(null);
        throw null;
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return null;
    }

    public boolean getUseArtwork() {
        return this.f14244e;
    }

    public boolean getUseController() {
        return this.f14242c;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m7408e() || this.f14241b == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14253n = true;
            return true;
        }
        if (action != 1 || !this.f14253n) {
            return false;
        }
        this.f14253n = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m7408e() || this.f14241b == null) {
            return false;
        }
        m7405b(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        if (!m7408e() || this.f14241b == null) {
            return false;
        }
        throw null;
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setControllerAutoShow(boolean z) {
        this.f14250k = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f14251l = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        Assertions.m7518f(null);
        this.f14252m = z;
        setContentDescription(null);
    }

    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setControllerShowTimeoutMs(int i2) {
        Assertions.m7518f(null);
        this.f14249j = i2;
        throw null;
    }

    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.VisibilityListener visibilityListener) {
        Assertions.m7518f(null);
        StyledPlayerControlView.VisibilityListener visibilityListener2 = this.f14243d;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            throw null;
        }
        this.f14243d = visibilityListener;
        if (visibilityListener != null) {
            throw null;
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        Assertions.m7516d(false);
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f14245f != drawable) {
            this.f14245f = drawable;
            m7407d(false);
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.f14248i != errorMessageProvider) {
            this.f14248i = errorMessageProvider;
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f14247h != z) {
            this.f14247h = z;
            m7407d(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.m7516d(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m7513a(player == null || player.mo5711D() == Looper.getMainLooper());
        Player player2 = this.f14241b;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo5740p(null);
        }
        this.f14241b = player;
        if (m7408e()) {
            throw null;
        }
        m7407d(true);
        if (player != null) {
            if (player.mo5632A(27)) {
                Player player3 = this.f14241b;
                int i2 = (player3 != null ? player3.mo5739o() : VideoSize.f14900f).f14901b;
            }
            player.mo5745w(null);
            m7405b(false);
        }
    }

    public void setRepeatToggleModes(int i2) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setResizeMode(int i2) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowBuffering(int i2) {
        if (this.f14246g != i2) {
            this.f14246g = i2;
        }
    }

    public void setShowFastForwardButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowNextButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowPreviousButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowRewindButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowShuffleButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowSubtitleButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShowVrButton(boolean z) {
        Assertions.m7518f(null);
        throw null;
    }

    public void setShutterBackgroundColor(int i2) {
    }

    public void setUseArtwork(boolean z) {
        Assertions.m7516d(!z);
        if (this.f14244e != z) {
            this.f14244e = z;
            m7407d(false);
        }
    }

    public void setUseController(boolean z) {
        Assertions.m7516d(!z);
        if (this.f14242c == z) {
            return;
        }
        this.f14242c = z;
        if (m7408e()) {
            throw null;
        }
        setContentDescription(null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
