package io.grpc.internal;

import com.google.common.base.Objects;
import io.grpc.Attributes;
import io.grpc.MethodDescriptor;
import io.grpc.ServerStreamTracer;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class ServerCallInfoImpl<ReqT, RespT> extends ServerStreamTracer.ServerCallInfo<ReqT, RespT> {

    /* renamed from: a */
    public final MethodDescriptor<ReqT, RespT> f59101a;

    /* renamed from: b */
    public final Attributes f59102b;

    /* renamed from: c */
    public final String f59103c;

    @Override // io.grpc.ServerStreamTracer.ServerCallInfo
    /* renamed from: a */
    public Attributes mo30937a() {
        return this.f59102b;
    }

    @Override // io.grpc.ServerStreamTracer.ServerCallInfo
    @Nullable
    /* renamed from: b */
    public String mo30938b() {
        return this.f59103c;
    }

    @Override // io.grpc.ServerStreamTracer.ServerCallInfo
    /* renamed from: c */
    public MethodDescriptor<ReqT, RespT> mo30939c() {
        return this.f59101a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ServerCallInfoImpl)) {
            return false;
        }
        ServerCallInfoImpl serverCallInfoImpl = (ServerCallInfoImpl) obj;
        return Objects.m11173a(this.f59101a, serverCallInfoImpl.f59101a) && Objects.m11173a(this.f59102b, serverCallInfoImpl.f59102b) && Objects.m11173a(this.f59103c, serverCallInfoImpl.f59103c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59101a, this.f59102b, this.f59103c});
    }
}
