package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    public static final class Commands implements Bundleable {

        /* renamed from: c */
        public static final Commands f9952c = new Builder().m5926d();

        /* renamed from: b */
        public final FlagSet f9953b;

        public static final class Builder {

            /* renamed from: a */
            public final FlagSet.Builder f9954a = new FlagSet.Builder();

            /* renamed from: a */
            public Builder m5923a(int i2) {
                FlagSet.Builder builder = this.f9954a;
                Assertions.m7516d(!builder.f14639b);
                builder.f14638a.append(i2, true);
                return this;
            }

            /* renamed from: b */
            public Builder m5924b(Commands commands) {
                FlagSet.Builder builder = this.f9954a;
                FlagSet flagSet = commands.f9953b;
                Objects.requireNonNull(builder);
                for (int i2 = 0; i2 < flagSet.m7551c(); i2++) {
                    builder.m7552a(flagSet.m7550b(i2));
                }
                return this;
            }

            /* renamed from: c */
            public Builder m5925c(int i2, boolean z) {
                FlagSet.Builder builder = this.f9954a;
                Objects.requireNonNull(builder);
                if (z) {
                    Assertions.m7516d(!builder.f14639b);
                    builder.f14638a.append(i2, true);
                }
                return this;
            }

            /* renamed from: d */
            public Commands m5926d() {
                return new Commands(this.f9954a.m7553b(), null);
            }
        }

        public Commands(FlagSet flagSet, C09401 c09401) {
            this.f9953b = flagSet;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < this.f9953b.m7551c(); i2++) {
                arrayList.add(Integer.valueOf(this.f9953b.m7550b(i2)));
            }
            bundle.putIntegerArrayList(Integer.toString(0, 36), arrayList);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.f9953b.equals(((Commands) obj).f9953b);
            }
            return false;
        }

        public int hashCode() {
            return this.f9953b.hashCode();
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    @Deprecated
    public interface EventListener {
        void onAvailableCommandsChanged(Commands commands);

        void onEvents(Player player, Events events);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @Deprecated
        void onLoadingChanged(boolean z);

        void onMediaItemTransition(@Nullable MediaItem mediaItem, int i2);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onPlayWhenReadyChanged(boolean z, int i2);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int i2);

        void onPlaybackSuppressionReasonChanged(int i2);

        void onPlayerError(PlaybackException playbackException);

        void onPlayerErrorChanged(@Nullable PlaybackException playbackException);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i2);

        @Deprecated
        void onPositionDiscontinuity(int i2);

        void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i2);

        void onRepeatModeChanged(int i2);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onTimelineChanged(Timeline timeline, int i2);

        void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters);

        @Deprecated
        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

        void onTracksInfoChanged(TracksInfo tracksInfo);
    }

    public static final class Events {

        /* renamed from: a */
        public final FlagSet f9955a;

        public Events(FlagSet flagSet) {
            this.f9955a = flagSet;
        }

        /* renamed from: a */
        public boolean m5927a(int i2) {
            return this.f9955a.f14637a.get(i2);
        }

        /* renamed from: b */
        public boolean m5928b(int... iArr) {
            FlagSet flagSet = this.f9955a;
            Objects.requireNonNull(flagSet);
            for (int i2 : iArr) {
                if (flagSet.m7549a(i2)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f9955a.equals(((Events) obj).f9955a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9955a.hashCode();
        }
    }

    public interface Listener extends EventListener {
        void onCues(List<Cue> list);

        void onDeviceInfoChanged(DeviceInfo deviceInfo);

        void onDeviceVolumeChanged(int i2, boolean z);

        void onMetadata(Metadata metadata);

        void onRenderedFirstFrame();

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i2, int i3);

        void onVideoSizeChanged(VideoSize videoSize);

        void onVolumeChanged(float f2);
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo implements Bundleable {

        /* renamed from: b */
        @Nullable
        public final Object f9956b;

        /* renamed from: c */
        public final int f9957c;

        /* renamed from: d */
        @Nullable
        public final MediaItem f9958d;

        /* renamed from: e */
        @Nullable
        public final Object f9959e;

        /* renamed from: f */
        public final int f9960f;

        /* renamed from: g */
        public final long f9961g;

        /* renamed from: h */
        public final long f9962h;

        /* renamed from: i */
        public final int f9963i;

        /* renamed from: j */
        public final int f9964j;

        static {
            C1026l c1026l = C1026l.f11812o;
        }

        public PositionInfo(@Nullable Object obj, int i2, @Nullable MediaItem mediaItem, @Nullable Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f9956b = obj;
            this.f9957c = i2;
            this.f9958d = mediaItem;
            this.f9959e = obj2;
            this.f9960f = i3;
            this.f9961g = j2;
            this.f9962h = j3;
            this.f9963i = i4;
            this.f9964j = i5;
        }

        /* renamed from: b */
        public static String m5929b(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putInt(m5929b(0), this.f9957c);
            bundle.putBundle(m5929b(1), BundleableUtil.m7526e(this.f9958d));
            bundle.putInt(m5929b(2), this.f9960f);
            bundle.putLong(m5929b(3), this.f9961g);
            bundle.putLong(m5929b(4), this.f9962h);
            bundle.putInt(m5929b(5), this.f9963i);
            bundle.putInt(m5929b(6), this.f9964j);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PositionInfo.class != obj.getClass()) {
                return false;
            }
            PositionInfo positionInfo = (PositionInfo) obj;
            return this.f9957c == positionInfo.f9957c && this.f9960f == positionInfo.f9960f && this.f9961g == positionInfo.f9961g && this.f9962h == positionInfo.f9962h && this.f9963i == positionInfo.f9963i && this.f9964j == positionInfo.f9964j && com.google.common.base.Objects.m11173a(this.f9956b, positionInfo.f9956b) && com.google.common.base.Objects.m11173a(this.f9959e, positionInfo.f9959e) && com.google.common.base.Objects.m11173a(this.f9958d, positionInfo.f9958d);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f9956b, Integer.valueOf(this.f9957c), this.f9958d, this.f9959e, Integer.valueOf(this.f9960f), Long.valueOf(this.f9961g), Long.valueOf(this.f9962h), Integer.valueOf(this.f9963i), Integer.valueOf(this.f9964j)});
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    /* renamed from: A */
    boolean mo5632A(int i2);

    /* renamed from: B */
    void mo5709B(@Nullable SurfaceView surfaceView);

    /* renamed from: C */
    TracksInfo mo5710C();

    /* renamed from: D */
    Looper mo5711D();

    /* renamed from: E */
    boolean mo5712E();

    /* renamed from: F */
    long mo5713F();

    /* renamed from: G */
    void mo5633G();

    /* renamed from: H */
    void mo5634H();

    /* renamed from: I */
    void mo5635I();

    /* renamed from: J */
    MediaMetadata mo5714J();

    /* renamed from: K */
    long mo5715K();

    @Nullable
    /* renamed from: a */
    PlaybackException mo5703a();

    /* renamed from: d */
    void mo5726d(PlaybackParameters playbackParameters);

    /* renamed from: e */
    void mo5728e(int i2, long j2);

    /* renamed from: f */
    void mo5730f(int i2);

    /* renamed from: g */
    Commands mo5732g();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    @FloatRange
    float getVolume();

    /* renamed from: h */
    void mo5643h(long j2);

    /* renamed from: i */
    void mo5644i();

    boolean isCurrentMediaItemDynamic();

    boolean isPlayingAd();

    @Nullable
    /* renamed from: j */
    MediaItem mo5645j();

    /* renamed from: k */
    void mo5736k(boolean z);

    /* renamed from: l */
    long mo5737l();

    /* renamed from: m */
    long mo5646m();

    /* renamed from: n */
    void mo5738n(@Nullable TextureView textureView);

    /* renamed from: o */
    VideoSize mo5739o();

    /* renamed from: p */
    void mo5740p(Listener listener);

    void pause();

    void play();

    void prepare();

    /* renamed from: q */
    void mo5741q(@Nullable SurfaceView surfaceView);

    /* renamed from: r */
    int mo5742r();

    void release();

    /* renamed from: s */
    void mo5743s(int i2, int i3);

    void setPlayWhenReady(boolean z);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@FloatRange float f2);

    void stop();

    /* renamed from: t */
    void mo5647t();

    /* renamed from: u */
    void mo5648u(int i2);

    /* renamed from: v */
    long mo5744v();

    /* renamed from: w */
    void mo5745w(Listener listener);

    /* renamed from: x */
    long mo5746x();

    /* renamed from: y */
    boolean mo5649y();

    /* renamed from: z */
    List<Cue> mo5747z();
}
