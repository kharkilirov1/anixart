package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.hf1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0978e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10564b;

    /* renamed from: c */
    public final /* synthetic */ String f10565c;

    /* renamed from: d */
    public final /* synthetic */ long f10566d;

    /* renamed from: e */
    public final /* synthetic */ long f10567e;

    /* renamed from: f */
    public final /* synthetic */ Object f10568f;

    public /* synthetic */ RunnableC0978e(Object obj, String str, long j2, long j3, int i2) {
        this.f10564b = i2;
        this.f10568f = obj;
        this.f10565c = str;
        this.f10566d = j2;
        this.f10567e = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10564b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f10568f;
                String str = this.f10565c;
                long j2 = this.f10566d;
                long j3 = this.f10567e;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.mo5963m(str, j2, j3);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) this.f10568f;
                String str2 = this.f10565c;
                long j4 = this.f10566d;
                long j5 = this.f10567e;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher2.f14899b;
                int i3 = Util.f14736a;
                videoRendererEventListener.mo5959e(str2, j4, j5);
                break;
            case 2:
                ((hf1.C5183a) this.f10568f).m25169b(this.f10565c, this.f10566d, this.f10567e);
                break;
            default:
                ((InterfaceC5790tb.a) this.f10568f).m28545b(this.f10565c, this.f10566d, this.f10567e);
                break;
        }
    }
}
