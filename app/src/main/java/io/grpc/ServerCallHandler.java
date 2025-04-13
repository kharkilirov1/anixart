package io.grpc;

import io.grpc.ServerCall;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public interface ServerCallHandler<RequestT, ResponseT> {
    /* renamed from: a */
    ServerCall.Listener<RequestT> mo30934a(ServerCall<RequestT, ResponseT> serverCall, Metadata metadata);
}
