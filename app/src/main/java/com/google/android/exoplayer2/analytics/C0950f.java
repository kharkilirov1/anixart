package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.C4932cn;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.rq0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0950f implements ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f10192b;

    /* renamed from: c */
    public final /* synthetic */ int f10193c;

    /* renamed from: d */
    public final /* synthetic */ Object f10194d;

    /* renamed from: e */
    public final /* synthetic */ Object f10195e;

    /* renamed from: f */
    public final /* synthetic */ Object f10196f;

    public /* synthetic */ C0950f(Object obj, int i2, Object obj2, Object obj3, int i3) {
        this.f10192b = i3;
        this.f10194d = obj;
        this.f10193c = i2;
        this.f10195e = obj2;
        this.f10196f = obj3;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10192b) {
            case 0:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f10194d;
                int i2 = this.f10193c;
                Player.PositionInfo positionInfo = (Player.PositionInfo) this.f10195e;
                Player.PositionInfo positionInfo2 = (Player.PositionInfo) this.f10196f;
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.mo6070k(eventTime, i2);
                analyticsListener.mo6047X(eventTime, positionInfo, positionInfo2, i2);
                break;
            default:
                C4932cn.m23350a((InterfaceC5624q8.a) this.f10194d, this.f10193c, (rq0.C5707c) this.f10195e, (rq0.C5707c) this.f10196f, (InterfaceC5624q8) obj);
                break;
        }
    }
}
