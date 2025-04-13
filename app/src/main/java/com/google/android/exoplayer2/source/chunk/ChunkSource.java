package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public interface ChunkSource {
    /* renamed from: a */
    void mo6976a() throws IOException;

    /* renamed from: b */
    boolean mo6977b(long j2, Chunk chunk, List<? extends MediaChunk> list);

    /* renamed from: c */
    long mo6978c(long j2, SeekParameters seekParameters);

    /* renamed from: e */
    int mo6979e(long j2, List<? extends MediaChunk> list);

    /* renamed from: g */
    void mo6980g(Chunk chunk);

    /* renamed from: h */
    boolean mo6981h(Chunk chunk, boolean z, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    /* renamed from: i */
    void mo6982i(long j2, long j3, List<? extends MediaChunk> list, ChunkHolder chunkHolder);

    void release();
}
