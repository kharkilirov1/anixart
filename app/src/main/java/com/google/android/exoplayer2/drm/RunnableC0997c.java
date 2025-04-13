package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.drm.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0997c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10750b;

    /* renamed from: c */
    public final /* synthetic */ Object f10751c;

    /* renamed from: d */
    public final /* synthetic */ Object f10752d;

    public /* synthetic */ RunnableC0997c(Object obj, Object obj2, int i2) {
        this.f10750b = i2;
        this.f10751c = obj;
        this.f10752d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10750b) {
            case 0:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f10751c;
                ((DrmSessionEventListener) this.f10752d).mo5891D(eventDispatcher.f10718a, eventDispatcher.f10719b);
                break;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) this.f10751c;
                ((DrmSessionEventListener) this.f10752d).mo5900p(eventDispatcher2.f10718a, eventDispatcher2.f10719b);
                break;
            case 2:
                DrmSessionEventListener.EventDispatcher eventDispatcher3 = (DrmSessionEventListener.EventDispatcher) this.f10751c;
                ((DrmSessionEventListener) this.f10752d).mo5893H(eventDispatcher3.f10718a, eventDispatcher3.f10719b);
                break;
            case 3:
                DrmSessionEventListener.EventDispatcher eventDispatcher4 = (DrmSessionEventListener.EventDispatcher) this.f10751c;
                ((DrmSessionEventListener) this.f10752d).mo5902w(eventDispatcher4.f10718a, eventDispatcher4.f10719b);
                break;
            default:
                DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = (DefaultDrmSessionManager.PreacquiredSessionReference) this.f10751c;
                Format format = (Format) this.f10752d;
                DefaultDrmSessionManager defaultDrmSessionManager = preacquiredSessionReference.f10699e;
                if (defaultDrmSessionManager.f10677p != 0 && !preacquiredSessionReference.f10698d) {
                    Looper looper = defaultDrmSessionManager.f10681t;
                    Objects.requireNonNull(looper);
                    preacquiredSessionReference.f10697c = defaultDrmSessionManager.m6288d(looper, preacquiredSessionReference.f10696b, format, false);
                    preacquiredSessionReference.f10699e.f10675n.add(preacquiredSessionReference);
                    break;
                }
                break;
        }
    }
}
