package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rw0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xr */
/* loaded from: classes3.dex */
public final class C6037xr {

    /* renamed from: a */
    @NotNull
    private final ju0 f56528a;

    /* renamed from: b */
    @NotNull
    private final AbstractC5814tr f56529b;

    /* renamed from: c */
    @NotNull
    private final C6137zr f56530c;

    /* renamed from: d */
    @NotNull
    private final InterfaceC6089yr f56531d;

    /* renamed from: e */
    private boolean f56532e;

    /* renamed from: f */
    @NotNull
    private final ku0 f56533f;

    /* renamed from: com.yandex.mobile.ads.impl.xr$a */
    public final class a extends ForwardingSink {

        /* renamed from: a */
        private final long f56534a;

        /* renamed from: b */
        private boolean f56535b;

        /* renamed from: c */
        private long f56536c;

        /* renamed from: d */
        private boolean f56537d;

        /* renamed from: e */
        public final /* synthetic */ C6037xr f56538e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6037xr c6037xr, @NotNull Sink delegate, long j2) {
            super(delegate);
            Intrinsics.m32179h(delegate, "delegate");
            this.f56538e = c6037xr;
            this.f56534a = j2;
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f56537d) {
                return;
            }
            this.f56537d = true;
            long j2 = this.f56534a;
            if (j2 != -1 && this.f56536c != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.f56535b) {
                    return;
                }
                this.f56535b = true;
                this.f56538e.m29785a(this.f56536c, false, true, null);
            } catch (IOException e2) {
                if (this.f56535b) {
                    throw e2;
                }
                this.f56535b = true;
                throw this.f56538e.m29785a(this.f56536c, false, true, e2);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                if (this.f56535b) {
                    throw e2;
                }
                this.f56535b = true;
                throw this.f56538e.m29785a(this.f56536c, false, true, e2);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void write(@NotNull Buffer source, long j2) throws IOException {
            Intrinsics.m32179h(source, "source");
            if (!(!this.f56537d)) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.f56534a;
            if (j3 != -1 && this.f56536c + j2 > j3) {
                StringBuilder m26356a = l60.m26356a("expected ");
                m26356a.append(this.f56534a);
                m26356a.append(" bytes but received ");
                m26356a.append(this.f56536c + j2);
                throw new ProtocolException(m26356a.toString());
            }
            try {
                super.write(source, j2);
                this.f56536c += j2;
            } catch (IOException e2) {
                if (this.f56535b) {
                    throw e2;
                }
                this.f56535b = true;
                throw this.f56538e.m29785a(this.f56536c, false, true, e2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xr$b */
    public final class b extends ForwardingSource {

        /* renamed from: a */
        private final long f56539a;

        /* renamed from: b */
        private long f56540b;

        /* renamed from: c */
        private boolean f56541c;

        /* renamed from: d */
        private boolean f56542d;

        /* renamed from: e */
        private boolean f56543e;

        /* renamed from: f */
        public final /* synthetic */ C6037xr f56544f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6037xr c6037xr, @NotNull Source delegate, long j2) {
            super(delegate);
            Intrinsics.m32179h(delegate, "delegate");
            this.f56544f = c6037xr;
            this.f56539a = j2;
            this.f56541c = true;
            if (j2 == 0) {
                m29802a(null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E m29802a(E e2) {
            if (this.f56542d) {
                return e2;
            }
            this.f56542d = true;
            if (e2 == null && this.f56541c) {
                this.f56541c = false;
                AbstractC5814tr m29795g = this.f56544f.m29795g();
                ju0 m29793e = this.f56544f.m29793e();
                Objects.requireNonNull(m29795g);
                AbstractC5814tr.m28723e(m29793e);
            }
            return (E) this.f56544f.m29785a(this.f56540b, true, false, e2);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f56543e) {
                return;
            }
            this.f56543e = true;
            try {
                super.close();
                m29802a(null);
            } catch (IOException e2) {
                throw m29802a(e2);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(@NotNull Buffer sink, long j2) throws IOException {
            Intrinsics.m32179h(sink, "sink");
            if (!(!this.f56543e)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long read = delegate().read(sink, j2);
                if (this.f56541c) {
                    this.f56541c = false;
                    AbstractC5814tr m29795g = this.f56544f.m29795g();
                    ju0 m29793e = this.f56544f.m29793e();
                    Objects.requireNonNull(m29795g);
                    AbstractC5814tr.m28723e(m29793e);
                }
                if (read == -1) {
                    m29802a(null);
                    return -1L;
                }
                long j3 = this.f56540b + read;
                long j4 = this.f56539a;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f56539a + " bytes but received " + j3);
                }
                this.f56540b = j3;
                if (j3 == j4) {
                    m29802a(null);
                }
                return read;
            } catch (IOException e2) {
                throw m29802a(e2);
            }
        }
    }

    public C6037xr(@NotNull ju0 call, @NotNull AbstractC5814tr eventListener, @NotNull C6137zr finder, @NotNull InterfaceC6089yr codec) {
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(eventListener, "eventListener");
        Intrinsics.m32179h(finder, "finder");
        Intrinsics.m32179h(codec, "codec");
        this.f56528a = call;
        this.f56529b = eventListener;
        this.f56530c = finder;
        this.f56531d = codec;
        this.f56533f = codec.mo22354c();
    }

    @NotNull
    /* renamed from: a */
    public final Sink m29786a(@NotNull aw0 request) throws IOException {
        Intrinsics.m32179h(request, "request");
        this.f56532e = false;
        dw0 m22632a = request.m22632a();
        Intrinsics.m32176e(m22632a);
        long mo23537a = m22632a.mo23537a();
        AbstractC5814tr abstractC5814tr = this.f56529b;
        ju0 ju0Var = this.f56528a;
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28714b(ju0Var);
        return new a(this, this.f56531d.mo22348a(request, mo23537a), mo23537a);
    }

    /* renamed from: b */
    public final void m29789b(@NotNull aw0 request) throws IOException {
        Intrinsics.m32179h(request, "request");
        try {
            AbstractC5814tr abstractC5814tr = this.f56529b;
            ju0 ju0Var = this.f56528a;
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28719c(ju0Var);
            this.f56531d.mo22351a(request);
            AbstractC5814tr abstractC5814tr2 = this.f56529b;
            ju0 ju0Var2 = this.f56528a;
            Objects.requireNonNull(abstractC5814tr2);
            AbstractC5814tr.m28700a(ju0Var2, request);
        } catch (IOException e2) {
            AbstractC5814tr abstractC5814tr3 = this.f56529b;
            ju0 ju0Var3 = this.f56528a;
            Objects.requireNonNull(abstractC5814tr3);
            AbstractC5814tr.m28703a(ju0Var3, e2);
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
            throw e2;
        }
    }

    /* renamed from: c */
    public final void m29791c() throws IOException {
        try {
            this.f56531d.mo22350a();
        } catch (IOException e2) {
            AbstractC5814tr abstractC5814tr = this.f56529b;
            ju0 ju0Var = this.f56528a;
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28703a(ju0Var, e2);
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
            throw e2;
        }
    }

    /* renamed from: d */
    public final void m29792d() throws IOException {
        try {
            this.f56531d.mo22353b();
        } catch (IOException e2) {
            AbstractC5814tr abstractC5814tr = this.f56529b;
            ju0 ju0Var = this.f56528a;
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28703a(ju0Var, e2);
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
            throw e2;
        }
    }

    @NotNull
    /* renamed from: e */
    public final ju0 m29793e() {
        return this.f56528a;
    }

    @NotNull
    /* renamed from: f */
    public final ku0 m29794f() {
        return this.f56533f;
    }

    @NotNull
    /* renamed from: g */
    public final AbstractC5814tr m29795g() {
        return this.f56529b;
    }

    @NotNull
    /* renamed from: h */
    public final C6137zr m29796h() {
        return this.f56530c;
    }

    /* renamed from: i */
    public final boolean m29797i() {
        return !Intrinsics.m32174c(this.f56530c.m30286a().m29677k().m28392g(), this.f56533f.m26280k().m23960a().m29677k().m28392g());
    }

    /* renamed from: j */
    public final boolean m29798j() {
        return this.f56532e;
    }

    /* renamed from: k */
    public final void m29799k() {
        this.f56531d.mo22354c().m26279j();
    }

    /* renamed from: l */
    public final void m29800l() {
        this.f56528a.m25958a(this, true, false, null);
    }

    /* renamed from: m */
    public final void m29801m() {
        AbstractC5814tr abstractC5814tr = this.f56529b;
        ju0 ju0Var = this.f56528a;
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28724f(ju0Var);
    }

    @Nullable
    /* renamed from: a */
    public final rw0.C5716a m29784a(boolean z) throws IOException {
        try {
            rw0.C5716a mo22347a = this.f56531d.mo22347a(z);
            if (mo22347a != null) {
                mo22347a.m28020a(this);
            }
            return mo22347a;
        } catch (IOException e2) {
            AbstractC5814tr abstractC5814tr = this.f56529b;
            ju0 ju0Var = this.f56528a;
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28715b(ju0Var, e2);
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
            throw e2;
        }
    }

    /* renamed from: b */
    public final void m29790b(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        AbstractC5814tr abstractC5814tr = this.f56529b;
        ju0 ju0Var = this.f56528a;
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28702a(ju0Var, response);
    }

    /* renamed from: b */
    public final void m29788b() {
        this.f56531d.cancel();
        this.f56528a.m25958a(this, true, true, null);
    }

    @NotNull
    /* renamed from: a */
    public final qu0 m29783a(@NotNull rw0 response) throws IOException {
        Intrinsics.m32179h(response, "response");
        try {
            String m27992a = rw0.m27992a(response, "Content-Type");
            long mo22352b = this.f56531d.mo22352b(response);
            return new qu0(m27992a, mo22352b, Okio.m34602d(new b(this, this.f56531d.mo22349a(response), mo22352b)));
        } catch (IOException e2) {
            AbstractC5814tr abstractC5814tr = this.f56529b;
            ju0 ju0Var = this.f56528a;
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28715b(ju0Var, e2);
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m29787a() {
        this.f56531d.cancel();
    }

    /* renamed from: a */
    public final <E extends IOException> E m29785a(long j2, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            this.f56530c.m30288a(e2);
            this.f56531d.mo22354c().m26267a(this.f56528a, e2);
        }
        if (z2) {
            if (e2 != null) {
                AbstractC5814tr abstractC5814tr = this.f56529b;
                ju0 ju0Var = this.f56528a;
                Objects.requireNonNull(abstractC5814tr);
                AbstractC5814tr.m28703a(ju0Var, (IOException) e2);
            } else {
                AbstractC5814tr abstractC5814tr2 = this.f56529b;
                ju0 ju0Var2 = this.f56528a;
                Objects.requireNonNull(abstractC5814tr2);
                AbstractC5814tr.m28699a(ju0Var2);
            }
        }
        if (z) {
            if (e2 != null) {
                AbstractC5814tr abstractC5814tr3 = this.f56529b;
                ju0 ju0Var3 = this.f56528a;
                Objects.requireNonNull(abstractC5814tr3);
                AbstractC5814tr.m28715b(ju0Var3, e2);
            } else {
                AbstractC5814tr abstractC5814tr4 = this.f56529b;
                ju0 ju0Var4 = this.f56528a;
                Objects.requireNonNull(abstractC5814tr4);
                AbstractC5814tr.m28722d(ju0Var4);
            }
        }
        return (E) this.f56528a.m25958a(this, z2, z, e2);
    }
}
