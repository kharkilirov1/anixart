package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0956l implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10237b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10238c;

    /* renamed from: d */
    public final /* synthetic */ int f10239d;

    /* renamed from: e */
    public final /* synthetic */ long f10240e;

    /* renamed from: f */
    public final /* synthetic */ long f10241f;

    public /* synthetic */ C0956l(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3, int i3) {
        this.f10237b = i3;
        this.f10238c = eventTime;
        this.f10239d = i2;
        this.f10240e = j2;
        this.f10241f = j3;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10237b) {
            case 0:
                ((AnalyticsListener) obj).mo6050a(this.f10238c, this.f10239d, this.f10240e, this.f10241f);
                break;
            default:
                ((AnalyticsListener) obj).mo6084r(this.f10238c, this.f10239d, this.f10240e, this.f10241f);
                break;
        }
    }
}
