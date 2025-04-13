package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0918d implements SynchronizationGuard.CriticalSection, ListenerSet.Event {

    /* renamed from: b */
    public final /* synthetic */ int f9327b;

    /* renamed from: c */
    public final /* synthetic */ Object f9328c;

    /* renamed from: d */
    public final /* synthetic */ Object f9329d;

    public /* synthetic */ C0918d(Object obj, Object obj2, int i2) {
        this.f9328c = obj;
        this.f9329d = obj2;
        this.f9327b = i2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.f9328c;
        uploader.f9292d.mo5550a((TransportContext) this.f9329d, this.f9327b + 1);
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).mo6067i0((AnalyticsListener.EventTime) this.f9328c, (MediaItem) this.f9329d, this.f9327b);
    }
}
