package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.ChannelLogger;
import io.grpc.ExperimentalApi;
import io.grpc.Internal;
import io.grpc.ManagedChannelBuilder;
import io.grpc.TlsChannelCredentials;
import io.grpc.internal.AbstractManagedChannelImplBuilder;
import io.grpc.internal.AtomicBackoff;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.internal.SharedResourceHolder;
import io.grpc.internal.TransportTracer;
import io.grpc.okhttp.internal.CipherSuite;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.TlsVersion;
import java.net.SocketAddress;
import java.util.EnumSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class OkHttpChannelBuilder extends AbstractManagedChannelImplBuilder<OkHttpChannelBuilder> {

    /* renamed from: d */
    public static final SharedResourceHolder.Resource<Executor> f59200d;

    /* renamed from: a */
    public final ManagedChannelImplBuilder f59201a;

    /* renamed from: b */
    public Executor f59202b;

    /* renamed from: c */
    public ScheduledExecutorService f59203c;

    /* renamed from: io.grpc.okhttp.OkHttpChannelBuilder$2 */
    public static /* synthetic */ class C64752 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59204a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f59205b;

        static {
            int[] iArr = new int[NegotiationType.values().length];
            f59205b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59205b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[io.grpc.okhttp.NegotiationType.values().length];
            f59204a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59204a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum NegotiationType {
        /* JADX INFO: Fake field, exist only in values array */
        TLS,
        /* JADX INFO: Fake field, exist only in values array */
        PLAINTEXT
    }

    public final class OkHttpChannelDefaultPortProvider implements ManagedChannelImplBuilder.ChannelBuilderDefaultPortProvider {
        public OkHttpChannelDefaultPortProvider(OkHttpChannelBuilder okHttpChannelBuilder, C64741 c64741) {
        }
    }

    public final class OkHttpChannelTransportFactoryBuilder implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
        public OkHttpChannelTransportFactoryBuilder(OkHttpChannelBuilder okHttpChannelBuilder, C64741 c64741) {
        }
    }

    @Internal
    public static final class OkHttpTransportFactory implements ClientTransportFactory {

        /* renamed from: b */
        public boolean f59207b;

        /* renamed from: io.grpc.okhttp.OkHttpChannelBuilder$OkHttpTransportFactory$1 */
        public class RunnableC64761 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AtomicBackoff.State f59208b;

            @Override // java.lang.Runnable
            public void run() {
                AtomicBackoff.State state = this.f59208b;
                long j2 = state.f58450a;
                Math.max(2 * j2, j2);
                AtomicBackoff atomicBackoff = state.f58451b;
                Logger logger = AtomicBackoff.f58449a;
                Objects.requireNonNull(atomicBackoff);
                throw null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f59207b) {
                return;
            }
            this.f59207b = true;
        }

        @Override // io.grpc.internal.ClientTransportFactory
        /* renamed from: x0 */
        public ConnectionClientTransport mo30964x0(SocketAddress socketAddress, ClientTransportFactory.ClientTransportOptions clientTransportOptions, ChannelLogger channelLogger) {
            if (this.f59207b) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            throw null;
        }
    }

    public static final class SslSocketFactoryResult {
    }

    static {
        Logger.getLogger(OkHttpChannelBuilder.class.getName());
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(ConnectionSpec.f59349e);
        builder.m31276b(CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        builder.m31278d(TlsVersion.TLS_1_2);
        builder.m31277c(true);
        builder.m31275a();
        TimeUnit.DAYS.toNanos(1000L);
        f59200d = new SharedResourceHolder.Resource<Executor>() { // from class: io.grpc.okhttp.OkHttpChannelBuilder.1
            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: a */
            public Executor mo31098a() {
                return Executors.newCachedThreadPool(GrpcUtil.m31095f("grpc-okhttp-%d", true));
            }

            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: b */
            public void mo31099b(Executor executor) {
                ((ExecutorService) executor).shutdown();
            }
        };
        EnumSet.of(TlsChannelCredentials.Feature.MTLS, TlsChannelCredentials.Feature.CUSTOM_MANAGERS);
    }

    public OkHttpChannelBuilder(String str) {
        TransportTracer.Factory factory = TransportTracer.f59167h;
        TransportTracer.Factory factory2 = TransportTracer.f59167h;
        long j2 = GrpcUtil.f58667m;
        this.f59201a = new ManagedChannelImplBuilder(str, new OkHttpChannelTransportFactoryBuilder(this, null), new OkHttpChannelDefaultPortProvider(this, null));
    }

    public static OkHttpChannelBuilder forTarget(String str) {
        return new OkHttpChannelBuilder(str);
    }

    @Override // io.grpc.internal.AbstractManagedChannelImplBuilder
    @Internal
    /* renamed from: a */
    public ManagedChannelBuilder<?> mo30963a() {
        return this.f59201a;
    }

    public OkHttpChannelBuilder scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        Preconditions.m11187k(scheduledExecutorService, "scheduledExecutorService");
        this.f59203c = scheduledExecutorService;
        return this;
    }

    public OkHttpChannelBuilder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return this;
    }

    public OkHttpChannelBuilder transportExecutor(@Nullable Executor executor) {
        this.f59202b = executor;
        return this;
    }
}
