package io.grpc;

import com.google.common.base.MoreObjects;

/* loaded from: classes3.dex */
public final class ServiceDescriptor {

    public static final class Builder {
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("name", null);
        m11166b.m11171e("schemaDescriptor", null);
        m11166b.m11171e("methods", null);
        m11166b.f20530d = true;
        return m11166b.toString();
    }
}
