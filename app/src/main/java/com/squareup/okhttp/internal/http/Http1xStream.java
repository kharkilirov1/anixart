package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Http1xStream implements HttpStream {

    /* renamed from: a */
    public final StreamAllocation f25137a;

    /* renamed from: b */
    public final BufferedSource f25138b;

    /* renamed from: c */
    public final BufferedSink f25139c;

    /* renamed from: d */
    public int f25140d;

    public abstract class AbstractSource implements Source {

        /* renamed from: b */
        public final ForwardingTimeout f25141b;

        /* renamed from: c */
        public boolean f25142c;

        /* renamed from: d */
        public final /* synthetic */ Http1xStream f25143d;

        /* renamed from: a */
        public final void m14004a() throws IOException {
            Http1xStream http1xStream = this.f25143d;
            if (http1xStream.f25140d != 5) {
                StringBuilder m24u = C0000a.m24u("state: ");
                m24u.append(this.f25143d.f25140d);
                throw new IllegalStateException(m24u.toString());
            }
            Http1xStream.m14002a(http1xStream, this.f25141b);
            Http1xStream http1xStream2 = this.f25143d;
            http1xStream2.f25140d = 6;
            StreamAllocation streamAllocation = http1xStream2.f25137a;
            if (streamAllocation != null) {
                streamAllocation.m14011c(http1xStream2);
            }
        }

        /* renamed from: b */
        public final void m14005b() {
            Http1xStream http1xStream = this.f25143d;
            if (http1xStream.f25140d == 6) {
                return;
            }
            http1xStream.f25140d = 6;
            StreamAllocation streamAllocation = http1xStream.f25137a;
            if (streamAllocation != null) {
                streamAllocation.m14010b();
                Http1xStream http1xStream2 = this.f25143d;
                http1xStream2.f25137a.m14011c(http1xStream2);
            }
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getF68772c() {
            return this.f25141b;
        }
    }

    public final class ChunkedSink implements Sink {

        /* renamed from: b */
        public final ForwardingTimeout f25144b;

        /* renamed from: c */
        public boolean f25145c;

        /* renamed from: d */
        public final /* synthetic */ Http1xStream f25146d;

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f25145c) {
                return;
            }
            this.f25145c = true;
            this.f25146d.f25139c.mo34559p0("0\r\n\r\n");
            Http1xStream.m14002a(this.f25146d, this.f25144b);
            this.f25146d.f25140d = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f25145c) {
                return;
            }
            this.f25146d.f25139c.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getF68778c() {
            return this.f25144b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (this.f25145c) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            this.f25146d.f25139c.mo34514A0(j2);
            this.f25146d.f25139c.mo34559p0("\r\n");
            this.f25146d.f25139c.write(buffer, j2);
            this.f25146d.f25139c.mo34559p0("\r\n");
        }
    }

    public class ChunkedSource extends AbstractSource {

        /* renamed from: e */
        public long f25147e;

        /* renamed from: f */
        public boolean f25148f;

        /* renamed from: g */
        public final HttpEngine f25149g;

        /* renamed from: h */
        public final /* synthetic */ Http1xStream f25150h;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25142c) {
                return;
            }
            if (this.f25148f && !Util.m13937e(this, 100, TimeUnit.MILLISECONDS)) {
                m14005b();
            }
            this.f25142c = true;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2));
            }
            if (this.f25142c) {
                throw new IllegalStateException("closed");
            }
            if (!this.f25148f) {
                return -1L;
            }
            long j3 = this.f25147e;
            if (j3 == 0 || j3 == -1) {
                if (j3 != -1) {
                    this.f25150h.f25138b.mo34520M0();
                }
                try {
                    this.f25147e = this.f25150h.f25138b.mo34551k1();
                    String trim = this.f25150h.f25138b.mo34520M0().trim();
                    if (this.f25147e < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f25147e + trim + "\"");
                    }
                    if (this.f25147e == 0) {
                        this.f25148f = false;
                        this.f25149g.m14006a(this.f25150h.m14003b());
                        m14004a();
                    }
                    if (!this.f25148f) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long read = this.f25150h.f25138b.read(buffer, Math.min(j2, this.f25147e));
            if (read != -1) {
                this.f25147e -= read;
                return read;
            }
            m14005b();
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final class FixedLengthSink implements Sink {

        /* renamed from: b */
        public final ForwardingTimeout f25151b;

        /* renamed from: c */
        public boolean f25152c;

        /* renamed from: d */
        public long f25153d;

        /* renamed from: e */
        public final /* synthetic */ Http1xStream f25154e;

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25152c) {
                return;
            }
            this.f25152c = true;
            if (this.f25153d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1xStream.m14002a(this.f25154e, this.f25151b);
            this.f25154e.f25140d = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f25152c) {
                return;
            }
            this.f25154e.f25139c.flush();
        }

        @Override // okio.Sink
        /* renamed from: timeout */
        public Timeout getF68778c() {
            return this.f25151b;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
            if (this.f25152c) {
                throw new IllegalStateException("closed");
            }
            Util.m13933a(buffer.f68742c, 0L, j2);
            if (j2 <= this.f25153d) {
                this.f25154e.f25139c.write(buffer, j2);
                this.f25153d -= j2;
            } else {
                StringBuilder m24u = C0000a.m24u("expected ");
                m24u.append(this.f25153d);
                m24u.append(" bytes but received ");
                m24u.append(j2);
                throw new ProtocolException(m24u.toString());
            }
        }
    }

    public class FixedLengthSource extends AbstractSource {

        /* renamed from: e */
        public long f25155e;

        /* renamed from: f */
        public final /* synthetic */ Http1xStream f25156f;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25142c) {
                return;
            }
            if (this.f25155e != 0 && !Util.m13937e(this, 100, TimeUnit.MILLISECONDS)) {
                m14005b();
            }
            this.f25142c = true;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2));
            }
            if (this.f25142c) {
                throw new IllegalStateException("closed");
            }
            long j3 = this.f25155e;
            if (j3 == 0) {
                return -1L;
            }
            long read = this.f25156f.f25138b.read(buffer, Math.min(j3, j2));
            if (read == -1) {
                m14005b();
                throw new ProtocolException("unexpected end of stream");
            }
            long j4 = this.f25155e - read;
            this.f25155e = j4;
            if (j4 == 0) {
                m14004a();
            }
            return read;
        }
    }

    public class UnknownLengthSource extends AbstractSource {

        /* renamed from: e */
        public boolean f25157e;

        /* renamed from: f */
        public final /* synthetic */ Http1xStream f25158f;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25142c) {
                return;
            }
            if (!this.f25157e) {
                m14005b();
            }
            this.f25142c = true;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2));
            }
            if (this.f25142c) {
                throw new IllegalStateException("closed");
            }
            if (this.f25157e) {
                return -1L;
            }
            long read = this.f25158f.f25138b.read(buffer, j2);
            if (read != -1) {
                return read;
            }
            this.f25157e = true;
            m14004a();
            return -1L;
        }
    }

    /* renamed from: a */
    public static void m14002a(Http1xStream http1xStream, ForwardingTimeout forwardingTimeout) {
        Objects.requireNonNull(http1xStream);
        Timeout timeout = forwardingTimeout.f68760a;
        forwardingTimeout.m34594a(Timeout.NONE);
        timeout.clearDeadline();
        timeout.clearTimeout();
    }

    /* renamed from: b */
    public Headers m14003b() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String mo34520M0 = this.f25138b.mo34520M0();
            if (mo34520M0.length() == 0) {
                return builder.m13895c();
            }
            Internal.f24955b.mo13922a(builder, mo34520M0);
        }
    }
}
