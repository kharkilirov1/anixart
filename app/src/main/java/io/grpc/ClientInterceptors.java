package io.grpc;

import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;
import java.util.Objects;

/* loaded from: classes3.dex */
public class ClientInterceptors {

    /* renamed from: a */
    public static final ClientCall<Object, Object> f58074a = new ClientCall<Object, Object>() { // from class: io.grpc.ClientInterceptors.2
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
        public void mo30814d(Object obj) {
        }

        @Override // io.grpc.ClientCall
        /* renamed from: f */
        public void mo30816f(ClientCall.Listener<Object> listener, Metadata metadata) {
        }
    };

    /* renamed from: io.grpc.ClientInterceptors$1 */
    class C62901 implements ClientInterceptor {

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* renamed from: io.grpc.ClientInterceptors$1$1, reason: invalid class name */
        public class AnonymousClass1<ReqT, RespT> extends PartialForwardingClientCall<ReqT, RespT> {

            /* renamed from: a */
            public final /* synthetic */ ClientCall f58075a;

            /* renamed from: b */
            public final /* synthetic */ MethodDescriptor f58076b;

            /* renamed from: c */
            public final /* synthetic */ C62901 f58077c;

            @Override // io.grpc.ClientCall
            /* renamed from: d */
            public void mo30814d(ReqT reqt) {
                this.f58076b.f58224d.mo30925b(reqt);
                Objects.requireNonNull(this.f58077c);
                throw null;
            }

            @Override // io.grpc.ClientCall
            /* renamed from: f */
            public void mo30816f(final ClientCall.Listener<RespT> listener, Metadata metadata) {
                this.f58075a.mo30816f(new PartialForwardingClientCallListener<Object>() { // from class: io.grpc.ClientInterceptors.1.1.1
                    @Override // io.grpc.ClientCall.Listener
                    /* renamed from: c */
                    public void mo12485c(Object obj) {
                        Objects.requireNonNull(AnonymousClass1.this.f58077c);
                        throw null;
                    }

                    @Override // io.grpc.PartialForwardingClientCallListener
                    /* renamed from: e */
                    public ClientCall.Listener<?> mo30818e() {
                        return listener;
                    }
                }, metadata);
            }

            @Override // io.grpc.PartialForwardingClientCall
            /* renamed from: g */
            public ClientCall<?, ?> mo12488g() {
                return this.f58075a;
            }
        }

        @Override // io.grpc.ClientInterceptor
        /* renamed from: a */
        public <ReqT, RespT> ClientCall<ReqT, RespT> mo30817a(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
            Objects.requireNonNull(methodDescriptor);
            MethodDescriptor.Builder m30921b = MethodDescriptor.m30921b();
            m30921b.f58230a = null;
            m30921b.f58231b = null;
            m30921b.f58232c = methodDescriptor.f58221a;
            m30921b.f58233d = methodDescriptor.f58222b;
            boolean z = methodDescriptor.f58227g;
            m30921b.f58234e = z;
            if (!z) {
                m30921b.f58235f = false;
            }
            boolean z2 = methodDescriptor.f58228h;
            m30921b.f58235f = z2;
            if (z2) {
                m30921b.f58234e = true;
            }
            m30921b.f58237h = methodDescriptor.f58229i;
            m30921b.f58236g = methodDescriptor.f58226f;
            m30921b.m30923a();
            throw null;
        }
    }

    public static abstract class CheckedForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public ClientCall<ReqT, RespT> f58080a;

        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        /* renamed from: f */
        public final void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
            try {
                m30819h(listener, metadata);
            } catch (Exception e2) {
                this.f58080a = (ClientCall<ReqT, RespT>) ClientInterceptors.f58074a;
                listener.mo12483a(Status.m30943d(e2), new Metadata());
            }
        }

        @Override // io.grpc.PartialForwardingClientCall
        /* renamed from: g */
        public final ClientCall<ReqT, RespT> mo12488g() {
            return this.f58080a;
        }

        /* renamed from: h */
        public abstract void m30819h(ClientCall.Listener<RespT> listener, Metadata metadata) throws Exception;
    }

    public static class InterceptorChannel extends Channel {
        @Override // io.grpc.Channel
        /* renamed from: d */
        public <ReqT, RespT> ClientCall<ReqT, RespT> mo30809d(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions) {
            throw null;
        }
    }
}
