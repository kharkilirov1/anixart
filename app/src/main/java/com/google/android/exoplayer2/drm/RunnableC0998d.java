package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.drm.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0998d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10753b;

    /* renamed from: c */
    public final /* synthetic */ int f10754c;

    /* renamed from: d */
    public final /* synthetic */ Object f10755d;

    /* renamed from: e */
    public final /* synthetic */ Object f10756e;

    public /* synthetic */ RunnableC0998d(Object obj, Object obj2, int i2, int i3) {
        this.f10753b = i3;
        this.f10755d = obj;
        this.f10756e = obj2;
        this.f10754c = i2;
    }

    public /* synthetic */ RunnableC0998d(CopyOnWriteArraySet copyOnWriteArraySet, int i2, ListenerSet.Event event) {
        this.f10753b = 1;
        this.f10755d = copyOnWriteArraySet;
        this.f10754c = i2;
        this.f10756e = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10753b) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f10755d;
                DrmSessionEventListener drmSessionEventListener = (DrmSessionEventListener) this.f10756e;
                int i2 = this.f10754c;
                drmSessionEventListener.mo5901r(eventDispatcher.f10718a, eventDispatcher.f10719b);
                drmSessionEventListener.mo5890C(eventDispatcher.f10718a, eventDispatcher.f10719b, i2);
                break;
            case 1:
                ListenerSet.m7578a((CopyOnWriteArraySet) this.f10755d, this.f10754c, (ListenerSet.Event) this.f10756e);
                break;
            default:
                ((InterfaceC4719f.a) this.f10755d).m22167a((InterfaceC4719f) this.f10756e, this.f10754c);
                break;
        }
    }
}
