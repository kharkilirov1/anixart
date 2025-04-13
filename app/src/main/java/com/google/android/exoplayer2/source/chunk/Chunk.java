package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Chunk implements Loader.Loadable {

    /* renamed from: a */
    public final long f12698a;

    /* renamed from: b */
    public final DataSpec f12699b;

    /* renamed from: c */
    public final int f12700c;

    /* renamed from: d */
    public final Format f12701d;

    /* renamed from: e */
    public final int f12702e;

    /* renamed from: f */
    @Nullable
    public final Object f12703f;

    /* renamed from: g */
    public final long f12704g;

    /* renamed from: h */
    public final long f12705h;

    /* renamed from: i */
    public final StatsDataSource f12706i;

    public Chunk(DataSource dataSource, DataSpec dataSpec, int i2, Format format, int i3, @Nullable Object obj, long j2, long j3) {
        this.f12706i = new StatsDataSource(dataSource);
        Objects.requireNonNull(dataSpec);
        this.f12699b = dataSpec;
        this.f12700c = i2;
        this.f12701d = format;
        this.f12702e = i3;
        this.f12703f = obj;
        this.f12704g = j2;
        this.f12705h = j3;
        this.f12698a = LoadEventInfo.m6820a();
    }
}
