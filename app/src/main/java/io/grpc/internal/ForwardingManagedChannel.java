package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;

/* loaded from: classes3.dex */
abstract class ForwardingManagedChannel extends ManagedChannel {
    @Override // io.grpc.Channel
    /* renamed from: d */
    public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
        throw null;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", null);
        return m11166b.toString();
    }
}
