package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface Extractor {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    /* renamed from: b */
    void mo6401b(ExtractorOutput extractorOutput);

    /* renamed from: c */
    void mo6402c(long j2, long j3);

    /* renamed from: e */
    boolean mo6403e(ExtractorInput extractorInput) throws IOException;

    /* renamed from: g */
    int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException;

    void release();
}
