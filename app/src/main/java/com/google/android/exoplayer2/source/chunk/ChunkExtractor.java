package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;

/* loaded from: classes.dex */
public interface ChunkExtractor {

    public interface Factory {
    }

    public interface TrackOutputProvider {
        /* renamed from: b */
        TrackOutput mo6959b(int i2, int i3);
    }

    /* renamed from: a */
    boolean mo6960a(ExtractorInput extractorInput) throws IOException;

    @Nullable
    /* renamed from: c */
    Format[] mo6961c();

    /* renamed from: e */
    void mo6962e(@Nullable TrackOutputProvider trackOutputProvider, long j2, long j3);

    @Nullable
    /* renamed from: f */
    ChunkIndex mo6963f();

    void release();
}
