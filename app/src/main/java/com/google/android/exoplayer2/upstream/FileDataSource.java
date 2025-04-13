package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public final class FileDataSource extends BaseDataSource {

    /* renamed from: e */
    @Nullable
    public RandomAccessFile f14453e;

    /* renamed from: f */
    @Nullable
    public Uri f14454f;

    /* renamed from: g */
    public long f14455g;

    /* renamed from: h */
    public boolean f14456h;

    @RequiresApi
    public static final class Api21 {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static boolean m7462b(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class Factory implements DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            return new FileDataSource();
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i2) {
            super(th, i2);
        }

        public FileDataSourceException(@Nullable String str, @Nullable Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.f14362a;
        this.f14454f = uri;
        m7429q(dataSpec);
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14453e = randomAccessFile;
            try {
                randomAccessFile.seek(dataSpec.f14367f);
                long j2 = dataSpec.f14368g;
                if (j2 == -1) {
                    j2 = this.f14453e.length() - dataSpec.f14367f;
                }
                this.f14455g = j2;
                if (j2 < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.f14456h = true;
                m7430r(dataSpec);
                return this.f14455g;
            } catch (IOException e2) {
                throw new FileDataSourceException(e2, 2000);
            }
        } catch (FileNotFoundException e3) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e3, (Util.f14736a < 21 || !Api21.m7462b(e3.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e3, 1004);
        } catch (SecurityException e4) {
            throw new FileDataSourceException(e4, 2006);
        } catch (RuntimeException e5) {
            throw new FileDataSourceException(e5, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws FileDataSourceException {
        this.f14454f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14453e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new FileDataSourceException(e2, 2000);
            }
        } finally {
            this.f14453e = null;
            if (this.f14456h) {
                this.f14456h = false;
                m7428p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14454f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws FileDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f14455g;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14453e;
            int i4 = Util.f14736a;
            int read = randomAccessFile.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.f14455g -= read;
                m7427o(read);
            }
            return read;
        } catch (IOException e2) {
            throw new FileDataSourceException(e2, 2000);
        }
    }
}
