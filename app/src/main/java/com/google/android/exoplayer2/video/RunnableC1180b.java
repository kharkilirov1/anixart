package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.video.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1180b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f14908b = 1;

    /* renamed from: c */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14909c;

    /* renamed from: d */
    public final /* synthetic */ int f14910d;

    /* renamed from: e */
    public final /* synthetic */ long f14911e;

    public /* synthetic */ RunnableC1180b(VideoRendererEventListener.EventDispatcher eventDispatcher, int i2, long j2) {
        this.f14909c = eventDispatcher;
        this.f14910d = i2;
        this.f14911e = j2;
    }

    public /* synthetic */ RunnableC1180b(VideoRendererEventListener.EventDispatcher eventDispatcher, long j2, int i2) {
        this.f14909c = eventDispatcher;
        this.f14911e = j2;
        this.f14910d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14908b) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14909c;
                long j2 = this.f14911e;
                int i2 = this.f14910d;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.f14899b;
                int i3 = Util.f14736a;
                videoRendererEventListener.mo5954G(j2, i2);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.f14909c;
                int i4 = this.f14910d;
                long j3 = this.f14911e;
                VideoRendererEventListener videoRendererEventListener2 = eventDispatcher2.f14899b;
                int i5 = Util.f14736a;
                videoRendererEventListener2.mo5964n(i4, j3);
                break;
        }
    }
}
