package io.grpc.internal;

import com.google.common.base.Joiner;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.HandlerRegistry;
import io.grpc.ServerBuilder;
import io.grpc.internal.SharedResourceHolder;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ServerImplBuilder extends ServerBuilder<ServerImplBuilder> {

    public interface ClientTransportServersBuilder {
    }

    public static final class DefaultFallbackRegistry extends HandlerRegistry {
    }

    static {
        Logger.getLogger(ServerImplBuilder.class.getName());
        SharedResourceHolder.Resource<Executor> resource = GrpcUtil.f58670p;
        Joiner joiner = DecompressorRegistry.f58128c;
        CompressorRegistry compressorRegistry = CompressorRegistry.f58088b;
        TimeUnit.SECONDS.toMillis(120L);
    }
}
