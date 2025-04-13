package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.internal.SerializingExecutor;
import io.grpc.okhttp.ExceptionHandlingFrameWriter;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* loaded from: classes3.dex */
final class AsyncSink implements Sink {

    /* renamed from: d */
    public final SerializingExecutor f59178d;

    /* renamed from: e */
    public final ExceptionHandlingFrameWriter.TransportExceptionHandler f59179e;

    /* renamed from: i */
    @Nullable
    public Sink f59183i;

    /* renamed from: j */
    @Nullable
    public Socket f59184j;

    /* renamed from: b */
    public final Object f59176b = new Object();

    /* renamed from: c */
    public final Buffer f59177c = new Buffer();

    /* renamed from: f */
    @GuardedBy
    public boolean f59180f = false;

    /* renamed from: g */
    @GuardedBy
    public boolean f59181g = false;

    /* renamed from: h */
    public boolean f59182h = false;

    public abstract class WriteRunnable implements Runnable {
        public WriteRunnable(C64711 c64711) {
        }

        /* renamed from: a */
        public abstract void mo31214a() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (AsyncSink.this.f59183i == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                mo31214a();
            } catch (Exception e2) {
                AsyncSink.this.f59179e.mo31220d(e2);
            }
        }
    }

    public AsyncSink(SerializingExecutor serializingExecutor, ExceptionHandlingFrameWriter.TransportExceptionHandler transportExceptionHandler) {
        Preconditions.m11187k(serializingExecutor, "executor");
        this.f59178d = serializingExecutor;
        Preconditions.m11187k(transportExceptionHandler, "exceptionHandler");
        this.f59179e = transportExceptionHandler;
    }

    /* renamed from: a */
    public void m31213a(Sink sink, Socket socket) {
        Preconditions.m11192p(this.f59183i == null, "AsyncSink's becomeConnected should only be called once.");
        Preconditions.m11187k(sink, "sink");
        this.f59183i = sink;
        this.f59184j = socket;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f59182h) {
            return;
        }
        this.f59182h = true;
        this.f59178d.execute(new Runnable() { // from class: io.grpc.okhttp.AsyncSink.3
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(AsyncSink.this.f59177c);
                try {
                    Sink sink = AsyncSink.this.f59183i;
                    if (sink != null) {
                        sink.close();
                    }
                } catch (IOException e2) {
                    AsyncSink.this.f59179e.mo31220d(e2);
                }
                try {
                    Socket socket = AsyncSink.this.f59184j;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException e3) {
                    AsyncSink.this.f59179e.mo31220d(e3);
                }
            }
        });
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f59182h) {
            throw new IOException("closed");
        }
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            synchronized (this.f59176b) {
                if (this.f59181g) {
                    Objects.requireNonNull(impl);
                    return;
                }
                this.f59181g = true;
                this.f59178d.execute(new WriteRunnable() { // from class: io.grpc.okhttp.AsyncSink.2
                    {
                        PerfMark.m31344a();
                    }

                    @Override // io.grpc.okhttp.AsyncSink.WriteRunnable
                    /* renamed from: a */
                    public void mo31214a() throws IOException {
                        AsyncSink asyncSink;
                        Objects.requireNonNull(PerfMark.f59566a);
                        Buffer buffer = new Buffer();
                        try {
                            synchronized (AsyncSink.this.f59176b) {
                                Buffer buffer2 = AsyncSink.this.f59177c;
                                buffer.write(buffer2, buffer2.f68742c);
                                asyncSink = AsyncSink.this;
                                asyncSink.f59181g = false;
                            }
                            asyncSink.f59183i.write(buffer, buffer.f68742c);
                            AsyncSink.this.f59183i.flush();
                        } catch (Throwable th) {
                            Objects.requireNonNull(PerfMark.f59566a);
                            throw th;
                        }
                    }
                });
                Objects.requireNonNull(impl);
            }
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public Timeout getF68778c() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
        Preconditions.m11187k(buffer, "source");
        if (this.f59182h) {
            throw new IOException("closed");
        }
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            synchronized (this.f59176b) {
                this.f59177c.write(buffer, j2);
                if (!this.f59180f && !this.f59181g && this.f59177c.m34534b() > 0) {
                    this.f59180f = true;
                    this.f59178d.execute(new WriteRunnable() { // from class: io.grpc.okhttp.AsyncSink.1
                        {
                            PerfMark.m31344a();
                        }

                        @Override // io.grpc.okhttp.AsyncSink.WriteRunnable
                        /* renamed from: a */
                        public void mo31214a() throws IOException {
                            AsyncSink asyncSink;
                            Objects.requireNonNull(PerfMark.f59566a);
                            Buffer buffer2 = new Buffer();
                            try {
                                synchronized (AsyncSink.this.f59176b) {
                                    Buffer buffer3 = AsyncSink.this.f59177c;
                                    buffer2.write(buffer3, buffer3.m34534b());
                                    asyncSink = AsyncSink.this;
                                    asyncSink.f59180f = false;
                                }
                                asyncSink.f59183i.write(buffer2, buffer2.f68742c);
                            } catch (Throwable th) {
                                Objects.requireNonNull(PerfMark.f59566a);
                                throw th;
                            }
                        }
                    });
                    Objects.requireNonNull(impl);
                    return;
                }
                Objects.requireNonNull(impl);
            }
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }
}
