package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0958n implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10246b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10247c;

    /* renamed from: d */
    public final /* synthetic */ DecoderCounters f10248d;

    public /* synthetic */ C0958n(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i2) {
        this.f10246b = i2;
        this.f10247c = eventTime;
        this.f10248d = decoderCounters;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10246b) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f10247c;
                DecoderCounters decoderCounters = this.f10248d;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6091y(eventTime, decoderCounters);
                analyticsListener.mo6089w(eventTime, 2, decoderCounters);
                break;
            case 1:
                AnalyticsListener.EventTime eventTime2 = this.f10247c;
                DecoderCounters decoderCounters2 = this.f10248d;
                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj;
                analyticsListener2.mo6087u(eventTime2, decoderCounters2);
                analyticsListener2.mo6089w(eventTime2, 1, decoderCounters2);
                break;
            case 2:
                AnalyticsListener.EventTime eventTime3 = this.f10247c;
                DecoderCounters decoderCounters3 = this.f10248d;
                AnalyticsListener analyticsListener3 = (AnalyticsListener) obj;
                analyticsListener3.mo6086t(eventTime3, decoderCounters3);
                analyticsListener3.mo6075m0(eventTime3, 1, decoderCounters3);
                break;
            default:
                AnalyticsListener.EventTime eventTime4 = this.f10247c;
                DecoderCounters decoderCounters4 = this.f10248d;
                AnalyticsListener analyticsListener4 = (AnalyticsListener) obj;
                analyticsListener4.mo6081p0(eventTime4, decoderCounters4);
                analyticsListener4.mo6075m0(eventTime4, 2, decoderCounters4);
                break;
        }
    }
}
