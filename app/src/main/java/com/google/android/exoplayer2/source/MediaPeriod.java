package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import java.io.IOException;

/* loaded from: classes.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        /* renamed from: g */
        void mo5787g(MediaPeriod mediaPeriod);
    }

    /* renamed from: c */
    long mo6788c(long j2, SeekParameters seekParameters);

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean continueLoading(long j2);

    void discardBuffer(long j2, boolean z);

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    long getNextLoadPositionUs();

    TrackGroupArray getTrackGroups();

    /* renamed from: i */
    void mo6789i(Callback callback, long j2);

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    boolean isLoading();

    /* renamed from: j */
    long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2);

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    void reevaluateBuffer(long j2);

    long seekToUs(long j2);
}
