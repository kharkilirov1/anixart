package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MergingMediaPeriod;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {

    /* renamed from: v */
    public static final MediaItem f12380v;

    /* renamed from: k */
    public final boolean f12381k;

    /* renamed from: l */
    public final boolean f12382l;

    /* renamed from: m */
    public final MediaSource[] f12383m;

    /* renamed from: n */
    public final Timeline[] f12384n;

    /* renamed from: o */
    public final ArrayList<MediaSource> f12385o;

    /* renamed from: p */
    public final CompositeSequenceableLoaderFactory f12386p;

    /* renamed from: q */
    public final Map<Object, Long> f12387q;

    /* renamed from: r */
    public final Multimap<Object, ClippingMediaPeriod> f12388r;

    /* renamed from: s */
    public int f12389s;

    /* renamed from: t */
    public long[][] f12390t;

    /* renamed from: u */
    @Nullable
    public IllegalMergeException f12391u;

    public static final class ClippedTimeline extends ForwardingTimeline {

        /* renamed from: d */
        public final long[] f12392d;

        /* renamed from: e */
        public final long[] f12393e;

        public ClippedTimeline(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int mo5937r = timeline.mo5937r();
            this.f12393e = new long[timeline.mo5937r()];
            Timeline.Window window = new Timeline.Window();
            for (int i2 = 0; i2 < mo5937r; i2++) {
                this.f12393e[i2] = timeline.m5990p(i2, window).f10077o;
            }
            int mo5936k = timeline.mo5936k();
            this.f12392d = new long[mo5936k];
            Timeline.Period period = new Timeline.Period();
            for (int i3 = 0; i3 < mo5936k; i3++) {
                timeline.mo5612i(i3, period, true);
                Long l2 = map.get(period.f10050c);
                Objects.requireNonNull(l2);
                long longValue = l2.longValue();
                long[] jArr = this.f12392d;
                jArr[i3] = longValue == Long.MIN_VALUE ? period.f10052e : longValue;
                long j2 = period.f10052e;
                if (j2 != -9223372036854775807L) {
                    long[] jArr2 = this.f12393e;
                    int i4 = period.f10051d;
                    jArr2[i4] = jArr2[i4] - (j2 - jArr[i3]);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            super.mo5612i(i2, period, z);
            period.f10052e = this.f12392d[i2];
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            long j3;
            super.mo5616q(i2, window, j2);
            long j4 = this.f12393e[i2];
            window.f10077o = j4;
            if (j4 != -9223372036854775807L) {
                long j5 = window.f10076n;
                if (j5 != -9223372036854775807L) {
                    j3 = Math.min(j5, j4);
                    window.f10076n = j3;
                    return window;
                }
            }
            j3 = window.f10076n;
            window.f10076n = j3;
            return window;
        }
    }

    public static final class IllegalMergeException extends IOException {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int i2) {
        }
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f9718a = "MergingMediaSource";
        f12380v = builder.m5839a();
    }

    public MergingMediaSource(MediaSource... mediaSourceArr) {
        DefaultCompositeSequenceableLoaderFactory defaultCompositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        this.f12381k = false;
        this.f12382l = false;
        this.f12383m = mediaSourceArr;
        this.f12386p = defaultCompositeSequenceableLoaderFactory;
        this.f12385o = new ArrayList<>(Arrays.asList(mediaSourceArr));
        this.f12389s = -1;
        this.f12384n = new Timeline[mediaSourceArr.length];
        this.f12390t = new long[0][];
        this.f12387q = new HashMap();
        this.f12388r = MultimapBuilder.m11811a().m11815a().mo11814c();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        for (int i2 = 0; i2 < this.f12383m.length; i2++) {
            m6801M(Integer.valueOf(i2), this.f12383m[i2]);
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        super.mo6768I();
        Arrays.fill(this.f12384n, (Object) null);
        this.f12389s = -1;
        this.f12391u = null;
        this.f12385o.clear();
        Collections.addAll(this.f12385o, this.f12383m);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    public void mo6795L(Integer num, MediaSource mediaSource, Timeline timeline) {
        Timeline[] timelineArr;
        Integer num2 = num;
        if (this.f12391u != null) {
            return;
        }
        if (this.f12389s == -1) {
            this.f12389s = timeline.mo5936k();
        } else if (timeline.mo5936k() != this.f12389s) {
            this.f12391u = new IllegalMergeException(0);
            return;
        }
        if (this.f12390t.length == 0) {
            this.f12390t = (long[][]) Array.newInstance((Class<?>) long.class, this.f12389s, this.f12384n.length);
        }
        this.f12385o.remove(mediaSource);
        this.f12384n[num2.intValue()] = timeline;
        if (this.f12385o.isEmpty()) {
            if (this.f12381k) {
                Timeline.Period period = new Timeline.Period();
                for (int i2 = 0; i2 < this.f12389s; i2++) {
                    long j2 = -this.f12384n[0].m5987h(i2, period).f10053f;
                    int i3 = 1;
                    while (true) {
                        Timeline[] timelineArr2 = this.f12384n;
                        if (i3 < timelineArr2.length) {
                            this.f12390t[i2][i3] = j2 - (-timelineArr2[i3].m5987h(i2, period).f10053f);
                            i3++;
                        }
                    }
                }
            }
            Timeline timeline2 = this.f12384n[0];
            if (this.f12382l) {
                Timeline.Period period2 = new Timeline.Period();
                for (int i4 = 0; i4 < this.f12389s; i4++) {
                    long j3 = Long.MIN_VALUE;
                    int i5 = 0;
                    while (true) {
                        timelineArr = this.f12384n;
                        if (i5 >= timelineArr.length) {
                            break;
                        }
                        long j4 = timelineArr[i5].m5987h(i4, period2).f10052e;
                        if (j4 != -9223372036854775807L) {
                            long j5 = j4 + this.f12390t[i4][i5];
                            if (j3 == Long.MIN_VALUE || j5 < j3) {
                                j3 = j5;
                            }
                        }
                        i5++;
                    }
                    Object mo5615o = timelineArr[0].mo5615o(i4);
                    this.f12387q.put(mo5615o, Long.valueOf(j3));
                    for (ClippingMediaPeriod clippingMediaPeriod : this.f12388r.get(mo5615o)) {
                        clippingMediaPeriod.f12241f = 0L;
                        clippingMediaPeriod.f12242g = j3;
                    }
                }
                timeline2 = new ClippedTimeline(timeline2, this.f12387q);
            }
            m6767G(timeline2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        int length = this.f12383m.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int mo5609d = this.f12384n[0].mo5609d(mediaPeriodId.f12356a);
        for (int i2 = 0; i2 < length; i2++) {
            mediaPeriodArr[i2] = this.f12383m[i2].mo6797a(mediaPeriodId.m6829b(this.f12384n[i2].mo5615o(mo5609d)), allocator, j2 - this.f12390t[mo5609d][i2]);
        }
        MergingMediaPeriod mergingMediaPeriod = new MergingMediaPeriod(this.f12386p, this.f12390t[mo5609d], mediaPeriodArr);
        if (!this.f12382l) {
            return mergingMediaPeriod;
        }
        Long l2 = this.f12387q.get(mediaPeriodId.f12356a);
        Objects.requireNonNull(l2);
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(mergingMediaPeriod, true, 0L, l2.longValue());
        this.f12388r.put(mediaPeriodId.f12356a, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.f12383m;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : f12380v;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.f12391u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        if (this.f12382l) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            Iterator<Map.Entry<Object, ClippingMediaPeriod>> it = this.f12388r.mo11345b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, ClippingMediaPeriod> next = it.next();
                if (next.getValue().equals(clippingMediaPeriod)) {
                    this.f12388r.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.f12237b;
        }
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i2 = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.f12383m;
            if (i2 >= mediaSourceArr.length) {
                return;
            }
            MediaSource mediaSource = mediaSourceArr[i2];
            MediaPeriod[] mediaPeriodArr = mergingMediaPeriod.f12367b;
            mediaSource.mo6798s(mediaPeriodArr[i2] instanceof MergingMediaPeriod.TimeOffsetMediaPeriod ? ((MergingMediaPeriod.TimeOffsetMediaPeriod) mediaPeriodArr[i2]).f12375b : mediaPeriodArr[i2]);
            i2++;
        }
    }
}
