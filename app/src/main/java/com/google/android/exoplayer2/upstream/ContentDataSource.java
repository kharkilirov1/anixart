package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class ContentDataSource extends BaseDataSource {

    /* renamed from: e */
    public final ContentResolver f14344e;

    /* renamed from: f */
    @Nullable
    public Uri f14345f;

    /* renamed from: g */
    @Nullable
    public AssetFileDescriptor f14346g;

    /* renamed from: h */
    @Nullable
    public FileInputStream f14347h;

    /* renamed from: i */
    public long f14348i;

    /* renamed from: j */
    public boolean f14349j;

    @RequiresApi
    public static final class Api31 {
        @DoNotInline
        /* renamed from: a */
        public static void m7432a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(@Nullable IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f14344e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws ContentDataSourceException {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = dataSpec.f14362a;
            this.f14345f = uri;
            m7429q(dataSpec);
            if ("content".equals(dataSpec.f14362a.getScheme())) {
                Bundle bundle = new Bundle();
                if (Util.f14736a >= 31) {
                    Api31.m7432a(bundle);
                }
                openAssetFileDescriptor = this.f14344e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f14344e.openAssetFileDescriptor(uri, "r");
            }
            this.f14346g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new ContentDataSourceException(new IOException(sb.toString()), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f14347h = fileInputStream;
            if (length != -1 && dataSpec.f14367f > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.f14367f + startOffset) - startOffset;
            if (skip != dataSpec.f14367f) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f14348i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f14348i = position;
                    if (position < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j2 = length - skip;
                this.f14348i = j2;
                if (j2 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j3 = dataSpec.f14368g;
            if (j3 != -1) {
                long j4 = this.f14348i;
                if (j4 != -1) {
                    j3 = Math.min(j4, j3);
                }
                this.f14348i = j3;
            }
            this.f14349j = true;
            m7430r(dataSpec);
            long j5 = dataSpec.f14368g;
            return j5 != -1 ? j5 : this.f14348i;
        } catch (ContentDataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws ContentDataSourceException {
        this.f14345f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14347h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14347h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14346g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f14346g = null;
                        if (this.f14349j) {
                            this.f14349j = false;
                            m7428p();
                        }
                    }
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2, 2000);
                }
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3, 2000);
            }
        } catch (Throwable th) {
            this.f14347h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14346g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14346g = null;
                    if (this.f14349j) {
                        this.f14349j = false;
                        m7428p();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new ContentDataSourceException(e4, 2000);
                }
            } finally {
                this.f14346g = null;
                if (this.f14349j) {
                    this.f14349j = false;
                    m7428p();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14345f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws ContentDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f14348i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f14347h;
        int i4 = Util.f14736a;
        int read = fileInputStream.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f14348i;
        if (j3 != -1) {
            this.f14348i = j3 - read;
        }
        m7427o(read);
        return read;
    }
}
