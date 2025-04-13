package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* loaded from: classes.dex */
interface OggSeeker {
    /* renamed from: a */
    long mo6534a(ExtractorInput extractorInput) throws IOException;

    @Nullable
    /* renamed from: b */
    SeekMap mo6535b();

    /* renamed from: c */
    void mo6536c(long j2);
}
