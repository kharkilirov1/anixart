package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.ClientStreamListener;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class SubchannelChannel extends Channel {

    /* renamed from: a */
    @VisibleForTesting
    public static final Status f59160a;

    /* renamed from: b */
    public static final FailingClientTransport f59161b;

    /* renamed from: io.grpc.internal.SubchannelChannel$1 */
    public class C64671 implements ClientCallImpl.ClientStreamProvider {
        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        /* renamed from: a */
        public ClientStream mo31059a(MethodDescriptor<?, ?> methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            Status status = SubchannelChannel.f59160a;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    static {
        Status status = Status.f58287n;
        Status m30947g = status.m30947g("Subchannel is NOT READY");
        f59160a = status.m30947g("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        f59161b = new FailingClientTransport(m30947g, ClientStreamListener.RpcProgress.REFUSED);
    }

    @Override // io.grpc.Channel
    /* renamed from: d */
    public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
        final Executor executor = callOptions.f58060b;
        if (executor == null) {
            executor = null;
        }
        if (callOptions.m30804b()) {
            return new ClientCall<RequestT, ResponseT>(this) { // from class: io.grpc.internal.SubchannelChannel.2
                @Override // io.grpc.ClientCall
                /* renamed from: a */
                public void mo30812a(String str, Throwable th) {
                }

                @Override // io.grpc.ClientCall
                /* renamed from: b */
                public void mo12487b() {
                }

                @Override // io.grpc.ClientCall
                /* renamed from: c */
                public void mo30813c(int i2) {
                }

                @Override // io.grpc.ClientCall
                /* renamed from: d */
                public void mo30814d(RequestT requestt) {
                }

                @Override // io.grpc.ClientCall
                /* renamed from: f */
                public void mo30816f(final ClientCall.Listener<ResponseT> listener, Metadata metadata) {
                    executor.execute(new Runnable(this) { // from class: io.grpc.internal.SubchannelChannel.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            listener.mo12483a(SubchannelChannel.f59160a, new Metadata());
                        }
                    });
                }
            };
        }
        callOptions.m30807e(GrpcUtil.f58668n, Boolean.TRUE);
        throw null;
    }
}
