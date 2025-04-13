package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ChannelCredentials;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientStreamTracer;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.Context;
import io.grpc.EquivalentAddressGroup;
import io.grpc.ForwardingChannelBuilder;
import io.grpc.ForwardingClientCall;
import io.grpc.InternalChannelz;
import io.grpc.InternalConfigSelector;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.CallTracer;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.InternalSubchannel;
import io.grpc.internal.ManagedChannelImplBuilder;
import io.grpc.internal.ManagedChannelServiceConfig;
import io.grpc.internal.ManagedClientTransport;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
final class ManagedChannelImpl extends ManagedChannel implements InternalInstrumented<InternalChannelz.ChannelStats> {

    /* renamed from: c */
    @VisibleForTesting
    public static final Logger f58814c = Logger.getLogger(ManagedChannelImpl.class.getName());

    /* renamed from: d */
    @VisibleForTesting
    public static final Pattern f58815d = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: e */
    @VisibleForTesting
    public static final Status f58816e;

    /* renamed from: f */
    @VisibleForTesting
    public static final Status f58817f;

    /* renamed from: g */
    public static final ManagedChannelServiceConfig f58818g;

    /* renamed from: h */
    public static final InternalConfigSelector f58819h;

    /* renamed from: i */
    public static final ClientCall<Object, Object> f58820i;

    /* renamed from: a */
    @Nullable
    public volatile LoadBalancer.SubchannelPicker f58821a;

    /* renamed from: b */
    @Nullable
    public SynchronizationContext.ScheduledHandle f58822b;

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1CancelIdleTimer, reason: invalid class name */
    final class C1CancelIdleTimer implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1ChannelCallTracerFactory, reason: invalid class name */
    final class C1ChannelCallTracerFactory implements CallTracer.Factory {
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1NotifyStateChanged, reason: invalid class name */
    final class C1NotifyStateChanged implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1PanicSubchannelPicker, reason: invalid class name */
    final class C1PanicSubchannelPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a */
        public final LoadBalancer.PickResult f58823a;

        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1PanicSubchannelPicker.class.getSimpleName(), null);
            toStringHelper.m11171e("panicPickResult", this.f58823a);
            return toStringHelper.toString();
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1PrepareToLoseNetworkRunnable, reason: invalid class name */
    final class C1PrepareToLoseNetworkRunnable implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ManagedChannelImpl f58824b;

        @Override // java.lang.Runnable
        public void run() {
            ManagedChannelImpl managedChannelImpl = this.f58824b;
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(managedChannelImpl);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1RequestConnection, reason: invalid class name */
    final class C1RequestConnection implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1ResetConnectBackoff, reason: invalid class name */
    final class C1ResetConnectBackoff implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1Shutdown, reason: invalid class name */
    final class C1Shutdown implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1ShutdownNow, reason: invalid class name */
    final class C1ShutdownNow implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$1StatsFetcher, reason: invalid class name */
    final class C1StatsFetcher implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            new InternalChannelz.ChannelStats.Builder();
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$2 */
    public class C64192 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = ManagedChannelImpl.f58814c;
            Level level = Level.SEVERE;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$3 */
    class ExecutorC64203 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.ManagedChannelImpl$4 */
    class C64214 extends ForwardingNameResolver {
    }

    public final class ChannelStreamProvider implements ClientCallImpl.ClientStreamProvider {

        /* renamed from: io.grpc.internal.ManagedChannelImpl$ChannelStreamProvider$1ExitIdleModeForTransport, reason: invalid class name */
        final class C1ExitIdleModeForTransport implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ChannelStreamProvider f58825b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f58825b);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$ChannelStreamProvider$1RetryStream, reason: invalid class name */
        public final class C1RetryStream<ReqT> extends RetriableStream<ReqT> {

            /* renamed from: B */
            public final /* synthetic */ MethodDescriptor f58826B;

            /* renamed from: C */
            public final /* synthetic */ CallOptions f58827C;

            /* renamed from: D */
            public final /* synthetic */ ChannelStreamProvider f58828D;

            @Override // io.grpc.internal.RetriableStream
            /* renamed from: C */
            public ClientStream mo31138C(Metadata metadata, ClientStreamTracer.Factory factory, int i2, boolean z) {
                CallOptions callOptions = this.f58827C;
                Objects.requireNonNull(callOptions);
                CallOptions callOptions2 = new CallOptions(callOptions);
                ArrayList arrayList = new ArrayList(callOptions.f58065g.size() + 1);
                arrayList.addAll(callOptions.f58065g);
                arrayList.add(factory);
                callOptions2.f58065g = Collections.unmodifiableList(arrayList);
                GrpcUtil.m31093d(callOptions2, metadata, i2, z);
                ChannelStreamProvider channelStreamProvider = this.f58828D;
                new PickSubchannelArgsImpl(this.f58826B, metadata, callOptions2);
                Objects.requireNonNull(channelStreamProvider);
                throw null;
            }

            @Override // io.grpc.internal.RetriableStream
            /* renamed from: D */
            public void mo31139D() {
                Objects.requireNonNull(this.f58828D);
                Logger logger = ManagedChannelImpl.f58814c;
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // io.grpc.internal.RetriableStream
            /* renamed from: E */
            public Status mo31140E() {
                Objects.requireNonNull(this.f58828D);
                Logger logger = ManagedChannelImpl.f58814c;
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        /* renamed from: a */
        public ClientStream mo31059a(MethodDescriptor<?, ?> methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static final class ConfigSelectingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public final InternalConfigSelector f58829a;

        /* renamed from: b */
        public final Channel f58830b;

        /* renamed from: c */
        public final Executor f58831c;

        /* renamed from: d */
        public final MethodDescriptor<ReqT, RespT> f58832d;

        /* renamed from: e */
        public final Context f58833e;

        /* renamed from: f */
        public CallOptions f58834f;

        /* renamed from: g */
        public ClientCall<ReqT, RespT> f58835g;

        @Override // io.grpc.PartialForwardingClientCall, io.grpc.ClientCall
        /* renamed from: a */
        public void mo30812a(@Nullable String str, @Nullable Throwable th) {
            ClientCall<ReqT, RespT> clientCall = this.f58835g;
            if (clientCall != null) {
                clientCall.mo30812a(str, th);
            }
        }

        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        /* renamed from: f */
        public void mo30816f(final ClientCall.Listener<RespT> listener, Metadata metadata) {
            InternalConfigSelector.Result mo30877a = this.f58829a.mo30877a(new PickSubchannelArgsImpl(this.f58832d, metadata, this.f58834f));
            final Status status = mo30877a.f58172a;
            if (!status.m30945e()) {
                this.f58831c.execute(new ContextRunnable(this) { // from class: io.grpc.internal.ManagedChannelImpl.ConfigSelectingClientCall.1CloseInContext
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this.f58833e);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        listener.mo12483a(status, new Metadata());
                    }
                });
                this.f58835g = (ClientCall<ReqT, RespT>) ManagedChannelImpl.f58820i;
                return;
            }
            ClientInterceptor clientInterceptor = mo30877a.f58174c;
            ManagedChannelServiceConfig.MethodInfo m31142a = ((ManagedChannelServiceConfig) mo30877a.f58173b).m31142a(this.f58832d);
            if (m31142a != null) {
                this.f58834f = this.f58834f.m30807e(ManagedChannelServiceConfig.MethodInfo.f58872g, m31142a);
            }
            if (clientInterceptor != null) {
                this.f58835g = clientInterceptor.mo30817a(this.f58832d, this.f58834f, this.f58830b);
            } else {
                this.f58835g = this.f58830b.mo30809d(this.f58832d, this.f58834f);
            }
            this.f58835g.mo30816f(listener, metadata);
        }

        @Override // io.grpc.PartialForwardingClientCall
        /* renamed from: g */
        public ClientCall<ReqT, RespT> mo12488g() {
            return this.f58835g;
        }
    }

    @VisibleForTesting
    public class DelayedNameResolverRefresh implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ManagedChannelImpl f58838b;

        @Override // java.lang.Runnable
        public void run() {
            this.f58838b.f58822b = null;
            throw null;
        }
    }

    public final class DelayedTransportListener implements ManagedClientTransport.Listener {
        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: a */
        public void mo31127a() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: b */
        public void mo31128b(Status status) {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: c */
        public void mo31129c() {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: d */
        public void mo31130d(boolean z) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static final class ExecutorHolder {
    }

    public final class IdleModeStateAggregator extends InUseStateAggregator<Object> {
        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: a */
        public void mo30974a() {
            throw null;
        }

        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: b */
        public void mo30975b() {
            Logger logger = ManagedChannelImpl.f58814c;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public class IdleModeTimer implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public final class LbHelperImpl extends LoadBalancer.Helper {

        /* renamed from: a */
        public final /* synthetic */ ManagedChannelImpl f58839a;

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1AddOobChannel, reason: invalid class name */
        final class C1AddOobChannel implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1LoadBalancerRefreshNameResolution, reason: invalid class name */
        public final class C1LoadBalancerRefreshNameResolution implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ LbHelperImpl f58840b;

            @Override // java.lang.Runnable
            public void run() {
                ManagedChannelImpl managedChannelImpl = this.f58840b.f58839a;
                Logger logger = ManagedChannelImpl.f58814c;
                Objects.requireNonNull(managedChannelImpl);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ManagedOobChannelCallback, reason: invalid class name */
        final class C1ManagedOobChannelCallback extends InternalSubchannel.Callback {
            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: c */
            public void mo31123c(InternalSubchannel internalSubchannel, ConnectivityStateInfo connectivityStateInfo) {
                throw null;
            }

            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: d */
            public void mo31124d(InternalSubchannel internalSubchannel) {
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ResolvingOobChannelBuilder, reason: invalid class name */
        final class C1ResolvingOobChannelBuilder extends ForwardingChannelBuilder<C1ResolvingOobChannelBuilder> {

            /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1ResolvingOobChannelBuilder$1 */
            class C64231 implements ManagedChannelImplBuilder.ClientTransportFactoryBuilder {
            }

            @Override // io.grpc.ForwardingChannelBuilder
            /* renamed from: a */
            public ManagedChannelBuilder<?> mo30859a() {
                return null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$LbHelperImpl$1UpdateBalancingState, reason: invalid class name */
        public final class C1UpdateBalancingState implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ LoadBalancer.SubchannelPicker f58841b;

            /* renamed from: c */
            public final /* synthetic */ LbHelperImpl f58842c;

            @Override // java.lang.Runnable
            public void run() {
                LbHelperImpl lbHelperImpl = this.f58842c;
                Objects.requireNonNull(lbHelperImpl.f58839a);
                if (lbHelperImpl != null) {
                    return;
                }
                this.f58842c.f58839a.f58821a = this.f58841b;
                throw null;
            }
        }

        public final class DefaultChannelCreds extends ChannelCredentials {
        }

        @Override // io.grpc.LoadBalancer.Helper
        /* renamed from: a */
        public void mo30882a() {
            Objects.requireNonNull(this.f58839a);
            throw null;
        }

        @Override // io.grpc.LoadBalancer.Helper
        /* renamed from: b */
        public void mo30883b(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            Objects.requireNonNull(this.f58839a);
            throw null;
        }
    }

    public final class NameResolverListener extends NameResolver.Listener2 {

        /* renamed from: a */
        public final /* synthetic */ ManagedChannelImpl f58843a;

        /* renamed from: io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NameResolverErrorHandler, reason: invalid class name */
        public final class C1NameResolverErrorHandler implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Status f58844b;

            /* renamed from: c */
            public final /* synthetic */ NameResolverListener f58845c;

            @Override // java.lang.Runnable
            public void run() {
                NameResolverListener.m31141b(this.f58845c, this.f58844b);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved, reason: invalid class name */
        final class C1NamesResolved implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ NameResolver.ResolutionResult f58846b;

            /* renamed from: c */
            public final /* synthetic */ NameResolverListener f58847c;

            @Override // java.lang.Runnable
            public void run() {
                List<EquivalentAddressGroup> list = this.f58846b.f58246a;
                ManagedChannelImpl managedChannelImpl = this.f58847c.f58843a;
                Logger logger = ManagedChannelImpl.f58814c;
                Objects.requireNonNull(managedChannelImpl);
                Attributes attributes = this.f58846b.f58247b;
                throw null;
            }
        }

        /* renamed from: b */
        public static void m31141b(NameResolverListener nameResolverListener, Status status) {
            Objects.requireNonNull(nameResolverListener);
            Logger logger = ManagedChannelImpl.f58814c;
            Level level = Level.WARNING;
            Objects.requireNonNull(nameResolverListener.f58843a);
            logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{null, status});
            Objects.requireNonNull(nameResolverListener.f58843a);
            throw null;
        }

        @Override // io.grpc.NameResolver.Listener2, io.grpc.NameResolver.Listener
        /* renamed from: a */
        public void mo30926a(Status status) {
            Preconditions.m11179c(!status.m30945e(), "the error status must not be OK");
            Objects.requireNonNull(this.f58843a);
            throw null;
        }
    }

    public class RealChannel extends Channel {

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$1 */
        public class C64241 extends Channel {
            @Override // io.grpc.Channel
            /* renamed from: d */
            public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$1RealChannelShutdown, reason: invalid class name */
        final class C1RealChannelShutdown implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$1RealChannelShutdownNow, reason: invalid class name */
        final class C1RealChannelShutdownNow implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$2 */
        public class RunnableC64252 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RealChannel f58848b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f58848b);
                throw null;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$3 */
        public class C64263<ReqT, RespT> extends ClientCall<ReqT, RespT> {
            @Override // io.grpc.ClientCall
            /* renamed from: a */
            public void mo30812a(@Nullable String str, @Nullable Throwable th) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: b */
            public void mo12487b() {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: c */
            public void mo30813c(int i2) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: d */
            public void mo30814d(ReqT reqt) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: f */
            public void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
                listener.mo12483a(ManagedChannelImpl.f58816e, new Metadata());
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$4 */
        public class RunnableC64274 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RealChannel f58849b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f58849b);
                throw null;
            }
        }

        public final class PendingCall<ReqT, RespT> extends DelayedClientCall<ReqT, RespT> {

            /* renamed from: l */
            public final /* synthetic */ RealChannel f58850l;

            /* renamed from: io.grpc.internal.ManagedChannelImpl$RealChannel$PendingCall$1 */
            class RunnableC64281 implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ PendingCall f58851b;

                @Override // java.lang.Runnable
                public void run() {
                    Objects.requireNonNull(this.f58851b);
                    throw null;
                }
            }

            public final class PendingCallRemoval implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ PendingCall f58852b;

                @Override // java.lang.Runnable
                public void run() {
                    Objects.requireNonNull(this.f58852b.f58850l);
                    throw null;
                }
            }

            @Override // io.grpc.internal.DelayedClientCall
            /* renamed from: g */
            public void mo31073g() {
                Objects.requireNonNull(this.f58850l);
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // io.grpc.Channel
        /* renamed from: d */
        public <ReqT, RespT> ClientCall<ReqT, RespT> mo30809d(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions) {
            throw null;
        }
    }

    public enum ResolutionState {
        /* JADX INFO: Fake field, exist only in values array */
        NO_RESOLUTION,
        /* JADX INFO: Fake field, exist only in values array */
        SUCCESS,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR
    }

    public static final class RestrictedScheduledExecutor implements ScheduledExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            throw null;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j2, TimeUnit timeUnit) {
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            throw null;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            throw null;
        }
    }

    public final class SubchannelImpl extends AbstractSubchannel {

        /* renamed from: a */
        public final LoadBalancer.CreateSubchannelArgs f58854a;

        /* renamed from: b */
        public final LbHelperImpl f58855b;

        /* renamed from: c */
        public final /* synthetic */ ManagedChannelImpl f58856c;

        /* renamed from: io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ManagedInternalSubchannelCallback, reason: invalid class name */
        final class C1ManagedInternalSubchannelCallback extends InternalSubchannel.Callback {

            /* renamed from: a */
            public final /* synthetic */ LoadBalancer.SubchannelStateListener f58857a;

            /* renamed from: b */
            public final /* synthetic */ SubchannelImpl f58858b;

            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: a */
            public void mo31121a(InternalSubchannel internalSubchannel) {
                Objects.requireNonNull(this.f58858b.f58856c);
                throw null;
            }

            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: b */
            public void mo31122b(InternalSubchannel internalSubchannel) {
                Objects.requireNonNull(this.f58858b.f58856c);
                throw null;
            }

            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: c */
            public void mo31123c(InternalSubchannel internalSubchannel, ConnectivityStateInfo connectivityStateInfo) {
                Preconditions.m11192p(this.f58857a != null, "listener is null");
                this.f58857a.mo30890a(connectivityStateInfo);
                ConnectivityState connectivityState = connectivityStateInfo.f58096a;
                if (connectivityState == ConnectivityState.TRANSIENT_FAILURE || connectivityState == ConnectivityState.IDLE) {
                    Objects.requireNonNull(this.f58858b.f58855b);
                    Objects.requireNonNull(this.f58858b.f58855b);
                    ManagedChannelImpl.f58814c.log(Level.WARNING, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                    Objects.requireNonNull(this.f58858b.f58856c);
                    throw null;
                }
            }

            @Override // io.grpc.internal.InternalSubchannel.Callback
            /* renamed from: d */
            public void mo31124d(InternalSubchannel internalSubchannel) {
                ManagedChannelImpl managedChannelImpl = this.f58858b.f58856c;
                Logger logger = ManagedChannelImpl.f58814c;
                Objects.requireNonNull(managedChannelImpl);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ShutdownSubchannel, reason: invalid class name */
        final class C1ShutdownSubchannel implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ SubchannelImpl f58859b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f58859b);
                Status status = ManagedChannelImpl.f58817f;
                throw null;
            }
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: a */
        public List<EquivalentAddressGroup> mo30887a() {
            Objects.requireNonNull(this.f58856c);
            throw null;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: b */
        public Attributes mo30888b() {
            return this.f58854a.f58186b;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: c */
        public void mo30889c() {
            Objects.requireNonNull(this.f58856c);
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public final class UncommittedRetriableStreamsRegistry {
    }

    static {
        Status status = Status.f58287n;
        status.m30947g("Channel shutdownNow invoked");
        f58816e = status.m30947g("Channel shutdown invoked");
        f58817f = status.m30947g("Subchannel shutdown invoked");
        f58818g = new ManagedChannelServiceConfig(null, new HashMap(), new HashMap(), null, null, null);
        f58819h = new InternalConfigSelector() { // from class: io.grpc.internal.ManagedChannelImpl.1
            @Override // io.grpc.InternalConfigSelector
            /* renamed from: a */
            public InternalConfigSelector.Result mo30877a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
                throw new IllegalStateException("Resolution is pending");
            }
        };
        f58820i = new ClientCall<Object, Object>() { // from class: io.grpc.internal.ManagedChannelImpl.5
            @Override // io.grpc.ClientCall
            /* renamed from: a */
            public void mo30812a(String str, Throwable th) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: b */
            public void mo12487b() {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: c */
            public void mo30813c(int i2) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: d */
            public void mo30814d(Object obj) {
            }

            @Override // io.grpc.ClientCall
            /* renamed from: f */
            public void mo30816f(ClientCall.Listener<Object> listener, Metadata metadata) {
            }
        };
    }

    @Override // io.grpc.Channel
    /* renamed from: d */
    public <ReqT, RespT> ClientCall<ReqT, RespT> mo30809d(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions) {
        throw null;
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return null;
    }

    public String toString() {
        MoreObjects.m11166b(this);
        throw null;
    }
}
