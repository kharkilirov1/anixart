package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import io.grpc.ChannelLogger;
import io.grpc.Status;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.MetadataApplierImpl;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
final class CallCredentialsApplyingTransportFactory implements ClientTransportFactory {

    public class CallCredentialsApplyingTransport extends ForwardingConnectionClientTransport {

        /* renamed from: a */
        public final ConnectionClientTransport f58453a;

        /* renamed from: b */
        public final AtomicInteger f58454b;

        /* renamed from: c */
        public volatile Status f58455c;

        /* renamed from: d */
        @GuardedBy
        public Status f58456d;

        /* renamed from: e */
        @GuardedBy
        public Status f58457e;

        /* renamed from: io.grpc.internal.CallCredentialsApplyingTransportFactory$CallCredentialsApplyingTransport$1 */
        public class C63411 implements MetadataApplierImpl.MetadataApplierListener {
        }

        /* renamed from: io.grpc.internal.CallCredentialsApplyingTransportFactory$CallCredentialsApplyingTransport$2 */
        class C63422 extends CallCredentials.RequestInfo {
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ManagedClientTransport
        /* renamed from: a */
        public void mo30968a(Status status) {
            Preconditions.m11187k(status, "status");
            synchronized (this) {
                if (this.f58454b.get() < 0) {
                    this.f58455c = status;
                    this.f58454b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f58457e != null) {
                    return;
                }
                if (this.f58454b.get() != 0) {
                    this.f58457e = status;
                } else {
                    super.mo30968a(status);
                }
            }
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport, io.grpc.internal.ManagedClientTransport
        /* renamed from: b */
        public void mo30969b(Status status) {
            Preconditions.m11187k(status, "status");
            synchronized (this) {
                if (this.f58454b.get() < 0) {
                    this.f58455c = status;
                    this.f58454b.addAndGet(Integer.MAX_VALUE);
                    if (this.f58454b.get() != 0) {
                        this.f58456d = status;
                    } else {
                        super.mo30969b(status);
                    }
                }
            }
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport
        /* renamed from: d */
        public ConnectionClientTransport mo31039d() {
            return this.f58453a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw null;
    }

    @Override // io.grpc.internal.ClientTransportFactory
    /* renamed from: x0 */
    public ConnectionClientTransport mo30964x0(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
        throw null;
    }
}
