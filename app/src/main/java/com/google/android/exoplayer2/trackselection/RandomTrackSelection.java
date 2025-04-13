package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public final class RandomTrackSelection extends BaseTrackSelection {

    /* renamed from: g */
    public final Random f13968g;

    /* renamed from: h */
    public int f13969h;

    public static final class Factory implements ExoTrackSelection.Factory {

        /* renamed from: a */
        public final Random f13970a = new Random();

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        /* renamed from: a */
        public ExoTrackSelection[] mo6740a(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            boolean z = false;
            for (int i2 = 0; i2 < definitionArr.length; i2++) {
                ExoTrackSelection.Definition definition = definitionArr[i2];
                if (definition != null) {
                    int[] iArr = definition.f13956b;
                    if (iArr.length <= 1 || z) {
                        exoTrackSelectionArr[i2] = new FixedTrackSelection(definition.f13955a, iArr[0], definition.f13957c);
                    } else {
                        exoTrackSelectionArr[i2] = new RandomTrackSelection(definition.f13955a, iArr, definition.f13957c, this.f13970a);
                        z = true;
                    }
                }
            }
            return exoTrackSelectionArr;
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, Random random) {
        super(trackGroup, iArr, i2);
        this.f13968g = random;
        this.f13969h = random.nextInt(this.f13882b);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: b */
    public int mo6736b() {
        return this.f13969h;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: m */
    public void mo6737m(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13882b; i3++) {
            if (!mo7296d(i3, elapsedRealtime)) {
                i2++;
            }
        }
        this.f13969h = this.f13968g.nextInt(i2);
        if (i2 != this.f13882b) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f13882b; i5++) {
                if (!mo7296d(i5, elapsedRealtime)) {
                    int i6 = i4 + 1;
                    if (this.f13969h == i4) {
                        this.f13969h = i5;
                        return;
                    }
                    i4 = i6;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    /* renamed from: p */
    public int mo6738p() {
        return 3;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    /* renamed from: r */
    public Object mo6739r() {
        return null;
    }
}
