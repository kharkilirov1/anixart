package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes.dex */
public class ContainerMediaChunk extends BaseMediaChunk {

    /* renamed from: o */
    public final int f12737o;

    /* renamed from: p */
    public final long f12738p;

    /* renamed from: q */
    public final ChunkExtractor f12739q;

    /* renamed from: r */
    public long f12740r;

    /* renamed from: s */
    public volatile boolean f12741s;

    /* renamed from: t */
    public boolean f12742t;

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6, int i3, long j7, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i2, obj, j2, j3, j4, j5, j6);
        this.f12737o = i3;
        this.f12738p = j7;
        this.f12739q = chunkExtractor;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public final void mo6865a() throws IOException {
        if (this.f12740r == 0) {
            BaseMediaChunkOutput baseMediaChunkOutput = this.f12673m;
            Assertions.m7518f(baseMediaChunkOutput);
            baseMediaChunkOutput.m6958a(this.f12738p);
            ChunkExtractor chunkExtractor = this.f12739q;
            long j2 = this.f12671k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f12738p;
            long j4 = this.f12672l;
            chunkExtractor.mo6962e(baseMediaChunkOutput, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.f12738p);
        }
        try {
            DataSpec m7436d = this.f12699b.m7436d(this.f12740r);
            StatsDataSource statsDataSource = this.f12706i;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, m7436d.f14367f, statsDataSource.mo6350a(m7436d));
            do {
                try {
                    if (this.f12741s) {
                        break;
                    }
                } finally {
                    this.f12740r = defaultExtractorInput.f10834d - this.f12699b.f14367f;
                }
            } while (this.f12739q.mo6960a(defaultExtractorInput));
            if (r0 != null) {
                try {
                    this.f12706i.f14520a.close();
                } catch (IOException unused) {
                }
            }
            this.f12742t = !this.f12741s;
        } finally {
            StatsDataSource statsDataSource2 = this.f12706i;
            if (statsDataSource2 != null) {
                try {
                    statsDataSource2.f14520a.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    /* renamed from: b */
    public long mo6983b() {
        return this.f12749j + this.f12737o;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public final void mo6866c() {
        this.f12741s = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    /* renamed from: d */
    public boolean mo6984d() {
        return this.f12742t;
    }
}
