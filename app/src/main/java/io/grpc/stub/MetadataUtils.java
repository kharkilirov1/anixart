package io.grpc.stub;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MetadataUtils {

    public static final class HeaderAttachingClientInterceptor implements ClientInterceptor {

        public final class HeaderAttachingClientCall<ReqT, RespT> extends ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT> {
            public HeaderAttachingClientCall(ClientCall<ReqT, RespT> clientCall) {
                super(clientCall);
            }

            @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
            /* renamed from: f */
            public void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
                Objects.requireNonNull(HeaderAttachingClientInterceptor.this);
                metadata.m30901f(null);
                throw null;
            }
        }

        @Override // io.grpc.ClientInterceptor
        /* renamed from: a */
        public <ReqT, RespT> ClientCall<ReqT, RespT> mo30817a(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
            return new HeaderAttachingClientCall(channel.mo30809d(methodDescriptor, callOptions));
        }
    }

    public static final class MetadataCapturingClientInterceptor implements ClientInterceptor {

        public final class MetadataCapturingClientCall<ReqT, RespT> extends ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT> {

            public final class MetadataCapturingClientCallListener extends ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT> {

                /* renamed from: b */
                public final /* synthetic */ MetadataCapturingClientCall f59500b;

                @Override // io.grpc.ForwardingClientCallListener, io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
                /* renamed from: a */
                public void mo12483a(Status status, Metadata metadata) {
                    Objects.requireNonNull(MetadataCapturingClientInterceptor.this);
                    throw null;
                }

                @Override // io.grpc.ForwardingClientCallListener, io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
                /* renamed from: b */
                public void mo12484b(Metadata metadata) {
                    Objects.requireNonNull(MetadataCapturingClientInterceptor.this);
                    throw null;
                }
            }

            public MetadataCapturingClientCall(ClientCall<ReqT, RespT> clientCall) {
                super(clientCall);
            }

            @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
            /* renamed from: f */
            public void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
                Objects.requireNonNull(MetadataCapturingClientInterceptor.this);
                throw null;
            }
        }

        @Override // io.grpc.ClientInterceptor
        /* renamed from: a */
        public <ReqT, RespT> ClientCall<ReqT, RespT> mo30817a(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
            return new MetadataCapturingClientCall(channel.mo30809d(methodDescriptor, callOptions));
        }
    }
}
