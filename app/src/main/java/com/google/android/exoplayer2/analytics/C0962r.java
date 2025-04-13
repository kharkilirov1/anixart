package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C0962r implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10259b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10260c;

    /* renamed from: d */
    public final /* synthetic */ String f10261d;

    public /* synthetic */ C0962r(AnalyticsListener.EventTime eventTime, String str, int i2) {
        this.f10259b = i2;
        this.f10260c = eventTime;
        this.f10261d = str;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10259b) {
            case 0:
                ((AnalyticsListener) obj).mo6054c(this.f10260c, this.f10261d);
                break;
            default:
                ((AnalyticsListener) obj).mo6051a0(this.f10260c, this.f10261d);
                break;
        }
    }
}
