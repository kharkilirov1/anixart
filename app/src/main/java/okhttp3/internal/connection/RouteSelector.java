package okhttp3.internal.connection;

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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RouteSelector.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m31884d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "address", "Lokhttp3/Address;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "inetSocketAddresses", "", "Ljava/net/InetSocketAddress;", "nextProxyIndex", "", "postponedRoutes", "", "Lokhttp3/Route;", "proxies", "Ljava/net/Proxy;", "hasNext", "", "hasNextProxy", "next", "Lokhttp3/internal/connection/RouteSelector$Selection;", "nextProxy", "resetNextInetSocketAddress", "", "proxy", "resetNextProxy", "url", "Lokhttp3/HttpUrl;", "Companion", "Selection", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RouteSelector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: RouteSelector.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getSocketHost(@NotNull InetSocketAddress socketHost) {
            Intrinsics.m32179h(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                Intrinsics.m32178g(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            Intrinsics.m32178g(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m31884d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "routes", "", "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", "", "getRoutes", "()Ljava/util/List;", "hasNext", "", "next", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Selection {
        private int nextRouteIndex;

        @NotNull
        private final List<Route> routes;

        public Selection(@NotNull List<Route> routes) {
            Intrinsics.m32179h(routes, "routes");
            this.routes = routes;
        }

        @NotNull
        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        @NotNull
        public final Route next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<Route> list = this.routes;
            int i2 = this.nextRouteIndex;
            this.nextRouteIndex = i2 + 1;
            return list.get(i2);
        }
    }

    public RouteSelector(@NotNull Address address, @NotNull RouteDatabase routeDatabase, @NotNull Call call, @NotNull EventListener eventListener) {
        Intrinsics.m32179h(address, "address");
        Intrinsics.m32179h(routeDatabase, "routeDatabase");
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        EmptyList emptyList = EmptyList.f63144b;
        this.proxies = emptyList;
        this.inetSocketAddresses = emptyList;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (!hasNextProxy()) {
            StringBuilder m24u = C0000a.m24u("No route to ");
            m24u.append(this.address.url().host());
            m24u.append("; exhausted proxy configurations: ");
            m24u.append(this.proxies);
            throw new SocketException(m24u.toString());
        }
        List<? extends Proxy> list = this.proxies;
        int i2 = this.nextProxyIndex;
        this.nextProxyIndex = i2 + 1;
        Proxy proxy = list.get(i2);
        resetNextInetSocketAddress(proxy);
        return proxy;
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String host;
        int port;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.url().host();
            port = this.address.url().port();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                StringBuilder m24u = C0000a.m24u("Proxy.address() is not an InetSocketAddress: ");
                m24u.append(address.getClass());
                throw new IllegalArgumentException(m24u.toString().toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            host = INSTANCE.getSocketHost(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || 65535 < port) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        this.eventListener.dnsStart(this.call, host);
        List<InetAddress> lookup = this.address.dns().lookup(host);
        if (lookup.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
        }
        this.eventListener.dnsEnd(this.call, host, lookup);
        Iterator<InetAddress> it = lookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(final HttpUrl url, final Proxy proxy) {
        Function0<List<? extends Proxy>> function0 = new Function0<List<? extends Proxy>>() { // from class: okhttp3.internal.connection.RouteSelector$resetNextProxy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Proxy> invoke() {
                Address address;
                Proxy proxy2 = proxy;
                if (proxy2 != null) {
                    return CollectionsKt.m31993F(proxy2);
                }
                URI uri = url.uri();
                if (uri.getHost() == null) {
                    return Util.immutableListOf(Proxy.NO_PROXY);
                }
                address = RouteSelector.this.address;
                List<Proxy> select = address.proxySelector().select(uri);
                return select == null || select.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(select);
            }
        };
        this.eventListener.proxySelectStart(this.call, url);
        List<? extends Proxy> invoke = function0.invoke();
        this.proxies = invoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, url, invoke);
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    @NotNull
    public final Selection next() throws IOException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy nextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.address, nextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.m32020g(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }
}
