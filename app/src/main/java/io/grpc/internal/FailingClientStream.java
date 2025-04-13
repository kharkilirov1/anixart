package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* loaded from: classes3.dex */
public final class FailingClientStream extends NoopClientStream {

    /* renamed from: b */
    public boolean f58645b;

    /* renamed from: c */
    public final Status f58646c;

    /* renamed from: d */
    public final ClientStreamListener.RpcProgress f58647d;

    /* renamed from: e */
    public final ClientStreamTracer[] f58648e;

    public FailingClientStream(Status status, ClientStreamTracer[] clientStreamTracerArr) {
        ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
        Preconditions.m11179c(!status.m30945e(), "error must not be OK");
        this.f58646c = status;
        this.f58647d = rpcProgress;
        this.f58648e = clientStreamTracerArr;
    }

    @Override // io.grpc.internal.NoopClientStream, io.grpc.internal.ClientStream
    /* renamed from: n */
    public void mo30987n(InsightBuilder insightBuilder) {
        insightBuilder.m31116b("error", this.f58646c);
        insightBuilder.m31116b("progress", this.f58647d);
    }

    @Override // io.grpc.internal.NoopClientStream, io.grpc.internal.ClientStream
    /* renamed from: q */
    public void mo30976q(ClientStreamListener clientStreamListener) {
        Preconditions.m11192p(!this.f58645b, "already started");
        this.f58645b = true;
        for (ClientStreamTracer clientStreamTracer : this.f58648e) {
            clientStreamTracer.mo30958i(this.f58646c);
        }
        clientStreamListener.mo31055f(this.f58646c, this.f58647d, new Metadata());
    }
}
