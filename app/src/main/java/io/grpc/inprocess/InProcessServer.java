package io.grpc.inprocess;

import com.google.common.base.MoreObjects;
import io.grpc.internal.InternalServer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
final class InProcessServer implements InternalServer {

    /* renamed from: a */
    public static final ConcurrentMap<String, InProcessServer> f58341a = new ConcurrentHashMap();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("listenAddress", null);
        return m11166b.toString();
    }
}
