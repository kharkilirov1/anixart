package com.google.android.exoplayer2.source.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

@VisibleForTesting
/* loaded from: classes.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {

    /* renamed from: d */
    public final AdPlaybackState f12659d;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.m7516d(timeline.mo5936k() == 1);
        Assertions.m7516d(timeline.mo5937r() == 1);
        this.f12659d = adPlaybackState;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
        this.f12310c.mo5612i(i2, period, z);
        long j2 = period.f10052e;
        if (j2 == -9223372036854775807L) {
            j2 = this.f12659d.f12605e;
        }
        period.m6000j(period.f10049b, period.f10050c, period.f10051d, j2, period.f10053f, this.f12659d, period.f10054g);
        return period;
    }
}
