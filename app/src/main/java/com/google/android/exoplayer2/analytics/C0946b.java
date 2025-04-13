package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0946b implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10178b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10179c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10180d;

    public /* synthetic */ C0946b(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
        this.f10178b = i2;
        this.f10179c = eventTime;
        this.f10180d = z;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10178b) {
            case 0:
                ((AnalyticsListener) obj).mo6049Z(this.f10179c, this.f10180d);
                break;
            case 1:
                AnalyticsListener.EventTime eventTime = this.f10179c;
                boolean z = this.f10180d;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6082q(eventTime, z);
                analyticsListener.mo6079o0(eventTime, z);
                break;
            case 2:
                ((AnalyticsListener) obj).mo6041R(this.f10179c, this.f10180d);
                break;
            default:
                ((AnalyticsListener) obj).mo6040Q(this.f10179c, this.f10180d);
                break;
        }
    }
}
