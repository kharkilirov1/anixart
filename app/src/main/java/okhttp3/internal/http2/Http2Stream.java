package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Http2Stream.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, m31884d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;

    @NotNull
    private final Http2Connection connection;

    @Nullable
    private ErrorCode errorCode;

    @Nullable
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @NotNull
    private final StreamTimeout readTimeout;

    @NotNull
    private final FramingSink sink;

    @NotNull
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @NotNull
    private final StreamTimeout writeTimeout;

    /* compiled from: Http2Stream.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, m31884d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @Nullable
        private Headers trailers;

        @NotNull
        private final Buffer receiveBuffer = new Buffer();

        @NotNull
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j2, boolean z) {
            this.maxByteCount = j2;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long read) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
                return;
            }
            StringBuilder m24u = C0000a.m24u("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.m32178g(currentThread, "Thread.currentThread()");
            m24u.append(currentThread.getName());
            m24u.append(" MUST NOT hold lock on ");
            m24u.append(http2Stream);
            throw new AssertionError(m24u.toString());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j2;
            synchronized (Http2Stream.this) {
                this.closed = true;
                Buffer buffer = this.readBuffer;
                j2 = buffer.f68742c;
                buffer.skip(j2);
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Stream.notifyAll();
            }
            if (j2 > 0) {
                updateConnectionFlowControl(j2);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @NotNull
        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        @NotNull
        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            long j2;
            boolean z;
            long j3;
            Intrinsics.m32179h(sink, "sink");
            long j4 = 0;
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", byteCount).toString());
            }
            while (true) {
                IOException iOException = null;
                synchronized (Http2Stream.this) {
                    Http2Stream.this.getReadTimeout().enter();
                    try {
                        if (Http2Stream.this.getErrorCode$okhttp() != null && (iOException = Http2Stream.this.getErrorException()) == null) {
                            ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                            Intrinsics.m32176e(errorCode$okhttp);
                            iOException = new StreamResetException(errorCode$okhttp);
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        Buffer buffer = this.readBuffer;
                        long j5 = buffer.f68742c;
                        if (j5 > j4) {
                            j2 = buffer.read(sink, Math.min(byteCount, j5));
                            Http2Stream http2Stream = Http2Stream.this;
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                            long readBytesTotal = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                            if (iOException == null && readBytesTotal >= Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), readBytesTotal);
                                Http2Stream http2Stream2 = Http2Stream.this;
                                http2Stream2.setReadBytesAcknowledged$okhttp(http2Stream2.getReadBytesTotal());
                            }
                        } else if (this.finished || iOException != null) {
                            j2 = -1;
                        } else {
                            Http2Stream.this.waitForIo$okhttp();
                            z = true;
                            j3 = -1;
                        }
                        j3 = j2;
                        z = false;
                    } finally {
                        Http2Stream.this.getReadTimeout().exitAndThrowIfTimedOut();
                    }
                }
                if (!z) {
                    if (j3 != -1) {
                        updateConnectionFlowControl(j3);
                        return j3;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j4 = 0;
            }
        }

        public final void receive$okhttp(@NotNull BufferedSource source, long byteCount) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            Intrinsics.m32179h(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder m24u = C0000a.m24u("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.m32178g(currentThread, "Thread.currentThread()");
                m24u.append(currentThread.getName());
                m24u.append(" MUST NOT hold lock on ");
                m24u.append(http2Stream);
                throw new AssertionError(m24u.toString());
            }
            while (byteCount > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.f68742c + byteCount > this.maxByteCount;
                }
                if (z3) {
                    source.skip(byteCount);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    source.skip(byteCount);
                    return;
                }
                long read = source.read(this.receiveBuffer, byteCount);
                if (read == -1) {
                    throw new EOFException();
                }
                byteCount -= read;
                synchronized (Http2Stream.this) {
                    if (this.closed) {
                        Buffer buffer = this.receiveBuffer;
                        j2 = buffer.f68742c;
                        buffer.skip(j2);
                    } else {
                        Buffer buffer2 = this.readBuffer;
                        if (buffer2.f68742c != 0) {
                            z2 = false;
                        }
                        buffer2.mo34569z0(this.receiveBuffer);
                        if (z2) {
                            Http2Stream http2Stream2 = Http2Stream.this;
                            if (http2Stream2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            http2Stream2.notifyAll();
                        }
                        j2 = 0;
                    }
                }
                if (j2 > 0) {
                    updateConnectionFlowControl(j2);
                }
            }
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Source
        @NotNull
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, m31884d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        @NotNull
        public IOException newTimeoutException(@Nullable IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i2, @NotNull Http2Connection connection, boolean z, boolean z2, @Nullable Headers headers) {
        Intrinsics.m32179h(connection, "connection");
        this.id = i2;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!isLocallyInitiated())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder m24u = C0000a.m24u("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.m32178g(currentThread, "Thread.currentThread()");
            m24u.append(currentThread.getName());
            m24u.append(" MUST NOT hold lock on ");
            m24u.append(this);
            throw new AssertionError(m24u.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder m24u = C0000a.m24u("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.m32178g(currentThread, "Thread.currentThread()");
            m24u.append(currentThread.getName());
            m24u.append(" MUST NOT hold lock on ");
            m24u.append(this);
            throw new AssertionError(m24u.toString());
        }
        synchronized (this) {
            z = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.m32176e(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(@NotNull ErrorCode rstStatusCode, @Nullable IOException errorException) throws IOException {
        Intrinsics.m32179h(rstStatusCode, "rstStatusCode");
        if (closeInternal(rstStatusCode, errorException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(@NotNull Headers trailers) {
        Intrinsics.m32179h(trailers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
        }
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    /* renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final Sink getSink() {
        synchronized (this) {
            if (!(this.hasResponseHeaders || isLocallyInitiated())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.sink;
    }

    @NotNull
    /* renamed from: getSink$okhttp, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: getSource$okhttp, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    /* renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@NotNull BufferedSource source, int length) throws IOException {
        Intrinsics.m32179h(source, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(source, length);
            return;
        }
        StringBuilder m24u = C0000a.m24u("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.m32178g(currentThread, "Thread.currentThread()");
        m24u.append(currentThread.getName());
        m24u.append(" MUST NOT hold lock on ");
        m24u.append(this);
        throw new AssertionError(m24u.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:10:0x0039, B:14:0x0041, B:16:0x0050, B:17:0x0055, B:24:0x0047), top: B:9:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void receiveHeaders(@org.jetbrains.annotations.NotNull okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L38
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "Thread "
            java.lang.StringBuilder r4 = p000a.C0000a.m24u(r4)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L38:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L67
            r1 = 1
            if (r0 == 0) goto L47
            if (r4 != 0) goto L41
            goto L47
        L41:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L67
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L67
            goto L4e
        L47:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L67
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L67
            r0.add(r3)     // Catch: java.lang.Throwable -> L67
        L4e:
            if (r4 == 0) goto L55
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L67
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L67
        L55:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L67
            r2.notifyAll()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
            if (r3 != 0) goto L66
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L66:
            return
        L67:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(@NotNull ErrorCode errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j2) {
        this.readBytesAcknowledged = j2;
    }

    public final void setReadBytesTotal$okhttp(long j2) {
        this.readBytesTotal = j2;
    }

    public final void setWriteBytesMaximum$okhttp(long j2) {
        this.writeBytesMaximum = j2;
    }

    public final void setWriteBytesTotal$okhttp(long j2) {
        this.writeBytesTotal = j2;
    }

    @NotNull
    public final synchronized Headers takeHeaders() throws IOException {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!(!this.headersQueue.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.m32176e(errorCode);
            throw new StreamResetException(errorCode);
        }
        removeFirst = this.headersQueue.removeFirst();
        Intrinsics.m32178g(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    @NotNull
    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            Intrinsics.m32176e(errorCode);
            throw new StreamResetException(errorCode);
        }
        if (!(this.source.getFinished() && this.source.getReceiveBuffer().mo34529V() && this.source.getReadBuffer().mo34529V())) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws IOException {
        boolean z;
        Intrinsics.m32179h(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder m24u = C0000a.m24u("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.m32178g(currentThread, "Thread.currentThread()");
            m24u.append(currentThread.getName());
            m24u.append(" MUST NOT hold lock on ");
            m24u.append(this);
            throw new AssertionError(m24u.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (outFinished) {
                this.sink.setFinished(true);
            }
        }
        if (!flushHeaders) {
            synchronized (this.connection) {
                z = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            flushHeaders = z;
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    @NotNull
    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m31884d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;

        @Nullable
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new Buffer();
        }

        private final void emitFrame(boolean outFinishedOnLastFrame) throws IOException {
            long min;
            boolean z;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    try {
                        Http2Stream.this.waitForIo$okhttp();
                    } finally {
                    }
                }
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.f68742c);
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z = outFinishedOnLastFrame && min == this.sendBuffer.f68742c && Http2Stream.this.getErrorCode$okhttp() == null;
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z, this.sendBuffer, min);
            } finally {
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder m24u = C0000a.m24u("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.m32178g(currentThread, "Thread.currentThread()");
                m24u.append(currentThread.getName());
                m24u.append(" MUST NOT hold lock on ");
                m24u.append(http2Stream);
                throw new AssertionError(m24u.toString());
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                boolean z = Http2Stream.this.getErrorCode$okhttp() == null;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z2 = this.sendBuffer.f68742c > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.f68742c > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.m32176e(headers);
                        connection.writeHeaders$okhttp(id2, z, Util.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.f68742c > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder m24u = C0000a.m24u("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.m32178g(currentThread, "Thread.currentThread()");
                m24u.append(currentThread.getName());
                m24u.append(" MUST NOT hold lock on ");
                m24u.append(http2Stream);
                throw new AssertionError(m24u.toString());
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f68742c > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Sink
        @NotNull
        /* renamed from: timeout */
        public Timeout getF68778c() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // okio.Sink
        public void write(@NotNull Buffer source, long byteCount) throws IOException {
            Intrinsics.m32179h(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(source, byteCount);
                while (this.sendBuffer.f68742c >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
            } else {
                StringBuilder m24u = C0000a.m24u("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.m32178g(currentThread, "Thread.currentThread()");
                m24u.append(currentThread.getName());
                m24u.append(" MUST NOT hold lock on ");
                m24u.append(http2Stream);
                throw new AssertionError(m24u.toString());
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z);
        }
    }
}
