package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0955k implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10234b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10235c;

    /* renamed from: d */
    public final /* synthetic */ int f10236d;

    public /* synthetic */ C0955k(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        this.f10234b = i3;
        this.f10235c = eventTime;
        this.f10236d = i2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10234b) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f10235c;
                int i2 = this.f10236d;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6077n0(eventTime);
                analyticsListener.mo6060f(eventTime, i2);
                break;
            case 1:
                ((AnalyticsListener) obj).mo6061f0(this.f10235c, this.f10236d);
                break;
            case 2:
                ((AnalyticsListener) obj).mo6078o(this.f10235c, this.f10236d);
                break;
            case 3:
                ((AnalyticsListener) obj).mo6026C(this.f10235c, this.f10236d);
                break;
            default:
                ((AnalyticsListener) obj).mo6031H(this.f10235c, this.f10236d);
                break;
        }
    }
}
