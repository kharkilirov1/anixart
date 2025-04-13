package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class RawResourceDataSource extends BaseDataSource {

    /* renamed from: e */
    public final Resources f14500e;

    /* renamed from: f */
    public final String f14501f;

    /* renamed from: g */
    @Nullable
    public Uri f14502g;

    /* renamed from: h */
    @Nullable
    public AssetFileDescriptor f14503h;

    /* renamed from: i */
    @Nullable
    public InputStream f14504i;

    /* renamed from: j */
    public long f14505j;

    /* renamed from: k */
    public boolean f14506k;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f14500e = context.getResources();
        this.f14501f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i2);
        return Uri.parse(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0162  */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6350a(com.google.android.exoplayer2.upstream.DataSpec r15) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.mo6350a(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws RawResourceDataSourceException {
        this.f14502g = null;
        try {
            try {
                InputStream inputStream = this.f14504i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f14504i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14503h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f14503h = null;
                        if (this.f14506k) {
                            this.f14506k = false;
                            m7428p();
                        }
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Throwable th) {
            this.f14504i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14503h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14503h = null;
                    if (this.f14506k) {
                        this.f14506k = false;
                        m7428p();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new RawResourceDataSourceException(null, e4, 2000);
                }
            } finally {
                this.f14503h = null;
                if (this.f14506k) {
                    this.f14506k = false;
                    m7428p();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14502g;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws RawResourceDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f14505j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        }
        InputStream inputStream = this.f14504i;
        int i4 = Util.f14736a;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.f14505j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j3 = this.f14505j;
        if (j3 != -1) {
            this.f14505j = j3 - read;
        }
        m7427o(read);
        return read;
    }
}
