package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.ClientStreamTracer;
import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes3.dex */
public abstract class ForwardingClientStreamTracer extends ClientStreamTracer {
    @Override // io.grpc.StreamTracer
    /* renamed from: a */
    public void mo30950a(int i2) {
        m31088m().mo30950a(i2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: b */
    public void mo30951b(int i2, long j2, long j3) {
        m31088m().mo30951b(i2, j2, j3);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: c */
    public void mo30952c(long j2) {
        m31088m().mo30952c(j2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: d */
    public void mo30953d(long j2) {
        m31088m().mo30953d(j2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: e */
    public void mo30954e(int i2) {
        m31088m().mo30954e(i2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: f */
    public void mo30955f(int i2, long j2, long j3) {
        m31088m().mo30955f(i2, j2, j3);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: g */
    public void mo30956g(long j2) {
        m31088m().mo30956g(j2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: h */
    public void mo30957h(long j2) {
        m31088m().mo30957h(j2);
    }

    @Override // io.grpc.StreamTracer
    /* renamed from: i */
    public void mo30958i(Status status) {
        m31088m().mo30958i(status);
    }

    @Override // io.grpc.ClientStreamTracer
    /* renamed from: j */
    public void mo30820j() {
        m31088m().mo30820j();
    }

    @Override // io.grpc.ClientStreamTracer
    /* renamed from: k */
    public void mo30821k(Metadata metadata) {
        m31088m().mo30821k(metadata);
    }

    @Override // io.grpc.ClientStreamTracer
    /* renamed from: l */
    public void mo30822l() {
        m31088m().mo30822l();
    }

    /* renamed from: m */
    public abstract ClientStreamTracer m31088m();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", m31088m());
        return m11166b.toString();
    }
}
