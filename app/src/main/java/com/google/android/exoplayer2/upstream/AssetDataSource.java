package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AssetDataSource extends BaseDataSource {

    /* renamed from: e */
    public final AssetManager f14326e;

    /* renamed from: f */
    @Nullable
    public Uri f14327f;

    /* renamed from: g */
    @Nullable
    public InputStream f14328g;

    /* renamed from: h */
    public long f14329h;

    /* renamed from: i */
    public boolean f14330i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(@Nullable Throwable th, int i2) {
            super(th, i2);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f14326e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f14362a;
            this.f14327f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m7429q(dataSpec);
            InputStream open = this.f14326e.open(path, 1);
            this.f14328g = open;
            if (open.skip(dataSpec.f14367f) < dataSpec.f14367f) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j2 = dataSpec.f14368g;
            if (j2 != -1) {
                this.f14329h = j2;
            } else {
                long available = this.f14328g.available();
                this.f14329h = available;
                if (available == ParserMinimalBase.MAX_INT_L) {
                    this.f14329h = -1L;
                }
            }
            this.f14330i = true;
            m7430r(dataSpec);
            return this.f14329h;
        } catch (AssetDataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new AssetDataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws AssetDataSourceException {
        this.f14327f = null;
        try {
            try {
                InputStream inputStream = this.f14328g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2, 2000);
            }
        } finally {
            this.f14328g = null;
            if (this.f14330i) {
                this.f14330i = false;
                m7428p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14327f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws AssetDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f14329h;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2, 2000);
            }
        }
        InputStream inputStream = this.f14328g;
        int i4 = Util.f14736a;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f14329h;
        if (j3 != -1) {
            this.f14329h = j3 - read;
        }
        m7427o(read);
        return read;
    }
}
