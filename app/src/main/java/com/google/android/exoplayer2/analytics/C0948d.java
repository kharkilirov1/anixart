package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0948d implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10185b = 0;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10186c;

    /* renamed from: d */
    public final /* synthetic */ long f10187d;

    /* renamed from: e */
    public final /* synthetic */ int f10188e;

    public /* synthetic */ C0948d(AnalyticsListener.EventTime eventTime, int i2, long j2) {
        this.f10186c = eventTime;
        this.f10188e = i2;
        this.f10187d = j2;
    }

    public /* synthetic */ C0948d(AnalyticsListener.EventTime eventTime, long j2, int i2) {
        this.f10186c = eventTime;
        this.f10187d = j2;
        this.f10188e = i2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10185b) {
            case 0:
                ((AnalyticsListener) obj).mo6046W(this.f10186c, this.f10188e, this.f10187d);
                break;
            default:
                ((AnalyticsListener) obj).mo6058e(this.f10186c, this.f10187d, this.f10188e);
                break;
        }
    }
}
