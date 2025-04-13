package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StatsDataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f14520a;

    /* renamed from: b */
    public long f14521b;

    /* renamed from: c */
    public Uri f14522c;

    /* renamed from: d */
    public Map<String, List<String>> f14523d;

    public StatsDataSource(DataSource dataSource) {
        Objects.requireNonNull(dataSource);
        this.f14520a = dataSource;
        this.f14522c = Uri.EMPTY;
        this.f14523d = Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        this.f14522c = dataSpec.f14362a;
        this.f14523d = Collections.emptyMap();
        long mo6350a = this.f14520a.mo6350a(dataSpec);
        Uri mo6352m = mo6352m();
        Objects.requireNonNull(mo6352m);
        this.f14522c = mo6352m;
        this.f14523d = mo6351i();
        return mo6350a;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14520a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f14520a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return this.f14520a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14520a.mo6352m();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = this.f14520a.read(bArr, i2, i3);
        if (read != -1) {
            this.f14521b += read;
        }
        return read;
    }
}
