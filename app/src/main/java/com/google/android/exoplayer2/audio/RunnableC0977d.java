package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.impl.C5989wt;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import kotlin.jvm.functions.Function0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0977d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10561b;

    /* renamed from: c */
    public final /* synthetic */ long f10562c;

    /* renamed from: d */
    public final /* synthetic */ Object f10563d;

    public /* synthetic */ RunnableC0977d(long j2, Function0 function0) {
        this.f10561b = 2;
        this.f10562c = j2;
        this.f10563d = function0;
    }

    public /* synthetic */ RunnableC0977d(Object obj, long j2, int i2) {
        this.f10561b = i2;
        this.f10563d = obj;
        this.f10562c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10561b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f10563d;
                long j2 = this.f10562c;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.mo5972v(j2);
                break;
            case 1:
                ((InterfaceC5790tb.a) this.f10563d).m28539a(this.f10562c);
                break;
            default:
                C5989wt.m29563a(this.f10562c, (Function0) this.f10563d);
                break;
        }
    }
}
