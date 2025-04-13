package com.google.android.exoplayer2.p009ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
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
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.swiftsoft.anixartd.C2507R;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: g0 */
    public static final /* synthetic */ int f14128g0 = 0;

    /* renamed from: A */
    public final String f14129A;

    /* renamed from: B */
    public final Drawable f14130B;

    /* renamed from: C */
    public final Drawable f14131C;

    /* renamed from: D */
    public final float f14132D;

    /* renamed from: E */
    public final float f14133E;

    /* renamed from: F */
    public final String f14134F;

    /* renamed from: G */
    public final String f14135G;

    /* renamed from: H */
    @Nullable
    public Player f14136H;

    /* renamed from: I */
    @Nullable
    public ProgressUpdateListener f14137I;

    /* renamed from: J */
    public boolean f14138J;

    /* renamed from: K */
    public boolean f14139K;

    /* renamed from: L */
    public boolean f14140L;

    /* renamed from: M */
    public boolean f14141M;

    /* renamed from: N */
    public int f14142N;

    /* renamed from: O */
    public int f14143O;

    /* renamed from: P */
    public int f14144P;

    /* renamed from: Q */
    public boolean f14145Q;

    /* renamed from: R */
    public boolean f14146R;

    /* renamed from: S */
    public boolean f14147S;

    /* renamed from: T */
    public boolean f14148T;

    /* renamed from: U */
    public boolean f14149U;

    /* renamed from: V */
    public long f14150V;

    /* renamed from: W */
    public long[] f14151W;

    /* renamed from: a0 */
    public boolean[] f14152a0;

    /* renamed from: b */
    public final ComponentListener f14153b;

    /* renamed from: b0 */
    public long[] f14154b0;

    /* renamed from: c */
    public final CopyOnWriteArrayList<VisibilityListener> f14155c;

    /* renamed from: c0 */
    public boolean[] f14156c0;

    /* renamed from: d */
    @Nullable
    public final View f14157d;

    /* renamed from: d0 */
    public long f14158d0;

    /* renamed from: e */
    @Nullable
    public final View f14159e;

    /* renamed from: e0 */
    public long f14160e0;

    /* renamed from: f */
    @Nullable
    public final View f14161f;

    /* renamed from: f0 */
    public long f14162f0;

    /* renamed from: g */
    @Nullable
    public final View f14163g;

    /* renamed from: h */
    @Nullable
    public final View f14164h;

    /* renamed from: i */
    @Nullable
    public final View f14165i;

    /* renamed from: j */
    @Nullable
    public final ImageView f14166j;

    /* renamed from: k */
    @Nullable
    public final ImageView f14167k;

    /* renamed from: l */
    @Nullable
    public final View f14168l;

    /* renamed from: m */
    @Nullable
    public final TextView f14169m;

    /* renamed from: n */
    @Nullable
    public final TextView f14170n;

    /* renamed from: o */
    @Nullable
    public final TimeBar f14171o;

    /* renamed from: p */
    public final StringBuilder f14172p;

    /* renamed from: q */
    public final Formatter f14173q;

    /* renamed from: r */
    public final Timeline.Period f14174r;

    /* renamed from: s */
    public final Timeline.Window f14175s;

    /* renamed from: t */
    public final Runnable f14176t;

    /* renamed from: u */
    public final Runnable f14177u;

    /* renamed from: v */
    public final Drawable f14178v;

    /* renamed from: w */
    public final Drawable f14179w;

    /* renamed from: x */
    public final Drawable f14180x;

    /* renamed from: y */
    public final String f14181y;

    /* renamed from: z */
    public final String f14182z;

    @RequiresApi
    public static final class Api21 {
        @DoNotInline
        /* renamed from: a */
        public static boolean m7373a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        public ComponentListener(C11381 c11381) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: a */
        public void mo7374a(TimeBar timeBar, long j2) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.f14170n;
            if (textView != null) {
                textView.setText(Util.m7706E(playerControlView.f14172p, playerControlView.f14173q, j2));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: b */
        public void mo7375b(TimeBar timeBar, long j2, boolean z) {
            Player player;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i2 = 0;
            playerControlView.f14141M = false;
            if (z || (player = playerControlView.f14136H) == null) {
                return;
            }
            Timeline currentTimeline = player.getCurrentTimeline();
            if (playerControlView.f14140L && !currentTimeline.m5991s()) {
                int mo5937r = currentTimeline.mo5937r();
                while (true) {
                    long m6003c = currentTimeline.m5990p(i2, playerControlView.f14175s).m6003c();
                    if (j2 < m6003c) {
                        break;
                    }
                    if (i2 == mo5937r - 1) {
                        j2 = m6003c;
                        break;
                    } else {
                        j2 -= m6003c;
                        i2++;
                    }
                }
            } else {
                i2 = player.getCurrentMediaItemIndex();
            }
            player.mo5728e(i2, j2);
            playerControlView.m7369m();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        /* renamed from: c */
        public void mo7376c(TimeBar timeBar, long j2) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f14141M = true;
            TextView textView = playerControlView.f14170n;
            if (textView != null) {
                textView.setText(Util.m7706E(playerControlView.f14172p, playerControlView.f14173q, j2));
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            Player player = playerControlView.f14136H;
            if (player == null) {
                return;
            }
            if (playerControlView.f14159e == view) {
                player.mo5633G();
                return;
            }
            if (playerControlView.f14157d == view) {
                player.mo5647t();
                return;
            }
            if (playerControlView.f14164h == view) {
                if (player.getPlaybackState() != 4) {
                    player.mo5634H();
                    return;
                }
                return;
            }
            if (playerControlView.f14165i == view) {
                player.mo5635I();
                return;
            }
            if (playerControlView.f14161f == view) {
                playerControlView.m7358b(player);
                return;
            }
            if (playerControlView.f14163g == view) {
                Objects.requireNonNull(playerControlView);
                player.pause();
            } else if (playerControlView.f14166j == view) {
                player.mo5730f(RepeatModeUtil.m7674a(player.mo5742r(), PlayerControlView.this.f14144P));
            } else if (playerControlView.f14167k == view) {
                player.mo5736k(!player.mo5712E());
            }
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

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
            if (events.m5928b(4, 5)) {
                PlayerControlView playerControlView = PlayerControlView.this;
                int i2 = PlayerControlView.f14128g0;
                playerControlView.m7368l();
            }
            if (events.m5928b(4, 5, 7)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                int i3 = PlayerControlView.f14128g0;
                playerControlView2.m7369m();
            }
            if (events.m5927a(8)) {
                PlayerControlView playerControlView3 = PlayerControlView.this;
                int i4 = PlayerControlView.f14128g0;
                playerControlView3.m7370n();
            }
            if (events.m5927a(9)) {
                PlayerControlView playerControlView4 = PlayerControlView.this;
                int i5 = PlayerControlView.f14128g0;
                playerControlView4.m7371o();
            }
            if (events.m5928b(8, 9, 11, 0, 13)) {
                PlayerControlView playerControlView5 = PlayerControlView.this;
                int i6 = PlayerControlView.f14128g0;
                playerControlView5.m7367k();
            }
            if (events.m5928b(11, 0)) {
                PlayerControlView playerControlView6 = PlayerControlView.this;
                int i7 = PlayerControlView.f14128g0;
                playerControlView6.m7372p();
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

    public interface ProgressUpdateListener {
        /* renamed from: a */
        void m7377a(long j2, long j3);
    }

    public interface VisibilityListener {
        /* renamed from: e4 */
        void mo7378e4(int i2);
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.ui");
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i2, @Nullable AttributeSet attributeSet2) {
        super(context, null, i2);
        this.f14142N = 5000;
        this.f14144P = 0;
        this.f14143O = DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER;
        this.f14150V = -9223372036854775807L;
        this.f14145Q = true;
        this.f14146R = true;
        this.f14147S = true;
        this.f14148T = true;
        this.f14149U = false;
        int i3 = C2507R.layout.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1140R.styleable.f14217c, i2, 0);
            try {
                this.f14142N = obtainStyledAttributes.getInt(19, this.f14142N);
                i3 = obtainStyledAttributes.getResourceId(5, C2507R.layout.exo_player_control_view);
                this.f14144P = obtainStyledAttributes.getInt(8, this.f14144P);
                this.f14145Q = obtainStyledAttributes.getBoolean(17, this.f14145Q);
                this.f14146R = obtainStyledAttributes.getBoolean(14, this.f14146R);
                this.f14147S = obtainStyledAttributes.getBoolean(16, this.f14147S);
                this.f14148T = obtainStyledAttributes.getBoolean(15, this.f14148T);
                this.f14149U = obtainStyledAttributes.getBoolean(18, this.f14149U);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.f14143O));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14155c = new CopyOnWriteArrayList<>();
        this.f14174r = new Timeline.Period();
        this.f14175s = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        this.f14172p = sb;
        this.f14173q = new Formatter(sb, Locale.getDefault());
        this.f14151W = new long[0];
        this.f14152a0 = new boolean[0];
        this.f14154b0 = new long[0];
        this.f14156c0 = new boolean[0];
        ComponentListener componentListener = new ComponentListener(null);
        this.f14153b = componentListener;
        this.f14176t = new RunnableC1156b(this, 0);
        this.f14177u = new RunnableC1156b(this, 1);
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        TimeBar timeBar = (TimeBar) findViewById(C2507R.id.exo_progress);
        View findViewById = findViewById(C2507R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.f14171o = timeBar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(C2507R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f14171o = defaultTimeBar;
        } else {
            this.f14171o = null;
        }
        this.f14169m = (TextView) findViewById(C2507R.id.exo_duration);
        this.f14170n = (TextView) findViewById(C2507R.id.exo_position);
        TimeBar timeBar2 = this.f14171o;
        if (timeBar2 != null) {
            timeBar2.mo7347b(componentListener);
        }
        View findViewById2 = findViewById(C2507R.id.exo_play);
        this.f14161f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener);
        }
        View findViewById3 = findViewById(C2507R.id.exo_pause);
        this.f14163g = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener);
        }
        View findViewById4 = findViewById(C2507R.id.exo_prev);
        this.f14157d = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(componentListener);
        }
        View findViewById5 = findViewById(C2507R.id.exo_next);
        this.f14159e = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener);
        }
        View findViewById6 = findViewById(C2507R.id.exo_rew);
        this.f14165i = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener);
        }
        View findViewById7 = findViewById(C2507R.id.exo_ffwd);
        this.f14164h = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(C2507R.id.exo_repeat_toggle);
        this.f14166j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(C2507R.id.exo_shuffle);
        this.f14167k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View findViewById8 = findViewById(C2507R.id.exo_vr);
        this.f14168l = findViewById8;
        setShowVrButton(false);
        m7366j(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f14132D = resources.getInteger(C2507R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f14133E = resources.getInteger(C2507R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f14178v = resources.getDrawable(C2507R.drawable.exo_controls_repeat_off);
        this.f14179w = resources.getDrawable(C2507R.drawable.exo_controls_repeat_one);
        this.f14180x = resources.getDrawable(C2507R.drawable.exo_controls_repeat_all);
        this.f14130B = resources.getDrawable(C2507R.drawable.exo_controls_shuffle_on);
        this.f14131C = resources.getDrawable(C2507R.drawable.exo_controls_shuffle_off);
        this.f14181y = resources.getString(C2507R.string.exo_controls_repeat_off_description);
        this.f14182z = resources.getString(C2507R.string.exo_controls_repeat_one_description);
        this.f14129A = resources.getString(C2507R.string.exo_controls_repeat_all_description);
        this.f14134F = resources.getString(C2507R.string.exo_controls_shuffle_on_description);
        this.f14135G = resources.getString(C2507R.string.exo_controls_shuffle_off_description);
        this.f14160e0 = -9223372036854775807L;
        this.f14162f0 = -9223372036854775807L;
    }

    /* renamed from: a */
    public boolean m7357a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f14136H;
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
                            int playbackState = player.getPlaybackState();
                            if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
                                m7358b(player);
                            } else {
                                player.pause();
                            }
                        } else if (keyCode == 87) {
                            player.mo5633G();
                        } else if (keyCode == 88) {
                            player.mo5647t();
                        } else if (keyCode == 126) {
                            m7358b(player);
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
    public final void m7358b(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            player.mo5728e(player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    /* renamed from: c */
    public void m7359c() {
        if (m7361e()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.f14155c.iterator();
            while (it.hasNext()) {
                it.next().mo7378e4(getVisibility());
            }
            removeCallbacks(this.f14176t);
            removeCallbacks(this.f14177u);
            this.f14150V = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void m7360d() {
        removeCallbacks(this.f14177u);
        if (this.f14142N <= 0) {
            this.f14150V = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.f14142N;
        this.f14150V = uptimeMillis + i2;
        if (this.f14138J) {
            postDelayed(this.f14177u, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7357a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f14177u);
        } else if (motionEvent.getAction() == 1) {
            m7360d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public boolean m7361e() {
        return getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m7362f() {
        View view;
        View view2;
        boolean m7364h = m7364h();
        if (!m7364h && (view2 = this.f14161f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!m7364h || (view = this.f14163g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: g */
    public final void m7363g() {
        View view;
        View view2;
        boolean m7364h = m7364h();
        if (!m7364h && (view2 = this.f14161f) != null) {
            view2.requestFocus();
        } else {
            if (!m7364h || (view = this.f14163g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    @Nullable
    public Player getPlayer() {
        return this.f14136H;
    }

    public int getRepeatToggleModes() {
        return this.f14144P;
    }

    public boolean getShowShuffleButton() {
        return this.f14149U;
    }

    public int getShowTimeoutMs() {
        return this.f14142N;
    }

    public boolean getShowVrButton() {
        View view = this.f14168l;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: h */
    public final boolean m7364h() {
        Player player = this.f14136H;
        return (player == null || player.getPlaybackState() == 4 || this.f14136H.getPlaybackState() == 1 || !this.f14136H.getPlayWhenReady()) ? false : true;
    }

    /* renamed from: i */
    public final void m7365i() {
        m7368l();
        m7367k();
        m7370n();
        m7371o();
        m7372p();
    }

    /* renamed from: j */
    public final void m7366j(boolean z, boolean z2, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f14132D : this.f14133E);
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: k */
    public final void m7367k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (m7361e() && this.f14138J) {
            Player player = this.f14136H;
            boolean z5 = false;
            if (player != null) {
                boolean mo5632A = player.mo5632A(5);
                boolean mo5632A2 = player.mo5632A(7);
                z3 = player.mo5632A(11);
                z4 = player.mo5632A(12);
                z = player.mo5632A(9);
                z2 = mo5632A;
                z5 = mo5632A2;
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            m7366j(this.f14147S, z5, this.f14157d);
            m7366j(this.f14145Q, z3, this.f14165i);
            m7366j(this.f14146R, z4, this.f14164h);
            m7366j(this.f14148T, z, this.f14159e);
            TimeBar timeBar = this.f14171o;
            if (timeBar != null) {
                timeBar.setEnabled(z2);
            }
        }
    }

    /* renamed from: l */
    public final void m7368l() {
        boolean z;
        boolean z2;
        if (m7361e() && this.f14138J) {
            boolean m7364h = m7364h();
            View view = this.f14161f;
            boolean z3 = true;
            if (view != null) {
                z = (m7364h && view.isFocused()) | false;
                z2 = (Util.f14736a < 21 ? z : m7364h && Api21.m7373a(this.f14161f)) | false;
                this.f14161f.setVisibility(m7364h ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f14163g;
            if (view2 != null) {
                z |= !m7364h && view2.isFocused();
                if (Util.f14736a < 21) {
                    z3 = z;
                } else if (m7364h || !Api21.m7373a(this.f14163g)) {
                    z3 = false;
                }
                z2 |= z3;
                this.f14163g.setVisibility(m7364h ? 0 : 8);
            }
            if (z) {
                m7363g();
            }
            if (z2) {
                m7362f();
            }
        }
    }

    /* renamed from: m */
    public final void m7369m() {
        long j2;
        if (m7361e() && this.f14138J) {
            Player player = this.f14136H;
            long j3 = 0;
            if (player != null) {
                j3 = this.f14158d0 + player.getContentPosition();
                j2 = this.f14158d0 + player.mo5713F();
            } else {
                j2 = 0;
            }
            boolean z = j3 != this.f14160e0;
            boolean z2 = j2 != this.f14162f0;
            this.f14160e0 = j3;
            this.f14162f0 = j2;
            TextView textView = this.f14170n;
            if (textView != null && !this.f14141M && z) {
                textView.setText(Util.m7706E(this.f14172p, this.f14173q, j3));
            }
            TimeBar timeBar = this.f14171o;
            if (timeBar != null) {
                timeBar.setPosition(j3);
                this.f14171o.setBufferedPosition(j2);
            }
            ProgressUpdateListener progressUpdateListener = this.f14137I;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.m7377a(j3, j2);
            }
            removeCallbacks(this.f14176t);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.mo5649y()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f14176t, 1000L);
                return;
            }
            TimeBar timeBar2 = this.f14171o;
            long min = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (j3 % 1000));
            float f2 = player.getPlaybackParameters().f9949b;
            postDelayed(this.f14176t, Util.m7742k(f2 > 0.0f ? (long) (min / f2) : 1000L, this.f14143O, 1000L));
        }
    }

    /* renamed from: n */
    public final void m7370n() {
        ImageView imageView;
        if (m7361e() && this.f14138J && (imageView = this.f14166j) != null) {
            if (this.f14144P == 0) {
                m7366j(false, false, imageView);
                return;
            }
            Player player = this.f14136H;
            if (player == null) {
                m7366j(true, false, imageView);
                this.f14166j.setImageDrawable(this.f14178v);
                this.f14166j.setContentDescription(this.f14181y);
                return;
            }
            m7366j(true, true, imageView);
            int mo5742r = player.mo5742r();
            if (mo5742r == 0) {
                this.f14166j.setImageDrawable(this.f14178v);
                this.f14166j.setContentDescription(this.f14181y);
            } else if (mo5742r == 1) {
                this.f14166j.setImageDrawable(this.f14179w);
                this.f14166j.setContentDescription(this.f14182z);
            } else if (mo5742r == 2) {
                this.f14166j.setImageDrawable(this.f14180x);
                this.f14166j.setContentDescription(this.f14129A);
            }
            this.f14166j.setVisibility(0);
        }
    }

    /* renamed from: o */
    public final void m7371o() {
        ImageView imageView;
        if (m7361e() && this.f14138J && (imageView = this.f14167k) != null) {
            Player player = this.f14136H;
            if (!this.f14149U) {
                m7366j(false, false, imageView);
                return;
            }
            if (player == null) {
                m7366j(true, false, imageView);
                this.f14167k.setImageDrawable(this.f14131C);
                this.f14167k.setContentDescription(this.f14135G);
            } else {
                m7366j(true, true, imageView);
                this.f14167k.setImageDrawable(player.mo5712E() ? this.f14130B : this.f14131C);
                this.f14167k.setContentDescription(player.mo5712E() ? this.f14134F : this.f14135G);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14138J = true;
        long j2 = this.f14150V;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m7359c();
            } else {
                postDelayed(this.f14177u, uptimeMillis);
            }
        } else if (m7361e()) {
            m7360d();
        }
        m7365i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14138J = false;
        removeCallbacks(this.f14176t);
        removeCallbacks(this.f14177u);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7372p() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p009ui.PlayerControlView.m7372p():void");
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        Assertions.m7516d(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.mo5711D() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.m7513a(z);
        Player player2 = this.f14136H;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo5740p(this.f14153b);
        }
        this.f14136H = player;
        if (player != null) {
            player.mo5745w(this.f14153b);
        }
        m7365i();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.f14137I = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i2) {
        this.f14144P = i2;
        Player player = this.f14136H;
        if (player != null) {
            int mo5742r = player.mo5742r();
            if (i2 == 0 && mo5742r != 0) {
                this.f14136H.mo5730f(0);
            } else if (i2 == 1 && mo5742r == 2) {
                this.f14136H.mo5730f(1);
            } else if (i2 == 2 && mo5742r == 1) {
                this.f14136H.mo5730f(2);
            }
        }
        m7370n();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f14146R = z;
        m7367k();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f14139K = z;
        m7372p();
    }

    public void setShowNextButton(boolean z) {
        this.f14148T = z;
        m7367k();
    }

    public void setShowPreviousButton(boolean z) {
        this.f14147S = z;
        m7367k();
    }

    public void setShowRewindButton(boolean z) {
        this.f14145Q = z;
        m7367k();
    }

    public void setShowShuffleButton(boolean z) {
        this.f14149U = z;
        m7371o();
    }

    public void setShowTimeoutMs(int i2) {
        this.f14142N = i2;
        if (m7361e()) {
            m7360d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f14168l;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.f14143O = Util.m7741j(i2, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f14168l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m7366j(getShowVrButton(), onClickListener != null, this.f14168l);
        }
    }
}
