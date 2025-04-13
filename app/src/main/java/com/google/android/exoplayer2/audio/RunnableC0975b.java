package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0975b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10554b;

    /* renamed from: c */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f10555c;

    /* renamed from: d */
    public final /* synthetic */ Exception f10556d;

    public /* synthetic */ RunnableC0975b(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i2) {
        this.f10554b = i2;
        this.f10555c = eventDispatcher;
        this.f10556d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10554b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10555c;
                Exception exc = this.f10556d;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.mo5973x(exc);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.f10555c;
                Exception exc2 = this.f10556d;
                AudioRendererEventListener audioRendererEventListener2 = eventDispatcher2.f10306b;
                int i3 = Util.f14736a;
                audioRendererEventListener2.mo5956b(exc2);
                break;
        }
    }
}
