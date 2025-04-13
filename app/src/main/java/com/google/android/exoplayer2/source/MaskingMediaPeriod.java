package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    /* renamed from: b */
    public final MediaSource.MediaPeriodId f12323b;

    /* renamed from: c */
    public final long f12324c;

    /* renamed from: d */
    public final Allocator f12325d;

    /* renamed from: e */
    public MediaSource f12326e;

    /* renamed from: f */
    public MediaPeriod f12327f;

    /* renamed from: g */
    @Nullable
    public MediaPeriod.Callback f12328g;

    /* renamed from: h */
    @Nullable
    public PrepareListener f12329h;

    /* renamed from: i */
    public boolean f12330i;

    /* renamed from: j */
    public long f12331j = -9223372036854775807L;

    public interface PrepareListener {
        /* renamed from: a */
        void mo6824a(MediaSource.MediaPeriodId mediaPeriodId);

        /* renamed from: b */
        void mo6825b(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        this.f12323b = mediaPeriodId;
        this.f12325d = allocator;
        this.f12324c = j2;
    }

    /* renamed from: b */
    public void m6821b(MediaSource.MediaPeriodId mediaPeriodId) {
        long j2 = this.f12324c;
        long j3 = this.f12331j;
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        MediaSource mediaSource = this.f12326e;
        Objects.requireNonNull(mediaSource);
        MediaPeriod mo6797a = mediaSource.mo6797a(mediaPeriodId, this.f12325d, j2);
        this.f12327f = mo6797a;
        if (this.f12328g != null) {
            mo6797a.mo6789i(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.mo6788c(j2, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        MediaPeriod mediaPeriod = this.f12327f;
        return mediaPeriod != null && mediaPeriod.continueLoading(j2);
    }

    /* renamed from: d */
    public void m6822d() {
        if (this.f12327f != null) {
            MediaSource mediaSource = this.f12326e;
            Objects.requireNonNull(mediaSource);
            mediaSource.mo6798s(this.f12327f);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        mediaPeriod.discardBuffer(j2, z);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f12328g;
        int i2 = Util.f14736a;
        callback.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    /* renamed from: g */
    public void mo5787g(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f12328g;
        int i2 = Util.f14736a;
        callback.mo5787g(this);
        PrepareListener prepareListener = this.f12329h;
        if (prepareListener != null) {
            prepareListener.mo6824a(this.f12323b);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.getTrackGroups();
    }

    /* renamed from: h */
    public void m6823h(MediaSource mediaSource) {
        Assertions.m7516d(this.f12326e == null);
        this.f12326e = mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        this.f12328g = callback;
        MediaPeriod mediaPeriod = this.f12327f;
        if (mediaPeriod != null) {
            long j3 = this.f12324c;
            long j4 = this.f12331j;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
            mediaPeriod.mo6789i(this, j3);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        MediaPeriod mediaPeriod = this.f12327f;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f12331j;
        if (j4 == -9223372036854775807L || j2 != this.f12324c) {
            j3 = j2;
        } else {
            this.f12331j = -9223372036854775807L;
            j3 = j4;
        }
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.mo6790j(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j3);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.f12327f;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
            } else {
                MediaSource mediaSource = this.f12326e;
                if (mediaSource != null) {
                    mediaSource.maybeThrowSourceInfoRefreshError();
                }
            }
        } catch (IOException e2) {
            PrepareListener prepareListener = this.f12329h;
            if (prepareListener == null) {
                throw e2;
            }
            if (this.f12330i) {
                return;
            }
            this.f12330i = true;
            prepareListener.mo6825b(this.f12323b, e2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        mediaPeriod.reevaluateBuffer(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        MediaPeriod mediaPeriod = this.f12327f;
        int i2 = Util.f14736a;
        return mediaPeriod.seekToUs(j2);
    }
}
