package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.InternalLogId;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* loaded from: classes3.dex */
class FailingClientTransport implements ClientTransport {

    /* renamed from: a */
    @VisibleForTesting
    public final Status f58649a;

    /* renamed from: b */
    public final ClientStreamListener.RpcProgress f58650b;

    /* renamed from: io.grpc.internal.FailingClientTransport$1 */
    class RunnableC63891 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public FailingClientTransport(Status status, ClientStreamListener.RpcProgress rpcProgress) {
        Preconditions.m11179c(!status.m30945e(), "error must not be OK");
        this.f58649a = status;
        this.f58650b = rpcProgress;
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
