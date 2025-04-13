package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {

    /* renamed from: k */
    public final MediaSource f12332k;

    /* renamed from: l */
    public final boolean f12333l;

    /* renamed from: m */
    public final Timeline.Window f12334m;

    /* renamed from: n */
    public final Timeline.Period f12335n;

    /* renamed from: o */
    public MaskingTimeline f12336o;

    /* renamed from: p */
    @Nullable
    public MaskingMediaPeriod f12337p;

    /* renamed from: q */
    public boolean f12338q;

    /* renamed from: r */
    public boolean f12339r;

    /* renamed from: s */
    public boolean f12340s;

    public static final class MaskingTimeline extends ForwardingTimeline {

        /* renamed from: f */
        public static final Object f12341f = new Object();

        /* renamed from: d */
        @Nullable
        public final Object f12342d;

        /* renamed from: e */
        @Nullable
        public final Object f12343e;

        public MaskingTimeline(Timeline timeline, @Nullable Object obj, @Nullable Object obj2) {
            super(timeline);
            this.f12342d = obj;
            this.f12343e = obj2;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: d */
        public int mo5609d(Object obj) {
            Object obj2;
            Timeline timeline = this.f12310c;
            if (f12341f.equals(obj) && (obj2 = this.f12343e) != null) {
                obj = obj2;
            }
            return timeline.mo5609d(obj);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            this.f12310c.mo5612i(i2, period, z);
            if (Util.m7728a(period.f10050c, this.f12343e) && z) {
                period.f10050c = f12341f;
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Object mo5615o(int i2) {
            Object mo5615o = this.f12310c.mo5615o(i2);
            return Util.m7728a(mo5615o, this.f12343e) ? f12341f : mo5615o;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            this.f12310c.mo5616q(i2, window, j2);
            if (Util.m7728a(window.f10064b, this.f12342d)) {
                window.f10064b = Timeline.Window.f10060s;
            }
            return window;
        }
    }

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {

        /* renamed from: c */
        public final MediaItem f12344c;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.f12344c = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: d */
        public int mo5609d(Object obj) {
            return obj == MaskingTimeline.f12341f ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            period.m6000j(z ? 0 : null, z ? MaskingTimeline.f12341f : null, 0, -9223372036854775807L, 0L, AdPlaybackState.f12599h, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Object mo5615o(int i2) {
            return MaskingTimeline.f12341f;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            window.m6005f(Timeline.Window.f10060s, this.f12344c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.f10075m = true;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z) {
        this.f12332k = mediaSource;
        this.f12333l = z && mediaSource.mo6775q();
        this.f12334m = new Timeline.Window();
        this.f12335n = new Timeline.Period();
        Timeline mo6776t = mediaSource.mo6776t();
        if (mo6776t == null) {
            this.f12336o = new MaskingTimeline(new PlaceholderTimeline(mediaSource.getMediaItem()), Timeline.Window.f10060s, MaskingTimeline.f12341f);
        } else {
            this.f12336o = new MaskingTimeline(mo6776t, null, null);
            this.f12340s = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        if (this.f12333l) {
            return;
        }
        this.f12338q = true;
        m6801M(null, this.f12332k);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        this.f12339r = false;
        this.f12338q = false;
        super.mo6768I();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(Void r2, MediaSource.MediaPeriodId mediaPeriodId) {
        Object obj = mediaPeriodId.f12356a;
        Object obj2 = this.f12336o.f12343e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = MaskingTimeline.f12341f;
        }
        return mediaPeriodId.m6829b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d1  */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6795L(java.lang.Void r10, com.google.android.exoplayer2.source.MediaSource r11, com.google.android.exoplayer2.Timeline r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.MaskingMediaSource.mo6795L(java.lang.Object, com.google.android.exoplayer2.source.MediaSource, com.google.android.exoplayer2.Timeline):void");
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public MaskingMediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
        maskingMediaPeriod.m6823h(this.f12332k);
        if (this.f12339r) {
            Object obj = mediaPeriodId.f12356a;
            if (this.f12336o.f12343e != null && obj.equals(MaskingTimeline.f12341f)) {
                obj = this.f12336o.f12343e;
            }
            maskingMediaPeriod.m6821b(mediaPeriodId.m6829b(obj));
        } else {
            this.f12337p = maskingMediaPeriod;
            if (!this.f12338q) {
                this.f12338q = true;
                m6801M(null, this.f12332k);
            }
        }
        return maskingMediaPeriod;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: P */
    public final void m6827P(long j2) {
        MaskingMediaPeriod maskingMediaPeriod = this.f12337p;
        int mo5609d = this.f12336o.mo5609d(maskingMediaPeriod.f12323b.f12356a);
        if (mo5609d == -1) {
            return;
        }
        long j3 = this.f12336o.m5987h(mo5609d, this.f12335n).f10052e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        maskingMediaPeriod.f12331j = j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12332k.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).m6822d();
        if (mediaPeriod == this.f12337p) {
            this.f12337p = null;
        }
    }
}
