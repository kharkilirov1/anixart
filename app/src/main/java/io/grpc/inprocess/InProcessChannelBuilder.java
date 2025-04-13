package io.grpc.inprocess;

import io.grpc.ChannelLogger;
import io.grpc.ExperimentalApi;
import io.grpc.Internal;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.AbstractManagedChannelImplBuilder;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.ManagedChannelImplBuilder;
import java.net.SocketAddress;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class InProcessChannelBuilder extends AbstractManagedChannelImplBuilder<InProcessChannelBuilder> {

    /* renamed from: io.grpc.inprocess.InProcessChannelBuilder$1InProcessChannelTransportFactoryBuilder, reason: invalid class name */
    final class C1InProcessChannelTransportFactoryBuilder implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
    }

    public static final class InProcessClientTransportFactory implements ClientTransportFactory {

        /* renamed from: b */
        public boolean f58340b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f58340b) {
                return;
            }
            this.f58340b = true;
        }

        @Override // io.grpc.internal.ClientTransportFactory
        /* renamed from: x0 */
        public ConnectionClientTransport mo30964x0(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
            if (this.f58340b) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            return new InProcessTransport(socketAddress, 0, clientTransportOptions.f58518a, clientTransportOptions.f58520c, clientTransportOptions.f58519b, false);
        }
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder
    @Internal
    /* renamed from: a */
    public ManagedChannelBuilder<?> mo30963a() {
        return null;
    }
}
