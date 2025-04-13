package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ByteBufferUtil {

    public static final class SafeArray {

        /* renamed from: a */
        public final int f8830a;

        /* renamed from: b */
        public final int f8831b;

        /* renamed from: c */
        public final byte[] f8832c;

        public SafeArray(@NonNull byte[] bArr, int i2, int i3) {
            this.f8832c = bArr;
            this.f8830a = i2;
            this.f8831b = i3;
        }
    }

    static {
        new AtomicReference();
    }

    @NonNull
    /* renamed from: a */
    public static ByteBuffer m5329a(@NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > ParserMinimalBase.MAX_INT_L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @NonNull
    /* renamed from: b */
    public static byte[] m5330b(@NonNull ByteBuffer byteBuffer) {
        SafeArray safeArray = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new SafeArray(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (safeArray != null && safeArray.f8830a == 0 && safeArray.f8831b == safeArray.f8832c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: c */
    public static void m5331c(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @NonNull
    /* renamed from: d */
    public static InputStream m5332d(@NonNull ByteBuffer byteBuffer) {
        return new ByteBufferStream(byteBuffer);
    }

    public static class ByteBufferStream extends InputStream {

        /* renamed from: b */
        @NonNull
        public final ByteBuffer f8828b;

        /* renamed from: c */
        public int f8829c = -1;

        public ByteBufferStream(@NonNull ByteBuffer byteBuffer) {
            this.f8828b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f8828b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f8829c = this.f8828b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f8828b.hasRemaining()) {
                return this.f8828b.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i2 = this.f8829c;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f8828b.position(i2);
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            if (!this.f8828b.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j2, available());
            this.f8828b.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
            if (!this.f8828b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i3, available());
            this.f8828b.get(bArr, i2, min);
            return min;
        }
    }
}
