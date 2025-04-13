package com.google.android.exoplayer2.audio;

import android.view.ViewGroup;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.hg1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0979f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10569b;

    /* renamed from: c */
    public final /* synthetic */ boolean f10570c;

    /* renamed from: d */
    public final /* synthetic */ Object f10571d;

    public /* synthetic */ RunnableC0979f(Object obj, boolean z, int i2) {
        this.f10569b = i2;
        this.f10571d = obj;
        this.f10570c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10569b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f10571d;
                boolean z = this.f10570c;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.onSkipSilenceEnabledChanged(z);
                break;
            case 1:
                hg1.m25197b((ViewGroup) this.f10571d, this.f10570c);
                break;
            default:
                ((InterfaceC5790tb.a) this.f10571d).m28541a(this.f10570c);
                break;
        }
    }
}
