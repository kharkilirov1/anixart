package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.IcyDataSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {

    /* renamed from: N */
    public static final Map<String, String> f12394N;

    /* renamed from: O */
    public static final Format f12395O;

    /* renamed from: B */
    public boolean f12397B;

    /* renamed from: D */
    public boolean f12399D;

    /* renamed from: E */
    public boolean f12400E;

    /* renamed from: F */
    public int f12401F;

    /* renamed from: H */
    public long f12403H;

    /* renamed from: J */
    public boolean f12405J;

    /* renamed from: K */
    public int f12406K;

    /* renamed from: L */
    public boolean f12407L;

    /* renamed from: M */
    public boolean f12408M;

    /* renamed from: b */
    public final Uri f12409b;

    /* renamed from: c */
    public final DataSource f12410c;

    /* renamed from: d */
    public final DrmSessionManager f12411d;

    /* renamed from: e */
    public final LoadErrorHandlingPolicy f12412e;

    /* renamed from: f */
    public final MediaSourceEventListener.EventDispatcher f12413f;

    /* renamed from: g */
    public final DrmSessionEventListener.EventDispatcher f12414g;

    /* renamed from: h */
    public final Listener f12415h;

    /* renamed from: i */
    public final Allocator f12416i;

    /* renamed from: j */
    @Nullable
    public final String f12417j;

    /* renamed from: k */
    public final long f12418k;

    /* renamed from: m */
    public final ProgressiveMediaExtractor f12420m;

    /* renamed from: o */
    public final Runnable f12422o;

    /* renamed from: p */
    public final Runnable f12423p;

    /* renamed from: r */
    @Nullable
    public MediaPeriod.Callback f12425r;

    /* renamed from: s */
    @Nullable
    public IcyHeaders f12426s;

    /* renamed from: v */
    public boolean f12429v;

    /* renamed from: w */
    public boolean f12430w;

    /* renamed from: x */
    public boolean f12431x;

    /* renamed from: y */
    public TrackState f12432y;

    /* renamed from: z */
    public SeekMap f12433z;

    /* renamed from: l */
    public final Loader f12419l = new Loader("ProgressiveMediaPeriod");

    /* renamed from: n */
    public final ConditionVariable f12421n = new ConditionVariable();

    /* renamed from: q */
    public final Handler f12424q = Util.m7744m();

    /* renamed from: u */
    public TrackId[] f12428u = new TrackId[0];

    /* renamed from: t */
    public SampleQueue[] f12427t = new SampleQueue[0];

    /* renamed from: I */
    public long f12404I = -9223372036854775807L;

    /* renamed from: G */
    public long f12402G = -1;

    /* renamed from: A */
    public long f12396A = -9223372036854775807L;

    /* renamed from: C */
    public int f12398C = 1;

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {

        /* renamed from: b */
        public final Uri f12435b;

        /* renamed from: c */
        public final StatsDataSource f12436c;

        /* renamed from: d */
        public final ProgressiveMediaExtractor f12437d;

        /* renamed from: e */
        public final ExtractorOutput f12438e;

        /* renamed from: f */
        public final ConditionVariable f12439f;

        /* renamed from: h */
        public volatile boolean f12441h;

        /* renamed from: j */
        public long f12443j;

        /* renamed from: m */
        @Nullable
        public TrackOutput f12446m;

        /* renamed from: n */
        public boolean f12447n;

        /* renamed from: g */
        public final PositionHolder f12440g = new PositionHolder();

        /* renamed from: i */
        public boolean f12442i = true;

        /* renamed from: l */
        public long f12445l = -1;

        /* renamed from: a */
        public final long f12434a = LoadEventInfo.m6820a();

        /* renamed from: k */
        public DataSpec f12444k = m6867d(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.f12435b = uri;
            this.f12436c = new StatsDataSource(dataSource);
            this.f12437d = progressiveMediaExtractor;
            this.f12438e = extractorOutput;
            this.f12439f = conditionVariable;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: a */
        public void mo6865a() throws IOException {
            DataReader dataReader;
            int i2;
            int i3 = 0;
            while (i3 == 0 && !this.f12441h) {
                try {
                    long j2 = this.f12440g.f10871a;
                    DataSpec m6867d = m6867d(j2);
                    this.f12444k = m6867d;
                    long mo6350a = this.f12436c.mo6350a(m6867d);
                    this.f12445l = mo6350a;
                    if (mo6350a != -1) {
                        this.f12445l = mo6350a + j2;
                    }
                    ProgressiveMediaPeriod.this.f12426s = IcyHeaders.m6708a(this.f12436c.mo6351i());
                    StatsDataSource statsDataSource = this.f12436c;
                    IcyHeaders icyHeaders = ProgressiveMediaPeriod.this.f12426s;
                    if (icyHeaders == null || (i2 = icyHeaders.f12029g) == -1) {
                        dataReader = statsDataSource;
                    } else {
                        dataReader = new IcyDataSource(statsDataSource, i2, this);
                        ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                        Objects.requireNonNull(progressiveMediaPeriod);
                        TrackOutput m6862s = progressiveMediaPeriod.m6862s(new TrackId(0, true));
                        this.f12446m = m6862s;
                        m6862s.mo6399e(ProgressiveMediaPeriod.f12395O);
                    }
                    long j3 = j2;
                    this.f12437d.mo6782a(dataReader, this.f12435b, this.f12436c.mo6351i(), j2, this.f12445l, this.f12438e);
                    if (ProgressiveMediaPeriod.this.f12426s != null) {
                        this.f12437d.mo6786e();
                    }
                    if (this.f12442i) {
                        this.f12437d.mo6784c(j3, this.f12443j);
                        this.f12442i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i3 == 0 && !this.f12441h) {
                            try {
                                this.f12439f.m7534a();
                                i3 = this.f12437d.mo6783b(this.f12440g);
                                j3 = this.f12437d.mo6785d();
                                if (j3 > ProgressiveMediaPeriod.this.f12418k + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f12439f.m7536c();
                        ProgressiveMediaPeriod progressiveMediaPeriod2 = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod2.f12424q.post(progressiveMediaPeriod2.f12423p);
                    }
                    if (i3 == 1) {
                        i3 = 0;
                    } else if (this.f12437d.mo6785d() != -1) {
                        this.f12440g.f10871a = this.f12437d.mo6785d();
                    }
                    StatsDataSource statsDataSource2 = this.f12436c;
                    if (statsDataSource2 != null) {
                        try {
                            statsDataSource2.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (i3 != 1 && this.f12437d.mo6785d() != -1) {
                        this.f12440g.f10871a = this.f12437d.mo6785d();
                    }
                    StatsDataSource statsDataSource3 = this.f12436c;
                    if (statsDataSource3 != null) {
                        try {
                            statsDataSource3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        /* renamed from: b */
        public void mo6819b(ParsableByteArray parsableByteArray) {
            long max;
            if (this.f12447n) {
                ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                Map<String, String> map = ProgressiveMediaPeriod.f12394N;
                max = Math.max(progressiveMediaPeriod.m6856m(), this.f12443j);
            } else {
                max = this.f12443j;
            }
            int m7637a = parsableByteArray.m7637a();
            TrackOutput trackOutput = this.f12446m;
            Objects.requireNonNull(trackOutput);
            trackOutput.mo6397c(parsableByteArray, m7637a);
            trackOutput.mo6398d(max, 1, m7637a, 0, null);
            this.f12447n = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        /* renamed from: c */
        public void mo6866c() {
            this.f12441h = true;
        }

        /* renamed from: d */
        public final DataSpec m6867d(long j2) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.f14372a = this.f12435b;
            builder.f14377f = j2;
            builder.f14379h = ProgressiveMediaPeriod.this.f12417j;
            builder.f14380i = 6;
            builder.f14376e = ProgressiveMediaPeriod.f12394N;
            return builder.m7438a();
        }
    }

    public interface Listener {
        /* renamed from: m */
        void mo6868m(long j2, boolean z, boolean z2);
    }

    public final class SampleStreamImpl implements SampleStream {

        /* renamed from: b */
        public final int f12449b;

        public SampleStreamImpl(int i2) {
            this.f12449b = i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() throws IOException {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            progressiveMediaPeriod.f12427t[this.f12449b].m6907y();
            progressiveMediaPeriod.f12419l.m7473f(progressiveMediaPeriod.f12412e.mo7460d(progressiveMediaPeriod.f12398C));
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.m6864u() && progressiveMediaPeriod.f12427t[this.f12449b].m6905w(progressiveMediaPeriod.f12407L);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i3 = this.f12449b;
            if (progressiveMediaPeriod.m6864u()) {
                return -3;
            }
            progressiveMediaPeriod.m6860q(i3);
            int m6882C = progressiveMediaPeriod.f12427t[i3].m6882C(formatHolder, decoderInputBuffer, i2, progressiveMediaPeriod.f12407L);
            if (m6882C == -3) {
                progressiveMediaPeriod.m6861r(i3);
            }
            return m6882C;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            int i2 = this.f12449b;
            if (progressiveMediaPeriod.m6864u()) {
                return 0;
            }
            progressiveMediaPeriod.m6860q(i2);
            SampleQueue sampleQueue = progressiveMediaPeriod.f12427t[i2];
            int m6901s = sampleQueue.m6901s(j2, progressiveMediaPeriod.f12407L);
            sampleQueue.m6888I(m6901s);
            if (m6901s != 0) {
                return m6901s;
            }
            progressiveMediaPeriod.m6861r(i2);
            return m6901s;
        }
    }

    public static final class TrackId {

        /* renamed from: a */
        public final int f12451a;

        /* renamed from: b */
        public final boolean f12452b;

        public TrackId(int i2, boolean z) {
            this.f12451a = i2;
            this.f12452b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.f12451a == trackId.f12451a && this.f12452b == trackId.f12452b;
        }

        public int hashCode() {
            return (this.f12451a * 31) + (this.f12452b ? 1 : 0);
        }
    }

    public static final class TrackState {

        /* renamed from: a */
        public final TrackGroupArray f12453a;

        /* renamed from: b */
        public final boolean[] f12454b;

        /* renamed from: c */
        public final boolean[] f12455c;

        /* renamed from: d */
        public final boolean[] f12456d;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f12453a = trackGroupArray;
            this.f12454b = zArr;
            int i2 = trackGroupArray.f12594b;
            this.f12455c = new boolean[i2];
            this.f12456d = new boolean[i2];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f12394N = Collections.unmodifiableMap(hashMap);
        Format.Builder builder = new Format.Builder();
        builder.f9677a = "icy";
        builder.f9687k = "application/x-icy";
        f12395O = builder.m5833a();
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, @Nullable String str, int i2) {
        this.f12409b = uri;
        this.f12410c = dataSource;
        this.f12411d = drmSessionManager;
        this.f12414g = eventDispatcher;
        this.f12412e = loadErrorHandlingPolicy;
        this.f12413f = eventDispatcher2;
        this.f12415h = listener;
        this.f12416i = allocator;
        this.f12417j = str;
        this.f12418k = i2;
        this.f12420m = progressiveMediaExtractor;
        final int i3 = 0;
        this.f12422o = new Runnable(this) { // from class: com.google.android.exoplayer2.source.h

            /* renamed from: c */
            public final /* synthetic */ ProgressiveMediaPeriod f13032c;

            {
                this.f13032c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        ProgressiveMediaPeriod progressiveMediaPeriod = this.f13032c;
                        Map<String, String> map = ProgressiveMediaPeriod.f12394N;
                        progressiveMediaPeriod.m6859p();
                        break;
                    default:
                        ProgressiveMediaPeriod progressiveMediaPeriod2 = this.f13032c;
                        if (!progressiveMediaPeriod2.f12408M) {
                            MediaPeriod.Callback callback = progressiveMediaPeriod2.f12425r;
                            Objects.requireNonNull(callback);
                            callback.mo5784e(progressiveMediaPeriod2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f12423p = new Runnable(this) { // from class: com.google.android.exoplayer2.source.h

            /* renamed from: c */
            public final /* synthetic */ ProgressiveMediaPeriod f13032c;

            {
                this.f13032c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        ProgressiveMediaPeriod progressiveMediaPeriod = this.f13032c;
                        Map<String, String> map = ProgressiveMediaPeriod.f12394N;
                        progressiveMediaPeriod.m6859p();
                        break;
                    default:
                        ProgressiveMediaPeriod progressiveMediaPeriod2 = this.f13032c;
                        if (!progressiveMediaPeriod2.f12408M) {
                            MediaPeriod.Callback callback = progressiveMediaPeriod2.f12425r;
                            Objects.requireNonNull(callback);
                            callback.mo5784e(progressiveMediaPeriod2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    /* renamed from: a */
    public void mo6850a(Format format) {
        this.f12424q.post(this.f12422o);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: b */
    public TrackOutput mo6392b(int i2, int i3) {
        return m6862s(new TrackId(i2, false));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        m6854k();
        if (!this.f12433z.mo6363f()) {
            return 0L;
        }
        SeekMap.SeekPoints mo6364h = this.f12433z.mo6364h(j2);
        return seekParameters.m5939a(j2, mo6364h.f10872a.f10877a, mo6364h.f10873b.f10877a);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.f12407L || this.f12419l.m7471d() || this.f12405J) {
            return false;
        }
        if (this.f12430w && this.f12401F == 0) {
            return false;
        }
        boolean m7538e = this.f12421n.m7538e();
        if (this.f12419l.m7472e()) {
            return m7538e;
        }
        m6863t();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: d */
    public void mo6393d(final SeekMap seekMap) {
        this.f12424q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.i
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                SeekMap seekMap2 = seekMap;
                progressiveMediaPeriod.f12433z = progressiveMediaPeriod.f12426s == null ? seekMap2 : new SeekMap.Unseekable(-9223372036854775807L, 0L);
                progressiveMediaPeriod.f12396A = seekMap2.mo6365i();
                boolean z = progressiveMediaPeriod.f12402G == -1 && seekMap2.mo6365i() == -9223372036854775807L;
                progressiveMediaPeriod.f12397B = z;
                progressiveMediaPeriod.f12398C = z ? 7 : 1;
                progressiveMediaPeriod.f12415h.mo6868m(progressiveMediaPeriod.f12396A, seekMap2.mo6363f(), progressiveMediaPeriod.f12397B);
                if (progressiveMediaPeriod.f12430w) {
                    return;
                }
                progressiveMediaPeriod.m6859p();
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        m6854k();
        if (m6857n()) {
            return;
        }
        boolean[] zArr = this.f12432y.f12455c;
        int length = this.f12427t.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f12427t[i2].m6890h(j2, z, zArr[i2]);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    /* renamed from: e */
    public void mo6851e() {
        for (SampleQueue sampleQueue : this.f12427t) {
            sampleQueue.m6883D();
        }
        this.f12420m.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: f */
    public void mo6852f(ExtractingLoadable extractingLoadable, long j2, long j3, boolean z) {
        ExtractingLoadable extractingLoadable2 = extractingLoadable;
        StatsDataSource statsDataSource = extractingLoadable2.f12436c;
        long j4 = extractingLoadable2.f12434a;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, extractingLoadable2.f12444k, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12412e.mo7459c(j4);
        this.f12413f.m6835f(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.f12443j, this.f12396A);
        if (z) {
            return;
        }
        if (this.f12402G == -1) {
            this.f12402G = extractingLoadable2.f12445l;
        }
        for (SampleQueue sampleQueue : this.f12427t) {
            sampleQueue.m6884E(false);
        }
        if (this.f12401F > 0) {
            MediaPeriod.Callback callback = this.f12425r;
            Objects.requireNonNull(callback);
            callback.mo5784e(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: g */
    public void mo6853g(ExtractingLoadable extractingLoadable, long j2, long j3) {
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable2 = extractingLoadable;
        if (this.f12396A == -9223372036854775807L && (seekMap = this.f12433z) != null) {
            boolean mo6363f = seekMap.mo6363f();
            long m6856m = m6856m();
            long j4 = m6856m == Long.MIN_VALUE ? 0L : m6856m + 10000;
            this.f12396A = j4;
            this.f12415h.mo6868m(j4, mo6363f, this.f12397B);
        }
        StatsDataSource statsDataSource = extractingLoadable2.f12436c;
        long j5 = extractingLoadable2.f12434a;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j5, extractingLoadable2.f12444k, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12412e.mo7459c(j5);
        this.f12413f.m6838i(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.f12443j, this.f12396A);
        if (this.f12402G == -1) {
            this.f12402G = extractingLoadable2.f12445l;
        }
        this.f12407L = true;
        MediaPeriod.Callback callback = this.f12425r;
        Objects.requireNonNull(callback);
        callback.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j2;
        boolean z;
        m6854k();
        boolean[] zArr = this.f12432y.f12454b;
        if (this.f12407L) {
            return Long.MIN_VALUE;
        }
        if (m6857n()) {
            return this.f12404I;
        }
        if (this.f12431x) {
            int length = this.f12427t.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2]) {
                    SampleQueue sampleQueue = this.f12427t[i2];
                    synchronized (sampleQueue) {
                        z = sampleQueue.f12518x;
                    }
                    if (!z) {
                        j2 = Math.min(j2, this.f12427t[i2].m6897o());
                    }
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = m6856m();
        }
        return j2 == Long.MIN_VALUE ? this.f12403H : j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (this.f12401F == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        m6854k();
        return this.f12432y.f12453a;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: h */
    public void mo6394h() {
        this.f12429v = true;
        this.f12424q.post(this.f12422o);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        this.f12425r = callback;
        this.f12421n.m7538e();
        m6863t();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12419l.m7472e() && this.f12421n.m7537d();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        m6854k();
        TrackState trackState = this.f12432y;
        TrackGroupArray trackGroupArray = trackState.f12453a;
        boolean[] zArr3 = trackState.f12455c;
        int i2 = this.f12401F;
        int i3 = 0;
        for (int i4 = 0; i4 < exoTrackSelectionArr.length; i4++) {
            if (sampleStreamArr[i4] != null && (exoTrackSelectionArr[i4] == null || !zArr[i4])) {
                int i5 = ((SampleStreamImpl) sampleStreamArr[i4]).f12449b;
                Assertions.m7516d(zArr3[i5]);
                this.f12401F--;
                zArr3[i5] = false;
                sampleStreamArr[i4] = null;
            }
        }
        boolean z = !this.f12399D ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
            if (sampleStreamArr[i6] == null && exoTrackSelectionArr[i6] != null) {
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i6];
                Assertions.m7516d(exoTrackSelection.length() == 1);
                Assertions.m7516d(exoTrackSelection.mo7300j(0) == 0);
                int m6923b = trackGroupArray.m6923b(exoTrackSelection.mo7294a());
                Assertions.m7516d(!zArr3[m6923b]);
                this.f12401F++;
                zArr3[m6923b] = true;
                sampleStreamArr[i6] = new SampleStreamImpl(m6923b);
                zArr2[i6] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.f12427t[m6923b];
                    z = (sampleQueue.m6886G(j2, true) || sampleQueue.m6899q() == 0) ? false : true;
                }
            }
        }
        if (this.f12401F == 0) {
            this.f12405J = false;
            this.f12400E = false;
            if (this.f12419l.m7472e()) {
                SampleQueue[] sampleQueueArr = this.f12427t;
                int length = sampleQueueArr.length;
                while (i3 < length) {
                    sampleQueueArr[i3].m6891i();
                    i3++;
                }
                this.f12419l.m7470b();
            } else {
                for (SampleQueue sampleQueue2 : this.f12427t) {
                    sampleQueue2.m6884E(false);
                }
            }
        } else if (z) {
            j2 = seekToUs(j2);
            while (i3 < sampleStreamArr.length) {
                if (sampleStreamArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.f12399D = true;
        return j2;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: k */
    public final void m6854k() {
        Assertions.m7516d(this.f12430w);
        Objects.requireNonNull(this.f12432y);
        Objects.requireNonNull(this.f12433z);
    }

    /* renamed from: l */
    public final int m6855l() {
        int i2 = 0;
        for (SampleQueue sampleQueue : this.f12427t) {
            i2 += sampleQueue.m6903u();
        }
        return i2;
    }

    /* renamed from: m */
    public final long m6856m() {
        long j2 = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.f12427t) {
            j2 = Math.max(j2, sampleQueue.m6897o());
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.f12419l.m7473f(this.f12412e.mo7460d(this.f12398C));
        if (this.f12407L && !this.f12430w) {
            throw ParserException.m5907a("Loading finished before preparation is complete.", null);
        }
    }

    /* renamed from: n */
    public final boolean m6857n() {
        return this.f12404I != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction mo6858o(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable r29, long r30, long r32, java.io.IOException r34, int r35) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ProgressiveMediaPeriod.mo6858o(com.google.android.exoplayer2.upstream.Loader$Loadable, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$LoadErrorAction");
    }

    /* renamed from: p */
    public final void m6859p() {
        if (this.f12408M || this.f12430w || !this.f12429v || this.f12433z == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.f12427t) {
            if (sampleQueue.m6902t() == null) {
                return;
            }
        }
        this.f12421n.m7536c();
        int length = this.f12427t.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            Format m6902t = this.f12427t[i2].m6902t();
            Objects.requireNonNull(m6902t);
            String str = m6902t.f9659m;
            boolean m7603k = MimeTypes.m7603k(str);
            boolean z = m7603k || MimeTypes.m7607o(str);
            zArr[i2] = z;
            this.f12431x = z | this.f12431x;
            IcyHeaders icyHeaders = this.f12426s;
            if (icyHeaders != null) {
                if (m7603k || this.f12428u[i2].f12452b) {
                    Metadata metadata = m6902t.f9657k;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.m6696a(icyHeaders);
                    Format.Builder m5829b = m6902t.m5829b();
                    m5829b.f9685i = metadata2;
                    m6902t = m5829b.m5833a();
                }
                if (m7603k && m6902t.f9653g == -1 && m6902t.f9654h == -1 && icyHeaders.f12024b != -1) {
                    Format.Builder m5829b2 = m6902t.m5829b();
                    m5829b2.f9682f = icyHeaders.f12024b;
                    m6902t = m5829b2.m5833a();
                }
            }
            trackGroupArr[i2] = new TrackGroup(m6902t.m5830c(this.f12411d.mo6287c(m6902t)));
        }
        this.f12432y = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        this.f12430w = true;
        MediaPeriod.Callback callback = this.f12425r;
        Objects.requireNonNull(callback);
        callback.mo5787g(this);
    }

    /* renamed from: q */
    public final void m6860q(int i2) {
        m6854k();
        TrackState trackState = this.f12432y;
        boolean[] zArr = trackState.f12456d;
        if (zArr[i2]) {
            return;
        }
        Format format = trackState.f12453a.f12595c[i2].f12590c[0];
        this.f12413f.m6832c(MimeTypes.m7601i(format.f9659m), format, 0, null, this.f12403H);
        zArr[i2] = true;
    }

    /* renamed from: r */
    public final void m6861r(int i2) {
        m6854k();
        boolean[] zArr = this.f12432y.f12454b;
        if (this.f12405J && zArr[i2] && !this.f12427t[i2].m6905w(false)) {
            this.f12404I = 0L;
            this.f12405J = false;
            this.f12400E = true;
            this.f12403H = 0L;
            this.f12406K = 0;
            for (SampleQueue sampleQueue : this.f12427t) {
                sampleQueue.m6884E(false);
            }
            MediaPeriod.Callback callback = this.f12425r;
            Objects.requireNonNull(callback);
            callback.mo5784e(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.f12400E) {
            return -9223372036854775807L;
        }
        if (!this.f12407L && m6855l() <= this.f12406K) {
            return -9223372036854775807L;
        }
        this.f12400E = false;
        return this.f12403H;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
    }

    /* renamed from: s */
    public final TrackOutput m6862s(TrackId trackId) {
        int length = this.f12427t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (trackId.equals(this.f12428u[i2])) {
                return this.f12427t[i2];
            }
        }
        Allocator allocator = this.f12416i;
        Looper looper = this.f12424q.getLooper();
        DrmSessionManager drmSessionManager = this.f12411d;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.f12414g;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(drmSessionManager);
        Objects.requireNonNull(eventDispatcher);
        SampleQueue sampleQueue = new SampleQueue(allocator, looper, drmSessionManager, eventDispatcher);
        sampleQueue.f12501g = this;
        int i3 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.f12428u, i3);
        trackIdArr[length] = trackId;
        int i4 = Util.f14736a;
        this.f12428u = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.f12427t, i3);
        sampleQueueArr[length] = sampleQueue;
        this.f12427t = sampleQueueArr;
        return sampleQueue;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        boolean z;
        m6854k();
        boolean[] zArr = this.f12432y.f12454b;
        if (!this.f12433z.mo6363f()) {
            j2 = 0;
        }
        this.f12400E = false;
        this.f12403H = j2;
        if (m6857n()) {
            this.f12404I = j2;
            return j2;
        }
        if (this.f12398C != 7) {
            int length = this.f12427t.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f12427t[i2].m6886G(j2, false) && (zArr[i2] || !this.f12431x)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j2;
            }
        }
        this.f12405J = false;
        this.f12404I = j2;
        this.f12407L = false;
        if (this.f12419l.m7472e()) {
            for (SampleQueue sampleQueue : this.f12427t) {
                sampleQueue.m6891i();
            }
            this.f12419l.m7470b();
        } else {
            this.f12419l.f14477c = null;
            for (SampleQueue sampleQueue2 : this.f12427t) {
                sampleQueue2.m6884E(false);
            }
        }
        return j2;
    }

    /* renamed from: t */
    public final void m6863t() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.f12409b, this.f12410c, this.f12420m, this, this.f12421n);
        if (this.f12430w) {
            Assertions.m7516d(m6857n());
            long j2 = this.f12396A;
            if (j2 != -9223372036854775807L && this.f12404I > j2) {
                this.f12407L = true;
                this.f12404I = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.f12433z;
            Objects.requireNonNull(seekMap);
            long j3 = seekMap.mo6364h(this.f12404I).f10872a.f10878b;
            long j4 = this.f12404I;
            extractingLoadable.f12440g.f10871a = j3;
            extractingLoadable.f12443j = j4;
            extractingLoadable.f12442i = true;
            extractingLoadable.f12447n = false;
            for (SampleQueue sampleQueue : this.f12427t) {
                sampleQueue.f12515u = this.f12404I;
            }
            this.f12404I = -9223372036854775807L;
        }
        this.f12406K = m6855l();
        this.f12413f.m6844o(new LoadEventInfo(extractingLoadable.f12434a, extractingLoadable.f12444k, this.f12419l.m7475h(extractingLoadable, this, this.f12412e.mo7460d(this.f12398C))), 1, -1, null, 0, null, extractingLoadable.f12443j, this.f12396A);
    }

    /* renamed from: u */
    public final boolean m6864u() {
        return this.f12400E || m6857n();
    }
}
