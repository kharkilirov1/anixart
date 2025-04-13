package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0945a implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10176b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10177c;

    public /* synthetic */ C0945a(AnalyticsListener.EventTime eventTime, int i2) {
        this.f10176b = i2;
        this.f10177c = eventTime;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10176b) {
            case 0:
                ((AnalyticsListener) obj).mo6065h0(this.f10177c);
                break;
            case 1:
                ((AnalyticsListener) obj).mo6074m(this.f10177c);
                break;
            case 2:
                ((AnalyticsListener) obj).mo6027D(this.f10177c);
                break;
            case 3:
                ((AnalyticsListener) obj).mo6033J(this.f10177c);
                break;
            case 4:
                ((AnalyticsListener) obj).mo6076n(this.f10177c);
                break;
            case 5:
                ((AnalyticsListener) obj).mo6083q0(this.f10177c);
                break;
            default:
                ((AnalyticsListener) obj).mo6062g(this.f10177c);
                break;
        }
    }
}
