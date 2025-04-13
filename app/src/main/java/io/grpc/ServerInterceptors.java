package io.grpc;

import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ServerInterceptors {

    /* renamed from: io.grpc.ServerInterceptors$1 */
    class C63071 implements MethodDescriptor.Marshaller<InputStream> {
        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: a */
        public InputStream mo30924a(InputStream inputStream) {
            if (inputStream.markSupported()) {
                return inputStream;
            }
            return inputStream instanceof KnownLength ? new KnownLengthBufferedInputStream(inputStream) : new BufferedInputStream(inputStream);
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: b */
        public InputStream mo30925b(InputStream inputStream) {
            return inputStream;
        }
    }

    /* renamed from: io.grpc.ServerInterceptors$2 */
    class C63082 implements ServerCallHandler<Object, Object> {

        /* renamed from: io.grpc.ServerInterceptors$2$1, reason: invalid class name */
        public class AnonymousClass1 extends PartialForwardingServerCall<Object, Object> {

            /* renamed from: a */
            public final /* synthetic */ ServerCall f58268a;

            /* renamed from: b */
            public final /* synthetic */ C63082 f58269b;

            @Override // io.grpc.ServerCall
            /* renamed from: d */
            public MethodDescriptor<Object, Object> mo30870d() {
                Objects.requireNonNull(this.f58269b);
                return null;
            }

            @Override // io.grpc.ServerCall
            /* renamed from: i */
            public void mo30867i(Object obj) {
                Objects.requireNonNull(this.f58269b);
                throw null;
            }

            @Override // io.grpc.PartialForwardingServerCall
            /* renamed from: l */
            public ServerCall<Object, Object> mo30871l() {
                return this.f58268a;
            }
        }

        /* renamed from: io.grpc.ServerInterceptors$2$2, reason: invalid class name */
        public class AnonymousClass2 extends PartialForwardingServerCallListener<Object> {

            /* renamed from: a */
            public final /* synthetic */ ServerCall.Listener f58270a;

            /* renamed from: b */
            public final /* synthetic */ C63082 f58271b;

            @Override // io.grpc.ServerCall.Listener
            /* renamed from: d */
            public void mo30849d(Object obj) {
                Objects.requireNonNull(this.f58271b);
                throw null;
            }

            @Override // io.grpc.PartialForwardingServerCallListener
            /* renamed from: f */
            public ServerCall.Listener<Object> mo30872f() {
                return this.f58270a;
            }
        }

        @Override // io.grpc.ServerCallHandler
        /* renamed from: a */
        public ServerCall.Listener<Object> mo30934a(ServerCall<Object, Object> serverCall, Metadata metadata) {
            throw null;
        }
    }

    public static final class InterceptCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {

        /* renamed from: a */
        public final ServerInterceptor f58272a;

        /* renamed from: b */
        public final ServerCallHandler<ReqT, RespT> f58273b;

        @Override // io.grpc.ServerCallHandler
        /* renamed from: a */
        public ServerCall.Listener<ReqT> mo30934a(ServerCall<ReqT, RespT> serverCall, Metadata metadata) {
            return this.f58272a.mo30935a(serverCall, metadata, this.f58273b);
        }
    }

    public static final class KnownLengthBufferedInputStream extends BufferedInputStream implements KnownLength {
        public KnownLengthBufferedInputStream(InputStream inputStream) {
            super(inputStream);
        }
    }
}
