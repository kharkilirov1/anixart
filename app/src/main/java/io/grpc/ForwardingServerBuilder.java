package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ServerBuilder;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class ForwardingServerBuilder<T extends ServerBuilder<T>> extends ServerBuilder<T> {
    /* renamed from: a */
    public abstract ServerBuilder<?> m30860a();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", m30860a());
        return m11166b.toString();
    }
}
