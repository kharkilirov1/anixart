package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.qm */
/* loaded from: classes3.dex */
public final class C5647qm {

    /* renamed from: a */
    public int f54076a;

    /* renamed from: b */
    public int f54077b;

    /* renamed from: c */
    public int f54078c;

    /* renamed from: d */
    public int f54079d;

    /* renamed from: e */
    public int f54080e;

    /* renamed from: f */
    public int f54081f;

    /* renamed from: g */
    public int f54082g;

    /* renamed from: h */
    public int f54083h;

    /* renamed from: i */
    public int f54084i;

    /* renamed from: j */
    public int f54085j;

    /* renamed from: k */
    public long f54086k;

    /* renamed from: l */
    public int f54087l;

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f54076a), Integer.valueOf(this.f54077b), Integer.valueOf(this.f54078c), Integer.valueOf(this.f54079d), Integer.valueOf(this.f54080e), Integer.valueOf(this.f54081f), Integer.valueOf(this.f54082g), Integer.valueOf(this.f54083h), Integer.valueOf(this.f54084i), Integer.valueOf(this.f54085j), Long.valueOf(this.f54086k), Integer.valueOf(this.f54087l)};
        int i2 = s91.f54530a;
        return String.format(Locale.US, "DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", objArr);
    }
}
