package com.swiftsoft.anixartd.p015ui.activity.swiftplayer;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media.AudioAttributesCompat;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AudioFocusWrapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/swiftplayer/AudioFocusWrapper;", "Lcom/google/android/exoplayer2/ExoPlayer;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AudioFocusWrapper implements ExoPlayer {

    /* renamed from: a */
    @NotNull
    public final AudioAttributesCompat f27533a;

    /* renamed from: b */
    @NotNull
    public final AudioManager f27534b;

    /* renamed from: c */
    @NotNull
    public final ExoPlayer f27535c;

    /* renamed from: d */
    public boolean f27536d;

    /* renamed from: e */
    @NotNull
    public final AudioManager.OnAudioFocusChangeListener f27537e = new AudioManager.OnAudioFocusChangeListener() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.a
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i2) {
            AudioFocusWrapper this$0 = AudioFocusWrapper.this;
            Intrinsics.m32179h(this$0, "this$0");
            if (i2 == -3) {
                if (this$0.f27535c.getPlayWhenReady()) {
                    this$0.f27535c.setVolume(0.2f);
                }
            } else if (i2 == -2) {
                this$0.f27536d = this$0.f27535c.getPlayWhenReady();
                this$0.f27535c.setPlayWhenReady(false);
            } else {
                if (i2 == -1) {
                    this$0.m15344c();
                    return;
                }
                if (i2 != 1) {
                    return;
                }
                if (this$0.f27536d || this$0.f27535c.getPlayWhenReady()) {
                    this$0.f27535c.setPlayWhenReady(true);
                    this$0.f27535c.setVolume(1.0f);
                }
                this$0.f27536d = false;
            }
        }
    };

    /* renamed from: f */
    @NotNull
    public final Lazy f27538f = LazyKt.m31881b(new Function0<AudioFocusRequest>() { // from class: com.swiftsoft.anixartd.ui.activity.swiftplayer.AudioFocusWrapper$audioFocusRequest$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public AudioFocusRequest invoke() {
            AudioFocusWrapper audioFocusWrapper = AudioFocusWrapper.this;
            Objects.requireNonNull(audioFocusWrapper);
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
            Object mo3285b = audioFocusWrapper.f27533a.f4772a.mo3285b();
            Intrinsics.m32177f(mo3285b, "null cannot be cast to non-null type android.media.AudioAttributes");
            AudioFocusRequest build = builder.setAudioAttributes((AudioAttributes) mo3285b).setOnAudioFocusChangeListener(audioFocusWrapper.f27537e).build();
            Intrinsics.m32178g(build, "Builder(AudioManager.AUD…ner)\n            .build()");
            return build;
        }
    });

    public AudioFocusWrapper(@NotNull AudioAttributesCompat audioAttributesCompat, @NotNull AudioManager audioManager, @NotNull ExoPlayer exoPlayer) {
        this.f27533a = audioAttributesCompat;
        this.f27534b = audioManager;
        this.f27535c = exoPlayer;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public boolean mo5632A(int i2) {
        return this.f27535c.mo5632A(i2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public void mo5709B(@Nullable @org.jetbrains.annotations.Nullable SurfaceView surfaceView) {
        this.f27535c.mo5709B(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    /* renamed from: C */
    public TracksInfo mo5710C() {
        return this.f27535c.mo5710C();
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    /* renamed from: D */
    public Looper mo5711D() {
        return this.f27535c.mo5711D();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public boolean mo5712E() {
        return this.f27535c.mo5712E();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public long mo5713F() {
        return this.f27535c.mo5713F();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public void mo5633G() {
        this.f27535c.mo5633G();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public void mo5634H() {
        this.f27535c.mo5634H();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public void mo5635I() {
        this.f27535c.mo5635I();
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    /* renamed from: J */
    public MediaMetadata mo5714J() {
        return this.f27535c.mo5714J();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public long mo5715K() {
        return this.f27535c.mo5715K();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    public ExoPlaybackException mo5703a() {
        return this.f27535c.mo5703a();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    /* renamed from: b */
    public void mo5704b(@NotNull MediaSource mediaSource, boolean z, boolean z2) {
        this.f27535c.mo5704b(mediaSource, z, z2);
    }

    /* renamed from: c */
    public final void m15344c() {
        this.f27535c.setPlayWhenReady(false);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27534b.abandonAudioFocusRequest((AudioFocusRequest) this.f27538f.getValue());
        } else {
            this.f27534b.abandonAudioFocus(this.f27537e);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public void mo5726d(@NotNull PlaybackParameters playbackParameters) {
        this.f27535c.mo5726d(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public void mo5728e(int i2, long j2) {
        this.f27535c.mo5728e(i2, j2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: f */
    public void mo5730f(int i2) {
        this.f27535c.mo5730f(i2);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        return this.f27535c.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        return this.f27535c.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.f27535c.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        return this.f27535c.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        return this.f27535c.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        return this.f27535c.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    public Timeline getCurrentTimeline() {
        return this.f27535c.getCurrentTimeline();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        return this.f27535c.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.f27535c.getPlayWhenReady();
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    public PlaybackParameters getPlaybackParameters() {
        return this.f27535c.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.f27535c.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        return this.f27535c.getPlaybackSuppressionReason();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        return this.f27535c.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    @FloatRange
    public float getVolume() {
        return this.f27535c.getVolume();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public void mo5643h(long j2) {
        this.f27535c.mo5643h(j2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: i */
    public void mo5644i() {
        this.f27535c.mo5644i();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.f27535c.isCurrentMediaItemDynamic();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return this.f27535c.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* renamed from: j */
    public MediaItem mo5645j() {
        return this.f27535c.mo5645j();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo5736k(boolean z) {
        this.f27535c.mo5736k(z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public long mo5646m() {
        return this.f27535c.mo5646m();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo5738n(@Nullable @org.jetbrains.annotations.Nullable TextureView textureView) {
        this.f27535c.mo5738n(textureView);
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    /* renamed from: o */
    public VideoSize mo5739o() {
        return this.f27535c.mo5739o();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public void mo5740p(@NotNull Player.Listener p0) {
        Intrinsics.m32179h(p0, "p0");
        this.f27535c.mo5740p(p0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void pause() {
        this.f27535c.pause();
    }

    @Override // com.google.android.exoplayer2.Player
    public void play() {
        this.f27535c.play();
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        this.f27535c.prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: q */
    public void mo5741q(@Nullable @org.jetbrains.annotations.Nullable SurfaceView surfaceView) {
        this.f27535c.mo5741q(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo5742r() {
        return this.f27535c.mo5742r();
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        this.f27535c.release();
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        if (!z) {
            m15344c();
            return;
        }
        if ((Build.VERSION.SDK_INT >= 26 ? this.f27534b.requestAudioFocus((AudioFocusRequest) this.f27538f.getValue()) : this.f27534b.requestAudioFocus(this.f27537e, this.f27533a.f4772a.mo3284a(), 1)) == 1) {
            this.f27536d = true;
            this.f27537e.onAudioFocusChange(1);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable @org.jetbrains.annotations.Nullable TextureView textureView) {
        this.f27535c.setVideoTextureView(textureView);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(@FloatRange float f2) {
        this.f27535c.setVolume(f2);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        this.f27535c.stop();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public void mo5647t() {
        this.f27535c.mo5647t();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public void mo5648u(int i2) {
        this.f27535c.mo5648u(i2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public long mo5744v() {
        return this.f27535c.mo5744v();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public void mo5745w(@NotNull Player.Listener p0) {
        Intrinsics.m32179h(p0, "p0");
        this.f27535c.mo5745w(p0);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public long mo5746x() {
        return this.f27535c.mo5746x();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: y */
    public boolean mo5649y() {
        return this.f27535c.mo5649y();
    }

    @Override // com.google.android.exoplayer2.Player
    @NotNull
    /* renamed from: z */
    public List<Cue> mo5747z() {
        return this.f27535c.mo5747z();
    }
}
