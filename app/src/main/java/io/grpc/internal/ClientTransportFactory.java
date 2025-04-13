package io.grpc.internal;

import com.google.common.base.Objects;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.HttpConnectProxiedSocketAddress;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ClientTransportFactory extends Closeable {

    public static final class ClientTransportOptions {

        /* renamed from: a */
        public String f58518a = "unknown-authority";

        /* renamed from: b */
        public Attributes f58519b = Attributes.f58053b;

        /* renamed from: c */
        @Nullable
        public String f58520c;

        /* renamed from: d */
        @Nullable
        public HttpConnectProxiedSocketAddress f58521d;

        public boolean equals(Object obj) {
            if (!(obj instanceof ClientTransportOptions)) {
                return false;
            }
            ClientTransportOptions clientTransportOptions = (ClientTransportOptions) obj;
            return this.f58518a.equals(clientTransportOptions.f58518a) && this.f58519b.equals(clientTransportOptions.f58519b) && Objects.m11173a(this.f58520c, clientTransportOptions.f58520c) && Objects.m11173a(this.f58521d, clientTransportOptions.f58521d);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58518a, this.f58519b, this.f58520c, this.f58521d});
        }
    }

    public static final class SwapChannelCredentialsResult {
    }

    /* renamed from: x0 */
    ConnectionClientTransport mo30964x0(SocketAddress socketAddress, ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger);
}
