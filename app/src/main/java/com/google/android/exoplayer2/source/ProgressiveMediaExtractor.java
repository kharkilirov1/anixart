package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
        /* renamed from: a */
        ProgressiveMediaExtractor mo6849a();
    }

    /* renamed from: a */
    void mo6782a(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j2, long j3, ExtractorOutput extractorOutput) throws IOException;

    /* renamed from: b */
    int mo6783b(PositionHolder positionHolder) throws IOException;

    /* renamed from: c */
    void mo6784c(long j2, long j3);

    /* renamed from: d */
    long mo6785d();

    /* renamed from: e */
    void mo6786e();

    void release();
}
