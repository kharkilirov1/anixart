package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetricaDefaultValues;
import com.yandex.mobile.ads.impl.AbstractC5027eh;
import com.yandex.mobile.ads.impl.AbstractC5814tr;
import com.yandex.mobile.ads.impl.InterfaceC5537og;
import com.yandex.mobile.ads.impl.eq0;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mn0 implements Cloneable, InterfaceC5537og.a {

    /* renamed from: B */
    public static final /* synthetic */ int f52714B = 0;

    /* renamed from: a */
    @NotNull
    private final C4879bp f52716a;

    /* renamed from: b */
    @NotNull
    private final C5082fk f52717b;

    /* renamed from: c */
    @NotNull
    private final List<j60> f52718c;

    /* renamed from: d */
    @NotNull
    private final List<j60> f52719d;

    /* renamed from: e */
    @NotNull
    private final AbstractC5814tr.b f52720e;

    /* renamed from: f */
    private final boolean f52721f;

    /* renamed from: g */
    @NotNull
    private final InterfaceC4803ac f52722g;

    /* renamed from: h */
    private final boolean f52723h;

    /* renamed from: i */
    private final boolean f52724i;

    /* renamed from: j */
    @NotNull
    private final InterfaceC4875bl f52725j;

    /* renamed from: k */
    @NotNull
    private final InterfaceC5088fq f52726k;

    /* renamed from: l */
    @NotNull
    private final ProxySelector f52727l;

    /* renamed from: m */
    @NotNull
    private final InterfaceC4803ac f52728m;

    /* renamed from: n */
    @NotNull
    private final SocketFactory f52729n;

    /* renamed from: o */
    @Nullable
    private final SSLSocketFactory f52730o;

    /* renamed from: p */
    @Nullable
    private final X509TrustManager f52731p;

    /* renamed from: q */
    @NotNull
    private final List<C5189hk> f52732q;

    /* renamed from: r */
    @NotNull
    private final List<bt0> f52733r;

    /* renamed from: s */
    @NotNull
    private final ln0 f52734s;

    /* renamed from: t */
    @NotNull
    private final C5079fh f52735t;

    /* renamed from: u */
    @Nullable
    private final AbstractC5027eh f52736u;

    /* renamed from: v */
    private final int f52737v;

    /* renamed from: w */
    private final int f52738w;

    /* renamed from: x */
    private final int f52739x;

    /* renamed from: y */
    @NotNull
    private final ey0 f52740y;

    /* renamed from: z */
    @NotNull
    private static final List<bt0> f52715z = t91.m28505a(bt0.f48976e, bt0.f48974c);

    /* renamed from: A */
    @NotNull
    private static final List<C5189hk> f52713A = t91.m28505a(C5189hk.f50946e, C5189hk.f50947f);

    /* renamed from: com.yandex.mobile.ads.impl.mn0$a */
    public static final class C5451a {

        /* renamed from: a */
        @NotNull
        private C4879bp f52741a = new C4879bp();

        /* renamed from: b */
        @NotNull
        private C5082fk f52742b = new C5082fk();

        /* renamed from: c */
        @NotNull
        private final ArrayList f52743c = new ArrayList();

        /* renamed from: d */
        @NotNull
        private final ArrayList f52744d = new ArrayList();

        /* renamed from: e */
        @NotNull
        private AbstractC5814tr.b f52745e = t91.m28498a(AbstractC5814tr.f55192a);

        /* renamed from: f */
        private boolean f52746f = true;

        /* renamed from: g */
        @NotNull
        private InterfaceC4803ac f52747g;

        /* renamed from: h */
        private boolean f52748h;

        /* renamed from: i */
        private boolean f52749i;

        /* renamed from: j */
        @NotNull
        private InterfaceC4875bl f52750j;

        /* renamed from: k */
        @NotNull
        private InterfaceC5088fq f52751k;

        /* renamed from: l */
        @NotNull
        private InterfaceC4803ac f52752l;

        /* renamed from: m */
        @NotNull
        private SocketFactory f52753m;

        /* renamed from: n */
        @Nullable
        private SSLSocketFactory f52754n;

        /* renamed from: o */
        @Nullable
        private X509TrustManager f52755o;

        /* renamed from: p */
        @NotNull
        private List<C5189hk> f52756p;

        /* renamed from: q */
        @NotNull
        private List<? extends bt0> f52757q;

        /* renamed from: r */
        @NotNull
        private ln0 f52758r;

        /* renamed from: s */
        @NotNull
        private C5079fh f52759s;

        /* renamed from: t */
        @Nullable
        private AbstractC5027eh f52760t;

        /* renamed from: u */
        private int f52761u;

        /* renamed from: v */
        private int f52762v;

        /* renamed from: w */
        private int f52763w;

        public C5451a() {
            InterfaceC4803ac interfaceC4803ac = InterfaceC4803ac.f48480a;
            this.f52747g = interfaceC4803ac;
            this.f52748h = true;
            this.f52749i = true;
            this.f52750j = InterfaceC4875bl.f48916a;
            this.f52751k = InterfaceC5088fq.f50406a;
            this.f52752l = interfaceC4803ac;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.m32178g(socketFactory, "getDefault()");
            this.f52753m = socketFactory;
            int i2 = mn0.f52714B;
            this.f52756p = C5452b.m26750a();
            this.f52757q = C5452b.m26751b();
            this.f52758r = ln0.f52476a;
            this.f52759s = C5079fh.f50264c;
            this.f52761u = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            this.f52762v = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            this.f52763w = YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        }

        @NotNull
        /* renamed from: a */
        public final C5451a m26723a() {
            this.f52748h = true;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC4803ac m26726b() {
            return this.f52747g;
        }

        @Nullable
        /* renamed from: c */
        public final AbstractC5027eh m26728c() {
            return this.f52760t;
        }

        @NotNull
        /* renamed from: d */
        public final C5079fh m26729d() {
            return this.f52759s;
        }

        /* renamed from: e */
        public final int m26730e() {
            return this.f52761u;
        }

        @NotNull
        /* renamed from: f */
        public final C5082fk m26731f() {
            return this.f52742b;
        }

        @NotNull
        /* renamed from: g */
        public final List<C5189hk> m26732g() {
            return this.f52756p;
        }

        @NotNull
        /* renamed from: h */
        public final InterfaceC4875bl m26733h() {
            return this.f52750j;
        }

        @NotNull
        /* renamed from: i */
        public final C4879bp m26734i() {
            return this.f52741a;
        }

        @NotNull
        /* renamed from: j */
        public final InterfaceC5088fq m26735j() {
            return this.f52751k;
        }

        @NotNull
        /* renamed from: k */
        public final AbstractC5814tr.b m26736k() {
            return this.f52745e;
        }

        /* renamed from: l */
        public final boolean m26737l() {
            return this.f52748h;
        }

        /* renamed from: m */
        public final boolean m26738m() {
            return this.f52749i;
        }

        @NotNull
        /* renamed from: n */
        public final ln0 m26739n() {
            return this.f52758r;
        }

        @NotNull
        /* renamed from: o */
        public final ArrayList m26740o() {
            return this.f52743c;
        }

        @NotNull
        /* renamed from: p */
        public final ArrayList m26741p() {
            return this.f52744d;
        }

        @NotNull
        /* renamed from: q */
        public final List<bt0> m26742q() {
            return this.f52757q;
        }

        @NotNull
        /* renamed from: r */
        public final InterfaceC4803ac m26743r() {
            return this.f52752l;
        }

        /* renamed from: s */
        public final int m26744s() {
            return this.f52762v;
        }

        /* renamed from: t */
        public final boolean m26745t() {
            return this.f52746f;
        }

        @NotNull
        /* renamed from: u */
        public final SocketFactory m26746u() {
            return this.f52753m;
        }

        @Nullable
        /* renamed from: v */
        public final SSLSocketFactory m26747v() {
            return this.f52754n;
        }

        /* renamed from: w */
        public final int m26748w() {
            return this.f52763w;
        }

        @Nullable
        /* renamed from: x */
        public final X509TrustManager m26749x() {
            return this.f52755o;
        }

        @NotNull
        /* renamed from: a */
        public final C5451a m26725a(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.m32179h(sslSocketFactory, "sslSocketFactory");
            Intrinsics.m32179h(trustManager, "trustManager");
            if (Intrinsics.m32174c(sslSocketFactory, this.f52754n)) {
                Intrinsics.m32174c(trustManager, this.f52755o);
            }
            this.f52754n = sslSocketFactory;
            this.f52760t = AbstractC5027eh.a.m24155a(trustManager);
            this.f52755o = trustManager;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C5451a m26727b(long j2, @NotNull TimeUnit unit) {
            Intrinsics.m32179h(unit, "unit");
            this.f52762v = t91.m28488a(j2, unit);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5451a m26724a(long j2, @NotNull TimeUnit unit) {
            Intrinsics.m32179h(unit, "unit");
            this.f52761u = t91.m28488a(j2, unit);
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mn0$b */
    public static final class C5452b {
        @NotNull
        /* renamed from: a */
        public static List m26750a() {
            return mn0.f52713A;
        }

        @NotNull
        /* renamed from: b */
        public static List m26751b() {
            return mn0.f52715z;
        }
    }

    public mn0(@NotNull C5451a builder) {
        boolean z;
        Intrinsics.m32179h(builder, "builder");
        this.f52716a = builder.m26734i();
        this.f52717b = builder.m26731f();
        this.f52718c = t91.m28526b(builder.m26740o());
        this.f52719d = t91.m28526b(builder.m26741p());
        this.f52720e = builder.m26736k();
        this.f52721f = builder.m26745t();
        this.f52722g = builder.m26726b();
        this.f52723h = builder.m26737l();
        this.f52724i = builder.m26738m();
        this.f52725j = builder.m26733h();
        this.f52726k = builder.m26735j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f52727l = proxySelector == null ? cn0.f49320a : proxySelector;
        this.f52728m = builder.m26743r();
        this.f52729n = builder.m26746u();
        List<C5189hk> m26732g = builder.m26732g();
        this.f52732q = m26732g;
        this.f52733r = builder.m26742q();
        this.f52734s = builder.m26739n();
        this.f52737v = builder.m26730e();
        this.f52738w = builder.m26744s();
        this.f52739x = builder.m26748w();
        this.f52740y = new ey0();
        if (!(m26732g instanceof Collection) || !m26732g.isEmpty()) {
            Iterator<T> it = m26732g.iterator();
            while (it.hasNext()) {
                if (((C5189hk) it.next()).m25222a()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            this.f52730o = null;
            this.f52736u = null;
            this.f52731p = null;
            this.f52735t = C5079fh.f50264c;
        } else if (builder.m26747v() != null) {
            this.f52730o = builder.m26747v();
            AbstractC5027eh m26728c = builder.m26728c();
            Intrinsics.m32176e(m26728c);
            this.f52736u = m26728c;
            X509TrustManager m26749x = builder.m26749x();
            Intrinsics.m32176e(m26749x);
            this.f52731p = m26749x;
            this.f52735t = builder.m26729d().m24597a(m26728c);
        } else {
            int i2 = eq0.f50037c;
            Objects.requireNonNull(eq0.C5041a.m24241b());
            X509TrustManager m24232c = eq0.m24232c();
            this.f52731p = m24232c;
            eq0 m24241b = eq0.C5041a.m24241b();
            Intrinsics.m32176e(m24232c);
            Objects.requireNonNull(m24241b);
            this.f52730o = eq0.m24231c(m24232c);
            AbstractC5027eh m24155a = AbstractC5027eh.a.m24155a(m24232c);
            this.f52736u = m24155a;
            C5079fh m26729d = builder.m26729d();
            Intrinsics.m32176e(m24155a);
            this.f52735t = m26729d.m24597a(m24155a);
        }
        m26698y();
    }

    /* renamed from: y */
    private final void m26698y() {
        boolean z;
        Intrinsics.m32177f(this.f52718c, "null cannot be cast to non-null type kotlin.collections.List<com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            StringBuilder m26356a = l60.m26356a("Null interceptor: ");
            m26356a.append(this.f52718c);
            throw new IllegalStateException(m26356a.toString().toString());
        }
        Intrinsics.m32177f(this.f52719d, "null cannot be cast to non-null type kotlin.collections.List<com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            StringBuilder m26356a2 = l60.m26356a("Null network interceptor: ");
            m26356a2.append(this.f52719d);
            throw new IllegalStateException(m26356a2.toString().toString());
        }
        List<C5189hk> list = this.f52732q;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5189hk) it.next()).m25222a()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            if (this.f52730o == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f52736u == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f52731p == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f52730o == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f52736u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f52731p == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.m32174c(this.f52735t, C5079fh.f50264c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final InterfaceC4803ac m26700c() {
        return this.f52722g;
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    @JvmName
    @NotNull
    /* renamed from: d */
    public final C5079fh m26701d() {
        return this.f52735t;
    }

    @JvmName
    /* renamed from: e */
    public final int m26702e() {
        return this.f52737v;
    }

    @JvmName
    @NotNull
    /* renamed from: f */
    public final C5082fk m26703f() {
        return this.f52717b;
    }

    @JvmName
    @NotNull
    /* renamed from: g */
    public final List<C5189hk> m26704g() {
        return this.f52732q;
    }

    @JvmName
    @NotNull
    /* renamed from: h */
    public final InterfaceC4875bl m26705h() {
        return this.f52725j;
    }

    @JvmName
    @NotNull
    /* renamed from: i */
    public final C4879bp m26706i() {
        return this.f52716a;
    }

    @JvmName
    @NotNull
    /* renamed from: j */
    public final InterfaceC5088fq m26707j() {
        return this.f52726k;
    }

    @JvmName
    @NotNull
    /* renamed from: k */
    public final AbstractC5814tr.b m26708k() {
        return this.f52720e;
    }

    @JvmName
    /* renamed from: l */
    public final boolean m26709l() {
        return this.f52723h;
    }

    @JvmName
    /* renamed from: m */
    public final boolean m26710m() {
        return this.f52724i;
    }

    @NotNull
    /* renamed from: n */
    public final ey0 m26711n() {
        return this.f52740y;
    }

    @JvmName
    @NotNull
    /* renamed from: o */
    public final ln0 m26712o() {
        return this.f52734s;
    }

    @JvmName
    @NotNull
    /* renamed from: p */
    public final List<j60> m26713p() {
        return this.f52718c;
    }

    @JvmName
    @NotNull
    /* renamed from: q */
    public final List<j60> m26714q() {
        return this.f52719d;
    }

    @JvmName
    @NotNull
    /* renamed from: r */
    public final List<bt0> m26715r() {
        return this.f52733r;
    }

    @JvmName
    @NotNull
    /* renamed from: s */
    public final InterfaceC4803ac m26716s() {
        return this.f52728m;
    }

    @JvmName
    @NotNull
    /* renamed from: t */
    public final ProxySelector m26717t() {
        return this.f52727l;
    }

    @JvmName
    /* renamed from: u */
    public final int m26718u() {
        return this.f52738w;
    }

    @JvmName
    /* renamed from: v */
    public final boolean m26719v() {
        return this.f52721f;
    }

    @JvmName
    @NotNull
    /* renamed from: w */
    public final SocketFactory m26720w() {
        return this.f52729n;
    }

    @JvmName
    @NotNull
    /* renamed from: x */
    public final SSLSocketFactory m26721x() {
        SSLSocketFactory sSLSocketFactory = this.f52730o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName
    /* renamed from: z */
    public final int m26722z() {
        return this.f52739x;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5537og.a
    @NotNull
    /* renamed from: a */
    public final ju0 mo26699a(@NotNull aw0 request) {
        Intrinsics.m32179h(request, "request");
        return new ju0(this, request, false);
    }

    public mn0() {
        this(new C5451a());
    }
}
