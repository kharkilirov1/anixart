package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k61;

/* renamed from: com.yandex.mobile.ads.impl.ee */
/* loaded from: classes3.dex */
public abstract class AbstractC5021ee implements rq0 {

    /* renamed from: a */
    public final k61.C5323d f49936a = new k61.C5323d();

    /* renamed from: b */
    public final boolean m24130b() {
        C5246is c5246is = (C5246is) this;
        return c5246is.getPlaybackState() == 3 && c5246is.getPlayWhenReady() && c5246is.getPlaybackSuppressionReason() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean hasNextMediaItem() {
        int mo23969a;
        C5246is c5246is = (C5246is) this;
        k61 currentTimeline = c5246is.getCurrentTimeline();
        if (currentTimeline.m26043c()) {
            mo23969a = -1;
        } else {
            int currentMediaItemIndex = c5246is.getCurrentMediaItemIndex();
            c5246is.m25688d();
            c5246is.m25689e();
            mo23969a = currentTimeline.mo23969a(currentMediaItemIndex, 0, false);
        }
        return mo23969a != -1;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean hasPreviousMediaItem() {
        int mo23977b;
        C5246is c5246is = (C5246is) this;
        k61 currentTimeline = c5246is.getCurrentTimeline();
        if (currentTimeline.m26043c()) {
            mo23977b = -1;
        } else {
            int currentMediaItemIndex = c5246is.getCurrentMediaItemIndex();
            c5246is.m25688d();
            c5246is.m25689e();
            mo23977b = currentTimeline.mo23977b(currentMediaItemIndex, 0, false);
        }
        return mo23977b != -1;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean isCurrentMediaItemDynamic() {
        C5246is c5246is = (C5246is) this;
        k61 currentTimeline = c5246is.getCurrentTimeline();
        return !currentTimeline.m26043c() && currentTimeline.mo23974a(c5246is.getCurrentMediaItemIndex(), this.f49936a, 0L).f51872i;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean isCurrentMediaItemLive() {
        C5246is c5246is = (C5246is) this;
        k61 currentTimeline = c5246is.getCurrentTimeline();
        return !currentTimeline.m26043c() && currentTimeline.mo23974a(c5246is.getCurrentMediaItemIndex(), this.f49936a, 0L).m26065a();
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean isCurrentMediaItemSeekable() {
        C5246is c5246is = (C5246is) this;
        k61 currentTimeline = c5246is.getCurrentTimeline();
        return !currentTimeline.m26043c() && currentTimeline.mo23974a(c5246is.getCurrentMediaItemIndex(), this.f49936a, 0L).f51871h;
    }
}
