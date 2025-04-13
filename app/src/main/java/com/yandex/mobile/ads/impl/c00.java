package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Stream;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class c00 {

    /* renamed from: a */
    private final int f49034a;

    /* renamed from: b */
    @NotNull
    private final C5947vz f49035b;

    /* renamed from: c */
    private long f49036c;

    /* renamed from: d */
    private long f49037d;

    /* renamed from: e */
    private long f49038e;

    /* renamed from: f */
    private long f49039f;

    /* renamed from: g */
    @NotNull
    private final ArrayDeque<C5204hy> f49040g;

    /* renamed from: h */
    private boolean f49041h;

    /* renamed from: i */
    @NotNull
    private final C4897b f49042i;

    /* renamed from: j */
    @NotNull
    private final C4896a f49043j;

    /* renamed from: k */
    @NotNull
    private final C4898c f49044k;

    /* renamed from: l */
    @NotNull
    private final C4898c f49045l;

    /* renamed from: m */
    @Nullable
    private EnumC5708rr f49046m;

    /* renamed from: n */
    @Nullable
    private IOException f49047n;

    /* renamed from: com.yandex.mobile.ads.impl.c00$a */
    public final class C4896a implements Sink {

        /* renamed from: a */
        private boolean f49048a;

        /* renamed from: b */
        @NotNull
        private final Buffer f49049b = new Buffer();

        /* renamed from: c */
        private boolean f49050c;

        public C4896a(boolean z) {
            this.f49048a = z;
        }

        /* renamed from: a */
        public final boolean m22990a() {
            return this.f49050c;
        }

        /* renamed from: b */
        public final boolean m22991b() {
            return this.f49048a;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            c00 c00Var = c00.this;
            if (t91.f54984f && Thread.holdsLock(c00Var)) {
                StringBuilder m26356a = l60.m26356a("Thread ");
                m26356a.append(Thread.currentThread().getName());
                m26356a.append(" MUST NOT hold lock on ");
                m26356a.append(c00Var);
                throw new AssertionError(m26356a.toString());
            }
            c00 c00Var2 = c00.this;
            synchronized (c00Var2) {
                if (this.f49050c) {
                    return;
                }
                boolean z = c00Var2.m22970d() == null;
                if (!c00.this.m22978k().f49048a) {
                    if (this.f49049b.f68742c > 0) {
                        while (this.f49049b.f68742c > 0) {
                            m22989a(true);
                        }
                    } else if (z) {
                        c00.this.m22968c().m29314a(c00.this.m22973f(), true, (Buffer) null, 0L);
                    }
                }
                synchronized (c00.this) {
                    this.f49050c = true;
                }
                c00.this.m22968c().flush();
                c00.this.m22959a();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            c00 c00Var = c00.this;
            if (t91.f54984f && Thread.holdsLock(c00Var)) {
                StringBuilder m26356a = l60.m26356a("Thread ");
                m26356a.append(Thread.currentThread().getName());
                m26356a.append(" MUST NOT hold lock on ");
                m26356a.append(c00Var);
                throw new AssertionError(m26356a.toString());
            }
            c00 c00Var2 = c00.this;
            synchronized (c00Var2) {
                c00Var2.m22965b();
            }
            while (this.f49049b.f68742c > 0) {
                m22989a(false);
                c00.this.m22968c().flush();
            }
        }

        @Override // okio.Sink
        @NotNull
        /* renamed from: timeout */
        public final Timeout getF68778c() {
            return c00.this.m22982o();
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j2) throws IOException {
            Intrinsics.m32179h(source, "source");
            c00 c00Var = c00.this;
            if (!t91.f54984f || !Thread.holdsLock(c00Var)) {
                this.f49049b.write(source, j2);
                while (this.f49049b.f68742c >= Http2Stream.EMIT_BUFFER_SIZE) {
                    m22989a(false);
                }
            } else {
                StringBuilder m26356a = l60.m26356a("Thread ");
                m26356a.append(Thread.currentThread().getName());
                m26356a.append(" MUST NOT hold lock on ");
                m26356a.append(c00Var);
                throw new AssertionError(m26356a.toString());
            }
        }

        /* renamed from: a */
        private final void m22989a(boolean z) throws IOException {
            long min;
            boolean z2;
            c00 c00Var = c00.this;
            synchronized (c00Var) {
                c00Var.m22982o().enter();
                while (c00Var.m22981n() >= c00Var.m22980m() && !this.f49048a && !this.f49050c && c00Var.m22970d() == null) {
                    try {
                        c00Var.m22987t();
                    } finally {
                        c00Var.m22982o().m22997a();
                    }
                }
                c00Var.m22982o().m22997a();
                c00Var.m22965b();
                min = Math.min(c00Var.m22980m() - c00Var.m22981n(), this.f49049b.f68742c);
                c00Var.m22971d(c00Var.m22981n() + min);
                z2 = z && min == this.f49049b.f68742c;
            }
            c00.this.m22982o().enter();
            try {
                c00.this.m22968c().m29314a(c00.this.m22973f(), z2, this.f49049b, min);
            } finally {
                c00Var = c00.this;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c00$b */
    public final class C4897b implements Source {

        /* renamed from: a */
        private final long f49052a;

        /* renamed from: b */
        private boolean f49053b;

        /* renamed from: c */
        @NotNull
        private final Buffer f49054c = new Buffer();

        /* renamed from: d */
        @NotNull
        private final Buffer f49055d = new Buffer();

        /* renamed from: e */
        private boolean f49056e;

        public C4897b(long j2, boolean z) {
            this.f49052a = j2;
            this.f49053b = z;
        }

        /* renamed from: a */
        public final boolean m22994a() {
            return this.f49056e;
        }

        /* renamed from: b */
        public final boolean m22995b() {
            return this.f49053b;
        }

        /* renamed from: c */
        public final void m22996c() {
            this.f49053b = true;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j2;
            c00 c00Var = c00.this;
            synchronized (c00Var) {
                this.f49056e = true;
                Buffer buffer = this.f49055d;
                j2 = buffer.f68742c;
                buffer.skip(j2);
                c00Var.notifyAll();
            }
            if (j2 > 0) {
                m22992a(j2);
            }
            c00.this.m22959a();
        }

        @Override // okio.Source
        public final long read(@NotNull Buffer sink, long j2) throws IOException {
            long j3;
            boolean z;
            long j4;
            Intrinsics.m32179h(sink, "sink");
            long j5 = 0;
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
            }
            while (true) {
                IOException iOException = null;
                c00 c00Var = c00.this;
                synchronized (c00Var) {
                    c00Var.m22976i().enter();
                    try {
                        if (c00Var.m22970d() != null && (iOException = c00Var.m22972e()) == null) {
                            EnumC5708rr m22970d = c00Var.m22970d();
                            Intrinsics.m32176e(m22970d);
                            iOException = new i41(m22970d);
                        }
                        if (this.f49056e) {
                            throw new IOException("stream closed");
                        }
                        Buffer buffer = this.f49055d;
                        long j6 = buffer.f68742c;
                        if (j6 > j5) {
                            j3 = buffer.read(sink, Math.min(j2, j6));
                            c00Var.m22969c(c00Var.m22975h() + j3);
                            long m22975h = c00Var.m22975h() - c00Var.m22974g();
                            if (iOException == null && m22975h >= c00Var.m22968c().m29328g().m28432b() / 2) {
                                c00Var.m22968c().m29310a(c00Var.m22973f(), m22975h);
                                c00Var.m22966b(c00Var.m22975h());
                            }
                        } else if (this.f49053b || iOException != null) {
                            j3 = -1;
                        } else {
                            c00Var.m22987t();
                            z = true;
                            j4 = -1;
                        }
                        j4 = j3;
                        z = false;
                    } finally {
                    }
                }
                if (!z) {
                    if (j4 != -1) {
                        m22992a(j4);
                        return j4;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j5 = 0;
            }
        }

        @Override // okio.Source
        @NotNull
        /* renamed from: timeout */
        public final Timeout getF68772c() {
            return c00.this.m22976i();
        }

        /* renamed from: a */
        private final void m22992a(long j2) {
            c00 c00Var = c00.this;
            if (!t91.f54984f || !Thread.holdsLock(c00Var)) {
                c00.this.m22968c().m29319b(j2);
                return;
            }
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(c00Var);
            throw new AssertionError(m26356a.toString());
        }

        /* renamed from: a */
        public final void m22993a(@NotNull BufferedSource source, long j2) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j3;
            Intrinsics.m32179h(source, "source");
            c00 c00Var = c00.this;
            if (t91.f54984f && Thread.holdsLock(c00Var)) {
                StringBuilder m26356a = l60.m26356a("Thread ");
                m26356a.append(Thread.currentThread().getName());
                m26356a.append(" MUST NOT hold lock on ");
                m26356a.append(c00Var);
                throw new AssertionError(m26356a.toString());
            }
            while (j2 > 0) {
                synchronized (c00.this) {
                    z = this.f49053b;
                    z2 = true;
                    z3 = this.f49055d.f68742c + j2 > this.f49052a;
                }
                if (z3) {
                    source.skip(j2);
                    c00.this.m22962a(EnumC5708rr.f54404e);
                    return;
                }
                if (z) {
                    source.skip(j2);
                    return;
                }
                long read = source.read(this.f49054c, j2);
                if (read != -1) {
                    j2 -= read;
                    c00 c00Var2 = c00.this;
                    synchronized (c00Var2) {
                        if (this.f49056e) {
                            Buffer buffer = this.f49054c;
                            j3 = buffer.f68742c;
                            buffer.skip(j3);
                        } else {
                            Buffer buffer2 = this.f49055d;
                            if (buffer2.f68742c != 0) {
                                z2 = false;
                            }
                            buffer2.mo34569z0(this.f49054c);
                            if (z2) {
                                c00Var2.notifyAll();
                            }
                            j3 = 0;
                        }
                    }
                    if (j3 > 0) {
                        m22992a(j3);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c00$c */
    public final class C4898c extends AsyncTimeout {
        public C4898c() {
        }

        /* renamed from: a */
        public final void m22997a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        @NotNull
        public final IOException newTimeoutException(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public final void timedOut() {
            c00.this.m22962a(EnumC5708rr.f54406g);
            c00.this.m22968c().m29333l();
        }
    }

    public c00(int i2, @NotNull C5947vz connection, boolean z, boolean z2, @Nullable C5204hy c5204hy) {
        Intrinsics.m32179h(connection, "connection");
        this.f49034a = i2;
        this.f49035b = connection;
        this.f49039f = connection.m29329h().m28432b();
        ArrayDeque<C5204hy> arrayDeque = new ArrayDeque<>();
        this.f49040g = arrayDeque;
        this.f49042i = new C4897b(connection.m29328g().m28432b(), z2);
        this.f49043j = new C4896a(z);
        this.f49044k = new C4898c();
        this.f49045l = new C4898c();
        if (c5204hy == null) {
            if (!m22983p()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!m22983p())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c5204hy);
        }
    }

    /* renamed from: a */
    public final void m22963a(@NotNull EnumC5708rr rstStatusCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.m32179h(rstStatusCode, "rstStatusCode");
        if (m22958b(rstStatusCode, iOException)) {
            this.f49035b.m29318b(this.f49034a, rstStatusCode);
        }
    }

    /* renamed from: b */
    public final void m22966b(long j2) {
        this.f49037d = j2;
    }

    @NotNull
    /* renamed from: c */
    public final C5947vz m22968c() {
        return this.f49035b;
    }

    /* renamed from: d */
    public final void m22971d(long j2) {
        this.f49038e = j2;
    }

    @Nullable
    /* renamed from: e */
    public final IOException m22972e() {
        return this.f49047n;
    }

    /* renamed from: f */
    public final int m22973f() {
        return this.f49034a;
    }

    /* renamed from: g */
    public final long m22974g() {
        return this.f49037d;
    }

    /* renamed from: h */
    public final long m22975h() {
        return this.f49036c;
    }

    @NotNull
    /* renamed from: i */
    public final C4898c m22976i() {
        return this.f49044k;
    }

    @NotNull
    /* renamed from: j */
    public final C4896a m22977j() {
        synchronized (this) {
            if (!(this.f49041h || m22983p())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f49043j;
    }

    @NotNull
    /* renamed from: k */
    public final C4896a m22978k() {
        return this.f49043j;
    }

    @NotNull
    /* renamed from: l */
    public final C4897b m22979l() {
        return this.f49042i;
    }

    /* renamed from: m */
    public final long m22980m() {
        return this.f49039f;
    }

    /* renamed from: n */
    public final long m22981n() {
        return this.f49038e;
    }

    @NotNull
    /* renamed from: o */
    public final C4898c m22982o() {
        return this.f49045l;
    }

    /* renamed from: p */
    public final boolean m22983p() {
        return this.f49035b.m29320b() == ((this.f49034a & 1) == 1);
    }

    /* renamed from: q */
    public final synchronized boolean m22984q() {
        if (this.f49046m != null) {
            return false;
        }
        if ((this.f49042i.m22995b() || this.f49042i.m22994a()) && (this.f49043j.m22991b() || this.f49043j.m22990a())) {
            if (this.f49041h) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: r */
    public final C4898c m22985r() {
        return this.f49044k;
    }

    @NotNull
    /* renamed from: s */
    public final synchronized C5204hy m22986s() throws IOException {
        C5204hy removeFirst;
        this.f49044k.enter();
        while (this.f49040g.isEmpty() && this.f49046m == null) {
            try {
                m22987t();
            } catch (Throwable th) {
                this.f49044k.m22997a();
                throw th;
            }
        }
        this.f49044k.m22997a();
        if (!(!this.f49040g.isEmpty())) {
            IOException iOException = this.f49047n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC5708rr enumC5708rr = this.f49046m;
            Intrinsics.m32176e(enumC5708rr);
            throw new i41(enumC5708rr);
        }
        removeFirst = this.f49040g.removeFirst();
        Intrinsics.m32178g(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    /* renamed from: t */
    public final void m22987t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @NotNull
    /* renamed from: u */
    public final C4898c m22988u() {
        return this.f49045l;
    }

    /* renamed from: b */
    public final synchronized void m22967b(@NotNull EnumC5708rr errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        if (this.f49046m == null) {
            this.f49046m = errorCode;
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void m22969c(long j2) {
        this.f49036c = j2;
    }

    @Nullable
    /* renamed from: d */
    public final synchronized EnumC5708rr m22970d() {
        return this.f49046m;
    }

    /* renamed from: a */
    public final void m22962a(@NotNull EnumC5708rr errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        if (m22958b(errorCode, null)) {
            this.f49035b.m29323c(this.f49034a, errorCode);
        }
    }

    /* renamed from: a */
    public final void m22960a(long j2) {
        this.f49039f += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void m22965b() throws IOException {
        if (!this.f49043j.m22990a()) {
            if (!this.f49043j.m22991b()) {
                if (this.f49046m != null) {
                    IOException iOException = this.f49047n;
                    if (iOException != null) {
                        throw iOException;
                    }
                    EnumC5708rr enumC5708rr = this.f49046m;
                    Intrinsics.m32176e(enumC5708rr);
                    throw new i41(enumC5708rr);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: a */
    public final void m22964a(@NotNull BufferedSource source, int i2) throws IOException {
        Intrinsics.m32179h(source, "source");
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        this.f49042i.m22993a(source, i2);
    }

    /* renamed from: b */
    private final boolean m22958b(EnumC5708rr enumC5708rr, IOException iOException) {
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        synchronized (this) {
            if (this.f49046m != null) {
                return false;
            }
            if (this.f49042i.m22995b() && this.f49043j.m22991b()) {
                return false;
            }
            this.f49046m = enumC5708rr;
            this.f49047n = iOException;
            notifyAll();
            this.f49035b.m29321c(this.f49034a);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:10:0x0034, B:14:0x003b, B:16:0x004b, B:17:0x0050, B:24:0x0041), top: B:9:0x0034 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22961a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C5204hy r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r0)
            boolean r0 = com.yandex.mobile.ads.impl.t91.f54984f
            if (r0 == 0) goto L33
            boolean r0 = java.lang.Thread.holdsLock(r1)
            if (r0 != 0) goto L10
            goto L33
        L10:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Thread "
            java.lang.StringBuilder r3 = com.yandex.mobile.ads.impl.l60.m26356a(r3)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L33:
            monitor-enter(r1)
            boolean r0 = r1.f49041h     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L41
            if (r3 != 0) goto L3b
            goto L41
        L3b:
            com.yandex.mobile.ads.impl.c00$b r2 = r1.f49042i     // Catch: java.lang.Throwable -> L62
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L62
            goto L49
        L41:
            r0 = 1
            r1.f49041h = r0     // Catch: java.lang.Throwable -> L62
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.hy> r0 = r1.f49040g     // Catch: java.lang.Throwable -> L62
            r0.add(r2)     // Catch: java.lang.Throwable -> L62
        L49:
            if (r3 == 0) goto L50
            com.yandex.mobile.ads.impl.c00$b r2 = r1.f49042i     // Catch: java.lang.Throwable -> L62
            r2.m22996c()     // Catch: java.lang.Throwable -> L62
        L50:
            boolean r2 = r1.m22984q()     // Catch: java.lang.Throwable -> L62
            r1.notifyAll()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)
            if (r2 != 0) goto L61
            com.yandex.mobile.ads.impl.vz r2 = r1.f49035b
            int r3 = r1.f49034a
            r2.m29321c(r3)
        L61:
            return
        L62:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c00.m22961a(com.yandex.mobile.ads.impl.hy, boolean):void");
    }

    /* renamed from: a */
    public final void m22959a() throws IOException {
        boolean z;
        boolean m22984q;
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        synchronized (this) {
            z = !this.f49042i.m22995b() && this.f49042i.m22994a() && (this.f49043j.m22991b() || this.f49043j.m22990a());
            m22984q = m22984q();
        }
        if (z) {
            m22963a(EnumC5708rr.f54406g, (IOException) null);
        } else {
            if (m22984q) {
                return;
            }
            this.f49035b.m29321c(this.f49034a);
        }
    }
}
