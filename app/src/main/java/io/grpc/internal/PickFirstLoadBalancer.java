package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.LoadBalancer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class PickFirstLoadBalancer extends LoadBalancer {

    /* renamed from: a */
    public final LoadBalancer.Helper f58936a;

    /* renamed from: io.grpc.internal.PickFirstLoadBalancer$1 */
    class C64411 implements LoadBalancer.SubchannelStateListener {

        /* renamed from: a */
        public final /* synthetic */ LoadBalancer.Subchannel f58937a;

        /* renamed from: b */
        public final /* synthetic */ PickFirstLoadBalancer f58938b;

        @Override // io.grpc.LoadBalancer.SubchannelStateListener
        /* renamed from: a */
        public void mo30890a(ConnectivityStateInfo connectivityStateInfo) {
            LoadBalancer.SubchannelPicker picker;
            PickFirstLoadBalancer pickFirstLoadBalancer = this.f58938b;
            LoadBalancer.Subchannel subchannel = this.f58937a;
            Objects.requireNonNull(pickFirstLoadBalancer);
            ConnectivityState connectivityState = connectivityStateInfo.f58096a;
            if (connectivityState == ConnectivityState.SHUTDOWN) {
                return;
            }
            if (connectivityState == ConnectivityState.TRANSIENT_FAILURE || connectivityState == ConnectivityState.IDLE) {
                pickFirstLoadBalancer.f58936a.mo30882a();
            }
            int ordinal = connectivityState.ordinal();
            if (ordinal == 0) {
                picker = new Picker(LoadBalancer.PickResult.f58190e);
            } else if (ordinal == 1) {
                picker = new Picker(LoadBalancer.PickResult.m30885b(subchannel));
            } else if (ordinal == 2) {
                picker = new Picker(LoadBalancer.PickResult.m30884a(connectivityStateInfo.f58097b));
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + connectivityState);
                }
                picker = pickFirstLoadBalancer.new RequestConnectionPicker(subchannel);
            }
            pickFirstLoadBalancer.f58936a.mo30883b(connectivityState, picker);
        }
    }

    /* renamed from: io.grpc.internal.PickFirstLoadBalancer$2 */
    public static /* synthetic */ class C64422 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58939a;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            f58939a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58939a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58939a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58939a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Picker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a */
        public final LoadBalancer.PickResult f58940a;

        public Picker(LoadBalancer.PickResult pickResult) {
            Preconditions.m11187k(pickResult, "result");
            this.f58940a = pickResult;
        }

        public String toString() {
            MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(Picker.class.getSimpleName(), null);
            toStringHelper.m11171e("result", this.f58940a);
            return toStringHelper.toString();
        }
    }

    public final class RequestConnectionPicker extends LoadBalancer.SubchannelPicker {

        /* renamed from: a */
        public final LoadBalancer.Subchannel f58941a;

        /* renamed from: b */
        public final AtomicBoolean f58942b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.PickFirstLoadBalancer$RequestConnectionPicker$1 */
        class RunnableC64431 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RequestConnectionPicker f58944b;

            @Override // java.lang.Runnable
            public void run() {
                this.f58944b.f58941a.mo30889c();
            }
        }

        public RequestConnectionPicker(LoadBalancer.Subchannel subchannel) {
            Preconditions.m11187k(subchannel, "subchannel");
            this.f58941a = subchannel;
        }
    }
}
