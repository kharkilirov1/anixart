package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class TrackSelectorResult {

    /* renamed from: a */
    public final int f14031a;

    /* renamed from: b */
    public final RendererConfiguration[] f14032b;

    /* renamed from: c */
    public final ExoTrackSelection[] f14033c;

    /* renamed from: d */
    public final TracksInfo f14034d;

    /* renamed from: e */
    @Nullable
    public final Object f14035e;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, TracksInfo tracksInfo, @Nullable Object obj) {
        this.f14032b = rendererConfigurationArr;
        this.f14033c = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.f14034d = tracksInfo;
        this.f14035e = obj;
        this.f14031a = rendererConfigurationArr.length;
    }

    /* renamed from: a */
    public boolean m7335a(@Nullable TrackSelectorResult trackSelectorResult, int i2) {
        return trackSelectorResult != null && Util.m7728a(this.f14032b[i2], trackSelectorResult.f14032b[i2]) && Util.m7728a(this.f14033c[i2], trackSelectorResult.f14033c[i2]);
    }

    /* renamed from: b */
    public boolean m7336b(int i2) {
        return this.f14032b[i2] != null;
    }
}
