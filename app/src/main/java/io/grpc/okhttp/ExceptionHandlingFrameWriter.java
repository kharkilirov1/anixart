package io.grpc.okhttp;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.okhttp.OkHttpFrameLogger;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameWriter;
import io.grpc.okhttp.internal.framed.Header;
import io.grpc.okhttp.internal.framed.Settings;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes3.dex */
final class ExceptionHandlingFrameWriter implements FrameWriter {

    /* renamed from: e */
    public static final Logger f59189e = Logger.getLogger(OkHttpClientTransport.class.getName());

    /* renamed from: b */
    public final TransportExceptionHandler f59190b;

    /* renamed from: c */
    public final FrameWriter f59191c;

    /* renamed from: d */
    public final OkHttpFrameLogger f59192d;

    public interface TransportExceptionHandler {
        /* renamed from: d */
        void mo31220d(Throwable th);
    }

    @VisibleForTesting
    public ExceptionHandlingFrameWriter(TransportExceptionHandler transportExceptionHandler, FrameWriter frameWriter, OkHttpFrameLogger okHttpFrameLogger) {
        Preconditions.m11187k(transportExceptionHandler, "transportExceptionHandler");
        this.f59190b = transportExceptionHandler;
        Preconditions.m11187k(frameWriter, "frameWriter");
        this.f59191c = frameWriter;
        Preconditions.m11187k(okHttpFrameLogger, "frameLogger");
        this.f59192d = okHttpFrameLogger;
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    /* renamed from: C0 */
    public void mo31215C0(Settings settings) {
        this.f59192d.m31256f(OkHttpFrameLogger.Direction.OUTBOUND, settings);
        try {
            this.f59191c.mo31215C0(settings);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    /* renamed from: b1 */
    public void mo31216b1(boolean z, boolean z2, int i2, int i3, List<Header> list) {
        try {
            this.f59191c.mo31216b1(z, z2, i2, i3, list);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f59191c.close();
        } catch (IOException e2) {
            f59189e.log(e2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void connectionPreface() {
        try {
            this.f59191c.connectionPreface();
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    /* renamed from: d */
    public void mo31217d(int i2, ErrorCode errorCode) {
        this.f59192d.m31255e(OkHttpFrameLogger.Direction.OUTBOUND, i2, errorCode);
        try {
            this.f59191c.mo31217d(i2, errorCode);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void data(boolean z, int i2, Buffer buffer, int i3) {
        this.f59192d.m31252b(OkHttpFrameLogger.Direction.OUTBOUND, i2, buffer, i3, z);
        try {
            this.f59191c.data(z, i2, buffer, i3);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void flush() {
        try {
            this.f59191c.flush();
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    /* renamed from: l1 */
    public void mo31218l1(int i2, ErrorCode errorCode, byte[] bArr) {
        this.f59192d.m31253c(OkHttpFrameLogger.Direction.OUTBOUND, i2, errorCode, ByteString.m34573i(bArr));
        try {
            this.f59191c.mo31218l1(i2, errorCode, bArr);
            this.f59191c.flush();
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public int maxDataLength() {
        return this.f59191c.maxDataLength();
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void ping(boolean z, int i2, int i3) {
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.OUTBOUND;
        if (z) {
            OkHttpFrameLogger okHttpFrameLogger = this.f59192d;
            long j2 = (4294967295L & i3) | (i2 << 32);
            if (okHttpFrameLogger.m31251a()) {
                okHttpFrameLogger.f59290a.log(okHttpFrameLogger.f59291b, direction + " PING: ack=true bytes=" + j2);
            }
        } else {
            this.f59192d.m31254d(direction, (4294967295L & i3) | (i2 << 32));
        }
        try {
            this.f59191c.ping(z, i2, i3);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    /* renamed from: v0 */
    public void mo31219v0(Settings settings) {
        OkHttpFrameLogger okHttpFrameLogger = this.f59192d;
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.OUTBOUND;
        if (okHttpFrameLogger.m31251a()) {
            okHttpFrameLogger.f59290a.log(okHttpFrameLogger.f59291b, direction + " SETTINGS: ack=true");
        }
        try {
            this.f59191c.mo31219v0(settings);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.FrameWriter
    public void windowUpdate(int i2, long j2) {
        this.f59192d.m31257g(OkHttpFrameLogger.Direction.OUTBOUND, i2, j2);
        try {
            this.f59191c.windowUpdate(i2, j2);
        } catch (IOException e2) {
            this.f59190b.mo31220d(e2);
        }
    }
}
