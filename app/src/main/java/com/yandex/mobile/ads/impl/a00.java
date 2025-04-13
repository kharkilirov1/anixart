package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.c00;
import com.yandex.mobile.ads.impl.e41;
import com.yandex.mobile.ads.impl.rw0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Header;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a00 implements InterfaceC6089yr {

    /* renamed from: g */
    @NotNull
    private static final List<String> f48282g = t91.m28505a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: h */
    @NotNull
    private static final List<String> f48283h = t91.m28505a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    @NotNull
    private final ku0 f48284a;

    /* renamed from: b */
    @NotNull
    private final pu0 f48285b;

    /* renamed from: c */
    @NotNull
    private final C5947vz f48286c;

    /* renamed from: d */
    @Nullable
    private volatile c00 f48287d;

    /* renamed from: e */
    @NotNull
    private final bt0 f48288e;

    /* renamed from: f */
    private volatile boolean f48289f;

    public a00(@NotNull mn0 client, @NotNull ku0 connection, @NotNull pu0 chain, @NotNull C5947vz http2Connection) {
        Intrinsics.m32179h(client, "client");
        Intrinsics.m32179h(connection, "connection");
        Intrinsics.m32179h(chain, "chain");
        Intrinsics.m32179h(http2Connection, "http2Connection");
        this.f48284a = connection;
        this.f48285b = chain;
        this.f48286c = http2Connection;
        List<bt0> m26715r = client.m26715r();
        bt0 bt0Var = bt0.f48977f;
        this.f48288e = m26715r.contains(bt0Var) ? bt0Var : bt0.f48976e;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: a */
    public final Sink mo22348a(@NotNull aw0 request, long j2) {
        Intrinsics.m32179h(request, "request");
        c00 c00Var = this.f48287d;
        Intrinsics.m32176e(c00Var);
        return c00Var.m22977j();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: b */
    public final void mo22353b() {
        this.f48286c.flush();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: c */
    public final ku0 mo22354c() {
        return this.f48284a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    public final void cancel() {
        this.f48289f = true;
        c00 c00Var = this.f48287d;
        if (c00Var != null) {
            c00Var.m22962a(EnumC5708rr.f54406g);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: a */
    public final void mo22351a(@NotNull aw0 request) {
        Intrinsics.m32179h(request, "request");
        if (this.f48287d != null) {
            return;
        }
        this.f48287d = this.f48286c.m29307a(C4787a.m22356a(request), request.m22632a() != null);
        if (this.f48289f) {
            c00 c00Var = this.f48287d;
            Intrinsics.m32176e(c00Var);
            c00Var.m22962a(EnumC5708rr.f54406g);
            throw new IOException("Canceled");
        }
        c00 c00Var2 = this.f48287d;
        Intrinsics.m32176e(c00Var2);
        c00.C4898c m22985r = c00Var2.m22985r();
        long m27501e = this.f48285b.m27501e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m22985r.timeout(m27501e, timeUnit);
        c00 c00Var3 = this.f48287d;
        Intrinsics.m32176e(c00Var3);
        c00Var3.m22988u().timeout(this.f48285b.m27503g(), timeUnit);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: b */
    public final long mo22352b(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        if (m00.m26552a(response)) {
            return t91.m28496a(response);
        }
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    /* renamed from: a */
    public final void mo22350a() {
        c00 c00Var = this.f48287d;
        Intrinsics.m32176e(c00Var);
        c00Var.m22977j().close();
    }

    /* renamed from: com.yandex.mobile.ads.impl.a00$a */
    public static final class C4787a {
        @NotNull
        /* renamed from: a */
        public static ArrayList m22356a(@NotNull aw0 request) {
            Intrinsics.m32179h(request, "request");
            C5204hy m22636d = request.m22636d();
            ArrayList arrayList = new ArrayList(m22636d.size() + 4);
            arrayList.add(new C5096fy(C5096fy.f50452f, request.m22638f()));
            arrayList.add(new C5096fy(C5096fy.f50453g, gw0.m24993a(request.m22640h())));
            String m22633a = request.m22633a("Host");
            if (m22633a != null) {
                arrayList.add(new C5096fy(C5096fy.f50455i, m22633a));
            }
            arrayList.add(new C5096fy(C5096fy.f50454h, request.m22640h().m28397l()));
            int size = m22636d.size();
            for (int i2 = 0; i2 < size; i2++) {
                String m25380a = m22636d.m25380a(i2);
                Locale US = Locale.US;
                Intrinsics.m32178g(US, "US");
                String lowerCase = m25380a.toLowerCase(US);
                Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!a00.f48282g.contains(lowerCase) || (Intrinsics.m32174c(lowerCase, "te") && Intrinsics.m32174c(m22636d.m25383b(i2), "trailers"))) {
                    arrayList.add(new C5096fy(lowerCase, m22636d.m25383b(i2)));
                }
            }
            return arrayList;
        }

        @NotNull
        /* renamed from: a */
        public static rw0.C5716a m22355a(@NotNull C5204hy headerBlock, @NotNull bt0 protocol) {
            Intrinsics.m32179h(headerBlock, "headerBlock");
            Intrinsics.m32179h(protocol, "protocol");
            C5204hy.a aVar = new C5204hy.a();
            int size = headerBlock.size();
            e41 e41Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                String m25380a = headerBlock.m25380a(i2);
                String m25383b = headerBlock.m25383b(i2);
                if (Intrinsics.m32174c(m25380a, Header.RESPONSE_STATUS_UTF8)) {
                    e41Var = e41.C5004a.m24006a("HTTP/1.1 " + m25383b);
                } else if (!a00.f48283h.contains(m25380a)) {
                    aVar.m25391b(m25380a, m25383b);
                }
            }
            if (e41Var != null) {
                return new rw0.C5716a().m28014a(protocol).m28011a(e41Var.f49804b).m28025b(e41Var.f49805c).m28016a(aVar.m25386a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @Nullable
    /* renamed from: a */
    public final rw0.C5716a mo22347a(boolean z) {
        c00 c00Var = this.f48287d;
        Intrinsics.m32176e(c00Var);
        rw0.C5716a m22355a = C4787a.m22355a(c00Var.m22986s(), this.f48288e);
        if (z && m22355a.m28022b() == 100) {
            return null;
        }
        return m22355a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6089yr
    @NotNull
    /* renamed from: a */
    public final Source mo22349a(@NotNull rw0 response) {
        Intrinsics.m32179h(response, "response");
        c00 c00Var = this.f48287d;
        Intrinsics.m32176e(c00Var);
        return c00Var.m22979l();
    }
}
