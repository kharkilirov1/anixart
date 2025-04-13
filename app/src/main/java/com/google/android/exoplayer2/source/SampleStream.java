package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface SampleStream {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    /* renamed from: a */
    void mo6791a() throws IOException;

    /* renamed from: b */
    boolean mo6792b();

    /* renamed from: d */
    int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2);

    /* renamed from: h */
    int mo6794h(long j2);
}
