package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunk;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Descriptor;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {

    /* renamed from: y */
    public static final Pattern f12772y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z */
    public static final Pattern f12773z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: b */
    public final int f12774b;

    /* renamed from: c */
    public final DashChunkSource.Factory f12775c;

    /* renamed from: d */
    @Nullable
    public final TransferListener f12776d;

    /* renamed from: e */
    public final DrmSessionManager f12777e;

    /* renamed from: f */
    public final LoadErrorHandlingPolicy f12778f;

    /* renamed from: g */
    public final BaseUrlExclusionList f12779g;

    /* renamed from: h */
    public final long f12780h;

    /* renamed from: i */
    public final LoaderErrorThrower f12781i;

    /* renamed from: j */
    public final Allocator f12782j;

    /* renamed from: k */
    public final TrackGroupArray f12783k;

    /* renamed from: l */
    public final TrackGroupInfo[] f12784l;

    /* renamed from: m */
    public final CompositeSequenceableLoaderFactory f12785m;

    /* renamed from: n */
    public final PlayerEmsgHandler f12786n;

    /* renamed from: p */
    public final MediaSourceEventListener.EventDispatcher f12788p;

    /* renamed from: q */
    public final DrmSessionEventListener.EventDispatcher f12789q;

    /* renamed from: r */
    @Nullable
    public MediaPeriod.Callback f12790r;

    /* renamed from: u */
    public SequenceableLoader f12793u;

    /* renamed from: v */
    public DashManifest f12794v;

    /* renamed from: w */
    public int f12795w;

    /* renamed from: x */
    public List<EventStream> f12796x;

    /* renamed from: s */
    public ChunkSampleStream<DashChunkSource>[] f12791s = new ChunkSampleStream[0];

    /* renamed from: t */
    public EventSampleStream[] f12792t = new EventSampleStream[0];

    /* renamed from: o */
    public final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> f12787o = new IdentityHashMap<>();

    public static final class TrackGroupInfo {

        /* renamed from: a */
        public final int[] f12797a;

        /* renamed from: b */
        public final int f12798b;

        /* renamed from: c */
        public final int f12799c;

        /* renamed from: d */
        public final int f12800d;

        /* renamed from: e */
        public final int f12801e;

        /* renamed from: f */
        public final int f12802f;

        /* renamed from: g */
        public final int f12803g;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        public TrackGroupInfo(int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7) {
            this.f12798b = i2;
            this.f12797a = iArr;
            this.f12799c = i3;
            this.f12801e = i4;
            this.f12802f = i5;
            this.f12803g = i6;
            this.f12800d = i7;
        }
    }

    public DashMediaPeriod(int i2, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i3, DashChunkSource.Factory factory, @Nullable TransferListener transferListener, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, long j2, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback) {
        List<AdaptationSet> list;
        int i4;
        int i5;
        boolean[] zArr;
        boolean z;
        Format[] formatArr;
        Descriptor m6995d;
        DrmSessionManager drmSessionManager2 = drmSessionManager;
        this.f12774b = i2;
        this.f12794v = dashManifest;
        this.f12779g = baseUrlExclusionList;
        this.f12795w = i3;
        this.f12775c = factory;
        this.f12776d = transferListener;
        this.f12777e = drmSessionManager2;
        this.f12789q = eventDispatcher;
        this.f12778f = loadErrorHandlingPolicy;
        this.f12788p = eventDispatcher2;
        this.f12780h = j2;
        this.f12781i = loaderErrorThrower;
        this.f12782j = allocator;
        this.f12785m = compositeSequenceableLoaderFactory;
        this.f12786n = new PlayerEmsgHandler(dashManifest, playerEmsgCallback, allocator);
        int i6 = 0;
        this.f12793u = compositeSequenceableLoaderFactory.mo6805a(this.f12791s);
        Period period = dashManifest.f12939m.get(i3);
        List<EventStream> list2 = period.f12964d;
        this.f12796x = list2;
        List<AdaptationSet> list3 = period.f12963c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(list3.get(i7).f12917a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            AdaptationSet adaptationSet = list3.get(i8);
            Descriptor m6995d2 = m6995d(adaptationSet.f12921e, "http://dashif.org/guidelines/trickmode");
            m6995d2 = m6995d2 == null ? m6995d(adaptationSet.f12922f, "http://dashif.org/guidelines/trickmode") : m6995d2;
            int i9 = (m6995d2 == null || (i9 = sparseIntArray.get(Integer.parseInt(m6995d2.f12955b), -1)) == -1) ? i8 : i9;
            if (i9 == i8 && (m6995d = m6995d(adaptationSet.f12922f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String str : Util.m7725X(m6995d.f12955b, ",")) {
                    int i10 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i10 != -1) {
                        i9 = Math.min(i9, i10);
                    }
                }
            }
            if (i9 != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(i9);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            iArr[i11] = Ints.m12085g((Collection) arrayList.get(i11));
            Arrays.sort(iArr[i11]);
        }
        boolean[] zArr2 = new boolean[size2];
        Format[][] formatArr2 = new Format[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            int[] iArr2 = iArr[i12];
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z = false;
                    break;
                }
                List<Representation> list6 = list3.get(iArr2[i14]).f12919c;
                while (i6 < list6.size()) {
                    if (!list6.get(i6).f12977d.isEmpty()) {
                        z = true;
                        break;
                    }
                    i6++;
                }
                i14++;
                i6 = 0;
            }
            if (z) {
                zArr2[i12] = true;
                i13++;
            }
            int[] iArr3 = iArr[i12];
            int length2 = iArr3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    formatArr = new Format[0];
                    break;
                }
                int i16 = iArr3[i15];
                AdaptationSet adaptationSet2 = list3.get(i16);
                List<Descriptor> list7 = list3.get(i16).f12920d;
                int[] iArr4 = iArr3;
                int i17 = 0;
                while (i17 < list7.size()) {
                    Descriptor descriptor = list7.get(i17);
                    int i18 = length2;
                    List<Descriptor> list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.f12954a)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f9687k = "application/cea-608";
                        int i19 = adaptationSet2.f12917a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i19);
                        sb.append(":cea608");
                        builder.f9677a = sb.toString();
                        formatArr = m6996k(descriptor, f12772y, builder.m5833a());
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.f12954a)) {
                        Format.Builder builder2 = new Format.Builder();
                        builder2.f9687k = "application/cea-708";
                        int i20 = adaptationSet2.f12917a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i20);
                        sb2.append(":cea708");
                        builder2.f9677a = sb2.toString();
                        formatArr = m6996k(descriptor, f12773z, builder2.m5833a());
                        break;
                    }
                    i17++;
                    length2 = i18;
                    list7 = list8;
                }
                i15++;
                iArr3 = iArr4;
            }
            formatArr2[i12] = formatArr;
            if (formatArr2[i12].length != 0) {
                i13++;
            }
            i12++;
            i6 = 0;
        }
        int size3 = list2.size() + i13 + size2;
        TrackGroup[] trackGroupArr = new TrackGroup[size3];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[size3];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr5 = iArr[i21];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i23 = size2;
            int i24 = 0;
            while (i24 < length3) {
                arrayList3.addAll(list3.get(iArr5[i24]).f12919c);
                i24++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            Format[] formatArr3 = new Format[size4];
            int i25 = 0;
            while (i25 < size4) {
                int i26 = size4;
                Format format = ((Representation) arrayList3.get(i25)).f12974a;
                formatArr3[i25] = format.m5830c(drmSessionManager2.mo6287c(format));
                i25++;
                size4 = i26;
                arrayList3 = arrayList3;
            }
            AdaptationSet adaptationSet3 = list3.get(iArr5[0]);
            int i27 = i22 + 1;
            if (zArr2[i21]) {
                i4 = i27 + 1;
                list = list3;
            } else {
                list = list3;
                i4 = i27;
                i27 = -1;
            }
            if (formatArr2[i21].length != 0) {
                int i28 = i4;
                i4++;
                i5 = i28;
            } else {
                i5 = -1;
            }
            trackGroupArr[i22] = new TrackGroup(formatArr3);
            trackGroupInfoArr[i22] = new TrackGroupInfo(adaptationSet3.f12918b, 0, iArr5, i22, i27, i5, -1);
            int i29 = -1;
            if (i27 != -1) {
                Format.Builder builder3 = new Format.Builder();
                int i30 = adaptationSet3.f12917a;
                zArr = zArr2;
                StringBuilder sb3 = new StringBuilder(16);
                sb3.append(i30);
                sb3.append(":emsg");
                builder3.f9677a = sb3.toString();
                builder3.f9687k = "application/x-emsg";
                trackGroupArr[i27] = new TrackGroup(builder3.m5833a());
                trackGroupInfoArr[i27] = new TrackGroupInfo(5, 1, iArr5, i22, -1, -1, -1);
                i29 = -1;
            } else {
                zArr = zArr2;
            }
            if (i5 != i29) {
                trackGroupArr[i5] = new TrackGroup(formatArr2[i21]);
                trackGroupInfoArr[i5] = new TrackGroupInfo(3, 1, iArr5, i22, -1, -1, -1);
            }
            i21++;
            size2 = i23;
            iArr = iArr6;
            drmSessionManager2 = drmSessionManager;
            i22 = i4;
            list3 = list;
            zArr2 = zArr;
        }
        int i31 = 0;
        while (i31 < list2.size()) {
            EventStream eventStream = list2.get(i31);
            Format.Builder builder4 = new Format.Builder();
            builder4.f9677a = eventStream.m7067a();
            builder4.f9687k = "application/x-emsg";
            trackGroupArr[i22] = new TrackGroup(builder4.m5833a());
            trackGroupInfoArr[i22] = new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, i31);
            i31++;
            i22++;
        }
        Pair create = Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
        this.f12783k = (TrackGroupArray) create.first;
        this.f12784l = (TrackGroupInfo[]) create.second;
    }

    @Nullable
    /* renamed from: d */
    public static Descriptor m6995d(List<Descriptor> list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (str.equals(descriptor.f12954a)) {
                return descriptor;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static Format[] m6996k(Descriptor descriptor, Pattern pattern, Format format) {
        String str = descriptor.f12955b;
        if (str == null) {
            return new Format[]{format};
        }
        int i2 = Util.f14736a;
        String[] split = str.split(";", -1);
        Format[] formatArr = new Format[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            Matcher matcher = pattern.matcher(split[i3]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            Format.Builder m5829b = format.m5829b();
            String str2 = format.f9648b;
            StringBuilder sb = new StringBuilder(C0576a.m4106e(str2, 12));
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            m5829b.f9677a = sb.toString();
            m5829b.f9675C = parseInt;
            m5829b.f9679c = matcher.group(2);
            formatArr[i3] = m5829b.m5833a();
        }
        return formatArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback
    /* renamed from: b */
    public synchronized void mo6975b(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        PlayerEmsgHandler.PlayerTrackEmsgHandler remove = this.f12787o.remove(chunkSampleStream);
        if (remove != null) {
            remove.f12910a.m6883D();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f12791s) {
            if (chunkSampleStream.f12709b == 2) {
                return chunkSampleStream.f12713f.mo6978c(j2, seekParameters);
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        return this.f12793u.continueLoading(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        long j3;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f12791s) {
            if (!chunkSampleStream.m6968n()) {
                SampleQueue sampleQueue = chunkSampleStream.f12721n;
                int i2 = sampleQueue.f12512r;
                sampleQueue.m6890h(j2, z, true);
                SampleQueue sampleQueue2 = chunkSampleStream.f12721n;
                int i3 = sampleQueue2.f12512r;
                if (i3 > i2) {
                    synchronized (sampleQueue2) {
                        j3 = sampleQueue2.f12511q == 0 ? Long.MIN_VALUE : sampleQueue2.f12509o[sampleQueue2.f12513s];
                    }
                    int i4 = 0;
                    while (true) {
                        SampleQueue[] sampleQueueArr = chunkSampleStream.f12722o;
                        if (i4 >= sampleQueueArr.length) {
                            break;
                        }
                        sampleQueueArr[i4].m6890h(j3, z, chunkSampleStream.f12712e[i4]);
                        i4++;
                    }
                }
                int min = Math.min(chunkSampleStream.m6970q(i3, 0), chunkSampleStream.f12729v);
                if (min > 0) {
                    Util.m7722U(chunkSampleStream.f12719l, 0, min);
                    chunkSampleStream.f12729v -= min;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(ChunkSampleStream<DashChunkSource> chunkSampleStream) {
        this.f12790r.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f12793u.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.f12793u.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.f12783k;
    }

    /* renamed from: h */
    public final int m6997h(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        int i4 = this.f12784l[i3].f12801e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && this.f12784l[i6].f12799c == 0) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    public void mo6789i(MediaPeriod.Callback callback, long j2) {
        this.f12790r = callback;
        callback.mo5787g(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f12793u.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int i2;
        boolean z;
        int[] iArr;
        int i3;
        int[] iArr2;
        TrackGroup trackGroup;
        int i4;
        TrackGroup trackGroup2;
        int i5;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
        ExoTrackSelection[] exoTrackSelectionArr2 = exoTrackSelectionArr;
        int[] iArr3 = new int[exoTrackSelectionArr2.length];
        int i6 = 0;
        while (true) {
            i2 = -1;
            if (i6 >= exoTrackSelectionArr2.length) {
                break;
            }
            if (exoTrackSelectionArr2[i6] != null) {
                iArr3[i6] = this.f12783k.m6923b(exoTrackSelectionArr2[i6].mo7294a());
            } else {
                iArr3[i6] = -1;
            }
            i6++;
        }
        for (int i7 = 0; i7 < exoTrackSelectionArr2.length; i7++) {
            if (exoTrackSelectionArr2[i7] == null || !zArr[i7]) {
                if (sampleStreamArr[i7] instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStreamArr[i7]).m6971r(this);
                } else if (sampleStreamArr[i7] instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) sampleStreamArr[i7]).m6974e();
                }
                sampleStreamArr[i7] = null;
            }
        }
        int i8 = 0;
        while (true) {
            z = true;
            boolean z2 = true;
            if (i8 >= exoTrackSelectionArr2.length) {
                break;
            }
            if ((sampleStreamArr[i8] instanceof EmptySampleStream) || (sampleStreamArr[i8] instanceof ChunkSampleStream.EmbeddedSampleStream)) {
                int m6997h = m6997h(i8, iArr3);
                if (m6997h == -1) {
                    z2 = sampleStreamArr[i8] instanceof EmptySampleStream;
                } else if (!(sampleStreamArr[i8] instanceof ChunkSampleStream.EmbeddedSampleStream) || ((ChunkSampleStream.EmbeddedSampleStream) sampleStreamArr[i8]).f12732b != sampleStreamArr[m6997h]) {
                    z2 = false;
                }
                if (!z2) {
                    if (sampleStreamArr[i8] instanceof ChunkSampleStream.EmbeddedSampleStream) {
                        ((ChunkSampleStream.EmbeddedSampleStream) sampleStreamArr[i8]).m6974e();
                    }
                    sampleStreamArr[i8] = null;
                }
            }
            i8++;
        }
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int i9 = 0;
        while (i9 < exoTrackSelectionArr2.length) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr2[i9];
            if (exoTrackSelection == null) {
                i3 = i9;
                iArr2 = iArr3;
            } else if (sampleStreamArr2[i9] == null) {
                zArr2[i9] = z;
                TrackGroupInfo trackGroupInfo = this.f12784l[iArr3[i9]];
                int i10 = trackGroupInfo.f12799c;
                if (i10 == 0) {
                    int i11 = trackGroupInfo.f12802f;
                    boolean z3 = i11 != i2;
                    if (z3) {
                        trackGroup = this.f12783k.f12595c[i11];
                        i4 = 1;
                    } else {
                        trackGroup = null;
                        i4 = 0;
                    }
                    int i12 = trackGroupInfo.f12803g;
                    boolean z4 = i12 != i2;
                    if (z4) {
                        trackGroup2 = this.f12783k.f12595c[i12];
                        i4 += trackGroup2.f12589b;
                    } else {
                        trackGroup2 = null;
                    }
                    Format[] formatArr = new Format[i4];
                    int[] iArr4 = new int[i4];
                    if (z3) {
                        formatArr[0] = trackGroup.f12590c[0];
                        iArr4[0] = 5;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        for (int i13 = 0; i13 < trackGroup2.f12589b; i13++) {
                            formatArr[i5] = trackGroup2.f12590c[i13];
                            iArr4[i5] = 3;
                            arrayList.add(formatArr[i5]);
                            i5 += z ? 1 : 0;
                        }
                    }
                    if (this.f12794v.f12930d && z3) {
                        PlayerEmsgHandler playerEmsgHandler = this.f12786n;
                        playerTrackEmsgHandler = playerEmsgHandler.new PlayerTrackEmsgHandler(playerEmsgHandler.f12898b);
                    } else {
                        playerTrackEmsgHandler = null;
                    }
                    iArr2 = iArr3;
                    i3 = i9;
                    PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = playerTrackEmsgHandler;
                    ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream<>(trackGroupInfo.f12798b, iArr4, formatArr, this.f12775c.mo6994a(this.f12781i, this.f12794v, this.f12779g, this.f12795w, trackGroupInfo.f12797a, exoTrackSelection, trackGroupInfo.f12798b, this.f12780h, z3, arrayList, playerTrackEmsgHandler, this.f12776d), this, this.f12782j, j2, this.f12777e, this.f12789q, this.f12778f, this.f12788p);
                    synchronized (this) {
                        this.f12787o.put(chunkSampleStream, playerTrackEmsgHandler2);
                    }
                    sampleStreamArr[i3] = chunkSampleStream;
                    sampleStreamArr2 = sampleStreamArr;
                } else {
                    i3 = i9;
                    iArr2 = iArr3;
                    if (i10 == 2) {
                        sampleStreamArr2[i3] = new EventSampleStream(this.f12796x.get(trackGroupInfo.f12800d), exoTrackSelection.mo7294a().f12590c[0], this.f12794v.f12930d);
                    }
                }
            } else {
                i3 = i9;
                iArr2 = iArr3;
                if (sampleStreamArr2[i3] instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStreamArr2[i3]).f12713f).mo6993f(exoTrackSelection);
                }
            }
            i9 = i3 + 1;
            exoTrackSelectionArr2 = exoTrackSelectionArr;
            iArr3 = iArr2;
            z = true;
            i2 = -1;
        }
        int[] iArr5 = iArr3;
        int i14 = 0;
        while (i14 < exoTrackSelectionArr.length) {
            if (sampleStreamArr2[i14] != null || exoTrackSelectionArr[i14] == null) {
                iArr = iArr5;
            } else {
                TrackGroupInfo trackGroupInfo2 = this.f12784l[iArr5[i14]];
                if (trackGroupInfo2.f12799c == 1) {
                    iArr = iArr5;
                    int m6997h2 = m6997h(i14, iArr);
                    if (m6997h2 != -1) {
                        ChunkSampleStream chunkSampleStream2 = (ChunkSampleStream) sampleStreamArr2[m6997h2];
                        int i15 = trackGroupInfo2.f12798b;
                        for (int i16 = 0; i16 < chunkSampleStream2.f12722o.length; i16++) {
                            if (chunkSampleStream2.f12710c[i16] == i15) {
                                Assertions.m7516d(!chunkSampleStream2.f12712e[i16]);
                                chunkSampleStream2.f12712e[i16] = true;
                                chunkSampleStream2.f12722o[i16].m6886G(j2, true);
                                sampleStreamArr2[i14] = new ChunkSampleStream.EmbeddedSampleStream(chunkSampleStream2, chunkSampleStream2.f12722o[i16], i16);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    sampleStreamArr2[i14] = new EmptySampleStream();
                    i14++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i14++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr2) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList2.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList3.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = new ChunkSampleStream[arrayList2.size()];
        this.f12791s = chunkSampleStreamArr;
        arrayList2.toArray(chunkSampleStreamArr);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList3.size()];
        this.f12792t = eventSampleStreamArr;
        arrayList3.toArray(eventSampleStreamArr);
        this.f12793u = this.f12785m.mo6805a(this.f12791s);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.f12781i.mo7013a();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.f12793u.reevaluateBuffer(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        BaseMediaChunk baseMediaChunk;
        boolean m6886G;
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f12791s) {
            chunkSampleStream.f12728u = j2;
            if (chunkSampleStream.m6968n()) {
                chunkSampleStream.f12727t = j2;
            } else {
                for (int i2 = 0; i2 < chunkSampleStream.f12719l.size(); i2++) {
                    baseMediaChunk = chunkSampleStream.f12719l.get(i2);
                    long j3 = baseMediaChunk.f12704g;
                    if (j3 == j2 && baseMediaChunk.f12671k == -9223372036854775807L) {
                        break;
                    }
                    if (j3 > j2) {
                        break;
                    }
                }
                baseMediaChunk = null;
                if (baseMediaChunk != null) {
                    SampleQueue sampleQueue = chunkSampleStream.f12721n;
                    int m6956e = baseMediaChunk.m6956e(0);
                    synchronized (sampleQueue) {
                        sampleQueue.m6885F();
                        int i3 = sampleQueue.f12512r;
                        if (m6956e >= i3 && m6956e <= sampleQueue.f12511q + i3) {
                            sampleQueue.f12515u = Long.MIN_VALUE;
                            sampleQueue.f12514t = m6956e - i3;
                            m6886G = true;
                        }
                        m6886G = false;
                    }
                } else {
                    m6886G = chunkSampleStream.f12721n.m6886G(j2, j2 < chunkSampleStream.getNextLoadPositionUs());
                }
                if (m6886G) {
                    chunkSampleStream.f12729v = chunkSampleStream.m6970q(chunkSampleStream.f12721n.m6899q(), 0);
                    for (SampleQueue sampleQueue2 : chunkSampleStream.f12722o) {
                        sampleQueue2.m6886G(j2, true);
                    }
                } else {
                    chunkSampleStream.f12727t = j2;
                    chunkSampleStream.f12731x = false;
                    chunkSampleStream.f12719l.clear();
                    chunkSampleStream.f12729v = 0;
                    if (chunkSampleStream.f12717j.m7472e()) {
                        chunkSampleStream.f12721n.m6891i();
                        for (SampleQueue sampleQueue3 : chunkSampleStream.f12722o) {
                            sampleQueue3.m6891i();
                        }
                        chunkSampleStream.f12717j.m7470b();
                    } else {
                        chunkSampleStream.f12717j.f14477c = null;
                        chunkSampleStream.m6972s();
                    }
                }
            }
        }
        for (EventSampleStream eventSampleStream : this.f12792t) {
            eventSampleStream.m7037c(j2);
        }
        return j2;
    }
}
