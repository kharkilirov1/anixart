package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.InternalLogId;
import io.grpc.Status;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ManagedClientTransport;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
abstract class ForwardingConnectionClientTransport implements ConnectionClientTransport {
    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: a */
    public void mo30968a(Status status) {
        mo31039d().mo30968a(status);
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: b */
    public void mo30969b(Status status) {
        mo31039d().mo30969b(status);
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: c */
    public Runnable mo30970c(ManagedClientTransport.Listener listener) {
        return mo31039d().mo30970c(listener);
    }

    /* renamed from: d */
    public abstract ConnectionClientTransport mo31039d();

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return mo31039d().mo30881e();
    }

    @Override // io.grpc.internal.ClientTransport
    /* renamed from: f */
    public void mo30971f(ClientTransport.PingCallback pingCallback, Executor executor) {
        mo31039d().mo30971f(pingCallback, executor);
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo31039d());
        return m11166b.toString();
    }
}
