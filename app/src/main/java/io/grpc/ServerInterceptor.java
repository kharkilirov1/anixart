package io.grpc;

import io.grpc.ServerCall;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public interface ServerInterceptor {
    /* renamed from: a */
    <ReqT, RespT> ServerCall.Listener<ReqT> mo30935a(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler);
}
