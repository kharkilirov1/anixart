package io.grpc.internal;

import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.Status;

/* loaded from: classes3.dex */
public interface ServerTransport extends InternalInstrumented<InternalChannelz.SocketStats> {
    /* renamed from: a */
    void mo30968a(Status status);
}
