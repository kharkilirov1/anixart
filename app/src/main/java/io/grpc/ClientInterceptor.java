package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public interface ClientInterceptor {
    /* renamed from: a */
    <ReqT, RespT> ClientCall<ReqT, RespT> mo30817a(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel);
}
