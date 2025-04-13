package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C0960p implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10253b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10254c;

    /* renamed from: d */
    public final /* synthetic */ MediaLoadData f10255d;

    public /* synthetic */ C0960p(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i2) {
        this.f10253b = i2;
        this.f10254c = eventTime;
        this.f10255d = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10253b) {
            case 0:
                ((AnalyticsListener) obj).mo6045V(this.f10254c, this.f10255d);
                break;
            default:
                ((AnalyticsListener) obj).mo6043T(this.f10254c, this.f10255d);
                break;
        }
    }
}
