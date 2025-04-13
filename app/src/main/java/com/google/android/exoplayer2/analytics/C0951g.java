package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0951g implements ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f10197b;

    /* renamed from: c */
    public final /* synthetic */ int f10198c;

    /* renamed from: d */
    public final /* synthetic */ int f10199d;

    /* renamed from: e */
    public final /* synthetic */ Object f10200e;

    public /* synthetic */ C0951g(Object obj, int i2, int i3, int i4) {
        this.f10197b = i4;
        this.f10200e = obj;
        this.f10198c = i2;
        this.f10199d = i3;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f10197b) {
            case 0:
                ((AnalyticsListener) obj).mo6039P((AnalyticsListener.EventTime) this.f10200e, this.f10198c, this.f10199d);
                break;
            default:
                int i2 = this.f10198c;
                int i3 = this.f10199d;
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
        }
    }
}
