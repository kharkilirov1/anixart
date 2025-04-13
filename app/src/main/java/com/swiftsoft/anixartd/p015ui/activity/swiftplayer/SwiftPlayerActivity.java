package com.swiftsoft.anixartd.p015ui.activity.swiftplayer;

import android.app.PictureInPictureParams;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.util.Rational;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.google.android.exoplayer2.ext.okhttp.OkHttpDataSource;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.p009ui.PlayerControlView;
import com.google.android.exoplayer2.p009ui.PlayerView;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.firebase.auth.C2052a;
import com.skydoves.balloon.ActivityBalloonLazy;
import com.skydoves.balloon.Balloon;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.activity.swiftplayer.SwiftPlayerActivity;
import com.swiftsoft.anixartd.p015ui.logic.player.PlayerUiLogic;
import com.swiftsoft.anixartd.p015ui.tooltip.PlayerSkipOpeningBalloonFactory;
import com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter;
import com.swiftsoft.anixartd.presentation.player.SwiftPlayerView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.FitsSystemWindowRelativeLayout;
import com.swiftsoft.anixartd.utils.Quality;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.div2.C3033a;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpAppCompatActivity;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SwiftPlayerActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/SwiftPlayerActivity;", "Lmoxy/MvpAppCompatActivity;", "Lcom/swiftsoft/anixartd/presentation/player/SwiftPlayerView;", "Lcom/google/android/exoplayer2/ui/PlayerControlView$VisibilityListener;", "<init>", "()V", "AudioActionReceiver", "ComponentListener", "FullScreenListener", "TYPE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SwiftPlayerActivity extends MvpAppCompatActivity implements SwiftPlayerView, PlayerControlView.VisibilityListener {

    /* renamed from: A */
    @Nullable
    public String f27542A;

    /* renamed from: B */
    @Nullable
    public String f27543B;

    /* renamed from: C */
    @Nullable
    public String f27544C;

    /* renamed from: D */
    @NotNull
    public List<String> f27545D;

    /* renamed from: E */
    @NotNull
    public String f27546E;

    /* renamed from: F */
    @NotNull
    public List<Episode> f27547F;

    /* renamed from: G */
    public int f27548G;

    /* renamed from: H */
    public int f27549H;

    /* renamed from: I */
    public float f27550I;

    /* renamed from: J */
    @NotNull
    public View.OnTouchListener f27551J;

    /* renamed from: K */
    @NotNull
    public Map<Integer, View> f27552K = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public final Lazy f27553b = new ActivityBalloonLazy(this, this, Reflection.m32193a(PlayerSkipOpeningBalloonFactory.class));

    /* renamed from: c */
    @Inject
    public dagger.Lazy<SwiftPlayerPresenter> f27554c;

    /* renamed from: d */
    @NotNull
    public final MoxyKtxDelegate f27555d;

    /* renamed from: e */
    public ExoPlayer f27556e;

    /* renamed from: f */
    public PlayerView f27557f;

    /* renamed from: g */
    public GestureDetector f27558g;

    /* renamed from: h */
    public MediaSessionCompat f27559h;

    /* renamed from: i */
    public MediaSessionConnector f27560i;

    /* renamed from: j */
    @NotNull
    public AudioActionReceiver f27561j;

    /* renamed from: k */
    @NotNull
    public IntentFilter f27562k;

    /* renamed from: l */
    public boolean f27563l;

    /* renamed from: m */
    @NotNull
    public final FullScreenListener f27564m;

    /* renamed from: n */
    @NotNull
    public final ComponentListener f27565n;

    /* renamed from: o */
    public int f27566o;

    /* renamed from: p */
    public int f27567p;

    /* renamed from: q */
    public long f27568q;

    /* renamed from: r */
    public long f27569r;

    /* renamed from: s */
    public boolean f27570s;

    /* renamed from: t */
    public boolean f27571t;

    /* renamed from: u */
    public boolean f27572u;

    /* renamed from: v */
    public Release f27573v;

    /* renamed from: w */
    @Nullable
    public String f27574w;

    /* renamed from: x */
    @Nullable
    public String f27575x;

    /* renamed from: y */
    @Nullable
    public String f27576y;

    /* renamed from: z */
    @Nullable
    public String f27577z;

    /* renamed from: M */
    public static final /* synthetic */ KProperty<Object>[] f27541M = {C2052a.m12277l(SwiftPlayerActivity.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/player/SwiftPlayerPresenter;", 0)};

    /* renamed from: L */
    @NotNull
    public static final TYPE f27540L = new TYPE(null);

    /* compiled from: SwiftPlayerActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/SwiftPlayerActivity$AudioActionReceiver;", "Landroid/content/BroadcastReceiver;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public final class AudioActionReceiver extends BroadcastReceiver {
        public AudioActionReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(intent, "intent");
            if (Intrinsics.m32174c(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                ExoPlayer exoPlayer = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer != null) {
                    exoPlayer.setPlayWhenReady(false);
                } else {
                    Intrinsics.m32189r("player");
                    throw null;
                }
            }
        }
    }

    /* compiled from: SwiftPlayerActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/SwiftPlayerActivity$ComponentListener;", "Lcom/google/android/exoplayer2/Player$Listener;", "Landroid/view/GestureDetector$OnGestureListener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public final class ComponentListener implements Player.Listener, GestureDetector.OnGestureListener {
        public ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
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

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent event) {
            Intrinsics.m32179h(event, "event");
            System.out.println((Object) "onDown");
            return true;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(@NotNull MotionEvent event1, @NotNull MotionEvent event2, float f2, float f3) {
            Intrinsics.m32179h(event1, "event1");
            Intrinsics.m32179h(event2, "event2");
            return false;
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

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent e2) {
            Intrinsics.m32179h(e2, "e");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
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
        public void onPlayerStateChanged(boolean z, int i2) {
            String str;
            SwiftPlayerActivity swiftPlayerActivity = SwiftPlayerActivity.this;
            TYPE type = SwiftPlayerActivity.f27540L;
            Objects.requireNonNull(swiftPlayerActivity);
            if (i2 == 1) {
                str = "ExoPlayer.STATE_IDLE";
            } else if (i2 == 2) {
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).setVisibility(8);
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).animate().alpha(0.0f).setDuration(450L).start();
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).setVisibility(0);
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).animate().alpha(1.0f).setDuration(450L).start();
                str = "ExoPlayer.STATE_BUFFERING";
            } else if (i2 == 3) {
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).setVisibility(8);
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).animate().alpha(0.0f).setDuration(450L).start();
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).setVisibility(0);
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).animate().alpha(1.0f).setDuration(450L).start();
                str = "ExoPlayer.STATE_READY";
            } else if (i2 != 4) {
                str = "UNKNOWN_STATE";
            } else {
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).setVisibility(8);
                ((ProgressBar) SwiftPlayerActivity.this.m15347s4(C2507R.id.progress_bar)).animate().alpha(0.0f).setDuration(450L).start();
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).setVisibility(0);
                ((LinearLayout) SwiftPlayerActivity.this.m15347s4(C2507R.id.navButtons)).animate().alpha(1.0f).setDuration(450L).start();
                SwiftPlayerPresenter m15350v4 = SwiftPlayerActivity.this.m15350v4();
                ExoPlayer exoPlayer = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                long duration = exoPlayer.getDuration();
                ExoPlayer exoPlayer2 = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer2 == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                m15350v4.m15266d(duration, exoPlayer2.getCurrentPosition());
                SwiftPlayerActivity swiftPlayerActivity2 = SwiftPlayerActivity.this;
                swiftPlayerActivity2.f27568q = 0L;
                if (swiftPlayerActivity2.m15350v4().f27299b.f25344a.getBoolean("AUTO_PLAY", false) && SwiftPlayerActivity.this.m15350v4().f27300c.m15712b()) {
                    SwiftPlayerActivity.this.m15350v4().m15264b();
                } else {
                    SwiftPlayerActivity.this.finish();
                }
                str = "ExoPlayer.STATE_ENDED";
            }
            if (z) {
                SwiftPlayerActivity.this.getWindow().addFlags(128);
            } else {
                SwiftPlayerActivity.this.getWindow().clearFlags(128);
            }
            Log.d("LOG", "changed state to " + str + " playWhenReady: " + z);
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

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@NotNull MotionEvent e1, @NotNull MotionEvent e2, float f2, float f3) {
            Intrinsics.m32179h(e1, "e1");
            Intrinsics.m32179h(e2, "e2");
            float y = e2.getY() - e1.getY();
            float x = e2.getX() - e1.getX();
            if (Math.abs(x) > Math.abs(y) && Math.abs(x) > 100.0f) {
                SwiftPlayerActivity swiftPlayerActivity = SwiftPlayerActivity.this;
                if (!swiftPlayerActivity.f27571t) {
                    if (swiftPlayerActivity.f27557f == null) {
                        Intrinsics.m32189r("playerView");
                        throw null;
                    }
                    int width = (int) ((x / r1.getWidth()) * 100.0f);
                    long millis = TimeUnit.SECONDS.toMillis(((long) (Math.pow(width, 2.0d) / 25.0d)) * (width < 0 ? -1 : 1));
                    swiftPlayerActivity.f27569r = millis;
                    if (millis != 0) {
                        PlayerView playerView = swiftPlayerActivity.f27557f;
                        if (playerView == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView.setControllerShowTimeoutMs(0);
                        ((TextView) swiftPlayerActivity.m15347s4(C2507R.id.scrollTime)).setVisibility(0);
                        ((LinearLayout) swiftPlayerActivity.m15347s4(C2507R.id.navButtons)).setVisibility(8);
                        ((ProgressBar) swiftPlayerActivity.m15347s4(C2507R.id.progress_bar)).setVisibility(8);
                        ExoPlayer exoPlayer = swiftPlayerActivity.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.setPlayWhenReady(false);
                        StringBuilder sb = new StringBuilder();
                        sb.append(swiftPlayerActivity.f27569r > 0 ? "+" : "-");
                        String format = new SimpleDateFormat("mm:ss").format(new Date(Math.abs(swiftPlayerActivity.f27569r)));
                        Intrinsics.m32178g(format, "sdf.format(date)");
                        sb.append(format);
                        ((TextView) swiftPlayerActivity.m15347s4(C2507R.id.scrollTime)).setText(sb.toString());
                    }
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(@NotNull MotionEvent e2) {
            Intrinsics.m32179h(e2, "e");
            System.out.println((Object) "onShowPress");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@NotNull MotionEvent e2) {
            Intrinsics.m32179h(e2, "e");
            System.out.println((Object) "onSingleTabUp");
            return true;
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

    /* compiled from: SwiftPlayerActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/SwiftPlayerActivity$FullScreenListener;", "Landroid/view/View$OnSystemUiVisibilityChangeListener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public final class FullScreenListener implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        public int f27581a;

        public FullScreenListener() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i2) {
            this.f27581a = i2;
            if ((i2 & 4) == 0) {
                PlayerView playerView = SwiftPlayerActivity.this.f27557f;
                if (playerView != null) {
                    playerView.m7387i();
                } else {
                    Intrinsics.m32189r("playerView");
                    throw null;
                }
            }
        }
    }

    /* compiled from: SwiftPlayerActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/SwiftPlayerActivity$TYPE;", "", "", "COOKIE", "Ljava/lang/String;", "EPISODES_VALUE", "INDEX_VALUE", "PLAYBACK_POSITION_VALUE", "QUALITY_DEFAULT_VALUE", "QUALITY_HIGH_VALUE", "QUALITY_LOW_VALUE", "QUALITY_MEDIUM_VALUE", "QUALITY_ULTRA_HIGH_VALUE", "RELEASE_VALUE", "SELECTED_STANDARD_QUALITY_POS", "SORT_VALUE", "URL_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class TYPE {
        public TYPE() {
        }

        public TYPE(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SwiftPlayerActivity() {
        Function0<SwiftPlayerPresenter> function0 = new Function0<SwiftPlayerPresenter>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SwiftPlayerPresenter invoke() {
                dagger.Lazy<SwiftPlayerPresenter> lazy = SwiftPlayerActivity.this.f27554c;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27555d = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SwiftPlayerPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f27561j = new AudioActionReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        this.f27562k = intentFilter;
        this.f27564m = new FullScreenListener();
        this.f27565n = new ComponentListener();
        this.f27570s = true;
        this.f27574w = "";
        this.f27575x = "";
        this.f27545D = new ArrayList();
        this.f27546E = "";
        this.f27547F = new ArrayList();
        this.f27550I = 1.0f;
        this.f27551J = new View.OnTouchListener() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                SwiftPlayerActivity this$0 = SwiftPlayerActivity.this;
                SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                Intrinsics.m32179h(this$0, "this$0");
                if (motionEvent.getAction() == 1) {
                    if (!this$0.f27571t) {
                        if (this$0.f27572u) {
                            PlayerView playerView = this$0.f27557f;
                            if (playerView == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView.m7387i();
                        } else if (Math.abs(this$0.f27569r) > 0) {
                            PlayerView playerView2 = this$0.f27557f;
                            if (playerView2 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView2.setControllerShowTimeoutMs(5000);
                        } else {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.m7382d();
                        }
                        if (Math.abs(this$0.f27569r) > 0) {
                            ExoPlayer exoPlayer = this$0.f27556e;
                            if (exoPlayer == null) {
                                Intrinsics.m32189r("player");
                                throw null;
                            }
                            exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + this$0.f27569r);
                            ExoPlayer exoPlayer2 = this$0.f27556e;
                            if (exoPlayer2 == null) {
                                Intrinsics.m32189r("player");
                                throw null;
                            }
                            exoPlayer2.setPlayWhenReady(true);
                            ((TextView) this$0.m15347s4(C2507R.id.scrollTime)).setVisibility(8);
                            this$0.f27569r = 0L;
                            ((LinearLayout) this$0.m15347s4(C2507R.id.navButtons)).setVisibility(8);
                            ((LinearLayout) this$0.m15347s4(C2507R.id.navButtons)).animate().alpha(0.0f).setDuration(450L).start();
                            ((ProgressBar) this$0.m15347s4(C2507R.id.progress_bar)).setVisibility(0);
                            ((ProgressBar) this$0.m15347s4(C2507R.id.progress_bar)).animate().alpha(1.0f).setDuration(450L).start();
                        }
                    } else if (this$0.f27572u) {
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView4.m7387i();
                    } else {
                        PlayerView playerView5 = this$0.f27557f;
                        if (playerView5 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView5.m7382d();
                    }
                }
                GestureDetector gestureDetector = this$0.f27558g;
                if (gestureDetector != null) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                Intrinsics.m32189r("mDetector");
                throw null;
            }
        };
    }

    /* renamed from: A4 */
    public final void m15345A4(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = getWindow().getDecorView();
            Intrinsics.m32178g(decorView, "window.decorView");
            decorView.setSystemUiVisibility(z ? 1799 : 1792);
        } else if (!z) {
            WindowCompat.m2404a(getWindow(), true);
            new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView()).m2474f(3);
        } else {
            WindowCompat.m2404a(getWindow(), false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
            windowInsetsControllerCompat.m2469a(3);
            windowInsetsControllerCompat.m2473e(2);
        }
    }

    /* renamed from: B4 */
    public final void m15346B4(int i2, boolean z) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags = i2 | attributes.flags;
        } else {
            attributes.flags = (~i2) & attributes.flags;
        }
        window.setAttributes(attributes);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: S1 */
    public void mo15267S1() {
        Balloon balloon = (Balloon) this.f27553b.getValue();
        ImageView fastRewind = (ImageView) m15347s4(C2507R.id.fastRewind);
        Intrinsics.m32178g(fastRewind, "fastRewind");
        balloon.m13855s(fastRewind, 0, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: a */
    public void mo15268a() {
        ProgressBar progress_bar = (ProgressBar) m15347s4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16380m(progress_bar, false);
        ((ProgressBar) m15347s4(C2507R.id.progress_bar)).animate().alpha(0.0f).setDuration(450L).start();
        LinearLayout navButtons = (LinearLayout) m15347s4(C2507R.id.navButtons);
        Intrinsics.m32178g(navButtons, "navButtons");
        ViewsKt.m16380m(navButtons, true);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: a4 */
    public void mo15269a4() {
        PlayerUiLogic playerUiLogic = m15350v4().f27300c;
        String name = playerUiLogic.f29375c.get(playerUiLogic.f29376d).getName();
        if (!(name == null || name.length() == 0)) {
            ((TextView) m15347s4(C2507R.id.tvEpisodeName)).setText(name);
            return;
        }
        TextView tvEpisodeName = (TextView) m15347s4(C2507R.id.tvEpisodeName);
        Intrinsics.m32178g(tvEpisodeName, "tvEpisodeName");
        ViewsKt.m16380m(tvEpisodeName, false);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: b */
    public void mo15270b() {
        ProgressBar progress_bar = (ProgressBar) m15347s4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16380m(progress_bar, true);
        ((ProgressBar) m15347s4(C2507R.id.progress_bar)).animate().alpha(1.0f).setDuration(450L).start();
        LinearLayout navButtons = (LinearLayout) m15347s4(C2507R.id.navButtons);
        Intrinsics.m32178g(navButtons, "navButtons");
        ViewsKt.m16380m(navButtons, false);
    }

    @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
    /* renamed from: e4 */
    public void mo7378e4(int i2) {
        if (i2 == 0) {
            if (this.f27564m.f27581a != 0) {
                m15345A4(false);
            }
            this.f27572u = false;
        } else {
            if (i2 != 8) {
                return;
            }
            m15345A4(true);
            this.f27572u = true;
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: h4 */
    public void mo15271h4() {
        Dialogs.f30143a.m16306c(this, "Ошибка", "Невозможно воспроизвести видео в выбранном плеере. Попробуйте использовать Веб-плеер.", (r12 & 8) != 0 ? "Ок" : null, null);
        m15351w4();
        PlayerView playerView = this.f27557f;
        if (playerView == null) {
            Intrinsics.m32189r("playerView");
            throw null;
        }
        View view = playerView.f14190e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: l1 */
    public void mo15272l1() {
        String titleOriginal;
        Release m15711a = m15350v4().f27300c.m15711a();
        String titleRu = m15711a.getTitleRu();
        boolean z = true;
        if (titleRu == null || titleRu.length() == 0) {
            String titleOriginal2 = m15711a.getTitleOriginal();
            titleOriginal = !(titleOriginal2 == null || titleOriginal2.length() == 0) ? m15711a.getTitleOriginal() : "Без названия";
        } else {
            titleOriginal = m15711a.getTitleRu();
        }
        if (titleOriginal != null && titleOriginal.length() != 0) {
            z = false;
        }
        if (!z) {
            ((TextView) m15347s4(C2507R.id.tvTitleName)).setText(titleOriginal);
            return;
        }
        TextView tvTitleName = (TextView) m15347s4(C2507R.id.tvTitleName);
        Intrinsics.m32178g(tvTitleName, "tvTitleName");
        ViewsKt.m16380m(tvTitleName, false);
    }

    @Override // com.swiftsoft.anixartd.presentation.player.SwiftPlayerView
    /* renamed from: l2 */
    public void mo15273l2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j2, boolean z, boolean z2) {
        ((ImageButton) m15347s4(C2507R.id.previous)).setEnabled(z);
        ((ImageButton) m15347s4(C2507R.id.next)).setEnabled(z2);
        this.f27568q = j2;
        this.f27570s = j2 > 0;
        m15352x4(str, str2, str3, str4, str5);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.m32179h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 1) {
            PlayerView playerView = this.f27557f;
            if (playerView != null) {
                playerView.setResizeMode(0);
            } else {
                Intrinsics.m32189r("playerView");
                throw null;
            }
        }
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        float f2;
        App.f25340b.m14043a().mo14162z0(this);
        super.onCreate(bundle);
        setContentView(C2507R.layout.activity_player);
        SwiftPlayerPresenter m15350v4 = m15350v4();
        if (!m15350v4.f27299b.f25344a.getBoolean("TOOLTIP_PLAYER_SKIP_OPENING", false)) {
            m15350v4.getViewState().mo15267S1();
            C3033a.m17749k(m15350v4.f27299b.f25344a, "TOOLTIP_PLAYER_SKIP_OPENING", true);
        }
        this.f27566o = m15350v4().f27299b.f25344a.getInt("SELECTED_VIDEO_QUALITY", 0);
        Serializable serializableExtra = getIntent().getSerializableExtra("RELEASE_VALUE");
        Intrinsics.m32177f(serializableExtra, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
        this.f27573v = (Release) serializableExtra;
        if (getIntent().getStringExtra("COOKIE") != null) {
            this.f27574w = getIntent().getStringExtra("COOKIE");
        }
        if (getIntent().getStringExtra("URL_VALUE") != null) {
            this.f27575x = getIntent().getStringExtra("URL_VALUE");
        }
        String stringExtra = getIntent().getStringExtra("QUALITY_DEFAULT_VALUE");
        String stringExtra2 = getIntent().getStringExtra("QUALITY_LOW_VALUE");
        String stringExtra3 = getIntent().getStringExtra("QUALITY_MEDIUM_VALUE");
        String stringExtra4 = getIntent().getStringExtra("QUALITY_HIGH_VALUE");
        String stringExtra5 = getIntent().getStringExtra("QUALITY_ULTRA_HIGH_VALUE");
        Object serializableExtra2 = getIntent().getSerializableExtra("EPISODES_VALUE");
        Intrinsics.m32177f(serializableExtra2, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) serializableExtra2;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            String str6 = stringExtra;
            List<Episode> list = this.f27547F;
            Intrinsics.m32177f(obj, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.episode.Episode");
            list.add((Episode) obj);
            i2++;
            stringExtra = str6;
            stringExtra2 = stringExtra2;
        }
        String str7 = stringExtra;
        String str8 = stringExtra2;
        this.f27548G = getIntent().getIntExtra("INDEX_VALUE", 0);
        this.f27549H = getIntent().getIntExtra("SORT_VALUE", 0);
        long longExtra = getIntent().getLongExtra("PLAYBACK_POSITION_VALUE", 0L);
        this.f27568q = longExtra;
        this.f27570s = longExtra > 0;
        if (bundle != null) {
            str3 = bundle.getString("QUALITY_DEFAULT_VALUE");
            str4 = bundle.getString("QUALITY_LOW_VALUE");
            String string = bundle.getString("QUALITY_MEDIUM_VALUE");
            String string2 = bundle.getString("QUALITY_HIGH_VALUE");
            String string3 = bundle.getString("QUALITY_ULTRA_HIGH_VALUE");
            this.f27566o = bundle.getInt("SELECTED_STANDARD_QUALITY_POS");
            this.f27548G = bundle.getInt("INDEX_VALUE");
            this.f27549H = bundle.getInt("SORT_VALUE");
            this.f27568q = bundle.getLong("PLAYBACK_POSITION_VALUE", 0L);
            this.f27570s = false;
            str = string;
            str2 = string2;
            str5 = string3;
        } else {
            str = stringExtra3;
            str2 = stringExtra4;
            str3 = str7;
            str4 = str8;
            str5 = stringExtra5;
        }
        int m14078u = m15350v4().f27299b.m14078u();
        final int i3 = 5;
        final int i4 = 4;
        final int i5 = 2;
        this.f27550I = m14078u != 0 ? m14078u != 1 ? m14078u != 2 ? m14078u != 4 ? m14078u != 5 ? m14078u != 6 ? m14078u != 7 ? 1.0f : 2.0f : 1.75f : 1.5f : 1.25f : 0.75f : 0.5f : 0.25f;
        View findViewById = findViewById(C2507R.id.video_view);
        Intrinsics.m32178g(findViewById, "findViewById(R.id.video_view)");
        this.f27557f = (PlayerView) findViewById;
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        m15346B4(67108864, false);
        getWindow().setStatusBarColor(0);
        View decorView = getWindow().getDecorView();
        Intrinsics.m32178g(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1792);
        decorView.setOnSystemUiVisibilityChangeListener(this.f27564m);
        this.f27558g = new GestureDetector(this, this.f27565n);
        PlayerView playerView = this.f27557f;
        if (playerView == null) {
            Intrinsics.m32189r("playerView");
            throw null;
        }
        playerView.setKeepContentOnPlayerReset(true);
        playerView.setControllerVisibilityListener(this);
        playerView.setOnTouchListener(this.f27551J);
        playerView.setControllerHideOnTouch(true);
        if (m15350v4().f27299b.m14069l()) {
            setRequestedOrientation(6);
        }
        ImageButton onCreate$lambda$3 = (ImageButton) m15347s4(C2507R.id.previous);
        Intrinsics.m32178g(onCreate$lambda$3, "onCreate$lambda$3");
        ViewsKt.m16377j(onCreate$lambda$3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$onCreate$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ExoPlayer exoPlayer = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                long currentPosition = exoPlayer.getCurrentPosition();
                if (currentPosition >= 5000) {
                    SwiftPlayerPresenter m15350v42 = SwiftPlayerActivity.this.m15350v4();
                    ExoPlayer exoPlayer2 = SwiftPlayerActivity.this.f27556e;
                    if (exoPlayer2 == null) {
                        Intrinsics.m32189r("player");
                        throw null;
                    }
                    m15350v42.m15266d(exoPlayer2.getDuration(), currentPosition);
                }
                ExoPlayer exoPlayer3 = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer3 == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                exoPlayer3.pause();
                SwiftPlayerActivity.this.m15350v4().m15265c();
                return Unit.f63088a;
            }
        });
        int i6 = this.f27549H;
        if (i6 == 1) {
            onCreate$lambda$3.setEnabled(this.f27548G > 0);
        } else if (i6 == 2) {
            onCreate$lambda$3.setEnabled(this.f27548G + 1 != this.f27547F.size());
        }
        ImageButton onCreate$lambda$4 = (ImageButton) m15347s4(C2507R.id.next);
        Intrinsics.m32178g(onCreate$lambda$4, "onCreate$lambda$4");
        ViewsKt.m16377j(onCreate$lambda$4, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$onCreate$4$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ExoPlayer exoPlayer = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                long currentPosition = exoPlayer.getCurrentPosition();
                if (currentPosition >= 5000) {
                    SwiftPlayerPresenter m15350v42 = SwiftPlayerActivity.this.m15350v4();
                    ExoPlayer exoPlayer2 = SwiftPlayerActivity.this.f27556e;
                    if (exoPlayer2 == null) {
                        Intrinsics.m32189r("player");
                        throw null;
                    }
                    m15350v42.m15266d(exoPlayer2.getDuration(), currentPosition);
                }
                ExoPlayer exoPlayer3 = SwiftPlayerActivity.this.f27556e;
                if (exoPlayer3 == null) {
                    Intrinsics.m32189r("player");
                    throw null;
                }
                exoPlayer3.pause();
                SwiftPlayerActivity.this.m15350v4().m15264b();
                return Unit.f63088a;
            }
        });
        int i7 = this.f27549H;
        if (i7 == 1) {
            onCreate$lambda$4.setEnabled(this.f27548G + 1 != this.f27547F.size());
        } else if (i7 == 2) {
            onCreate$lambda$4.setEnabled(this.f27548G > 0);
        }
        final int i8 = 0;
        ((ImageView) m15347s4(C2507R.id.resizeMode)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

            /* renamed from: c */
            public final /* synthetic */ SwiftPlayerActivity f27595c;

            {
                this.f27595c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        final SwiftPlayerActivity this$0 = this.f27595c;
                        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$0, "this$0");
                        PlayerView playerView2 = this$0.f27557f;
                        if (playerView2 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView2.setControllerShowTimeoutMs(5000);
                        if (this$0.getResources().getConfiguration().orientation == 1) {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.setResizeMode(0);
                            this$0.setRequestedOrientation(6);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                    SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.setRequestedOrientation(4);
                                }
                            }, 4000L);
                            return;
                        }
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        int resizeMode = playerView4.getResizeMode();
                        if (resizeMode == 0) {
                            PlayerView playerView5 = this$0.f27557f;
                            if (playerView5 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView5.setResizeMode(3);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                        } else if (resizeMode == 3) {
                            PlayerView playerView6 = this$0.f27557f;
                            if (playerView6 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView6.setResizeMode(4);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                        } else if (resizeMode == 4) {
                            PlayerView playerView7 = this$0.f27557f;
                            if (playerView7 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView7.setResizeMode(0);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                        }
                        PlayerView playerView8 = this$0.f27557f;
                        if (playerView8 != null) {
                            playerView8.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 1:
                        SwiftPlayerActivity this$02 = this.f27595c;
                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$02, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                        if (!this$02.m15350v4().f27299b.m14069l()) {
                            this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                        }
                        this$02.f27571t = true;
                        PlayerView playerView9 = this$02.f27557f;
                        if (playerView9 != null) {
                            playerView9.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 2:
                        SwiftPlayerActivity this$03 = this.f27595c;
                        SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$03, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                        if (!this$03.m15350v4().f27299b.m14069l()) {
                            this$03.setRequestedOrientation(4);
                        }
                        this$03.f27571t = false;
                        PlayerView playerView10 = this$03.f27557f;
                        if (playerView10 != null) {
                            playerView10.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 3:
                        SwiftPlayerActivity this$04 = this.f27595c;
                        SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                        return;
                    case 4:
                        SwiftPlayerActivity this$05 = this.f27595c;
                        SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$05, "this$0");
                        ExoPlayer exoPlayer = this$05.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                        PlayerView playerView11 = this$05.f27557f;
                        if (playerView11 != null) {
                            playerView11.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    default:
                        SwiftPlayerActivity this$06 = this.f27595c;
                        SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$06, "this$0");
                        this$06.m15354z4();
                        this$06.finish();
                        return;
                }
            }
        });
        final int i9 = 1;
        ((ImageButton) m15347s4(C2507R.id.lockController)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

            /* renamed from: c */
            public final /* synthetic */ SwiftPlayerActivity f27595c;

            {
                this.f27595c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        final SwiftPlayerActivity this$0 = this.f27595c;
                        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$0, "this$0");
                        PlayerView playerView2 = this$0.f27557f;
                        if (playerView2 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView2.setControllerShowTimeoutMs(5000);
                        if (this$0.getResources().getConfiguration().orientation == 1) {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.setResizeMode(0);
                            this$0.setRequestedOrientation(6);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                    SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.setRequestedOrientation(4);
                                }
                            }, 4000L);
                            return;
                        }
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        int resizeMode = playerView4.getResizeMode();
                        if (resizeMode == 0) {
                            PlayerView playerView5 = this$0.f27557f;
                            if (playerView5 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView5.setResizeMode(3);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                        } else if (resizeMode == 3) {
                            PlayerView playerView6 = this$0.f27557f;
                            if (playerView6 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView6.setResizeMode(4);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                        } else if (resizeMode == 4) {
                            PlayerView playerView7 = this$0.f27557f;
                            if (playerView7 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView7.setResizeMode(0);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                        }
                        PlayerView playerView8 = this$0.f27557f;
                        if (playerView8 != null) {
                            playerView8.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 1:
                        SwiftPlayerActivity this$02 = this.f27595c;
                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$02, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                        if (!this$02.m15350v4().f27299b.m14069l()) {
                            this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                        }
                        this$02.f27571t = true;
                        PlayerView playerView9 = this$02.f27557f;
                        if (playerView9 != null) {
                            playerView9.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 2:
                        SwiftPlayerActivity this$03 = this.f27595c;
                        SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$03, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                        if (!this$03.m15350v4().f27299b.m14069l()) {
                            this$03.setRequestedOrientation(4);
                        }
                        this$03.f27571t = false;
                        PlayerView playerView10 = this$03.f27557f;
                        if (playerView10 != null) {
                            playerView10.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 3:
                        SwiftPlayerActivity this$04 = this.f27595c;
                        SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                        return;
                    case 4:
                        SwiftPlayerActivity this$05 = this.f27595c;
                        SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$05, "this$0");
                        ExoPlayer exoPlayer = this$05.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                        PlayerView playerView11 = this$05.f27557f;
                        if (playerView11 != null) {
                            playerView11.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    default:
                        SwiftPlayerActivity this$06 = this.f27595c;
                        SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$06, "this$0");
                        this$06.m15354z4();
                        this$06.finish();
                        return;
                }
            }
        });
        ((ImageButton) m15347s4(C2507R.id.unlockController)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

            /* renamed from: c */
            public final /* synthetic */ SwiftPlayerActivity f27595c;

            {
                this.f27595c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        final SwiftPlayerActivity this$0 = this.f27595c;
                        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$0, "this$0");
                        PlayerView playerView2 = this$0.f27557f;
                        if (playerView2 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView2.setControllerShowTimeoutMs(5000);
                        if (this$0.getResources().getConfiguration().orientation == 1) {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.setResizeMode(0);
                            this$0.setRequestedOrientation(6);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                    SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.setRequestedOrientation(4);
                                }
                            }, 4000L);
                            return;
                        }
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        int resizeMode = playerView4.getResizeMode();
                        if (resizeMode == 0) {
                            PlayerView playerView5 = this$0.f27557f;
                            if (playerView5 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView5.setResizeMode(3);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                        } else if (resizeMode == 3) {
                            PlayerView playerView6 = this$0.f27557f;
                            if (playerView6 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView6.setResizeMode(4);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                        } else if (resizeMode == 4) {
                            PlayerView playerView7 = this$0.f27557f;
                            if (playerView7 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView7.setResizeMode(0);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                        }
                        PlayerView playerView8 = this$0.f27557f;
                        if (playerView8 != null) {
                            playerView8.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 1:
                        SwiftPlayerActivity this$02 = this.f27595c;
                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$02, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                        if (!this$02.m15350v4().f27299b.m14069l()) {
                            this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                        }
                        this$02.f27571t = true;
                        PlayerView playerView9 = this$02.f27557f;
                        if (playerView9 != null) {
                            playerView9.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 2:
                        SwiftPlayerActivity this$03 = this.f27595c;
                        SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$03, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                        if (!this$03.m15350v4().f27299b.m14069l()) {
                            this$03.setRequestedOrientation(4);
                        }
                        this$03.f27571t = false;
                        PlayerView playerView10 = this$03.f27557f;
                        if (playerView10 != null) {
                            playerView10.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 3:
                        SwiftPlayerActivity this$04 = this.f27595c;
                        SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                        return;
                    case 4:
                        SwiftPlayerActivity this$05 = this.f27595c;
                        SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$05, "this$0");
                        ExoPlayer exoPlayer = this$05.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                        PlayerView playerView11 = this$05.f27557f;
                        if (playerView11 != null) {
                            playerView11.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    default:
                        SwiftPlayerActivity this$06 = this.f27595c;
                        SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$06, "this$0");
                        this$06.m15354z4();
                        this$06.finish();
                        return;
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            ((ImageView) m15347s4(C2507R.id.pipMode)).setVisibility(0);
            final int i10 = 3;
            ((ImageView) m15347s4(C2507R.id.pipMode)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

                /* renamed from: c */
                public final /* synthetic */ SwiftPlayerActivity f27595c;

                {
                    this.f27595c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            final SwiftPlayerActivity this$0 = this.f27595c;
                            SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$0, "this$0");
                            PlayerView playerView2 = this$0.f27557f;
                            if (playerView2 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView2.setControllerShowTimeoutMs(5000);
                            if (this$0.getResources().getConfiguration().orientation == 1) {
                                PlayerView playerView3 = this$0.f27557f;
                                if (playerView3 == null) {
                                    Intrinsics.m32189r("playerView");
                                    throw null;
                                }
                                playerView3.setResizeMode(0);
                                this$0.setRequestedOrientation(6);
                                ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                                new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                        Intrinsics.m32179h(this$02, "this$0");
                                        this$02.setRequestedOrientation(4);
                                    }
                                }, 4000L);
                                return;
                            }
                            PlayerView playerView4 = this$0.f27557f;
                            if (playerView4 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            int resizeMode = playerView4.getResizeMode();
                            if (resizeMode == 0) {
                                PlayerView playerView5 = this$0.f27557f;
                                if (playerView5 == null) {
                                    Intrinsics.m32189r("playerView");
                                    throw null;
                                }
                                playerView5.setResizeMode(3);
                                ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                            } else if (resizeMode == 3) {
                                PlayerView playerView6 = this$0.f27557f;
                                if (playerView6 == null) {
                                    Intrinsics.m32189r("playerView");
                                    throw null;
                                }
                                playerView6.setResizeMode(4);
                                ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                            } else if (resizeMode == 4) {
                                PlayerView playerView7 = this$0.f27557f;
                                if (playerView7 == null) {
                                    Intrinsics.m32189r("playerView");
                                    throw null;
                                }
                                playerView7.setResizeMode(0);
                                ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            }
                            PlayerView playerView8 = this$0.f27557f;
                            if (playerView8 != null) {
                                playerView8.setControllerShowTimeoutMs(5000);
                                return;
                            } else {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                        case 1:
                            SwiftPlayerActivity this$02 = this.f27595c;
                            SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$02, "this$0");
                            ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                            ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                            ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                            if (!this$02.m15350v4().f27299b.m14069l()) {
                                this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                            }
                            this$02.f27571t = true;
                            PlayerView playerView9 = this$02.f27557f;
                            if (playerView9 != null) {
                                playerView9.setControllerShowTimeoutMs(5000);
                                return;
                            } else {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                        case 2:
                            SwiftPlayerActivity this$03 = this.f27595c;
                            SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$03, "this$0");
                            ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                            ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                            ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                            if (!this$03.m15350v4().f27299b.m14069l()) {
                                this$03.setRequestedOrientation(4);
                            }
                            this$03.f27571t = false;
                            PlayerView playerView10 = this$03.f27557f;
                            if (playerView10 != null) {
                                playerView10.setControllerShowTimeoutMs(5000);
                                return;
                            } else {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                        case 3:
                            SwiftPlayerActivity this$04 = this.f27595c;
                            SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$04, "this$0");
                            this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                            return;
                        case 4:
                            SwiftPlayerActivity this$05 = this.f27595c;
                            SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$05, "this$0");
                            ExoPlayer exoPlayer = this$05.f27556e;
                            if (exoPlayer == null) {
                                Intrinsics.m32189r("player");
                                throw null;
                            }
                            exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                            PlayerView playerView11 = this$05.f27557f;
                            if (playerView11 != null) {
                                playerView11.setControllerShowTimeoutMs(5000);
                                return;
                            } else {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                        default:
                            SwiftPlayerActivity this$06 = this.f27595c;
                            SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                            Intrinsics.m32179h(this$06, "this$0");
                            this$06.m15354z4();
                            this$06.finish();
                            return;
                    }
                }
            });
        }
        ((ImageView) m15347s4(C2507R.id.fastRewind)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

            /* renamed from: c */
            public final /* synthetic */ SwiftPlayerActivity f27595c;

            {
                this.f27595c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        final SwiftPlayerActivity this$0 = this.f27595c;
                        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$0, "this$0");
                        PlayerView playerView2 = this$0.f27557f;
                        if (playerView2 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView2.setControllerShowTimeoutMs(5000);
                        if (this$0.getResources().getConfiguration().orientation == 1) {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.setResizeMode(0);
                            this$0.setRequestedOrientation(6);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                    SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.setRequestedOrientation(4);
                                }
                            }, 4000L);
                            return;
                        }
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        int resizeMode = playerView4.getResizeMode();
                        if (resizeMode == 0) {
                            PlayerView playerView5 = this$0.f27557f;
                            if (playerView5 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView5.setResizeMode(3);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                        } else if (resizeMode == 3) {
                            PlayerView playerView6 = this$0.f27557f;
                            if (playerView6 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView6.setResizeMode(4);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                        } else if (resizeMode == 4) {
                            PlayerView playerView7 = this$0.f27557f;
                            if (playerView7 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView7.setResizeMode(0);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                        }
                        PlayerView playerView8 = this$0.f27557f;
                        if (playerView8 != null) {
                            playerView8.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 1:
                        SwiftPlayerActivity this$02 = this.f27595c;
                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$02, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                        if (!this$02.m15350v4().f27299b.m14069l()) {
                            this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                        }
                        this$02.f27571t = true;
                        PlayerView playerView9 = this$02.f27557f;
                        if (playerView9 != null) {
                            playerView9.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 2:
                        SwiftPlayerActivity this$03 = this.f27595c;
                        SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$03, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                        if (!this$03.m15350v4().f27299b.m14069l()) {
                            this$03.setRequestedOrientation(4);
                        }
                        this$03.f27571t = false;
                        PlayerView playerView10 = this$03.f27557f;
                        if (playerView10 != null) {
                            playerView10.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 3:
                        SwiftPlayerActivity this$04 = this.f27595c;
                        SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                        return;
                    case 4:
                        SwiftPlayerActivity this$05 = this.f27595c;
                        SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$05, "this$0");
                        ExoPlayer exoPlayer = this$05.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                        PlayerView playerView11 = this$05.f27557f;
                        if (playerView11 != null) {
                            playerView11.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    default:
                        SwiftPlayerActivity this$06 = this.f27595c;
                        SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$06, "this$0");
                        this$06.m15354z4();
                        this$06.finish();
                        return;
                }
            }
        });
        ((ImageButton) m15347s4(C2507R.id.close)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.c

            /* renamed from: c */
            public final /* synthetic */ SwiftPlayerActivity f27595c;

            {
                this.f27595c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        final SwiftPlayerActivity this$0 = this.f27595c;
                        SwiftPlayerActivity.TYPE type = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$0, "this$0");
                        PlayerView playerView2 = this$0.f27557f;
                        if (playerView2 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        playerView2.setControllerShowTimeoutMs(5000);
                        if (this$0.getResources().getConfiguration().orientation == 1) {
                            PlayerView playerView3 = this$0.f27557f;
                            if (playerView3 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView3.setResizeMode(0);
                            this$0.setRequestedOrientation(6);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                            new Handler().postDelayed(new Runnable() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SwiftPlayerActivity this$02 = SwiftPlayerActivity.this;
                                    SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.setRequestedOrientation(4);
                                }
                            }, 4000L);
                            return;
                        }
                        PlayerView playerView4 = this$0.f27557f;
                        if (playerView4 == null) {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                        int resizeMode = playerView4.getResizeMode();
                        if (resizeMode == 0) {
                            PlayerView playerView5 = this$0.f27557f;
                            if (playerView5 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView5.setResizeMode(3);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_crop));
                        } else if (resizeMode == 3) {
                            PlayerView playerView6 = this$0.f27557f;
                            if (playerView6 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView6.setResizeMode(4);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fit));
                        } else if (resizeMode == 4) {
                            PlayerView playerView7 = this$0.f27557f;
                            if (playerView7 == null) {
                                Intrinsics.m32189r("playerView");
                                throw null;
                            }
                            playerView7.setResizeMode(0);
                            ((ImageView) this$0.m15347s4(C2507R.id.resizeMode)).setImageDrawable(ContextCompat.m1671d(this$0, C2507R.drawable.ic_player_fill));
                        }
                        PlayerView playerView8 = this$0.f27557f;
                        if (playerView8 != null) {
                            playerView8.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 1:
                        SwiftPlayerActivity this$02 = this.f27595c;
                        SwiftPlayerActivity.TYPE type2 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$02, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$02.m15347s4(C2507R.id.root_view)).setBackgroundResource(0);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.controlLayout)).setVisibility(8);
                        ((RelativeLayout) this$02.m15347s4(C2507R.id.lock_view)).setVisibility(0);
                        if (!this$02.m15350v4().f27299b.m14069l()) {
                            this$02.setRequestedOrientation(this$02.getResources().getConfiguration().orientation == 1 ? 7 : 6);
                        }
                        this$02.f27571t = true;
                        PlayerView playerView9 = this$02.f27557f;
                        if (playerView9 != null) {
                            playerView9.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 2:
                        SwiftPlayerActivity this$03 = this.f27595c;
                        SwiftPlayerActivity.TYPE type3 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$03, "this$0");
                        ((FitsSystemWindowRelativeLayout) this$03.m15347s4(C2507R.id.root_view)).setBackgroundColor(1610612736);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.lock_view)).setVisibility(8);
                        ((RelativeLayout) this$03.m15347s4(C2507R.id.controlLayout)).setVisibility(0);
                        if (!this$03.m15350v4().f27299b.m14069l()) {
                            this$03.setRequestedOrientation(4);
                        }
                        this$03.f27571t = false;
                        PlayerView playerView10 = this$03.f27557f;
                        if (playerView10 != null) {
                            playerView10.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    case 3:
                        SwiftPlayerActivity this$04 = this.f27595c;
                        SwiftPlayerActivity.TYPE type4 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(new Rational(16, 9)).build());
                        return;
                    case 4:
                        SwiftPlayerActivity this$05 = this.f27595c;
                        SwiftPlayerActivity.TYPE type5 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$05, "this$0");
                        ExoPlayer exoPlayer = this$05.f27556e;
                        if (exoPlayer == null) {
                            Intrinsics.m32189r("player");
                            throw null;
                        }
                        exoPlayer.mo5643h(exoPlayer.getCurrentPosition() + (this$05.m15350v4().f27299b.m14070m() * 1000));
                        PlayerView playerView11 = this$05.f27557f;
                        if (playerView11 != null) {
                            playerView11.setControllerShowTimeoutMs(5000);
                            return;
                        } else {
                            Intrinsics.m32189r("playerView");
                            throw null;
                        }
                    default:
                        SwiftPlayerActivity this$06 = this.f27595c;
                        SwiftPlayerActivity.TYPE type6 = SwiftPlayerActivity.f27540L;
                        Intrinsics.m32179h(this$06, "this$0");
                        this$06.m15354z4();
                        this$06.finish();
                        return;
                }
            }
        });
        m15352x4(str3, str4, str, str2, str5);
        final PopupMenu popupMenu = new PopupMenu(this, (LinearLayout) m15347s4(C2507R.id.spnQuality));
        Iterator<T> it = this.f27545D.iterator();
        while (it.hasNext()) {
            popupMenu.f1394b.add((String) it.next());
        }
        LinearLayout spnQuality = (LinearLayout) m15347s4(C2507R.id.spnQuality);
        Intrinsics.m32178g(spnQuality, "spnQuality");
        ViewsKt.m16377j(spnQuality, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$onCreate$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                PopupMenu popupMenu2 = PopupMenu.this;
                SwiftPlayerActivity swiftPlayerActivity = this;
                popupMenu2.f1396d = new C2642f(swiftPlayerActivity, 0);
                MenuBuilder menuBuilder = popupMenu2.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(swiftPlayerActivity, menuBuilder, (LinearLayout) this.m15347s4(C2507R.id.spnQuality));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
        final PopupMenu popupMenu2 = new PopupMenu(this, (LinearLayout) m15347s4(C2507R.id.spnSpeed));
        popupMenu2.m882a().inflate(C2507R.menu.player_speed, popupMenu2.f1394b);
        ((TextView) m15347s4(C2507R.id.tvSpeedSelected)).setText(String.valueOf(popupMenu2.f1394b.getItem(m15350v4().f27299b.m14078u())));
        switch (m15350v4().f27299b.m14078u()) {
            case 0:
                f2 = 0.25f;
                break;
            case 1:
                f2 = 0.5f;
                break;
            case 2:
                f2 = 0.75f;
                break;
            case 3:
            default:
                f2 = 1.0f;
                break;
            case 4:
                f2 = 1.25f;
                break;
            case 5:
                f2 = 1.5f;
                break;
            case 6:
                f2 = 1.75f;
                break;
            case 7:
                f2 = 2.0f;
                break;
            case 8:
                f2 = 2.5f;
                break;
            case 9:
                f2 = 3.0f;
                break;
        }
        this.f27550I = f2;
        PlaybackParameters playbackParameters = new PlaybackParameters(this.f27550I, 1.0f);
        ExoPlayer exoPlayer = this.f27556e;
        if (exoPlayer == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        exoPlayer.mo5726d(playbackParameters);
        LinearLayout spnSpeed = (LinearLayout) m15347s4(C2507R.id.spnSpeed);
        Intrinsics.m32178g(spnSpeed, "spnSpeed");
        ViewsKt.m16377j(spnSpeed, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$onCreate$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                PopupMenu popupMenu3 = PopupMenu.this;
                SwiftPlayerActivity swiftPlayerActivity = this;
                popupMenu3.f1396d = new C2642f(swiftPlayerActivity, 1);
                MenuBuilder menuBuilder = popupMenu3.f1394b;
                Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(swiftPlayerActivity, menuBuilder, (LinearLayout) this.m15347s4(C2507R.id.spnSpeed));
                menuPopupHelper.m651e(true);
                menuPopupHelper.f939g = 8388613;
                menuPopupHelper.m653g();
                return Unit.f63088a;
            }
        });
        SwiftPlayerPresenter m15350v42 = m15350v4();
        Release release = this.f27573v;
        if (release == null) {
            Intrinsics.m32189r("release");
            throw null;
        }
        List<Episode> episodes = this.f27547F;
        int i11 = this.f27548G;
        int i12 = this.f27549H;
        Objects.requireNonNull(m15350v42);
        Intrinsics.m32179h(episodes, "episodes");
        PlayerUiLogic playerUiLogic = m15350v42.f27300c;
        Objects.requireNonNull(playerUiLogic);
        playerUiLogic.f29374b = release;
        playerUiLogic.f29375c.addAll(episodes);
        playerUiLogic.f29376d = i11;
        playerUiLogic.f29377e = i12;
        playerUiLogic.f28956a = true;
        mo15272l1();
        mo15269a4();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        unregisterReceiver(this.f27561j);
        if (Util.f14736a <= 23) {
            PlayerView playerView = this.f27557f;
            if (playerView == null) {
                Intrinsics.m32189r("playerView");
                throw null;
            }
            View view = playerView.f14190e;
            if (view instanceof GLSurfaceView) {
                ((GLSurfaceView) view).onPause();
            }
            m15354z4();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, @NotNull Configuration newConfig) {
        Intrinsics.m32179h(newConfig, "newConfig");
        RelativeLayout controlLayout = (RelativeLayout) m15347s4(C2507R.id.controlLayout);
        Intrinsics.m32178g(controlLayout, "controlLayout");
        ViewsKt.m16373f(controlLayout, z, false, null, 6);
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        registerReceiver(this.f27561j, this.f27562k);
        if (Util.f14736a <= 23 || !this.f27563l) {
            m15351w4();
            PlayerView playerView = this.f27557f;
            if (playerView == null) {
                Intrinsics.m32189r("playerView");
                throw null;
            }
            View view = playerView.f14190e;
            if (view instanceof GLSurfaceView) {
                ((GLSurfaceView) view).onResume();
            }
        }
    }

    @Override // moxy.MvpAppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("QUALITY_DEFAULT_VALUE", this.f27576y);
        outState.putString("QUALITY_LOW_VALUE", this.f27577z);
        outState.putString("QUALITY_MEDIUM_VALUE", this.f27542A);
        outState.putString("QUALITY_HIGH_VALUE", this.f27543B);
        outState.putString("QUALITY_ULTRA_HIGH_VALUE", this.f27544C);
        outState.putInt("SELECTED_STANDARD_QUALITY_POS", this.f27566o);
        outState.putInt("INDEX_VALUE", m15350v4().f27300c.f29376d);
        outState.putInt("SORT_VALUE", m15350v4().f27300c.f29377e);
        outState.putLong("PLAYBACK_POSITION_VALUE", this.f27568q);
    }

    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // moxy.MvpAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (Util.f14736a > 23) {
            PlayerView playerView = this.f27557f;
            if (playerView == null) {
                Intrinsics.m32189r("playerView");
                throw null;
            }
            View view = playerView.f14190e;
            if (view instanceof GLSurfaceView) {
                ((GLSurfaceView) view).onPause();
            }
            m15354z4();
        }
    }

    @Nullable
    /* renamed from: s4 */
    public View m15347s4(int i2) {
        Map<Integer, View> map = this.f27552K;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @NotNull
    /* renamed from: t4 */
    public final MediaSessionCompat m15348t4() {
        MediaSessionCompat mediaSessionCompat = this.f27559h;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat;
        }
        Intrinsics.m32189r("mediaSession");
        throw null;
    }

    @NotNull
    /* renamed from: u4 */
    public final MediaSessionConnector m15349u4() {
        MediaSessionConnector mediaSessionConnector = this.f27560i;
        if (mediaSessionConnector != null) {
            return mediaSessionConnector;
        }
        Intrinsics.m32189r("mediaSessionConnector");
        throw null;
    }

    /* renamed from: v4 */
    public final SwiftPlayerPresenter m15350v4() {
        return (SwiftPlayerPresenter) this.f27555d.getValue(this, f27541M[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* renamed from: w4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15351w4() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.activity.swiftplayer.SwiftPlayerActivity.m15351w4():void");
    }

    /* renamed from: x4 */
    public final void m15352x4(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f27576y = str;
        this.f27577z = str2;
        this.f27542A = str3;
        this.f27543B = str4;
        this.f27544C = str5;
        this.f27545D.clear();
        String str6 = "Default";
        if (str != null) {
            this.f27545D.add("Default");
        }
        if (str2 != null) {
            this.f27545D.add("360p");
        }
        if (str3 != null) {
            this.f27545D.add("480p");
        }
        if (str4 != null) {
            this.f27545D.add("720p");
        }
        if (str5 != null) {
            this.f27545D.add("1080p");
        }
        int i2 = this.f27566o;
        if (i2 == 0) {
            str6 = "360p";
        } else if (i2 == 1) {
            str6 = "480p";
        } else if (i2 == 2) {
            str6 = "720p";
        } else if (i2 == 3) {
            str6 = "1080p";
        }
        this.f27546E = str6;
        int m16353a = Quality.f30236a.m16353a(this.f27545D, str6);
        this.f27567p = m16353a;
        this.f27546E = this.f27545D.get(m16353a);
        ((TextView) m15347s4(C2507R.id.tvQualSelected)).setText(String.valueOf(this.f27546E));
        m15351w4();
    }

    /* renamed from: y4 */
    public final void m15353y4(Uri uri) {
        MediaSource mo6812c;
        ExoPlayer exoPlayer = this.f27556e;
        if (exoPlayer == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        exoPlayer.mo5643h(this.f27568q);
        ExoPlayer exoPlayer2 = this.f27556e;
        if (exoPlayer2 == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        exoPlayer2.setPlayWhenReady(true);
        int m7709H = Util.m7709H(uri);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.protocols(CollectionsKt.m31994G(Protocol.HTTP_2, Protocol.HTTP_1_1));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(20L, timeUnit);
        builder.writeTimeout(20L, timeUnit);
        builder.readTimeout(20L, timeUnit);
        builder.followRedirects(true);
        builder.followSslRedirects(true);
        builder.addNetworkInterceptor(new Interceptor() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.SwiftPlayerActivity$buildMediaSource$lambda$16$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Intrinsics.m32179h(chain, "chain");
                Request.Builder header = chain.request().newBuilder().header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36").header("Referer", String.valueOf(SwiftPlayerActivity.this.f27575x));
                String str = SwiftPlayerActivity.this.f27574w;
                if (!(str == null || StringsKt.m33879E(str))) {
                    header.header("Cookie", String.valueOf(SwiftPlayerActivity.this.f27574w));
                }
                return chain.proceed(header.build());
            }
        });
        DefaultBandwidthMeter.Builder builder2 = new DefaultBandwidthMeter.Builder(this);
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(this, new DefaultBandwidthMeter(builder2.f14410a, builder2.f14411b, builder2.f14412c, builder2.f14413d, builder2.f14414e), new OkHttpDataSource.Factory(builder.build()));
        if (m7709H == 0) {
            DashMediaSource.Factory factory = new DashMediaSource.Factory(defaultDataSourceFactory);
            MediaItem.Builder builder3 = new MediaItem.Builder();
            builder3.f9719b = uri;
            builder3.f9720c = "application/dash+xml";
            builder3.f9727j = null;
            mo6812c = factory.mo6812c(builder3.m5839a());
        } else if (m7709H == 2) {
            HlsMediaSource.Factory factory2 = new HlsMediaSource.Factory(defaultDataSourceFactory);
            MediaItem.Builder builder4 = new MediaItem.Builder();
            builder4.f9719b = uri;
            builder4.f9720c = "application/x-mpegURL";
            mo6812c = factory2.mo6812c(builder4.m5839a());
        } else {
            if (m7709H != 4) {
                throw new IllegalStateException(C0000a.m7d("Unsupported type: ", m7709H));
            }
            ProgressiveMediaSource.Factory factory3 = new ProgressiveMediaSource.Factory(defaultDataSourceFactory, new DefaultExtractorsFactory());
            MediaItem.Builder builder5 = new MediaItem.Builder();
            builder5.f9719b = uri;
            mo6812c = factory3.mo6812c(builder5.m5839a());
        }
        ExoPlayer exoPlayer3 = this.f27556e;
        if (exoPlayer3 != null) {
            exoPlayer3.mo5704b(mo6812c, this.f27568q <= 0, false);
        } else {
            Intrinsics.m32189r("player");
            throw null;
        }
    }

    /* renamed from: z4 */
    public final void m15354z4() {
        ExoPlayer exoPlayer = this.f27556e;
        if (exoPlayer == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        long currentPosition = exoPlayer.getCurrentPosition();
        if (currentPosition >= 5000) {
            SwiftPlayerPresenter m15350v4 = m15350v4();
            ExoPlayer exoPlayer2 = this.f27556e;
            if (exoPlayer2 == null) {
                Intrinsics.m32189r("player");
                throw null;
            }
            m15350v4.m15266d(exoPlayer2.getDuration(), currentPosition);
        }
        this.f27568q = currentPosition;
        ExoPlayer exoPlayer3 = this.f27556e;
        if (exoPlayer3 == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        exoPlayer3.mo5740p(this.f27565n);
        ExoPlayer exoPlayer4 = this.f27556e;
        if (exoPlayer4 == null) {
            Intrinsics.m32189r("player");
            throw null;
        }
        exoPlayer4.release();
        m15349u4().m6336e(null);
        m15348t4().m198c(false);
        this.f27563l = false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (z) {
            PlayerView playerView = this.f27557f;
            if (playerView != null) {
                playerView.m7382d();
                return;
            } else {
                Intrinsics.m32189r("playerView");
                throw null;
            }
        }
        PlayerView playerView2 = this.f27557f;
        if (playerView2 != null) {
            playerView2.m7387i();
        } else {
            Intrinsics.m32189r("playerView");
            throw null;
        }
    }
}
