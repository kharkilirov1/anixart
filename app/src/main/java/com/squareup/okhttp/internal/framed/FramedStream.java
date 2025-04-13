package com.squareup.okhttp.internal.framed;

import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2Stream;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class FramedStream {

    /* renamed from: b */
    public long f25047b;

    /* renamed from: c */
    public final int f25048c;

    /* renamed from: d */
    public final FramedConnection f25049d;

    /* renamed from: e */
    public final List<Header> f25050e;

    /* renamed from: f */
    public List<Header> f25051f;

    /* renamed from: g */
    public final FramedDataSource f25052g;

    /* renamed from: h */
    public final FramedDataSink f25053h;

    /* renamed from: a */
    public long f25046a = 0;

    /* renamed from: i */
    public final StreamTimeout f25054i = new StreamTimeout();

    /* renamed from: j */
    public final StreamTimeout f25055j = new StreamTimeout();

    /* renamed from: k */
    public ErrorCode f25056k = null;

    public final class FramedDataSink implements Sink {

        /* renamed from: b */
        public final Buffer f25057b = new Buffer();

        /* renamed from: c */
        public boolean f25058c;

        /* renamed from: d */
        public boolean f25059d;

        public FramedDataSink() {
        }

        /* renamed from: a */
        public final void m13975a(boolean z) throws IOException {
            FramedStream framedStream;
            long min;
            FramedStream framedStream2;
            synchronized (FramedStream.this) {
                FramedStream.this.f25055j.enter();
                while (true) {
                    try {
                        framedStream = FramedStream.this;
                        if (framedStream.f25047b > 0 || this.f25059d || this.f25058c || framedStream.f25056k != null) {
                            break;
                        }
                        try {
                            framedStream.wait();
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } finally {
                    }
                }
                framedStream.f25055j.exitAndThrowIfTimedOut();
                FramedStream.m13968b(FramedStream.this);
                min = Math.min(FramedStream.this.f25047b, this.f25057b.f68742c);
                framedStream2 = FramedStream.this;
                framedStream2.f25047b -= min;
            }
            framedStream2.f25055j.enter();
            try {
                FramedStream framedStream3 = FramedStream.this;
                framedStream3.f25049d.m13955i(framedStream3.f25048c, z && min == this.f25057b.f68742c, this.f25057b, min);
            } finally {
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (FramedStream.this) {
                if (this.f25058c) {
                    return;
                }
                FramedStream framedStream = FramedStream.this;
                if (!framedStream.f25053h.f25059d) {
                    if (this.f25057b.f68742c > 0) {
                        while (this.f25057b.f68742c > 0) {
                            m13975a(true);
                        }
                    } else {
                        framedStream.f25049d.m13955i(framedStream.f25048c, true, null, 0L);
                    }
                }
                synchronized (FramedStream.this) {
                    this.f25058c = true;
                }
                FramedStream.this.f25049d.f25010r.flush();
                FramedStream.m13967a(FramedStream.this);
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (FramedStream.this) {
                FramedStream.m13968b(FramedStream.this);
            }
            while (this.f25057b.f68742c > 0) {
                m13975a(false);
                FramedStream.this.f25049d.f25010r.flush();
            }
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getF68778c() {
            return FramedStream.this.f25055j;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            this.f25057b.write(buffer, j2);
            while (this.f25057b.f68742c >= Http2Stream.EMIT_BUFFER_SIZE) {
                m13975a(false);
            }
        }
    }

    public final class FramedDataSource implements Source {

        /* renamed from: b */
        public final Buffer f25061b = new Buffer();

        /* renamed from: c */
        public final Buffer f25062c = new Buffer();

        /* renamed from: d */
        public final long f25063d;

        /* renamed from: e */
        public boolean f25064e;

        /* renamed from: f */
        public boolean f25065f;

        public FramedDataSource(long j2, C24911 c24911) {
            this.f25063d = j2;
        }

        /* renamed from: a */
        public final void m13976a() throws IOException {
            if (this.f25064e) {
                throw new IOException("stream closed");
            }
            if (FramedStream.this.f25056k == null) {
                return;
            }
            StringBuilder m24u = C0000a.m24u("stream was reset: ");
            m24u.append(FramedStream.this.f25056k);
            throw new IOException(m24u.toString());
        }

        /* renamed from: b */
        public final void m13977b() throws IOException {
            FramedStream.this.f25054i.enter();
            while (this.f25062c.f68742c == 0 && !this.f25065f && !this.f25064e) {
                try {
                    FramedStream framedStream = FramedStream.this;
                    if (framedStream.f25056k != null) {
                        break;
                    }
                    try {
                        framedStream.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    FramedStream.this.f25054i.exitAndThrowIfTimedOut();
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (FramedStream.this) {
                this.f25064e = true;
                Buffer buffer = this.f25062c;
                buffer.skip(buffer.f68742c);
                FramedStream.this.notifyAll();
            }
            FramedStream.m13967a(FramedStream.this);
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2));
            }
            synchronized (FramedStream.this) {
                m13977b();
                m13976a();
                Buffer buffer2 = this.f25062c;
                long j3 = buffer2.f68742c;
                if (j3 == 0) {
                    return -1L;
                }
                long read = buffer2.read(buffer, Math.min(j2, j3));
                FramedStream framedStream = FramedStream.this;
                long j4 = framedStream.f25046a + read;
                framedStream.f25046a = j4;
                if (j4 >= framedStream.f25049d.f25006n.m13997b(TextBuffer.MAX_SEGMENT_LEN) / 2) {
                    FramedStream framedStream2 = FramedStream.this;
                    framedStream2.f25049d.m13957k(framedStream2.f25048c, framedStream2.f25046a);
                    FramedStream.this.f25046a = 0L;
                }
                synchronized (FramedStream.this.f25049d) {
                    FramedConnection framedConnection = FramedStream.this.f25049d;
                    long j5 = framedConnection.f25004l + read;
                    framedConnection.f25004l = j5;
                    if (j5 >= framedConnection.f25006n.m13997b(TextBuffer.MAX_SEGMENT_LEN) / 2) {
                        FramedConnection framedConnection2 = FramedStream.this.f25049d;
                        framedConnection2.m13957k(0, framedConnection2.f25004l);
                        FramedStream.this.f25049d.f25004l = 0L;
                    }
                }
                return read;
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getF68772c() {
            return FramedStream.this.f25054i;
        }
    }

    public class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            FramedStream.this.m13971e(ErrorCode.CANCEL);
        }
    }

    public FramedStream(int i2, FramedConnection framedConnection, boolean z, boolean z2, List<Header> list) {
        Objects.requireNonNull(framedConnection, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f25048c = i2;
        this.f25049d = framedConnection;
        this.f25047b = framedConnection.f25007o.m13997b(TextBuffer.MAX_SEGMENT_LEN);
        FramedDataSource framedDataSource = new FramedDataSource(framedConnection.f25006n.m13997b(TextBuffer.MAX_SEGMENT_LEN), null);
        this.f25052g = framedDataSource;
        FramedDataSink framedDataSink = new FramedDataSink();
        this.f25053h = framedDataSink;
        framedDataSource.f25065f = z2;
        framedDataSink.f25059d = z;
        this.f25050e = list;
    }

    /* renamed from: a */
    public static void m13967a(FramedStream framedStream) throws IOException {
        boolean z;
        boolean m13973g;
        synchronized (framedStream) {
            FramedDataSource framedDataSource = framedStream.f25052g;
            if (!framedDataSource.f25065f && framedDataSource.f25064e) {
                FramedDataSink framedDataSink = framedStream.f25053h;
                if (framedDataSink.f25059d || framedDataSink.f25058c) {
                    z = true;
                    m13973g = framedStream.m13973g();
                }
            }
            z = false;
            m13973g = framedStream.m13973g();
        }
        if (z) {
            framedStream.m13969c(ErrorCode.CANCEL);
        } else {
            if (m13973g) {
                return;
            }
            framedStream.f25049d.m13952e(framedStream.f25048c);
        }
    }

    /* renamed from: b */
    public static void m13968b(FramedStream framedStream) throws IOException {
        FramedDataSink framedDataSink = framedStream.f25053h;
        if (framedDataSink.f25058c) {
            throw new IOException("stream closed");
        }
        if (framedDataSink.f25059d) {
            throw new IOException("stream finished");
        }
        if (framedStream.f25056k == null) {
            return;
        }
        StringBuilder m24u = C0000a.m24u("stream was reset: ");
        m24u.append(framedStream.f25056k);
        throw new IOException(m24u.toString());
    }

    /* renamed from: c */
    public void m13969c(ErrorCode errorCode) throws IOException {
        if (m13970d(errorCode)) {
            FramedConnection framedConnection = this.f25049d;
            framedConnection.f25010r.mo13946G0(this.f25048c, errorCode);
        }
    }

    /* renamed from: d */
    public final boolean m13970d(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f25056k != null) {
                return false;
            }
            if (this.f25052g.f25065f && this.f25053h.f25059d) {
                return false;
            }
            this.f25056k = errorCode;
            notifyAll();
            this.f25049d.m13952e(this.f25048c);
            return true;
        }
    }

    /* renamed from: e */
    public void m13971e(ErrorCode errorCode) {
        if (m13970d(errorCode)) {
            this.f25049d.m13956j(this.f25048c, errorCode);
        }
    }

    /* renamed from: f */
    public boolean m13972f() {
        return this.f25049d.f24995c == ((this.f25048c & 1) == 1);
    }

    /* renamed from: g */
    public synchronized boolean m13973g() {
        if (this.f25056k != null) {
            return false;
        }
        FramedDataSource framedDataSource = this.f25052g;
        if (framedDataSource.f25065f || framedDataSource.f25064e) {
            FramedDataSink framedDataSink = this.f25053h;
            if (framedDataSink.f25059d || framedDataSink.f25058c) {
                if (this.f25051f != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public void m13974h() {
        boolean m13973g;
        synchronized (this) {
            this.f25052g.f25065f = true;
            m13973g = m13973g();
            notifyAll();
        }
        if (m13973g) {
            return;
        }
        this.f25049d.m13952e(this.f25048c);
    }
}
