package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1107f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f13019b;

    /* renamed from: c */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f13020c;

    /* renamed from: d */
    public final /* synthetic */ MediaSourceEventListener f13021d;

    /* renamed from: e */
    public final /* synthetic */ LoadEventInfo f13022e;

    /* renamed from: f */
    public final /* synthetic */ MediaLoadData f13023f;

    public /* synthetic */ RunnableC1107f(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        this.f13019b = i2;
        this.f13020c = eventDispatcher;
        this.f13021d = mediaSourceEventListener;
        this.f13022e = loadEventInfo;
        this.f13023f = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13019b) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f13020c;
                this.f13021d.mo5889A(eventDispatcher.f12361a, eventDispatcher.f12362b, this.f13022e, this.f13023f);
                break;
            case 1:
                MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.f13020c;
                this.f13021d.mo5896g(eventDispatcher2.f12361a, eventDispatcher2.f12362b, this.f13022e, this.f13023f);
                break;
            default:
                MediaSourceEventListener.EventDispatcher eventDispatcher3 = this.f13020c;
                this.f13021d.mo5899j(eventDispatcher3.f12361a, eventDispatcher3.f12362b, this.f13022e, this.f13023f);
                break;
        }
    }
}
