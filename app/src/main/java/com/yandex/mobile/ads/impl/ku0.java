package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4993dy;
import com.yandex.mobile.ads.impl.C5079fh;
import com.yandex.mobile.ads.impl.C5947vz;
import com.yandex.mobile.ads.impl.bt0;
import com.yandex.mobile.ads.impl.eq0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.connection.RealConnection;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ku0 extends C5947vz.c {

    /* renamed from: b */
    @NotNull
    private final dy0 f52152b;

    /* renamed from: c */
    @Nullable
    private Socket f52153c;

    /* renamed from: d */
    @Nullable
    private Socket f52154d;

    /* renamed from: e */
    @Nullable
    private C4993dy f52155e;

    /* renamed from: f */
    @Nullable
    private bt0 f52156f;

    /* renamed from: g */
    @Nullable
    private C5947vz f52157g;

    /* renamed from: h */
    @Nullable
    private BufferedSource f52158h;

    /* renamed from: i */
    @Nullable
    private BufferedSink f52159i;

    /* renamed from: j */
    private boolean f52160j;

    /* renamed from: k */
    private boolean f52161k;

    /* renamed from: l */
    private int f52162l;

    /* renamed from: m */
    private int f52163m;

    /* renamed from: n */
    private int f52164n;

    /* renamed from: o */
    private int f52165o;

    /* renamed from: p */
    @NotNull
    private final ArrayList f52166p;

    /* renamed from: q */
    private long f52167q;

    /* renamed from: com.yandex.mobile.ads.impl.ku0$a */
    public /* synthetic */ class C5360a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52168a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f52168a = iArr;
        }
    }

    public ku0(@NotNull ou0 connectionPool, @NotNull dy0 route) {
        Intrinsics.m32179h(connectionPool, "connectionPool");
        Intrinsics.m32179h(route, "route");
        this.f52152b = route;
        this.f52165o = 1;
        this.f52166p = new ArrayList();
        this.f52167q = Long.MAX_VALUE;
    }

    /* renamed from: n */
    private final void m26261n() throws IOException {
        Socket socket = this.f52154d;
        Intrinsics.m32176e(socket);
        BufferedSource bufferedSource = this.f52158h;
        Intrinsics.m32176e(bufferedSource);
        BufferedSink bufferedSink = this.f52159i;
        Intrinsics.m32176e(bufferedSink);
        socket.setSoTimeout(0);
        C5947vz m29336a = new C5947vz.a(r51.f54199h).m29335a(socket, this.f52152b.m23960a().m29677k().m28392g(), bufferedSource, bufferedSink).m29334a(this).m29346k().m29336a();
        this.f52157g = m29336a;
        int i2 = C5947vz.f55902D;
        this.f52165o = C5947vz.b.m29347a().m28434c();
        C5947vz.m29305l(m29336a);
    }

    @NotNull
    /* renamed from: b */
    public final ArrayList m26271b() {
        return this.f52166p;
    }

    /* renamed from: c */
    public final long m26272c() {
        return this.f52167q;
    }

    /* renamed from: d */
    public final boolean m26273d() {
        return this.f52160j;
    }

    /* renamed from: e */
    public final int m26274e() {
        return this.f52162l;
    }

    @Nullable
    /* renamed from: f */
    public final C4993dy m26275f() {
        return this.f52155e;
    }

    /* renamed from: g */
    public final synchronized void m26276g() {
        this.f52163m++;
    }

    /* renamed from: h */
    public final boolean m26277h() {
        return this.f52157g != null;
    }

    /* renamed from: i */
    public final synchronized void m26278i() {
        this.f52161k = true;
    }

    /* renamed from: j */
    public final synchronized void m26279j() {
        this.f52160j = true;
    }

    @NotNull
    /* renamed from: k */
    public final dy0 m26280k() {
        return this.f52152b;
    }

    /* renamed from: l */
    public final void m26281l() {
        this.f52160j = true;
    }

    @NotNull
    /* renamed from: m */
    public final Socket m26282m() {
        Socket socket = this.f52154d;
        Intrinsics.m32176e(socket);
        return socket;
    }

    @NotNull
    public final String toString() {
        Object obj;
        StringBuilder m26356a = l60.m26356a("Connection{");
        m26356a.append(this.f52152b.m23960a().m29677k().m28392g());
        m26356a.append(':');
        m26356a.append(this.f52152b.m23960a().m29677k().m28394i());
        m26356a.append(", proxy=");
        m26356a.append(this.f52152b.m23961b());
        m26356a.append(" hostAddress=");
        m26356a.append(this.f52152b.m23963d());
        m26356a.append(" cipherSuite=");
        C4993dy c4993dy = this.f52155e;
        if (c4993dy == null || (obj = c4993dy.m23955a()) == null) {
            obj = "none";
        }
        m26356a.append(obj);
        m26356a.append(" protocol=");
        m26356a.append(this.f52156f);
        m26356a.append('}');
        return m26356a.toString();
    }

    /* renamed from: a */
    public final void m26265a(long j2) {
        this.f52167q = j2;
    }

    /* renamed from: a */
    public final void m26264a(int i2, int i3, int i4, boolean z, @NotNull ju0 call, @NotNull AbstractC5814tr eventListener) {
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(eventListener, "eventListener");
        if (this.f52156f == null) {
            List<C5189hk> m29668b = this.f52152b.m23960a().m29668b();
            C5234ik c5234ik = new C5234ik(m29668b);
            if (this.f52152b.m23960a().m29676j() == null) {
                if (m29668b.contains(C5189hk.f50947f)) {
                    String m28392g = this.f52152b.m23960a().m29677k().m28392g();
                    int i5 = eq0.f50037c;
                    if (!eq0.C5041a.m24241b().mo24236a(m28392g)) {
                        throw new fy0(new UnknownServiceException(C0000a.m16m("CLEARTEXT communication to ", m28392g, " not permitted by network security policy")));
                    }
                } else {
                    throw new fy0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f52152b.m23960a().m29671e().contains(bt0.f48977f)) {
                throw new fy0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            fy0 fy0Var = null;
            do {
                try {
                    if (this.f52152b.m23962c()) {
                        m26258a(i2, i3, i4, call, eventListener);
                        if (this.f52153c == null) {
                            if (!this.f52152b.m23962c() && this.f52153c == null) {
                                throw new fy0(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f52167q = System.nanoTime();
                            return;
                        }
                    } else {
                        try {
                            m26259a(i2, i3, call, eventListener);
                        } catch (IOException e2) {
                            e = e2;
                            Socket socket = this.f52154d;
                            if (socket != null) {
                                t91.m28510a(socket);
                            }
                            Socket socket2 = this.f52153c;
                            if (socket2 != null) {
                                t91.m28510a(socket2);
                            }
                            this.f52154d = null;
                            this.f52153c = null;
                            this.f52158h = null;
                            this.f52159i = null;
                            this.f52155e = null;
                            this.f52156f = null;
                            this.f52157g = null;
                            this.f52165o = 1;
                            AbstractC5814tr.m28705a(call, this.f52152b.m23963d(), this.f52152b.m23961b(), e);
                            if (fy0Var == null) {
                                fy0Var = new fy0(e);
                            } else {
                                fy0Var.m24756a(e);
                            }
                            if (!z) {
                                throw fy0Var;
                            }
                        }
                    }
                    m26260a(c5234ik, call, eventListener);
                    AbstractC5814tr.m28704a(call, this.f52152b.m23963d(), this.f52152b.m23961b());
                    if (!this.f52152b.m23962c()) {
                    }
                    this.f52167q = System.nanoTime();
                    return;
                } catch (IOException e3) {
                    e = e3;
                }
            } while (c5234ik.m25552a(e));
            throw fy0Var;
        }
        throw new IllegalStateException("already connected".toString());
    }

    /* renamed from: a */
    private final void m26259a(int i2, int i3, ju0 ju0Var, AbstractC5814tr abstractC5814tr) throws IOException {
        Socket createSocket;
        Proxy m23961b = this.f52152b.m23961b();
        C6008x6 m23960a = this.f52152b.m23960a();
        Proxy.Type type = m23961b.type();
        int i4 = type == null ? -1 : C5360a.f52168a[type.ordinal()];
        if (i4 != 1 && i4 != 2) {
            createSocket = new Socket(m23961b);
        } else {
            createSocket = m23960a.m29675i().createSocket();
            Intrinsics.m32176e(createSocket);
        }
        this.f52153c = createSocket;
        InetSocketAddress m23963d = this.f52152b.m23963d();
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28716b(ju0Var, m23963d, m23961b);
        createSocket.setSoTimeout(i3);
        try {
            int i5 = eq0.f50037c;
            eq0.C5041a.m24241b().mo24235a(createSocket, this.f52152b.m23963d(), i2);
            try {
                this.f52158h = Okio.m34602d(Okio.m34608j(createSocket));
                this.f52159i = Okio.m34601c(Okio.m34604f(createSocket));
            } catch (NullPointerException e2) {
                if (Intrinsics.m32174c(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder m26356a = l60.m26356a("Failed to connect to ");
            m26356a.append(this.f52152b.m23963d());
            ConnectException connectException = new ConnectException(m26356a.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* renamed from: a */
    private final void m26260a(C5234ik c5234ik, ju0 ju0Var, AbstractC5814tr abstractC5814tr) throws IOException {
        if (this.f52152b.m23960a().m29676j() == null) {
            List<bt0> m29671e = this.f52152b.m23960a().m29671e();
            bt0 bt0Var = bt0.f48977f;
            if (m29671e.contains(bt0Var)) {
                this.f52154d = this.f52153c;
                this.f52156f = bt0Var;
                m26261n();
                return;
            } else {
                this.f52154d = this.f52153c;
                this.f52156f = bt0.f48974c;
                return;
            }
        }
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28726h(ju0Var);
        C6008x6 m23960a = this.f52152b.m23960a();
        SSLSocketFactory m29676j = m23960a.m29676j();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.m32176e(m29676j);
            Socket createSocket = m29676j.createSocket(this.f52153c, m23960a.m29677k().m28392g(), m23960a.m29677k().m28394i(), true);
            Intrinsics.m32177f(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C5189hk m25551a = c5234ik.m25551a(sSLSocket2);
                if (m25551a.m25224b()) {
                    int i2 = eq0.f50037c;
                    eq0.C5041a.m24241b().mo22733a(sSLSocket2, m23960a.m29677k().m28392g(), m23960a.m29671e());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.m32178g(sslSocketSession, "sslSocketSession");
                C4993dy m23959a = C4993dy.a.m23959a(sslSocketSession);
                HostnameVerifier m29670d = m23960a.m29670d();
                Intrinsics.m32176e(m29670d);
                if (!m29670d.verify(m23960a.m29677k().m28392g(), sslSocketSession)) {
                    List<Certificate> m23957c = m23959a.m23957c();
                    if (!m23957c.isEmpty()) {
                        Certificate certificate = m23957c.get(0);
                        Intrinsics.m32177f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        StringBuilder sb = new StringBuilder();
                        sb.append("\n              |Hostname ");
                        sb.append(m23960a.m29677k().m28392g());
                        sb.append(" not verified:\n              |    certificate: ");
                        C5079fh c5079fh = C5079fh.f50264c;
                        sb.append(C5079fh.b.m24601a(x509Certificate));
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(ln0.m26504a(x509Certificate));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(StringsKt.m33918p0(sb.toString(), null, 1, null));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + m23960a.m29677k().m28392g() + " not verified (no certificates)");
                }
                C5079fh m29666a = m23960a.m29666a();
                Intrinsics.m32176e(m29666a);
                this.f52155e = new C4993dy(m23959a.m23958d(), m23959a.m23955a(), m23959a.m23956b(), new lu0(m29666a, m23959a, m23960a));
                m29666a.m24599a(m23960a.m29677k().m28392g(), new mu0(this));
                if (m25551a.m25224b()) {
                    int i3 = eq0.f50037c;
                    str = eq0.C5041a.m24241b().mo22734b(sSLSocket2);
                }
                this.f52154d = sSLSocket2;
                this.f52158h = Okio.m34602d(Okio.m34608j(sSLSocket2));
                this.f52159i = Okio.m34601c(Okio.m34604f(sSLSocket2));
                this.f52156f = str != null ? bt0.C4885a.m22934a(str) : bt0.f48974c;
                int i4 = eq0.f50037c;
                eq0.C5041a.m24241b().mo22732a(sSLSocket2);
                AbstractC5814tr.m28725g(ju0Var);
                if (this.f52156f == bt0.f48976e) {
                    m26261n();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    int i5 = eq0.f50037c;
                    eq0.C5041a.m24241b().mo22732a(sSLSocket);
                }
                if (sSLSocket != null) {
                    t91.m28510a((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0166, code lost:
    
        if (r3 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0169, code lost:
    
        r7 = r16.f52153c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016b, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x016d, code lost:
    
        com.yandex.mobile.ads.impl.t91.m28510a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0170, code lost:
    
        r16.f52153c = null;
        r16.f52159i = null;
        r16.f52158h = null;
        com.yandex.mobile.ads.impl.AbstractC5814tr.m28704a(r20, r16.f52152b.m23963d(), r16.f52152b.m23961b());
        r9 = r9 + 1;
        r5 = null;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0196, code lost:
    
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m26258a(int r17, int r18, int r19, com.yandex.mobile.ads.impl.ju0 r20, com.yandex.mobile.ads.impl.AbstractC5814tr r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ku0.m26258a(int, int, int, com.yandex.mobile.ads.impl.ju0, com.yandex.mobile.ads.impl.tr):void");
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC6089yr m26262a(@NotNull mn0 client, @NotNull pu0 chain) throws SocketException {
        Intrinsics.m32179h(client, "client");
        Intrinsics.m32179h(chain, "chain");
        Socket socket = this.f52154d;
        Intrinsics.m32176e(socket);
        BufferedSource bufferedSource = this.f52158h;
        Intrinsics.m32176e(bufferedSource);
        BufferedSink bufferedSink = this.f52159i;
        Intrinsics.m32176e(bufferedSink);
        C5947vz c5947vz = this.f52157g;
        if (c5947vz != null) {
            return new a00(client, this, chain, c5947vz);
        }
        socket.setSoTimeout(chain.m27504h());
        Timeout f68772c = bufferedSource.getF68772c();
        long m27501e = chain.m27501e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f68772c.timeout(m27501e, timeUnit);
        bufferedSink.getF68778c().timeout(chain.m27503g(), timeUnit);
        return new C5828tz(client, this, bufferedSource, bufferedSink);
    }

    /* renamed from: a */
    public final void m26263a() {
        Socket socket = this.f52153c;
        if (socket != null) {
            t91.m28510a(socket);
        }
    }

    @Override // com.yandex.mobile.ads.impl.C5947vz.c
    /* renamed from: a */
    public final void mo26266a(@NotNull c00 stream) throws IOException {
        Intrinsics.m32179h(stream, "stream");
        stream.m22963a(EnumC5708rr.f54405f, (IOException) null);
    }

    @Override // com.yandex.mobile.ads.impl.C5947vz.c
    /* renamed from: a */
    public final synchronized void mo26268a(@NotNull C5947vz connection, @NotNull t01 settings) {
        Intrinsics.m32179h(connection, "connection");
        Intrinsics.m32179h(settings, "settings");
        this.f52165o = settings.m28434c();
    }

    /* renamed from: a */
    public final synchronized void m26267a(@NotNull ju0 call, @Nullable IOException iOException) {
        Intrinsics.m32179h(call, "call");
        if (iOException instanceof i41) {
            EnumC5708rr enumC5708rr = ((i41) iOException).f51214a;
            if (enumC5708rr == EnumC5708rr.f54405f) {
                int i2 = this.f52164n + 1;
                this.f52164n = i2;
                if (i2 > 1) {
                    this.f52160j = true;
                    this.f52162l++;
                }
            } else if (enumC5708rr != EnumC5708rr.f54406g || !call.m25974j()) {
                this.f52160j = true;
                this.f52162l++;
            }
        } else if (!m26277h() || (iOException instanceof C5131gk)) {
            this.f52160j = true;
            if (this.f52163m == 0) {
                if (iOException != null) {
                    mn0 client = call.m25967c();
                    dy0 failedRoute = this.f52152b;
                    Intrinsics.m32179h(client, "client");
                    Intrinsics.m32179h(failedRoute, "failedRoute");
                    if (failedRoute.m23961b().type() != Proxy.Type.DIRECT) {
                        C6008x6 m23960a = failedRoute.m23960a();
                        m23960a.m29674h().connectFailed(m23960a.m29677k().m28398m(), failedRoute.m23961b().address(), iOException);
                    }
                    client.m26711n().m24281b(failedRoute);
                }
                this.f52162l++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (r9 == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m26269a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C6008x6 r8, @org.jetbrains.annotations.Nullable java.util.List<com.yandex.mobile.ads.impl.dy0> r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ku0.m26269a(com.yandex.mobile.ads.impl.x6, java.util.List):boolean");
    }

    /* renamed from: a */
    public final boolean m26270a(boolean z) {
        long j2;
        if (t91.f54984f && Thread.holdsLock(this)) {
            StringBuilder m26356a = l60.m26356a("Thread ");
            m26356a.append(Thread.currentThread().getName());
            m26356a.append(" MUST NOT hold lock on ");
            m26356a.append(this);
            throw new AssertionError(m26356a.toString());
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f52153c;
        Intrinsics.m32176e(socket);
        Socket socket2 = this.f52154d;
        Intrinsics.m32176e(socket2);
        BufferedSource bufferedSource = this.f52158h;
        Intrinsics.m32176e(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C5947vz c5947vz = this.f52157g;
        if (c5947vz != null) {
            return c5947vz.m29317a(nanoTime);
        }
        synchronized (this) {
            j2 = nanoTime - this.f52167q;
        }
        if (j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z) {
            return true;
        }
        return t91.m28515a(socket2, bufferedSource);
    }
}
