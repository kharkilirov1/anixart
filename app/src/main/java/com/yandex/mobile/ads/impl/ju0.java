package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ju0 implements InterfaceC5537og {

    /* renamed from: a */
    @NotNull
    private final mn0 f51729a;

    /* renamed from: b */
    @NotNull
    private final aw0 f51730b;

    /* renamed from: c */
    private final boolean f51731c;

    /* renamed from: d */
    @NotNull
    private final ou0 f51732d;

    /* renamed from: e */
    @NotNull
    private final AbstractC5814tr f51733e;

    /* renamed from: f */
    @NotNull
    private final C5305c f51734f;

    /* renamed from: g */
    @NotNull
    private final AtomicBoolean f51735g;

    /* renamed from: h */
    @Nullable
    private Object f51736h;

    /* renamed from: i */
    @Nullable
    private C6137zr f51737i;

    /* renamed from: j */
    @Nullable
    private ku0 f51738j;

    /* renamed from: k */
    private boolean f51739k;

    /* renamed from: l */
    @Nullable
    private C6037xr f51740l;

    /* renamed from: m */
    private boolean f51741m;

    /* renamed from: n */
    private boolean f51742n;

    /* renamed from: o */
    private boolean f51743o;

    /* renamed from: p */
    private volatile boolean f51744p;

    /* renamed from: q */
    @Nullable
    private volatile C6037xr f51745q;

    /* renamed from: r */
    @Nullable
    private volatile ku0 f51746r;

    /* renamed from: com.yandex.mobile.ads.impl.ju0$a */
    public final class RunnableC5303a implements Runnable {

        /* renamed from: b */
        @NotNull
        private final InterfaceC5971wg f51747b;

        /* renamed from: c */
        @NotNull
        private volatile AtomicInteger f51748c;

        /* renamed from: d */
        public final /* synthetic */ ju0 f51749d;

        public RunnableC5303a(ju0 ju0Var, @NotNull InterfaceC5971wg responseCallback) {
            Intrinsics.m32179h(responseCallback, "responseCallback");
            this.f51749d = ju0Var;
            this.f51747b = responseCallback;
            this.f51748c = new AtomicInteger(0);
        }

        /* renamed from: a */
        public final void m25980a(@NotNull RunnableC5303a other) {
            Intrinsics.m32179h(other, "other");
            this.f51748c = other.f51748c;
        }

        @NotNull
        /* renamed from: b */
        public final AtomicInteger m25982b() {
            return this.f51748c;
        }

        @NotNull
        /* renamed from: c */
        public final String m25983c() {
            return this.f51749d.m25972h().m22640h().m28392g();
        }

        @Override // java.lang.Runnable
        public final void run() {
            mn0 m25967c;
            StringBuilder m26356a = l60.m26356a("OkHttp ");
            m26356a.append(this.f51749d.m25975k());
            String sb = m26356a.toString();
            ju0 ju0Var = this.f51749d;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(sb);
            try {
                ju0Var.f51734f.enter();
                boolean z = false;
                try {
                    try {
                    } catch (Throwable th) {
                        ju0Var.m25967c().m26706i().m22909b(this);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.f51747b.mo27352a(ju0Var.m25973i());
                    m25967c = ju0Var.m25967c();
                } catch (IOException e3) {
                    e = e3;
                    z = true;
                    if (z) {
                        int i2 = eq0.f50037c;
                        eq0 m24241b = eq0.C5041a.m24241b();
                        String str = "Callback failure for " + ju0.m25956b(ju0Var);
                        Objects.requireNonNull(m24241b);
                        eq0.m24229a(4, str, e);
                    } else {
                        this.f51747b.mo27353a(e);
                    }
                    m25967c = ju0Var.m25967c();
                    m25967c.m26706i().m22909b(this);
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    ju0Var.m25959a();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        ExceptionsKt.m31878a(iOException, th);
                        this.f51747b.mo27353a(iOException);
                    }
                    throw th;
                }
                m25967c.m26706i().m22909b(this);
            } finally {
                currentThread.setName(name);
            }
        }

        @NotNull
        /* renamed from: a */
        public final ju0 m25979a() {
            return this.f51749d;
        }

        /* renamed from: a */
        public final void m25981a(@NotNull ThreadPoolExecutor executorService) {
            Intrinsics.m32179h(executorService, "executorService");
            C4879bp m26706i = this.f51749d.m25967c().m26706i();
            if (t91.f54984f && Thread.holdsLock(m26706i)) {
                StringBuilder m26356a = l60.m26356a("Thread ");
                m26356a.append(Thread.currentThread().getName());
                m26356a.append(" MUST NOT hold lock on ");
                m26356a.append(m26706i);
                throw new AssertionError(m26356a.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.f51749d.m25965b(interruptedIOException);
                    this.f51747b.mo27353a(interruptedIOException);
                    this.f51749d.m25967c().m26706i().m22909b(this);
                }
            } catch (Throwable th) {
                this.f51749d.m25967c().m26706i().m22909b(this);
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ju0$b */
    public static final class C5304b extends WeakReference<ju0> {

        /* renamed from: a */
        @Nullable
        private final Object f51750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5304b(@NotNull ju0 referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.m32179h(referent, "referent");
            this.f51750a = obj;
        }

        @Nullable
        /* renamed from: a */
        public final Object m25984a() {
            return this.f51750a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ju0$c */
    public static final class C5305c extends AsyncTimeout {
        public C5305c() {
        }

        @Override // okio.AsyncTimeout
        public final void timedOut() {
            ju0.this.m25959a();
        }
    }

    public ju0(@NotNull mn0 client, @NotNull aw0 originalRequest, boolean z) {
        Intrinsics.m32179h(client, "client");
        Intrinsics.m32179h(originalRequest, "originalRequest");
        this.f51729a = client;
        this.f51730b = originalRequest;
        this.f51731c = z;
        this.f51732d = client.m26703f().m24611a();
        this.f51733e = client.m26708k().mo24216a(this);
        C5305c c5305c = new C5305c();
        c5305c.timeout(0, TimeUnit.MILLISECONDS);
        this.f51734f = c5305c;
        this.f51735g = new AtomicBoolean();
        this.f51743o = true;
    }

    /* renamed from: b */
    public final void m25966b(@Nullable ku0 ku0Var) {
        this.f51746r = ku0Var;
    }

    @NotNull
    /* renamed from: c */
    public final mn0 m25967c() {
        return this.f51729a;
    }

    public final Object clone() {
        return new ju0(this.f51729a, this.f51730b, this.f51731c);
    }

    @Nullable
    /* renamed from: d */
    public final ku0 m25968d() {
        return this.f51738j;
    }

    @NotNull
    /* renamed from: e */
    public final AbstractC5814tr m25969e() {
        return this.f51733e;
    }

    /* renamed from: f */
    public final boolean m25970f() {
        return this.f51731c;
    }

    @Nullable
    /* renamed from: g */
    public final C6037xr m25971g() {
        return this.f51740l;
    }

    @NotNull
    /* renamed from: h */
    public final aw0 m25972h() {
        return this.f51730b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.rw0 m25973i() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.yandex.mobile.ads.impl.mn0 r0 = r10.f51729a
            java.util.List r0 = r0.m26713p()
            kotlin.collections.CollectionsKt.m32020g(r2, r0)
            com.yandex.mobile.ads.impl.fx0 r0 = new com.yandex.mobile.ads.impl.fx0
            com.yandex.mobile.ads.impl.mn0 r1 = r10.f51729a
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.jf r0 = new com.yandex.mobile.ads.impl.jf
            com.yandex.mobile.ads.impl.mn0 r1 = r10.f51729a
            com.yandex.mobile.ads.impl.bl r1 = r1.m26705h()
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.hg r0 = new com.yandex.mobile.ads.impl.hg
            com.yandex.mobile.ads.impl.mn0 r1 = r10.f51729a
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            com.yandex.mobile.ads.impl.ek r0 = com.yandex.mobile.ads.impl.C5030ek.f49985a
            r2.add(r0)
            boolean r0 = r10.f51731c
            if (r0 != 0) goto L45
            com.yandex.mobile.ads.impl.mn0 r0 = r10.f51729a
            java.util.List r0 = r0.m26714q()
            kotlin.collections.CollectionsKt.m32020g(r2, r0)
        L45:
            com.yandex.mobile.ads.impl.pg r0 = new com.yandex.mobile.ads.impl.pg
            boolean r1 = r10.f51731c
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.pu0 r9 = new com.yandex.mobile.ads.impl.pu0
            com.yandex.mobile.ads.impl.aw0 r5 = r10.f51730b
            com.yandex.mobile.ads.impl.mn0 r0 = r10.f51729a
            int r6 = r0.m26702e()
            com.yandex.mobile.ads.impl.mn0 r0 = r10.f51729a
            int r7 = r0.m26718u()
            com.yandex.mobile.ads.impl.mn0 r0 = r10.f51729a
            int r8 = r0.m26722z()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            com.yandex.mobile.ads.impl.aw0 r2 = r10.f51730b     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            com.yandex.mobile.ads.impl.rw0 r2 = r9.m27497a(r2)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            boolean r3 = r10.f51744p     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            if (r3 != 0) goto L7c
            r10.m25965b(r1)
            return r2
        L7c:
            com.yandex.mobile.ads.impl.t91.m28509a(r2)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            throw r2     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
        L87:
            r2 = move-exception
            goto L98
        L89:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.m25965b(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.m32177f(r0, r3)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L98:
            if (r0 != 0) goto L9d
            r10.m25965b(r1)
        L9d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ju0.m25973i():com.yandex.mobile.ads.impl.rw0");
    }

    /* renamed from: j */
    public final boolean m25974j() {
        return this.f51744p;
    }

    @NotNull
    /* renamed from: k */
    public final String m25975k() {
        return this.f51730b.m22640h().m28396k();
    }

    @Nullable
    /* renamed from: l */
    public final Socket m25976l() {
        ku0 ku0Var = this.f51738j;
        Intrinsics.m32176e(ku0Var);
        if (t91.f54984f && !Thread.holdsLock(ku0Var)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(ku0Var);
            throw new AssertionError(m26356a.toString());
        }
        ArrayList m26271b = ku0Var.m26271b();
        Iterator it = m26271b.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.m32174c(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (!(i2 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        m26271b.remove(i2);
        this.f51738j = null;
        if (m26271b.isEmpty()) {
            ku0Var.m26265a(System.nanoTime());
            if (this.f51732d.m27114a(ku0Var)) {
                return ku0Var.m26282m();
            }
        }
        return null;
    }

    /* renamed from: m */
    public final boolean m25977m() {
        C6137zr c6137zr = this.f51737i;
        Intrinsics.m32176e(c6137zr);
        return c6137zr.m30290b();
    }

    /* renamed from: n */
    public final void m25978n() {
        if (!(!this.f51739k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f51739k = true;
        this.f51734f.exit();
    }

    /* renamed from: a */
    public final void m25959a() {
        if (this.f51744p) {
            return;
        }
        this.f51744p = true;
        C6037xr c6037xr = this.f51745q;
        if (c6037xr != null) {
            c6037xr.m29787a();
        }
        ku0 ku0Var = this.f51746r;
        if (ku0Var != null) {
            ku0Var.m26263a();
        }
        Objects.requireNonNull(this.f51733e);
        AbstractC5814tr.m28720c((InterfaceC5537og) this);
    }

    @NotNull
    /* renamed from: b */
    public final rw0 m25964b() {
        if (!this.f51735g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f51734f.enter();
        this.f51736h = eq0.f50035a.mo24238b();
        Objects.requireNonNull(this.f51733e);
        AbstractC5814tr.m28717b((InterfaceC5537og) this);
        try {
            this.f51729a.m26706i().m22908a(this);
            return m25973i();
        } finally {
            this.f51729a.m26706i().m22910b(this);
        }
    }

    /* renamed from: a */
    public final void m25962a(@NotNull InterfaceC5971wg responseCallback) {
        Intrinsics.m32179h(responseCallback, "responseCallback");
        if (this.f51735g.compareAndSet(false, true)) {
            this.f51736h = eq0.f50035a.mo24238b();
            Objects.requireNonNull(this.f51733e);
            AbstractC5814tr.m28717b((InterfaceC5537og) this);
            this.f51729a.m26706i().m22907a(new RunnableC5303a(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Nullable
    /* renamed from: b */
    public final IOException m25965b(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f51743o) {
                this.f51743o = false;
                if (!this.f51741m) {
                    if (!this.f51742n) {
                        z = true;
                    }
                }
            }
        }
        return z ? m25955a((ju0) iOException) : iOException;
    }

    /* renamed from: a */
    public final void m25960a(@NotNull aw0 request, boolean z) {
        SSLSocketFactory sSLSocketFactory;
        ln0 ln0Var;
        C5079fh c5079fh;
        Intrinsics.m32179h(request, "request");
        if (this.f51740l == null) {
            synchronized (this) {
                if (!this.f51742n) {
                    if (!(!this.f51741m)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z) {
                ou0 ou0Var = this.f51732d;
                t00 m22640h = request.m22640h();
                if (m22640h.m28393h()) {
                    SSLSocketFactory m26721x = this.f51729a.m26721x();
                    ln0Var = this.f51729a.m26712o();
                    sSLSocketFactory = m26721x;
                    c5079fh = this.f51729a.m26701d();
                } else {
                    sSLSocketFactory = null;
                    ln0Var = null;
                    c5079fh = null;
                }
                String m28392g = m22640h.m28392g();
                int m28394i = m22640h.m28394i();
                InterfaceC5088fq m26707j = this.f51729a.m26707j();
                SocketFactory m26720w = this.f51729a.m26720w();
                InterfaceC4803ac m26716s = this.f51729a.m26716s();
                Objects.requireNonNull(this.f51729a);
                this.f51737i = new C6137zr(ou0Var, new C6008x6(m28392g, m28394i, m26707j, m26720w, sSLSocketFactory, ln0Var, c5079fh, m26716s, this.f51729a.m26715r(), this.f51729a.m26704g(), this.f51729a.m26717t()), this, this.f51733e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public static final String m25956b(ju0 ju0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(ju0Var.f51744p ? "canceled " : "");
        sb.append(ju0Var.f51731c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(ju0Var.m25975k());
        return sb.toString();
    }

    @NotNull
    /* renamed from: a */
    public final C6037xr m25957a(@NotNull pu0 chain) {
        Intrinsics.m32179h(chain, "chain");
        synchronized (this) {
            if (this.f51743o) {
                if (!this.f51742n) {
                    if (!(!this.f51741m)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        C6137zr c6137zr = this.f51737i;
        Intrinsics.m32176e(c6137zr);
        C6037xr c6037xr = new C6037xr(this, this.f51733e, c6137zr, c6137zr.m30287a(this.f51729a, chain));
        this.f51740l = c6037xr;
        this.f51745q = c6037xr;
        synchronized (this) {
            this.f51741m = true;
            this.f51742n = true;
        }
        if (this.f51744p) {
            throw new IOException("Canceled");
        }
        return c6037xr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E m25958a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C6037xr r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r0)
            com.yandex.mobile.ads.impl.xr r0 = r1.f51745q
            boolean r2 = kotlin.jvm.internal.Intrinsics.m32174c(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.f51741m     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L41
        L19:
            if (r4 == 0) goto L43
            boolean r0 = r1.f51742n     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L43
        L1f:
            if (r3 == 0) goto L23
            r1.f51741m = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f51742n = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.f51741m     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f51742n     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f51742n     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f51743o     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = 1
        L3e:
            r3 = r2
            r2 = r0
            goto L44
        L41:
            monitor-exit(r1)
            throw r2
        L43:
            r3 = 0
        L44:
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.f51745q = r2
            com.yandex.mobile.ads.impl.ku0 r2 = r1.f51738j
            if (r2 == 0) goto L51
            r2.m26276g()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.m25955a(r5)
            return r2
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ju0.m25958a(com.yandex.mobile.ads.impl.xr, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public final void m25963a(boolean z) {
        C6037xr c6037xr;
        synchronized (this) {
            if (!this.f51743o) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c6037xr = this.f51745q) != null) {
            c6037xr.m29788b();
        }
        this.f51740l = null;
    }

    /* renamed from: a */
    public final void m25961a(@NotNull ku0 connection) {
        Intrinsics.m32179h(connection, "connection");
        if (t91.f54984f && !Thread.holdsLock(connection)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST hold lock on ");
            m26356a.append(connection);
            throw new AssertionError(m26356a.toString());
        }
        if (this.f51738j == null) {
            this.f51738j = connection;
            connection.m26271b().add(new C5304b(this, this.f51736h));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final <E extends IOException> E m25955a(E e2) {
        E e3;
        Socket m25976l;
        boolean z = t91.f54984f;
        if (z && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        ku0 ku0Var = this.f51738j;
        if (ku0Var != null) {
            if (z && Thread.holdsLock(ku0Var)) {
                StringBuilder m26356a2 = l60.m26356a("Thread ");
                m26356a2.append(Thread.currentThread().getName());
                m26356a2.append(" MUST NOT hold lock on ");
                m26356a2.append(ku0Var);
                throw new AssertionError(m26356a2.toString());
            }
            synchronized (ku0Var) {
                m25976l = m25976l();
            }
            if (this.f51738j == null) {
                if (m25976l != null) {
                    t91.m28510a(m25976l);
                }
                Objects.requireNonNull(this.f51733e);
                AbstractC5814tr.m28707a((InterfaceC5537og) this, ku0Var);
            } else {
                if (!(m25976l == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f51739k && this.f51734f.exit()) {
            e3 = new InterruptedIOException("timeout");
            if (e2 != null) {
                e3.initCause(e2);
            }
        } else {
            e3 = e2;
        }
        if (e2 != null) {
            AbstractC5814tr abstractC5814tr = this.f51733e;
            Intrinsics.m32176e(e3);
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28711a((InterfaceC5537og) this, (IOException) e3);
        } else {
            Objects.requireNonNull(this.f51733e);
            AbstractC5814tr.m28706a((InterfaceC5537og) this);
        }
        return e3;
    }
}
