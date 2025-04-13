package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes.dex */
public final class LoopingMediaSource extends CompositeMediaSource<Void> {

    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public int mo5611g(int i2, int i3, boolean z) {
            int mo5611g = this.f12310c.mo5611g(i2, i3, z);
            return mo5611g == -1 ? this.f12310c.mo5608c(z) : mo5611g;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        /* renamed from: n */
        public int mo5614n(int i2, int i3, boolean z) {
            int mo5614n = this.f12310c.mo5614n(i2, i3, z);
            return mo5614n == -1 ? this.f12310c.mo5610e(z) : mo5614n;
        }
    }

    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {

        /* renamed from: f */
        public final Timeline f12319f;

        /* renamed from: g */
        public final int f12320g;

        /* renamed from: h */
        public final int f12321h;

        /* renamed from: i */
        public final int f12322i;

        public LoopingTimeline(Timeline timeline, int i2) {
            super(false, new ShuffleOrder.UnshuffledShuffleOrder(i2));
            this.f12319f = timeline;
            int mo5936k = timeline.mo5936k();
            this.f12320g = mo5936k;
            this.f12321h = timeline.mo5937r();
            this.f12322i = i2;
            if (mo5936k > 0) {
                Assertions.m7517e(i2 <= Integer.MAX_VALUE / mo5936k, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: C */
        public Timeline mo5607C(int i2) {
            return this.f12319f;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return this.f12320g * this.f12322i;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return this.f12321h * this.f12322i;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: u */
        public int mo5617u(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: v */
        public int mo5618v(int i2) {
            return i2 / this.f12320g;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: w */
        public int mo5619w(int i2) {
            return i2 / this.f12321h;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: x */
        public Object mo5620x(int i2) {
            return Integer.valueOf(i2);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: y */
        public int mo5621y(int i2) {
            return i2 * this.f12320g;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: z */
        public int mo5622z(int i2) {
            return i2 * this.f12321h;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        m6801M(null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(Void r1, MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    public void mo6795L(Void r1, MediaSource mediaSource, Timeline timeline) {
        m6767G(new LoopingTimeline(timeline, 0));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        mediaPeriodId.m6829b(((Pair) mediaPeriodId.f12356a).second);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    /* renamed from: q */
    public boolean mo6775q() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    /* renamed from: t */
    public Timeline mo6776t() {
        throw null;
    }
}
