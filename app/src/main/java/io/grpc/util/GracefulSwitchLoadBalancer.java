package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.ConnectivityState;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import java.util.Objects;
import javax.annotation.concurrent.NotThreadSafe;

@ExperimentalApi
@NotThreadSafe
/* loaded from: classes3.dex */
public final class GracefulSwitchLoadBalancer extends ForwardingLoadBalancer {

    /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$1 */
    public class C64921 extends LoadBalancer {

        /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$1$1ErrorPicker, reason: invalid class name */
        class C1ErrorPicker extends LoadBalancer.SubchannelPicker {

            /* renamed from: a */
            public final /* synthetic */ Status f59523a;

            public String toString() {
                MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(C1ErrorPicker.class.getSimpleName(), null);
                toStringHelper.m11171e("error", this.f59523a);
                return toStringHelper.toString();
            }
        }
    }

    /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$1PendingHelper, reason: invalid class name */
    class C1PendingHelper extends ForwardingLoadBalancerHelper {
        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        /* renamed from: b */
        public void mo30883b(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            throw null;
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper
        /* renamed from: c */
        public LoadBalancer.Helper mo31326c() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: io.grpc.util.GracefulSwitchLoadBalancer$2 */
    public class C64932 extends LoadBalancer.SubchannelPicker {
        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    @Override // io.grpc.util.ForwardingLoadBalancer
    /* renamed from: a */
    public LoadBalancer mo31325a() {
        return null;
    }
}
