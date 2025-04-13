package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0949e implements ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f10189b;

    /* renamed from: c */
    public final /* synthetic */ float f10190c;

    /* renamed from: d */
    public final /* synthetic */ Object f10191d;

    public /* synthetic */ C0949e(Object obj, float f2, int i2) {
        this.f10189b = i2;
        this.f10191d = obj;
        this.f10190c = f2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10189b) {
            case 0:
                ((AnalyticsListener) obj).mo6035L((AnalyticsListener.EventTime) this.f10191d, this.f10190c);
                break;
            default:
                float f2 = this.f10190c;
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
        }
    }
}
