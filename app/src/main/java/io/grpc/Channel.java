package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
public abstract class Channel {
    /* renamed from: d */
    public abstract <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions);
}
