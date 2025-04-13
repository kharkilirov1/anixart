package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ConnectivityState;
import io.grpc.Context;
import io.grpc.EquivalentAddressGroup;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.ManagedClientTransport;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
final class OobChannel extends ManagedChannel implements InternalInstrumented<InternalChannelz.ChannelStats> {

    /* renamed from: a */
    public static final /* synthetic */ int f58933a = 0;

    /* renamed from: io.grpc.internal.OobChannel$1 */
    public class C64371 implements ClientCallImpl.ClientStreamProvider {
        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        /* renamed from: a */
        public ClientStream mo31059a(MethodDescriptor<?, ?> methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            GrpcUtil.m31093d(callOptions, metadata, 0, false);
            Context mo30831b = context.mo30831b();
            try {
                int i2 = OobChannel.f58933a;
                Objects.requireNonNull(null);
                throw null;
            } catch (Throwable th) {
                context.mo30833h(mo30831b);
                throw th;
            }
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$1OobErrorPicker, reason: invalid class name */
    final class C1OobErrorPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a */
        public final LoadBalancer.PickResult f58934a;

        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1OobErrorPicker.class.getSimpleName(), null);
            toStringHelper.m11171e("errorResult", this.f58934a);
            return toStringHelper.toString();
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$1OobSubchannelPicker, reason: invalid class name */
    final class C1OobSubchannelPicker extends LoadBalancer.SubchannelPicker {
        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1OobSubchannelPicker.class.getSimpleName(), null);
            toStringHelper.m11171e("result", null);
            return toStringHelper.toString();
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$2 */
    class C64382 implements ManagedClientTransport.Listener {
        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: a */
        public void mo31127a() {
            int i2 = OobChannel.f58933a;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: b */
        public void mo31128b(Status status) {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: c */
        public void mo31129c() {
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: d */
        public void mo31130d(boolean z) {
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$3 */
    class C64393 extends AbstractSubchannel {
        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: a */
        public List<EquivalentAddressGroup> mo30887a() {
            throw null;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: b */
        public Attributes mo30888b() {
            return Attributes.f58053b;
        }

        @Override // io.grpc.LoadBalancer.Subchannel
        /* renamed from: c */
        public void mo30889c() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.OobChannel$4 */
    public static /* synthetic */ class C64404 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58935a;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            f58935a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58935a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58935a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Logger.getLogger(OobChannel.class.getName());
    }

    @Override // io.grpc.Channel
    /* renamed from: d */
    public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> mo30809d(MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
        Executor executor = callOptions.f58060b;
        if (executor == null) {
            executor = null;
        }
        return new ClientCallImpl(methodDescriptor, executor, callOptions, null, null, null);
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
