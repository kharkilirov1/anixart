package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {

    /* renamed from: Y */
    public static final Set<Integer> f13155Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    public int f13156A;

    /* renamed from: B */
    public int f13157B;

    /* renamed from: C */
    public boolean f13158C;

    /* renamed from: D */
    public boolean f13159D;

    /* renamed from: E */
    public int f13160E;

    /* renamed from: F */
    public Format f13161F;

    /* renamed from: G */
    @Nullable
    public Format f13162G;

    /* renamed from: H */
    public boolean f13163H;

    /* renamed from: I */
    public TrackGroupArray f13164I;

    /* renamed from: J */
    public Set<TrackGroup> f13165J;

    /* renamed from: K */
    public int[] f13166K;

    /* renamed from: L */
    public int f13167L;

    /* renamed from: M */
    public boolean f13168M;

    /* renamed from: N */
    public boolean[] f13169N;

    /* renamed from: O */
    public boolean[] f13170O;

    /* renamed from: P */
    public long f13171P;

    /* renamed from: Q */
    public long f13172Q;

    /* renamed from: R */
    public boolean f13173R;

    /* renamed from: S */
    public boolean f13174S;

    /* renamed from: T */
    public boolean f13175T;

    /* renamed from: U */
    public boolean f13176U;

    /* renamed from: V */
    public long f13177V;

    /* renamed from: W */
    @Nullable
    public DrmInitData f13178W;

    /* renamed from: X */
    @Nullable
    public HlsMediaChunk f13179X;

    /* renamed from: b */
    public final int f13180b;

    /* renamed from: c */
    public final Callback f13181c;

    /* renamed from: d */
    public final HlsChunkSource f13182d;

    /* renamed from: e */
    public final Allocator f13183e;

    /* renamed from: f */
    @Nullable
    public final Format f13184f;

    /* renamed from: g */
    public final DrmSessionManager f13185g;

    /* renamed from: h */
    public final DrmSessionEventListener.EventDispatcher f13186h;

    /* renamed from: i */
    public final LoadErrorHandlingPolicy f13187i;

    /* renamed from: k */
    public final MediaSourceEventListener.EventDispatcher f13189k;

    /* renamed from: l */
    public final int f13190l;

    /* renamed from: n */
    public final ArrayList<HlsMediaChunk> f13192n;

    /* renamed from: o */
    public final List<HlsMediaChunk> f13193o;

    /* renamed from: p */
    public final Runnable f13194p;

    /* renamed from: q */
    public final Runnable f13195q;

    /* renamed from: r */
    public final Handler f13196r;

    /* renamed from: s */
    public final ArrayList<HlsSampleStream> f13197s;

    /* renamed from: t */
    public final Map<String, DrmInitData> f13198t;

    /* renamed from: u */
    @Nullable
    public Chunk f13199u;

    /* renamed from: v */
    public HlsSampleQueue[] f13200v;

    /* renamed from: x */
    public Set<Integer> f13202x;

    /* renamed from: y */
    public SparseIntArray f13203y;

    /* renamed from: z */
    public TrackOutput f13204z;

    /* renamed from: j */
    public final Loader f13188j = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: m */
    public final HlsChunkSource.HlsChunkHolder f13191m = new HlsChunkSource.HlsChunkHolder();

    /* renamed from: w */
    public int[] f13201w = new int[0];

    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        /* renamed from: a */
        void mo7099a();

        /* renamed from: f */
        void mo7102f(Uri uri);
    }

    public static class EmsgUnwrappingTrackOutput implements TrackOutput {

        /* renamed from: g */
        public static final Format f13205g;

        /* renamed from: h */
        public static final Format f13206h;

        /* renamed from: a */
        public final EventMessageDecoder f13207a = new EventMessageDecoder();

        /* renamed from: b */
        public final TrackOutput f13208b;

        /* renamed from: c */
        public final Format f13209c;

        /* renamed from: d */
        public Format f13210d;

        /* renamed from: e */
        public byte[] f13211e;

        /* renamed from: f */
        public int f13212f;

        static {
            Format.Builder builder = new Format.Builder();
            builder.f9687k = "application/id3";
            f13205g = builder.m5833a();
            Format.Builder builder2 = new Format.Builder();
            builder2.f9687k = "application/x-emsg";
            f13206h = builder2.m5833a();
        }

        public EmsgUnwrappingTrackOutput(TrackOutput trackOutput, int i2) {
            this.f13208b = trackOutput;
            if (i2 == 1) {
                this.f13209c = f13205g;
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(C0576a.m4111j(33, "Unknown metadataType: ", i2));
                }
                this.f13209c = f13206h;
            }
            this.f13211e = new byte[0];
            this.f13212f = 0;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: a */
        public int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
            int i4 = this.f13212f + i2;
            byte[] bArr = this.f13211e;
            if (bArr.length < i4) {
                this.f13211e = Arrays.copyOf(bArr, (i4 / 2) + i4);
            }
            int read = dataReader.read(this.f13211e, this.f13212f, i2);
            if (read != -1) {
                this.f13212f += read;
                return read;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: b */
        public /* synthetic */ int mo6396b(DataReader dataReader, int i2, boolean z) {
            return C1008a.m6434a(this, dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: c */
        public /* synthetic */ void mo6397c(ParsableByteArray parsableByteArray, int i2) {
            C1008a.m6435b(this, parsableByteArray, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: d */
        public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
            Objects.requireNonNull(this.f13210d);
            int i5 = this.f13212f - i4;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.f13211e, i5 - i3, i5));
            byte[] bArr = this.f13211e;
            System.arraycopy(bArr, i5, bArr, 0, i4);
            this.f13212f = i4;
            if (!Util.m7728a(this.f13210d.f9659m, this.f13209c.f9659m)) {
                if (!"application/x-emsg".equals(this.f13210d.f9659m)) {
                    String valueOf = String.valueOf(this.f13210d.f9659m);
                    Log.w("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
                EventMessage m6706c = this.f13207a.m6706c(parsableByteArray);
                Format mo6698Q = m6706c.mo6698Q();
                if (!(mo6698Q != null && Util.m7728a(this.f13209c.f9659m, mo6698Q.f9659m))) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f13209c.f9659m, m6706c.mo6698Q()));
                    return;
                } else {
                    byte[] bArr2 = m6706c.mo6698Q() != null ? m6706c.f12007f : null;
                    Objects.requireNonNull(bArr2);
                    parsableByteArray = new ParsableByteArray(bArr2);
                }
            }
            int m7637a = parsableByteArray.m7637a();
            this.f13208b.mo6397c(parsableByteArray, m7637a);
            this.f13208b.mo6398d(j2, i2, m7637a, i4, cryptoData);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: e */
        public void mo6399e(Format format) {
            this.f13210d = format;
            this.f13208b.mo6399e(this.f13209c);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: f */
        public void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3) {
            int i4 = this.f13212f + i2;
            byte[] bArr = this.f13211e;
            if (bArr.length < i4) {
                this.f13211e = Arrays.copyOf(bArr, (i4 / 2) + i4);
            }
            parsableByteArray.m7641e(this.f13211e, this.f13212f, i2);
            this.f13212f += i2;
        }
    }

    public static final class HlsSampleQueue extends SampleQueue {

        /* renamed from: I */
        public final Map<String, DrmInitData> f13213I;

        /* renamed from: J */
        @Nullable
        public DrmInitData f13214J;

        public HlsSampleQueue(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map map, C11121 c11121) {
            super(allocator, looper, drmSessionManager, eventDispatcher);
            this.f13213I = map;
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue, com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: d */
        public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
            super.mo6398d(j2, i2, i3, i4, cryptoData);
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue
        /* renamed from: n */
        public Format mo6896n(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f13214J;
            if (drmInitData2 == null) {
                drmInitData2 = format.f9662p;
            }
            if (drmInitData2 != null && (drmInitData = this.f13213I.get(drmInitData2.f10710d)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = format.f9657k;
            if (metadata != null) {
                int length = metadata.f11986b.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    Metadata.Entry entry = metadata.f11986b[i3];
                    if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f12070c)) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    if (length != 1) {
                        Metadata.Entry[] entryArr = new Metadata.Entry[length - 1];
                        while (i2 < length) {
                            if (i2 != i3) {
                                entryArr[i2 < i3 ? i2 : i2 - 1] = metadata.f11986b[i2];
                            }
                            i2++;
                        }
                        metadata = new Metadata(entryArr);
                    }
                }
                if (drmInitData2 == format.f9662p || metadata != format.f9657k) {
                    Format.Builder m5829b = format.m5829b();
                    m5829b.f9690n = drmInitData2;
                    m5829b.f9685i = metadata;
                    format = m5829b.m5833a();
                }
                return super.mo6896n(format);
            }
            metadata = null;
            if (drmInitData2 == format.f9662p) {
            }
            Format.Builder m5829b2 = format.m5829b();
            m5829b2.f9690n = drmInitData2;
            m5829b2.f9685i = metadata;
            format = m5829b2.m5833a();
            return super.mo6896n(format);
        }
    }

    public HlsSampleStreamWrapper(int i2, Callback callback, HlsChunkSource hlsChunkSource, Map<String, DrmInitData> map, Allocator allocator, long j2, @Nullable Format format, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, int i3) {
        this.f13180b = i2;
        this.f13181c = callback;
        this.f13182d = hlsChunkSource;
        this.f13198t = map;
        this.f13183e = allocator;
        this.f13184f = format;
        this.f13185g = drmSessionManager;
        this.f13186h = eventDispatcher;
        this.f13187i = loadErrorHandlingPolicy;
        this.f13189k = eventDispatcher2;
        this.f13190l = i3;
        Set<Integer> set = f13155Y;
        this.f13202x = new HashSet(set.size());
        this.f13203y = new SparseIntArray(set.size());
        this.f13200v = new HlsSampleQueue[0];
        this.f13170O = new boolean[0];
        this.f13169N = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.f13192n = arrayList;
        this.f13193o = Collections.unmodifiableList(arrayList);
        this.f13197s = new ArrayList<>();
        this.f13194p = new RunnableC1118b(this, 0);
        this.f13195q = new RunnableC1118b(this, 1);
        this.f13196r = Util.m7744m();
        this.f13171P = j2;
        this.f13172Q = j2;
    }

    /* renamed from: l */
    public static DummyTrackOutput m7110l(int i2, int i3) {
        Log.w("HlsSampleStreamWrapper", C0576a.m4112k(54, "Unmapped track with id ", i2, " of type ", i3));
        return new DummyTrackOutput();
    }

    /* renamed from: n */
    public static Format m7111n(@Nullable Format format, Format format2, boolean z) {
        String m7595c;
        String str;
        if (format == null) {
            return format2;
        }
        int m7601i = MimeTypes.m7601i(format2.f9659m);
        if (Util.m7751t(format.f9656j, m7601i) == 1) {
            m7595c = Util.m7752u(format.f9656j, m7601i);
            str = MimeTypes.m7597e(m7595c);
        } else {
            m7595c = MimeTypes.m7595c(format.f9656j, format2.f9659m);
            str = format2.f9659m;
        }
        Format.Builder m5829b = format2.m5829b();
        m5829b.f9677a = format.f9648b;
        m5829b.f9678b = format.f9649c;
        m5829b.f9679c = format.f9650d;
        m5829b.f9680d = format.f9651e;
        m5829b.f9681e = format.f9652f;
        m5829b.f9682f = z ? format.f9653g : -1;
        m5829b.f9683g = z ? format.f9654h : -1;
        m5829b.f9684h = m7595c;
        if (m7601i == 2) {
            m5829b.f9692p = format.f9664r;
            m5829b.f9693q = format.f9665s;
            m5829b.f9694r = format.f9666t;
        }
        if (str != null) {
            m5829b.f9687k = str;
        }
        int i2 = format.f9672z;
        if (i2 != -1 && m7601i == 1) {
            m5829b.f9700x = i2;
        }
        Metadata metadata = format.f9657k;
        if (metadata != null) {
            Metadata metadata2 = format2.f9657k;
            if (metadata2 != null) {
                metadata = metadata2.m6697c(metadata);
            }
            m5829b.f9685i = metadata;
        }
        return m5829b.m5833a();
    }

    /* renamed from: r */
    public static int m7112r(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    /* renamed from: a */
    public void mo6850a(Format format) {
        this.f13196r.post(this.f13194p);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: b */
    public TrackOutput mo6392b(int i2, int i3) {
        Set<Integer> set = f13155Y;
        TrackOutput trackOutput = null;
        if (set.contains(Integer.valueOf(i3))) {
            Assertions.m7513a(set.contains(Integer.valueOf(i3)));
            int i4 = this.f13203y.get(i3, -1);
            if (i4 != -1) {
                if (this.f13202x.add(Integer.valueOf(i3))) {
                    this.f13201w[i4] = i2;
                }
                trackOutput = this.f13201w[i4] == i2 ? this.f13200v[i4] : m7110l(i2, i3);
            }
        } else {
            int i5 = 0;
            while (true) {
                TrackOutput[] trackOutputArr = this.f13200v;
                if (i5 >= trackOutputArr.length) {
                    break;
                }
                if (this.f13201w[i5] == i2) {
                    trackOutput = trackOutputArr[i5];
                    break;
                }
                i5++;
            }
        }
        if (trackOutput == null) {
            if (this.f13176U) {
                return m7110l(i2, i3);
            }
            int length = this.f13200v.length;
            boolean z = i3 == 1 || i3 == 2;
            HlsSampleQueue hlsSampleQueue = new HlsSampleQueue(this.f13183e, this.f13196r.getLooper(), this.f13185g, this.f13186h, this.f13198t, null);
            hlsSampleQueue.f12515u = this.f13171P;
            if (z) {
                hlsSampleQueue.f13214J = this.f13178W;
                hlsSampleQueue.f12487A = true;
            }
            hlsSampleQueue.m6887H(this.f13177V);
            HlsMediaChunk hlsMediaChunk = this.f13179X;
            if (hlsMediaChunk != null) {
                hlsSampleQueue.f12490D = hlsMediaChunk.f13089k;
            }
            hlsSampleQueue.f12501g = this;
            int i6 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f13201w, i6);
            this.f13201w = copyOf;
            copyOf[length] = i2;
            HlsSampleQueue[] hlsSampleQueueArr = this.f13200v;
            int i7 = Util.f14736a;
            Object[] copyOf2 = Arrays.copyOf(hlsSampleQueueArr, hlsSampleQueueArr.length + 1);
            copyOf2[hlsSampleQueueArr.length] = hlsSampleQueue;
            this.f13200v = (HlsSampleQueue[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f13170O, i6);
            this.f13170O = copyOf3;
            copyOf3[length] = z;
            this.f13168M = copyOf3[length] | this.f13168M;
            this.f13202x.add(Integer.valueOf(i3));
            this.f13203y.append(i3, length);
            if (m7112r(i3) > m7112r(this.f13156A)) {
                this.f13157B = length;
                this.f13156A = i3;
            }
            this.f13169N = Arrays.copyOf(this.f13169N, i6);
            trackOutput = hlsSampleQueue;
        }
        if (i3 != 5) {
            return trackOutput;
        }
        if (this.f13204z == null) {
            this.f13204z = new EmsgUnwrappingTrackOutput(trackOutput, this.f13190l);
        }
        return this.f13204z;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean continueLoading(long r57) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.continueLoading(long):boolean");
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: d */
    public void mo6393d(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    /* renamed from: e */
    public void mo6851e() {
        for (HlsSampleQueue hlsSampleQueue : this.f13200v) {
            hlsSampleQueue.m6883D();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: f */
    public void mo6852f(Chunk chunk, long j2, long j3, boolean z) {
        Chunk chunk2 = chunk;
        this.f13199u = null;
        long j4 = chunk2.f12698a;
        DataSpec dataSpec = chunk2.f12699b;
        StatsDataSource statsDataSource = chunk2.f12706i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f13187i.mo7459c(j4);
        this.f13189k.m6835f(loadEventInfo, chunk2.f12700c, this.f13180b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, chunk2.f12704g, chunk2.f12705h);
        if (z) {
            return;
        }
        if (m7117s() || this.f13160E == 0) {
            m7121w();
        }
        if (this.f13160E > 0) {
            this.f13181c.mo5784e(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: g */
    public void mo6853g(Chunk chunk, long j2, long j3) {
        Chunk chunk2 = chunk;
        this.f13199u = null;
        HlsChunkSource hlsChunkSource = this.f13182d;
        Objects.requireNonNull(hlsChunkSource);
        if (chunk2 instanceof HlsChunkSource.EncryptionKeyChunk) {
            HlsChunkSource.EncryptionKeyChunk encryptionKeyChunk = (HlsChunkSource.EncryptionKeyChunk) chunk2;
            hlsChunkSource.f13058l = encryptionKeyChunk.f12743j;
            FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = hlsChunkSource.f13056j;
            Uri uri = encryptionKeyChunk.f12699b.f14362a;
            byte[] bArr = encryptionKeyChunk.f13065l;
            Objects.requireNonNull(bArr);
            LinkedHashMap<Uri, byte[]> linkedHashMap = fullSegmentEncryptionKeyCache.f13045a;
            Objects.requireNonNull(uri);
            linkedHashMap.put(uri, bArr);
        }
        long j4 = chunk2.f12698a;
        DataSpec dataSpec = chunk2.f12699b;
        StatsDataSource statsDataSource = chunk2.f12706i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f13187i.mo7459c(j4);
        this.f13189k.m6838i(loadEventInfo, chunk2.f12700c, this.f13180b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, chunk2.f12704g, chunk2.f12705h);
        if (this.f13159D) {
            this.f13181c.mo5784e(this);
        } else {
            continueLoading(this.f13171P);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        /*
            r7 = this;
            boolean r0 = r7.f13175T
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.m7117s()
            if (r0 == 0) goto L10
            long r0 = r7.f13172Q
            return r0
        L10:
            long r0 = r7.f13171P
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = r7.m7116q()
            boolean r3 = r2.f13085H
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r7.f13192n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L33
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r7.f13192n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r2 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r2
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto L3c
            long r2 = r2.f12705h
            long r0 = java.lang.Math.max(r0, r2)
        L3c:
            boolean r2 = r7.f13158C
            if (r2 == 0) goto L53
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r7.f13200v
            int r3 = r2.length
            r4 = 0
        L44:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            long r5 = r5.m6897o()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L44
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.getBufferedPositionUs():long");
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (m7117s()) {
            return this.f13172Q;
        }
        if (this.f13175T) {
            return Long.MIN_VALUE;
        }
        return m7116q().f12705h;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    /* renamed from: h */
    public void mo6394h() {
        this.f13176U = true;
        this.f13196r.post(this.f13195q);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f13188j.m7472e();
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: k */
    public final void m7113k() {
        Assertions.m7516d(this.f13159D);
        Objects.requireNonNull(this.f13164I);
        Objects.requireNonNull(this.f13165J);
    }

    /* renamed from: m */
    public final TrackGroupArray m7114m(TrackGroup[] trackGroupArr) {
        for (int i2 = 0; i2 < trackGroupArr.length; i2++) {
            TrackGroup trackGroup = trackGroupArr[i2];
            Format[] formatArr = new Format[trackGroup.f12589b];
            for (int i3 = 0; i3 < trackGroup.f12589b; i3++) {
                Format format = trackGroup.f12590c[i3];
                formatArr[i3] = format.m5830c(this.f13185g.mo6287c(format));
            }
            trackGroupArr[i2] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: o */
    public Loader.LoadErrorAction mo6858o(Chunk chunk, long j2, long j3, IOException iOException, int i2) {
        boolean z;
        Loader.LoadErrorAction m7469c;
        int i3;
        Chunk chunk2 = chunk;
        boolean z2 = chunk2 instanceof HlsMediaChunk;
        if (z2 && !((HlsMediaChunk) chunk2).f13088K && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i3 = ((HttpDataSource.InvalidResponseCodeException) iOException).f14458d) == 410 || i3 == 404)) {
            return Loader.f14472d;
        }
        long j4 = chunk2.f12706i.f14521b;
        long j5 = chunk2.f12698a;
        DataSpec dataSpec = chunk2.f12699b;
        StatsDataSource statsDataSource = chunk2.f12706i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j5, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, j4);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk2.f12700c, this.f13180b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, Util.m7735d0(chunk2.f12704g), Util.m7735d0(chunk2.f12705h)), iOException, i2);
        LoadErrorHandlingPolicy.FallbackSelection mo7458b = this.f13187i.mo7458b(TrackSelectionUtil.m7334a(this.f13182d.f13062p), loadErrorInfo);
        if (mo7458b == null || mo7458b.f14468a != 2) {
            z = false;
        } else {
            HlsChunkSource hlsChunkSource = this.f13182d;
            long j6 = mo7458b.f14469b;
            ExoTrackSelection exoTrackSelection = hlsChunkSource.f13062p;
            z = exoTrackSelection.mo7295c(exoTrackSelection.mo7306u(hlsChunkSource.f13054h.m6922b(chunk2.f12701d)), j6);
        }
        if (z) {
            if (z2 && j4 == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.f13192n;
                Assertions.m7516d(arrayList.remove(arrayList.size() - 1) == chunk2);
                if (this.f13192n.isEmpty()) {
                    this.f13172Q = this.f13171P;
                } else {
                    ((HlsMediaChunk) Iterables.m11700e(this.f13192n)).f13087J = true;
                }
            }
            m7469c = Loader.f14473e;
        } else {
            long mo7457a = this.f13187i.mo7457a(loadErrorInfo);
            m7469c = mo7457a != -9223372036854775807L ? Loader.m7469c(false, mo7457a) : Loader.f14474f;
        }
        Loader.LoadErrorAction loadErrorAction = m7469c;
        boolean z3 = !loadErrorAction.m7476a();
        this.f13189k.m6840k(loadEventInfo, chunk2.f12700c, this.f13180b, chunk2.f12701d, chunk2.f12702e, chunk2.f12703f, chunk2.f12704g, chunk2.f12705h, iOException, z3);
        if (z3) {
            this.f13199u = null;
            this.f13187i.mo7459c(chunk2.f12698a);
        }
        if (z) {
            if (this.f13159D) {
                this.f13181c.mo5784e(this);
            } else {
                continueLoading(this.f13171P);
            }
        }
        return loadErrorAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r0 = false;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7115p(int r11) {
        /*
            r10 = this;
            com.google.android.exoplayer2.upstream.Loader r0 = r10.f13188j
            boolean r0 = r0.m7472e()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.m7516d(r0)
        Lb:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r10.f13192n
            int r0 = r0.size()
            r2 = -1
            r3 = 0
            if (r11 >= r0) goto L56
            r0 = r11
        L16:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r4 = r10.f13192n
            int r4 = r4.size()
            if (r0 >= r4) goto L2e
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r4 = r10.f13192n
            java.lang.Object r4 = r4.get(r0)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r4 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r4
            boolean r4 = r4.f13092n
            if (r4 == 0) goto L2b
            goto L4a
        L2b:
            int r0 = r0 + 1
            goto L16
        L2e:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r10.f13192n
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            r4 = 0
        L37:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r5 = r10.f13200v
            int r5 = r5.length
            if (r4 >= r5) goto L4f
            int r5 = r0.m7096g(r4)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r6 = r10.f13200v
            r6 = r6[r4]
            int r6 = r6.m6899q()
            if (r6 <= r5) goto L4c
        L4a:
            r0 = 0
            goto L50
        L4c:
            int r4 = r4 + 1
            goto L37
        L4f:
            r0 = 1
        L50:
            if (r0 == 0) goto L53
            goto L57
        L53:
            int r11 = r11 + 1
            goto Lb
        L56:
            r11 = -1
        L57:
            if (r11 != r2) goto L5a
            return
        L5a:
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = r10.m7116q()
            long r8 = r0.f12705h
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r0 = r10.f13192n
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r0 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r0
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r2 = r10.f13192n
            int r4 = r2.size()
            com.google.android.exoplayer2.util.Util.m7722U(r2, r11, r4)
            r11 = 0
        L72:
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r10.f13200v
            int r2 = r2.length
            if (r11 >= r2) goto L85
            int r2 = r0.m7096g(r11)
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r4 = r10.f13200v
            r4 = r4[r11]
            r4.m6894l(r2)
            int r11 = r11 + 1
            goto L72
        L85:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r11 = r10.f13192n
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L92
            long r1 = r10.f13171P
            r10.f13172Q = r1
            goto L9c
        L92:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r11 = r10.f13192n
            java.lang.Object r11 = com.google.common.collect.Iterables.m11700e(r11)
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r11 = (com.google.android.exoplayer2.source.hls.HlsMediaChunk) r11
            r11.f13087J = r1
        L9c:
            r10.f13175T = r3
            com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher r4 = r10.f13189k
            int r5 = r10.f13156A
            long r6 = r0.f12704g
            r4.m6846q(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.m7115p(int):void");
    }

    /* renamed from: q */
    public final HlsMediaChunk m7116q() {
        return this.f13192n.get(r0.size() - 1);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        if (this.f13188j.m7471d() || m7117s()) {
            return;
        }
        if (this.f13188j.m7472e()) {
            Objects.requireNonNull(this.f13199u);
            HlsChunkSource hlsChunkSource = this.f13182d;
            if (hlsChunkSource.f13059m != null ? false : hlsChunkSource.f13062p.mo7297e(j2, this.f13199u, this.f13193o)) {
                this.f13188j.m7470b();
                return;
            }
            return;
        }
        int size = this.f13193o.size();
        while (size > 0 && this.f13182d.m7091b(this.f13193o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f13193o.size()) {
            m7115p(size);
        }
        HlsChunkSource hlsChunkSource2 = this.f13182d;
        List<HlsMediaChunk> list = this.f13193o;
        int size2 = (hlsChunkSource2.f13059m != null || hlsChunkSource2.f13062p.length() < 2) ? list.size() : hlsChunkSource2.f13062p.mo7290k(j2, list);
        if (size2 < this.f13192n.size()) {
            m7115p(size2);
        }
    }

    /* renamed from: s */
    public final boolean m7117s() {
        return this.f13172Q != -9223372036854775807L;
    }

    /* renamed from: t */
    public final void m7118t() {
        Format format;
        if (!this.f13163H && this.f13166K == null && this.f13158C) {
            for (HlsSampleQueue hlsSampleQueue : this.f13200v) {
                if (hlsSampleQueue.m6902t() == null) {
                    return;
                }
            }
            TrackGroupArray trackGroupArray = this.f13164I;
            if (trackGroupArray != null) {
                int i2 = trackGroupArray.f12594b;
                int[] iArr = new int[i2];
                this.f13166K = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        HlsSampleQueue[] hlsSampleQueueArr = this.f13200v;
                        if (i4 < hlsSampleQueueArr.length) {
                            Format m6902t = hlsSampleQueueArr[i4].m6902t();
                            Assertions.m7518f(m6902t);
                            Format format2 = this.f13164I.f12595c[i3].f12590c[0];
                            String str = m6902t.f9659m;
                            String str2 = format2.f9659m;
                            int m7601i = MimeTypes.m7601i(str);
                            if (m7601i == 3 ? Util.m7728a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || m6902t.f9645E == format2.f9645E) : m7601i == MimeTypes.m7601i(str2)) {
                                this.f13166K[i3] = i4;
                                break;
                            }
                            i4++;
                        }
                    }
                }
                Iterator<HlsSampleStream> it = this.f13197s.iterator();
                while (it.hasNext()) {
                    it.next().m7108c();
                }
                return;
            }
            int length = this.f13200v.length;
            int i5 = 0;
            int i6 = -2;
            int i7 = -1;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                Format m6902t2 = this.f13200v[i5].m6902t();
                Assertions.m7518f(m6902t2);
                String str3 = m6902t2.f9659m;
                int i8 = MimeTypes.m7607o(str3) ? 2 : MimeTypes.m7603k(str3) ? 1 : MimeTypes.m7606n(str3) ? 3 : -2;
                if (m7112r(i8) > m7112r(i6)) {
                    i7 = i5;
                    i6 = i8;
                } else if (i8 == i6 && i7 != -1) {
                    i7 = -1;
                }
                i5++;
            }
            TrackGroup trackGroup = this.f13182d.f13054h;
            int i9 = trackGroup.f12589b;
            this.f13167L = -1;
            this.f13166K = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.f13166K[i10] = i10;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            for (int i11 = 0; i11 < length; i11++) {
                Format m6902t3 = this.f13200v[i11].m6902t();
                Assertions.m7518f(m6902t3);
                if (i11 == i7) {
                    Format[] formatArr = new Format[i9];
                    for (int i12 = 0; i12 < i9; i12++) {
                        Format format3 = trackGroup.f12590c[i12];
                        if (i6 == 1 && (format = this.f13184f) != null) {
                            format3 = format3.m5832i(format);
                        }
                        formatArr[i12] = i9 == 1 ? m6902t3.m5832i(format3) : m7111n(format3, m6902t3, true);
                    }
                    trackGroupArr[i11] = new TrackGroup(formatArr);
                    this.f13167L = i11;
                } else {
                    trackGroupArr[i11] = new TrackGroup(m7111n((i6 == 2 && MimeTypes.m7603k(m6902t3.f9659m)) ? this.f13184f : null, m6902t3, false));
                }
            }
            this.f13164I = m7114m(trackGroupArr);
            Assertions.m7516d(this.f13165J == null);
            this.f13165J = Collections.emptySet();
            this.f13159D = true;
            this.f13181c.mo7099a();
        }
    }

    /* renamed from: u */
    public void m7119u() throws IOException {
        this.f13188j.m7473f(Integer.MIN_VALUE);
        HlsChunkSource hlsChunkSource = this.f13182d;
        IOException iOException = hlsChunkSource.f13059m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = hlsChunkSource.f13060n;
        if (uri == null || !hlsChunkSource.f13064r) {
            return;
        }
        hlsChunkSource.f13053g.mo7133c(uri);
    }

    /* renamed from: v */
    public void m7120v(TrackGroup[] trackGroupArr, int i2, int... iArr) {
        this.f13164I = m7114m(trackGroupArr);
        this.f13165J = new HashSet();
        for (int i3 : iArr) {
            this.f13165J.add(this.f13164I.f12595c[i3]);
        }
        this.f13167L = i2;
        Handler handler = this.f13196r;
        Callback callback = this.f13181c;
        Objects.requireNonNull(callback);
        handler.post(new RunnableC1118b(callback, 2));
        this.f13159D = true;
    }

    /* renamed from: w */
    public final void m7121w() {
        for (HlsSampleQueue hlsSampleQueue : this.f13200v) {
            hlsSampleQueue.m6884E(this.f13173R);
        }
        this.f13173R = false;
    }

    /* renamed from: x */
    public boolean m7122x(long j2, boolean z) {
        boolean z2;
        this.f13171P = j2;
        if (m7117s()) {
            this.f13172Q = j2;
            return true;
        }
        if (this.f13158C && !z) {
            int length = this.f13200v.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f13200v[i2].m6886G(j2, false) && (this.f13170O[i2] || !this.f13168M)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.f13172Q = j2;
        this.f13175T = false;
        this.f13192n.clear();
        if (this.f13188j.m7472e()) {
            if (this.f13158C) {
                for (HlsSampleQueue hlsSampleQueue : this.f13200v) {
                    hlsSampleQueue.m6891i();
                }
            }
            this.f13188j.m7470b();
        } else {
            this.f13188j.f14477c = null;
            m7121w();
        }
        return true;
    }

    /* renamed from: y */
    public void m7123y(long j2) {
        if (this.f13177V != j2) {
            this.f13177V = j2;
            for (HlsSampleQueue hlsSampleQueue : this.f13200v) {
                if (hlsSampleQueue.f12493G != j2) {
                    hlsSampleQueue.f12493G = j2;
                    hlsSampleQueue.f12487A = true;
                }
            }
        }
    }
}
