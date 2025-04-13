package com.google.android.exoplayer2.p009ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
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
import com.google.android.exoplayer2.p009ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {

    /* renamed from: C */
    public static final /* synthetic */ int f14184C = 0;

    /* renamed from: A */
    public int f14185A;

    /* renamed from: B */
    public boolean f14186B;

    /* renamed from: b */
    public final ComponentListener f14187b;

    /* renamed from: c */
    @Nullable
    public final AspectRatioFrameLayout f14188c;

    /* renamed from: d */
    @Nullable
    public final View f14189d;

    /* renamed from: e */
    @Nullable
    public final View f14190e;

    /* renamed from: f */
    public final boolean f14191f;

    /* renamed from: g */
    @Nullable
    public final ImageView f14192g;

    /* renamed from: h */
    @Nullable
    public final SubtitleView f14193h;

    /* renamed from: i */
    @Nullable
    public final View f14194i;

    /* renamed from: j */
    @Nullable
    public final TextView f14195j;

    /* renamed from: k */
    @Nullable
    public final PlayerControlView f14196k;

    /* renamed from: l */
    @Nullable
    public final FrameLayout f14197l;

    /* renamed from: m */
    @Nullable
    public final FrameLayout f14198m;

    /* renamed from: n */
    @Nullable
    public Player f14199n;

    /* renamed from: o */
    public boolean f14200o;

    /* renamed from: p */
    @Nullable
    public PlayerControlView.VisibilityListener f14201p;

    /* renamed from: q */
    public boolean f14202q;

    /* renamed from: r */
    @Nullable
    public Drawable f14203r;

    /* renamed from: s */
    public int f14204s;

    /* renamed from: t */
    public boolean f14205t;

    /* renamed from: u */
    @Nullable
    public ErrorMessageProvider<? super PlaybackException> f14206u;

    /* renamed from: v */
    @Nullable
    public CharSequence f14207v;

    /* renamed from: w */
    public int f14208w;

    /* renamed from: x */
    public boolean f14209x;

    /* renamed from: y */
    public boolean f14210y;

    /* renamed from: z */
    public boolean f14211z;

    public final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.VisibilityListener {

        /* renamed from: b */
        public final Timeline.Period f14212b = new Timeline.Period();

        /* renamed from: c */
        @Nullable
        public Object f14213c;

        public ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
        /* renamed from: e4 */
        public void mo7378e4(int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.f14184C;
            playerView.m7392n();
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.f14184C;
            playerView.m7389k();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> list) {
            SubtitleView subtitleView = PlayerView.this.f14193h;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
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
            PlayerView.m7379a((TextureView) view, PlayerView.this.f14185A);
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
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.f14184C;
            playerView.m7391m();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.m7383e() && playerView2.f14210y) {
                playerView2.m7382d();
            } else {
                playerView2.m7384f(false);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i2) {
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.f14184C;
            playerView.m7391m();
            PlayerView.this.m7393o();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.m7383e() && playerView2.f14210y) {
                playerView2.m7382d();
            } else {
                playerView2.m7384f(false);
            }
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
            PlayerView playerView = PlayerView.this;
            int i3 = PlayerView.f14184C;
            if (playerView.m7383e()) {
                PlayerView playerView2 = PlayerView.this;
                if (playerView2.f14210y) {
                    playerView2.m7382d();
                }
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            View view = PlayerView.this.f14189d;
            if (view != null) {
                view.setVisibility(4);
            }
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
            Player player = PlayerView.this.f14199n;
            Objects.requireNonNull(player);
            Timeline currentTimeline = player.getCurrentTimeline();
            if (currentTimeline.m5991s()) {
                this.f14213c = null;
            } else if (player.mo5710C().f10082b.isEmpty()) {
                Object obj = this.f14213c;
                if (obj != null) {
                    int mo5609d = currentTimeline.mo5609d(obj);
                    if (mo5609d != -1) {
                        if (player.getCurrentMediaItemIndex() == currentTimeline.m5987h(mo5609d, this.f14212b).f10051d) {
                            return;
                        }
                    }
                    this.f14213c = null;
                }
            } else {
                this.f14213c = currentTimeline.mo5612i(player.getCurrentPeriodIndex(), this.f14212b, true).f10050c;
            }
            PlayerView.this.m7394p(false);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            PlayerView playerView = PlayerView.this;
            int i2 = PlayerView.f14184C;
            playerView.m7390l();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        ComponentListener componentListener = new ComponentListener();
        this.f14187b = componentListener;
        if (isInEditMode()) {
            this.f14188c = null;
            this.f14189d = null;
            this.f14190e = null;
            this.f14191f = false;
            this.f14192g = null;
            this.f14193h = null;
            this.f14194i = null;
            this.f14195j = null;
            this.f14196k = null;
            this.f14197l = null;
            this.f14198m = null;
            ImageView imageView = new ImageView(context);
            if (Util.f14736a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(C2507R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(C2507R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(C2507R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(C2507R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i8 = C2507R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1140R.styleable.f14218d, 0, 0);
            try {
                z4 = obtainStyledAttributes.hasValue(23);
                i2 = obtainStyledAttributes.getColor(23, 0);
                i8 = obtainStyledAttributes.getResourceId(12, C2507R.layout.exo_player_view);
                z5 = obtainStyledAttributes.getBoolean(28, true);
                i6 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z8 = obtainStyledAttributes.getBoolean(29, true);
                i4 = obtainStyledAttributes.getInt(24, 1);
                i3 = obtainStyledAttributes.getInt(14, 0);
                int i9 = obtainStyledAttributes.getInt(22, 5000);
                boolean z9 = obtainStyledAttributes.getBoolean(8, true);
                boolean z10 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.f14205t = obtainStyledAttributes.getBoolean(9, this.f14205t);
                z = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                z3 = z9;
                i5 = integer;
                i7 = i9;
                z2 = z10;
                z6 = z8;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            i2 = 0;
            i3 = 0;
            i4 = 1;
            z2 = true;
            i5 = 0;
            z3 = true;
            z4 = false;
            z5 = true;
            i6 = 0;
            i7 = 5000;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C2507R.id.exo_content_frame);
        this.f14188c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i3);
        }
        View findViewById = findViewById(C2507R.id.exo_shutter);
        this.f14189d = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i2);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f14190e = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f14190e = new TextureView(context);
            } else if (i4 == 3) {
                try {
                    this.f14190e = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.f14190e.setLayoutParams(layoutParams);
                    this.f14190e.setOnClickListener(componentListener);
                    this.f14190e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f14190e, 0);
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i4 != 4) {
                this.f14190e = new SurfaceView(context);
            } else {
                try {
                    this.f14190e = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z7 = false;
            this.f14190e.setLayoutParams(layoutParams);
            this.f14190e.setOnClickListener(componentListener);
            this.f14190e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14190e, 0);
        }
        this.f14191f = z7;
        this.f14197l = (FrameLayout) findViewById(C2507R.id.exo_ad_overlay);
        this.f14198m = (FrameLayout) findViewById(C2507R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C2507R.id.exo_artwork);
        this.f14192g = imageView2;
        this.f14202q = z5 && imageView2 != null;
        if (i6 != 0) {
            this.f14203r = ContextCompat.m1671d(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C2507R.id.exo_subtitles);
        this.f14193h = subtitleView;
        if (subtitleView != null) {
            subtitleView.m7410a();
            subtitleView.m7411b();
        }
        View findViewById2 = findViewById(C2507R.id.exo_buffering);
        this.f14194i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14204s = i5;
        TextView textView = (TextView) findViewById(C2507R.id.exo_error_message);
        this.f14195j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(C2507R.id.exo_controller);
        View findViewById3 = findViewById(C2507R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f14196k = playerControlView;
        } else if (findViewById3 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f14196k = playerControlView2;
            playerControlView2.setId(C2507R.id.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            this.f14196k = null;
        }
        PlayerControlView playerControlView3 = this.f14196k;
        this.f14208w = playerControlView3 != null ? i7 : 0;
        this.f14211z = z3;
        this.f14209x = z2;
        this.f14210y = z;
        this.f14200o = z6 && playerControlView3 != null;
        m7382d();
        m7392n();
        PlayerControlView playerControlView4 = this.f14196k;
        if (playerControlView4 != null) {
            playerControlView4.f14155c.add(componentListener);
        }
    }

    /* renamed from: a */
    public static void m7379a(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: b */
    public final void m7380b() {
        View view = this.f14189d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void m7381c() {
        ImageView imageView = this.f14192g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f14192g.setVisibility(4);
        }
    }

    /* renamed from: d */
    public void m7382d() {
        PlayerControlView playerControlView = this.f14196k;
        if (playerControlView != null) {
            playerControlView.m7359c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f14199n;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z && m7395q() && !this.f14196k.m7361e()) {
            m7384f(true);
        } else {
            if (!(m7395q() && this.f14196k.m7357a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !m7395q()) {
                    return false;
                }
                m7384f(true);
                return false;
            }
            m7384f(true);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m7383e() {
        Player player = this.f14199n;
        return player != null && player.isPlayingAd() && this.f14199n.getPlayWhenReady();
    }

    /* renamed from: f */
    public final void m7384f(boolean z) {
        if (!(m7383e() && this.f14210y) && m7395q()) {
            boolean z2 = this.f14196k.m7361e() && this.f14196k.getShowTimeoutMs() <= 0;
            boolean m7386h = m7386h();
            if (z || z2 || m7386h) {
                m7388j(m7386h);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: g */
    public final boolean m7385g(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f2 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14188c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f2);
                }
                this.f14192g.setImageDrawable(drawable);
                this.f14192g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.p009ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14198m;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f14196k;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView, 0));
        }
        return ImmutableList.m11634y(arrayList);
    }

    @Override // com.google.android.exoplayer2.p009ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14197l;
        Assertions.m7519g(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f14209x;
    }

    public boolean getControllerHideOnTouch() {
        return this.f14211z;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14208w;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f14203r;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f14198m;
    }

    @Nullable
    public Player getPlayer() {
        return this.f14199n;
    }

    public int getResizeMode() {
        Assertions.m7518f(this.f14188c);
        return this.f14188c.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f14193h;
    }

    public boolean getUseArtwork() {
        return this.f14202q;
    }

    public boolean getUseController() {
        return this.f14200o;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f14190e;
    }

    /* renamed from: h */
    public final boolean m7386h() {
        Player player = this.f14199n;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        return this.f14209x && (playbackState == 1 || playbackState == 4 || !this.f14199n.getPlayWhenReady());
    }

    /* renamed from: i */
    public void m7387i() {
        m7388j(m7386h());
    }

    /* renamed from: j */
    public final void m7388j(boolean z) {
        if (m7395q()) {
            this.f14196k.setShowTimeoutMs(z ? 0 : this.f14208w);
            PlayerControlView playerControlView = this.f14196k;
            if (!playerControlView.m7361e()) {
                playerControlView.setVisibility(0);
                Iterator<PlayerControlView.VisibilityListener> it = playerControlView.f14155c.iterator();
                while (it.hasNext()) {
                    it.next().mo7378e4(playerControlView.getVisibility());
                }
                playerControlView.m7365i();
                playerControlView.m7363g();
                playerControlView.m7362f();
            }
            playerControlView.m7360d();
        }
    }

    /* renamed from: k */
    public final boolean m7389k() {
        if (!m7395q() || this.f14199n == null) {
            return false;
        }
        if (!this.f14196k.m7361e()) {
            m7384f(true);
        } else if (this.f14211z) {
            this.f14196k.m7359c();
        }
        return true;
    }

    /* renamed from: l */
    public final void m7390l() {
        Player player = this.f14199n;
        VideoSize mo5739o = player != null ? player.mo5739o() : VideoSize.f14900f;
        int i2 = mo5739o.f14901b;
        int i3 = mo5739o.f14902c;
        int i4 = mo5739o.f14903d;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * mo5739o.f14904e) / i3;
        View view = this.f14190e;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.f14185A != 0) {
                view.removeOnLayoutChangeListener(this.f14187b);
            }
            this.f14185A = i4;
            if (i4 != 0) {
                this.f14190e.addOnLayoutChangeListener(this.f14187b);
            }
            m7379a((TextureView) this.f14190e, this.f14185A);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14188c;
        float f3 = this.f14191f ? 0.0f : f2;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f3);
        }
    }

    /* renamed from: m */
    public final void m7391m() {
        int i2;
        if (this.f14194i != null) {
            Player player = this.f14199n;
            boolean z = true;
            if (player == null || player.getPlaybackState() != 2 || ((i2 = this.f14204s) != 2 && (i2 != 1 || !this.f14199n.getPlayWhenReady()))) {
                z = false;
            }
            this.f14194i.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: n */
    public final void m7392n() {
        PlayerControlView playerControlView = this.f14196k;
        if (playerControlView == null || !this.f14200o) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f14211z ? getResources().getString(C2507R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(C2507R.string.exo_controls_show));
        }
    }

    /* renamed from: o */
    public final void m7393o() {
        ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
        TextView textView = this.f14195j;
        if (textView != null) {
            CharSequence charSequence = this.f14207v;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f14195j.setVisibility(0);
                return;
            }
            Player player = this.f14199n;
            PlaybackException mo5703a = player != null ? player.mo5703a() : null;
            if (mo5703a == null || (errorMessageProvider = this.f14206u) == null) {
                this.f14195j.setVisibility(8);
            } else {
                this.f14195j.setText((CharSequence) errorMessageProvider.m7541a(mo5703a).second);
                this.f14195j.setVisibility(0);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m7395q() || this.f14199n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14186B = true;
            return true;
        }
        if (action != 1 || !this.f14186B) {
            return false;
        }
        this.f14186B = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m7395q() || this.f14199n == null) {
            return false;
        }
        m7384f(true);
        return true;
    }

    /* renamed from: p */
    public final void m7394p(boolean z) {
        boolean z2;
        Player player = this.f14199n;
        if (player == null || !player.mo5632A(30) || player.mo5710C().f10082b.isEmpty()) {
            if (this.f14205t) {
                return;
            }
            m7381c();
            m7380b();
            return;
        }
        if (z && !this.f14205t) {
            m7380b();
        }
        if (player.mo5710C().m6007b(2)) {
            m7381c();
            return;
        }
        m7380b();
        boolean z3 = false;
        if (this.f14202q) {
            Assertions.m7518f(this.f14192g);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            byte[] bArr = player.mo5714J().f9810l;
            if (bArr != null) {
                z3 = m7385g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (z3 || m7385g(this.f14203r)) {
                return;
            }
        }
        m7381c();
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return m7389k();
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: q */
    public final boolean m7395q() {
        if (!this.f14200o) {
            return false;
        }
        Assertions.m7518f(this.f14196k);
        return true;
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        Assertions.m7518f(this.f14188c);
        this.f14188c.setAspectRatioListener(aspectRatioListener);
    }

    public void setControllerAutoShow(boolean z) {
        this.f14209x = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f14210y = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14211z = z;
        m7392n();
    }

    public void setControllerShowTimeoutMs(int i2) {
        Assertions.m7518f(this.f14196k);
        this.f14208w = i2;
        if (this.f14196k.m7361e()) {
            m7387i();
        }
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.VisibilityListener visibilityListener) {
        Assertions.m7518f(this.f14196k);
        PlayerControlView.VisibilityListener visibilityListener2 = this.f14201p;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            this.f14196k.f14155c.remove(visibilityListener2);
        }
        this.f14201p = visibilityListener;
        if (visibilityListener != null) {
            PlayerControlView playerControlView = this.f14196k;
            Objects.requireNonNull(playerControlView);
            playerControlView.f14155c.add(visibilityListener);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        Assertions.m7516d(this.f14195j != null);
        this.f14207v = charSequence;
        m7393o();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f14203r != drawable) {
            this.f14203r = drawable;
            m7394p(false);
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.f14206u != errorMessageProvider) {
            this.f14206u = errorMessageProvider;
            m7393o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f14205t != z) {
            this.f14205t = z;
            m7394p(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.m7516d(Looper.myLooper() == Looper.getMainLooper());
        Assertions.m7513a(player == null || player.mo5711D() == Looper.getMainLooper());
        Player player2 = this.f14199n;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo5740p(this.f14187b);
            if (player2.mo5632A(27)) {
                View view = this.f14190e;
                if (view instanceof TextureView) {
                    player2.mo5738n((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.mo5709B((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f14193h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f14199n = player;
        if (m7395q()) {
            this.f14196k.setPlayer(player);
        }
        m7391m();
        m7393o();
        m7394p(true);
        if (player == null) {
            m7382d();
            return;
        }
        if (player.mo5632A(27)) {
            View view2 = this.f14190e;
            if (view2 instanceof TextureView) {
                player.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                player.mo5741q((SurfaceView) view2);
            }
            m7390l();
        }
        if (this.f14193h != null && player.mo5632A(28)) {
            this.f14193h.setCues(player.mo5747z());
        }
        player.mo5745w(this.f14187b);
        m7384f(false);
    }

    public void setRepeatToggleModes(int i2) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        Assertions.m7518f(this.f14188c);
        this.f14188c.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.f14204s != i2) {
            this.f14204s = i2;
            m7391m();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        Assertions.m7518f(this.f14196k);
        this.f14196k.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f14189d;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z) {
        Assertions.m7516d((z && this.f14192g == null) ? false : true);
        if (this.f14202q != z) {
            this.f14202q = z;
            m7394p(false);
        }
    }

    public void setUseController(boolean z) {
        Assertions.m7516d((z && this.f14196k == null) ? false : true);
        if (this.f14200o == z) {
            return;
        }
        this.f14200o = z;
        if (m7395q()) {
            this.f14196k.setPlayer(this.f14199n);
        } else {
            PlayerControlView playerControlView = this.f14196k;
            if (playerControlView != null) {
                playerControlView.m7359c();
                this.f14196k.setPlayer(null);
            }
        }
        m7392n();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f14190e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }
}
