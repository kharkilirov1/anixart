package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0947c implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10181b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10182c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10183d;

    /* renamed from: e */
    public final /* synthetic */ int f10184e;

    public /* synthetic */ C0947c(AnalyticsListener.EventTime eventTime, boolean z, int i2, int i3) {
        this.f10181b = i3;
        this.f10182c = eventTime;
        this.f10183d = z;
        this.f10184e = i2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10181b) {
            case 0:
                ((AnalyticsListener) obj).mo6053b0(this.f10182c, this.f10183d, this.f10184e);
                break;
            default:
                ((AnalyticsListener) obj).mo6029F(this.f10182c, this.f10183d, this.f10184e);
                break;
        }
    }
}
