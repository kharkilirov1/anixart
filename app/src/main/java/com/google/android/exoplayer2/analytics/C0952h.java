package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0952h implements ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f10201b;

    /* renamed from: c */
    public final /* synthetic */ long f10202c;

    /* renamed from: d */
    public final /* synthetic */ Object f10203d;

    public /* synthetic */ C0952h(Object obj, long j2, int i2) {
        this.f10201b = i2;
        this.f10203d = obj;
        this.f10202c = j2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10201b) {
            case 0:
                ((AnalyticsListener) obj).mo6038O((AnalyticsListener.EventTime) this.f10203d, this.f10202c);
                break;
            default:
                long j2 = this.f10202c;
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
        }
    }
}
