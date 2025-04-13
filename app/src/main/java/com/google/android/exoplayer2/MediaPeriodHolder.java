package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
final class MediaPeriodHolder {

    /* renamed from: a */
    public final MediaPeriod f9857a;

    /* renamed from: b */
    public final Object f9858b;

    /* renamed from: c */
    public final SampleStream[] f9859c;

    /* renamed from: d */
    public boolean f9860d;

    /* renamed from: e */
    public boolean f9861e;

    /* renamed from: f */
    public MediaPeriodInfo f9862f;

    /* renamed from: g */
    public boolean f9863g;

    /* renamed from: h */
    public final boolean[] f9864h;

    /* renamed from: i */
    public final RendererCapabilities[] f9865i;

    /* renamed from: j */
    public final TrackSelector f9866j;

    /* renamed from: k */
    public final MediaSourceList f9867k;

    /* renamed from: l */
    @Nullable
    public MediaPeriodHolder f9868l;

    /* renamed from: m */
    public TrackGroupArray f9869m;

    /* renamed from: n */
    public TrackSelectorResult f9870n;

    /* renamed from: o */
    public long f9871o;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j2, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.f9865i = rendererCapabilitiesArr;
        this.f9871o = j2;
        this.f9866j = trackSelector;
        this.f9867k = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f9872a;
        this.f9858b = mediaPeriodId.f12356a;
        this.f9862f = mediaPeriodInfo;
        this.f9869m = TrackGroupArray.f12592e;
        this.f9870n = trackSelectorResult;
        this.f9859c = new SampleStream[rendererCapabilitiesArr.length];
        this.f9864h = new boolean[rendererCapabilitiesArr.length];
        long j3 = mediaPeriodInfo.f9873b;
        long j4 = mediaPeriodInfo.f9875d;
        Objects.requireNonNull(mediaSourceList);
        Pair pair = (Pair) mediaPeriodId.f12356a;
        Object obj = pair.first;
        MediaSource.MediaPeriodId m6829b = mediaPeriodId.m6829b(pair.second);
        MediaSourceList.MediaSourceHolder mediaSourceHolder = mediaSourceList.f9896c.get(obj);
        Objects.requireNonNull(mediaSourceHolder);
        mediaSourceList.f9901h.add(mediaSourceHolder);
        MediaSourceList.MediaSourceAndListener mediaSourceAndListener = mediaSourceList.f9900g.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.f9909a.mo6778v(mediaSourceAndListener.f9910b);
        }
        mediaSourceHolder.f9914c.add(m6829b);
        MediaPeriod mo6797a = mediaSourceHolder.f9912a.mo6797a(m6829b, allocator, j3);
        mediaSourceList.f9895b.put(mo6797a, mediaSourceHolder);
        mediaSourceList.m5883d();
        this.f9857a = j4 != -9223372036854775807L ? new ClippingMediaPeriod(mo6797a, true, 0L, j4) : mo6797a;
    }

    /* renamed from: a */
    public long m5850a(TrackSelectorResult trackSelectorResult, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= trackSelectorResult.f14031a) {
                break;
            }
            boolean[] zArr2 = this.f9864h;
            if (z || !trackSelectorResult.m7335a(this.f9870n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        SampleStream[] sampleStreamArr = this.f9859c;
        int i3 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.f9865i;
            if (i3 >= rendererCapabilitiesArr.length) {
                break;
            }
            if (rendererCapabilitiesArr[i3].mo5661g() == -2) {
                sampleStreamArr[i3] = null;
            }
            i3++;
        }
        m5851b();
        this.f9870n = trackSelectorResult;
        m5852c();
        long mo6790j = this.f9857a.mo6790j(trackSelectorResult.f14033c, this.f9864h, this.f9859c, zArr, j2);
        SampleStream[] sampleStreamArr2 = this.f9859c;
        int i4 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr2 = this.f9865i;
            if (i4 >= rendererCapabilitiesArr2.length) {
                break;
            }
            if (rendererCapabilitiesArr2[i4].mo5661g() == -2 && this.f9870n.m7336b(i4)) {
                sampleStreamArr2[i4] = new EmptySampleStream();
            }
            i4++;
        }
        this.f9861e = false;
        int i5 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.f9859c;
            if (i5 >= sampleStreamArr3.length) {
                return mo6790j;
            }
            if (sampleStreamArr3[i5] != null) {
                Assertions.m7516d(trackSelectorResult.m7336b(i5));
                if (this.f9865i[i5].mo5661g() != -2) {
                    this.f9861e = true;
                }
            } else {
                Assertions.m7516d(trackSelectorResult.f14033c[i5] == null);
            }
            i5++;
        }
    }

    /* renamed from: b */
    public final void m5851b() {
        if (!m5856g()) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f9870n;
            if (i2 >= trackSelectorResult.f14031a) {
                return;
            }
            boolean m7336b = trackSelectorResult.m7336b(i2);
            ExoTrackSelection exoTrackSelection = this.f9870n.f14033c[i2];
            if (m7336b && exoTrackSelection != null) {
                exoTrackSelection.mo7288f();
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m5852c() {
        if (!m5856g()) {
            return;
        }
        int i2 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.f9870n;
            if (i2 >= trackSelectorResult.f14031a) {
                return;
            }
            boolean m7336b = trackSelectorResult.m7336b(i2);
            ExoTrackSelection exoTrackSelection = this.f9870n.f14033c[i2];
            if (m7336b && exoTrackSelection != null) {
                exoTrackSelection.mo7289i();
            }
            i2++;
        }
    }

    /* renamed from: d */
    public long m5853d() {
        if (!this.f9860d) {
            return this.f9862f.f9873b;
        }
        long bufferedPositionUs = this.f9861e ? this.f9857a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f9862f.f9876e : bufferedPositionUs;
    }

    /* renamed from: e */
    public long m5854e() {
        return this.f9862f.f9873b + this.f9871o;
    }

    /* renamed from: f */
    public boolean m5855f() {
        return this.f9860d && (!this.f9861e || this.f9857a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean m5856g() {
        return this.f9868l == null;
    }

    /* renamed from: h */
    public void m5857h() {
        m5851b();
        MediaSourceList mediaSourceList = this.f9867k;
        MediaPeriod mediaPeriod = this.f9857a;
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.m5887h(((ClippingMediaPeriod) mediaPeriod).f12237b);
            } else {
                mediaSourceList.m5887h(mediaPeriod);
            }
        } catch (RuntimeException e2) {
            Log.m7585b("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* renamed from: i */
    public TrackSelectorResult m5858i(float f2, Timeline timeline) throws ExoPlaybackException {
        TrackSelectorResult mo7326b = this.f9866j.mo7326b(this.f9865i, this.f9869m, this.f9862f.f9872a, timeline);
        for (ExoTrackSelection exoTrackSelection : mo7326b.f14033c) {
            if (exoTrackSelection != null) {
                exoTrackSelection.mo7291q(f2);
            }
        }
        return mo7326b;
    }

    /* renamed from: j */
    public void m5859j() {
        MediaPeriod mediaPeriod = this.f9857a;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j2 = this.f9862f.f9875d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            clippingMediaPeriod.f12241f = 0L;
            clippingMediaPeriod.f12242g = j2;
        }
    }
}
