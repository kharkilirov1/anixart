package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CacheDataSink implements DataSink {

    /* renamed from: a */
    public final Cache f14545a;

    /* renamed from: b */
    public final long f14546b;

    /* renamed from: c */
    public final int f14547c;

    /* renamed from: d */
    @Nullable
    public DataSpec f14548d;

    /* renamed from: e */
    public long f14549e;

    /* renamed from: f */
    @Nullable
    public File f14550f;

    /* renamed from: g */
    @Nullable
    public OutputStream f14551g;

    /* renamed from: h */
    public long f14552h;

    /* renamed from: i */
    public long f14553i;

    /* renamed from: j */
    public ReusableBufferedOutputStream f14554j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class Factory implements DataSink.Factory {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    /* renamed from: a */
    public void mo7431a(DataSpec dataSpec) throws CacheDataSinkException {
        Objects.requireNonNull(dataSpec.f14369h);
        if (dataSpec.f14368g == -1 && dataSpec.m7435c(2)) {
            this.f14548d = null;
            return;
        }
        this.f14548d = dataSpec;
        this.f14549e = dataSpec.m7435c(4) ? this.f14546b : Long.MAX_VALUE;
        this.f14553i = 0L;
        try {
            m7495c(dataSpec);
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    /* renamed from: b */
    public final void m7494b() throws IOException {
        OutputStream outputStream = this.f14551g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            OutputStream outputStream2 = this.f14551g;
            int i2 = Util.f14736a;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException unused) {
                }
            }
            this.f14551g = null;
            File file = this.f14550f;
            this.f14550f = null;
            this.f14545a.mo7491h(file, this.f14552h);
        } catch (Throwable th) {
            OutputStream outputStream3 = this.f14551g;
            int i3 = Util.f14736a;
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (IOException unused2) {
                }
            }
            this.f14551g = null;
            File file2 = this.f14550f;
            this.f14550f = null;
            file2.delete();
            throw th;
        }
    }

    /* renamed from: c */
    public final void m7495c(DataSpec dataSpec) throws IOException {
        long j2 = dataSpec.f14368g;
        long min = j2 != -1 ? Math.min(j2 - this.f14553i, this.f14549e) : -1L;
        Cache cache = this.f14545a;
        String str = dataSpec.f14369h;
        int i2 = Util.f14736a;
        this.f14550f = cache.mo7484a(str, dataSpec.f14367f + this.f14553i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f14550f);
        if (this.f14547c > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.f14554j;
            if (reusableBufferedOutputStream == null) {
                this.f14554j = new ReusableBufferedOutputStream(fileOutputStream, this.f14547c);
            } else {
                reusableBufferedOutputStream.m7511a(fileOutputStream);
            }
            this.f14551g = this.f14554j;
        } else {
            this.f14551g = fileOutputStream;
        }
        this.f14552h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws CacheDataSinkException {
        if (this.f14548d == null) {
            return;
        }
        try {
            m7494b();
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i2, int i3) throws CacheDataSinkException {
        DataSpec dataSpec = this.f14548d;
        if (dataSpec == null) {
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            try {
                if (this.f14552h == this.f14549e) {
                    m7494b();
                    m7495c(dataSpec);
                }
                int min = (int) Math.min(i3 - i4, this.f14549e - this.f14552h);
                OutputStream outputStream = this.f14551g;
                int i5 = Util.f14736a;
                outputStream.write(bArr, i2 + i4, min);
                i4 += min;
                long j2 = min;
                this.f14552h += j2;
                this.f14553i += j2;
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        }
    }
}
