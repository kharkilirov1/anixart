package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public interface AudioComponent {
    }

    public interface AudioOffloadListener {
        /* renamed from: h */
        void mo5705h(boolean z);

        /* renamed from: w */
        void mo5706w(boolean z);
    }

    public static final class Builder {

        /* renamed from: a */
        public final Context f9513a;

        /* renamed from: b */
        public Clock f9514b;

        /* renamed from: c */
        public Supplier<RenderersFactory> f9515c;

        /* renamed from: d */
        public Supplier<MediaSourceFactory> f9516d;

        /* renamed from: e */
        public Supplier<TrackSelector> f9517e;

        /* renamed from: f */
        public Supplier<LoadControl> f9518f;

        /* renamed from: g */
        public Supplier<BandwidthMeter> f9519g;

        /* renamed from: h */
        public Supplier<AnalyticsCollector> f9520h;

        /* renamed from: i */
        public Looper f9521i;

        /* renamed from: j */
        public AudioAttributes f9522j;

        /* renamed from: k */
        public int f9523k;

        /* renamed from: l */
        public boolean f9524l;

        /* renamed from: m */
        public SeekParameters f9525m;

        /* renamed from: n */
        public long f9526n;

        /* renamed from: o */
        public long f9527o;

        /* renamed from: p */
        public LivePlaybackSpeedControl f9528p;

        /* renamed from: q */
        public long f9529q;

        /* renamed from: r */
        public long f9530r;

        /* renamed from: s */
        public boolean f9531s;

        public Builder(final Context context, RenderersFactory renderersFactory) {
            final int i2 = 1;
            C1069o c1069o = new C1069o(renderersFactory, i2);
            final int i3 = 0;
            Supplier<MediaSourceFactory> supplier = new Supplier() { // from class: com.google.android.exoplayer2.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    DefaultBandwidthMeter defaultBandwidthMeter;
                    switch (i3) {
                        case 0:
                            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
                        case 1:
                            return new DefaultTrackSelector(context);
                        default:
                            Context context2 = context;
                            ImmutableList<Long> immutableList = DefaultBandwidthMeter.f14390n;
                            synchronized (DefaultBandwidthMeter.class) {
                                if (DefaultBandwidthMeter.f14396t == null) {
                                    DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context2);
                                    DefaultBandwidthMeter.f14396t = new DefaultBandwidthMeter(builder.f14410a, builder.f14411b, builder.f14412c, builder.f14413d, builder.f14414e);
                                }
                                defaultBandwidthMeter = DefaultBandwidthMeter.f14396t;
                            }
                            return defaultBandwidthMeter;
                    }
                }
            };
            Supplier<TrackSelector> supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    DefaultBandwidthMeter defaultBandwidthMeter;
                    switch (i2) {
                        case 0:
                            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
                        case 1:
                            return new DefaultTrackSelector(context);
                        default:
                            Context context2 = context;
                            ImmutableList<Long> immutableList = DefaultBandwidthMeter.f14390n;
                            synchronized (DefaultBandwidthMeter.class) {
                                if (DefaultBandwidthMeter.f14396t == null) {
                                    DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context2);
                                    DefaultBandwidthMeter.f14396t = new DefaultBandwidthMeter(builder.f14410a, builder.f14411b, builder.f14412c, builder.f14413d, builder.f14414e);
                                }
                                defaultBandwidthMeter = DefaultBandwidthMeter.f14396t;
                            }
                            return defaultBandwidthMeter;
                    }
                }
            };
            C0985d c0985d = new Supplier() { // from class: com.google.android.exoplayer2.d
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new DefaultLoadControl();
                }
            };
            final int i4 = 2;
            Supplier<BandwidthMeter> supplier3 = new Supplier() { // from class: com.google.android.exoplayer2.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    DefaultBandwidthMeter defaultBandwidthMeter;
                    switch (i4) {
                        case 0:
                            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
                        case 1:
                            return new DefaultTrackSelector(context);
                        default:
                            Context context2 = context;
                            ImmutableList<Long> immutableList = DefaultBandwidthMeter.f14390n;
                            synchronized (DefaultBandwidthMeter.class) {
                                if (DefaultBandwidthMeter.f14396t == null) {
                                    DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context2);
                                    DefaultBandwidthMeter.f14396t = new DefaultBandwidthMeter(builder.f14410a, builder.f14411b, builder.f14412c, builder.f14413d, builder.f14414e);
                                }
                                defaultBandwidthMeter = DefaultBandwidthMeter.f14396t;
                            }
                            return defaultBandwidthMeter;
                    }
                }
            };
            this.f9513a = context;
            this.f9515c = c1069o;
            this.f9516d = supplier;
            this.f9517e = supplier2;
            this.f9518f = c0985d;
            this.f9519g = supplier3;
            this.f9520h = new C1069o(this, i4);
            this.f9521i = Util.m7753v();
            this.f9522j = AudioAttributes.f10284g;
            this.f9523k = 1;
            this.f9524l = true;
            this.f9525m = SeekParameters.f9986c;
            this.f9526n = 5000L;
            this.f9527o = 15000L;
            DefaultLivePlaybackSpeedControl.Builder builder = new DefaultLivePlaybackSpeedControl.Builder();
            this.f9528p = new DefaultLivePlaybackSpeedControl(0.97f, 1.03f, 1000L, 1.0E-7f, builder.f9480a, builder.f9481b, builder.f9482c, null);
            this.f9514b = Clock.f14615a;
            this.f9529q = 500L;
            this.f9530r = 2000L;
        }
    }

    @Deprecated
    public interface DeviceComponent {
    }

    @Deprecated
    public interface TextComponent {
    }

    @Deprecated
    public interface VideoComponent {
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: a */
    ExoPlaybackException mo5703a();

    @Deprecated
    /* renamed from: b */
    void mo5704b(MediaSource mediaSource, boolean z, boolean z2);
}
