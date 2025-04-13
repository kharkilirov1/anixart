package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class SingleSampleMediaPeriod implements MediaPeriod, Loader.Callback<SourceLoadable> {

    /* renamed from: b */
    public final DataSpec f12552b;

    /* renamed from: c */
    public final DataSource.Factory f12553c;

    /* renamed from: d */
    @Nullable
    public final TransferListener f12554d;

    /* renamed from: e */
    public final LoadErrorHandlingPolicy f12555e;

    /* renamed from: f */
    public final MediaSourceEventListener.EventDispatcher f12556f;

    /* renamed from: g */
    public final TrackGroupArray f12557g;

    /* renamed from: i */
    public final long f12559i;

    /* renamed from: k */
    public final Format f12561k;

    /* renamed from: l */
    public final boolean f12562l;

    /* renamed from: m */
    public boolean f12563m;

    /* renamed from: n */
    public byte[] f12564n;

    /* renamed from: o */
    public int f12565o;

    /* renamed from: h */
    public final ArrayList<SampleStreamImpl> f12558h = new ArrayList<>();

    /* renamed from: j */
    public final Loader f12560j = new Loader("SingleSampleMediaPeriod");

    public final class SampleStreamImpl implements SampleStream {

        /* renamed from: b */
        public int f12566b;

        /* renamed from: c */
        public boolean f12567c;

        public SampleStreamImpl(C10901 c10901) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            if (singleSampleMediaPeriod.f12562l) {
                return;
            }
            singleSampleMediaPeriod.f12560j.m7473f(Integer.MIN_VALUE);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            return SingleSampleMediaPeriod.this.f12563m;
        }

        /* renamed from: c */
        public final void m6917c() {
            if (this.f12567c) {
                return;
            }
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            singleSampleMediaPeriod.f12556f.m6832c(MimeTypes.m7601i(singleSampleMediaPeriod.f12561k.f9659m), SingleSampleMediaPeriod.this.f12561k, 0, null, 0L);
            this.f12567c = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            m6917c();
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            boolean z = singleSampleMediaPeriod.f12563m;
            if (z && singleSampleMediaPeriod.f12564n == null) {
                this.f12566b = 2;
            }
            int i3 = this.f12566b;
            if (i3 == 2) {
                decoderInputBuffer.m6238e(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                formatHolder.f9704b = singleSampleMediaPeriod.f12561k;
                this.f12566b = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            Objects.requireNonNull(singleSampleMediaPeriod.f12564n);
            decoderInputBuffer.m6238e(1);
            decoderInputBuffer.f10607f = 0L;
            if ((i2 & 4) == 0) {
                decoderInputBuffer.m6250n(SingleSampleMediaPeriod.this.f12565o);
                ByteBuffer byteBuffer = decoderInputBuffer.f10605d;
                SingleSampleMediaPeriod singleSampleMediaPeriod2 = SingleSampleMediaPeriod.this;
                byteBuffer.put(singleSampleMediaPeriod2.f12564n, 0, singleSampleMediaPeriod2.f12565o);
            }
            if ((i2 & 1) == 0) {
                this.f12566b = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            m6917c();
            if (j2 <= 0 || this.f12566b == 2) {
                return 0;
            }
            this.f12566b = 2;
            return 1;
        }
    }

    public static final class SourceLoadable implements Loader.Loadable {

        /* renamed from: a */
        public final long f12569a = LoadEventInfo.m6820a();

        /* renamed from: b */
        public final DataSpec f12570b;

        /* renamed from: c */
        public final StatsDataSource f12571c;

        /* renamed from: d */
        @Nullable
        public byte[] f12572d;

        public SourceLoadable(DataSpec dataSpec, DataSource dataSource) {
            this.f12570b = dataSpec;
            this.f12571c = new StatsDataSource(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: a */
        public void mo6865a() throws IOException {
            StatsDataSource statsDataSource = this.f12571c;
            statsDataSource.f14521b = 0L;
            try {
                statsDataSource.mo6350a(this.f12570b);
                int i2 = 0;
                while (i2 != -1) {
                    int i3 = (int) this.f12571c.f14521b;
                    byte[] bArr = this.f12572d;
                    if (bArr == null) {
                        this.f12572d = new byte[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
                    } else if (i3 == bArr.length) {
                        this.f12572d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    StatsDataSource statsDataSource2 = this.f12571c;
                    byte[] bArr2 = this.f12572d;
                    i2 = statsDataSource2.read(bArr2, i3, bArr2.length - i3);
                }
                if (r0 != null) {
                    try {
                        this.f12571c.f14520a.close();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                StatsDataSource statsDataSource3 = this.f12571c;
                if (statsDataSource3 != null) {
                    try {
                        statsDataSource3.f14520a.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: c */
        public void mo6866c() {
        }
    }

    public SingleSampleMediaPeriod(DataSpec dataSpec, DataSource.Factory factory, @Nullable TransferListener transferListener, Format format, long j2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z) {
        this.f12552b = dataSpec;
        this.f12553c = factory;
        this.f12554d = transferListener;
        this.f12561k = format;
        this.f12559i = j2;
        this.f12555e = loadErrorHandlingPolicy;
        this.f12556f = eventDispatcher;
        this.f12562l = z;
        this.f12557g = new TrackGroupArray(new TrackGroup(format));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.f12563m || this.f12560j.m7472e() || this.f12560j.m7471d()) {
            return false;
        }
        DataSource mo6355a = this.f12553c.mo6355a();
        TransferListener transferListener = this.f12554d;
        if (transferListener != null) {
            mo6355a.mo6818c(transferListener);
        }
        SourceLoadable sourceLoadable = new SourceLoadable(this.f12552b, mo6355a);
        this.f12556f.m6844o(new LoadEventInfo(sourceLoadable.f12569a, this.f12552b, this.f12560j.m7475h(sourceLoadable, this, this.f12555e.mo7460d(1))), 1, -1, this.f12561k, 0, null, 0L, this.f12559i);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: f */
    public void mo6852f(SourceLoadable sourceLoadable, long j2, long j3, boolean z) {
        SourceLoadable sourceLoadable2 = sourceLoadable;
        StatsDataSource statsDataSource = sourceLoadable2.f12571c;
        long j4 = sourceLoadable2.f12569a;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, sourceLoadable2.f12570b, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12555e.mo7459c(j4);
        this.f12556f.m6835f(loadEventInfo, 1, -1, null, 0, null, 0L, this.f12559i);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: g */
    public void mo6853g(SourceLoadable sourceLoadable, long j2, long j3) {
        SourceLoadable sourceLoadable2 = sourceLoadable;
        this.f12565o = (int) sourceLoadable2.f12571c.f14521b;
        byte[] bArr = sourceLoadable2.f12572d;
        Objects.requireNonNull(bArr);
        this.f12564n = bArr;
        this.f12563m = true;
        StatsDataSource statsDataSource = sourceLoadable2.f12571c;
        long j4 = sourceLoadable2.f12569a;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, sourceLoadable2.f12570b, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, this.f12565o);
        this.f12555e.mo7459c(j4);
        this.f12556f.m6838i(loadEventInfo, 1, -1, this.f12561k, 0, null, 0L, this.f12559i);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f12563m ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.f12563m || this.f12560j.m7472e()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.f12557g;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        callback.mo5787g(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12560j.m7472e();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            if (sampleStreamArr[i2] != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                this.f12558h.remove(sampleStreamArr[i2]);
                sampleStreamArr[i2] = null;
            }
            if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                SampleStreamImpl sampleStreamImpl = new SampleStreamImpl(null);
                this.f12558h.add(sampleStreamImpl);
                sampleStreamArr[i2] = sampleStreamImpl;
                zArr2[i2] = true;
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: o */
    public Loader.LoadErrorAction mo6858o(SourceLoadable sourceLoadable, long j2, long j3, IOException iOException, int i2) {
        Loader.LoadErrorAction m7469c;
        SourceLoadable sourceLoadable2 = sourceLoadable;
        StatsDataSource statsDataSource = sourceLoadable2.f12571c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(sourceLoadable2.f12569a, sourceLoadable2.f12570b, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        long mo7457a = this.f12555e.mo7457a(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, this.f12561k, 0, null, 0L, Util.m7735d0(this.f12559i)), iOException, i2));
        boolean z = mo7457a == -9223372036854775807L || i2 >= this.f12555e.mo7460d(1);
        if (this.f12562l && z) {
            Log.m7588e("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f12563m = true;
            m7469c = Loader.f14473e;
        } else {
            m7469c = mo7457a != -9223372036854775807L ? Loader.m7469c(false, mo7457a) : Loader.f14474f;
        }
        Loader.LoadErrorAction loadErrorAction = m7469c;
        boolean z2 = !loadErrorAction.m7476a();
        this.f12556f.m6840k(loadEventInfo, 1, -1, this.f12561k, 0, null, 0L, this.f12559i, iOException, z2);
        if (z2) {
            this.f12555e.mo7459c(sourceLoadable2.f12569a);
        }
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        for (int i2 = 0; i2 < this.f12558h.size(); i2++) {
            SampleStreamImpl sampleStreamImpl = this.f12558h.get(i2);
            if (sampleStreamImpl.f12566b == 2) {
                sampleStreamImpl.f12566b = 1;
            }
        }
        return j2;
    }
}
