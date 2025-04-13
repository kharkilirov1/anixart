package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface HlsExtractorFactory {

    /* renamed from: x1 */
    public static final HlsExtractorFactory f13076x1 = new DefaultHlsExtractorFactory();

    /* renamed from: a */
    HlsMediaChunkExtractor mo6096a(Uri uri, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput) throws IOException;
}
