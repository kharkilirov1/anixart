package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class DataChunk extends Chunk {

    /* renamed from: j */
    public byte[] f12743j;

    /* renamed from: k */
    public volatile boolean f12744k;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i2, Format format, int i3, @Nullable Object obj, @Nullable byte[] bArr) {
        super(dataSource, dataSpec, i2, format, i3, obj, -9223372036854775807L, -9223372036854775807L);
        DataChunk dataChunk;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = Util.f14741f;
            dataChunk = this;
        } else {
            dataChunk = this;
            bArr2 = bArr;
        }
        dataChunk.f12743j = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public final void mo6865a() throws IOException {
        try {
            this.f12706i.mo6350a(this.f12699b);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.f12744k) {
                byte[] bArr = this.f12743j;
                if (bArr.length < i3 + 16384) {
                    this.f12743j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i2 = this.f12706i.read(this.f12743j, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.f12744k) {
                mo6985b(this.f12743j, i3);
            }
            if (r0 != null) {
                try {
                    this.f12706i.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            StatsDataSource statsDataSource = this.f12706i;
            if (statsDataSource != null) {
                try {
                    statsDataSource.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* renamed from: b */
    public abstract void mo6985b(byte[] bArr, int i2) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public final void mo6866c() {
        this.f12744k = true;
    }
}
