package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.C4932cn;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.j80;
import com.yandex.mobile.ads.impl.rb0;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0953i implements ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f10204b;

    /* renamed from: c */
    public final /* synthetic */ IOException f10205c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10206d;

    /* renamed from: e */
    public final /* synthetic */ Object f10207e;

    /* renamed from: f */
    public final /* synthetic */ Object f10208f;

    /* renamed from: g */
    public final /* synthetic */ Object f10209g;

    public /* synthetic */ C0953i(Object obj, Object obj2, Object obj3, IOException iOException, boolean z, int i2) {
        this.f10204b = i2;
        this.f10207e = obj;
        this.f10208f = obj2;
        this.f10209g = obj3;
        this.f10205c = iOException;
        this.f10206d = z;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10204b) {
            case 0:
                ((AnalyticsListener) obj).mo6088v((AnalyticsListener.EventTime) this.f10207e, (LoadEventInfo) this.f10208f, (MediaLoadData) this.f10209g, this.f10205c, this.f10206d);
                break;
            default:
                C4932cn.m23356a((InterfaceC5624q8.a) this.f10207e, (j80) this.f10208f, (rb0) this.f10209g, this.f10205c, this.f10206d, (InterfaceC5624q8) obj);
                break;
        }
    }
}
