package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* loaded from: classes.dex */
public interface ExoTrackSelection extends TrackSelection {

    public interface Factory {
        /* renamed from: a */
        ExoTrackSelection[] mo6740a(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    /* renamed from: b */
    int mo6736b();

    /* renamed from: c */
    boolean mo7295c(int i2, long j2);

    /* renamed from: d */
    boolean mo7296d(int i2, long j2);

    /* renamed from: e */
    boolean mo7297e(long j2, Chunk chunk, List<? extends MediaChunk> list);

    /* renamed from: f */
    void mo7288f();

    /* renamed from: g */
    void mo7298g(boolean z);

    /* renamed from: i */
    void mo7289i();

    /* renamed from: k */
    int mo7290k(long j2, List<? extends MediaChunk> list);

    /* renamed from: m */
    void mo6737m(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    /* renamed from: n */
    int mo7302n();

    /* renamed from: o */
    Format mo7303o();

    /* renamed from: p */
    int mo6738p();

    /* renamed from: q */
    void mo7291q(float f2);

    @Nullable
    /* renamed from: r */
    Object mo6739r();

    /* renamed from: s */
    void mo7304s();

    /* renamed from: t */
    void mo7305t();

    public static final class Definition {

        /* renamed from: a */
        public final TrackGroup f13955a;

        /* renamed from: b */
        public final int[] f13956b;

        /* renamed from: c */
        public final int f13957c;

        public Definition(TrackGroup trackGroup, int... iArr) {
            this.f13955a = trackGroup;
            this.f13956b = iArr;
            this.f13957c = 0;
        }

        public Definition(TrackGroup trackGroup, int[] iArr, int i2) {
            this.f13955a = trackGroup;
            this.f13956b = iArr;
            this.f13957c = i2;
        }
    }
}
