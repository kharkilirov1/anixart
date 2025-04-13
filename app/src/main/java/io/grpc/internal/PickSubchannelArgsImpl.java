package io.grpc.internal;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class PickSubchannelArgsImpl extends LoadBalancer.PickSubchannelArgs {

    /* renamed from: a */
    public final CallOptions f58946a;

    /* renamed from: b */
    public final Metadata f58947b;

    /* renamed from: c */
    public final MethodDescriptor<?, ?> f58948c;

    public PickSubchannelArgsImpl(MethodDescriptor<?, ?> methodDescriptor, Metadata metadata, CallOptions callOptions) {
        Preconditions.m11187k(methodDescriptor, "method");
        this.f58948c = methodDescriptor;
        Preconditions.m11187k(metadata, "headers");
        this.f58947b = metadata;
        Preconditions.m11187k(callOptions, "callOptions");
        this.f58946a = callOptions;
    }

    @Override // io.grpc.LoadBalancer.PickSubchannelArgs
    /* renamed from: a */
    public CallOptions mo30886a() {
        return this.f58946a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PickSubchannelArgsImpl.class != obj.getClass()) {
            return false;
        }
        PickSubchannelArgsImpl pickSubchannelArgsImpl = (PickSubchannelArgsImpl) obj;
        return Objects.m11173a(this.f58946a, pickSubchannelArgsImpl.f58946a) && Objects.m11173a(this.f58947b, pickSubchannelArgsImpl.f58947b) && Objects.m11173a(this.f58948c, pickSubchannelArgsImpl.f58948c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58946a, this.f58947b, this.f58948c});
    }

    public final String toString() {
        StringBuilder m24u = C0000a.m24u("[method=");
        m24u.append(this.f58948c);
        m24u.append(" headers=");
        m24u.append(this.f58947b);
        m24u.append(" callOptions=");
        m24u.append(this.f58946a);
        m24u.append("]");
        return m24u.toString();
    }
}
