package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes2.dex */
public final class Route {

    /* renamed from: a */
    public final Address f24931a;

    /* renamed from: b */
    public final Proxy f24932b;

    /* renamed from: c */
    public final InetSocketAddress f24933c;

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return this.f24931a.equals(route.f24931a) && this.f24932b.equals(route.f24932b) && this.f24933c.equals(route.f24933c);
    }

    public int hashCode() {
        return this.f24933c.hashCode() + ((this.f24932b.hashCode() + ((this.f24931a.hashCode() + 527) * 31)) * 31);
    }
}
