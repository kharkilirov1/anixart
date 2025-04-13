package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HlsMediaPeriod implements MediaPeriod, HlsSampleStreamWrapper.Callback, HlsPlaylistTracker.PlaylistEventListener {

    /* renamed from: b */
    public final HlsExtractorFactory f13105b;

    /* renamed from: c */
    public final HlsPlaylistTracker f13106c;

    /* renamed from: d */
    public final HlsDataSourceFactory f13107d;

    /* renamed from: e */
    @Nullable
    public final TransferListener f13108e;

    /* renamed from: f */
    public final DrmSessionManager f13109f;

    /* renamed from: g */
    public final DrmSessionEventListener.EventDispatcher f13110g;

    /* renamed from: h */
    public final LoadErrorHandlingPolicy f13111h;

    /* renamed from: i */
    public final MediaSourceEventListener.EventDispatcher f13112i;

    /* renamed from: j */
    public final Allocator f13113j;

    /* renamed from: m */
    public final CompositeSequenceableLoaderFactory f13116m;

    /* renamed from: n */
    public final boolean f13117n;

    /* renamed from: o */
    public final int f13118o;

    /* renamed from: p */
    public final boolean f13119p;

    /* renamed from: q */
    @Nullable
    public MediaPeriod.Callback f13120q;

    /* renamed from: r */
    public int f13121r;

    /* renamed from: s */
    public TrackGroupArray f13122s;

    /* renamed from: v */
    public int f13125v;

    /* renamed from: w */
    public SequenceableLoader f13126w;

    /* renamed from: k */
    public final IdentityHashMap<SampleStream, Integer> f13114k = new IdentityHashMap<>();

    /* renamed from: l */
    public final TimestampAdjusterProvider f13115l = new TimestampAdjusterProvider();

    /* renamed from: t */
    public HlsSampleStreamWrapper[] f13123t = new HlsSampleStreamWrapper[0];

    /* renamed from: u */
    public HlsSampleStreamWrapper[] f13124u = new HlsSampleStreamWrapper[0];

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z, int i2, boolean z2) {
        this.f13105b = hlsExtractorFactory;
        this.f13106c = hlsPlaylistTracker;
        this.f13107d = hlsDataSourceFactory;
        this.f13108e = transferListener;
        this.f13109f = drmSessionManager;
        this.f13110g = eventDispatcher;
        this.f13111h = loadErrorHandlingPolicy;
        this.f13112i = eventDispatcher2;
        this.f13113j = allocator;
        this.f13116m = compositeSequenceableLoaderFactory;
        this.f13117n = z;
        this.f13118o = i2;
        this.f13119p = z2;
        this.f13126w = compositeSequenceableLoaderFactory.mo6805a(new SequenceableLoader[0]);
    }

    /* renamed from: k */
    public static Format m7098k(Format format, @Nullable Format format2, boolean z) {
        String str;
        Metadata metadata;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        if (format2 != null) {
            str2 = format2.f9656j;
            metadata = format2.f9657k;
            int i5 = format2.f9672z;
            i3 = format2.f9651e;
            int i6 = format2.f9652f;
            String str4 = format2.f9650d;
            str3 = format2.f9649c;
            i4 = i5;
            i2 = i6;
            str = str4;
        } else {
            String m7752u = Util.m7752u(format.f9656j, 1);
            Metadata metadata2 = format.f9657k;
            if (z) {
                int i7 = format.f9672z;
                int i8 = format.f9651e;
                int i9 = format.f9652f;
                str = format.f9650d;
                str2 = m7752u;
                str3 = format.f9649c;
                i4 = i7;
                i3 = i8;
                metadata = metadata2;
                i2 = i9;
            } else {
                str = null;
                metadata = metadata2;
                i2 = 0;
                i3 = 0;
                i4 = -1;
                str2 = m7752u;
                str3 = null;
            }
        }
        String m7597e = MimeTypes.m7597e(str2);
        int i10 = z ? format.f9653g : -1;
        int i11 = z ? format.f9654h : -1;
        Format.Builder builder = new Format.Builder();
        builder.f9677a = format.f9648b;
        builder.f9678b = str3;
        builder.f9686j = format.f9658l;
        builder.f9687k = m7597e;
        builder.f9684h = str2;
        builder.f9685i = metadata;
        builder.f9682f = i10;
        builder.f9683g = i11;
        builder.f9700x = i4;
        builder.f9680d = i3;
        builder.f9681e = i2;
        builder.f9679c = str;
        return builder.m5833a();
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    /* renamed from: a */
    public void mo7099a() {
        int i2 = this.f13121r - 1;
        this.f13121r = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f13123t) {
            hlsSampleStreamWrapper.m7113k();
            i3 += hlsSampleStreamWrapper.f13164I.f12594b;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i3];
        int i4 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : this.f13123t) {
            hlsSampleStreamWrapper2.m7113k();
            int i5 = hlsSampleStreamWrapper2.f13164I.f12594b;
            int i6 = 0;
            while (i6 < i5) {
                hlsSampleStreamWrapper2.m7113k();
                trackGroupArr[i4] = hlsSampleStreamWrapper2.f13164I.f12595c[i6];
                i6++;
                i4++;
            }
        }
        this.f13122s = new TrackGroupArray(trackGroupArr);
        this.f13120q.mo5787g(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    /* renamed from: b */
    public void mo7100b() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f13123t) {
            if (!hlsSampleStreamWrapper.f13192n.isEmpty()) {
                HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) Iterables.m11700e(hlsSampleStreamWrapper.f13192n);
                int m7091b = hlsSampleStreamWrapper.f13182d.m7091b(hlsMediaChunk);
                if (m7091b == 1) {
                    hlsMediaChunk.f13088K = true;
                } else if (m7091b == 2 && !hlsSampleStreamWrapper.f13175T && hlsSampleStreamWrapper.f13188j.m7472e()) {
                    hlsSampleStreamWrapper.f13188j.m7470b();
                }
            }
        }
        this.f13120q.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: c */
    public long mo6788c(long j2, SeekParameters seekParameters) {
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.f13122s != null) {
            return this.f13126w.continueLoading(j2);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f13123t) {
            if (!hlsSampleStreamWrapper.f13159D) {
                hlsSampleStreamWrapper.continueLoading(hlsSampleStreamWrapper.f13171P);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo7101d(android.net.Uri r17, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper[] r2 = r0.f13123t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L92
            r8 = r2[r6]
            com.google.android.exoplayer2.source.hls.HlsChunkSource r9 = r8.f13182d
            android.net.Uri[] r9 = r9.f13051e
            boolean r9 = com.google.android.exoplayer2.util.Util.m7743l(r9, r1)
            if (r9 != 0) goto L1b
            r13 = r18
            goto L8a
        L1b:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3c
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy r11 = r8.f13187i
            com.google.android.exoplayer2.source.hls.HlsChunkSource r12 = r8.f13182d
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r12 = r12.f13062p
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackOptions r12 = com.google.android.exoplayer2.trackselection.TrackSelectionUtil.m7334a(r12)
            r13 = r18
            com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$FallbackSelection r11 = r11.mo7458b(r12, r13)
            if (r11 == 0) goto L3e
            int r12 = r11.f14468a
            r14 = 2
            if (r12 != r14) goto L3e
            long r11 = r11.f14469b
            goto L3f
        L3c:
            r13 = r18
        L3e:
            r11 = r9
        L3f:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r8 = r8.f13182d
            r14 = 0
        L42:
            android.net.Uri[] r15 = r8.f13051e
            int r4 = r15.length
            r5 = -1
            if (r14 >= r4) goto L54
            r4 = r15[r14]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L51
            goto L55
        L51:
            int r14 = r14 + 1
            goto L42
        L54:
            r14 = -1
        L55:
            if (r14 != r5) goto L58
            goto L83
        L58:
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r4 = r8.f13062p
            int r4 = r4.mo7306u(r14)
            if (r4 != r5) goto L61
            goto L83
        L61:
            boolean r5 = r8.f13064r
            android.net.Uri r14 = r8.f13060n
            boolean r14 = r1.equals(r14)
            r5 = r5 | r14
            r8.f13064r = r5
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto L83
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r5 = r8.f13062p
            boolean r4 = r5.mo7295c(r4, r11)
            if (r4 == 0) goto L81
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r4 = r8.f13053g
            boolean r4 = r4.mo7136h(r1, r11)
            if (r4 == 0) goto L81
            goto L83
        L81:
            r4 = 0
            goto L84
        L83:
            r4 = 1
        L84:
            if (r4 == 0) goto L8c
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L8c
        L8a:
            r4 = 1
            goto L8d
        L8c:
            r4 = 0
        L8d:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L92:
            com.google.android.exoplayer2.source.MediaPeriod$Callback r1 = r0.f13120q
            r1.mo5784e(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaPeriod.mo7101d(android.net.Uri, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy$LoadErrorInfo, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f13124u) {
            if (hlsSampleStreamWrapper.f13158C && !hlsSampleStreamWrapper.m7117s()) {
                int length = hlsSampleStreamWrapper.f13200v.length;
                for (int i2 = 0; i2 < length; i2++) {
                    hlsSampleStreamWrapper.f13200v[i2].m6890h(j2, z, hlsSampleStreamWrapper.f13169N[i2]);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* renamed from: e */
    public void mo5784e(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.f13120q.mo5784e(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    /* renamed from: f */
    public void mo7102f(Uri uri) {
        this.f13106c.mo7140l(uri);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f13126w.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.f13126w.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.f13122s;
        Objects.requireNonNull(trackGroupArray);
        return trackGroupArray;
    }

    /* renamed from: h */
    public final HlsSampleStreamWrapper m7103h(int i2, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j2) {
        return new HlsSampleStreamWrapper(i2, this, new HlsChunkSource(this.f13105b, this.f13106c, uriArr, formatArr, this.f13107d, this.f13108e, this.f13115l, list), map, this.f13113j, j2, format, this.f13109f, this.f13110g, this.f13111h, this.f13112i, this.f13118o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.HashMap] */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6789i(com.google.android.exoplayer2.source.MediaPeriod.Callback r23, long r24) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaPeriod.mo6789i(com.google.android.exoplayer2.source.MediaPeriod$Callback, long):void");
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f13126w.isLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x025f  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6790j(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r36, boolean[] r37, com.google.android.exoplayer2.source.SampleStream[] r38, boolean[] r39, long r40) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaPeriod.mo6790j(com.google.android.exoplayer2.trackselection.ExoTrackSelection[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f13123t) {
            hlsSampleStreamWrapper.m7119u();
            if (hlsSampleStreamWrapper.f13175T && !hlsSampleStreamWrapper.f13159D) {
                throw ParserException.m5907a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.f13126w.reevaluateBuffer(j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.f13124u;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean m7122x = hlsSampleStreamWrapperArr[0].m7122x(j2, false);
            int i2 = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.f13124u;
                if (i2 >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i2].m7122x(j2, m7122x);
                i2++;
            }
            if (m7122x) {
                this.f13115l.f13233a.clear();
            }
        }
        return j2;
    }
}
