package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0976c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10557b;

    /* renamed from: c */
    public final /* synthetic */ Object f10558c;

    /* renamed from: d */
    public final /* synthetic */ Object f10559d;

    /* renamed from: e */
    public final /* synthetic */ Object f10560e;

    public /* synthetic */ RunnableC0976c(Object obj, Object obj2, Object obj3, int i2) {
        this.f10557b = i2;
        this.f10558c = obj;
        this.f10559d = obj2;
        this.f10560e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10557b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f10558c;
                Format format = (Format) this.f10559d;
                DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) this.f10560e;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.mo5974y(format);
                eventDispatcher.f10306b.mo5965o(format, decoderReuseEvaluation);
                break;
            case 1:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) this.f10558c;
                ((DrmSessionEventListener) this.f10559d).mo5898i(eventDispatcher2.f10718a, eventDispatcher2.f10719b, (Exception) this.f10560e);
                break;
            case 2:
                MediaSourceEventListener.EventDispatcher eventDispatcher3 = (MediaSourceEventListener.EventDispatcher) this.f10558c;
                ((MediaSourceEventListener) this.f10559d).mo5895f(eventDispatcher3.f12361a, eventDispatcher3.f12362b, (MediaLoadData) this.f10560e);
                break;
            case 3:
                VideoRendererEventListener.EventDispatcher eventDispatcher4 = (VideoRendererEventListener.EventDispatcher) this.f10558c;
                Format format2 = (Format) this.f10559d;
                DecoderReuseEvaluation decoderReuseEvaluation2 = (DecoderReuseEvaluation) this.f10560e;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher4.f14899b;
                int i3 = Util.f14736a;
                videoRendererEventListener.mo5969s(format2);
                eventDispatcher4.f14899b.mo5971u(format2, decoderReuseEvaluation2);
                break;
            default:
                ((InterfaceC4719f.a) this.f10558c).m22168a((InterfaceC4719f) this.f10559d, (Exception) this.f10560e);
                break;
        }
    }
}
