package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class InitializationChunk extends Chunk {

    /* renamed from: j */
    public final ChunkExtractor f12745j;

    /* renamed from: k */
    public ChunkExtractor.TrackOutputProvider f12746k;

    /* renamed from: l */
    public long f12747l;

    /* renamed from: m */
    public volatile boolean f12748m;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12745j = chunkExtractor;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public void mo6865a() throws IOException {
        if (this.f12747l == 0) {
            this.f12745j.mo6962e(this.f12746k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            DataSpec m7436d = this.f12699b.m7436d(this.f12747l);
            StatsDataSource statsDataSource = this.f12706i;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, m7436d.f14367f, statsDataSource.mo6350a(m7436d));
            while (!this.f12748m && this.f12745j.mo6960a(defaultExtractorInput)) {
                try {
                } finally {
                    this.f12747l = defaultExtractorInput.f10834d - this.f12699b.f14367f;
                }
            }
            if (r0 != null) {
                try {
                    this.f12706i.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            StatsDataSource statsDataSource2 = this.f12706i;
            if (statsDataSource2 != null) {
                try {
                    statsDataSource2.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public void mo6866c() {
        this.f12748m = true;
    }
}
