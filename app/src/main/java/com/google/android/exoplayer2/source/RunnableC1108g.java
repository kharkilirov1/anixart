package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.j80;
import com.yandex.mobile.ads.impl.rb0;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1108g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f13024b;

    /* renamed from: c */
    public final /* synthetic */ IOException f13025c;

    /* renamed from: d */
    public final /* synthetic */ boolean f13026d;

    /* renamed from: e */
    public final /* synthetic */ Object f13027e;

    /* renamed from: f */
    public final /* synthetic */ Object f13028f;

    /* renamed from: g */
    public final /* synthetic */ Object f13029g;

    /* renamed from: h */
    public final /* synthetic */ Object f13030h;

    public /* synthetic */ RunnableC1108g(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i2) {
        this.f13024b = i2;
        this.f13027e = obj;
        this.f13028f = obj2;
        this.f13029g = obj3;
        this.f13030h = obj4;
        this.f13025c = iOException;
        this.f13026d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13024b) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.f13027e;
                ((MediaSourceEventListener) this.f13028f).mo5892F(eventDispatcher.f12361a, eventDispatcher.f12362b, (LoadEventInfo) this.f13029g, (MediaLoadData) this.f13030h, this.f13025c, this.f13026d);
                break;
            default:
                ((cc0.C4914a) this.f13027e).m23198a((cc0) this.f13028f, (j80) this.f13029g, (rb0) this.f13030h, this.f13025c, this.f13026d);
                break;
        }
    }
}
