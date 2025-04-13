package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.yandex.mobile.ads.impl.hf1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.video.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1181c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f14912b;

    /* renamed from: c */
    public final /* synthetic */ Object f14913c;

    /* renamed from: d */
    public final /* synthetic */ long f14914d;

    /* renamed from: e */
    public final /* synthetic */ Object f14915e;

    public /* synthetic */ RunnableC1181c(Object obj, Object obj2, long j2, int i2) {
        this.f14912b = i2;
        this.f14915e = obj;
        this.f14913c = obj2;
        this.f14914d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14912b) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = (VideoRendererEventListener.EventDispatcher) this.f14915e;
                Object obj = this.f14913c;
                long j2 = this.f14914d;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.f14899b;
                int i2 = Util.f14736a;
                videoRendererEventListener.mo5967q(obj, j2);
                break;
            default:
                ((hf1.C5183a) this.f14915e).m25164a(this.f14913c, this.f14914d);
                break;
        }
    }
}
