package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* loaded from: classes.dex */
public abstract class TrackSelector {

    /* renamed from: a */
    @Nullable
    public InvalidationListener f14029a;

    /* renamed from: b */
    @Nullable
    public BandwidthMeter f14030b;

    public interface InvalidationListener {
    }

    /* renamed from: a */
    public abstract void mo7325a(@Nullable Object obj);

    /* renamed from: b */
    public abstract TrackSelectorResult mo7326b(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;
}
