package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    /* renamed from: b */
    public final MediaPeriod[] f12367b;

    /* renamed from: d */
    public final CompositeSequenceableLoaderFactory f12369d;

    /* renamed from: f */
    @Nullable
    public MediaPeriod.Callback f12371f;

    /* renamed from: g */
    @Nullable
    public TrackGroupArray f12372g;

    /* renamed from: i */
    public SequenceableLoader f12374i;

    /* renamed from: e */
    public final ArrayList<MediaPeriod> f12370e = new ArrayList<>();

    /* renamed from: c */
    public final IdentityHashMap<SampleStream, Integer> f12368c = new IdentityHashMap<>();

    /* renamed from: h */
    public MediaPeriod[] f12373h = new MediaPeriod[0];

    public static final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

        /* renamed from: b */
        public final MediaPeriod f12375b;

        /* renamed from: c */
        public final long f12376c;

        /* renamed from: d */
        public MediaPeriod.Callback f12377d;

        public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j2) {
            this.f12375b = mediaPeriod;
            this.f12376c = j2;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: c */
        public long mo6788c(long j2, SeekParameters seekParameters) {
            return this.f12375b.mo6788c(j2 - this.f12376c, seekParameters) + this.f12376c;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j2) {
            return this.f12375b.continueLoading(j2 - this.f12376c);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j2, boolean z) {
            this.f12375b.discardBuffer(j2 - this.f12376c, z);
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* renamed from: e */
        public void mo5784e(MediaPeriod mediaPeriod) {
            MediaPeriod.Callback callback = this.f12377d;
            Objects.requireNonNull(callback);
            callback.mo5784e(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        /* renamed from: g */
        public void mo5787g(MediaPeriod mediaPeriod) {
            MediaPeriod.Callback callback = this.f12377d;
            Objects.requireNonNull(callback);
            callback.mo5787g(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f12375b.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f12376c + bufferedPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f12375b.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f12376c + nextLoadPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.f12375b.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: i */
        public void mo6789i(MediaPeriod.Callback callback, long j2) {
            this.f12377d = callback;
            this.f12375b.mo6789i(this, j2 - this.f12376c);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.f12375b.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: j */
        public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i2 = 0;
            while (true) {
                SampleStream sampleStream = null;
                if (i2 >= sampleStreamArr.length) {
                    break;
                }
                TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i2];
                if (timeOffsetSampleStream != null) {
                    sampleStream = timeOffsetSampleStream.f12378b;
                }
                sampleStreamArr2[i2] = sampleStream;
                i2++;
            }
            long mo6790j = this.f12375b.mo6790j(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j2 - this.f12376c);
            for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
                SampleStream sampleStream2 = sampleStreamArr2[i3];
                if (sampleStream2 == null) {
                    sampleStreamArr[i3] = null;
                } else if (sampleStreamArr[i3] == null || ((TimeOffsetSampleStream) sampleStreamArr[i3]).f12378b != sampleStream2) {
                    sampleStreamArr[i3] = new TimeOffsetSampleStream(sampleStream2, this.f12376c);
                }
            }
            return mo6790j + this.f12376c;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.f12375b.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            long readDiscontinuity = this.f12375b.readDiscontinuity();
            if (readDiscontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f12376c + readDiscontinuity;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
            this.f12375b.reevaluateBuffer(j2 - this.f12376c);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j2) {
            return this.f12375b.seekToUs(j2 - this.f12376c) + this.f12376c;
        }
    }

    public static final class TimeOffsetSampleStream implements SampleStream {

        /* renamed from: b */
        public final SampleStream f12378b;

        /* renamed from: c */
        public final long f12379c;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j2) {
            this.f12378b = sampleStream;
            this.f12379c = j2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() throws IOException {
            this.f12378b.mo6791a();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            return this.f12378b.mo6792b();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int mo6793d = this.f12378b.mo6793d(formatHolder, decoderInputBuffer, i2);
            if (mo6793d == -4) {
                decoderInputBuffer.f10607f = Math.max(0L, decoderInputBuffer.f10607f + this.f12379c);
            }
            return mo6793d;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            return this.f12378b.mo6794h(j2 - this.f12379c);
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.f12369d = compositeSequenceableLoaderFactory;
        this.f12367b = mediaPeriodArr;
        this.f12374i = compositeSequenceableLoaderFactory.mo6805a(new SequenceableLoader[0]);
        for (int i2 = 0; i2 < mediaPeriodArr.length; i2++) {
            if (jArr[i2] != 0) {
                this.f12367b[i2] = new TimeOffsetMediaPeriod(mediaPeriodArr[i2], jArr[i2]);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.f12373h;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.f12367b[0]).mo6788c(j2, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.f12370e.isEmpty()) {
            return this.f12374i.continueLoading(j2);
        }
        int size = this.f12370e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f12370e.get(i2).continueLoading(j2);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        for (MediaPeriod mediaPeriod : this.f12373h) {
            mediaPeriod.discardBuffer(j2, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f12371f;
        Objects.requireNonNull(callback);
        callback.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    /* renamed from: g */
    public void mo5787g(MediaPeriod mediaPeriod) {
        this.f12370e.remove(mediaPeriod);
        if (this.f12370e.isEmpty()) {
            int i2 = 0;
            for (MediaPeriod mediaPeriod2 : this.f12367b) {
                i2 += mediaPeriod2.getTrackGroups().f12594b;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i2];
            int i3 = 0;
            for (MediaPeriod mediaPeriod3 : this.f12367b) {
                TrackGroupArray trackGroups = mediaPeriod3.getTrackGroups();
                int i4 = trackGroups.f12594b;
                int i5 = 0;
                while (i5 < i4) {
                    trackGroupArr[i3] = trackGroups.f12595c[i5];
                    i5++;
                    i3++;
                }
            }
            this.f12372g = new TrackGroupArray(trackGroupArr);
            MediaPeriod.Callback callback = this.f12371f;
            Objects.requireNonNull(callback);
            callback.mo5787g(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f12374i.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.f12374i.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.f12372g;
        Objects.requireNonNull(trackGroupArray);
        return trackGroupArray;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        this.f12371f = callback;
        Collections.addAll(this.f12370e, this.f12367b);
        for (MediaPeriod mediaPeriod : this.f12367b) {
            mediaPeriod.mo6789i(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12374i.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            Integer num = sampleStreamArr[i2] == null ? null : this.f12368c.get(sampleStreamArr[i2]);
            iArr[i2] = num == null ? -1 : num.intValue();
            iArr2[i2] = -1;
            if (exoTrackSelectionArr[i2] != null) {
                TrackGroup mo7294a = exoTrackSelectionArr[i2].mo7294a();
                int i3 = 0;
                while (true) {
                    MediaPeriod[] mediaPeriodArr = this.f12367b;
                    if (i3 >= mediaPeriodArr.length) {
                        break;
                    }
                    if (mediaPeriodArr[i3].getTrackGroups().m6923b(mo7294a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f12368c.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.f12367b.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f12367b.length) {
            for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
                sampleStreamArr3[i5] = iArr[i5] == i4 ? sampleStreamArr[i5] : null;
                exoTrackSelectionArr2[i5] = iArr2[i5] == i4 ? exoTrackSelectionArr[i5] : null;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            ExoTrackSelection[] exoTrackSelectionArr3 = exoTrackSelectionArr2;
            long mo6790j = this.f12367b[i4].mo6790j(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j3);
            if (i6 == 0) {
                j3 = mo6790j;
            } else if (mo6790j != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < exoTrackSelectionArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    SampleStream sampleStream = sampleStreamArr3[i7];
                    Objects.requireNonNull(sampleStream);
                    sampleStreamArr2[i7] = sampleStreamArr3[i7];
                    this.f12368c.put(sampleStream, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    Assertions.m7516d(sampleStreamArr3[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f12367b[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            exoTrackSelectionArr2 = exoTrackSelectionArr3;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        MediaPeriod[] mediaPeriodArr2 = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[0]);
        this.f12373h = mediaPeriodArr2;
        this.f12374i = this.f12369d.mo6805a(mediaPeriodArr2);
        return j3;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.f12367b) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        long j2 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.f12373h) {
            long readDiscontinuity = mediaPeriod.readDiscontinuity();
            if (readDiscontinuity != -9223372036854775807L) {
                if (j2 == -9223372036854775807L) {
                    for (MediaPeriod mediaPeriod2 : this.f12373h) {
                        if (mediaPeriod2 == mediaPeriod) {
                            break;
                        }
                        if (mediaPeriod2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j2 = readDiscontinuity;
                } else if (readDiscontinuity != j2) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j2 != -9223372036854775807L && mediaPeriod.seekToUs(j2) != j2) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.f12374i.reevaluateBuffer(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        long seekToUs = this.f12373h[0].seekToUs(j2);
        int i2 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.f12373h;
            if (i2 >= mediaPeriodArr.length) {
                return seekToUs;
            }
            if (mediaPeriodArr[i2].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }
}
