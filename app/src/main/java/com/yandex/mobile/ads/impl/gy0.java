package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gy0 {

    /* renamed from: a */
    @NotNull
    private final C6008x6 f50756a;

    /* renamed from: b */
    @NotNull
    private final ey0 f50757b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC5537og f50758c;

    /* renamed from: d */
    @NotNull
    private final AbstractC5814tr f50759d;

    /* renamed from: e */
    @NotNull
    private List<? extends Proxy> f50760e;

    /* renamed from: f */
    private int f50761f;

    /* renamed from: g */
    @NotNull
    private List<? extends InetSocketAddress> f50762g;

    /* renamed from: h */
    @NotNull
    private final ArrayList f50763h;

    /* renamed from: com.yandex.mobile.ads.impl.gy0$a */
    public static final class C5151a {
        @NotNull
        /* renamed from: a */
        public static String m25006a(@NotNull InetSocketAddress inetSocketAddress) {
            Intrinsics.m32179h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.m32178g(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.m32178g(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gy0$b */
    public static final class C5152b {

        /* renamed from: a */
        @NotNull
        private final List<dy0> f50764a;

        /* renamed from: b */
        private int f50765b;

        public C5152b(@NotNull ArrayList routes) {
            Intrinsics.m32179h(routes, "routes");
            this.f50764a = routes;
        }

        @NotNull
        /* renamed from: a */
        public final List<dy0> m25007a() {
            return this.f50764a;
        }

        /* renamed from: b */
        public final boolean m25008b() {
            return this.f50765b < this.f50764a.size();
        }

        @NotNull
        /* renamed from: c */
        public final dy0 m25009c() {
            if (!m25008b()) {
                throw new NoSuchElementException();
            }
            List<dy0> list = this.f50764a;
            int i2 = this.f50765b;
            this.f50765b = i2 + 1;
            return list.get(i2);
        }
    }

    public gy0(@NotNull C6008x6 address, @NotNull ey0 routeDatabase, @NotNull ju0 call, @NotNull AbstractC5814tr eventListener) {
        Intrinsics.m32179h(address, "address");
        Intrinsics.m32179h(routeDatabase, "routeDatabase");
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(eventListener, "eventListener");
        this.f50756a = address;
        this.f50757b = routeDatabase;
        this.f50758c = call;
        this.f50759d = eventListener;
        EmptyList emptyList = EmptyList.f63144b;
        this.f50760e = emptyList;
        this.f50762g = emptyList;
        this.f50763h = new ArrayList();
        m25003a(address.m29677k(), address.m29672f());
    }

    /* renamed from: a */
    private final void m25003a(t00 t00Var, Proxy proxy) {
        List<? extends Proxy> m28526b;
        AbstractC5814tr abstractC5814tr = this.f50759d;
        InterfaceC5537og interfaceC5537og = this.f50758c;
        Objects.requireNonNull(abstractC5814tr);
        AbstractC5814tr.m28709a(interfaceC5537og, t00Var);
        if (proxy != null) {
            m28526b = CollectionsKt.m31993F(proxy);
        } else {
            URI m28398m = t00Var.m28398m();
            if (m28398m.getHost() == null) {
                m28526b = t91.m28505a(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = this.f50756a.m29674h().select(m28398m);
                if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                    m28526b = t91.m28505a(Proxy.NO_PROXY);
                } else {
                    Intrinsics.m32178g(proxiesOrNull, "proxiesOrNull");
                    m28526b = t91.m28526b(proxiesOrNull);
                }
            }
        }
        this.f50760e = m28526b;
        this.f50761f = 0;
        AbstractC5814tr abstractC5814tr2 = this.f50759d;
        InterfaceC5537og interfaceC5537og2 = this.f50758c;
        Objects.requireNonNull(abstractC5814tr2);
        AbstractC5814tr.m28710a(interfaceC5537og2, t00Var, m28526b);
    }

    @NotNull
    /* renamed from: b */
    public final C5152b m25005b() throws IOException {
        String m28392g;
        int m28394i;
        if (!m25004a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        do {
            boolean z = false;
            if (!(this.f50761f < this.f50760e.size())) {
                break;
            }
            if (!(this.f50761f < this.f50760e.size())) {
                StringBuilder m26356a = l60.m26356a("No route to ");
                m26356a.append(this.f50756a.m29677k().m28392g());
                m26356a.append("; exhausted proxy configurations: ");
                m26356a.append(this.f50760e);
                throw new SocketException(m26356a.toString());
            }
            List<? extends Proxy> list = this.f50760e;
            int i2 = this.f50761f;
            this.f50761f = i2 + 1;
            Proxy proxy = list.get(i2);
            ArrayList arrayList2 = new ArrayList();
            this.f50762g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                m28392g = this.f50756a.m29677k().m28392g();
                m28394i = this.f50756a.m29677k().m28394i();
            } else {
                SocketAddress proxyAddress = proxy.address();
                if (!(proxyAddress instanceof InetSocketAddress)) {
                    StringBuilder m26356a2 = l60.m26356a("Proxy.address() is not an InetSocketAddress: ");
                    m26356a2.append(proxyAddress.getClass());
                    throw new IllegalArgumentException(m26356a2.toString().toString());
                }
                Intrinsics.m32178g(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                m28392g = C5151a.m25006a(inetSocketAddress);
                m28394i = inetSocketAddress.getPort();
            }
            if (1 <= m28394i && m28394i < 65536) {
                z = true;
            }
            if (!z) {
                throw new SocketException("No route to " + m28392g + ':' + m28394i + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(m28392g, m28394i));
            } else {
                AbstractC5814tr abstractC5814tr = this.f50759d;
                InterfaceC5537og interfaceC5537og = this.f50758c;
                Objects.requireNonNull(abstractC5814tr);
                AbstractC5814tr.m28712a(interfaceC5537og, m28392g);
                List<InetAddress> mo24227a = this.f50756a.m29669c().mo24227a(m28392g);
                if (mo24227a.isEmpty()) {
                    throw new UnknownHostException(this.f50756a.m29669c() + " returned no addresses for " + m28392g);
                }
                AbstractC5814tr abstractC5814tr2 = this.f50759d;
                InterfaceC5537og interfaceC5537og2 = this.f50758c;
                Objects.requireNonNull(abstractC5814tr2);
                AbstractC5814tr.m28713a(interfaceC5537og2, m28392g, mo24227a);
                Iterator<InetAddress> it = mo24227a.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress(it.next(), m28394i));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f50762g.iterator();
            while (it2.hasNext()) {
                dy0 dy0Var = new dy0(this.f50756a, proxy, it2.next());
                if (this.f50757b.m24282c(dy0Var)) {
                    this.f50763h.add(dy0Var);
                } else {
                    arrayList.add(dy0Var);
                }
            }
        } while (!(!arrayList.isEmpty()));
        if (arrayList.isEmpty()) {
            CollectionsKt.m32020g(arrayList, this.f50763h);
            this.f50763h.clear();
        }
        return new C5152b(arrayList);
    }

    /* renamed from: a */
    public final boolean m25004a() {
        return (this.f50761f < this.f50760e.size()) || (this.f50763h.isEmpty() ^ true);
    }
}
