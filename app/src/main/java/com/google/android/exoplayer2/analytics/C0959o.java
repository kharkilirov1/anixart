package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0959o implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10249b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10250c;

    /* renamed from: d */
    public final /* synthetic */ LoadEventInfo f10251d;

    /* renamed from: e */
    public final /* synthetic */ MediaLoadData f10252e;

    public /* synthetic */ C0959o(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.f10249b = i2;
        this.f10250c = eventTime;
        this.f10251d = loadEventInfo;
        this.f10252e = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10249b) {
            case 0:
                ((AnalyticsListener) obj).mo6036M(this.f10250c, this.f10251d, this.f10252e);
                break;
            case 1:
                ((AnalyticsListener) obj).mo6064h(this.f10250c, this.f10251d, this.f10252e);
                break;
            default:
                ((AnalyticsListener) obj).mo6044U(this.f10250c, this.f10251d, this.f10252e);
                break;
        }
    }
}
