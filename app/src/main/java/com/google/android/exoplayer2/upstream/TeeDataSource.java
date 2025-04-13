package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TeeDataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f14524a;

    /* renamed from: b */
    public final DataSink f14525b;

    /* renamed from: c */
    public boolean f14526c;

    /* renamed from: d */
    public long f14527d;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        long mo6350a = this.f14524a.mo6350a(dataSpec);
        this.f14527d = mo6350a;
        if (mo6350a == 0) {
            return 0L;
        }
        if (dataSpec.f14368g == -1 && mo6350a != -1) {
            dataSpec = dataSpec.m7437e(0L, mo6350a);
        }
        this.f14526c = true;
        this.f14525b.mo7431a(dataSpec);
        return this.f14527d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14524a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        try {
            this.f14524a.close();
        } finally {
            if (this.f14526c) {
                this.f14526c = false;
                this.f14525b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return this.f14524a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14524a.mo6352m();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f14527d == 0) {
            return -1;
        }
        int read = this.f14524a.read(bArr, i2, i3);
        if (read > 0) {
            this.f14525b.write(bArr, i2, read);
            long j2 = this.f14527d;
            if (j2 != -1) {
                this.f14527d = j2 - read;
            }
        }
        return read;
    }
}
