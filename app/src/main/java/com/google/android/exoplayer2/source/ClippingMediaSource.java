package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {

    /* renamed from: k */
    public final MediaSource f12247k;

    /* renamed from: l */
    public final long f12248l;

    /* renamed from: m */
    public final long f12249m;

    /* renamed from: n */
    public final boolean f12250n;

    /* renamed from: o */
    public final boolean f12251o;

    /* renamed from: p */
    public final boolean f12252p;

    /* renamed from: q */
    public final ArrayList<ClippingMediaPeriod> f12253q;

    /* renamed from: r */
    public final Timeline.Window f12254r;

    /* renamed from: s */
    @Nullable
    public ClippingTimeline f12255s;

    /* renamed from: t */
    @Nullable
    public IllegalClippingException f12256t;

    /* renamed from: u */
    public long f12257u;

    /* renamed from: v */
    public long f12258v;

    public static final class ClippingTimeline extends ForwardingTimeline {

        /* renamed from: d */
        public final long f12259d;

        /* renamed from: e */
        public final long f12260e;

        /* renamed from: f */
        public final long f12261f;

        /* renamed from: g */
        public final boolean f12262g;

        public ClippingTimeline(Timeline timeline, long j2, long j3) throws IllegalClippingException {
            super(timeline);
            boolean z = true;
            if (timeline.mo5936k() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window m5990p = timeline.m5990p(0, new Timeline.Window());
            long max = Math.max(0L, j2);
            if (!m5990p.f10075m && max != 0 && !m5990p.f10071i) {
                throw new IllegalClippingException(1);
            }
            long max2 = j3 == Long.MIN_VALUE ? m5990p.f10077o : Math.max(0L, j3);
            long j4 = m5990p.f10077o;
            if (j4 != -9223372036854775807L) {
                max2 = max2 > j4 ? j4 : max2;
                if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f12259d = max;
            this.f12260e = max2;
            this.f12261f = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
            if (!m5990p.f10072j || (max2 != -9223372036854775807L && (j4 == -9223372036854775807L || max2 != j4))) {
                z = false;
            }
            this.f12262g = z;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            this.f12310c.mo5612i(0, period, z);
            long j2 = period.f10053f - this.f12259d;
            long j3 = this.f12261f;
            period.m5999i(period.f10049b, period.f10050c, 0, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - j2, j2);
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            this.f12310c.mo5616q(0, window, 0L);
            long j3 = window.f10080r;
            long j4 = this.f12259d;
            window.f10080r = j3 + j4;
            window.f10077o = this.f12261f;
            window.f10072j = this.f12262g;
            long j5 = window.f10076n;
            if (j5 != -9223372036854775807L) {
                long max = Math.max(j5, j4);
                window.f10076n = max;
                long j6 = this.f12260e;
                if (j6 != -9223372036854775807L) {
                    max = Math.min(max, j6);
                }
                window.f10076n = max;
                window.f10076n = max - this.f12259d;
            }
            long m7735d0 = Util.m7735d0(this.f12259d);
            long j7 = window.f10068f;
            if (j7 != -9223372036854775807L) {
                window.f10068f = j7 + m7735d0;
            }
            long j8 = window.f10069g;
            if (j8 != -9223372036854775807L) {
                window.f10069g = j8 + m7735d0;
            }
            return window;
        }
    }

    public static final class IllegalClippingException extends IOException {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public IllegalClippingException(int r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L11
                r0 = 1
                if (r3 == r0) goto Le
                r0 = 2
                if (r3 == r0) goto Lb
                java.lang.String r3 = "unknown"
                goto L13
            Lb:
                java.lang.String r3 = "start exceeds end"
                goto L13
            Le:
                java.lang.String r3 = "not seekable to start"
                goto L13
            L11:
                java.lang.String r3 = "invalid period count"
            L13:
                int r0 = r3.length()
                java.lang.String r1 = "Illegal clipping: "
                if (r0 == 0) goto L20
                java.lang.String r3 = r1.concat(r3)
                goto L25
            L20:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L25:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException.<init>(int):void");
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3, boolean z, boolean z2, boolean z3) {
        Assertions.m7513a(j2 >= 0);
        Objects.requireNonNull(mediaSource);
        this.f12247k = mediaSource;
        this.f12248l = j2;
        this.f12249m = j3;
        this.f12250n = z;
        this.f12251o = z2;
        this.f12252p = z3;
        this.f12253q = new ArrayList<>();
        this.f12254r = new Timeline.Window();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        m6801M(null, this.f12247k);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        super.mo6768I();
        this.f12256t = null;
        this.f12255s = null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    public void mo6795L(Void r1, MediaSource mediaSource, Timeline timeline) {
        if (this.f12256t != null) {
            return;
        }
        m6796O(timeline);
    }

    /* renamed from: O */
    public final void m6796O(Timeline timeline) {
        long j2;
        long j3;
        long j4;
        timeline.m5990p(0, this.f12254r);
        long j5 = this.f12254r.f10080r;
        if (this.f12255s == null || this.f12253q.isEmpty() || this.f12251o) {
            long j6 = this.f12248l;
            long j7 = this.f12249m;
            if (this.f12252p) {
                long j8 = this.f12254r.f10076n;
                j6 += j8;
                j2 = j8 + j7;
            } else {
                j2 = j7;
            }
            this.f12257u = j5 + j6;
            this.f12258v = j7 != Long.MIN_VALUE ? j5 + j2 : Long.MIN_VALUE;
            int size = this.f12253q.size();
            for (int i2 = 0; i2 < size; i2++) {
                ClippingMediaPeriod clippingMediaPeriod = this.f12253q.get(i2);
                long j9 = this.f12257u;
                long j10 = this.f12258v;
                clippingMediaPeriod.f12241f = j9;
                clippingMediaPeriod.f12242g = j10;
            }
            j3 = j6;
            j4 = j2;
        } else {
            long j11 = this.f12257u - j5;
            j4 = this.f12249m != Long.MIN_VALUE ? this.f12258v - j5 : Long.MIN_VALUE;
            j3 = j11;
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j3, j4);
            this.f12255s = clippingTimeline;
            m6767G(clippingTimeline);
        } catch (IllegalClippingException e2) {
            this.f12256t = e2;
            for (int i3 = 0; i3 < this.f12253q.size(); i3++) {
                this.f12253q.get(i3).f12243h = this.f12256t;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.f12247k.mo6797a(mediaPeriodId, allocator, j2), this.f12250n, this.f12257u, this.f12258v);
        this.f12253q.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12247k.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.f12256t;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        Assertions.m7516d(this.f12253q.remove(mediaPeriod));
        this.f12247k.mo6798s(((ClippingMediaPeriod) mediaPeriod).f12237b);
        if (!this.f12253q.isEmpty() || this.f12251o) {
            return;
        }
        ClippingTimeline clippingTimeline = this.f12255s;
        Objects.requireNonNull(clippingTimeline);
        m6796O(clippingTimeline.f12310c);
    }
}
