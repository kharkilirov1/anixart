package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ByteArrayDataSource extends BaseDataSource {

    /* renamed from: e */
    @Nullable
    public Uri f14340e;

    /* renamed from: f */
    public int f14341f;

    /* renamed from: g */
    public int f14342g;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        this.f14340e = dataSpec.f14362a;
        m7429q(dataSpec);
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14340e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14340e;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f14342g;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(null, this.f14341f, bArr, i2, min);
        this.f14341f += min;
        this.f14342g -= min;
        m7427o(min);
        return min;
    }
}
