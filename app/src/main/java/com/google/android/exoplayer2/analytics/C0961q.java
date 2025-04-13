package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0961q implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10256b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10257c;

    /* renamed from: d */
    public final /* synthetic */ Exception f10258d;

    public /* synthetic */ C0961q(AnalyticsListener.EventTime eventTime, Exception exc, int i2) {
        this.f10256b = i2;
        this.f10257c = eventTime;
        this.f10258d = exc;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10256b) {
            case 0:
                ((AnalyticsListener) obj).mo6042S(this.f10257c, this.f10258d);
                break;
            case 1:
                ((AnalyticsListener) obj).mo6059e0(this.f10257c, this.f10258d);
                break;
            case 2:
                ((AnalyticsListener) obj).mo6072l(this.f10257c, this.f10258d);
                break;
            default:
                ((AnalyticsListener) obj).mo6048Y(this.f10257c, this.f10258d);
                break;
        }
    }
}
