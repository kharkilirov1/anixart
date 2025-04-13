package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

/* loaded from: classes.dex */
public abstract class ForwardingTimeline extends Timeline {

    /* renamed from: c */
    public final Timeline f12310c;

    public ForwardingTimeline(Timeline timeline) {
        this.f12310c = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: c */
    public int mo5608c(boolean z) {
        return this.f12310c.mo5608c(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: d */
    public int mo5609d(Object obj) {
        return this.f12310c.mo5609d(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: e */
    public int mo5610e(boolean z) {
        return this.f12310c.mo5610e(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public int mo5611g(int i2, int i3, boolean z) {
        return this.f12310c.mo5611g(i2, i3, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
        return this.f12310c.mo5612i(i2, period, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: k */
    public int mo5936k() {
        return this.f12310c.mo5936k();
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: n */
    public int mo5614n(int i2, int i3, boolean z) {
        return this.f12310c.mo5614n(i2, i3, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    public Object mo5615o(int i2) {
        return this.f12310c.mo5615o(i2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: q */
    public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
        return this.f12310c.mo5616q(i2, window, j2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: r */
    public int mo5937r() {
        return this.f12310c.mo5937r();
    }
}
