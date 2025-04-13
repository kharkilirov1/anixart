package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.video.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1179a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f14905b;

    /* renamed from: c */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f14906c;

    /* renamed from: d */
    public final /* synthetic */ DecoderCounters f14907d;

    public /* synthetic */ RunnableC1179a(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.f14905b = i2;
        this.f14906c = eventDispatcher;
        this.f14907d = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14905b) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14906c;
                DecoderCounters decoderCounters = this.f14907d;
                Objects.requireNonNull(eventDispatcher);
                synchronized (decoderCounters) {
                }
                VideoRendererEventListener videoRendererEventListener = eventDispatcher.f14899b;
                int i2 = Util.f14736a;
                videoRendererEventListener.mo5952B(decoderCounters);
                break;
            default:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.f14906c;
                DecoderCounters decoderCounters2 = this.f14907d;
                VideoRendererEventListener videoRendererEventListener2 = eventDispatcher2.f14899b;
                int i3 = Util.f14736a;
                videoRendererEventListener2.mo5970t(decoderCounters2);
                break;
        }
    }
}
