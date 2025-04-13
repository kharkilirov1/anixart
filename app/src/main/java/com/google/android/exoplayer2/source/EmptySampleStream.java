package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: classes.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: a */
    public void mo6791a() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: b */
    public boolean mo6792b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: d */
    public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        decoderInputBuffer.f10580b = 4;
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    /* renamed from: h */
    public int mo6794h(long j2) {
        return 0;
    }
}
