package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;
import java.util.Objects;

/* loaded from: classes.dex */
final class DefaultMediaClock implements MediaClock {

    /* renamed from: b */
    public final StandaloneMediaClock f9494b;

    /* renamed from: c */
    public final PlaybackParametersListener f9495c;

    /* renamed from: d */
    @Nullable
    public Renderer f9496d;

    /* renamed from: e */
    @Nullable
    public MediaClock f9497e;

    /* renamed from: f */
    public boolean f9498f = true;

    /* renamed from: g */
    public boolean f9499g;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
        this.f9495c = playbackParametersListener;
        this.f9494b = new StandaloneMediaClock(clock);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: d */
    public void mo5697d(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.f9497e;
        if (mediaClock != null) {
            mediaClock.mo5697d(playbackParameters);
            playbackParameters = this.f9497e.getPlaybackParameters();
        }
        this.f9494b.mo5697d(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.f9497e;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.f9494b.f14724f;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: l */
    public long mo5698l() {
        if (this.f9498f) {
            return this.f9494b.mo5698l();
        }
        MediaClock mediaClock = this.f9497e;
        Objects.requireNonNull(mediaClock);
        return mediaClock.mo5698l();
    }
}
