package io.grpc.inprocess;

import io.grpc.ExperimentalApi;
import io.grpc.Internal;
import io.grpc.ServerBuilder;
import io.grpc.internal.AbstractServerImplBuilder;
import io.grpc.internal.ServerImplBuilder;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class InProcessServerBuilder extends AbstractServerImplBuilder<InProcessServerBuilder> {

    /* renamed from: io.grpc.inprocess.InProcessServerBuilder$1InProcessClientTransportServersBuilder, reason: invalid class name */
    final class C1InProcessClientTransportServersBuilder implements ServerImplBuilder.ClientTransportServersBuilder {
    }

    @Override // io.grpc.internal.AbstractServerImplBuilder
    @Internal
    /* renamed from: a */
    public ServerBuilder<?> mo30965a() {
        return null;
    }
}
