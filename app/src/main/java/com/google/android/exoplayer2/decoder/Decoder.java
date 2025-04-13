package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: classes.dex */
public interface Decoder<I, O, E extends DecoderException> {
    @Nullable
    /* renamed from: b */
    O mo6245b() throws DecoderException;

    @Nullable
    /* renamed from: c */
    I mo6246c() throws DecoderException;

    /* renamed from: d */
    void mo6247d(I i2) throws DecoderException;

    void flush();

    String getName();

    void release();
}
