package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes.dex */
public abstract class BaseMediaChunk extends MediaChunk {

    /* renamed from: k */
    public final long f12671k;

    /* renamed from: l */
    public final long f12672l;

    /* renamed from: m */
    public BaseMediaChunkOutput f12673m;

    /* renamed from: n */
    public int[] f12674n;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(dataSource, dataSpec, format, i2, obj, j2, j3, j6);
        this.f12671k = j4;
        this.f12672l = j5;
    }

    /* renamed from: e */
    public final int m6956e(int i2) {
        int[] iArr = this.f12674n;
        Assertions.m7518f(iArr);
        return iArr[i2];
    }
}
