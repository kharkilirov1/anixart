package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.InternalConfigSelector;
import io.grpc.LoadBalancer;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.RetriableStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class ManagedChannelServiceConfig {

    /* renamed from: a */
    @Nullable
    public final MethodInfo f58866a;

    /* renamed from: b */
    public final Map<String, MethodInfo> f58867b;

    /* renamed from: c */
    public final Map<String, MethodInfo> f58868c;

    /* renamed from: d */
    @Nullable
    public final RetriableStream.Throttle f58869d;

    /* renamed from: e */
    @Nullable
    public final Object f58870e;

    /* renamed from: f */
    @Nullable
    public final Map<String, ?> f58871f;

    public static final class MethodInfo {

        /* renamed from: g */
        public static final CallOptions.Key<MethodInfo> f58872g = CallOptions.Key.m30808a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        public final Long f58873a;

        /* renamed from: b */
        public final Boolean f58874b;

        /* renamed from: c */
        public final Integer f58875c;

        /* renamed from: d */
        public final Integer f58876d;

        /* renamed from: e */
        public final RetryPolicy f58877e;

        /* renamed from: f */
        public final HedgingPolicy f58878f;

        public boolean equals(Object obj) {
            if (!(obj instanceof MethodInfo)) {
                return false;
            }
            MethodInfo methodInfo = (MethodInfo) obj;
            return Objects.m11173a(this.f58873a, methodInfo.f58873a) && Objects.m11173a(this.f58874b, methodInfo.f58874b) && Objects.m11173a(this.f58875c, methodInfo.f58875c) && Objects.m11173a(this.f58876d, methodInfo.f58876d) && Objects.m11173a(this.f58877e, methodInfo.f58877e) && Objects.m11173a(this.f58878f, methodInfo.f58878f);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f58873a, this.f58874b, this.f58875c, this.f58876d, this.f58877e, this.f58878f});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("timeoutNanos", this.f58873a);
            m11166b.m11171e("waitForReady", this.f58874b);
            m11166b.m11171e("maxInboundMessageSize", this.f58875c);
            m11166b.m11171e("maxOutboundMessageSize", this.f58876d);
            m11166b.m11171e("retryPolicy", this.f58877e);
            m11166b.m11171e("hedgingPolicy", this.f58878f);
            return m11166b.toString();
        }
    }

    public static final class ServiceConfigConvertedSelector extends InternalConfigSelector {

        /* renamed from: a */
        public final ManagedChannelServiceConfig f58879a;

        @Override // io.grpc.InternalConfigSelector
        /* renamed from: a */
        public InternalConfigSelector.Result mo30877a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            InternalConfigSelector.Result.Builder builder = new InternalConfigSelector.Result.Builder(null);
            ManagedChannelServiceConfig managedChannelServiceConfig = this.f58879a;
            Preconditions.m11187k(managedChannelServiceConfig, "config");
            builder.f58175a = managedChannelServiceConfig;
            return new InternalConfigSelector.Result(Status.f58278e, managedChannelServiceConfig, null, null);
        }
    }

    public ManagedChannelServiceConfig(@Nullable MethodInfo methodInfo, Map<String, MethodInfo> map, Map<String, MethodInfo> map2, @Nullable RetriableStream.Throttle throttle, @Nullable Object obj, @Nullable Map<String, ?> map3) {
        this.f58866a = methodInfo;
        this.f58867b = Collections.unmodifiableMap(new HashMap(map));
        this.f58868c = Collections.unmodifiableMap(new HashMap(map2));
        this.f58869d = throttle;
        this.f58870e = obj;
        this.f58871f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    @Nullable
    /* renamed from: a */
    public MethodInfo m31142a(MethodDescriptor<?, ?> methodDescriptor) {
        MethodInfo methodInfo = this.f58867b.get(methodDescriptor.f58222b);
        if (methodInfo == null) {
            methodInfo = this.f58868c.get(methodDescriptor.f58223c);
        }
        return methodInfo == null ? this.f58866a : methodInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ManagedChannelServiceConfig.class != obj.getClass()) {
            return false;
        }
        ManagedChannelServiceConfig managedChannelServiceConfig = (ManagedChannelServiceConfig) obj;
        return Objects.m11173a(this.f58866a, managedChannelServiceConfig.f58866a) && Objects.m11173a(this.f58867b, managedChannelServiceConfig.f58867b) && Objects.m11173a(this.f58868c, managedChannelServiceConfig.f58868c) && Objects.m11173a(this.f58869d, managedChannelServiceConfig.f58869d) && Objects.m11173a(this.f58870e, managedChannelServiceConfig.f58870e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58866a, this.f58867b, this.f58868c, this.f58869d, this.f58870e});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("defaultMethodConfig", this.f58866a);
        m11166b.m11171e("serviceMethodMap", this.f58867b);
        m11166b.m11171e("serviceMap", this.f58868c);
        m11166b.m11171e("retryThrottling", this.f58869d);
        m11166b.m11171e("loadBalancingConfig", this.f58870e);
        return m11166b.toString();
    }
}
