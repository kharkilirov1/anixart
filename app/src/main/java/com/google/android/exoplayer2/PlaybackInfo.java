package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes.dex */
final class PlaybackInfo {

    /* renamed from: t */
    public static final MediaSource.MediaPeriodId f9928t = new MediaSource.MediaPeriodId(new Object());

    /* renamed from: a */
    public final Timeline f9929a;

    /* renamed from: b */
    public final MediaSource.MediaPeriodId f9930b;

    /* renamed from: c */
    public final long f9931c;

    /* renamed from: d */
    public final long f9932d;

    /* renamed from: e */
    public final int f9933e;

    /* renamed from: f */
    @Nullable
    public final ExoPlaybackException f9934f;

    /* renamed from: g */
    public final boolean f9935g;

    /* renamed from: h */
    public final TrackGroupArray f9936h;

    /* renamed from: i */
    public final TrackSelectorResult f9937i;

    /* renamed from: j */
    public final List<Metadata> f9938j;

    /* renamed from: k */
    public final MediaSource.MediaPeriodId f9939k;

    /* renamed from: l */
    public final boolean f9940l;

    /* renamed from: m */
    public final int f9941m;

    /* renamed from: n */
    public final PlaybackParameters f9942n;

    /* renamed from: o */
    public final boolean f9943o;

    /* renamed from: p */
    public final boolean f9944p;

    /* renamed from: q */
    public volatile long f9945q;

    /* renamed from: r */
    public volatile long f9946r;

    /* renamed from: s */
    public volatile long f9947s;

    public PlaybackInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, int i2, @Nullable ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list, MediaSource.MediaPeriodId mediaPeriodId2, boolean z2, int i3, PlaybackParameters playbackParameters, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.f9929a = timeline;
        this.f9930b = mediaPeriodId;
        this.f9931c = j2;
        this.f9932d = j3;
        this.f9933e = i2;
        this.f9934f = exoPlaybackException;
        this.f9935g = z;
        this.f9936h = trackGroupArray;
        this.f9937i = trackSelectorResult;
        this.f9938j = list;
        this.f9939k = mediaPeriodId2;
        this.f9940l = z2;
        this.f9941m = i3;
        this.f9942n = playbackParameters;
        this.f9945q = j4;
        this.f9946r = j5;
        this.f9947s = j6;
        this.f9943o = z3;
        this.f9944p = z4;
    }

    /* renamed from: i */
    public static PlaybackInfo m5912i(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.f10047b;
        MediaSource.MediaPeriodId mediaPeriodId = f9928t;
        return new PlaybackInfo(timeline, mediaPeriodId, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.f12592e, trackSelectorResult, ImmutableList.m11627D(), mediaPeriodId, false, 0, PlaybackParameters.f9948e, 0L, 0L, 0L, false, false);
    }

    @CheckResult
    /* renamed from: a */
    public PlaybackInfo m5913a(MediaSource.MediaPeriodId mediaPeriodId) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, this.f9933e, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, mediaPeriodId, this.f9940l, this.f9941m, this.f9942n, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: b */
    public PlaybackInfo m5914b(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, long j5, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list) {
        return new PlaybackInfo(this.f9929a, mediaPeriodId, j3, j4, this.f9933e, this.f9934f, this.f9935g, trackGroupArray, trackSelectorResult, list, this.f9939k, this.f9940l, this.f9941m, this.f9942n, this.f9945q, j5, j2, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: c */
    public PlaybackInfo m5915c(boolean z) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, this.f9933e, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, this.f9940l, this.f9941m, this.f9942n, this.f9945q, this.f9946r, this.f9947s, z, this.f9944p);
    }

    @CheckResult
    /* renamed from: d */
    public PlaybackInfo m5916d(boolean z, int i2) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, this.f9933e, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, z, i2, this.f9942n, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: e */
    public PlaybackInfo m5917e(@Nullable ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, this.f9933e, exoPlaybackException, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, this.f9940l, this.f9941m, this.f9942n, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: f */
    public PlaybackInfo m5918f(PlaybackParameters playbackParameters) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, this.f9933e, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, this.f9940l, this.f9941m, playbackParameters, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: g */
    public PlaybackInfo m5919g(int i2) {
        return new PlaybackInfo(this.f9929a, this.f9930b, this.f9931c, this.f9932d, i2, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, this.f9940l, this.f9941m, this.f9942n, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }

    @CheckResult
    /* renamed from: h */
    public PlaybackInfo m5920h(Timeline timeline) {
        return new PlaybackInfo(timeline, this.f9930b, this.f9931c, this.f9932d, this.f9933e, this.f9934f, this.f9935g, this.f9936h, this.f9937i, this.f9938j, this.f9939k, this.f9940l, this.f9941m, this.f9942n, this.f9945q, this.f9946r, this.f9947s, this.f9943o, this.f9944p);
    }
}
