package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AesCipherDataSource implements DataSource {
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        throw null;
    }
}
