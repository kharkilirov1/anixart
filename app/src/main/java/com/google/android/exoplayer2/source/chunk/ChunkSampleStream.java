package com.google.android.exoplayer2.source.chunk;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {

    /* renamed from: b */
    public final int f12709b;

    /* renamed from: c */
    public final int[] f12710c;

    /* renamed from: d */
    public final Format[] f12711d;

    /* renamed from: e */
    public final boolean[] f12712e;

    /* renamed from: f */
    public final T f12713f;

    /* renamed from: g */
    public final SequenceableLoader.Callback<ChunkSampleStream<T>> f12714g;

    /* renamed from: h */
    public final MediaSourceEventListener.EventDispatcher f12715h;

    /* renamed from: i */
    public final LoadErrorHandlingPolicy f12716i;

    /* renamed from: j */
    public final Loader f12717j = new Loader("ChunkSampleStream");

    /* renamed from: k */
    public final ChunkHolder f12718k = new ChunkHolder();

    /* renamed from: l */
    public final ArrayList<BaseMediaChunk> f12719l;

    /* renamed from: m */
    public final List<BaseMediaChunk> f12720m;

    /* renamed from: n */
    public final SampleQueue f12721n;

    /* renamed from: o */
    public final SampleQueue[] f12722o;

    /* renamed from: p */
    public final BaseMediaChunkOutput f12723p;

    /* renamed from: q */
    @Nullable
    public Chunk f12724q;

    /* renamed from: r */
    public Format f12725r;

    /* renamed from: s */
    @Nullable
    public ReleaseCallback<T> f12726s;

    /* renamed from: t */
    public long f12727t;

    /* renamed from: u */
    public long f12728u;

    /* renamed from: v */
    public int f12729v;

    /* renamed from: w */
    @Nullable
    public BaseMediaChunk f12730w;

    /* renamed from: x */
    public boolean f12731x;

    public final class EmbeddedSampleStream implements SampleStream {

        /* renamed from: b */
        public final ChunkSampleStream<T> f12732b;

        /* renamed from: c */
        public final SampleQueue f12733c;

        /* renamed from: d */
        public final int f12734d;

        /* renamed from: e */
        public boolean f12735e;

        public EmbeddedSampleStream(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i2) {
            this.f12732b = chunkSampleStream;
            this.f12733c = sampleQueue;
            this.f12734d = i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            return !ChunkSampleStream.this.m6968n() && this.f12733c.m6905w(ChunkSampleStream.this.f12731x);
        }

        /* renamed from: c */
        public final void m6973c() {
            if (this.f12735e) {
                return;
            }
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            MediaSourceEventListener.EventDispatcher eventDispatcher = chunkSampleStream.f12715h;
            int[] iArr = chunkSampleStream.f12710c;
            int i2 = this.f12734d;
            eventDispatcher.m6832c(iArr[i2], chunkSampleStream.f12711d[i2], 0, null, chunkSampleStream.f12728u);
            this.f12735e = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (ChunkSampleStream.this.m6968n()) {
                return -3;
            }
            BaseMediaChunk baseMediaChunk = ChunkSampleStream.this.f12730w;
            if (baseMediaChunk != null && baseMediaChunk.m6956e(this.f12734d + 1) <= this.f12733c.m6899q()) {
                return -3;
            }
            m6973c();
            return this.f12733c.m6882C(formatHolder, decoderInputBuffer, i2, ChunkSampleStream.this.f12731x);
        }

        /* renamed from: e */
        public void m6974e() {
            Assertions.m7516d(ChunkSampleStream.this.f12712e[this.f12734d]);
            ChunkSampleStream.this.f12712e[this.f12734d] = false;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            if (ChunkSampleStream.this.m6968n()) {
                return 0;
            }
            int m6901s = this.f12733c.m6901s(j2, ChunkSampleStream.this.f12731x);
            BaseMediaChunk baseMediaChunk = ChunkSampleStream.this.f12730w;
            if (baseMediaChunk != null) {
                m6901s = Math.min(m6901s, baseMediaChunk.m6956e(this.f12734d + 1) - this.f12733c.m6899q());
            }
            this.f12733c.m6888I(m6901s);
            if (m6901s > 0) {
                m6973c();
            }
            return m6901s;
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
        /* renamed from: b */
        void mo6975b(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i2, @Nullable int[] iArr, @Nullable Format[] formatArr, T t, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j2, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2) {
        this.f12709b = i2;
        this.f12710c = iArr;
        this.f12711d = formatArr;
        this.f12713f = t;
        this.f12714g = callback;
        this.f12715h = eventDispatcher2;
        this.f12716i = loadErrorHandlingPolicy;
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.f12719l = arrayList;
        this.f12720m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12722o = new SampleQueue[length];
        this.f12712e = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        SampleQueue[] sampleQueueArr = new SampleQueue[i3];
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        Objects.requireNonNull(drmSessionManager);
        Objects.requireNonNull(eventDispatcher);
        SampleQueue sampleQueue = new SampleQueue(allocator, myLooper, drmSessionManager, eventDispatcher);
        this.f12721n = sampleQueue;
        int i4 = 0;
        iArr2[0] = i2;
        sampleQueueArr[0] = sampleQueue;
        while (i4 < length) {
            SampleQueue sampleQueue2 = new SampleQueue(allocator, null, null, null);
            this.f12722o[i4] = sampleQueue2;
            int i5 = i4 + 1;
            sampleQueueArr[i5] = sampleQueue2;
            iArr2[i5] = this.f12710c[i4];
            i4 = i5;
        }
        this.f12723p = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.f12727t = j2;
        this.f12728u = j2;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: a */
    public void mo6791a() throws IOException {
        this.f12717j.m7473f(Integer.MIN_VALUE);
        this.f12721n.m6907y();
        if (this.f12717j.m7472e()) {
            return;
        }
        this.f12713f.mo6976a();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: b */
    public boolean mo6792b() {
        return !m6968n() && this.f12721n.m6905w(this.f12731x);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        List<BaseMediaChunk> list;
        long j3;
        int i2 = 0;
        if (this.f12731x || this.f12717j.m7472e() || this.f12717j.m7471d()) {
            return false;
        }
        boolean m6968n = m6968n();
        if (m6968n) {
            list = Collections.emptyList();
            j3 = this.f12727t;
        } else {
            list = this.f12720m;
            j3 = m6966l().f12705h;
        }
        this.f12713f.mo6982i(j2, j3, list, this.f12718k);
        ChunkHolder chunkHolder = this.f12718k;
        boolean z = chunkHolder.f12708b;
        Chunk chunk = chunkHolder.f12707a;
        chunkHolder.f12707a = null;
        chunkHolder.f12708b = false;
        if (z) {
            this.f12727t = -9223372036854775807L;
            this.f12731x = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.f12724q = chunk;
        if (chunk instanceof BaseMediaChunk) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (m6968n) {
                long j4 = baseMediaChunk.f12704g;
                long j5 = this.f12727t;
                if (j4 != j5) {
                    this.f12721n.f12515u = j5;
                    for (SampleQueue sampleQueue : this.f12722o) {
                        sampleQueue.f12515u = this.f12727t;
                    }
                }
                this.f12727t = -9223372036854775807L;
            }
            BaseMediaChunkOutput baseMediaChunkOutput = this.f12723p;
            baseMediaChunk.f12673m = baseMediaChunkOutput;
            int[] iArr = new int[baseMediaChunkOutput.f12679b.length];
            while (true) {
                SampleQueue[] sampleQueueArr = baseMediaChunkOutput.f12679b;
                if (i2 >= sampleQueueArr.length) {
                    break;
                }
                iArr[i2] = sampleQueueArr[i2].m6903u();
                i2++;
            }
            baseMediaChunk.f12674n = iArr;
            this.f12719l.add(baseMediaChunk);
        } else if (chunk instanceof InitializationChunk) {
            ((InitializationChunk) chunk).f12746k = this.f12723p;
        }
        this.f12715h.m6844o(new LoadEventInfo(chunk.f12698a, chunk.f12699b, this.f12717j.m7475h(chunk, this, this.f12716i.mo7460d(chunk.f12700c))), chunk.f12700c, this.f12709b, chunk.f12701d, chunk.f12702e, chunk.f12703f, chunk.f12704g, chunk.f12705h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: d */
    public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (m6968n()) {
            return -3;
        }
        BaseMediaChunk baseMediaChunk = this.f12730w;
        if (baseMediaChunk != null && baseMediaChunk.m6956e(0) <= this.f12721n.m6899q()) {
            return -3;
        }
        m6969p();
        return this.f12721n.m6882C(formatHolder, decoderInputBuffer, i2, this.f12731x);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    /* renamed from: e */
    public void mo6851e() {
        this.f12721n.m6883D();
        for (SampleQueue sampleQueue : this.f12722o) {
            sampleQueue.m6883D();
        }
        this.f12713f.release();
        ReleaseCallback<T> releaseCallback = this.f12726s;
        if (releaseCallback != null) {
            releaseCallback.mo6975b(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: f */
    public void mo6852f(Chunk chunk, long j2, long j3, boolean z) {
        Chunk chunk2 = chunk;
        this.f12724q = null;
        this.f12730w = null;
        long j4 = chunk2.f12698a;
        DataSpec dataSpec = chunk2.f12699b;
        StatsDataSource statsDataSource = chunk2.f12706i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12716i.mo7459c(j4);
        this.f12715h.m6835f(loadEventInfo, chunk2.f12700c, this.f12709b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, chunk2.f12704g, chunk2.f12705h);
        if (z) {
            return;
        }
        if (m6968n()) {
            m6972s();
        } else if (chunk2 instanceof BaseMediaChunk) {
            m6965k(this.f12719l.size() - 1);
            if (this.f12719l.isEmpty()) {
                this.f12727t = this.f12728u;
            }
        }
        this.f12714g.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: g */
    public void mo6853g(Chunk chunk, long j2, long j3) {
        Chunk chunk2 = chunk;
        this.f12724q = null;
        this.f12713f.mo6980g(chunk2);
        long j4 = chunk2.f12698a;
        DataSpec dataSpec = chunk2.f12699b;
        StatsDataSource statsDataSource = chunk2.f12706i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12716i.mo7459c(j4);
        this.f12715h.m6838i(loadEventInfo, chunk2.f12700c, this.f12709b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, chunk2.f12704g, chunk2.f12705h);
        this.f12714g.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.f12731x) {
            return Long.MIN_VALUE;
        }
        if (m6968n()) {
            return this.f12727t;
        }
        long j2 = this.f12728u;
        BaseMediaChunk m6966l = m6966l();
        if (!m6966l.mo6984d()) {
            if (this.f12719l.size() > 1) {
                m6966l = this.f12719l.get(r2.size() - 2);
            } else {
                m6966l = null;
            }
        }
        if (m6966l != null) {
            j2 = Math.max(j2, m6966l.f12705h);
        }
        return Math.max(j2, this.f12721n.m6897o());
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (m6968n()) {
            return this.f12727t;
        }
        if (this.f12731x) {
            return Long.MIN_VALUE;
        }
        return m6966l().f12705h;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: h */
    public int mo6794h(long j2) {
        if (m6968n()) {
            return 0;
        }
        int m6901s = this.f12721n.m6901s(j2, this.f12731x);
        BaseMediaChunk baseMediaChunk = this.f12730w;
        if (baseMediaChunk != null) {
            m6901s = Math.min(m6901s, baseMediaChunk.m6956e(0) - this.f12721n.m6899q());
        }
        this.f12721n.m6888I(m6901s);
        m6969p();
        return m6901s;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12717j.m7472e();
    }

    /* renamed from: k */
    public final BaseMediaChunk m6965k(int i2) {
        BaseMediaChunk baseMediaChunk = this.f12719l.get(i2);
        ArrayList<BaseMediaChunk> arrayList = this.f12719l;
        Util.m7722U(arrayList, i2, arrayList.size());
        this.f12729v = Math.max(this.f12729v, this.f12719l.size());
        int i3 = 0;
        this.f12721n.m6894l(baseMediaChunk.m6956e(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.f12722o;
            if (i3 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i3];
            i3++;
            sampleQueue.m6894l(baseMediaChunk.m6956e(i3));
        }
    }

    /* renamed from: l */
    public final BaseMediaChunk m6966l() {
        return this.f12719l.get(r0.size() - 1);
    }

    /* renamed from: m */
    public final boolean m6967m(int i2) {
        int m6899q;
        BaseMediaChunk baseMediaChunk = this.f12719l.get(i2);
        if (this.f12721n.m6899q() > baseMediaChunk.m6956e(0)) {
            return true;
        }
        int i3 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.f12722o;
            if (i3 >= sampleQueueArr.length) {
                return false;
            }
            m6899q = sampleQueueArr[i3].m6899q();
            i3++;
        } while (m6899q <= baseMediaChunk.m6956e(i3));
        return true;
    }

    /* renamed from: n */
    public boolean m6968n() {
        return this.f12727t != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction mo6858o(com.google.android.exoplayer2.source.chunk.Chunk r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.chunk.ChunkSampleStream.mo6858o(com.google.android.exoplayer2.upstream.Loader$Loadable, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$LoadErrorAction");
    }

    /* renamed from: p */
    public final void m6969p() {
        int m6970q = m6970q(this.f12721n.m6899q(), this.f12729v - 1);
        while (true) {
            int i2 = this.f12729v;
            if (i2 > m6970q) {
                return;
            }
            this.f12729v = i2 + 1;
            BaseMediaChunk baseMediaChunk = this.f12719l.get(i2);
            Format format = baseMediaChunk.f12701d;
            if (!format.equals(this.f12725r)) {
                this.f12715h.m6832c(this.f12709b, format, baseMediaChunk.f12702e, baseMediaChunk.f12703f, baseMediaChunk.f12704g);
            }
            this.f12725r = format;
        }
    }

    /* renamed from: q */
    public final int m6970q(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.f12719l.size()) {
                return this.f12719l.size() - 1;
            }
        } while (this.f12719l.get(i3).m6956e(0) <= i2);
        return i3 - 1;
    }

    /* renamed from: r */
    public void m6971r(@Nullable ReleaseCallback<T> releaseCallback) {
        this.f12726s = releaseCallback;
        this.f12721n.m6881B();
        for (SampleQueue sampleQueue : this.f12722o) {
            sampleQueue.m6881B();
        }
        this.f12717j.m7474g(this);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        if (this.f12717j.m7471d() || m6968n()) {
            return;
        }
        if (this.f12717j.m7472e()) {
            Chunk chunk = this.f12724q;
            Objects.requireNonNull(chunk);
            boolean z = chunk instanceof BaseMediaChunk;
            if (!(z && m6967m(this.f12719l.size() - 1)) && this.f12713f.mo6977b(j2, chunk, this.f12720m)) {
                this.f12717j.m7470b();
                if (z) {
                    this.f12730w = (BaseMediaChunk) chunk;
                    return;
                }
                return;
            }
            return;
        }
        int mo6979e = this.f12713f.mo6979e(j2, this.f12720m);
        if (mo6979e < this.f12719l.size()) {
            Assertions.m7516d(!this.f12717j.m7472e());
            int size = this.f12719l.size();
            while (true) {
                if (mo6979e >= size) {
                    mo6979e = -1;
                    break;
                } else if (!m6967m(mo6979e)) {
                    break;
                } else {
                    mo6979e++;
                }
            }
            if (mo6979e == -1) {
                return;
            }
            long j3 = m6966l().f12705h;
            BaseMediaChunk m6965k = m6965k(mo6979e);
            if (this.f12719l.isEmpty()) {
                this.f12727t = this.f12728u;
            }
            this.f12731x = false;
            this.f12715h.m6846q(this.f12709b, m6965k.f12704g, j3);
        }
    }

    /* renamed from: s */
    public final void m6972s() {
        this.f12721n.m6884E(false);
        for (SampleQueue sampleQueue : this.f12722o) {
            sampleQueue.m6884E(false);
        }
    }
}
