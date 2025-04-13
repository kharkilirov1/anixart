package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.f80;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0920f implements SynchronizationGuard.CriticalSection, ListenerSet.Event, f80.InterfaceC5063a {

    /* renamed from: b */
    public final /* synthetic */ int f9333b;

    /* renamed from: c */
    public final /* synthetic */ long f9334c;

    /* renamed from: d */
    public final /* synthetic */ Object f9335d;

    /* renamed from: e */
    public final /* synthetic */ Object f9336e;

    public /* synthetic */ C0920f(Object obj, Object obj2, long j2, int i2) {
        this.f9333b = i2;
        this.f9335d = obj;
        this.f9336e = obj2;
        this.f9334c = j2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.f9335d;
        uploader.f9291c.mo5583U((TransportContext) this.f9336e, uploader.f9295g.mo5600a() + this.f9334c);
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f9333b) {
            case 1:
                ((AnalyticsListener) obj).mo6073l0((AnalyticsListener.EventTime) this.f9335d, this.f9336e, this.f9334c);
                break;
            default:
                Object obj2 = this.f9336e;
                long j2 = this.f9334c;
                Objects.requireNonNull((InterfaceC5624q8) obj);
                break;
        }
    }
}
