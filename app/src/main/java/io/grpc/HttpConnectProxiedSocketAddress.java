package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import javax.annotation.Nullable;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {

    /* renamed from: b */
    public final SocketAddress f58145b;

    /* renamed from: c */
    public final InetSocketAddress f58146c;

    /* renamed from: d */
    @Nullable
    public final String f58147d;

    /* renamed from: e */
    @Nullable
    public final String f58148e;

    public static final class Builder {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) obj;
        return Objects.m11173a(this.f58145b, httpConnectProxiedSocketAddress.f58145b) && Objects.m11173a(this.f58146c, httpConnectProxiedSocketAddress.f58146c) && Objects.m11173a(this.f58147d, httpConnectProxiedSocketAddress.f58147d) && Objects.m11173a(this.f58148e, httpConnectProxiedSocketAddress.f58148e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58145b, this.f58146c, this.f58147d, this.f58148e});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("proxyAddr", this.f58145b);
        m11166b.m11171e("targetAddr", this.f58146c);
        m11166b.m11171e("username", this.f58147d);
        m11166b.m11170d("hasPassword", this.f58148e != null);
        return m11166b.toString();
    }
}
