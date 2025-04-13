package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.InternalChannelz;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.NameResolverRegistry;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ManagedChannelImplBuilder extends ManagedChannelBuilder<ManagedChannelImplBuilder> {

    /* renamed from: e */
    public static final ObjectPool<? extends Executor> f58860e;

    /* renamed from: a */
    public ObjectPool<? extends Executor> f58861a;

    /* renamed from: b */
    public ObjectPool<? extends Executor> f58862b;

    /* renamed from: c */
    public final ClientTransportFactoryBuilder f58863c;

    /* renamed from: d */
    public final ChannelBuilderDefaultPortProvider f58864d;

    public interface ChannelBuilderDefaultPortProvider {
    }

    public interface ClientTransportFactoryBuilder {
    }

    public static class DirectAddressNameResolverFactory extends NameResolver.Factory {

        /* renamed from: io.grpc.internal.ManagedChannelImplBuilder$DirectAddressNameResolverFactory$1 */
        class C64301 extends NameResolver {
        }

        @Override // io.grpc.NameResolver.Factory
        /* renamed from: a */
        public String mo30927a() {
            return "directaddress";
        }
    }

    public static final class FixedPortProvider implements ChannelBuilderDefaultPortProvider {
    }

    public static final class ManagedChannelDefaultPortProvider implements ChannelBuilderDefaultPortProvider {
    }

    public static class UnsupportedClientTransportFactoryBuilder implements ClientTransportFactoryBuilder {
    }

    static {
        Logger.getLogger(ManagedChannelImplBuilder.class.getName());
        TimeUnit.MINUTES.toMillis(30L);
        TimeUnit.SECONDS.toMillis(1L);
        f58860e = new SharedResourcePool(GrpcUtil.f58670p);
        DecompressorRegistry decompressorRegistry = DecompressorRegistry.f58129d;
        CompressorRegistry compressorRegistry = CompressorRegistry.f58088b;
    }

    public ManagedChannelImplBuilder(String str, ClientTransportFactoryBuilder clientTransportFactoryBuilder, @Nullable ChannelBuilderDefaultPortProvider channelBuilderDefaultPortProvider) {
        ObjectPool<? extends Executor> objectPool = f58860e;
        this.f58861a = objectPool;
        this.f58862b = objectPool;
        new ArrayList();
        Objects.requireNonNull(NameResolverRegistry.m30930a());
        Logger logger = InternalChannelz.f58149f;
        Preconditions.m11187k(str, "target");
        this.f58863c = clientTransportFactoryBuilder;
        this.f58864d = channelBuilderDefaultPortProvider;
    }
}
