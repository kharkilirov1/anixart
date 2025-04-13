package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface EbmlProcessor {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    /* renamed from: a */
    void mo6458a(int i2) throws ParserException;

    /* renamed from: b */
    int mo6459b(int i2);

    /* renamed from: c */
    boolean mo6460c(int i2);

    /* renamed from: d */
    void mo6461d(int i2, int i3, ExtractorInput extractorInput) throws IOException;

    /* renamed from: e */
    void mo6462e(int i2, String str) throws ParserException;

    /* renamed from: f */
    void mo6463f(int i2, double d) throws ParserException;

    /* renamed from: g */
    void mo6464g(int i2, long j2, long j3) throws ParserException;

    /* renamed from: h */
    void mo6465h(int i2, long j2) throws ParserException;
}
