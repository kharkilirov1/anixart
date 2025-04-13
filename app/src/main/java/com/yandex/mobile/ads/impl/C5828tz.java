package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.JsonFactory;
import com.yandex.mobile.ads.impl.e41;
import com.yandex.mobile.ads.impl.rw0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.tz */
/* loaded from: classes3.dex */
public final class C5828tz implements InterfaceC6089yr {

    /* renamed from: a */
    @Nullable
    private final mn0 f55287a;

    /* renamed from: b */
    @NotNull
    private final ku0 f55288b;

    /* renamed from: c */
    @NotNull
    private final BufferedSource f55289c;

    /* renamed from: d */
    @NotNull
    private final BufferedSink f55290d;

    /* renamed from: e */
    private int f55291e;

    /* renamed from: f */
    @NotNull
    private final C5256iy f55292f;

    /* renamed from: g */
    @Nullable
    private C5204hy f55293g;

    /* renamed from: com.yandex.mobile.ads.impl.tz$a */
    public abstract class a implements Source {

        /* renamed from: a */
        @NotNull
        private final ForwardingTimeout f55294a;

        /* renamed from: b */
        private boolean f55295b;

        public a() {
            this.f55294a = new ForwardingTimeout(C5828tz.this.f55289c.getTimeout());
        }

        /* renamed from: a */
        public final boolean m28804a() {
            return this.f55295b;
        }

        /* renamed from: b */
        public final void m28805b() {
            if (C5828tz.this.f55291e == 6) {
                return;
            }
            if (C5828tz.this.f55291e == 5) {
                C5828tz.m28796a(C5828tz.this, this.f55294a);
                C5828tz.this.f55291e = 6;
            } else {
                StringBuilder m26356a = l60.m26356a("state: ");
                m26356a.append(C5828tz.this.f55291e);
                throw new IllegalStateException(m26356a.toString());
            }
        }

        /* renamed from: c */
        public final void m28806c() {
            this.f55295b = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long j2) {
            Intrinsics.m32179h(sink, "sink");
            try {
                return C5828tz.this.f55289c.read(sink, j2);
            } catch (IOException e2) {
                C5828tz.this.mo22354c().m26279j();
                m28805b();
                throw e2;
            }
        }

        @Override // okio.Source
        @NotNull
        /* renamed from: timeout */
        public final Timeout getTimeout() {
            return this.f55294a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tz$b */
    public final class b implements Sink {

        /* renamed from: a */
        @NotNull
        private final ForwardingTimeout f55297a;

        /* renamed from: b */
        private boolean f55298b;

        public b() {
            this.f55297a = new ForwardingTimeout(C5828tz.this.f55290d.getF68778c());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f55298b) {
                return;
            }
            this.f55298b = true;
            C5828tz.this.f55290d.mo34559p0("0\r\n\r\n");
            C5828tz.m28796a(C5828tz.this, this.f55297a);
            C5828tz.this.f55291e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final synchronized void flush() {
            if (this.f55298b) {
                return;
            }
            C5828tz.this.f55290d.flush();
        }

        @Override // okio.Sink
        @NotNull
        /* renamed from: timeout */
        public final Timeout getF68778c() {
            return this.f55297a;
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j2) {
            Intrinsics.m32179h(source, "source");
            if (!(!this.f55298b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            C5828tz.this.f55290d.mo34514A0(j2);
            C5828tz.this.f55290d.mo34559p0("\r\n");
            C5828tz.this.f55290d.write(source, j2);
            C5828tz.this.f55290d.mo34559p0("\r\n");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tz$c */
    public final class c extends a {

        /* renamed from: d */
        @NotNull
        private final t00 f55300d;

        /* renamed from: e */
        private long f55301e;

        /* renamed from: f */
        private boolean f55302f;

        /* renamed from: g */
        public final /* synthetic */ C5828tz f55303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5828tz c5828tz, @NotNull t00 url) {
            super();
            Intrinsics.m32179h(url, "url");
            this.f55303g = c5828tz;
            this.f55300d = url;
            this.f55301e = -1L;
            this.f55302f = true;
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (m28804a()) {
                return;
            }
            if (this.f55302f && !t91.m28517a(this, TimeUnit.MILLISECONDS)) {
                this.f55303g.mo22354c().m26279j();
                m28805b();
            }
            m28806c();
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source
        public final long read(@NotNull Buffer sink, long j2) {
            Intrinsics.m32179h(sink, "sink");
            boolean z = true;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
            }
            if (!(!m28804a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f55302f) {
                return -1L;
            }
            long j3 = this.f55301e;
            if (j3 == 0 || j3 == -1) {
                if (j3 != -1) {
                    this.f55303g.f55289c.mo34520M0();
                }
                try {
                    this.f55301e = this.f55303g.f55289c.mo34551k1();
                    String obj = StringsKt.m33914n0(this.f55303g.f55289c.mo34520M0()).toString();
                    if (this.f55301e >= 0) {
                        if (obj.length() <= 0) {
                            z = false;
                        }
                        if (!z || StringsKt.m33898X(obj, ";", false, 2, null)) {
                            if (this.f55301e == 0) {
                                this.f55302f = false;
                                C5828tz c5828tz = this.f55303g;
                                c5828tz.f55293g = c5828tz.f55292f.m25746a();
                                mn0 mn0Var = this.f55303g.f55287a;
                                Intrinsics.m32176e(mn0Var);
                                InterfaceC4875bl m26705h = mn0Var.m26705h();
                                t00 t00Var = this.f55300d;
                                C5204hy c5204hy = this.f55303g.f55293g;
                                Intrinsics.m32176e(c5204hy);
                                m00.m26550a(m26705h, t00Var, c5204hy);
                                m28805b();
                            }
                            if (!this.f55302f) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f55301e + obj + JsonFactory.DEFAULT_QUOTE_CHAR);
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long read = super.read(sink, Math.min(j2, this.f55301e));
            if (read != -1) {
                this.f55301e -= read;
                return read;
            }
            this.f55303g.mo22354c().m26279j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m28805b();
            throw protocolException;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tz$d */
    public final class d extends a {

        /* renamed from: d */
        private long f55304d;

        public d(long j2) {
            super();
            this.f55304d = j2;
            if (j2 == 0) {
                m28805b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (m28804a()) {
                return;
            }
            if (this.f55304d != 0 && !t91.m28517a(this, TimeUnit.MILLISECONDS)) {
                C5828tz.this.mo22354c().m26279j();
                m28805b();
            }
            m28806c();
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source
        public final long read(@NotNull Buffer sink, long j2) {
            Intrinsics.m32179h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
            }
            if (!(!m28804a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f55304d;
            if (j3 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j3, j2));
            if (read == -1) {
                C5828tz.this.mo22354c().m26279j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m28805b();
                throw protocolException;
            }
            long j4 = this.f55304d - read;
            this.f55304d = j4;
            if (j4 == 0) {
                m28805b();
            }
            return read;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tz$e */
    public final class e implements Sink {

        /* renamed from: a */
        @NotNull
        private final ForwardingTimeout f55306a;

        /* renamed from: b */
        private boolean f55307b;

        public e() {
            this.f55306a = new ForwardingTimeout(C5828tz.this.f55290d.getF68778c());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f55307b) {
                return;
            }
            this.f55307b = true;
            C5828tz.m28796a(C5828tz.this, this.f55306a);
            C5828tz.this.f55291e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (this.f55307b) {
                return;
            }
            C5828tz.this.f55290d.flush();
        }

        @Override // okio.Sink
        @NotNull
        /* renamed from: timeout */
        public final Timeout getF68778c() {
            return this.f55306a;
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j2) {
            Intrinsics.m32179h(source, "source");
            if (!(!this.f55307b)) {
                throw new IllegalStateException("closed".toString());
            }
            t91.m28508a(source.f68742c, 0L, j2);
            C5828tz.this.f55290d.write(source, j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tz$f */
    public final class f extends a {

        /* renamed from: d */
        private boolean f55309d;

        public f(C5828tz c5828tz) {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (m28804a()) {
                return;
            }
            if (!this.f55309d) {
                m28805b();
            }
            m28806c();
        }

        @Override // com.yandex.mobile.ads.impl.C5828tz.a, okio.Source
        public final long read(@NotNull Buffer sink, long j2) {
            Intrinsics.m32179h(sink, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
            }
            if (!(!m28804a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f55309d) {
                return -1L;
            }
            long read = super.read(sink, j2);
            if (read != -1) {
                return read;
            }
            this.f55309d = true;
            m28805b();
            return -1L;
        }
    }

    public C5828tz(@Nullable mn0 mn0Var, @NotNull ku0 connection, @NotNull BufferedSource source, @NotNull BufferedSink sink) {
        Intrinsics.m32179h(connection, "connection");
        Intrinsics.m32179h(source, "source");
        Intrinsics.m32179h(sink, "sink");
        this.f55287a = mn0Var;
        this.f55288b = connection;
        this.f55289c = source;
        this.f55290d = sink;
        this.f55292f = new C5256iy(source);
    }

    /* renamed from: a */
    public static final void m28796a(C5828tz c5828tz, ForwardingTimeout forwardingTimeout) {
        Objects.requireNonNull(c5828tz);
        Timeout timeout = forwardingTimeout.f68760a;
        forwardingTimeout.m34594a(Timeout.NONE);
        timeout.clearDeadline();
        timeout.clearTimeout();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    public final void cancel() {
        this.f55288b.m26263a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: b */
    public final long mo22352b(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        if (!m00.m26552a(response)) {
            return 0L;
        }
        if (StringsKt.m33927y("chunked", rw0.m27992a(response, "Transfer-Encoding"), true)) {
            return -1L;
        }
        return t91.m28496a(response);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: c */
    public final ku0 mo22354c() {
        return this.f55288b;
    }

    /* renamed from: c */
    public final void m28803c(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        long m28496a = t91.m28496a(response);
        if (m28496a == -1) {
            return;
        }
        Source m28793a = m28793a(m28496a);
        t91.m28516a(m28793a, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((d) m28793a).close();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: b */
    public final void mo22353b() {
        this.f55290d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: a */
    public final void mo22351a(@NotNull aw0 request) {
        Intrinsics.m32179h(request, "request");
        Proxy.Type type = this.f55288b.m26280k().m23961b().type();
        Intrinsics.m32178g(type, "connection.route().proxy.type()");
        m28802a(request.m22636d(), gw0.m24992a(request, type));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: a */
    public final Sink mo22348a(@NotNull aw0 request, long j2) {
        Intrinsics.m32179h(request, "request");
        if (request.m22632a() != null) {
            Objects.requireNonNull(request.m22632a());
        }
        if (StringsKt.m33927y("chunked", request.m22633a("Transfer-Encoding"), true)) {
            if (this.f55291e == 1) {
                this.f55291e = 2;
                return new b();
            }
            StringBuilder m26356a = l60.m26356a("state: ");
            m26356a.append(this.f55291e);
            throw new IllegalStateException(m26356a.toString().toString());
        }
        if (j2 != -1) {
            if (this.f55291e == 1) {
                this.f55291e = 2;
                return new e();
            }
            StringBuilder m26356a2 = l60.m26356a("state: ");
            m26356a2.append(this.f55291e);
            throw new IllegalStateException(m26356a2.toString().toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: a */
    public final Source mo22349a(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        if (!m00.m26552a(response)) {
            return m28793a(0L);
        }
        if (StringsKt.m33927y("chunked", rw0.m27992a(response, "Transfer-Encoding"), true)) {
            t00 m22640h = response.m28008p().m22640h();
            if (this.f55291e == 4) {
                this.f55291e = 5;
                return new c(this, m22640h);
            }
            StringBuilder m26356a = l60.m26356a("state: ");
            m26356a.append(this.f55291e);
            throw new IllegalStateException(m26356a.toString().toString());
        }
        long m28496a = t91.m28496a(response);
        if (m28496a != -1) {
            return m28793a(m28496a);
        }
        if (this.f55291e == 4) {
            this.f55291e = 5;
            this.f55288b.m26279j();
            return new f(this);
        }
        StringBuilder m26356a2 = l60.m26356a("state: ");
        m26356a2.append(this.f55291e);
        throw new IllegalStateException(m26356a2.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: a */
    public final void mo22350a() {
        this.f55290d.flush();
    }

    /* renamed from: a */
    public final void m28802a(@NotNull C5204hy headers, @NotNull String requestLine) {
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(requestLine, "requestLine");
        if (this.f55291e == 0) {
            this.f55290d.mo34559p0(requestLine).mo34559p0("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f55290d.mo34559p0(headers.m25380a(i2)).mo34559p0(": ").mo34559p0(headers.m25383b(i2)).mo34559p0("\r\n");
            }
            this.f55290d.mo34559p0("\r\n");
            this.f55291e = 1;
            return;
        }
        StringBuilder m26356a = l60.m26356a("state: ");
        m26356a.append(this.f55291e);
        throw new IllegalStateException(m26356a.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @Nullable
    /* renamed from: a */
    public final rw0.C5716a mo22347a(boolean z) {
        int i2 = this.f55291e;
        boolean z2 = true;
        if (i2 != 1 && i2 != 3) {
            z2 = false;
        }
        if (z2) {
            try {
                e41 m24006a = e41.C5004a.m24006a(this.f55292f.m25747b());
                rw0.C5716a m28016a = new rw0.C5716a().m28014a(m24006a.f49803a).m28011a(m24006a.f49804b).m28025b(m24006a.f49805c).m28016a(this.f55292f.m25746a());
                if (z && m24006a.f49804b == 100) {
                    return null;
                }
                if (m24006a.f49804b == 100) {
                    this.f55291e = 3;
                    return m28016a;
                }
                this.f55291e = 4;
                return m28016a;
            } catch (EOFException e2) {
                throw new IOException(um1.m29049a("unexpected end of stream on ", this.f55288b.m26280k().m23960a().m29677k().m28396k()), e2);
            }
        }
        StringBuilder m26356a = l60.m26356a("state: ");
        m26356a.append(this.f55291e);
        throw new IllegalStateException(m26356a.toString().toString());
    }

    /* renamed from: a */
    private final Source m28793a(long j2) {
        if (this.f55291e == 4) {
            this.f55291e = 5;
            return new d(j2);
        }
        StringBuilder m26356a = l60.m26356a("state: ");
        m26356a.append(this.f55291e);
        throw new IllegalStateException(m26356a.toString().toString());
    }
}
