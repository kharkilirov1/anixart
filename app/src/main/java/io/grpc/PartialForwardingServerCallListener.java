package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ServerCall;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class PartialForwardingServerCallListener<ReqT> extends ServerCall.Listener<ReqT> {
    @Override // io.grpc.ServerCall.Listener
    /* renamed from: a */
    public void mo30846a() {
        mo30872f().mo30846a();
    }

    @Override // io.grpc.ServerCall.Listener
    /* renamed from: b */
    public void mo30847b() {
        mo30872f().mo30847b();
    }

    @Override // io.grpc.ServerCall.Listener
    /* renamed from: c */
    public void mo30848c() {
        mo30872f().mo30848c();
    }

    @Override // io.grpc.ServerCall.Listener
    /* renamed from: e */
    public void mo30850e() {
        mo30872f().mo30850e();
    }

    /* renamed from: f */
    public abstract ServerCall.Listener<?> mo30872f();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30872f());
        return m11166b.toString();
    }
}
