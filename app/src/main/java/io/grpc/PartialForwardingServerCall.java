package io.grpc;

import com.google.common.base.MoreObjects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class PartialForwardingServerCall<ReqT, RespT> extends ServerCall<ReqT, RespT> {
    @Override // io.grpc.ServerCall
    /* renamed from: a */
    public void mo30861a(Status status, Metadata metadata) {
        mo30871l().mo30861a(status, metadata);
    }

    @Override // io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: b */
    public Attributes mo30862b() {
        return mo30871l().mo30862b();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: c */
    public String mo30863c() {
        return mo30871l().mo30863c();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: e */
    public boolean mo30864e() {
        return mo30871l().mo30864e();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: f */
    public boolean mo30933f() {
        return mo30871l().mo30933f();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: g */
    public void mo30865g(int i2) {
        mo30871l().mo30865g(i2);
    }

    @Override // io.grpc.ServerCall
    /* renamed from: h */
    public void mo30866h(Metadata metadata) {
        mo30871l().mo30866h(metadata);
    }

    @Override // io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: j */
    public void mo30868j(String str) {
        mo30871l().mo30868j(str);
    }

    @Override // io.grpc.ServerCall
    @ExperimentalApi
    /* renamed from: k */
    public void mo30869k(boolean z) {
        mo30871l().mo30869k(z);
    }

    /* renamed from: l */
    public abstract ServerCall<?, ?> mo30871l();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30871l());
        return m11166b.toString();
    }
}
