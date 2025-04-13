package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0963s implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10262b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10263c;

    /* renamed from: d */
    public final /* synthetic */ String f10264d;

    /* renamed from: e */
    public final /* synthetic */ long f10265e;

    /* renamed from: f */
    public final /* synthetic */ long f10266f;

    public /* synthetic */ C0963s(AnalyticsListener.EventTime eventTime, String str, long j2, long j3, int i2) {
        this.f10262b = i2;
        this.f10263c = eventTime;
        this.f10264d = str;
        this.f10265e = j2;
        this.f10266f = j3;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10262b) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f10263c;
                String str = this.f10264d;
                long j2 = this.f10265e;
                long j3 = this.f10266f;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6024A(eventTime, str, j2);
                analyticsListener.mo6092z(eventTime, str, j3, j2);
                analyticsListener.mo6066i(eventTime, 1, str, j2);
                break;
            default:
                AnalyticsListener.EventTime eventTime2 = this.f10263c;
                String str2 = this.f10264d;
                long j4 = this.f10265e;
                long j5 = this.f10266f;
                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj;
                analyticsListener2.mo6063g0(eventTime2, str2, j4);
                analyticsListener2.mo6055c0(eventTime2, str2, j5, j4);
                analyticsListener2.mo6066i(eventTime2, 2, str2, j4);
                break;
        }
    }
}
