package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import java.util.List;

/* loaded from: classes.dex */
public final class FixedTrackSelection extends BaseTrackSelection {

    /* renamed from: g */
    public final int f13958g;

    /* renamed from: h */
    @Nullable
    public final Object f13959h;

    public FixedTrackSelection(TrackGroup trackGroup, int i2, int i3) {
        super(trackGroup, new int[]{i2}, i3);
        this.f13958g = 0;
        this.f13959h = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: b */
    public int mo6736b() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: m */
    public void mo6737m(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: p */
    public int mo6738p() {
        return this.f13958g;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    /* renamed from: r */
    public Object mo6739r() {
        return this.f13959h;
    }
}
