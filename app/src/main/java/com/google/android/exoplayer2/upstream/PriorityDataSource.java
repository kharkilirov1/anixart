package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PriorityDataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f14497a;

    /* renamed from: b */
    public final PriorityTaskManager f14498b;

    /* renamed from: c */
    public final int f14499c;

    public static final class Factory implements DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        this.f14498b.m7673a(this.f14499c);
        return this.f14497a.mo6350a(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14497a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f14497a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return this.f14497a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14497a.mo6352m();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        this.f14498b.m7673a(this.f14499c);
        return this.f14497a.read(bArr, i2, i3);
    }
}
