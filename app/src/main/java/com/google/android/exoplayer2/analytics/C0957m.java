package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0957m implements ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f10242b;

    /* renamed from: c */
    public final /* synthetic */ AnalyticsListener.EventTime f10243c;

    /* renamed from: d */
    public final /* synthetic */ Format f10244d;

    /* renamed from: e */
    public final /* synthetic */ DecoderReuseEvaluation f10245e;

    public /* synthetic */ C0957m(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i2) {
        this.f10242b = i2;
        this.f10243c = eventTime;
        this.f10244d = format;
        this.f10245e = decoderReuseEvaluation;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10242b) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f10243c;
                Format format = this.f10244d;
                DecoderReuseEvaluation decoderReuseEvaluation = this.f10245e;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6034K(eventTime, format);
                analyticsListener.mo6057d0(eventTime, format, decoderReuseEvaluation);
                analyticsListener.mo6056d(eventTime, 2, format);
                break;
            default:
                AnalyticsListener.EventTime eventTime2 = this.f10243c;
                Format format2 = this.f10244d;
                DecoderReuseEvaluation decoderReuseEvaluation2 = this.f10245e;
                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj;
                analyticsListener2.mo6032I(eventTime2, format2);
                analyticsListener2.mo6069j0(eventTime2, format2, decoderReuseEvaluation2);
                analyticsListener2.mo6056d(eventTime2, 1, format2);
                break;
        }
    }
}
