package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.audio.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0974a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10551b;

    /* renamed from: c */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f10552c;

    /* renamed from: d */
    public final /* synthetic */ DecoderCounters f10553d;

    public /* synthetic */ RunnableC0974a(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i2) {
        this.f10551b = i2;
        this.f10552c = eventDispatcher;
        this.f10553d = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10551b) {
            case 0:
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10552c;
                DecoderCounters decoderCounters = this.f10553d;
                Objects.requireNonNull(eventDispatcher);
                synchronized (decoderCounters) {
                }
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i2 = Util.f14736a;
                audioRendererEventListener.mo5957c(decoderCounters);
                break;
            default:
                AudioRendererEventListener.EventDispatcher eventDispatcher2 = this.f10552c;
                DecoderCounters decoderCounters2 = this.f10553d;
                AudioRendererEventListener audioRendererEventListener2 = eventDispatcher2.f10306b;
                int i3 = Util.f14736a;
                audioRendererEventListener2.mo5958d(decoderCounters2);
                break;
        }
    }
}
