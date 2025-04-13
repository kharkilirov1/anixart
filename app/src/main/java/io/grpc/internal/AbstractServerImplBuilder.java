package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.ServerBuilder;

/* loaded from: classes3.dex */
public abstract class AbstractServerImplBuilder<T extends ServerBuilder<T>> extends ServerBuilder<T> {
    /* renamed from: a */
    public abstract ServerBuilder<?> mo30965a();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30965a());
        return m11166b.toString();
    }
}
