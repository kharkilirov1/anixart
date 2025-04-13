package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes.dex */
public final class SingleSampleMediaChunk extends BaseMediaChunk {

    /* renamed from: o */
    public final int f12761o;

    /* renamed from: p */
    public final Format f12762p;

    /* renamed from: q */
    public long f12763q;

    /* renamed from: r */
    public boolean f12764r;

    public SingleSampleMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, long j2, long j3, long j4, int i3, Format format2) {
        super(dataSource, dataSpec, format, i2, obj, j2, j3, -9223372036854775807L, -9223372036854775807L, j4);
        this.f12761o = i3;
        this.f12762p = format2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public void mo6865a() throws IOException {
        BaseMediaChunkOutput baseMediaChunkOutput = this.f12673m;
        Assertions.m7518f(baseMediaChunkOutput);
        baseMediaChunkOutput.m6958a(0L);
        TrackOutput mo6959b = baseMediaChunkOutput.mo6959b(0, this.f12761o);
        mo6959b.mo6399e(this.f12762p);
        try {
            long mo6350a = this.f12706i.mo6350a(this.f12699b.m7436d(this.f12763q));
            if (mo6350a != -1) {
                mo6350a += this.f12763q;
            }
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.f12706i, this.f12763q, mo6350a);
            for (int i2 = 0; i2 != -1; i2 = mo6959b.mo6396b(defaultExtractorInput, Integer.MAX_VALUE, true)) {
                this.f12763q += i2;
            }
            mo6959b.mo6398d(this.f12704g, 1, (int) this.f12763q, 0, null);
            if (r0 != null) {
                try {
                    this.f12706i.f14520a.close();
                } catch (IOException unused) {
                }
            }
            this.f12764r = true;
        } finally {
            StatsDataSource statsDataSource = this.f12706i;
            if (statsDataSource != null) {
                try {
                    statsDataSource.f14520a.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public void mo6866c() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    /* renamed from: d */
    public boolean mo6984d() {
        return this.f12764r;
    }
}
