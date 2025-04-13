package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.NameResolver;

/* loaded from: classes3.dex */
abstract class ForwardingNameResolver extends NameResolver {

    /* renamed from: a */
    public final NameResolver f58651a;

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", this.f58651a);
        return m11166b.toString();
    }
}
