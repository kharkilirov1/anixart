package io.grpc.internal;

import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes3.dex */
public interface ClientStreamListener extends StreamListener {

    public enum RpcProgress {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    /* renamed from: d */
    void mo31053d(Metadata metadata);

    /* renamed from: f */
    void mo31055f(Status status, RpcProgress rpcProgress, Metadata metadata);
}
