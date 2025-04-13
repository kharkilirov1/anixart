package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;

/* loaded from: classes.dex */
public final class DashUtil {
    /* renamed from: a */
    public static DataSpec m7024a(Representation representation, String str, RangedUri rangedUri, int i2) {
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f14372a = UriUtil.m7701d(str, rangedUri.f12972c);
        builder.f14377f = rangedUri.f12970a;
        builder.f14378g = rangedUri.f12971b;
        String mo7069k = representation.mo7069k();
        if (mo7069k == null) {
            mo7069k = UriUtil.m7701d(representation.f12975b.get(0).f12923a, rangedUri.f12972c).toString();
        }
        builder.f14379h = mo7069k;
        builder.f14380i = i2;
        return builder.m7438a();
    }

    /* renamed from: b */
    public static void m7025b(DataSource dataSource, Representation representation, int i2, ChunkExtractor chunkExtractor, RangedUri rangedUri) throws IOException {
        new InitializationChunk(dataSource, m7024a(representation, representation.f12975b.get(i2).f12923a, rangedUri, 0), representation.f12974a, 0, null, chunkExtractor).mo6865a();
    }
}
