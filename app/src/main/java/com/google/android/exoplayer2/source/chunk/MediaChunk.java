package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class MediaChunk extends Chunk {

    /* renamed from: j */
    public final long f12749j;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, long j2, long j3, long j4) {
        super(dataSource, dataSpec, 1, format, i2, obj, j2, j3);
        Objects.requireNonNull(format);
        this.f12749j = j4;
    }

    /* renamed from: b */
    public long mo6983b() {
        long j2 = this.f12749j;
        if (j2 != -1) {
            return 1 + j2;
        }
        return -1L;
    }

    /* renamed from: d */
    public abstract boolean mo6984d();
}
