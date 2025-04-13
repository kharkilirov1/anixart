package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import io.grpc.LoadBalancer;

/* loaded from: classes3.dex */
public final class AutoConfiguredLoadBalancerFactory {

    @VisibleForTesting
    public final class AutoConfiguredLoadBalancer {
    }

    public static final class EmptyPicker extends LoadBalancer.SubchannelPicker {
        public String toString() {
            return new MoreObjects.ToStringHelper(EmptyPicker.class.getSimpleName(), null).toString();
        }
    }

    public static final class FailingPicker extends LoadBalancer.SubchannelPicker {
    }

    public static final class NoopLoadBalancer extends LoadBalancer {
    }

    @VisibleForTesting
    public static final class PolicyException extends Exception {
    }
}
