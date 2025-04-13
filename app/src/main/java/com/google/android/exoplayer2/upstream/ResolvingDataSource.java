package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ResolvingDataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f14507a;

    /* renamed from: b */
    public final Resolver f14508b;

    /* renamed from: c */
    public boolean f14509c;

    public static final class Factory implements DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            throw null;
        }
    }

    public interface Resolver {
        /* renamed from: a */
        DataSpec m7479a(DataSpec dataSpec) throws IOException;

        /* renamed from: b */
        Uri m7480b(Uri uri);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        DataSpec m7479a = this.f14508b.m7479a(dataSpec);
        this.f14509c = true;
        return this.f14507a.mo6350a(m7479a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14507a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        if (this.f14509c) {
            this.f14509c = false;
            this.f14507a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return this.f14507a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        Uri mo6352m = this.f14507a.mo6352m();
        if (mo6352m == null) {
            return null;
        }
        return this.f14508b.m7480b(mo6352m);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f14507a.read(bArr, i2, i3);
    }
}
